
package com.commercetools.checkout.models.recurring_payment;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * RecurringPaymentAddPaymentMethodConfigurationUpdateActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     RecurringPaymentAddPaymentMethodConfigurationUpdateAction recurringPaymentAddPaymentMethodConfigurationUpdateAction = RecurringPaymentAddPaymentMethodConfigurationUpdateAction.builder()
 *             .paymentMethodConfiguration(paymentMethodConfigurationBuilder -> paymentMethodConfigurationBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class RecurringPaymentAddPaymentMethodConfigurationUpdateActionBuilder
        implements Builder<RecurringPaymentAddPaymentMethodConfigurationUpdateAction> {

    private com.commercetools.checkout.models.recurring_payment.PaymentMethodConfiguration paymentMethodConfiguration;

    /**
     *  <p>PaymentMethod and Connector to add.</p>
     * @param builder function to build the paymentMethodConfiguration value
     * @return Builder
     */

    public RecurringPaymentAddPaymentMethodConfigurationUpdateActionBuilder paymentMethodConfiguration(
            Function<com.commercetools.checkout.models.recurring_payment.PaymentMethodConfigurationBuilder, com.commercetools.checkout.models.recurring_payment.PaymentMethodConfigurationBuilder> builder) {
        this.paymentMethodConfiguration = builder
                .apply(com.commercetools.checkout.models.recurring_payment.PaymentMethodConfigurationBuilder.of())
                .build();
        return this;
    }

    /**
     *  <p>PaymentMethod and Connector to add.</p>
     * @param builder function to build the paymentMethodConfiguration value
     * @return Builder
     */

    public RecurringPaymentAddPaymentMethodConfigurationUpdateActionBuilder withPaymentMethodConfiguration(
            Function<com.commercetools.checkout.models.recurring_payment.PaymentMethodConfigurationBuilder, com.commercetools.checkout.models.recurring_payment.PaymentMethodConfiguration> builder) {
        this.paymentMethodConfiguration = builder
                .apply(com.commercetools.checkout.models.recurring_payment.PaymentMethodConfigurationBuilder.of());
        return this;
    }

    /**
     *  <p>PaymentMethod and Connector to add.</p>
     * @param paymentMethodConfiguration value to be set
     * @return Builder
     */

    public RecurringPaymentAddPaymentMethodConfigurationUpdateActionBuilder paymentMethodConfiguration(
            final com.commercetools.checkout.models.recurring_payment.PaymentMethodConfiguration paymentMethodConfiguration) {
        this.paymentMethodConfiguration = paymentMethodConfiguration;
        return this;
    }

    /**
     *  <p>PaymentMethod and Connector to add.</p>
     * @return paymentMethodConfiguration
     */

    public com.commercetools.checkout.models.recurring_payment.PaymentMethodConfiguration getPaymentMethodConfiguration() {
        return this.paymentMethodConfiguration;
    }

    /**
     * builds RecurringPaymentAddPaymentMethodConfigurationUpdateAction with checking for non-null required values
     * @return RecurringPaymentAddPaymentMethodConfigurationUpdateAction
     */
    public RecurringPaymentAddPaymentMethodConfigurationUpdateAction build() {
        Objects.requireNonNull(paymentMethodConfiguration,
            RecurringPaymentAddPaymentMethodConfigurationUpdateAction.class
                    + ": paymentMethodConfiguration is missing");
        return new RecurringPaymentAddPaymentMethodConfigurationUpdateActionImpl(paymentMethodConfiguration);
    }

    /**
     * builds RecurringPaymentAddPaymentMethodConfigurationUpdateAction without checking for non-null required values
     * @return RecurringPaymentAddPaymentMethodConfigurationUpdateAction
     */
    public RecurringPaymentAddPaymentMethodConfigurationUpdateAction buildUnchecked() {
        return new RecurringPaymentAddPaymentMethodConfigurationUpdateActionImpl(paymentMethodConfiguration);
    }

    /**
     * factory method for an instance of RecurringPaymentAddPaymentMethodConfigurationUpdateActionBuilder
     * @return builder
     */
    public static RecurringPaymentAddPaymentMethodConfigurationUpdateActionBuilder of() {
        return new RecurringPaymentAddPaymentMethodConfigurationUpdateActionBuilder();
    }

    /**
     * create builder for RecurringPaymentAddPaymentMethodConfigurationUpdateAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static RecurringPaymentAddPaymentMethodConfigurationUpdateActionBuilder of(
            final RecurringPaymentAddPaymentMethodConfigurationUpdateAction template) {
        RecurringPaymentAddPaymentMethodConfigurationUpdateActionBuilder builder = new RecurringPaymentAddPaymentMethodConfigurationUpdateActionBuilder();
        builder.paymentMethodConfiguration = template.getPaymentMethodConfiguration();
        return builder;
    }

}
