
package com.commercetools.checkout.models.recurring_payment;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * RecurringPaymentBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     RecurringPayment recurringPayment = RecurringPayment.builder()
 *             .id("{id}")
 *             .version(1)
 *             .recurringOrder(recurringOrderBuilder -> recurringOrderBuilder)
 *             .plusPaymentMethodConfigurations(paymentMethodConfigurationsBuilder -> paymentMethodConfigurationsBuilder)
 *             .createdAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .lastModifiedAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class RecurringPaymentBuilder implements Builder<RecurringPayment> {

    private String id;

    private Integer version;

    @Nullable
    private String key;

    private com.commercetools.checkout.models.recurring_payment.RecurringOrderReference recurringOrder;

    private java.util.List<com.commercetools.checkout.models.recurring_payment.PaymentMethodConfiguration> paymentMethodConfigurations;

    private java.time.ZonedDateTime createdAt;

    private java.time.ZonedDateTime lastModifiedAt;

    /**
     *  <p>Unique identifier of the RecurringPayment.</p>
     * @param id value to be set
     * @return Builder
     */

    public RecurringPaymentBuilder id(final String id) {
        this.id = id;
        return this;
    }

    /**
     *  <p>Current version of the RecurringPayment.</p>
     * @param version value to be set
     * @return Builder
     */

    public RecurringPaymentBuilder version(final Integer version) {
        this.version = version;
        return this;
    }

    /**
     *  <p>User-defined unique identifier of the RecurringPayment.</p>
     * @param key value to be set
     * @return Builder
     */

    public RecurringPaymentBuilder key(@Nullable final String key) {
        this.key = key;
        return this;
    }

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:RecurringOrder" rel="nofollow">RecurringOrder</a> whose future payments are processed using Checkout.</p>
     * @param builder function to build the recurringOrder value
     * @return Builder
     */

    public RecurringPaymentBuilder recurringOrder(
            Function<com.commercetools.checkout.models.recurring_payment.RecurringOrderReferenceBuilder, com.commercetools.checkout.models.recurring_payment.RecurringOrderReferenceBuilder> builder) {
        this.recurringOrder = builder
                .apply(com.commercetools.checkout.models.recurring_payment.RecurringOrderReferenceBuilder.of())
                .build();
        return this;
    }

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:RecurringOrder" rel="nofollow">RecurringOrder</a> whose future payments are processed using Checkout.</p>
     * @param builder function to build the recurringOrder value
     * @return Builder
     */

    public RecurringPaymentBuilder withRecurringOrder(
            Function<com.commercetools.checkout.models.recurring_payment.RecurringOrderReferenceBuilder, com.commercetools.checkout.models.recurring_payment.RecurringOrderReference> builder) {
        this.recurringOrder = builder
                .apply(com.commercetools.checkout.models.recurring_payment.RecurringOrderReferenceBuilder.of());
        return this;
    }

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:RecurringOrder" rel="nofollow">RecurringOrder</a> whose future payments are processed using Checkout.</p>
     * @param recurringOrder value to be set
     * @return Builder
     */

    public RecurringPaymentBuilder recurringOrder(
            final com.commercetools.checkout.models.recurring_payment.RecurringOrderReference recurringOrder) {
        this.recurringOrder = recurringOrder;
        return this;
    }

    /**
     *  <p>PaymentMethod and Connector used to pay the <a href="https://docs.commercetools.com/apis/ctp:api:type:RecurringOrder" rel="nofollow">RecurringOrder</a>. Checkout only supports processing this array with one PaymentMethodConfiguration.</p>
     * @param paymentMethodConfigurations value to be set
     * @return Builder
     */

    public RecurringPaymentBuilder paymentMethodConfigurations(
            final com.commercetools.checkout.models.recurring_payment.PaymentMethodConfiguration... paymentMethodConfigurations) {
        this.paymentMethodConfigurations = new ArrayList<>(Arrays.asList(paymentMethodConfigurations));
        return this;
    }

    /**
     *  <p>PaymentMethod and Connector used to pay the <a href="https://docs.commercetools.com/apis/ctp:api:type:RecurringOrder" rel="nofollow">RecurringOrder</a>. Checkout only supports processing this array with one PaymentMethodConfiguration.</p>
     * @param paymentMethodConfigurations value to be set
     * @return Builder
     */

    public RecurringPaymentBuilder paymentMethodConfigurations(
            final java.util.List<com.commercetools.checkout.models.recurring_payment.PaymentMethodConfiguration> paymentMethodConfigurations) {
        this.paymentMethodConfigurations = paymentMethodConfigurations;
        return this;
    }

    /**
     *  <p>PaymentMethod and Connector used to pay the <a href="https://docs.commercetools.com/apis/ctp:api:type:RecurringOrder" rel="nofollow">RecurringOrder</a>. Checkout only supports processing this array with one PaymentMethodConfiguration.</p>
     * @param paymentMethodConfigurations value to be set
     * @return Builder
     */

    public RecurringPaymentBuilder plusPaymentMethodConfigurations(
            final com.commercetools.checkout.models.recurring_payment.PaymentMethodConfiguration... paymentMethodConfigurations) {
        if (this.paymentMethodConfigurations == null) {
            this.paymentMethodConfigurations = new ArrayList<>();
        }
        this.paymentMethodConfigurations.addAll(Arrays.asList(paymentMethodConfigurations));
        return this;
    }

    /**
     *  <p>PaymentMethod and Connector used to pay the <a href="https://docs.commercetools.com/apis/ctp:api:type:RecurringOrder" rel="nofollow">RecurringOrder</a>. Checkout only supports processing this array with one PaymentMethodConfiguration.</p>
     * @param builder function to build the paymentMethodConfigurations value
     * @return Builder
     */

    public RecurringPaymentBuilder plusPaymentMethodConfigurations(
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
     *  <p>PaymentMethod and Connector used to pay the <a href="https://docs.commercetools.com/apis/ctp:api:type:RecurringOrder" rel="nofollow">RecurringOrder</a>. Checkout only supports processing this array with one PaymentMethodConfiguration.</p>
     * @param builder function to build the paymentMethodConfigurations value
     * @return Builder
     */

    public RecurringPaymentBuilder withPaymentMethodConfigurations(
            Function<com.commercetools.checkout.models.recurring_payment.PaymentMethodConfigurationBuilder, com.commercetools.checkout.models.recurring_payment.PaymentMethodConfigurationBuilder> builder) {
        this.paymentMethodConfigurations = new ArrayList<>();
        this.paymentMethodConfigurations.add(
            builder.apply(com.commercetools.checkout.models.recurring_payment.PaymentMethodConfigurationBuilder.of())
                    .build());
        return this;
    }

    /**
     *  <p>PaymentMethod and Connector used to pay the <a href="https://docs.commercetools.com/apis/ctp:api:type:RecurringOrder" rel="nofollow">RecurringOrder</a>. Checkout only supports processing this array with one PaymentMethodConfiguration.</p>
     * @param builder function to build the paymentMethodConfigurations value
     * @return Builder
     */

    public RecurringPaymentBuilder addPaymentMethodConfigurations(
            Function<com.commercetools.checkout.models.recurring_payment.PaymentMethodConfigurationBuilder, com.commercetools.checkout.models.recurring_payment.PaymentMethodConfiguration> builder) {
        return plusPaymentMethodConfigurations(
            builder.apply(com.commercetools.checkout.models.recurring_payment.PaymentMethodConfigurationBuilder.of()));
    }

    /**
     *  <p>PaymentMethod and Connector used to pay the <a href="https://docs.commercetools.com/apis/ctp:api:type:RecurringOrder" rel="nofollow">RecurringOrder</a>. Checkout only supports processing this array with one PaymentMethodConfiguration.</p>
     * @param builder function to build the paymentMethodConfigurations value
     * @return Builder
     */

    public RecurringPaymentBuilder setPaymentMethodConfigurations(
            Function<com.commercetools.checkout.models.recurring_payment.PaymentMethodConfigurationBuilder, com.commercetools.checkout.models.recurring_payment.PaymentMethodConfiguration> builder) {
        return paymentMethodConfigurations(
            builder.apply(com.commercetools.checkout.models.recurring_payment.PaymentMethodConfigurationBuilder.of()));
    }

    /**
     *  <p>Date and time (UTC) the RecurringPayment was initially created.</p>
     * @param createdAt value to be set
     * @return Builder
     */

    public RecurringPaymentBuilder createdAt(final java.time.ZonedDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     *  <p>Date and time (UTC) the RecurringPayment was last updated.</p>
     * @param lastModifiedAt value to be set
     * @return Builder
     */

    public RecurringPaymentBuilder lastModifiedAt(final java.time.ZonedDateTime lastModifiedAt) {
        this.lastModifiedAt = lastModifiedAt;
        return this;
    }

    /**
     *  <p>Unique identifier of the RecurringPayment.</p>
     * @return id
     */

    public String getId() {
        return this.id;
    }

    /**
     *  <p>Current version of the RecurringPayment.</p>
     * @return version
     */

    public Integer getVersion() {
        return this.version;
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
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:RecurringOrder" rel="nofollow">RecurringOrder</a> whose future payments are processed using Checkout.</p>
     * @return recurringOrder
     */

    public com.commercetools.checkout.models.recurring_payment.RecurringOrderReference getRecurringOrder() {
        return this.recurringOrder;
    }

    /**
     *  <p>PaymentMethod and Connector used to pay the <a href="https://docs.commercetools.com/apis/ctp:api:type:RecurringOrder" rel="nofollow">RecurringOrder</a>. Checkout only supports processing this array with one PaymentMethodConfiguration.</p>
     * @return paymentMethodConfigurations
     */

    public java.util.List<com.commercetools.checkout.models.recurring_payment.PaymentMethodConfiguration> getPaymentMethodConfigurations() {
        return this.paymentMethodConfigurations;
    }

    /**
     *  <p>Date and time (UTC) the RecurringPayment was initially created.</p>
     * @return createdAt
     */

    public java.time.ZonedDateTime getCreatedAt() {
        return this.createdAt;
    }

    /**
     *  <p>Date and time (UTC) the RecurringPayment was last updated.</p>
     * @return lastModifiedAt
     */

    public java.time.ZonedDateTime getLastModifiedAt() {
        return this.lastModifiedAt;
    }

    /**
     * builds RecurringPayment with checking for non-null required values
     * @return RecurringPayment
     */
    public RecurringPayment build() {
        Objects.requireNonNull(id, RecurringPayment.class + ": id is missing");
        Objects.requireNonNull(version, RecurringPayment.class + ": version is missing");
        Objects.requireNonNull(recurringOrder, RecurringPayment.class + ": recurringOrder is missing");
        Objects.requireNonNull(paymentMethodConfigurations,
            RecurringPayment.class + ": paymentMethodConfigurations is missing");
        Objects.requireNonNull(createdAt, RecurringPayment.class + ": createdAt is missing");
        Objects.requireNonNull(lastModifiedAt, RecurringPayment.class + ": lastModifiedAt is missing");
        return new RecurringPaymentImpl(id, version, key, recurringOrder, paymentMethodConfigurations, createdAt,
            lastModifiedAt);
    }

    /**
     * builds RecurringPayment without checking for non-null required values
     * @return RecurringPayment
     */
    public RecurringPayment buildUnchecked() {
        return new RecurringPaymentImpl(id, version, key, recurringOrder, paymentMethodConfigurations, createdAt,
            lastModifiedAt);
    }

    /**
     * factory method for an instance of RecurringPaymentBuilder
     * @return builder
     */
    public static RecurringPaymentBuilder of() {
        return new RecurringPaymentBuilder();
    }

    /**
     * create builder for RecurringPayment instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static RecurringPaymentBuilder of(final RecurringPayment template) {
        RecurringPaymentBuilder builder = new RecurringPaymentBuilder();
        builder.id = template.getId();
        builder.version = template.getVersion();
        builder.key = template.getKey();
        builder.recurringOrder = template.getRecurringOrder();
        builder.paymentMethodConfigurations = template.getPaymentMethodConfigurations();
        builder.createdAt = template.getCreatedAt();
        builder.lastModifiedAt = template.getLastModifiedAt();
        return builder;
    }

}
