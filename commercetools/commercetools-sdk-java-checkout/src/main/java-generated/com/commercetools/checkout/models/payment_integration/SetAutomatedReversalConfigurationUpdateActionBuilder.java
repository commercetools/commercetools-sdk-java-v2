
package com.commercetools.checkout.models.payment_integration;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * SetAutomatedReversalConfigurationUpdateActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     SetAutomatedReversalConfigurationUpdateAction setAutomatedReversalConfigurationUpdateAction = SetAutomatedReversalConfigurationUpdateAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class SetAutomatedReversalConfigurationUpdateActionBuilder
        implements Builder<SetAutomatedReversalConfigurationUpdateAction> {

    @Nullable
    private com.commercetools.checkout.models.payment_integration.AutomatedReversalConfiguration automatedReversalConfiguration;

    /**
     *  <p>Value to set as the automated reversal configuration of the PaymentIntegration.</p>
     * @param builder function to build the automatedReversalConfiguration value
     * @return Builder
     */

    public SetAutomatedReversalConfigurationUpdateActionBuilder automatedReversalConfiguration(
            Function<com.commercetools.checkout.models.payment_integration.AutomatedReversalConfigurationBuilder, com.commercetools.checkout.models.payment_integration.AutomatedReversalConfigurationBuilder> builder) {
        this.automatedReversalConfiguration = builder
                .apply(com.commercetools.checkout.models.payment_integration.AutomatedReversalConfigurationBuilder.of())
                .build();
        return this;
    }

    /**
     *  <p>Value to set as the automated reversal configuration of the PaymentIntegration.</p>
     * @param builder function to build the automatedReversalConfiguration value
     * @return Builder
     */

    public SetAutomatedReversalConfigurationUpdateActionBuilder withAutomatedReversalConfiguration(
            Function<com.commercetools.checkout.models.payment_integration.AutomatedReversalConfigurationBuilder, com.commercetools.checkout.models.payment_integration.AutomatedReversalConfiguration> builder) {
        this.automatedReversalConfiguration = builder.apply(
            com.commercetools.checkout.models.payment_integration.AutomatedReversalConfigurationBuilder.of());
        return this;
    }

    /**
     *  <p>Value to set as the automated reversal configuration of the PaymentIntegration.</p>
     * @param automatedReversalConfiguration value to be set
     * @return Builder
     */

    public SetAutomatedReversalConfigurationUpdateActionBuilder automatedReversalConfiguration(
            @Nullable final com.commercetools.checkout.models.payment_integration.AutomatedReversalConfiguration automatedReversalConfiguration) {
        this.automatedReversalConfiguration = automatedReversalConfiguration;
        return this;
    }

    /**
     *  <p>Value to set as the automated reversal configuration of the PaymentIntegration.</p>
     * @return automatedReversalConfiguration
     */

    @Nullable
    public com.commercetools.checkout.models.payment_integration.AutomatedReversalConfiguration getAutomatedReversalConfiguration() {
        return this.automatedReversalConfiguration;
    }

    /**
     * builds SetAutomatedReversalConfigurationUpdateAction with checking for non-null required values
     * @return SetAutomatedReversalConfigurationUpdateAction
     */
    public SetAutomatedReversalConfigurationUpdateAction build() {
        return new SetAutomatedReversalConfigurationUpdateActionImpl(automatedReversalConfiguration);
    }

    /**
     * builds SetAutomatedReversalConfigurationUpdateAction without checking for non-null required values
     * @return SetAutomatedReversalConfigurationUpdateAction
     */
    public SetAutomatedReversalConfigurationUpdateAction buildUnchecked() {
        return new SetAutomatedReversalConfigurationUpdateActionImpl(automatedReversalConfiguration);
    }

    /**
     * factory method for an instance of SetAutomatedReversalConfigurationUpdateActionBuilder
     * @return builder
     */
    public static SetAutomatedReversalConfigurationUpdateActionBuilder of() {
        return new SetAutomatedReversalConfigurationUpdateActionBuilder();
    }

    /**
     * create builder for SetAutomatedReversalConfigurationUpdateAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static SetAutomatedReversalConfigurationUpdateActionBuilder of(
            final SetAutomatedReversalConfigurationUpdateAction template) {
        SetAutomatedReversalConfigurationUpdateActionBuilder builder = new SetAutomatedReversalConfigurationUpdateActionBuilder();
        builder.automatedReversalConfiguration = template.getAutomatedReversalConfiguration();
        return builder;
    }

}
