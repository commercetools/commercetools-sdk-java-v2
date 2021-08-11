
package com.commercetools.api.models.cart;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class CartSetCustomLineItemTaxAmountActionBuilder
        implements Builder<CartSetCustomLineItemTaxAmountAction> {

    private String customLineItemId;

    @Nullable
    private com.commercetools.api.models.cart.ExternalTaxAmountDraft externalTaxAmount;

    public CartSetCustomLineItemTaxAmountActionBuilder customLineItemId(final String customLineItemId) {
        this.customLineItemId = customLineItemId;
        return this;
    }

    public CartSetCustomLineItemTaxAmountActionBuilder externalTaxAmount(
            Function<com.commercetools.api.models.cart.ExternalTaxAmountDraftBuilder, com.commercetools.api.models.cart.ExternalTaxAmountDraftBuilder> builder) {
        this.externalTaxAmount = builder.apply(com.commercetools.api.models.cart.ExternalTaxAmountDraftBuilder.of())
                .build();
        return this;
    }

    public CartSetCustomLineItemTaxAmountActionBuilder externalTaxAmount(
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

    public CartSetCustomLineItemTaxAmountAction build() {
        Objects.requireNonNull(customLineItemId,
            CartSetCustomLineItemTaxAmountAction.class + ": customLineItemId is missing");
        return new CartSetCustomLineItemTaxAmountActionImpl(customLineItemId, externalTaxAmount);
    }

    /**
     * builds CartSetCustomLineItemTaxAmountAction without checking for non null required values
     */
    public CartSetCustomLineItemTaxAmountAction buildUnchecked() {
        return new CartSetCustomLineItemTaxAmountActionImpl(customLineItemId, externalTaxAmount);
    }

    public static CartSetCustomLineItemTaxAmountActionBuilder of() {
        return new CartSetCustomLineItemTaxAmountActionBuilder();
    }

    public static CartSetCustomLineItemTaxAmountActionBuilder of(final CartSetCustomLineItemTaxAmountAction template) {
        CartSetCustomLineItemTaxAmountActionBuilder builder = new CartSetCustomLineItemTaxAmountActionBuilder();
        builder.customLineItemId = template.getCustomLineItemId();
        builder.externalTaxAmount = template.getExternalTaxAmount();
        return builder;
    }

}
