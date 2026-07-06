
package com.commercetools.api.models.project;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ProjectChangeCountryTaxRateFallbackEnabledActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProjectChangeCountryTaxRateFallbackEnabledAction projectChangeCountryTaxRateFallbackEnabledAction = ProjectChangeCountryTaxRateFallbackEnabledAction.builder()
 *             .countryTaxRateFallbackEnabled(true)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ProjectChangeCountryTaxRateFallbackEnabledActionBuilder
        implements Builder<ProjectChangeCountryTaxRateFallbackEnabledAction> {

    private Boolean countryTaxRateFallbackEnabled;

    /**
     *  <p>When <code>true</code>, country <em>- no state</em> Tax Rate is used as fallback. See <a href="https://docs.commercetools.com/apis/ctp:api:type:CartsConfiguration" rel="nofollow">CartsConfiguration</a>.</p>
     * @param countryTaxRateFallbackEnabled value to be set
     * @return Builder
     */

    public ProjectChangeCountryTaxRateFallbackEnabledActionBuilder countryTaxRateFallbackEnabled(
            final Boolean countryTaxRateFallbackEnabled) {
        this.countryTaxRateFallbackEnabled = countryTaxRateFallbackEnabled;
        return this;
    }

    /**
     *  <p>When <code>true</code>, country <em>- no state</em> Tax Rate is used as fallback. See <a href="https://docs.commercetools.com/apis/ctp:api:type:CartsConfiguration" rel="nofollow">CartsConfiguration</a>.</p>
     * @return countryTaxRateFallbackEnabled
     */

    public Boolean getCountryTaxRateFallbackEnabled() {
        return this.countryTaxRateFallbackEnabled;
    }

    /**
     * builds ProjectChangeCountryTaxRateFallbackEnabledAction with checking for non-null required values
     * @return ProjectChangeCountryTaxRateFallbackEnabledAction
     */
    public ProjectChangeCountryTaxRateFallbackEnabledAction build() {
        Objects.requireNonNull(countryTaxRateFallbackEnabled,
            ProjectChangeCountryTaxRateFallbackEnabledAction.class + ": countryTaxRateFallbackEnabled is missing");
        return new ProjectChangeCountryTaxRateFallbackEnabledActionImpl(countryTaxRateFallbackEnabled);
    }

    /**
     * builds ProjectChangeCountryTaxRateFallbackEnabledAction without checking for non-null required values
     * @return ProjectChangeCountryTaxRateFallbackEnabledAction
     */
    public ProjectChangeCountryTaxRateFallbackEnabledAction buildUnchecked() {
        return new ProjectChangeCountryTaxRateFallbackEnabledActionImpl(countryTaxRateFallbackEnabled);
    }

    /**
     * factory method for an instance of ProjectChangeCountryTaxRateFallbackEnabledActionBuilder
     * @return builder
     */
    public static ProjectChangeCountryTaxRateFallbackEnabledActionBuilder of() {
        return new ProjectChangeCountryTaxRateFallbackEnabledActionBuilder();
    }

    /**
     * create builder for ProjectChangeCountryTaxRateFallbackEnabledAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ProjectChangeCountryTaxRateFallbackEnabledActionBuilder of(
            final ProjectChangeCountryTaxRateFallbackEnabledAction template) {
        ProjectChangeCountryTaxRateFallbackEnabledActionBuilder builder = new ProjectChangeCountryTaxRateFallbackEnabledActionBuilder();
        builder.countryTaxRateFallbackEnabled = template.getCountryTaxRateFallbackEnabled();
        return builder;
    }

}
