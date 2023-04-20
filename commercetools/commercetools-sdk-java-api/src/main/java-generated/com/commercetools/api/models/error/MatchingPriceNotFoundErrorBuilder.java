
package com.commercetools.api.models.error;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * MatchingPriceNotFoundErrorBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     MatchingPriceNotFoundError matchingPriceNotFoundError = MatchingPriceNotFoundError.builder()
 *             .message("{message}")
 *             .productId("{productId}")
 *             .variantId(1)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class MatchingPriceNotFoundErrorBuilder implements Builder<MatchingPriceNotFoundError> {

    private String message;

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
     *  <p><code>"The variant $variantId of product $productId does not contain a price for currency $currencyCode, $country, $customerGroup, $channel."</code></p>
     * @param message value to be set
     * @return Builder
     */

    public MatchingPriceNotFoundErrorBuilder message(final String message) {
        this.message = message;
        return this;
    }

    /**
     *  <p>Error-specific additional fields.</p>
     * @param values properties to be set
     * @return Builder
     */

    public MatchingPriceNotFoundErrorBuilder values(final Map<String, java.lang.Object> values) {
        this.values = values;
        return this;
    }

    /**
     *  <p>Error-specific additional fields.</p>
     * @param key property name
     * @param value property value
     * @return Builder
     */

    public MatchingPriceNotFoundErrorBuilder addValue(final String key, final java.lang.Object value) {
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

    public MatchingPriceNotFoundErrorBuilder productId(final String productId) {
        this.productId = productId;
        return this;
    }

    /**
     *  <p>Unique identifier of a ProductVariant in the Product.</p>
     * @param variantId value to be set
     * @return Builder
     */

    public MatchingPriceNotFoundErrorBuilder variantId(final Integer variantId) {
        this.variantId = variantId;
        return this;
    }

    /**
     *  <p>Currency code of the country.</p>
     * @param currency value to be set
     * @return Builder
     */

    public MatchingPriceNotFoundErrorBuilder currency(@Nullable final String currency) {
        this.currency = currency;
        return this;
    }

    /**
     *  <p>Country code of the geographic location.</p>
     * @param country value to be set
     * @return Builder
     */

    public MatchingPriceNotFoundErrorBuilder country(@Nullable final String country) {
        this.country = country;
        return this;
    }

    /**
     *  <p>Customer Group associated with the Price.</p>
     * @param builder function to build the customerGroup value
     * @return Builder
     */

    public MatchingPriceNotFoundErrorBuilder customerGroup(
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

    public MatchingPriceNotFoundErrorBuilder withCustomerGroup(
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

    public MatchingPriceNotFoundErrorBuilder customerGroup(
            @Nullable final com.commercetools.api.models.customer_group.CustomerGroupReference customerGroup) {
        this.customerGroup = customerGroup;
        return this;
    }

    /**
     *  <p>Channel associated with the Price.</p>
     * @param builder function to build the channel value
     * @return Builder
     */

    public MatchingPriceNotFoundErrorBuilder channel(
            Function<com.commercetools.api.models.channel.ChannelReferenceBuilder, com.commercetools.api.models.channel.ChannelReferenceBuilder> builder) {
        this.channel = builder.apply(com.commercetools.api.models.channel.ChannelReferenceBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Channel associated with the Price.</p>
     * @param builder function to build the channel value
     * @return Builder
     */

    public MatchingPriceNotFoundErrorBuilder withChannel(
            Function<com.commercetools.api.models.channel.ChannelReferenceBuilder, com.commercetools.api.models.channel.ChannelReference> builder) {
        this.channel = builder.apply(com.commercetools.api.models.channel.ChannelReferenceBuilder.of());
        return this;
    }

    /**
     *  <p>Channel associated with the Price.</p>
     * @param channel value to be set
     * @return Builder
     */

    public MatchingPriceNotFoundErrorBuilder channel(
            @Nullable final com.commercetools.api.models.channel.ChannelReference channel) {
        this.channel = channel;
        return this;
    }

    /**
     *  <p><code>"The variant $variantId of product $productId does not contain a price for currency $currencyCode, $country, $customerGroup, $channel."</code></p>
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
     * builds MatchingPriceNotFoundError with checking for non-null required values
     * @return MatchingPriceNotFoundError
     */
    public MatchingPriceNotFoundError build() {
        Objects.requireNonNull(message, MatchingPriceNotFoundError.class + ": message is missing");
        Objects.requireNonNull(productId, MatchingPriceNotFoundError.class + ": productId is missing");
        Objects.requireNonNull(variantId, MatchingPriceNotFoundError.class + ": variantId is missing");
        return new MatchingPriceNotFoundErrorImpl(message, values, productId, variantId, currency, country,
            customerGroup, channel);
    }

    /**
     * builds MatchingPriceNotFoundError without checking for non-null required values
     * @return MatchingPriceNotFoundError
     */
    public MatchingPriceNotFoundError buildUnchecked() {
        return new MatchingPriceNotFoundErrorImpl(message, values, productId, variantId, currency, country,
            customerGroup, channel);
    }

    /**
     * factory method for an instance of MatchingPriceNotFoundErrorBuilder
     * @return builder
     */
    public static MatchingPriceNotFoundErrorBuilder of() {
        return new MatchingPriceNotFoundErrorBuilder();
    }

    /**
     * create builder for MatchingPriceNotFoundError instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static MatchingPriceNotFoundErrorBuilder of(final MatchingPriceNotFoundError template) {
        MatchingPriceNotFoundErrorBuilder builder = new MatchingPriceNotFoundErrorBuilder();
        builder.message = template.getMessage();
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
