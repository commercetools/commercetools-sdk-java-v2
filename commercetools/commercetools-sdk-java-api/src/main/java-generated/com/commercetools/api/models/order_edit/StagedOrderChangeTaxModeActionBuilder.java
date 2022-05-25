
package com.commercetools.api.models.order_edit;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * StagedOrderChangeTaxModeActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     StagedOrderChangeTaxModeAction stagedOrderChangeTaxModeAction = StagedOrderChangeTaxModeAction.builder()
 *             .taxMode(TaxMode.PLATFORM)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class StagedOrderChangeTaxModeActionBuilder implements Builder<StagedOrderChangeTaxModeAction> {

    private com.commercetools.api.models.cart.TaxMode taxMode;

    /**
     *
     */

    public StagedOrderChangeTaxModeActionBuilder taxMode(final com.commercetools.api.models.cart.TaxMode taxMode) {
        this.taxMode = taxMode;
        return this;
    }

    public com.commercetools.api.models.cart.TaxMode getTaxMode() {
        return this.taxMode;
    }

    public StagedOrderChangeTaxModeAction build() {
        Objects.requireNonNull(taxMode, StagedOrderChangeTaxModeAction.class + ": taxMode is missing");
        return new StagedOrderChangeTaxModeActionImpl(taxMode);
    }

    /**
     * builds StagedOrderChangeTaxModeAction without checking for non null required values
     */
    public StagedOrderChangeTaxModeAction buildUnchecked() {
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
