
package com.commercetools.api.models.project;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * DiscountsConfigurationBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     DiscountsConfiguration discountsConfiguration = DiscountsConfiguration.builder()
 *             .discountCombinationMode(DiscountCombinationMode.BEST_DEAL)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class DiscountsConfigurationBuilder implements Builder<DiscountsConfiguration> {

    private com.commercetools.api.models.project.DiscountCombinationMode discountCombinationMode;

    /**
     *  <p>Indicates how Product Discounts and Cart Discounts should be combined. Default value is <code>Stacking</code>.</p>
     * @param discountCombinationMode value to be set
     * @return Builder
     */

    public DiscountsConfigurationBuilder discountCombinationMode(
            final com.commercetools.api.models.project.DiscountCombinationMode discountCombinationMode) {
        this.discountCombinationMode = discountCombinationMode;
        return this;
    }

    /**
     *  <p>Indicates how Product Discounts and Cart Discounts should be combined. Default value is <code>Stacking</code>.</p>
     * @return discountCombinationMode
     */

    public com.commercetools.api.models.project.DiscountCombinationMode getDiscountCombinationMode() {
        return this.discountCombinationMode;
    }

    /**
     * builds DiscountsConfiguration with checking for non-null required values
     * @return DiscountsConfiguration
     */
    public DiscountsConfiguration build() {
        Objects.requireNonNull(discountCombinationMode,
            DiscountsConfiguration.class + ": discountCombinationMode is missing");
        return new DiscountsConfigurationImpl(discountCombinationMode);
    }

    /**
     * builds DiscountsConfiguration without checking for non-null required values
     * @return DiscountsConfiguration
     */
    public DiscountsConfiguration buildUnchecked() {
        return new DiscountsConfigurationImpl(discountCombinationMode);
    }

    /**
     * factory method for an instance of DiscountsConfigurationBuilder
     * @return builder
     */
    public static DiscountsConfigurationBuilder of() {
        return new DiscountsConfigurationBuilder();
    }

    /**
     * create builder for DiscountsConfiguration instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static DiscountsConfigurationBuilder of(final DiscountsConfiguration template) {
        DiscountsConfigurationBuilder builder = new DiscountsConfigurationBuilder();
        builder.discountCombinationMode = template.getDiscountCombinationMode();
        return builder;
    }

}
