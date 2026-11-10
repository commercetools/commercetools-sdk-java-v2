
package com.commercetools.api.models.error;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ValidityLockConflictErrorBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ValidityLockConflictError validityLockConflictError = ValidityLockConflictError.builder()
 *             .message("{message}")
 *             .sku("{sku}")
 *             .currency("{currency}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ValidityLockConflictErrorBuilder implements Builder<ValidityLockConflictError> {

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
    private com.commercetools.api.models.recurrence_policy.RecurrencePolicyResourceIdentifier recurrencePolicy;

    /**
     *  <p><code>"Modification already in progress for the combination of SKU, price scope fields (but potentially different validity period). Please retry after the current operation completes."</code></p>
     * @param message value to be set
     * @return Builder
     */

    public ValidityLockConflictErrorBuilder message(final String message) {
        this.message = message;
        return this;
    }

    /**
     *  <p>Error-specific additional fields.</p>
     * @param values properties to be set
     * @return Builder
     */

    public ValidityLockConflictErrorBuilder values(final Map<String, java.lang.Object> values) {
        this.values = values;
        return this;
    }

    /**
     *  <p>Error-specific additional fields.</p>
     * @param key property name
     * @param value property value
     * @return Builder
     */

    public ValidityLockConflictErrorBuilder addValue(final String key, final java.lang.Object value) {
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

    public ValidityLockConflictErrorBuilder sku(final String sku) {
        this.sku = sku;
        return this;
    }

    /**
     *  <p>Currency code of the Standalone Price.</p>
     * @param currency value to be set
     * @return Builder
     */

    public ValidityLockConflictErrorBuilder currency(final String currency) {
        this.currency = currency;
        return this;
    }

    /**
     *  <p>Country code of the geographic location.</p>
     * @param country value to be set
     * @return Builder
     */

    public ValidityLockConflictErrorBuilder country(@Nullable final String country) {
        this.country = country;
        return this;
    }

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:CustomerGroup" rel="nofollow">CustomerGroup</a> for which the Standalone Price is valid.</p>
     * @param builder function to build the customerGroup value
     * @return Builder
     */

    public ValidityLockConflictErrorBuilder customerGroup(
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

    public ValidityLockConflictErrorBuilder withCustomerGroup(
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

    public ValidityLockConflictErrorBuilder customerGroup(
            @Nullable final com.commercetools.api.models.customer_group.CustomerGroupResourceIdentifier customerGroup) {
        this.customerGroup = customerGroup;
        return this;
    }

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:Channel" rel="nofollow">Channel</a> for which the Standalone Price is valid.</p>
     * @param builder function to build the channel value
     * @return Builder
     */

    public ValidityLockConflictErrorBuilder channel(
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

    public ValidityLockConflictErrorBuilder withChannel(
            Function<com.commercetools.api.models.channel.ChannelResourceIdentifierBuilder, com.commercetools.api.models.channel.ChannelResourceIdentifier> builder) {
        this.channel = builder.apply(com.commercetools.api.models.channel.ChannelResourceIdentifierBuilder.of());
        return this;
    }

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:Channel" rel="nofollow">Channel</a> for which the Standalone Price is valid.</p>
     * @param channel value to be set
     * @return Builder
     */

    public ValidityLockConflictErrorBuilder channel(
            @Nullable final com.commercetools.api.models.channel.ChannelResourceIdentifier channel) {
        this.channel = channel;
        return this;
    }

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:RecurrencePolicy" rel="nofollow">RecurrencePolicy</a> for which the Standalone Price is valid.</p>
     * @param builder function to build the recurrencePolicy value
     * @return Builder
     */

    public ValidityLockConflictErrorBuilder recurrencePolicy(
            Function<com.commercetools.api.models.recurrence_policy.RecurrencePolicyResourceIdentifierBuilder, com.commercetools.api.models.recurrence_policy.RecurrencePolicyResourceIdentifierBuilder> builder) {
        this.recurrencePolicy = builder
                .apply(com.commercetools.api.models.recurrence_policy.RecurrencePolicyResourceIdentifierBuilder.of())
                .build();
        return this;
    }

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:RecurrencePolicy" rel="nofollow">RecurrencePolicy</a> for which the Standalone Price is valid.</p>
     * @param builder function to build the recurrencePolicy value
     * @return Builder
     */

    public ValidityLockConflictErrorBuilder withRecurrencePolicy(
            Function<com.commercetools.api.models.recurrence_policy.RecurrencePolicyResourceIdentifierBuilder, com.commercetools.api.models.recurrence_policy.RecurrencePolicyResourceIdentifier> builder) {
        this.recurrencePolicy = builder
                .apply(com.commercetools.api.models.recurrence_policy.RecurrencePolicyResourceIdentifierBuilder.of());
        return this;
    }

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:RecurrencePolicy" rel="nofollow">RecurrencePolicy</a> for which the Standalone Price is valid.</p>
     * @param recurrencePolicy value to be set
     * @return Builder
     */

    public ValidityLockConflictErrorBuilder recurrencePolicy(
            @Nullable final com.commercetools.api.models.recurrence_policy.RecurrencePolicyResourceIdentifier recurrencePolicy) {
        this.recurrencePolicy = recurrencePolicy;
        return this;
    }

    /**
     *  <p><code>"Modification already in progress for the combination of SKU, price scope fields (but potentially different validity period). Please retry after the current operation completes."</code></p>
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
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:RecurrencePolicy" rel="nofollow">RecurrencePolicy</a> for which the Standalone Price is valid.</p>
     * @return recurrencePolicy
     */

    @Nullable
    public com.commercetools.api.models.recurrence_policy.RecurrencePolicyResourceIdentifier getRecurrencePolicy() {
        return this.recurrencePolicy;
    }

    /**
     * builds ValidityLockConflictError with checking for non-null required values
     * @return ValidityLockConflictError
     */
    public ValidityLockConflictError build() {
        Objects.requireNonNull(message, ValidityLockConflictError.class + ": message is missing");
        Objects.requireNonNull(sku, ValidityLockConflictError.class + ": sku is missing");
        Objects.requireNonNull(currency, ValidityLockConflictError.class + ": currency is missing");
        return new ValidityLockConflictErrorImpl(message, values, sku, currency, country, customerGroup, channel,
            recurrencePolicy);
    }

    /**
     * builds ValidityLockConflictError without checking for non-null required values
     * @return ValidityLockConflictError
     */
    public ValidityLockConflictError buildUnchecked() {
        return new ValidityLockConflictErrorImpl(message, values, sku, currency, country, customerGroup, channel,
            recurrencePolicy);
    }

    /**
     * factory method for an instance of ValidityLockConflictErrorBuilder
     * @return builder
     */
    public static ValidityLockConflictErrorBuilder of() {
        return new ValidityLockConflictErrorBuilder();
    }

    /**
     * create builder for ValidityLockConflictError instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ValidityLockConflictErrorBuilder of(final ValidityLockConflictError template) {
        ValidityLockConflictErrorBuilder builder = new ValidityLockConflictErrorBuilder();
        builder.message = template.getMessage();
        builder.values = template.values();
        builder.sku = template.getSku();
        builder.currency = template.getCurrency();
        builder.country = template.getCountry();
        builder.customerGroup = template.getCustomerGroup();
        builder.channel = template.getChannel();
        builder.recurrencePolicy = template.getRecurrencePolicy();
        return builder;
    }

}
