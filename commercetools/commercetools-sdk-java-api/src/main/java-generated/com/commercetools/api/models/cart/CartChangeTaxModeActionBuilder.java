
package com.commercetools.api.models.cart;

import java.time.ZonedDateTime;
import java.util.*;

import javax.annotation.Nullable;

import com.commercetools.api.models.cart.CartChangeTaxModeAction;
import com.commercetools.api.models.cart.CartUpdateAction;
import com.commercetools.api.models.cart.TaxMode;

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
