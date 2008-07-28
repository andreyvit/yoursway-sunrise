package com.yoursway.sunrise.completion;

import static com.google.common.collect.Lists.newArrayList;
import static com.google.common.collect.Lists.newArrayListWithCapacity;
import static java.lang.String.format;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.eclipse.jface.text.BadLocationException;
import org.eclipse.jface.text.IDocument;
import org.eclipse.jface.text.ITextViewer;
import org.eclipse.jface.text.TextUtilities;
import org.eclipse.jface.text.contentassist.ICompletionProposal;
import org.eclipse.jface.text.contentassist.IContentAssistProcessor;
import org.eclipse.jface.text.contentassist.IContentAssistant;
import org.eclipse.swt.custom.StyledText;
import org.eclipse.swt.graphics.Point;

import com.yoursway.completion.CompletionProposalUpdatesListener;
import com.yoursway.completion.CompletionProposalsProvider;
import com.yoursway.completion.gui.CompletionController;

public class SunriseContentAssistant implements IContentAssistant {
    
    private final Map<String, IContentAssistProcessor> processors;
    
    private StyledText widget;

    private ITextViewer viewer;

    private final String documentPartitioning;

    public SunriseContentAssistant(Map<String, IContentAssistProcessor> processors, 
            String documentPartitioning) {
        if (processors == null)
            throw new NullPointerException("processors is null");
        if (documentPartitioning == null)
            throw new NullPointerException("documentPartitioning is null");
        this.processors = processors;
        this.documentPartitioning = documentPartitioning;
    }

    public IContentAssistProcessor getContentAssistProcessor(String contentType) {
        return processors.get(contentType);
    }

    public String showContextInformation() {
        return "(not implemented)";
    }

    public String showPossibleCompletions() {
        return "(not implemented)";
    }
    
    public void install(ITextViewer textViewer) {
        this.viewer = textViewer;
        widget = textViewer.getTextWidget();
        new CompletionController(widget, new CompletionProposalsProvider() {

            public void startCompletionFor(CompletionProposalUpdatesListener listener, String text,
                    int cursorIndex) {
                Point range = viewer.getSelectedRange();
                int triggerOffset = range.x;
                IDocument document= viewer.getDocument();
                try {
                    String type= TextUtilities.getContentType(document, documentPartitioning, triggerOffset, true);
                    IContentAssistProcessor processor = processors.get(type);
                    if (processor != null) {
                        ICompletionProposal[] proposals = processor.computeCompletionProposals(viewer, triggerOffset);
                        System.out.println(format("Proposals (%d):", proposals.length));
                        List<JFaceCompletionProposalAdapter> adapted = newArrayListWithCapacity(proposals.length);
                        for (ICompletionProposal proposal : proposals) {
                            String displayString = proposal.getDisplayString();
                            System.out.println("  " + displayString);
                            adapted.add(new JFaceCompletionProposalAdapter(proposal));
                        }
                        listener.setProposals(adapted);
                    }
                } catch (BadLocationException e) {
                    e.printStackTrace();
                }
            }

            public void stopCompletion() {
            }
            
        });
    }

    public void uninstall() {
    }
    
}
