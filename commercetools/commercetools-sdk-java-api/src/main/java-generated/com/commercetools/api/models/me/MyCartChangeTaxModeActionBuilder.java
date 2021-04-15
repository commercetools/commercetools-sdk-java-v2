
package com.commercetools.api.models.me;

import java.util.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class MyCartChangeTaxModeActionBuilder {

    private com.commercetools.api.models.cart.TaxMode taxMode;

    public MyCartChangeTaxModeActionBuilder taxMode(final com.commercetools.api.models.cart.TaxMode taxMode) {
        this.taxMode = taxMode;
        return this;
    }

    public com.commercetools.api.models.cart.TaxMode getTaxMode() {
        return this.taxMode;
    }

    public MyCartChangeTaxModeAction build() {
        return new MyCartChangeTaxModeActionImpl(taxMode);
    }

    public static MyCartChangeTaxModeActionBuilder of() {
        return new MyCartChangeTaxModeActionBuilder();
    }

    public static MyCartChangeTaxModeActionBuilder of(final MyCartChangeTaxModeAction template) {
        MyCartChangeTaxModeActionBuilder builder = new MyCartChangeTaxModeActionBuilder();
        builder.taxMode = template.getTaxMode();
        return builder;
    }

}
