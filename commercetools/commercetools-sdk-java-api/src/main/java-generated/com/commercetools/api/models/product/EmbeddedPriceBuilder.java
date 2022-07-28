
package com.commercetools.api.models.product;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * EmbeddedPriceBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     EmbeddedPrice embeddedPrice = EmbeddedPrice.builder()
 *             .id("{id}")
 *             .value(valueBuilder -> valueBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class EmbeddedPriceBuilder implements Builder<EmbeddedPrice> {

    private String id;

    private com.commercetools.api.models.common.TypedMoney value;

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
    private java.util.List<com.commercetools.api.models.common.PriceTier> tiers;

    @Nullable
    private com.commercetools.api.models.common.DiscountedPrice discounted;

    @Nullable
    private com.commercetools.api.models.type.CustomFields custom;

    /**
     *  <p>Unique identifier of the EmbeddedPrice.</p>
     */

    public EmbeddedPriceBuilder id(final String id) {
        this.id = id;
        return this;
    }

    /**
     *  <p>Money value of the EmbeddedPrice.</p>
     */

    public EmbeddedPriceBuilder value(final com.commercetools.api.models.common.TypedMoney value) {
        this.value = value;
        return this;
    }

    /**
     *  <p>Money value of the EmbeddedPrice.</p>
     */

    public EmbeddedPriceBuilder value(
            Function<com.commercetools.api.models.common.TypedMoneyBuilder, Builder<? extends com.commercetools.api.models.common.TypedMoney>> builder) {
        this.value = builder.apply(com.commercetools.api.models.common.TypedMoneyBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Country for which the EmbeddedPrice is valid.</p>
     */

    public EmbeddedPriceBuilder country(@Nullable final String country) {
        this.country = country;
        return this;
    }

    /**
     *  <p>CustomerGroup for which the EmbeddedPrice is valid.</p>
     */

    public EmbeddedPriceBuilder customerGroup(
            Function<com.commercetools.api.models.customer_group.CustomerGroupReferenceBuilder, com.commercetools.api.models.customer_group.CustomerGroupReferenceBuilder> builder) {
        this.customerGroup = builder
                .apply(com.commercetools.api.models.customer_group.CustomerGroupReferenceBuilder.of())
                .build();
        return this;
    }

    /**
     *  <p>CustomerGroup for which the EmbeddedPrice is valid.</p>
     */

    public EmbeddedPriceBuilder customerGroup(
            @Nullable final com.commercetools.api.models.customer_group.CustomerGroupReference customerGroup) {
        this.customerGroup = customerGroup;
        return this;
    }

    /**
     *  <p>Product distribution Channel for which the EmbeddedPrice is valid.</p>
     */

    public EmbeddedPriceBuilder channel(
            Function<com.commercetools.api.models.channel.ChannelReferenceBuilder, com.commercetools.api.models.channel.ChannelReferenceBuilder> builder) {
        this.channel = builder.apply(com.commercetools.api.models.channel.ChannelReferenceBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Product distribution Channel for which the EmbeddedPrice is valid.</p>
     */

    public EmbeddedPriceBuilder channel(@Nullable final com.commercetools.api.models.channel.ChannelReference channel) {
        this.channel = channel;
        return this;
    }

    /**
     *  <p>Date from which the EmbeddedPrice is valid.</p>
     */

    public EmbeddedPriceBuilder validFrom(@Nullable final java.time.ZonedDateTime validFrom) {
        this.validFrom = validFrom;
        return this;
    }

    /**
     *  <p>Date until the EmbeddedPrice is valid.</p>
     */

    public EmbeddedPriceBuilder validUntil(@Nullable final java.time.ZonedDateTime validUntil) {
        this.validUntil = validUntil;
        return this;
    }

    /**
     *  <p>Price tiers if any are defined.</p>
     */

    public EmbeddedPriceBuilder tiers(@Nullable final com.commercetools.api.models.common.PriceTier... tiers) {
        this.tiers = new ArrayList<>(Arrays.asList(tiers));
        return this;
    }

    /**
     *  <p>Price tiers if any are defined.</p>
     */

    public EmbeddedPriceBuilder tiers(
            @Nullable final java.util.List<com.commercetools.api.models.common.PriceTier> tiers) {
        this.tiers = tiers;
        return this;
    }

    /**
     *  <p>Price tiers if any are defined.</p>
     */

    public EmbeddedPriceBuilder plusTiers(@Nullable final com.commercetools.api.models.common.PriceTier... tiers) {
        if (this.tiers == null) {
            this.tiers = new ArrayList<>();
        }
        this.tiers.addAll(Arrays.asList(tiers));
        return this;
    }

    /**
     *  <p>Price tiers if any are defined.</p>
     */

    public EmbeddedPriceBuilder plusTiers(
            Function<com.commercetools.api.models.common.PriceTierBuilder, com.commercetools.api.models.common.PriceTierBuilder> builder) {
        if (this.tiers == null) {
            this.tiers = new ArrayList<>();
        }
        this.tiers.add(builder.apply(com.commercetools.api.models.common.PriceTierBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Price tiers if any are defined.</p>
     */

    public EmbeddedPriceBuilder withTiers(
            Function<com.commercetools.api.models.common.PriceTierBuilder, com.commercetools.api.models.common.PriceTierBuilder> builder) {
        this.tiers = new ArrayList<>();
        this.tiers.add(builder.apply(com.commercetools.api.models.common.PriceTierBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Set if a matching ProductDiscount exists. If set, the API uses the <code>discounted</code> value for the LineItem Price selection. When a relative Discount is applied and the fraction part of the <code>discounted</code> price is 0.5, the discounted Price is rounded in favor of the customer with the half down rounding.</p>
     *  <p>The service will unset or replace the value</p>
     *  <ul>
     *   <li>once a matching relative or absolute Product Discount with a higher <code>sortOrder</code> exists,</li>
     *   <li>if the referenced external Product Discount is deactivated, or</li>
     *   <li>if the Product changes and the external Product Discount predicate does not match the discounted Price any more.</li>
     *  </ul>
     */

    public EmbeddedPriceBuilder discounted(
            Function<com.commercetools.api.models.common.DiscountedPriceBuilder, com.commercetools.api.models.common.DiscountedPriceBuilder> builder) {
        this.discounted = builder.apply(com.commercetools.api.models.common.DiscountedPriceBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Set if a matching ProductDiscount exists. If set, the API uses the <code>discounted</code> value for the LineItem Price selection. When a relative Discount is applied and the fraction part of the <code>discounted</code> price is 0.5, the discounted Price is rounded in favor of the customer with the half down rounding.</p>
     *  <p>The service will unset or replace the value</p>
     *  <ul>
     *   <li>once a matching relative or absolute Product Discount with a higher <code>sortOrder</code> exists,</li>
     *   <li>if the referenced external Product Discount is deactivated, or</li>
     *   <li>if the Product changes and the external Product Discount predicate does not match the discounted Price any more.</li>
     *  </ul>
     */

    public EmbeddedPriceBuilder discounted(
            @Nullable final com.commercetools.api.models.common.DiscountedPrice discounted) {
        this.discounted = discounted;
        return this;
    }

    /**
     *  <p>Custom Fields for the EmbeddedPrice.</p>
     */

    public EmbeddedPriceBuilder custom(
            Function<com.commercetools.api.models.type.CustomFieldsBuilder, com.commercetools.api.models.type.CustomFieldsBuilder> builder) {
        this.custom = builder.apply(com.commercetools.api.models.type.CustomFieldsBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Custom Fields for the EmbeddedPrice.</p>
     */

    public EmbeddedPriceBuilder custom(@Nullable final com.commercetools.api.models.type.CustomFields custom) {
        this.custom = custom;
        return this;
    }

    public String getId() {
        return this.id;
    }

    public com.commercetools.api.models.common.TypedMoney getValue() {
        return this.value;
    }

    @Nullable
    public String getCountry() {
        return this.country;
    }

    @Nullable
    public com.commercetools.api.models.customer_group.CustomerGroupReference getCustomerGroup() {
        return this.customerGroup;
    }

    @Nullable
    public com.commercetools.api.models.channel.ChannelReference getChannel() {
        return this.channel;
    }

    @Nullable
    public java.time.ZonedDateTime getValidFrom() {
        return this.validFrom;
    }

    @Nullable
    public java.time.ZonedDateTime getValidUntil() {
        return this.validUntil;
    }

    @Nullable
    public java.util.List<com.commercetools.api.models.common.PriceTier> getTiers() {
        return this.tiers;
    }

    @Nullable
    public com.commercetools.api.models.common.DiscountedPrice getDiscounted() {
        return this.discounted;
    }

    @Nullable
    public com.commercetools.api.models.type.CustomFields getCustom() {
        return this.custom;
    }

    public EmbeddedPrice build() {
        Objects.requireNonNull(id, EmbeddedPrice.class + ": id is missing");
        Objects.requireNonNull(value, EmbeddedPrice.class + ": value is missing");
        return new EmbeddedPriceImpl(id, value, country, customerGroup, channel, validFrom, validUntil, tiers,
            discounted, custom);
    }

    /**
     * builds EmbeddedPrice without checking for non null required values
     */
    public EmbeddedPrice buildUnchecked() {
        return new EmbeddedPriceImpl(id, value, country, customerGroup, channel, validFrom, validUntil, tiers,
            discounted, custom);
    }

    public static EmbeddedPriceBuilder of() {
        return new EmbeddedPriceBuilder();
    }

    public static EmbeddedPriceBuilder of(final EmbeddedPrice template) {
        EmbeddedPriceBuilder builder = new EmbeddedPriceBuilder();
        builder.id = template.getId();
        builder.value = template.getValue();
        builder.country = template.getCountry();
        builder.customerGroup = template.getCustomerGroup();
        builder.channel = template.getChannel();
        builder.validFrom = template.getValidFrom();
        builder.validUntil = template.getValidUntil();
        builder.tiers = template.getTiers();
        builder.discounted = template.getDiscounted();
        builder.custom = template.getCustom();
        return builder;
    }

}
