
package com.commercetools.api.models.error;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * GraphQLOverlappingStandalonePriceValidityErrorBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     GraphQLOverlappingStandalonePriceValidityError graphQLOverlappingStandalonePriceValidityError = GraphQLOverlappingStandalonePriceValidityError.builder()
 *             .conflictingStandalonePrice(conflictingStandalonePriceBuilder -> conflictingStandalonePriceBuilder)
 *             .sku("{sku}")
 *             .currency("{currency}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class GraphQLOverlappingStandalonePriceValidityErrorBuilder
        implements Builder<GraphQLOverlappingStandalonePriceValidityError> {

    private Map<String, java.lang.Object> values = new HashMap<>();

    private com.commercetools.api.models.standalone_price.StandalonePriceReference conflictingStandalonePrice;

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
    private java.time.ZonedDateTime conflictingValidFrom;

    @Nullable
    private java.time.ZonedDateTime conflictingValidUntil;

    /**
     *  <p>Error-specific additional fields.</p>
     * @param values properties to be set
     * @return Builder
     */

    public GraphQLOverlappingStandalonePriceValidityErrorBuilder values(final Map<String, java.lang.Object> values) {
        this.values = values;
        return this;
    }

    /**
     *  <p>Error-specific additional fields.</p>
     * @param key property name
     * @param value property value
     * @return Builder
     */

    public GraphQLOverlappingStandalonePriceValidityErrorBuilder addValue(final String key,
            final java.lang.Object value) {
        if (this.values == null) {
            values = new HashMap<>();
        }
        values.put(key, value);
        return this;
    }

    /**
     *  <p>Reference to the conflicting Standalone Price.</p>
     * @param builder function to build the conflictingStandalonePrice value
     * @return Builder
     */

    public GraphQLOverlappingStandalonePriceValidityErrorBuilder conflictingStandalonePrice(
            Function<com.commercetools.api.models.standalone_price.StandalonePriceReferenceBuilder, com.commercetools.api.models.standalone_price.StandalonePriceReferenceBuilder> builder) {
        this.conflictingStandalonePrice = builder
                .apply(com.commercetools.api.models.standalone_price.StandalonePriceReferenceBuilder.of())
                .build();
        return this;
    }

    /**
     *  <p>Reference to the conflicting Standalone Price.</p>
     * @param builder function to build the conflictingStandalonePrice value
     * @return Builder
     */

    public GraphQLOverlappingStandalonePriceValidityErrorBuilder withConflictingStandalonePrice(
            Function<com.commercetools.api.models.standalone_price.StandalonePriceReferenceBuilder, com.commercetools.api.models.standalone_price.StandalonePriceReference> builder) {
        this.conflictingStandalonePrice = builder
                .apply(com.commercetools.api.models.standalone_price.StandalonePriceReferenceBuilder.of());
        return this;
    }

    /**
     *  <p>Reference to the conflicting Standalone Price.</p>
     * @param conflictingStandalonePrice value to be set
     * @return Builder
     */

    public GraphQLOverlappingStandalonePriceValidityErrorBuilder conflictingStandalonePrice(
            final com.commercetools.api.models.standalone_price.StandalonePriceReference conflictingStandalonePrice) {
        this.conflictingStandalonePrice = conflictingStandalonePrice;
        return this;
    }

    /**
     *  <p>SKU of the <a href="https://docs.commercetools.com/apis/ctp:api:type:ProductVariant" rel="nofollow">ProductVariant</a> to which the conflicting Standalone Price is associated.</p>
     * @param sku value to be set
     * @return Builder
     */

    public GraphQLOverlappingStandalonePriceValidityErrorBuilder sku(final String sku) {
        this.sku = sku;
        return this;
    }

    /**
     *  <p>Currency code of the country.</p>
     * @param currency value to be set
     * @return Builder
     */

    public GraphQLOverlappingStandalonePriceValidityErrorBuilder currency(final String currency) {
        this.currency = currency;
        return this;
    }

    /**
     *  <p>Country code of the geographic location.</p>
     * @param country value to be set
     * @return Builder
     */

    public GraphQLOverlappingStandalonePriceValidityErrorBuilder country(@Nullable final String country) {
        this.country = country;
        return this;
    }

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:CustomerGroup" rel="nofollow">CustomerGroup</a> for which the Standalone Price is valid.</p>
     * @param builder function to build the customerGroup value
     * @return Builder
     */

    public GraphQLOverlappingStandalonePriceValidityErrorBuilder customerGroup(
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

    public GraphQLOverlappingStandalonePriceValidityErrorBuilder withCustomerGroup(
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

    public GraphQLOverlappingStandalonePriceValidityErrorBuilder customerGroup(
            @Nullable final com.commercetools.api.models.customer_group.CustomerGroupResourceIdentifier customerGroup) {
        this.customerGroup = customerGroup;
        return this;
    }

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:Channel" rel="nofollow">Channel</a> for which the Standalone Price is valid.</p>
     * @param builder function to build the channel value
     * @return Builder
     */

    public GraphQLOverlappingStandalonePriceValidityErrorBuilder channel(
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

    public GraphQLOverlappingStandalonePriceValidityErrorBuilder withChannel(
            Function<com.commercetools.api.models.channel.ChannelResourceIdentifierBuilder, com.commercetools.api.models.channel.ChannelResourceIdentifier> builder) {
        this.channel = builder.apply(com.commercetools.api.models.channel.ChannelResourceIdentifierBuilder.of());
        return this;
    }

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:Channel" rel="nofollow">Channel</a> for which the Standalone Price is valid.</p>
     * @param channel value to be set
     * @return Builder
     */

    public GraphQLOverlappingStandalonePriceValidityErrorBuilder channel(
            @Nullable final com.commercetools.api.models.channel.ChannelResourceIdentifier channel) {
        this.channel = channel;
        return this;
    }

    /**
     *  <p>Date and time (UTC) from which the Standalone Price is valid.</p>
     * @param validFrom value to be set
     * @return Builder
     */

    public GraphQLOverlappingStandalonePriceValidityErrorBuilder validFrom(
            @Nullable final java.time.ZonedDateTime validFrom) {
        this.validFrom = validFrom;
        return this;
    }

    /**
     *  <p>Date and time (UTC) until which the Standalone Price is valid.</p>
     * @param validUntil value to be set
     * @return Builder
     */

    public GraphQLOverlappingStandalonePriceValidityErrorBuilder validUntil(
            @Nullable final java.time.ZonedDateTime validUntil) {
        this.validUntil = validUntil;
        return this;
    }

    /**
     *  <p>Date and time (UTC) from which the conflicting Standalone Price is valid.</p>
     * @param conflictingValidFrom value to be set
     * @return Builder
     */

    public GraphQLOverlappingStandalonePriceValidityErrorBuilder conflictingValidFrom(
            @Nullable final java.time.ZonedDateTime conflictingValidFrom) {
        this.conflictingValidFrom = conflictingValidFrom;
        return this;
    }

    /**
     *  <p>Date and time (UTC) until which the conflicting Standalone Price is valid.</p>
     * @param conflictingValidUntil value to be set
     * @return Builder
     */

    public GraphQLOverlappingStandalonePriceValidityErrorBuilder conflictingValidUntil(
            @Nullable final java.time.ZonedDateTime conflictingValidUntil) {
        this.conflictingValidUntil = conflictingValidUntil;
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
     *  <p>Reference to the conflicting Standalone Price.</p>
     * @return conflictingStandalonePrice
     */

    public com.commercetools.api.models.standalone_price.StandalonePriceReference getConflictingStandalonePrice() {
        return this.conflictingStandalonePrice;
    }

    /**
     *  <p>SKU of the <a href="https://docs.commercetools.com/apis/ctp:api:type:ProductVariant" rel="nofollow">ProductVariant</a> to which the conflicting Standalone Price is associated.</p>
     * @return sku
     */

    public String getSku() {
        return this.sku;
    }

    /**
     *  <p>Currency code of the country.</p>
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
     *  <p>Date and time (UTC) from which the conflicting Standalone Price is valid.</p>
     * @return conflictingValidFrom
     */

    @Nullable
    public java.time.ZonedDateTime getConflictingValidFrom() {
        return this.conflictingValidFrom;
    }

    /**
     *  <p>Date and time (UTC) until which the conflicting Standalone Price is valid.</p>
     * @return conflictingValidUntil
     */

    @Nullable
    public java.time.ZonedDateTime getConflictingValidUntil() {
        return this.conflictingValidUntil;
    }

    /**
     * builds GraphQLOverlappingStandalonePriceValidityError with checking for non-null required values
     * @return GraphQLOverlappingStandalonePriceValidityError
     */
    public GraphQLOverlappingStandalonePriceValidityError build() {
        Objects.requireNonNull(conflictingStandalonePrice,
            GraphQLOverlappingStandalonePriceValidityError.class + ": conflictingStandalonePrice is missing");
        Objects.requireNonNull(sku, GraphQLOverlappingStandalonePriceValidityError.class + ": sku is missing");
        Objects.requireNonNull(currency,
            GraphQLOverlappingStandalonePriceValidityError.class + ": currency is missing");
        return new GraphQLOverlappingStandalonePriceValidityErrorImpl(values, conflictingStandalonePrice, sku, currency,
            country, customerGroup, channel, validFrom, validUntil, conflictingValidFrom, conflictingValidUntil);
    }

    /**
     * builds GraphQLOverlappingStandalonePriceValidityError without checking for non-null required values
     * @return GraphQLOverlappingStandalonePriceValidityError
     */
    public GraphQLOverlappingStandalonePriceValidityError buildUnchecked() {
        return new GraphQLOverlappingStandalonePriceValidityErrorImpl(values, conflictingStandalonePrice, sku, currency,
            country, customerGroup, channel, validFrom, validUntil, conflictingValidFrom, conflictingValidUntil);
    }

    /**
     * factory method for an instance of GraphQLOverlappingStandalonePriceValidityErrorBuilder
     * @return builder
     */
    public static GraphQLOverlappingStandalonePriceValidityErrorBuilder of() {
        return new GraphQLOverlappingStandalonePriceValidityErrorBuilder();
    }

    /**
     * create builder for GraphQLOverlappingStandalonePriceValidityError instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static GraphQLOverlappingStandalonePriceValidityErrorBuilder of(
            final GraphQLOverlappingStandalonePriceValidityError template) {
        GraphQLOverlappingStandalonePriceValidityErrorBuilder builder = new GraphQLOverlappingStandalonePriceValidityErrorBuilder();
        builder.values = template.values();
        builder.conflictingStandalonePrice = template.getConflictingStandalonePrice();
        builder.sku = template.getSku();
        builder.currency = template.getCurrency();
        builder.country = template.getCountry();
        builder.customerGroup = template.getCustomerGroup();
        builder.channel = template.getChannel();
        builder.validFrom = template.getValidFrom();
        builder.validUntil = template.getValidUntil();
        builder.conflictingValidFrom = template.getConflictingValidFrom();
        builder.conflictingValidUntil = template.getConflictingValidUntil();
        return builder;
    }

}
