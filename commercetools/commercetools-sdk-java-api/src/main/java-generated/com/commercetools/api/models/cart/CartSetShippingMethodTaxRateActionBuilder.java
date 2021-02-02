
package com.commercetools.api.models.cart;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class CartSetShippingMethodTaxRateActionBuilder {

    @Nullable
    private com.commercetools.api.models.cart.ExternalTaxRateDraft externalTaxRate;

    public CartSetShippingMethodTaxRateActionBuilder externalTaxRate(
            @Nullable final com.commercetools.api.models.cart.ExternalTaxRateDraft externalTaxRate) {
        this.externalTaxRate = externalTaxRate;
        return this;
    }

    @Nullable
    public com.commercetools.api.models.cart.ExternalTaxRateDraft getExternalTaxRate() {
        return this.externalTaxRate;
    }

    public CartSetShippingMethodTaxRateAction build() {
        return new CartSetShippingMethodTaxRateActionImpl(externalTaxRate);
    }

    public static CartSetShippingMethodTaxRateActionBuilder of() {
        return new CartSetShippingMethodTaxRateActionBuilder();
    }

    public static CartSetShippingMethodTaxRateActionBuilder of(final CartSetShippingMethodTaxRateAction template) {
        CartSetShippingMethodTaxRateActionBuilder builder = new CartSetShippingMethodTaxRateActionBuilder();
        builder.externalTaxRate = template.getExternalTaxRate();
        return builder;
    }

}
