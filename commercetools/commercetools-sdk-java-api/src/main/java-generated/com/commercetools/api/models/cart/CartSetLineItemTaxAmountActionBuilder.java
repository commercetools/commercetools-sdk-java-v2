
package com.commercetools.api.models.cart;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class CartSetLineItemTaxAmountActionBuilder {

    private String lineItemId;

    @Nullable
    private com.commercetools.api.models.cart.ExternalTaxAmountDraft externalTaxAmount;

    public CartSetLineItemTaxAmountActionBuilder lineItemId(final String lineItemId) {
        this.lineItemId = lineItemId;
        return this;
    }

    public CartSetLineItemTaxAmountActionBuilder externalTaxAmount(
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

    public CartSetLineItemTaxAmountAction build() {
        return new CartSetLineItemTaxAmountActionImpl(lineItemId, externalTaxAmount);
    }

    public static CartSetLineItemTaxAmountActionBuilder of() {
        return new CartSetLineItemTaxAmountActionBuilder();
    }

    public static CartSetLineItemTaxAmountActionBuilder of(final CartSetLineItemTaxAmountAction template) {
        CartSetLineItemTaxAmountActionBuilder builder = new CartSetLineItemTaxAmountActionBuilder();
        builder.lineItemId = template.getLineItemId();
        builder.externalTaxAmount = template.getExternalTaxAmount();
        return builder;
    }

}
