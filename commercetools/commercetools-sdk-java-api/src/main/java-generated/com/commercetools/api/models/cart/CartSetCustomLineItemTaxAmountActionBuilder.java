
package com.commercetools.api.models.cart;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class CartSetCustomLineItemTaxAmountActionBuilder {

    private String customLineItemId;

    @Nullable
    private com.commercetools.api.models.cart.ExternalTaxAmountDraft externalTaxAmount;

    public CartSetCustomLineItemTaxAmountActionBuilder customLineItemId(final String customLineItemId) {
        this.customLineItemId = customLineItemId;
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
