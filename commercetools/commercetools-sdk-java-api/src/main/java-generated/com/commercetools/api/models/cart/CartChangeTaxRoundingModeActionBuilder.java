
package com.commercetools.api.models.cart;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class CartChangeTaxRoundingModeActionBuilder implements Builder<CartChangeTaxRoundingModeAction> {

    private com.commercetools.api.models.cart.RoundingMode taxRoundingMode;

    public CartChangeTaxRoundingModeActionBuilder taxRoundingMode(
            final com.commercetools.api.models.cart.RoundingMode taxRoundingMode) {
        this.taxRoundingMode = taxRoundingMode;
        return this;
    }

    public com.commercetools.api.models.cart.RoundingMode getTaxRoundingMode() {
        return this.taxRoundingMode;
    }

    public CartChangeTaxRoundingModeAction build() {
        Objects.requireNonNull(taxRoundingMode, CartChangeTaxRoundingModeAction.class + ": taxRoundingMode is missing");
        return new CartChangeTaxRoundingModeActionImpl(taxRoundingMode);
    }

    /**
     * builds CartChangeTaxRoundingModeAction without checking for non null required values
     */
    public CartChangeTaxRoundingModeAction buildUnchecked() {
        return new CartChangeTaxRoundingModeActionImpl(taxRoundingMode);
    }

    public static CartChangeTaxRoundingModeActionBuilder of() {
        return new CartChangeTaxRoundingModeActionBuilder();
    }

    public static CartChangeTaxRoundingModeActionBuilder of(final CartChangeTaxRoundingModeAction template) {
        CartChangeTaxRoundingModeActionBuilder builder = new CartChangeTaxRoundingModeActionBuilder();
        builder.taxRoundingMode = template.getTaxRoundingMode();
        return builder;
    }

}
