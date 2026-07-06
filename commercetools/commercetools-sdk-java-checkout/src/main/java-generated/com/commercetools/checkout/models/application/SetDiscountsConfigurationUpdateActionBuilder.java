
package com.commercetools.checkout.models.application;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * SetDiscountsConfigurationUpdateActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     SetDiscountsConfigurationUpdateAction setDiscountsConfigurationUpdateAction = SetDiscountsConfigurationUpdateAction.builder()
 *             .discountsConfiguration(discountsConfigurationBuilder -> discountsConfigurationBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class SetDiscountsConfigurationUpdateActionBuilder implements Builder<SetDiscountsConfigurationUpdateAction> {

    private com.commercetools.checkout.models.application.DiscountsConfiguration discountsConfiguration;

    /**
     *  <p>New discounts configuration for the Application.</p>
     * @param builder function to build the discountsConfiguration value
     * @return Builder
     */

    public SetDiscountsConfigurationUpdateActionBuilder discountsConfiguration(
            Function<com.commercetools.checkout.models.application.DiscountsConfigurationBuilder, com.commercetools.checkout.models.application.DiscountsConfigurationBuilder> builder) {
        this.discountsConfiguration = builder
                .apply(com.commercetools.checkout.models.application.DiscountsConfigurationBuilder.of())
                .build();
        return this;
    }

    /**
     *  <p>New discounts configuration for the Application.</p>
     * @param builder function to build the discountsConfiguration value
     * @return Builder
     */

    public SetDiscountsConfigurationUpdateActionBuilder withDiscountsConfiguration(
            Function<com.commercetools.checkout.models.application.DiscountsConfigurationBuilder, com.commercetools.checkout.models.application.DiscountsConfiguration> builder) {
        this.discountsConfiguration = builder
                .apply(com.commercetools.checkout.models.application.DiscountsConfigurationBuilder.of());
        return this;
    }

    /**
     *  <p>New discounts configuration for the Application.</p>
     * @param discountsConfiguration value to be set
     * @return Builder
     */

    public SetDiscountsConfigurationUpdateActionBuilder discountsConfiguration(
            final com.commercetools.checkout.models.application.DiscountsConfiguration discountsConfiguration) {
        this.discountsConfiguration = discountsConfiguration;
        return this;
    }

    /**
     *  <p>New discounts configuration for the Application.</p>
     * @return discountsConfiguration
     */

    public com.commercetools.checkout.models.application.DiscountsConfiguration getDiscountsConfiguration() {
        return this.discountsConfiguration;
    }

    /**
     * builds SetDiscountsConfigurationUpdateAction with checking for non-null required values
     * @return SetDiscountsConfigurationUpdateAction
     */
    public SetDiscountsConfigurationUpdateAction build() {
        Objects.requireNonNull(discountsConfiguration,
            SetDiscountsConfigurationUpdateAction.class + ": discountsConfiguration is missing");
        return new SetDiscountsConfigurationUpdateActionImpl(discountsConfiguration);
    }

    /**
     * builds SetDiscountsConfigurationUpdateAction without checking for non-null required values
     * @return SetDiscountsConfigurationUpdateAction
     */
    public SetDiscountsConfigurationUpdateAction buildUnchecked() {
        return new SetDiscountsConfigurationUpdateActionImpl(discountsConfiguration);
    }

    /**
     * factory method for an instance of SetDiscountsConfigurationUpdateActionBuilder
     * @return builder
     */
    public static SetDiscountsConfigurationUpdateActionBuilder of() {
        return new SetDiscountsConfigurationUpdateActionBuilder();
    }

    /**
     * create builder for SetDiscountsConfigurationUpdateAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static SetDiscountsConfigurationUpdateActionBuilder of(
            final SetDiscountsConfigurationUpdateAction template) {
        SetDiscountsConfigurationUpdateActionBuilder builder = new SetDiscountsConfigurationUpdateActionBuilder();
        builder.discountsConfiguration = template.getDiscountsConfiguration();
        return builder;
    }

}
