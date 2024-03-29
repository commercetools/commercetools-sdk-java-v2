
package com.commercetools.api.models.common;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ScopedPriceBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ScopedPrice scopedPrice = ScopedPrice.builder()
 *             .id("{id}")
 *             .value(valueBuilder -> valueBuilder)
 *             .currentValue(currentValueBuilder -> currentValueBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ScopedPriceBuilder implements Builder<ScopedPrice> {

    private String id;

    private com.commercetools.api.models.common.TypedMoney value;

    private com.commercetools.api.models.common.TypedMoney currentValue;

    @Nullable
    private String country;

    @Nullable
    private com.commercetools.api.models.customer_group.CustomerGroupReference customerGroup;

    @Nullable
    private com.commercetools.api.models.channel.ChannelReference channel;

    @Nullable
    private java.time.ZonedDateTime validFrom;

    @Nullable
    private java.time.ZonedDateTime validUntil;

    @Nullable
    private com.commercetools.api.models.common.DiscountedPrice discounted;

    @Nullable
    private com.commercetools.api.models.type.CustomFields custom;

    /**
     *  <p>Platform-generated unique identifier of the Price.</p>
     * @param id value to be set
     * @return Builder
     */

    public ScopedPriceBuilder id(final String id) {
        this.id = id;
        return this;
    }

    /**
     *  <p>Original value of the Price.</p>
     * @param value value to be set
     * @return Builder
     */

    public ScopedPriceBuilder value(final com.commercetools.api.models.common.TypedMoney value) {
        this.value = value;
        return this;
    }

    /**
     *  <p>Original value of the Price.</p>
     * @param builder function to build the value value
     * @return Builder
     */

    public ScopedPriceBuilder value(
            Function<com.commercetools.api.models.common.TypedMoneyBuilder, Builder<? extends com.commercetools.api.models.common.TypedMoney>> builder) {
        this.value = builder.apply(com.commercetools.api.models.common.TypedMoneyBuilder.of()).build();
        return this;
    }

    /**
     *  <p>If available, either the original price <code>value</code> or <code>discounted</code> value.</p>
     * @param currentValue value to be set
     * @return Builder
     */

    public ScopedPriceBuilder currentValue(final com.commercetools.api.models.common.TypedMoney currentValue) {
        this.currentValue = currentValue;
        return this;
    }

    /**
     *  <p>If available, either the original price <code>value</code> or <code>discounted</code> value.</p>
     * @param builder function to build the currentValue value
     * @return Builder
     */

    public ScopedPriceBuilder currentValue(
            Function<com.commercetools.api.models.common.TypedMoneyBuilder, Builder<? extends com.commercetools.api.models.common.TypedMoney>> builder) {
        this.currentValue = builder.apply(com.commercetools.api.models.common.TypedMoneyBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Country code of the geographic location.</p>
     * @param country value to be set
     * @return Builder
     */

    public ScopedPriceBuilder country(@Nullable final String country) {
        this.country = country;
        return this;
    }

    /**
     *  <p>Reference to a CustomerGroup.</p>
     * @param builder function to build the customerGroup value
     * @return Builder
     */

    public ScopedPriceBuilder customerGroup(
            Function<com.commercetools.api.models.customer_group.CustomerGroupReferenceBuilder, com.commercetools.api.models.customer_group.CustomerGroupReferenceBuilder> builder) {
        this.customerGroup = builder
                .apply(com.commercetools.api.models.customer_group.CustomerGroupReferenceBuilder.of())
                .build();
        return this;
    }

    /**
     *  <p>Reference to a CustomerGroup.</p>
     * @param builder function to build the customerGroup value
     * @return Builder
     */

    public ScopedPriceBuilder withCustomerGroup(
            Function<com.commercetools.api.models.customer_group.CustomerGroupReferenceBuilder, com.commercetools.api.models.customer_group.CustomerGroupReference> builder) {
        this.customerGroup = builder
                .apply(com.commercetools.api.models.customer_group.CustomerGroupReferenceBuilder.of());
        return this;
    }

    /**
     *  <p>Reference to a CustomerGroup.</p>
     * @param customerGroup value to be set
     * @return Builder
     */

    public ScopedPriceBuilder customerGroup(
            @Nullable final com.commercetools.api.models.customer_group.CustomerGroupReference customerGroup) {
        this.customerGroup = customerGroup;
        return this;
    }

    /**
     *  <p>Reference to a Channel.</p>
     * @param builder function to build the channel value
     * @return Builder
     */

    public ScopedPriceBuilder channel(
            Function<com.commercetools.api.models.channel.ChannelReferenceBuilder, com.commercetools.api.models.channel.ChannelReferenceBuilder> builder) {
        this.channel = builder.apply(com.commercetools.api.models.channel.ChannelReferenceBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Reference to a Channel.</p>
     * @param builder function to build the channel value
     * @return Builder
     */

    public ScopedPriceBuilder withChannel(
            Function<com.commercetools.api.models.channel.ChannelReferenceBuilder, com.commercetools.api.models.channel.ChannelReference> builder) {
        this.channel = builder.apply(com.commercetools.api.models.channel.ChannelReferenceBuilder.of());
        return this;
    }

    /**
     *  <p>Reference to a Channel.</p>
     * @param channel value to be set
     * @return Builder
     */

    public ScopedPriceBuilder channel(@Nullable final com.commercetools.api.models.channel.ChannelReference channel) {
        this.channel = channel;
        return this;
    }

    /**
     *  <p>Date and time from which the Price is valid.</p>
     * @param validFrom value to be set
     * @return Builder
     */

    public ScopedPriceBuilder validFrom(@Nullable final java.time.ZonedDateTime validFrom) {
        this.validFrom = validFrom;
        return this;
    }

    /**
     *  <p>Date and time until which the Price is valid.</p>
     * @param validUntil value to be set
     * @return Builder
     */

    public ScopedPriceBuilder validUntil(@Nullable final java.time.ZonedDateTime validUntil) {
        this.validUntil = validUntil;
        return this;
    }

    /**
     *  <p>Is set when a matching ProductDiscount exists. If set, the Cart uses the discounted value for the Cart Price calculation.</p>
     *  <p>When a relative Product Discount is applied and the fractional part of the discounted Price is 0.5, the discounted Price is rounded half down in favor of the Customer.</p>
     * @param builder function to build the discounted value
     * @return Builder
     */

    public ScopedPriceBuilder discounted(
            Function<com.commercetools.api.models.common.DiscountedPriceBuilder, com.commercetools.api.models.common.DiscountedPriceBuilder> builder) {
        this.discounted = builder.apply(com.commercetools.api.models.common.DiscountedPriceBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Is set when a matching ProductDiscount exists. If set, the Cart uses the discounted value for the Cart Price calculation.</p>
     *  <p>When a relative Product Discount is applied and the fractional part of the discounted Price is 0.5, the discounted Price is rounded half down in favor of the Customer.</p>
     * @param builder function to build the discounted value
     * @return Builder
     */

    public ScopedPriceBuilder withDiscounted(
            Function<com.commercetools.api.models.common.DiscountedPriceBuilder, com.commercetools.api.models.common.DiscountedPrice> builder) {
        this.discounted = builder.apply(com.commercetools.api.models.common.DiscountedPriceBuilder.of());
        return this;
    }

    /**
     *  <p>Is set when a matching ProductDiscount exists. If set, the Cart uses the discounted value for the Cart Price calculation.</p>
     *  <p>When a relative Product Discount is applied and the fractional part of the discounted Price is 0.5, the discounted Price is rounded half down in favor of the Customer.</p>
     * @param discounted value to be set
     * @return Builder
     */

    public ScopedPriceBuilder discounted(
            @Nullable final com.commercetools.api.models.common.DiscountedPrice discounted) {
        this.discounted = discounted;
        return this;
    }

    /**
     *  <p>Custom Fields for the Price.</p>
     * @param builder function to build the custom value
     * @return Builder
     */

    public ScopedPriceBuilder custom(
            Function<com.commercetools.api.models.type.CustomFieldsBuilder, com.commercetools.api.models.type.CustomFieldsBuilder> builder) {
        this.custom = builder.apply(com.commercetools.api.models.type.CustomFieldsBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Custom Fields for the Price.</p>
     * @param builder function to build the custom value
     * @return Builder
     */

    public ScopedPriceBuilder withCustom(
            Function<com.commercetools.api.models.type.CustomFieldsBuilder, com.commercetools.api.models.type.CustomFields> builder) {
        this.custom = builder.apply(com.commercetools.api.models.type.CustomFieldsBuilder.of());
        return this;
    }

    /**
     *  <p>Custom Fields for the Price.</p>
     * @param custom value to be set
     * @return Builder
     */

    public ScopedPriceBuilder custom(@Nullable final com.commercetools.api.models.type.CustomFields custom) {
        this.custom = custom;
        return this;
    }

    /**
     *  <p>Platform-generated unique identifier of the Price.</p>
     * @return id
     */

    public String getId() {
        return this.id;
    }

    /**
     *  <p>Original value of the Price.</p>
     * @return value
     */

    public com.commercetools.api.models.common.TypedMoney getValue() {
        return this.value;
    }

    /**
     *  <p>If available, either the original price <code>value</code> or <code>discounted</code> value.</p>
     * @return currentValue
     */

    public com.commercetools.api.models.common.TypedMoney getCurrentValue() {
        return this.currentValue;
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
     *  <p>Reference to a CustomerGroup.</p>
     * @return customerGroup
     */

    @Nullable
    public com.commercetools.api.models.customer_group.CustomerGroupReference getCustomerGroup() {
        return this.customerGroup;
    }

    /**
     *  <p>Reference to a Channel.</p>
     * @return channel
     */

    @Nullable
    public com.commercetools.api.models.channel.ChannelReference getChannel() {
        return this.channel;
    }

    /**
     *  <p>Date and time from which the Price is valid.</p>
     * @return validFrom
     */

    @Nullable
    public java.time.ZonedDateTime getValidFrom() {
        return this.validFrom;
    }

    /**
     *  <p>Date and time until which the Price is valid.</p>
     * @return validUntil
     */

    @Nullable
    public java.time.ZonedDateTime getValidUntil() {
        return this.validUntil;
    }

    /**
     *  <p>Is set when a matching ProductDiscount exists. If set, the Cart uses the discounted value for the Cart Price calculation.</p>
     *  <p>When a relative Product Discount is applied and the fractional part of the discounted Price is 0.5, the discounted Price is rounded half down in favor of the Customer.</p>
     * @return discounted
     */

    @Nullable
    public com.commercetools.api.models.common.DiscountedPrice getDiscounted() {
        return this.discounted;
    }

    /**
     *  <p>Custom Fields for the Price.</p>
     * @return custom
     */

    @Nullable
    public com.commercetools.api.models.type.CustomFields getCustom() {
        return this.custom;
    }

    /**
     * builds ScopedPrice with checking for non-null required values
     * @return ScopedPrice
     */
    public ScopedPrice build() {
        Objects.requireNonNull(id, ScopedPrice.class + ": id is missing");
        Objects.requireNonNull(value, ScopedPrice.class + ": value is missing");
        Objects.requireNonNull(currentValue, ScopedPrice.class + ": currentValue is missing");
        return new ScopedPriceImpl(id, value, currentValue, country, customerGroup, channel, validFrom, validUntil,
            discounted, custom);
    }

    /**
     * builds ScopedPrice without checking for non-null required values
     * @return ScopedPrice
     */
    public ScopedPrice buildUnchecked() {
        return new ScopedPriceImpl(id, value, currentValue, country, customerGroup, channel, validFrom, validUntil,
            discounted, custom);
    }

    /**
     * factory method for an instance of ScopedPriceBuilder
     * @return builder
     */
    public static ScopedPriceBuilder of() {
        return new ScopedPriceBuilder();
    }

    /**
     * create builder for ScopedPrice instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ScopedPriceBuilder of(final ScopedPrice template) {
        ScopedPriceBuilder builder = new ScopedPriceBuilder();
        builder.id = template.getId();
        builder.value = template.getValue();
        builder.currentValue = template.getCurrentValue();
        builder.country = template.getCountry();
        builder.customerGroup = template.getCustomerGroup();
        builder.channel = template.getChannel();
        builder.validFrom = template.getValidFrom();
        builder.validUntil = template.getValidUntil();
        builder.discounted = template.getDiscounted();
        builder.custom = template.getCustom();
        return builder;
    }

}
