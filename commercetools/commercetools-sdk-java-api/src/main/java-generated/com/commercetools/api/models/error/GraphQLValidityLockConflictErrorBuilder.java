
package com.commercetools.api.models.error;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * GraphQLValidityLockConflictErrorBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     GraphQLValidityLockConflictError graphQLValidityLockConflictError = GraphQLValidityLockConflictError.builder()
 *             .sku("{sku}")
 *             .currency("{currency}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class GraphQLValidityLockConflictErrorBuilder implements Builder<GraphQLValidityLockConflictError> {

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
     *  <p>Error-specific additional fields.</p>
     * @param values properties to be set
     * @return Builder
     */

    public GraphQLValidityLockConflictErrorBuilder values(final Map<String, java.lang.Object> values) {
        this.values = values;
        return this;
    }

    /**
     *  <p>Error-specific additional fields.</p>
     * @param key property name
     * @param value property value
     * @return Builder
     */

    public GraphQLValidityLockConflictErrorBuilder addValue(final String key, final java.lang.Object value) {
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

    public GraphQLValidityLockConflictErrorBuilder sku(final String sku) {
        this.sku = sku;
        return this;
    }

    /**
     *  <p>Currency code of the Standalone Price.</p>
     * @param currency value to be set
     * @return Builder
     */

    public GraphQLValidityLockConflictErrorBuilder currency(final String currency) {
        this.currency = currency;
        return this;
    }

    /**
     *  <p>Country code of the geographic location.</p>
     * @param country value to be set
     * @return Builder
     */

    public GraphQLValidityLockConflictErrorBuilder country(@Nullable final String country) {
        this.country = country;
        return this;
    }

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:CustomerGroup" rel="nofollow">CustomerGroup</a> for which the Standalone Price is valid.</p>
     * @param builder function to build the customerGroup value
     * @return Builder
     */

    public GraphQLValidityLockConflictErrorBuilder customerGroup(
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

    public GraphQLValidityLockConflictErrorBuilder withCustomerGroup(
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

    public GraphQLValidityLockConflictErrorBuilder customerGroup(
            @Nullable final com.commercetools.api.models.customer_group.CustomerGroupResourceIdentifier customerGroup) {
        this.customerGroup = customerGroup;
        return this;
    }

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:Channel" rel="nofollow">Channel</a> for which the Standalone Price is valid.</p>
     * @param builder function to build the channel value
     * @return Builder
     */

    public GraphQLValidityLockConflictErrorBuilder channel(
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

    public GraphQLValidityLockConflictErrorBuilder withChannel(
            Function<com.commercetools.api.models.channel.ChannelResourceIdentifierBuilder, com.commercetools.api.models.channel.ChannelResourceIdentifier> builder) {
        this.channel = builder.apply(com.commercetools.api.models.channel.ChannelResourceIdentifierBuilder.of());
        return this;
    }

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:Channel" rel="nofollow">Channel</a> for which the Standalone Price is valid.</p>
     * @param channel value to be set
     * @return Builder
     */

    public GraphQLValidityLockConflictErrorBuilder channel(
            @Nullable final com.commercetools.api.models.channel.ChannelResourceIdentifier channel) {
        this.channel = channel;
        return this;
    }

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:RecurrencePolicy" rel="nofollow">RecurrencePolicy</a> for which the Standalone Price is valid.</p>
     * @param builder function to build the recurrencePolicy value
     * @return Builder
     */

    public GraphQLValidityLockConflictErrorBuilder recurrencePolicy(
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

    public GraphQLValidityLockConflictErrorBuilder withRecurrencePolicy(
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

    public GraphQLValidityLockConflictErrorBuilder recurrencePolicy(
            @Nullable final com.commercetools.api.models.recurrence_policy.RecurrencePolicyResourceIdentifier recurrencePolicy) {
        this.recurrencePolicy = recurrencePolicy;
        return this;
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
     * builds GraphQLValidityLockConflictError with checking for non-null required values
     * @return GraphQLValidityLockConflictError
     */
    public GraphQLValidityLockConflictError build() {
        Objects.requireNonNull(sku, GraphQLValidityLockConflictError.class + ": sku is missing");
        Objects.requireNonNull(currency, GraphQLValidityLockConflictError.class + ": currency is missing");
        return new GraphQLValidityLockConflictErrorImpl(values, sku, currency, country, customerGroup, channel,
            recurrencePolicy);
    }

    /**
     * builds GraphQLValidityLockConflictError without checking for non-null required values
     * @return GraphQLValidityLockConflictError
     */
    public GraphQLValidityLockConflictError buildUnchecked() {
        return new GraphQLValidityLockConflictErrorImpl(values, sku, currency, country, customerGroup, channel,
            recurrencePolicy);
    }

    /**
     * factory method for an instance of GraphQLValidityLockConflictErrorBuilder
     * @return builder
     */
    public static GraphQLValidityLockConflictErrorBuilder of() {
        return new GraphQLValidityLockConflictErrorBuilder();
    }

    /**
     * create builder for GraphQLValidityLockConflictError instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static GraphQLValidityLockConflictErrorBuilder of(final GraphQLValidityLockConflictError template) {
        GraphQLValidityLockConflictErrorBuilder builder = new GraphQLValidityLockConflictErrorBuilder();
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
