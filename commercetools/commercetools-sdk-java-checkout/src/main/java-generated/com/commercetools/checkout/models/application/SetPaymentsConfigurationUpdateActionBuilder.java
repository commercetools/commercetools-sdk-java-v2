
package com.commercetools.checkout.models.application;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * SetPaymentsConfigurationUpdateActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     SetPaymentsConfigurationUpdateAction setPaymentsConfigurationUpdateAction = SetPaymentsConfigurationUpdateAction.builder()
 *             .paymentsConfiguration(paymentsConfigurationBuilder -> paymentsConfigurationBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class SetPaymentsConfigurationUpdateActionBuilder implements Builder<SetPaymentsConfigurationUpdateAction> {

    private com.commercetools.checkout.models.application.PaymentsConfiguration paymentsConfiguration;

    /**
     *  <p>New payments configuration for the Application.</p>
     * @param builder function to build the paymentsConfiguration value
     * @return Builder
     */

    public SetPaymentsConfigurationUpdateActionBuilder paymentsConfiguration(
            Function<com.commercetools.checkout.models.application.PaymentsConfigurationBuilder, com.commercetools.checkout.models.application.PaymentsConfigurationBuilder> builder) {
        this.paymentsConfiguration = builder
                .apply(com.commercetools.checkout.models.application.PaymentsConfigurationBuilder.of())
                .build();
        return this;
    }

    /**
     *  <p>New payments configuration for the Application.</p>
     * @param builder function to build the paymentsConfiguration value
     * @return Builder
     */

    public SetPaymentsConfigurationUpdateActionBuilder withPaymentsConfiguration(
            Function<com.commercetools.checkout.models.application.PaymentsConfigurationBuilder, com.commercetools.checkout.models.application.PaymentsConfiguration> builder) {
        this.paymentsConfiguration = builder
                .apply(com.commercetools.checkout.models.application.PaymentsConfigurationBuilder.of());
        return this;
    }

    /**
     *  <p>New payments configuration for the Application.</p>
     * @param paymentsConfiguration value to be set
     * @return Builder
     */

    public SetPaymentsConfigurationUpdateActionBuilder paymentsConfiguration(
            final com.commercetools.checkout.models.application.PaymentsConfiguration paymentsConfiguration) {
        this.paymentsConfiguration = paymentsConfiguration;
        return this;
    }

    /**
     *  <p>New payments configuration for the Application.</p>
     * @return paymentsConfiguration
     */

    public com.commercetools.checkout.models.application.PaymentsConfiguration getPaymentsConfiguration() {
        return this.paymentsConfiguration;
    }

    /**
     * builds SetPaymentsConfigurationUpdateAction with checking for non-null required values
     * @return SetPaymentsConfigurationUpdateAction
     */
    public SetPaymentsConfigurationUpdateAction build() {
        Objects.requireNonNull(paymentsConfiguration,
            SetPaymentsConfigurationUpdateAction.class + ": paymentsConfiguration is missing");
        return new SetPaymentsConfigurationUpdateActionImpl(paymentsConfiguration);
    }

    /**
     * builds SetPaymentsConfigurationUpdateAction without checking for non-null required values
     * @return SetPaymentsConfigurationUpdateAction
     */
    public SetPaymentsConfigurationUpdateAction buildUnchecked() {
        return new SetPaymentsConfigurationUpdateActionImpl(paymentsConfiguration);
    }

    /**
     * factory method for an instance of SetPaymentsConfigurationUpdateActionBuilder
     * @return builder
     */
    public static SetPaymentsConfigurationUpdateActionBuilder of() {
        return new SetPaymentsConfigurationUpdateActionBuilder();
    }

    /**
     * create builder for SetPaymentsConfigurationUpdateAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static SetPaymentsConfigurationUpdateActionBuilder of(final SetPaymentsConfigurationUpdateAction template) {
        SetPaymentsConfigurationUpdateActionBuilder builder = new SetPaymentsConfigurationUpdateActionBuilder();
        builder.paymentsConfiguration = template.getPaymentsConfiguration();
        return builder;
    }

}
