
package com.commercetools.checkout.models.application;

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
 *             .allowDiscounts(true)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class DiscountsConfigurationBuilder implements Builder<DiscountsConfiguration> {

    private Boolean allowDiscounts;

    /**
     *  <p>Indicates if the buyer is able to apply discounts to the cart. It is only applicable if the <code>mode = CompleteFlow</code>.</p>
     * @param allowDiscounts value to be set
     * @return Builder
     */

    public DiscountsConfigurationBuilder allowDiscounts(final Boolean allowDiscounts) {
        this.allowDiscounts = allowDiscounts;
        return this;
    }

    /**
     *  <p>Indicates if the buyer is able to apply discounts to the cart. It is only applicable if the <code>mode = CompleteFlow</code>.</p>
     * @return allowDiscounts
     */

    public Boolean getAllowDiscounts() {
        return this.allowDiscounts;
    }

    /**
     * builds DiscountsConfiguration with checking for non-null required values
     * @return DiscountsConfiguration
     */
    public DiscountsConfiguration build() {
        Objects.requireNonNull(allowDiscounts, DiscountsConfiguration.class + ": allowDiscounts is missing");
        return new DiscountsConfigurationImpl(allowDiscounts);
    }

    /**
     * builds DiscountsConfiguration without checking for non-null required values
     * @return DiscountsConfiguration
     */
    public DiscountsConfiguration buildUnchecked() {
        return new DiscountsConfigurationImpl(allowDiscounts);
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
        builder.allowDiscounts = template.getAllowDiscounts();
        return builder;
    }

}
