
package com.commercetools.api.models.order_edit;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * StagedOrderChangePriceRoundingModeActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     StagedOrderChangePriceRoundingModeAction stagedOrderChangePriceRoundingModeAction = StagedOrderChangePriceRoundingModeAction.builder()
 *             .priceRoundingMode(RoundingMode.HALF_EVEN)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class StagedOrderChangePriceRoundingModeActionBuilder
        implements Builder<StagedOrderChangePriceRoundingModeAction> {

    private com.commercetools.api.models.cart.RoundingMode priceRoundingMode;

    /**
     *  <p>New value to set.</p>
     * @param priceRoundingMode value to be set
     * @return Builder
     */

    public StagedOrderChangePriceRoundingModeActionBuilder priceRoundingMode(
            final com.commercetools.api.models.cart.RoundingMode priceRoundingMode) {
        this.priceRoundingMode = priceRoundingMode;
        return this;
    }

    /**
     *  <p>New value to set.</p>
     * @return priceRoundingMode
     */

    public com.commercetools.api.models.cart.RoundingMode getPriceRoundingMode() {
        return this.priceRoundingMode;
    }

    /**
     * builds StagedOrderChangePriceRoundingModeAction with checking for non-null required values
     * @return StagedOrderChangePriceRoundingModeAction
     */
    public StagedOrderChangePriceRoundingModeAction build() {
        Objects.requireNonNull(priceRoundingMode,
            StagedOrderChangePriceRoundingModeAction.class + ": priceRoundingMode is missing");
        return new StagedOrderChangePriceRoundingModeActionImpl(priceRoundingMode);
    }

    /**
     * builds StagedOrderChangePriceRoundingModeAction without checking for non-null required values
     * @return StagedOrderChangePriceRoundingModeAction
     */
    public StagedOrderChangePriceRoundingModeAction buildUnchecked() {
        return new StagedOrderChangePriceRoundingModeActionImpl(priceRoundingMode);
    }

    /**
     * factory method for an instance of StagedOrderChangePriceRoundingModeActionBuilder
     * @return builder
     */
    public static StagedOrderChangePriceRoundingModeActionBuilder of() {
        return new StagedOrderChangePriceRoundingModeActionBuilder();
    }

    /**
     * create builder for StagedOrderChangePriceRoundingModeAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static StagedOrderChangePriceRoundingModeActionBuilder of(
            final StagedOrderChangePriceRoundingModeAction template) {
        StagedOrderChangePriceRoundingModeActionBuilder builder = new StagedOrderChangePriceRoundingModeActionBuilder();
        builder.priceRoundingMode = template.getPriceRoundingMode();
        return builder;
    }

}
