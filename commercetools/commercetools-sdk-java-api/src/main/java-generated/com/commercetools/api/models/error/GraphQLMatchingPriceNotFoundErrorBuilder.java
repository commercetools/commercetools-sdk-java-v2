
package com.commercetools.api.models.error;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * GraphQLMatchingPriceNotFoundErrorBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     GraphQLMatchingPriceNotFoundError graphQLMatchingPriceNotFoundError = GraphQLMatchingPriceNotFoundError.builder()
 *             .productId("{productId}")
 *             .variantId(1)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class GraphQLMatchingPriceNotFoundErrorBuilder implements Builder<GraphQLMatchingPriceNotFoundError> {

    private Map<String, java.lang.Object> values = new HashMap<>();

    private String productId;

    private Integer variantId;

    @Nullable
    private String currency;

    @Nullable
    private String country;

    @Nullable
    private com.commercetools.api.models.customer_group.CustomerGroupReference customerGroup;

    @Nullable
    private com.commercetools.api.models.channel.ChannelReference channel;

    /**
     *  <p>Error-specific additional fields.</p>
     * @param values properties to be set
     * @return Builder
     */

    public GraphQLMatchingPriceNotFoundErrorBuilder values(final Map<String, java.lang.Object> values) {
        this.values = values;
        return this;
    }

    /**
     *  <p>Error-specific additional fields.</p>
     * @param key property name
     * @param value property value
     * @return Builder
     */

    public GraphQLMatchingPriceNotFoundErrorBuilder addValue(final String key, final java.lang.Object value) {
        if (this.values == null) {
            values = new HashMap<>();
        }
        values.put(key, value);
        return this;
    }

    /**
     *  <p>Unique identifier of a Product.</p>
     * @param productId value to be set
     * @return Builder
     */

    public GraphQLMatchingPriceNotFoundErrorBuilder productId(final String productId) {
        this.productId = productId;
        return this;
    }

    /**
     *  <p>Unique identifier of a ProductVariant in the Product.</p>
     * @param variantId value to be set
     * @return Builder
     */

    public GraphQLMatchingPriceNotFoundErrorBuilder variantId(final Integer variantId) {
        this.variantId = variantId;
        return this;
    }

    /**
     *  <p>Currency code of the country.</p>
     * @param currency value to be set
     * @return Builder
     */

    public GraphQLMatchingPriceNotFoundErrorBuilder currency(@Nullable final String currency) {
        this.currency = currency;
        return this;
    }

    /**
     *  <p>Country code of the geographic location.</p>
     * @param country value to be set
     * @return Builder
     */

    public GraphQLMatchingPriceNotFoundErrorBuilder country(@Nullable final String country) {
        this.country = country;
        return this;
    }

    /**
     *  <p>Customer Group associated with the Price.</p>
     * @param builder function to build the customerGroup value
     * @return Builder
     */

    public GraphQLMatchingPriceNotFoundErrorBuilder customerGroup(
            Function<com.commercetools.api.models.customer_group.CustomerGroupReferenceBuilder, com.commercetools.api.models.customer_group.CustomerGroupReferenceBuilder> builder) {
        this.customerGroup = builder
                .apply(com.commercetools.api.models.customer_group.CustomerGroupReferenceBuilder.of())
                .build();
        return this;
    }

    /**
     *  <p>Customer Group associated with the Price.</p>
     * @param builder function to build the customerGroup value
     * @return Builder
     */

    public GraphQLMatchingPriceNotFoundErrorBuilder withCustomerGroup(
            Function<com.commercetools.api.models.customer_group.CustomerGroupReferenceBuilder, com.commercetools.api.models.customer_group.CustomerGroupReference> builder) {
        this.customerGroup = builder
                .apply(com.commercetools.api.models.customer_group.CustomerGroupReferenceBuilder.of());
        return this;
    }

    /**
     *  <p>Customer Group associated with the Price.</p>
     * @param customerGroup value to be set
     * @return Builder
     */

    public GraphQLMatchingPriceNotFoundErrorBuilder customerGroup(
            @Nullable final com.commercetools.api.models.customer_group.CustomerGroupReference customerGroup) {
        this.customerGroup = customerGroup;
        return this;
    }

    /**
     *  <p>Channel associated with the Price.</p>
     * @param builder function to build the channel value
     * @return Builder
     */

    public GraphQLMatchingPriceNotFoundErrorBuilder channel(
            Function<com.commercetools.api.models.channel.ChannelReferenceBuilder, com.commercetools.api.models.channel.ChannelReferenceBuilder> builder) {
        this.channel = builder.apply(com.commercetools.api.models.channel.ChannelReferenceBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Channel associated with the Price.</p>
     * @param builder function to build the channel value
     * @return Builder
     */

    public GraphQLMatchingPriceNotFoundErrorBuilder withChannel(
            Function<com.commercetools.api.models.channel.ChannelReferenceBuilder, com.commercetools.api.models.channel.ChannelReference> builder) {
        this.channel = builder.apply(com.commercetools.api.models.channel.ChannelReferenceBuilder.of());
        return this;
    }

    /**
     *  <p>Channel associated with the Price.</p>
     * @param channel value to be set
     * @return Builder
     */

    public GraphQLMatchingPriceNotFoundErrorBuilder channel(
            @Nullable final com.commercetools.api.models.channel.ChannelReference channel) {
        this.channel = channel;
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
     *  <p>Unique identifier of a Product.</p>
     * @return productId
     */

    public String getProductId() {
        return this.productId;
    }

    /**
     *  <p>Unique identifier of a ProductVariant in the Product.</p>
     * @return variantId
     */

    public Integer getVariantId() {
        return this.variantId;
    }

    /**
     *  <p>Currency code of the country.</p>
     * @return currency
     */

    @Nullable
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
     *  <p>Customer Group associated with the Price.</p>
     * @return customerGroup
     */

    @Nullable
    public com.commercetools.api.models.customer_group.CustomerGroupReference getCustomerGroup() {
        return this.customerGroup;
    }

    /**
     *  <p>Channel associated with the Price.</p>
     * @return channel
     */

    @Nullable
    public com.commercetools.api.models.channel.ChannelReference getChannel() {
        return this.channel;
    }

    /**
     * builds GraphQLMatchingPriceNotFoundError with checking for non-null required values
     * @return GraphQLMatchingPriceNotFoundError
     */
    public GraphQLMatchingPriceNotFoundError build() {
        Objects.requireNonNull(productId, GraphQLMatchingPriceNotFoundError.class + ": productId is missing");
        Objects.requireNonNull(variantId, GraphQLMatchingPriceNotFoundError.class + ": variantId is missing");
        return new GraphQLMatchingPriceNotFoundErrorImpl(values, productId, variantId, currency, country, customerGroup,
            channel);
    }

    /**
     * builds GraphQLMatchingPriceNotFoundError without checking for non-null required values
     * @return GraphQLMatchingPriceNotFoundError
     */
    public GraphQLMatchingPriceNotFoundError buildUnchecked() {
        return new GraphQLMatchingPriceNotFoundErrorImpl(values, productId, variantId, currency, country, customerGroup,
            channel);
    }

    /**
     * factory method for an instance of GraphQLMatchingPriceNotFoundErrorBuilder
     * @return builder
     */
    public static GraphQLMatchingPriceNotFoundErrorBuilder of() {
        return new GraphQLMatchingPriceNotFoundErrorBuilder();
    }

    /**
     * create builder for GraphQLMatchingPriceNotFoundError instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static GraphQLMatchingPriceNotFoundErrorBuilder of(final GraphQLMatchingPriceNotFoundError template) {
        GraphQLMatchingPriceNotFoundErrorBuilder builder = new GraphQLMatchingPriceNotFoundErrorBuilder();
        builder.values = template.values();
        builder.productId = template.getProductId();
        builder.variantId = template.getVariantId();
        builder.currency = template.getCurrency();
        builder.country = template.getCountry();
        builder.customerGroup = template.getCustomerGroup();
        builder.channel = template.getChannel();
        return builder;
    }

}
