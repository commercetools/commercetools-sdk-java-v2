
package com.commercetools.checkout.models.recurring_payment;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * RecurringPaymentSetPaymentMethodConfigurationUpdateActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     RecurringPaymentSetPaymentMethodConfigurationUpdateAction recurringPaymentSetPaymentMethodConfigurationUpdateAction = RecurringPaymentSetPaymentMethodConfigurationUpdateAction.builder()
 *             .plusPaymentMethodConfigurations(paymentMethodConfigurationsBuilder -> paymentMethodConfigurationsBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class RecurringPaymentSetPaymentMethodConfigurationUpdateActionBuilder
        implements Builder<RecurringPaymentSetPaymentMethodConfigurationUpdateAction> {

    private java.util.List<com.commercetools.checkout.models.recurring_payment.PaymentMethodConfiguration> paymentMethodConfigurations;

    /**
     *  <p>PaymentMethod and Connector to set.</p>
     * @param paymentMethodConfigurations value to be set
     * @return Builder
     */

    public RecurringPaymentSetPaymentMethodConfigurationUpdateActionBuilder paymentMethodConfigurations(
            final com.commercetools.checkout.models.recurring_payment.PaymentMethodConfiguration... paymentMethodConfigurations) {
        this.paymentMethodConfigurations = new ArrayList<>(Arrays.asList(paymentMethodConfigurations));
        return this;
    }

    /**
     *  <p>PaymentMethod and Connector to set.</p>
     * @param paymentMethodConfigurations value to be set
     * @return Builder
     */

    public RecurringPaymentSetPaymentMethodConfigurationUpdateActionBuilder paymentMethodConfigurations(
            final java.util.List<com.commercetools.checkout.models.recurring_payment.PaymentMethodConfiguration> paymentMethodConfigurations) {
        this.paymentMethodConfigurations = paymentMethodConfigurations;
        return this;
    }

    /**
     *  <p>PaymentMethod and Connector to set.</p>
     * @param paymentMethodConfigurations value to be set
     * @return Builder
     */

    public RecurringPaymentSetPaymentMethodConfigurationUpdateActionBuilder plusPaymentMethodConfigurations(
            final com.commercetools.checkout.models.recurring_payment.PaymentMethodConfiguration... paymentMethodConfigurations) {
        if (this.paymentMethodConfigurations == null) {
            this.paymentMethodConfigurations = new ArrayList<>();
        }
        this.paymentMethodConfigurations.addAll(Arrays.asList(paymentMethodConfigurations));
        return this;
    }

    /**
     *  <p>PaymentMethod and Connector to set.</p>
     * @param builder function to build the paymentMethodConfigurations value
     * @return Builder
     */

    public RecurringPaymentSetPaymentMethodConfigurationUpdateActionBuilder plusPaymentMethodConfigurations(
            Function<com.commercetools.checkout.models.recurring_payment.PaymentMethodConfigurationBuilder, com.commercetools.checkout.models.recurring_payment.PaymentMethodConfigurationBuilder> builder) {
        if (this.paymentMethodConfigurations == null) {
            this.paymentMethodConfigurations = new ArrayList<>();
        }
        this.paymentMethodConfigurations.add(
            builder.apply(com.commercetools.checkout.models.recurring_payment.PaymentMethodConfigurationBuilder.of())
                    .build());
        return this;
    }

    /**
     *  <p>PaymentMethod and Connector to set.</p>
     * @param builder function to build the paymentMethodConfigurations value
     * @return Builder
     */

    public RecurringPaymentSetPaymentMethodConfigurationUpdateActionBuilder withPaymentMethodConfigurations(
            Function<com.commercetools.checkout.models.recurring_payment.PaymentMethodConfigurationBuilder, com.commercetools.checkout.models.recurring_payment.PaymentMethodConfigurationBuilder> builder) {
        this.paymentMethodConfigurations = new ArrayList<>();
        this.paymentMethodConfigurations.add(
            builder.apply(com.commercetools.checkout.models.recurring_payment.PaymentMethodConfigurationBuilder.of())
                    .build());
        return this;
    }

    /**
     *  <p>PaymentMethod and Connector to set.</p>
     * @param builder function to build the paymentMethodConfigurations value
     * @return Builder
     */

    public RecurringPaymentSetPaymentMethodConfigurationUpdateActionBuilder addPaymentMethodConfigurations(
            Function<com.commercetools.checkout.models.recurring_payment.PaymentMethodConfigurationBuilder, com.commercetools.checkout.models.recurring_payment.PaymentMethodConfiguration> builder) {
        return plusPaymentMethodConfigurations(
            builder.apply(com.commercetools.checkout.models.recurring_payment.PaymentMethodConfigurationBuilder.of()));
    }

    /**
     *  <p>PaymentMethod and Connector to set.</p>
     * @param builder function to build the paymentMethodConfigurations value
     * @return Builder
     */

    public RecurringPaymentSetPaymentMethodConfigurationUpdateActionBuilder setPaymentMethodConfigurations(
            Function<com.commercetools.checkout.models.recurring_payment.PaymentMethodConfigurationBuilder, com.commercetools.checkout.models.recurring_payment.PaymentMethodConfiguration> builder) {
        return paymentMethodConfigurations(
            builder.apply(com.commercetools.checkout.models.recurring_payment.PaymentMethodConfigurationBuilder.of()));
    }

    /**
     *  <p>PaymentMethod and Connector to set.</p>
     * @return paymentMethodConfigurations
     */

    public java.util.List<com.commercetools.checkout.models.recurring_payment.PaymentMethodConfiguration> getPaymentMethodConfigurations() {
        return this.paymentMethodConfigurations;
    }

    /**
     * builds RecurringPaymentSetPaymentMethodConfigurationUpdateAction with checking for non-null required values
     * @return RecurringPaymentSetPaymentMethodConfigurationUpdateAction
     */
    public RecurringPaymentSetPaymentMethodConfigurationUpdateAction build() {
        Objects.requireNonNull(paymentMethodConfigurations,
            RecurringPaymentSetPaymentMethodConfigurationUpdateAction.class
                    + ": paymentMethodConfigurations is missing");
        return new RecurringPaymentSetPaymentMethodConfigurationUpdateActionImpl(paymentMethodConfigurations);
    }

    /**
     * builds RecurringPaymentSetPaymentMethodConfigurationUpdateAction without checking for non-null required values
     * @return RecurringPaymentSetPaymentMethodConfigurationUpdateAction
     */
    public RecurringPaymentSetPaymentMethodConfigurationUpdateAction buildUnchecked() {
        return new RecurringPaymentSetPaymentMethodConfigurationUpdateActionImpl(paymentMethodConfigurations);
    }

    /**
     * factory method for an instance of RecurringPaymentSetPaymentMethodConfigurationUpdateActionBuilder
     * @return builder
     */
    public static RecurringPaymentSetPaymentMethodConfigurationUpdateActionBuilder of() {
        return new RecurringPaymentSetPaymentMethodConfigurationUpdateActionBuilder();
    }

    /**
     * create builder for RecurringPaymentSetPaymentMethodConfigurationUpdateAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static RecurringPaymentSetPaymentMethodConfigurationUpdateActionBuilder of(
            final RecurringPaymentSetPaymentMethodConfigurationUpdateAction template) {
        RecurringPaymentSetPaymentMethodConfigurationUpdateActionBuilder builder = new RecurringPaymentSetPaymentMethodConfigurationUpdateActionBuilder();
        builder.paymentMethodConfigurations = template.getPaymentMethodConfigurations();
        return builder;
    }

}
