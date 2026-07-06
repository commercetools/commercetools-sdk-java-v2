
package com.commercetools.api.models.error;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ExactLockConflictErrorBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ExactLockConflictError exactLockConflictError = ExactLockConflictError.builder()
 *             .message("{message}")
 *             .sku("{sku}")
 *             .currency("{currency}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ExactLockConflictErrorBuilder implements Builder<ExactLockConflictError> {

    private String message;

    private Map<String, java.lang.Object> values = new HashMap<>();

    private String sku;

    private String currency;

    @Nullable
    private String country;

    @Nullable
    private com.commercetools.api.models.customer_group.CustomerGroupResourceIdentifier customerGroup;

    @Nullable
    private com.commercetools.api.models.channel.ChannelResourceIdentifier channel;

    @Nullable
    private java.time.ZonedDateTime validFrom;

    @Nullable
    private java.time.ZonedDateTime validUntil;

    @Nullable
    private com.commercetools.api.models.recurrence_policy.RecurrencePolicyReference recurrencePolicy;

    /**
     *  <p><code>"Modification already in progress for the combination of SKU and price scope fields."</code></p>
     * @param message value to be set
     * @return Builder
     */

    public ExactLockConflictErrorBuilder message(final String message) {
        this.message = message;
        return this;
    }

    /**
     *  <p>Error-specific additional fields.</p>
     * @param values properties to be set
     * @return Builder
     */

    public ExactLockConflictErrorBuilder values(final Map<String, java.lang.Object> values) {
        this.values = values;
        return this;
    }

    /**
     *  <p>Error-specific additional fields.</p>
     * @param key property name
     * @param value property value
     * @return Builder
     */

    public ExactLockConflictErrorBuilder addValue(final String key, final java.lang.Object value) {
        if (this.values == null) {
            values = new HashMap<>();
        }
        values.put(key, value);
        return this;
    }

    /**
     *  <p>SKU for which the modification conflict occurred.</p>
     * @param sku value to be set
     * @return Builder
     */

    public ExactLockConflictErrorBuilder sku(final String sku) {
        this.sku = sku;
        return this;
    }

    /**
     *  <p>Currency code of the Standalone Price.</p>
     * @param currency value to be set
     * @return Builder
     */

    public ExactLockConflictErrorBuilder currency(final String currency) {
        this.currency = currency;
        return this;
    }

    /**
     *  <p>Country code of the geographic location.</p>
     * @param country value to be set
     * @return Builder
     */

    public ExactLockConflictErrorBuilder country(@Nullable final String country) {
        this.country = country;
        return this;
    }

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:CustomerGroup" rel="nofollow">CustomerGroup</a> for which the Standalone Price is valid.</p>
     * @param builder function to build the customerGroup value
     * @return Builder
     */

    public ExactLockConflictErrorBuilder customerGroup(
            Function<com.commercetools.api.models.customer_group.CustomerGroupResourceIdentifierBuilder, com.commercetools.api.models.customer_group.CustomerGroupResourceIdentifierBuilder> builder) {
        this.customerGroup = builder
                .apply(com.commercetools.api.models.customer_group.CustomerGroupResourceIdentifierBuilder.of())
                .build();
        return this;
    }

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:CustomerGroup" rel="nofollow">CustomerGroup</a> for which the Standalone Price is valid.</p>
     * @param builder function to build the customerGroup value
     * @return Builder
     */

    public ExactLockConflictErrorBuilder withCustomerGroup(
            Function<com.commercetools.api.models.customer_group.CustomerGroupResourceIdentifierBuilder, com.commercetools.api.models.customer_group.CustomerGroupResourceIdentifier> builder) {
        this.customerGroup = builder
                .apply(com.commercetools.api.models.customer_group.CustomerGroupResourceIdentifierBuilder.of());
        return this;
    }

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:CustomerGroup" rel="nofollow">CustomerGroup</a> for which the Standalone Price is valid.</p>
     * @param customerGroup value to be set
     * @return Builder
     */

    public ExactLockConflictErrorBuilder customerGroup(
            @Nullable final com.commercetools.api.models.customer_group.CustomerGroupResourceIdentifier customerGroup) {
        this.customerGroup = customerGroup;
        return this;
    }

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:Channel" rel="nofollow">Channel</a> for which the Standalone Price is valid.</p>
     * @param builder function to build the channel value
     * @return Builder
     */

    public ExactLockConflictErrorBuilder channel(
            Function<com.commercetools.api.models.channel.ChannelResourceIdentifierBuilder, com.commercetools.api.models.channel.ChannelResourceIdentifierBuilder> builder) {
        this.channel = builder.apply(com.commercetools.api.models.channel.ChannelResourceIdentifierBuilder.of())
                .build();
        return this;
    }

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:Channel" rel="nofollow">Channel</a> for which the Standalone Price is valid.</p>
     * @param builder function to build the channel value
     * @return Builder
     */

    public ExactLockConflictErrorBuilder withChannel(
            Function<com.commercetools.api.models.channel.ChannelResourceIdentifierBuilder, com.commercetools.api.models.channel.ChannelResourceIdentifier> builder) {
        this.channel = builder.apply(com.commercetools.api.models.channel.ChannelResourceIdentifierBuilder.of());
        return this;
    }

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:Channel" rel="nofollow">Channel</a> for which the Standalone Price is valid.</p>
     * @param channel value to be set
     * @return Builder
     */

    public ExactLockConflictErrorBuilder channel(
            @Nullable final com.commercetools.api.models.channel.ChannelResourceIdentifier channel) {
        this.channel = channel;
        return this;
    }

    /**
     *  <p>Date and time (UTC) from which the Standalone Price is valid.</p>
     * @param validFrom value to be set
     * @return Builder
     */

    public ExactLockConflictErrorBuilder validFrom(@Nullable final java.time.ZonedDateTime validFrom) {
        this.validFrom = validFrom;
        return this;
    }

    /**
     *  <p>Date and time (UTC) until which the Standalone Price is valid.</p>
     * @param validUntil value to be set
     * @return Builder
     */

    public ExactLockConflictErrorBuilder validUntil(@Nullable final java.time.ZonedDateTime validUntil) {
        this.validUntil = validUntil;
        return this;
    }

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:RecurrencePolicy" rel="nofollow">RecurrencePolicy</a> that applies to the Standalone Price.</p>
     * @param builder function to build the recurrencePolicy value
     * @return Builder
     */

    public ExactLockConflictErrorBuilder recurrencePolicy(
            Function<com.commercetools.api.models.recurrence_policy.RecurrencePolicyReferenceBuilder, com.commercetools.api.models.recurrence_policy.RecurrencePolicyReferenceBuilder> builder) {
        this.recurrencePolicy = builder
                .apply(com.commercetools.api.models.recurrence_policy.RecurrencePolicyReferenceBuilder.of())
                .build();
        return this;
    }

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:RecurrencePolicy" rel="nofollow">RecurrencePolicy</a> that applies to the Standalone Price.</p>
     * @param builder function to build the recurrencePolicy value
     * @return Builder
     */

    public ExactLockConflictErrorBuilder withRecurrencePolicy(
            Function<com.commercetools.api.models.recurrence_policy.RecurrencePolicyReferenceBuilder, com.commercetools.api.models.recurrence_policy.RecurrencePolicyReference> builder) {
        this.recurrencePolicy = builder
                .apply(com.commercetools.api.models.recurrence_policy.RecurrencePolicyReferenceBuilder.of());
        return this;
    }

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:RecurrencePolicy" rel="nofollow">RecurrencePolicy</a> that applies to the Standalone Price.</p>
     * @param recurrencePolicy value to be set
     * @return Builder
     */

    public ExactLockConflictErrorBuilder recurrencePolicy(
            @Nullable final com.commercetools.api.models.recurrence_policy.RecurrencePolicyReference recurrencePolicy) {
        this.recurrencePolicy = recurrencePolicy;
        return this;
    }

    /**
     *  <p><code>"Modification already in progress for the combination of SKU and price scope fields."</code></p>
     * @return message
     */

    public String getMessage() {
        return this.message;
    }

    /**
     *  <p>Error-specific additional fields.</p>
     * @return pattern properties
     */

    public Map<String, java.lang.Object> getValues() {
        return this.values;
    }

    /**
     *  <p>SKU for which the modification conflict occurred.</p>
     * @return sku
     */

    public String getSku() {
        return this.sku;
    }

    /**
     *  <p>Currency code of the Standalone Price.</p>
     * @return currency
     */

    public String getCurrency() {
        return this.currency;
    }

    /**
     *  <p>Country code of the geographic location.</p>
     * @return country
     */

    @Nullable
    public String getCountry() {
        return this.country;
    }

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:CustomerGroup" rel="nofollow">CustomerGroup</a> for which the Standalone Price is valid.</p>
     * @return customerGroup
     */

    @Nullable
    public com.commercetools.api.models.customer_group.CustomerGroupResourceIdentifier getCustomerGroup() {
        return this.customerGroup;
    }

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:Channel" rel="nofollow">Channel</a> for which the Standalone Price is valid.</p>
     * @return channel
     */

    @Nullable
    public com.commercetools.api.models.channel.ChannelResourceIdentifier getChannel() {
        return this.channel;
    }

    /**
     *  <p>Date and time (UTC) from which the Standalone Price is valid.</p>
     * @return validFrom
     */

    @Nullable
    public java.time.ZonedDateTime getValidFrom() {
        return this.validFrom;
    }

    /**
     *  <p>Date and time (UTC) until which the Standalone Price is valid.</p>
     * @return validUntil
     */

    @Nullable
    public java.time.ZonedDateTime getValidUntil() {
        return this.validUntil;
    }

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:RecurrencePolicy" rel="nofollow">RecurrencePolicy</a> that applies to the Standalone Price.</p>
     * @return recurrencePolicy
     */

    @Nullable
    public com.commercetools.api.models.recurrence_policy.RecurrencePolicyReference getRecurrencePolicy() {
        return this.recurrencePolicy;
    }

    /**
     * builds ExactLockConflictError with checking for non-null required values
     * @return ExactLockConflictError
     */
    public ExactLockConflictError build() {
        Objects.requireNonNull(message, ExactLockConflictError.class + ": message is missing");
        Objects.requireNonNull(sku, ExactLockConflictError.class + ": sku is missing");
        Objects.requireNonNull(currency, ExactLockConflictError.class + ": currency is missing");
        return new ExactLockConflictErrorImpl(message, values, sku, currency, country, customerGroup, channel,
            validFrom, validUntil, recurrencePolicy);
    }

    /**
     * builds ExactLockConflictError without checking for non-null required values
     * @return ExactLockConflictError
     */
    public ExactLockConflictError buildUnchecked() {
        return new ExactLockConflictErrorImpl(message, values, sku, currency, country, customerGroup, channel,
            validFrom, validUntil, recurrencePolicy);
    }

    /**
     * factory method for an instance of ExactLockConflictErrorBuilder
     * @return builder
     */
    public static ExactLockConflictErrorBuilder of() {
        return new ExactLockConflictErrorBuilder();
    }

    /**
     * create builder for ExactLockConflictError instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ExactLockConflictErrorBuilder of(final ExactLockConflictError template) {
        ExactLockConflictErrorBuilder builder = new ExactLockConflictErrorBuilder();
        builder.message = template.getMessage();
        builder.values = template.values();
        builder.sku = template.getSku();
        builder.currency = template.getCurrency();
        builder.country = template.getCountry();
        builder.customerGroup = template.getCustomerGroup();
        builder.channel = template.getChannel();
        builder.validFrom = template.getValidFrom();
        builder.validUntil = template.getValidUntil();
        builder.recurrencePolicy = template.getRecurrencePolicy();
        return builder;
    }

}
