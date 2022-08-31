
package com.commercetools.importapi.models.prices;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * PriceImportBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     PriceImport priceImport = PriceImport.builder()
 *             .key("{key}")
 *             .value(valueBuilder -> valueBuilder)
 *             .productVariant(productVariantBuilder -> productVariantBuilder)
 *             .product(productBuilder -> productBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class PriceImportBuilder implements Builder<PriceImport> {

    private String key;

    private com.commercetools.importapi.models.common.TypedMoney value;

    @Nullable
    private String country;

    @Nullable
    private java.time.ZonedDateTime validFrom;

    @Nullable
    private java.time.ZonedDateTime validUntil;

    @Nullable
    private com.commercetools.importapi.models.common.CustomerGroupKeyReference customerGroup;

    @Nullable
    private com.commercetools.importapi.models.common.ChannelKeyReference channel;

    @Nullable
    private com.commercetools.importapi.models.common.DiscountedPrice discounted;

    @Nullable
    private Boolean publish;

    @Nullable
    private java.util.List<com.commercetools.importapi.models.common.PriceTier> tiers;

    @Nullable
    private com.commercetools.importapi.models.customfields.Custom custom;

    private com.commercetools.importapi.models.common.ProductVariantKeyReference productVariant;

    private com.commercetools.importapi.models.common.ProductKeyReference product;

    /**
     *
     */

    public PriceImportBuilder key(final String key) {
        this.key = key;
        return this;
    }

    /**
     *  <p>Maps to <code>Price.value</code>.</p>
     */

    public PriceImportBuilder value(final com.commercetools.importapi.models.common.TypedMoney value) {
        this.value = value;
        return this;
    }

    /**
     *  <p>Maps to <code>Price.value</code>.</p>
     */

    public PriceImportBuilder value(
            Function<com.commercetools.importapi.models.common.TypedMoneyBuilder, Builder<? extends com.commercetools.importapi.models.common.TypedMoney>> builder) {
        this.value = builder.apply(com.commercetools.importapi.models.common.TypedMoneyBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Maps to <code>Price.county</code>.</p>
     */

    public PriceImportBuilder country(@Nullable final String country) {
        this.country = country;
        return this;
    }

    /**
     *  <p>Maps to <code>Price.validFrom</code>.</p>
     */

    public PriceImportBuilder validFrom(@Nullable final java.time.ZonedDateTime validFrom) {
        this.validFrom = validFrom;
        return this;
    }

    /**
     *  <p>Maps to <code>Price.validUntil</code>.</p>
     */

    public PriceImportBuilder validUntil(@Nullable final java.time.ZonedDateTime validUntil) {
        this.validUntil = validUntil;
        return this;
    }

    /**
     *  <p>The Reference to the CustomerGroup with which the Embedded Price is associated. If referenced CustomerGroup does not exist, the <code>state</code> of the ImportOperation will be set to <code>unresolved</code> until the necessary CustomerGroup is created.</p>
     */

    public PriceImportBuilder customerGroup(
            Function<com.commercetools.importapi.models.common.CustomerGroupKeyReferenceBuilder, com.commercetools.importapi.models.common.CustomerGroupKeyReferenceBuilder> builder) {
        this.customerGroup = builder
                .apply(com.commercetools.importapi.models.common.CustomerGroupKeyReferenceBuilder.of())
                .build();
        return this;
    }

    /**
     *  <p>The Reference to the CustomerGroup with which the Embedded Price is associated. If referenced CustomerGroup does not exist, the <code>state</code> of the ImportOperation will be set to <code>unresolved</code> until the necessary CustomerGroup is created.</p>
     */

    public PriceImportBuilder customerGroup(
            @Nullable final com.commercetools.importapi.models.common.CustomerGroupKeyReference customerGroup) {
        this.customerGroup = customerGroup;
        return this;
    }

    /**
     *  <p>The Reference to the Channel with which the Embedded Price is associated. If referenced Channel does not exist, the <code>state</code> of the ImportOperation will be set to <code>unresolved</code> until the necessary Channel is created.</p>
     */

    public PriceImportBuilder channel(
            Function<com.commercetools.importapi.models.common.ChannelKeyReferenceBuilder, com.commercetools.importapi.models.common.ChannelKeyReferenceBuilder> builder) {
        this.channel = builder.apply(com.commercetools.importapi.models.common.ChannelKeyReferenceBuilder.of()).build();
        return this;
    }

    /**
     *  <p>The Reference to the Channel with which the Embedded Price is associated. If referenced Channel does not exist, the <code>state</code> of the ImportOperation will be set to <code>unresolved</code> until the necessary Channel is created.</p>
     */

    public PriceImportBuilder channel(
            @Nullable final com.commercetools.importapi.models.common.ChannelKeyReference channel) {
        this.channel = channel;
        return this;
    }

    /**
     *  <p>Sets a discounted price from an external service.</p>
     */

    public PriceImportBuilder discounted(
            Function<com.commercetools.importapi.models.common.DiscountedPriceBuilder, com.commercetools.importapi.models.common.DiscountedPriceBuilder> builder) {
        this.discounted = builder.apply(com.commercetools.importapi.models.common.DiscountedPriceBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Sets a discounted price from an external service.</p>
     */

    public PriceImportBuilder discounted(
            @Nullable final com.commercetools.importapi.models.common.DiscountedPrice discounted) {
        this.discounted = discounted;
        return this;
    }

    /**
     *  <p>Only the Embedded Price updates will be published to <code>staged</code> and <code>current</code> projection.</p>
     */

    public PriceImportBuilder publish(@Nullable final Boolean publish) {
        this.publish = publish;
        return this;
    }

    /**
     *  <p>The tiered prices for this price.</p>
     */

    public PriceImportBuilder tiers(@Nullable final com.commercetools.importapi.models.common.PriceTier... tiers) {
        this.tiers = new ArrayList<>(Arrays.asList(tiers));
        return this;
    }

    /**
     *  <p>The tiered prices for this price.</p>
     */

    public PriceImportBuilder tiers(
            @Nullable final java.util.List<com.commercetools.importapi.models.common.PriceTier> tiers) {
        this.tiers = tiers;
        return this;
    }

    /**
     *  <p>The tiered prices for this price.</p>
     */

    public PriceImportBuilder plusTiers(@Nullable final com.commercetools.importapi.models.common.PriceTier... tiers) {
        if (this.tiers == null) {
            this.tiers = new ArrayList<>();
        }
        this.tiers.addAll(Arrays.asList(tiers));
        return this;
    }

    /**
     *  <p>The tiered prices for this price.</p>
     */

    public PriceImportBuilder plusTiers(
            Function<com.commercetools.importapi.models.common.PriceTierBuilder, com.commercetools.importapi.models.common.PriceTierBuilder> builder) {
        if (this.tiers == null) {
            this.tiers = new ArrayList<>();
        }
        this.tiers.add(builder.apply(com.commercetools.importapi.models.common.PriceTierBuilder.of()).build());
        return this;
    }

    /**
     *  <p>The tiered prices for this price.</p>
     */

    public PriceImportBuilder withTiers(
            Function<com.commercetools.importapi.models.common.PriceTierBuilder, com.commercetools.importapi.models.common.PriceTierBuilder> builder) {
        this.tiers = new ArrayList<>();
        this.tiers.add(builder.apply(com.commercetools.importapi.models.common.PriceTierBuilder.of()).build());
        return this;
    }

    /**
     *  <p>The custom fields for this price.</p>
     */

    public PriceImportBuilder custom(
            Function<com.commercetools.importapi.models.customfields.CustomBuilder, com.commercetools.importapi.models.customfields.CustomBuilder> builder) {
        this.custom = builder.apply(com.commercetools.importapi.models.customfields.CustomBuilder.of()).build();
        return this;
    }

    /**
     *  <p>The custom fields for this price.</p>
     */

    public PriceImportBuilder custom(@Nullable final com.commercetools.importapi.models.customfields.Custom custom) {
        this.custom = custom;
        return this;
    }

    /**
     *  <p>The ProductVariant in which this Embedded Price is contained. The Reference to the ProductVariant with which the Embedded Price is associated. If referenced ProductVariant does not exist, the <code>state</code> of the ImportOperation will be set to <code>unresolved</code> until the necessary ProductVariant is created.</p>
     */

    public PriceImportBuilder productVariant(
            Function<com.commercetools.importapi.models.common.ProductVariantKeyReferenceBuilder, com.commercetools.importapi.models.common.ProductVariantKeyReferenceBuilder> builder) {
        this.productVariant = builder
                .apply(com.commercetools.importapi.models.common.ProductVariantKeyReferenceBuilder.of())
                .build();
        return this;
    }

    /**
     *  <p>The ProductVariant in which this Embedded Price is contained. The Reference to the ProductVariant with which the Embedded Price is associated. If referenced ProductVariant does not exist, the <code>state</code> of the ImportOperation will be set to <code>unresolved</code> until the necessary ProductVariant is created.</p>
     */

    public PriceImportBuilder productVariant(
            final com.commercetools.importapi.models.common.ProductVariantKeyReference productVariant) {
        this.productVariant = productVariant;
        return this;
    }

    /**
     *  <p>The Product in which the Product Variant containing this Embedded Price is contained. Maps to <code>ProductVariant.product</code>. The Reference to the Product with which the Embedded Price is associated. If referenced Product does not exist, the <code>state</code> of the ImportOperation will be set to <code>unresolved</code> until the necessary Product is created.</p>
     */

    public PriceImportBuilder product(
            Function<com.commercetools.importapi.models.common.ProductKeyReferenceBuilder, com.commercetools.importapi.models.common.ProductKeyReferenceBuilder> builder) {
        this.product = builder.apply(com.commercetools.importapi.models.common.ProductKeyReferenceBuilder.of()).build();
        return this;
    }

    /**
     *  <p>The Product in which the Product Variant containing this Embedded Price is contained. Maps to <code>ProductVariant.product</code>. The Reference to the Product with which the Embedded Price is associated. If referenced Product does not exist, the <code>state</code> of the ImportOperation will be set to <code>unresolved</code> until the necessary Product is created.</p>
     */

    public PriceImportBuilder product(final com.commercetools.importapi.models.common.ProductKeyReference product) {
        this.product = product;
        return this;
    }

    public String getKey() {
        return this.key;
    }

    public com.commercetools.importapi.models.common.TypedMoney getValue() {
        return this.value;
    }

    @Nullable
    public String getCountry() {
        return this.country;
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
    public com.commercetools.importapi.models.common.CustomerGroupKeyReference getCustomerGroup() {
        return this.customerGroup;
    }

    @Nullable
    public com.commercetools.importapi.models.common.ChannelKeyReference getChannel() {
        return this.channel;
    }

    @Nullable
    public com.commercetools.importapi.models.common.DiscountedPrice getDiscounted() {
        return this.discounted;
    }

    @Nullable
    public Boolean getPublish() {
        return this.publish;
    }

    @Nullable
    public java.util.List<com.commercetools.importapi.models.common.PriceTier> getTiers() {
        return this.tiers;
    }

    @Nullable
    public com.commercetools.importapi.models.customfields.Custom getCustom() {
        return this.custom;
    }

    public com.commercetools.importapi.models.common.ProductVariantKeyReference getProductVariant() {
        return this.productVariant;
    }

    public com.commercetools.importapi.models.common.ProductKeyReference getProduct() {
        return this.product;
    }

    public PriceImport build() {
        Objects.requireNonNull(key, PriceImport.class + ": key is missing");
        Objects.requireNonNull(value, PriceImport.class + ": value is missing");
        Objects.requireNonNull(productVariant, PriceImport.class + ": productVariant is missing");
        Objects.requireNonNull(product, PriceImport.class + ": product is missing");
        return new PriceImportImpl(key, value, country, validFrom, validUntil, customerGroup, channel, discounted,
            publish, tiers, custom, productVariant, product);
    }

    /**
     * builds PriceImport without checking for non null required values
     */
    public PriceImport buildUnchecked() {
        return new PriceImportImpl(key, value, country, validFrom, validUntil, customerGroup, channel, discounted,
            publish, tiers, custom, productVariant, product);
    }

    public static PriceImportBuilder of() {
        return new PriceImportBuilder();
    }

    public static PriceImportBuilder of(final PriceImport template) {
        PriceImportBuilder builder = new PriceImportBuilder();
        builder.key = template.getKey();
        builder.value = template.getValue();
        builder.country = template.getCountry();
        builder.validFrom = template.getValidFrom();
        builder.validUntil = template.getValidUntil();
        builder.customerGroup = template.getCustomerGroup();
        builder.channel = template.getChannel();
        builder.discounted = template.getDiscounted();
        builder.publish = template.getPublish();
        builder.tiers = template.getTiers();
        builder.custom = template.getCustom();
        builder.productVariant = template.getProductVariant();
        builder.product = template.getProduct();
        return builder;
    }

}
