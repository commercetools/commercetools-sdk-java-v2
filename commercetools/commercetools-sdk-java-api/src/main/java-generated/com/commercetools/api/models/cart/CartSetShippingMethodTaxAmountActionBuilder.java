
package com.commercetools.api.models.cart;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class CartSetShippingMethodTaxAmountActionBuilder {

    @Nullable
    private com.commercetools.api.models.cart.ExternalTaxAmountDraft externalTaxAmount;

    public CartSetShippingMethodTaxAmountActionBuilder externalTaxAmount(
            @Nullable final com.commercetools.api.models.cart.ExternalTaxAmountDraft externalTaxAmount) {
        this.externalTaxAmount = externalTaxAmount;
        return this;
    }

    @Nullable
    public com.commercetools.api.models.cart.ExternalTaxAmountDraft getExternalTaxAmount() {
        return this.externalTaxAmount;
    }

    public CartSetShippingMethodTaxAmountAction build() {
        return new CartSetShippingMethodTaxAmountActionImpl(externalTaxAmount);
    }

    public static CartSetShippingMethodTaxAmountActionBuilder of() {
        return new CartSetShippingMethodTaxAmountActionBuilder();
    }

    public static CartSetShippingMethodTaxAmountActionBuilder of(final CartSetShippingMethodTaxAmountAction template) {
        CartSetShippingMethodTaxAmountActionBuilder builder = new CartSetShippingMethodTaxAmountActionBuilder();
        builder.externalTaxAmount = template.getExternalTaxAmount();
        return builder;
    }

}
