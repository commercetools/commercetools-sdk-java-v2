
package com.commercetools.api.models.cart;

import java.util.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class CartChangeTaxModeActionBuilder {

    private com.commercetools.api.models.cart.TaxMode taxMode;

    public CartChangeTaxModeActionBuilder taxMode(final com.commercetools.api.models.cart.TaxMode taxMode) {
        this.taxMode = taxMode;
        return this;
    }

    public com.commercetools.api.models.cart.TaxMode getTaxMode() {
        return this.taxMode;
    }

    public CartChangeTaxModeAction build() {
        return new CartChangeTaxModeActionImpl(taxMode);
    }

    public static CartChangeTaxModeActionBuilder of() {
        return new CartChangeTaxModeActionBuilder();
    }

    public static CartChangeTaxModeActionBuilder of(final CartChangeTaxModeAction template) {
        CartChangeTaxModeActionBuilder builder = new CartChangeTaxModeActionBuilder();
        builder.taxMode = template.getTaxMode();
        return builder;
    }

}
