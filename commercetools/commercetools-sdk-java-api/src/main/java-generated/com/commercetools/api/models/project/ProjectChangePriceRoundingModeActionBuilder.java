
package com.commercetools.api.models.project;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ProjectChangePriceRoundingModeActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProjectChangePriceRoundingModeAction projectChangePriceRoundingModeAction = ProjectChangePriceRoundingModeAction.builder()
 *             .priceRoundingMode(RoundingMode.HALF_EVEN)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ProjectChangePriceRoundingModeActionBuilder implements Builder<ProjectChangePriceRoundingModeAction> {

    private com.commercetools.api.models.cart.RoundingMode priceRoundingMode;

    /**
     *  <p>Project-level default rounding mode for calculating the total prices on LineItems and CustomLineItems. See CartsConfiguration.</p>
     * @param priceRoundingMode value to be set
     * @return Builder
     */

    public ProjectChangePriceRoundingModeActionBuilder priceRoundingMode(
            final com.commercetools.api.models.cart.RoundingMode priceRoundingMode) {
        this.priceRoundingMode = priceRoundingMode;
        return this;
    }

    /**
     *  <p>Project-level default rounding mode for calculating the total prices on LineItems and CustomLineItems. See CartsConfiguration.</p>
     * @return priceRoundingMode
     */

    public com.commercetools.api.models.cart.RoundingMode getPriceRoundingMode() {
        return this.priceRoundingMode;
    }

    /**
     * builds ProjectChangePriceRoundingModeAction with checking for non-null required values
     * @return ProjectChangePriceRoundingModeAction
     */
    public ProjectChangePriceRoundingModeAction build() {
        Objects.requireNonNull(priceRoundingMode,
            ProjectChangePriceRoundingModeAction.class + ": priceRoundingMode is missing");
        return new ProjectChangePriceRoundingModeActionImpl(priceRoundingMode);
    }

    /**
     * builds ProjectChangePriceRoundingModeAction without checking for non-null required values
     * @return ProjectChangePriceRoundingModeAction
     */
    public ProjectChangePriceRoundingModeAction buildUnchecked() {
        return new ProjectChangePriceRoundingModeActionImpl(priceRoundingMode);
    }

    /**
     * factory method for an instance of ProjectChangePriceRoundingModeActionBuilder
     * @return builder
     */
    public static ProjectChangePriceRoundingModeActionBuilder of() {
        return new ProjectChangePriceRoundingModeActionBuilder();
    }

    /**
     * create builder for ProjectChangePriceRoundingModeAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ProjectChangePriceRoundingModeActionBuilder of(final ProjectChangePriceRoundingModeAction template) {
        ProjectChangePriceRoundingModeActionBuilder builder = new ProjectChangePriceRoundingModeActionBuilder();
        builder.priceRoundingMode = template.getPriceRoundingMode();
        return builder;
    }

}
