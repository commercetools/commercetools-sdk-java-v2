
package com.commercetools.api.models.payment;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class PaymentChangeTransactionInteractionIdActionBuilder
        implements Builder<PaymentChangeTransactionInteractionIdAction> {

    private String transactionId;

    private String interactionId;

    public PaymentChangeTransactionInteractionIdActionBuilder transactionId(final String transactionId) {
        this.transactionId = transactionId;
        return this;
    }

    public PaymentChangeTransactionInteractionIdActionBuilder interactionId(final String interactionId) {
        this.interactionId = interactionId;
        return this;
    }

    public String getTransactionId() {
        return this.transactionId;
    }

    public String getInteractionId() {
        return this.interactionId;
    }

    public PaymentChangeTransactionInteractionIdAction build() {
        Objects.requireNonNull(transactionId,
            PaymentChangeTransactionInteractionIdAction.class + ": transactionId is missing");
        Objects.requireNonNull(interactionId,
            PaymentChangeTransactionInteractionIdAction.class + ": interactionId is missing");
        return new PaymentChangeTransactionInteractionIdActionImpl(transactionId, interactionId);
    }

    /**
     * builds PaymentChangeTransactionInteractionIdAction without checking for non null required values
     */
    public PaymentChangeTransactionInteractionIdAction buildUnchecked() {
        return new PaymentChangeTransactionInteractionIdActionImpl(transactionId, interactionId);
    }

    public static PaymentChangeTransactionInteractionIdActionBuilder of() {
        return new PaymentChangeTransactionInteractionIdActionBuilder();
    }

    public static PaymentChangeTransactionInteractionIdActionBuilder of(
            final PaymentChangeTransactionInteractionIdAction template) {
        PaymentChangeTransactionInteractionIdActionBuilder builder = new PaymentChangeTransactionInteractionIdActionBuilder();
        builder.transactionId = template.getTransactionId();
        builder.interactionId = template.getInteractionId();
        return builder;
    }

}
