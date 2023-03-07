
package com.commercetools.api.models.order_edit;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * StagedOrderChangeTaxRoundingModeActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     StagedOrderChangeTaxRoundingModeAction stagedOrderChangeTaxRoundingModeAction = StagedOrderChangeTaxRoundingModeAction.builder()
 *             .taxRoundingMode(RoundingMode.HALF_EVEN)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class StagedOrderChangeTaxRoundingModeActionBuilder implements Builder<StagedOrderChangeTaxRoundingModeAction> {

    private com.commercetools.api.models.cart.RoundingMode taxRoundingMode;

    /**
     *  <p>Determines how monetary values are rounded.</p>
     */

    public StagedOrderChangeTaxRoundingModeActionBuilder taxRoundingMode(
            final com.commercetools.api.models.cart.RoundingMode taxRoundingMode) {
        this.taxRoundingMode = taxRoundingMode;
        return this;
    }

    public com.commercetools.api.models.cart.RoundingMode getTaxRoundingMode() {
        return this.taxRoundingMode;
    }

    public StagedOrderChangeTaxRoundingModeAction build() {
        Objects.requireNonNull(taxRoundingMode,
            StagedOrderChangeTaxRoundingModeAction.class + ": taxRoundingMode is missing");
        return new StagedOrderChangeTaxRoundingModeActionImpl(taxRoundingMode);
    }

    /**
     * builds StagedOrderChangeTaxRoundingModeAction without checking for non null required values
     */
    public StagedOrderChangeTaxRoundingModeAction buildUnchecked() {
        return new StagedOrderChangeTaxRoundingModeActionImpl(taxRoundingMode);
    }

    public static StagedOrderChangeTaxRoundingModeActionBuilder of() {
        return new StagedOrderChangeTaxRoundingModeActionBuilder();
    }

    public static StagedOrderChangeTaxRoundingModeActionBuilder of(
            final StagedOrderChangeTaxRoundingModeAction template) {
        StagedOrderChangeTaxRoundingModeActionBuilder builder = new StagedOrderChangeTaxRoundingModeActionBuilder();
        builder.taxRoundingMode = template.getTaxRoundingMode();
        return builder;
    }

}
