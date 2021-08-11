
package com.commercetools.api.models.order_edit;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class StagedOrderSetLineItemTaxAmountActionBuilder
        implements Builder<StagedOrderSetLineItemTaxAmountAction> {

    private String lineItemId;

    @Nullable
    private com.commercetools.api.models.cart.ExternalTaxAmountDraft externalTaxAmount;

    public StagedOrderSetLineItemTaxAmountActionBuilder lineItemId(final String lineItemId) {
        this.lineItemId = lineItemId;
        return this;
    }

    public StagedOrderSetLineItemTaxAmountActionBuilder externalTaxAmount(
            Function<com.commercetools.api.models.cart.ExternalTaxAmountDraftBuilder, com.commercetools.api.models.cart.ExternalTaxAmountDraftBuilder> builder) {
        this.externalTaxAmount = builder.apply(com.commercetools.api.models.cart.ExternalTaxAmountDraftBuilder.of())
                .build();
        return this;
    }

    public StagedOrderSetLineItemTaxAmountActionBuilder externalTaxAmount(
            @Nullable final com.commercetools.api.models.cart.ExternalTaxAmountDraft externalTaxAmount) {
        this.externalTaxAmount = externalTaxAmount;
        return this;
    }

    public String getLineItemId() {
        return this.lineItemId;
    }

    @Nullable
    public com.commercetools.api.models.cart.ExternalTaxAmountDraft getExternalTaxAmount() {
        return this.externalTaxAmount;
    }

    public StagedOrderSetLineItemTaxAmountAction build() {
        Objects.requireNonNull(lineItemId, StagedOrderSetLineItemTaxAmountAction.class + ": lineItemId is missing");
        return new StagedOrderSetLineItemTaxAmountActionImpl(lineItemId, externalTaxAmount);
    }

    /**
     * builds StagedOrderSetLineItemTaxAmountAction without checking for non null required values
     */
    public StagedOrderSetLineItemTaxAmountAction buildUnchecked() {
        return new StagedOrderSetLineItemTaxAmountActionImpl(lineItemId, externalTaxAmount);
    }

    public static StagedOrderSetLineItemTaxAmountActionBuilder of() {
        return new StagedOrderSetLineItemTaxAmountActionBuilder();
    }

    public static StagedOrderSetLineItemTaxAmountActionBuilder of(
            final StagedOrderSetLineItemTaxAmountAction template) {
        StagedOrderSetLineItemTaxAmountActionBuilder builder = new StagedOrderSetLineItemTaxAmountActionBuilder();
        builder.lineItemId = template.getLineItemId();
        builder.externalTaxAmount = template.getExternalTaxAmount();
        return builder;
    }

}
