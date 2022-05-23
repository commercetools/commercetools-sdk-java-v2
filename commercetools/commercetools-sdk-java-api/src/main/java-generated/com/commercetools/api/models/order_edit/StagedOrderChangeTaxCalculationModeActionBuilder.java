
package com.commercetools.api.models.order_edit;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 Example to create an instance using the builder pattern
 <div class=code-example>
 <pre><code class='java'>
   StagedOrderChangeTaxCalculationModeAction stagedOrderChangeTaxCalculationModeAction = StagedOrderChangeTaxCalculationModeAction.builder()
           .taxCalculationMode(TaxCalculationMode.LINE_ITEM_LEVEL)
           .build()
 </code></pre>
 </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class StagedOrderChangeTaxCalculationModeActionBuilder
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
