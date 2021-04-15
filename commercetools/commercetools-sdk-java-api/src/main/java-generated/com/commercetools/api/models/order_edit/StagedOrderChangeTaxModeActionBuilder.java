
package com.commercetools.api.models.order_edit;

import java.util.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class StagedOrderChangeTaxModeActionBuilder {

    private com.commercetools.api.models.cart.TaxMode taxMode;

    public StagedOrderChangeTaxModeActionBuilder taxMode(final com.commercetools.api.models.cart.TaxMode taxMode) {
        this.taxMode = taxMode;
        return this;
    }

    public com.commercetools.api.models.cart.TaxMode getTaxMode() {
        return this.taxMode;
    }

    public StagedOrderChangeTaxModeAction build() {
        return new StagedOrderChangeTaxModeActionImpl(taxMode);
    }

    public static StagedOrderChangeTaxModeActionBuilder of() {
        return new StagedOrderChangeTaxModeActionBuilder();
    }

    public static StagedOrderChangeTaxModeActionBuilder of(final StagedOrderChangeTaxModeAction template) {
        StagedOrderChangeTaxModeActionBuilder builder = new StagedOrderChangeTaxModeActionBuilder();
        builder.taxMode = template.getTaxMode();
        return builder;
    }

}
