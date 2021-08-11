
package com.commercetools.api.models.order_edit;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class StagedOrderSetCustomLineItemTaxAmountActionBuilder
        implements Builder<StagedOrderSetCustomLineItemTaxAmountAction> {

    private String customLineItemId;

    @Nullable
    private com.commercetools.api.models.cart.ExternalTaxAmountDraft externalTaxAmount;

    public StagedOrderSetCustomLineItemTaxAmountActionBuilder customLineItemId(final String customLineItemId) {
        this.customLineItemId = customLineItemId;
        return this;
    }

    public StagedOrderSetCustomLineItemTaxAmountActionBuilder externalTaxAmount(
            Function<com.commercetools.api.models.cart.ExternalTaxAmountDraftBuilder, com.commercetools.api.models.cart.ExternalTaxAmountDraftBuilder> builder) {
        this.externalTaxAmount = builder.apply(com.commercetools.api.models.cart.ExternalTaxAmountDraftBuilder.of())
                .build();
        return this;
    }

    public StagedOrderSetCustomLineItemTaxAmountActionBuilder externalTaxAmount(
            @Nullable final com.commercetools.api.models.cart.ExternalTaxAmountDraft externalTaxAmount) {
        this.externalTaxAmount = externalTaxAmount;
        return this;
    }

    public String getCustomLineItemId() {
        return this.customLineItemId;
    }

    @Nullable
    public com.commercetools.api.models.cart.ExternalTaxAmountDraft getExternalTaxAmount() {
        return this.externalTaxAmount;
    }

    public StagedOrderSetCustomLineItemTaxAmountAction build() {
        Objects.requireNonNull(customLineItemId,
            StagedOrderSetCustomLineItemTaxAmountAction.class + ": customLineItemId is missing");
        return new StagedOrderSetCustomLineItemTaxAmountActionImpl(customLineItemId, externalTaxAmount);
    }

    /**
     * builds StagedOrderSetCustomLineItemTaxAmountAction without checking for non null required values
     */
    public StagedOrderSetCustomLineItemTaxAmountAction buildUnchecked() {
        return new StagedOrderSetCustomLineItemTaxAmountActionImpl(customLineItemId, externalTaxAmount);
    }

    public static StagedOrderSetCustomLineItemTaxAmountActionBuilder of() {
        return new StagedOrderSetCustomLineItemTaxAmountActionBuilder();
    }

    public static StagedOrderSetCustomLineItemTaxAmountActionBuilder of(
            final StagedOrderSetCustomLineItemTaxAmountAction template) {
        StagedOrderSetCustomLineItemTaxAmountActionBuilder builder = new StagedOrderSetCustomLineItemTaxAmountActionBuilder();
        builder.customLineItemId = template.getCustomLineItemId();
        builder.externalTaxAmount = template.getExternalTaxAmount();
        return builder;
    }

}
