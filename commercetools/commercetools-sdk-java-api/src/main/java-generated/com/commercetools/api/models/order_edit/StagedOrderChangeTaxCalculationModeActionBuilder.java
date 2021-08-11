
package com.commercetools.api.models.order_edit;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class StagedOrderChangeTaxCalculationModeActionBuilder
        implements Builder<StagedOrderChangeTaxCalculationModeAction> {

    private com.commercetools.api.models.cart.TaxCalculationMode taxCalculationMode;

    public StagedOrderChangeTaxCalculationModeActionBuilder taxCalculationMode(
            final com.commercetools.api.models.cart.TaxCalculationMode taxCalculationMode) {
        this.taxCalculationMode = taxCalculationMode;
        return this;
    }

    public com.commercetools.api.models.cart.TaxCalculationMode getTaxCalculationMode() {
        return this.taxCalculationMode;
    }

    public StagedOrderChangeTaxCalculationModeAction build() {
        Objects.requireNonNull(taxCalculationMode,
            StagedOrderChangeTaxCalculationModeAction.class + ": taxCalculationMode is missing");
        return new StagedOrderChangeTaxCalculationModeActionImpl(taxCalculationMode);
    }

    /**
     * builds StagedOrderChangeTaxCalculationModeAction without checking for non null required values
     */
    public StagedOrderChangeTaxCalculationModeAction buildUnchecked() {
        return new StagedOrderChangeTaxCalculationModeActionImpl(taxCalculationMode);
    }

    public static StagedOrderChangeTaxCalculationModeActionBuilder of() {
        return new StagedOrderChangeTaxCalculationModeActionBuilder();
    }

    public static StagedOrderChangeTaxCalculationModeActionBuilder of(
            final StagedOrderChangeTaxCalculationModeAction template) {
        StagedOrderChangeTaxCalculationModeActionBuilder builder = new StagedOrderChangeTaxCalculationModeActionBuilder();
        builder.taxCalculationMode = template.getTaxCalculationMode();
        return builder;
    }

}
