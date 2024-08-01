
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
    private Boolean staged;

    @Nullable
    private java.util.List<com.commercetools.importapi.models.common.PriceTier> tiers;

    @Nullable
    private com.commercetools.importapi.models.customfields.Custom custom;

    private com.commercetools.importapi.models.common.ProductVariantKeyReference productVariant;

    private com.commercetools.importapi.models.common.ProductKeyReference product;

    /**
     *  <p>User-defined unique identifier for the Embedded Price. If a Price with this <code>key</code> exists on the specified <code>productVariant</code>, it will be updated with the imported data.</p>
     * @param key value to be set
     * @return Builder
     */

    public PriceImportBuilder key(final String key) {
        this.key = key;
        return this;
    }

    /**
     *  <p>Maps to <code>Price.value</code>.</p>
     * @param value value to be set
     * @return Builder
     */

    public PriceImportBuilder value(final com.commercetools.importapi.models.common.TypedMoney value) {
        this.value = value;
        return this;
    }

    /**
     *  <p>Maps to <code>Price.value</code>.</p>
     * @param builder function to build the value value
     * @return Builder
     */

    public PriceImportBuilder value(
            Function<com.commercetools.importapi.models.common.TypedMoneyBuilder, Builder<? extends com.commercetools.importapi.models.common.TypedMoney>> builder) {
        this.value = builder.apply(com.commercetools.importapi.models.common.TypedMoneyBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Maps to <code>Price.county</code>.</p>
     * @param country value to be set
     * @return Builder
     */

    public PriceImportBuilder country(@Nullable final String country) {
        this.country = country;
        return this;
    }

    /**
     *  <p>Maps to <code>Price.validFrom</code>.</p>
     * @param validFrom value to be set
     * @return Builder
     */

    public PriceImportBuilder validFrom(@Nullable final java.time.ZonedDateTime validFrom) {
        this.validFrom = validFrom;
        return this;
    }

    /**
     *  <p>Maps to <code>Price.validUntil</code>.</p>
     * @param validUntil value to be set
     * @return Builder
     */

    public PriceImportBuilder validUntil(@Nullable final java.time.ZonedDateTime validUntil) {
        this.validUntil = validUntil;
        return this;
    }

    /**
     *  <p>The Reference to the CustomerGroup with which the Price is associated. If referenced CustomerGroup does not exist, the <code>state</code> of the ImportOperation will be set to <code>unresolved</code> until the necessary CustomerGroup is created.</p>
     * @param builder function to build the customerGroup value
     * @return Builder
     */

    public PriceImportBuilder customerGroup(
            Function<com.commercetools.importapi.models.common.CustomerGroupKeyReferenceBuilder, com.commercetools.importapi.models.common.CustomerGroupKeyReferenceBuilder> builder) {
        this.customerGroup = builder
                .apply(com.commercetools.importapi.models.common.CustomerGroupKeyReferenceBuilder.of())
                .build();
        return this;
    }

    /**
     *  <p>The Reference to the CustomerGroup with which the Price is associated. If referenced CustomerGroup does not exist, the <code>state</code> of the ImportOperation will be set to <code>unresolved</code> until the necessary CustomerGroup is created.</p>
     * @param builder function to build the customerGroup value
     * @return Builder
     */

    public PriceImportBuilder withCustomerGroup(
            Function<com.commercetools.importapi.models.common.CustomerGroupKeyReferenceBuilder, com.commercetools.importapi.models.common.CustomerGroupKeyReference> builder) {
        this.customerGroup = builder
                .apply(com.commercetools.importapi.models.common.CustomerGroupKeyReferenceBuilder.of());
        return this;
    }

    /**
     *  <p>The Reference to the CustomerGroup with which the Price is associated. If referenced CustomerGroup does not exist, the <code>state</code> of the ImportOperation will be set to <code>unresolved</code> until the necessary CustomerGroup is created.</p>
     * @param customerGroup value to be set
     * @return Builder
     */

    public PriceImportBuilder customerGroup(
            @Nullable final com.commercetools.importapi.models.common.CustomerGroupKeyReference customerGroup) {
        this.customerGroup = customerGroup;
        return this;
    }

    /**
     *  <p>The Reference to the Channel with which the Price is associated. If referenced Channel does not exist, the <code>state</code> of the ImportOperation will be set to <code>unresolved</code> until the necessary Channel is created.</p>
     * @param builder function to build the channel value
     * @return Builder
     */

    public PriceImportBuilder channel(
            Function<com.commercetools.importapi.models.common.ChannelKeyReferenceBuilder, com.commercetools.importapi.models.common.ChannelKeyReferenceBuilder> builder) {
        this.channel = builder.apply(com.commercetools.importapi.models.common.ChannelKeyReferenceBuilder.of()).build();
        return this;
    }

    /**
     *  <p>The Reference to the Channel with which the Price is associated. If referenced Channel does not exist, the <code>state</code> of the ImportOperation will be set to <code>unresolved</code> until the necessary Channel is created.</p>
     * @param builder function to build the channel value
     * @return Builder
     */

    public PriceImportBuilder withChannel(
            Function<com.commercetools.importapi.models.common.ChannelKeyReferenceBuilder, com.commercetools.importapi.models.common.ChannelKeyReference> builder) {
        this.channel = builder.apply(com.commercetools.importapi.models.common.ChannelKeyReferenceBuilder.of());
        return this;
    }

    /**
     *  <p>The Reference to the Channel with which the Price is associated. If referenced Channel does not exist, the <code>state</code> of the ImportOperation will be set to <code>unresolved</code> until the necessary Channel is created.</p>
     * @param channel value to be set
     * @return Builder
     */

    public PriceImportBuilder channel(
            @Nullable final com.commercetools.importapi.models.common.ChannelKeyReference channel) {
        this.channel = channel;
        return this;
    }

    /**
     *  <p>Sets a discounted price from an external service.</p>
     * @param builder function to build the discounted value
     * @return Builder
     */

    public PriceImportBuilder discounted(
            Function<com.commercetools.importapi.models.common.DiscountedPriceBuilder, com.commercetools.importapi.models.common.DiscountedPriceBuilder> builder) {
        this.discounted = builder.apply(com.commercetools.importapi.models.common.DiscountedPriceBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Sets a discounted price from an external service.</p>
     * @param builder function to build the discounted value
     * @return Builder
     */

    public PriceImportBuilder withDiscounted(
            Function<com.commercetools.importapi.models.common.DiscountedPriceBuilder, com.commercetools.importapi.models.common.DiscountedPrice> builder) {
        this.discounted = builder.apply(com.commercetools.importapi.models.common.DiscountedPriceBuilder.of());
        return this;
    }

    /**
     *  <p>Sets a discounted price from an external service.</p>
     * @param discounted value to be set
     * @return Builder
     */

    public PriceImportBuilder discounted(
            @Nullable final com.commercetools.importapi.models.common.DiscountedPrice discounted) {
        this.discounted = discounted;
        return this;
    }

    /**
     *  <ul>
     *   <li>Set to <code>false</code> to update both the current and staged projections of the Product with the new Price data.</li>
     *   <li>Leave empty or set to <code>true</code> to only update the staged projection.</li>
     *  </ul>
     * @param staged value to be set
     * @return Builder
     */

    public PriceImportBuilder staged(@Nullable final Boolean staged) {
        this.staged = staged;
        return this;
    }

    /**
     *  <p>The tiered prices for this price.</p>
     * @param tiers value to be set
     * @return Builder
     */

    public PriceImportBuilder tiers(@Nullable final com.commercetools.importapi.models.common.PriceTier... tiers) {
        this.tiers = new ArrayList<>(Arrays.asList(tiers));
        return this;
    }

    /**
     *  <p>The tiered prices for this price.</p>
     * @param tiers value to be set
     * @return Builder
     */

    public PriceImportBuilder tiers(
            @Nullable final java.util.List<com.commercetools.importapi.models.common.PriceTier> tiers) {
        this.tiers = tiers;
        return this;
    }

    /**
     *  <p>The tiered prices for this price.</p>
     * @param tiers value to be set
     * @return Builder
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
     * @param builder function to build the tiers value
     * @return Builder
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
     * @param builder function to build the tiers value
     * @return Builder
     */

    public PriceImportBuilder withTiers(
            Function<com.commercetools.importapi.models.common.PriceTierBuilder, com.commercetools.importapi.models.common.PriceTierBuilder> builder) {
        this.tiers = new ArrayList<>();
        this.tiers.add(builder.apply(com.commercetools.importapi.models.common.PriceTierBuilder.of()).build());
        return this;
    }

    /**
     *  <p>The tiered prices for this price.</p>
     * @param builder function to build the tiers value
     * @return Builder
     */

    public PriceImportBuilder addTiers(
            Function<com.commercetools.importapi.models.common.PriceTierBuilder, com.commercetools.importapi.models.common.PriceTier> builder) {
        return plusTiers(builder.apply(com.commercetools.importapi.models.common.PriceTierBuilder.of()));
    }

    /**
     *  <p>The tiered prices for this price.</p>
     * @param builder function to build the tiers value
     * @return Builder
     */

    public PriceImportBuilder setTiers(
            Function<com.commercetools.importapi.models.common.PriceTierBuilder, com.commercetools.importapi.models.common.PriceTier> builder) {
        return tiers(builder.apply(com.commercetools.importapi.models.common.PriceTierBuilder.of()));
    }

    /**
     *  <p>The custom fields for this price.</p>
     * @param builder function to build the custom value
     * @return Builder
     */

    public PriceImportBuilder custom(
            Function<com.commercetools.importapi.models.customfields.CustomBuilder, com.commercetools.importapi.models.customfields.CustomBuilder> builder) {
        this.custom = builder.apply(com.commercetools.importapi.models.customfields.CustomBuilder.of()).build();
        return this;
    }

    /**
     *  <p>The custom fields for this price.</p>
     * @param builder function to build the custom value
     * @return Builder
     */

    public PriceImportBuilder withCustom(
            Function<com.commercetools.importapi.models.customfields.CustomBuilder, com.commercetools.importapi.models.customfields.Custom> builder) {
        this.custom = builder.apply(com.commercetools.importapi.models.customfields.CustomBuilder.of());
        return this;
    }

    /**
     *  <p>The custom fields for this price.</p>
     * @param custom value to be set
     * @return Builder
     */

    public PriceImportBuilder custom(@Nullable final com.commercetools.importapi.models.customfields.Custom custom) {
        this.custom = custom;
        return this;
    }

    /**
     *  <p>The ProductVariant in which this Embedded Price is contained. The Reference to the ProductVariant with which the Price is associated. If referenced ProductVariant does not exist, the <code>state</code> of the ImportOperation will be set to <code>unresolved</code> until the necessary ProductVariant is created.</p>
     * @param builder function to build the productVariant value
     * @return Builder
     */

    public PriceImportBuilder productVariant(
            Function<com.commercetools.importapi.models.common.ProductVariantKeyReferenceBuilder, com.commercetools.importapi.models.common.ProductVariantKeyReferenceBuilder> builder) {
        this.productVariant = builder
                .apply(com.commercetools.importapi.models.common.ProductVariantKeyReferenceBuilder.of())
                .build();
        return this;
    }

    /**
     *  <p>The ProductVariant in which this Embedded Price is contained. The Reference to the ProductVariant with which the Price is associated. If referenced ProductVariant does not exist, the <code>state</code> of the ImportOperation will be set to <code>unresolved</code> until the necessary ProductVariant is created.</p>
     * @param builder function to build the productVariant value
     * @return Builder
     */

    public PriceImportBuilder withProductVariant(
            Function<com.commercetools.importapi.models.common.ProductVariantKeyReferenceBuilder, com.commercetools.importapi.models.common.ProductVariantKeyReference> builder) {
        this.productVariant = builder
                .apply(com.commercetools.importapi.models.common.ProductVariantKeyReferenceBuilder.of());
        return this;
    }

    /**
     *  <p>The ProductVariant in which this Embedded Price is contained. The Reference to the ProductVariant with which the Price is associated. If referenced ProductVariant does not exist, the <code>state</code> of the ImportOperation will be set to <code>unresolved</code> until the necessary ProductVariant is created.</p>
     * @param productVariant value to be set
     * @return Builder
     */

    public PriceImportBuilder productVariant(
            final com.commercetools.importapi.models.common.ProductVariantKeyReference productVariant) {
        this.productVariant = productVariant;
        return this;
    }

    /**
     *  <p>The Product in which the Product Variant containing this Embedded Price is contained. Maps to <code>ProductVariant.product</code>. The Reference to the Product with which the Price is associated. If referenced Product does not exist, the <code>state</code> of the ImportOperation will be set to <code>unresolved</code> until the necessary Product is created.</p>
     * @param builder function to build the product value
     * @return Builder
     */

    public PriceImportBuilder product(
            Function<com.commercetools.importapi.models.common.ProductKeyReferenceBuilder, com.commercetools.importapi.models.common.ProductKeyReferenceBuilder> builder) {
        this.product = builder.apply(com.commercetools.importapi.models.common.ProductKeyReferenceBuilder.of()).build();
        return this;
    }

    /**
     *  <p>The Product in which the Product Variant containing this Embedded Price is contained. Maps to <code>ProductVariant.product</code>. The Reference to the Product with which the Price is associated. If referenced Product does not exist, the <code>state</code> of the ImportOperation will be set to <code>unresolved</code> until the necessary Product is created.</p>
     * @param builder function to build the product value
     * @return Builder
     */

    public PriceImportBuilder withProduct(
            Function<com.commercetools.importapi.models.common.ProductKeyReferenceBuilder, com.commercetools.importapi.models.common.ProductKeyReference> builder) {
        this.product = builder.apply(com.commercetools.importapi.models.common.ProductKeyReferenceBuilder.of());
        return this;
    }

    /**
     *  <p>The Product in which the Product Variant containing this Embedded Price is contained. Maps to <code>ProductVariant.product</code>. The Reference to the Product with which the Price is associated. If referenced Product does not exist, the <code>state</code> of the ImportOperation will be set to <code>unresolved</code> until the necessary Product is created.</p>
     * @param product value to be set
     * @return Builder
     */

    public PriceImportBuilder product(final com.commercetools.importapi.models.common.ProductKeyReference product) {
        this.product = product;
        return this;
    }

    /**
     *  <p>User-defined unique identifier for the Embedded Price. If a Price with this <code>key</code> exists on the specified <code>productVariant</code>, it will be updated with the imported data.</p>
     * @return key
     */

    public String getKey() {
        return this.key;
    }

    /**
     *  <p>Maps to <code>Price.value</code>.</p>
     * @return value
     */

    public com.commercetools.importapi.models.common.TypedMoney getValue() {
        return this.value;
    }

    /**
     *  <p>Maps to <code>Price.county</code>.</p>
     * @return country
     */

    @Nullable
    public String getCountry() {
        return this.country;
    }

    /**
     *  <p>Maps to <code>Price.validFrom</code>.</p>
     * @return validFrom
     */

    @Nullable
    public java.time.ZonedDateTime getValidFrom() {
        return this.validFrom;
    }

    /**
     *  <p>Maps to <code>Price.validUntil</code>.</p>
     * @return validUntil
     */

    @Nullable
    public java.time.ZonedDateTime getValidUntil() {
        return this.validUntil;
    }

    /**
     *  <p>The Reference to the CustomerGroup with which the Price is associated. If referenced CustomerGroup does not exist, the <code>state</code> of the ImportOperation will be set to <code>unresolved</code> until the necessary CustomerGroup is created.</p>
     * @return customerGroup
     */

    @Nullable
    public com.commercetools.importapi.models.common.CustomerGroupKeyReference getCustomerGroup() {
        return this.customerGroup;
    }

    /**
     *  <p>The Reference to the Channel with which the Price is associated. If referenced Channel does not exist, the <code>state</code> of the ImportOperation will be set to <code>unresolved</code> until the necessary Channel is created.</p>
     * @return channel
     */

    @Nullable
    public com.commercetools.importapi.models.common.ChannelKeyReference getChannel() {
        return this.channel;
    }

    /**
     *  <p>Sets a discounted price from an external service.</p>
     * @return discounted
     */

    @Nullable
    public com.commercetools.importapi.models.common.DiscountedPrice getDiscounted() {
        return this.discounted;
    }

    /**
     *  <ul>
     *   <li>Set to <code>false</code> to update both the current and staged projections of the Product with the new Price data.</li>
     *   <li>Leave empty or set to <code>true</code> to only update the staged projection.</li>
     *  </ul>
     * @return staged
     */

    @Nullable
    public Boolean getStaged() {
        return this.staged;
    }

    /**
     *  <p>The tiered prices for this price.</p>
     * @return tiers
     */

    @Nullable
    public java.util.List<com.commercetools.importapi.models.common.PriceTier> getTiers() {
        return this.tiers;
    }

    /**
     *  <p>The custom fields for this price.</p>
     * @return custom
     */

    @Nullable
    public com.commercetools.importapi.models.customfields.Custom getCustom() {
        return this.custom;
    }

    /**
     *  <p>The ProductVariant in which this Embedded Price is contained. The Reference to the ProductVariant with which the Price is associated. If referenced ProductVariant does not exist, the <code>state</code> of the ImportOperation will be set to <code>unresolved</code> until the necessary ProductVariant is created.</p>
     * @return productVariant
     */

    public com.commercetools.importapi.models.common.ProductVariantKeyReference getProductVariant() {
        return this.productVariant;
    }

    /**
     *  <p>The Product in which the Product Variant containing this Embedded Price is contained. Maps to <code>ProductVariant.product</code>. The Reference to the Product with which the Price is associated. If referenced Product does not exist, the <code>state</code> of the ImportOperation will be set to <code>unresolved</code> until the necessary Product is created.</p>
     * @return product
     */

    public com.commercetools.importapi.models.common.ProductKeyReference getProduct() {
        return this.product;
    }

    /**
     * builds PriceImport with checking for non-null required values
     * @return PriceImport
     */
    public PriceImport build() {
        Objects.requireNonNull(key, PriceImport.class + ": key is missing");
        Objects.requireNonNull(value, PriceImport.class + ": value is missing");
        Objects.requireNonNull(productVariant, PriceImport.class + ": productVariant is missing");
        Objects.requireNonNull(product, PriceImport.class + ": product is missing");
        return new PriceImportImpl(key, value, country, validFrom, validUntil, customerGroup, channel, discounted,
            staged, tiers, custom, productVariant, product);
    }

    /**
     * builds PriceImport without checking for non-null required values
     * @return PriceImport
     */
    public PriceImport buildUnchecked() {
        return new PriceImportImpl(key, value, country, validFrom, validUntil, customerGroup, channel, discounted,
            staged, tiers, custom, productVariant, product);
    }

    /**
     * factory method for an instance of PriceImportBuilder
     * @return builder
     */
    public static PriceImportBuilder of() {
        return new PriceImportBuilder();
    }

    /**
     * create builder for PriceImport instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
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
        builder.staged = template.getStaged();
        builder.tiers = template.getTiers();
        builder.custom = template.getCustom();
        builder.productVariant = template.getProductVariant();
        builder.product = template.getProduct();
        return builder;
    }

}
