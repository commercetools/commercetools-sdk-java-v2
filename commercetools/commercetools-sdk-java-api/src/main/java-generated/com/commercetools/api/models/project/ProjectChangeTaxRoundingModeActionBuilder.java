
package com.commercetools.api.models.project;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ProjectChangeTaxRoundingModeActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProjectChangeTaxRoundingModeAction projectChangeTaxRoundingModeAction = ProjectChangeTaxRoundingModeAction.builder()
 *             .taxRoundingMode(RoundingMode.HALF_EVEN)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ProjectChangeTaxRoundingModeActionBuilder implements Builder<ProjectChangeTaxRoundingModeAction> {

    private com.commercetools.api.models.cart.RoundingMode taxRoundingMode;

    /**
     *  <p>Project-level default rounding mode for tax calculation. See <a href="https://docs.commercetools.com/apis/ctp:api:type:CartsConfiguration" rel="nofollow">CartsConfiguration</a>.</p>
     * @param taxRoundingMode value to be set
     * @return Builder
     */

    public ProjectChangeTaxRoundingModeActionBuilder taxRoundingMode(
            final com.commercetools.api.models.cart.RoundingMode taxRoundingMode) {
        this.taxRoundingMode = taxRoundingMode;
        return this;
    }

    /**
     *  <p>Project-level default rounding mode for tax calculation. See <a href="https://docs.commercetools.com/apis/ctp:api:type:CartsConfiguration" rel="nofollow">CartsConfiguration</a>.</p>
     * @return taxRoundingMode
     */

    public com.commercetools.api.models.cart.RoundingMode getTaxRoundingMode() {
        return this.taxRoundingMode;
    }

    /**
     * builds ProjectChangeTaxRoundingModeAction with checking for non-null required values
     * @return ProjectChangeTaxRoundingModeAction
     */
    public ProjectChangeTaxRoundingModeAction build() {
        Objects.requireNonNull(taxRoundingMode,
            ProjectChangeTaxRoundingModeAction.class + ": taxRoundingMode is missing");
        return new ProjectChangeTaxRoundingModeActionImpl(taxRoundingMode);
    }

    /**
     * builds ProjectChangeTaxRoundingModeAction without checking for non-null required values
     * @return ProjectChangeTaxRoundingModeAction
     */
    public ProjectChangeTaxRoundingModeAction buildUnchecked() {
        return new ProjectChangeTaxRoundingModeActionImpl(taxRoundingMode);
    }

    /**
     * factory method for an instance of ProjectChangeTaxRoundingModeActionBuilder
     * @return builder
     */
    public static ProjectChangeTaxRoundingModeActionBuilder of() {
        return new ProjectChangeTaxRoundingModeActionBuilder();
    }

    /**
     * create builder for ProjectChangeTaxRoundingModeAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ProjectChangeTaxRoundingModeActionBuilder of(final ProjectChangeTaxRoundingModeAction template) {
        ProjectChangeTaxRoundingModeActionBuilder builder = new ProjectChangeTaxRoundingModeActionBuilder();
        builder.taxRoundingMode = template.getTaxRoundingMode();
        return builder;
    }

}
