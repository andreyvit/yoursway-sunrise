package com.yoursway.sunrise.completion;

import org.eclipse.jface.text.contentassist.ICompletionProposal;

import com.yoursway.completion.CompletionProposal;
import com.yoursway.completion.CompletionProposalVisitor;

public class JFaceCompletionProposalAdapter implements CompletionProposal {

    private final ICompletionProposal proposal;

    public JFaceCompletionProposalAdapter(ICompletionProposal proposal) {
        if (proposal == null)
            throw new NullPointerException("propposal is null");
        this.proposal = proposal;
    }

    public void acceptVisitor(CompletionProposalVisitor visitor) {
    }

    public String completetion() {
        return proposal.getDisplayString();
    }
    
}
