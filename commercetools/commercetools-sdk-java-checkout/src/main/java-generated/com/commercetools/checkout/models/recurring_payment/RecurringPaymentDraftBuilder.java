
package com.commercetools.checkout.models.recurring_payment;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * RecurringPaymentDraftBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     RecurringPaymentDraft recurringPaymentDraft = RecurringPaymentDraft.builder()
 *             .recurringOrder(recurringOrderBuilder -> recurringOrderBuilder)
 *             .plusPaymentMethodConfigurations(paymentMethodConfigurationsBuilder -> paymentMethodConfigurationsBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class RecurringPaymentDraftBuilder implements Builder<RecurringPaymentDraft> {

    @Nullable
    private String key;

    private com.commercetools.checkout.models.recurring_payment.RecurringOrderReference recurringOrder;

    private java.util.List<com.commercetools.checkout.models.recurring_payment.PaymentMethodConfiguration> paymentMethodConfigurations;

    /**
     *  <p>User-defined unique identifier of the RecurringPayment.</p>
     * @param key value to be set
     * @return Builder
     */

    public RecurringPaymentDraftBuilder key(@Nullable final String key) {
        this.key = key;
        return this;
    }

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:RecurringOrder" rel="nofollow">RecurringOrder</a> whose future payments must be processed using Checkout.</p>
     * @param builder function to build the recurringOrder value
     * @return Builder
     */

    public RecurringPaymentDraftBuilder recurringOrder(
            Function<com.commercetools.checkout.models.recurring_payment.RecurringOrderReferenceBuilder, com.commercetools.checkout.models.recurring_payment.RecurringOrderReferenceBuilder> builder) {
        this.recurringOrder = builder
                .apply(com.commercetools.checkout.models.recurring_payment.RecurringOrderReferenceBuilder.of())
                .build();
        return this;
    }

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:RecurringOrder" rel="nofollow">RecurringOrder</a> whose future payments must be processed using Checkout.</p>
     * @param builder function to build the recurringOrder value
     * @return Builder
     */

    public RecurringPaymentDraftBuilder withRecurringOrder(
            Function<com.commercetools.checkout.models.recurring_payment.RecurringOrderReferenceBuilder, com.commercetools.checkout.models.recurring_payment.RecurringOrderReference> builder) {
        this.recurringOrder = builder
                .apply(com.commercetools.checkout.models.recurring_payment.RecurringOrderReferenceBuilder.of());
        return this;
    }

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:RecurringOrder" rel="nofollow">RecurringOrder</a> whose future payments must be processed using Checkout.</p>
     * @param recurringOrder value to be set
     * @return Builder
     */

    public RecurringPaymentDraftBuilder recurringOrder(
            final com.commercetools.checkout.models.recurring_payment.RecurringOrderReference recurringOrder) {
        this.recurringOrder = recurringOrder;
        return this;
    }

    /**
     *  <p>PaymentMethod and Connector to use to pay the <a href="https://docs.commercetools.com/apis/ctp:api:type:RecurringOrder" rel="nofollow">RecurringOrder</a>. Checkout only supports processing this array with one PaymentMethodConfiguration.</p>
     * @param paymentMethodConfigurations value to be set
     * @return Builder
     */

    public RecurringPaymentDraftBuilder paymentMethodConfigurations(
            final com.commercetools.checkout.models.recurring_payment.PaymentMethodConfiguration... paymentMethodConfigurations) {
        this.paymentMethodConfigurations = new ArrayList<>(Arrays.asList(paymentMethodConfigurations));
        return this;
    }

    /**
     *  <p>PaymentMethod and Connector to use to pay the <a href="https://docs.commercetools.com/apis/ctp:api:type:RecurringOrder" rel="nofollow">RecurringOrder</a>. Checkout only supports processing this array with one PaymentMethodConfiguration.</p>
     * @param paymentMethodConfigurations value to be set
     * @return Builder
     */

    public RecurringPaymentDraftBuilder paymentMethodConfigurations(
            final java.util.List<com.commercetools.checkout.models.recurring_payment.PaymentMethodConfiguration> paymentMethodConfigurations) {
        this.paymentMethodConfigurations = paymentMethodConfigurations;
        return this;
    }

    /**
     *  <p>PaymentMethod and Connector to use to pay the <a href="https://docs.commercetools.com/apis/ctp:api:type:RecurringOrder" rel="nofollow">RecurringOrder</a>. Checkout only supports processing this array with one PaymentMethodConfiguration.</p>
     * @param paymentMethodConfigurations value to be set
     * @return Builder
     */

    public RecurringPaymentDraftBuilder plusPaymentMethodConfigurations(
            final com.commercetools.checkout.models.recurring_payment.PaymentMethodConfiguration... paymentMethodConfigurations) {
        if (this.paymentMethodConfigurations == null) {
            this.paymentMethodConfigurations = new ArrayList<>();
        }
        this.paymentMethodConfigurations.addAll(Arrays.asList(paymentMethodConfigurations));
        return this;
    }

    /**
     *  <p>PaymentMethod and Connector to use to pay the <a href="https://docs.commercetools.com/apis/ctp:api:type:RecurringOrder" rel="nofollow">RecurringOrder</a>. Checkout only supports processing this array with one PaymentMethodConfiguration.</p>
     * @param builder function to build the paymentMethodConfigurations value
     * @return Builder
     */

    public RecurringPaymentDraftBuilder plusPaymentMethodConfigurations(
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
     *  <p>PaymentMethod and Connector to use to pay the <a href="https://docs.commercetools.com/apis/ctp:api:type:RecurringOrder" rel="nofollow">RecurringOrder</a>. Checkout only supports processing this array with one PaymentMethodConfiguration.</p>
     * @param builder function to build the paymentMethodConfigurations value
     * @return Builder
     */

    public RecurringPaymentDraftBuilder withPaymentMethodConfigurations(
            Function<com.commercetools.checkout.models.recurring_payment.PaymentMethodConfigurationBuilder, com.commercetools.checkout.models.recurring_payment.PaymentMethodConfigurationBuilder> builder) {
        this.paymentMethodConfigurations = new ArrayList<>();
        this.paymentMethodConfigurations.add(
            builder.apply(com.commercetools.checkout.models.recurring_payment.PaymentMethodConfigurationBuilder.of())
                    .build());
        return this;
    }

    /**
     *  <p>PaymentMethod and Connector to use to pay the <a href="https://docs.commercetools.com/apis/ctp:api:type:RecurringOrder" rel="nofollow">RecurringOrder</a>. Checkout only supports processing this array with one PaymentMethodConfiguration.</p>
     * @param builder function to build the paymentMethodConfigurations value
     * @return Builder
     */

    public RecurringPaymentDraftBuilder addPaymentMethodConfigurations(
            Function<com.commercetools.checkout.models.recurring_payment.PaymentMethodConfigurationBuilder, com.commercetools.checkout.models.recurring_payment.PaymentMethodConfiguration> builder) {
        return plusPaymentMethodConfigurations(
            builder.apply(com.commercetools.checkout.models.recurring_payment.PaymentMethodConfigurationBuilder.of()));
    }

    /**
     *  <p>PaymentMethod and Connector to use to pay the <a href="https://docs.commercetools.com/apis/ctp:api:type:RecurringOrder" rel="nofollow">RecurringOrder</a>. Checkout only supports processing this array with one PaymentMethodConfiguration.</p>
     * @param builder function to build the paymentMethodConfigurations value
     * @return Builder
     */

    public RecurringPaymentDraftBuilder setPaymentMethodConfigurations(
            Function<com.commercetools.checkout.models.recurring_payment.PaymentMethodConfigurationBuilder, com.commercetools.checkout.models.recurring_payment.PaymentMethodConfiguration> builder) {
        return paymentMethodConfigurations(
            builder.apply(com.commercetools.checkout.models.recurring_payment.PaymentMethodConfigurationBuilder.of()));
    }

    /**
     *  <p>User-defined unique identifier of the RecurringPayment.</p>
     * @return key
     */

    @Nullable
    public String getKey() {
        return this.key;
    }

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:RecurringOrder" rel="nofollow">RecurringOrder</a> whose future payments must be processed using Checkout.</p>
     * @return recurringOrder
     */

    public com.commercetools.checkout.models.recurring_payment.RecurringOrderReference getRecurringOrder() {
        return this.recurringOrder;
    }

    /**
     *  <p>PaymentMethod and Connector to use to pay the <a href="https://docs.commercetools.com/apis/ctp:api:type:RecurringOrder" rel="nofollow">RecurringOrder</a>. Checkout only supports processing this array with one PaymentMethodConfiguration.</p>
     * @return paymentMethodConfigurations
     */

    public java.util.List<com.commercetools.checkout.models.recurring_payment.PaymentMethodConfiguration> getPaymentMethodConfigurations() {
        return this.paymentMethodConfigurations;
    }

    /**
     * builds RecurringPaymentDraft with checking for non-null required values
     * @return RecurringPaymentDraft
     */
    public RecurringPaymentDraft build() {
        Objects.requireNonNull(recurringOrder, RecurringPaymentDraft.class + ": recurringOrder is missing");
        Objects.requireNonNull(paymentMethodConfigurations,
            RecurringPaymentDraft.class + ": paymentMethodConfigurations is missing");
        return new RecurringPaymentDraftImpl(key, recurringOrder, paymentMethodConfigurations);
    }

    /**
     * builds RecurringPaymentDraft without checking for non-null required values
     * @return RecurringPaymentDraft
     */
    public RecurringPaymentDraft buildUnchecked() {
        return new RecurringPaymentDraftImpl(key, recurringOrder, paymentMethodConfigurations);
    }

    /**
     * factory method for an instance of RecurringPaymentDraftBuilder
     * @return builder
     */
    public static RecurringPaymentDraftBuilder of() {
        return new RecurringPaymentDraftBuilder();
    }

    /**
     * create builder for RecurringPaymentDraft instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static RecurringPaymentDraftBuilder of(final RecurringPaymentDraft template) {
        RecurringPaymentDraftBuilder builder = new RecurringPaymentDraftBuilder();
        builder.key = template.getKey();
        builder.recurringOrder = template.getRecurringOrder();
        builder.paymentMethodConfigurations = template.getPaymentMethodConfigurations();
        return builder;
    }

}
