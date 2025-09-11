
package com.commercetools.importapi.models.standalone_prices;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * StandalonePriceImportBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     StandalonePriceImport standalonePriceImport = StandalonePriceImport.builder()
 *             .key("{key}")
 *             .sku("{sku}")
 *             .value(valueBuilder -> valueBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class StandalonePriceImportBuilder implements Builder<StandalonePriceImport> {

    private String key;

    private String sku;

    private com.commercetools.importapi.models.common.TypedMoney value;

    @Nullable
    private String country;

    @Nullable
    private com.commercetools.importapi.models.common.CustomerGroupKeyReference customerGroup;

    @Nullable
    private com.commercetools.importapi.models.common.ChannelKeyReference channel;

    @Nullable
    private java.time.ZonedDateTime validFrom;

    @Nullable
    private java.time.ZonedDateTime validUntil;

    @Nullable
    private java.util.List<com.commercetools.importapi.models.common.PriceTier> tiers;

    @Nullable
    private com.commercetools.importapi.models.common.DiscountedPrice discounted;

    @Nullable
    private com.commercetools.importapi.models.customfields.Custom custom;

    /**
     *  <p>User-defined unique identifier for the StandalonePrice. If a <a href="https://docs.commercetools.com/apis/ctp:api:type:StandalonePrice" rel="nofollow">StandalonePrice</a>) with this <code>key</code> exists, it is updated with the imported data.</p>
     * @param key value to be set
     * @return Builder
     */

    public StandalonePriceImportBuilder key(final String key) {
        this.key = key;
        return this;
    }

    /**
     *  <p>Maps to <code>StandalonePrice.sku</code>. This value is not validated to exist in Product Variants.</p>
     * @param sku value to be set
     * @return Builder
     */

    public StandalonePriceImportBuilder sku(final String sku) {
        this.sku = sku;
        return this;
    }

    /**
     *  <p>Maps to <code>StandalonePrice.value</code>.</p>
     * @param value value to be set
     * @return Builder
     */

    public StandalonePriceImportBuilder value(final com.commercetools.importapi.models.common.TypedMoney value) {
        this.value = value;
        return this;
    }

    /**
     *  <p>Maps to <code>StandalonePrice.value</code>.</p>
     * @param builder function to build the value value
     * @return Builder
     */

    public StandalonePriceImportBuilder value(
            Function<com.commercetools.importapi.models.common.TypedMoneyBuilder, Builder<? extends com.commercetools.importapi.models.common.TypedMoney>> builder) {
        this.value = builder.apply(com.commercetools.importapi.models.common.TypedMoneyBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Maps to <code>StandalonePrice.country</code>. This value cannot be updated. Attempting to update this value will result in an <span>InvalidFieldsUpdate</span> error.</p>
     * @param country value to be set
     * @return Builder
     */

    public StandalonePriceImportBuilder country(@Nullable final String country) {
        this.country = country;
        return this;
    }

    /**
     *  <p>Maps to <code>StandalonePrice.customerGroup</code>. If the referenced <a href="https://docs.commercetools.com/apis/ctp:api:type:CustomerGroup" rel="nofollow">CustomerGroup</a> does not exist, the <code>state</code> of the <a href="https://docs.commercetools.com/apis/ctp:import:type:ImportOperation" rel="nofollow">ImportOperation</a> will be set to <code>unresolved</code> until the referenced CustomerGroup is created.</p>
     *  <p>This value cannot be updated. Attempting to update this value will result in an <span>InvalidFieldsUpdate</span> error.</p>
     * @param builder function to build the customerGroup value
     * @return Builder
     */

    public StandalonePriceImportBuilder customerGroup(
            Function<com.commercetools.importapi.models.common.CustomerGroupKeyReferenceBuilder, com.commercetools.importapi.models.common.CustomerGroupKeyReferenceBuilder> builder) {
        this.customerGroup = builder
                .apply(com.commercetools.importapi.models.common.CustomerGroupKeyReferenceBuilder.of())
                .build();
        return this;
    }

    /**
     *  <p>Maps to <code>StandalonePrice.customerGroup</code>. If the referenced <a href="https://docs.commercetools.com/apis/ctp:api:type:CustomerGroup" rel="nofollow">CustomerGroup</a> does not exist, the <code>state</code> of the <a href="https://docs.commercetools.com/apis/ctp:import:type:ImportOperation" rel="nofollow">ImportOperation</a> will be set to <code>unresolved</code> until the referenced CustomerGroup is created.</p>
     *  <p>This value cannot be updated. Attempting to update this value will result in an <span>InvalidFieldsUpdate</span> error.</p>
     * @param builder function to build the customerGroup value
     * @return Builder
     */

    public StandalonePriceImportBuilder withCustomerGroup(
            Function<com.commercetools.importapi.models.common.CustomerGroupKeyReferenceBuilder, com.commercetools.importapi.models.common.CustomerGroupKeyReference> builder) {
        this.customerGroup = builder
                .apply(com.commercetools.importapi.models.common.CustomerGroupKeyReferenceBuilder.of());
        return this;
    }

    /**
     *  <p>Maps to <code>StandalonePrice.customerGroup</code>. If the referenced <a href="https://docs.commercetools.com/apis/ctp:api:type:CustomerGroup" rel="nofollow">CustomerGroup</a> does not exist, the <code>state</code> of the <a href="https://docs.commercetools.com/apis/ctp:import:type:ImportOperation" rel="nofollow">ImportOperation</a> will be set to <code>unresolved</code> until the referenced CustomerGroup is created.</p>
     *  <p>This value cannot be updated. Attempting to update this value will result in an <span>InvalidFieldsUpdate</span> error.</p>
     * @param customerGroup value to be set
     * @return Builder
     */

    public StandalonePriceImportBuilder customerGroup(
            @Nullable final com.commercetools.importapi.models.common.CustomerGroupKeyReference customerGroup) {
        this.customerGroup = customerGroup;
        return this;
    }

    /**
     *  <p>Maps to <code>StandalonePrice.channel</code>. If the referenced <a href="https://docs.commercetools.com/apis/ctp:api:type:Channel" rel="nofollow">Channel</a> does not exist, the <code>state</code> of the <a href="https://docs.commercetools.com/apis/ctp:import:type:ImportOperation" rel="nofollow">ImportOperation</a> will be set to <code>unresolved</code> until the referenced Channel is created.</p>
     *  <p>This value cannot be updated. Attempting to update this value will result in an <span>InvalidFieldsUpdate</span> error.</p>
     * @param builder function to build the channel value
     * @return Builder
     */

    public StandalonePriceImportBuilder channel(
            Function<com.commercetools.importapi.models.common.ChannelKeyReferenceBuilder, com.commercetools.importapi.models.common.ChannelKeyReferenceBuilder> builder) {
        this.channel = builder.apply(com.commercetools.importapi.models.common.ChannelKeyReferenceBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Maps to <code>StandalonePrice.channel</code>. If the referenced <a href="https://docs.commercetools.com/apis/ctp:api:type:Channel" rel="nofollow">Channel</a> does not exist, the <code>state</code> of the <a href="https://docs.commercetools.com/apis/ctp:import:type:ImportOperation" rel="nofollow">ImportOperation</a> will be set to <code>unresolved</code> until the referenced Channel is created.</p>
     *  <p>This value cannot be updated. Attempting to update this value will result in an <span>InvalidFieldsUpdate</span> error.</p>
     * @param builder function to build the channel value
     * @return Builder
     */

    public StandalonePriceImportBuilder withChannel(
            Function<com.commercetools.importapi.models.common.ChannelKeyReferenceBuilder, com.commercetools.importapi.models.common.ChannelKeyReference> builder) {
        this.channel = builder.apply(com.commercetools.importapi.models.common.ChannelKeyReferenceBuilder.of());
        return this;
    }

    /**
     *  <p>Maps to <code>StandalonePrice.channel</code>. If the referenced <a href="https://docs.commercetools.com/apis/ctp:api:type:Channel" rel="nofollow">Channel</a> does not exist, the <code>state</code> of the <a href="https://docs.commercetools.com/apis/ctp:import:type:ImportOperation" rel="nofollow">ImportOperation</a> will be set to <code>unresolved</code> until the referenced Channel is created.</p>
     *  <p>This value cannot be updated. Attempting to update this value will result in an <span>InvalidFieldsUpdate</span> error.</p>
     * @param channel value to be set
     * @return Builder
     */

    public StandalonePriceImportBuilder channel(
            @Nullable final com.commercetools.importapi.models.common.ChannelKeyReference channel) {
        this.channel = channel;
        return this;
    }

    /**
     *  <p>Maps to <code>StandalonePrice.validFrom</code>.</p>
     * @param validFrom value to be set
     * @return Builder
     */

    public StandalonePriceImportBuilder validFrom(@Nullable final java.time.ZonedDateTime validFrom) {
        this.validFrom = validFrom;
        return this;
    }

    /**
     *  <p>Maps to <code>StandalonePrice.validUntil</code>.</p>
     * @param validUntil value to be set
     * @return Builder
     */

    public StandalonePriceImportBuilder validUntil(@Nullable final java.time.ZonedDateTime validUntil) {
        this.validUntil = validUntil;
        return this;
    }

    /**
     *  <p>Maps to <code>StandalonePrice.tiers</code>.</p>
     * @param tiers value to be set
     * @return Builder
     */

    public StandalonePriceImportBuilder tiers(
            @Nullable final com.commercetools.importapi.models.common.PriceTier... tiers) {
        this.tiers = new ArrayList<>(Arrays.asList(tiers));
        return this;
    }

    /**
     *  <p>Maps to <code>StandalonePrice.tiers</code>.</p>
     * @param tiers value to be set
     * @return Builder
     */

    public StandalonePriceImportBuilder tiers(
            @Nullable final java.util.List<com.commercetools.importapi.models.common.PriceTier> tiers) {
        this.tiers = tiers;
        return this;
    }

    /**
     *  <p>Maps to <code>StandalonePrice.tiers</code>.</p>
     * @param tiers value to be set
     * @return Builder
     */

    public StandalonePriceImportBuilder plusTiers(
            @Nullable final com.commercetools.importapi.models.common.PriceTier... tiers) {
        if (this.tiers == null) {
            this.tiers = new ArrayList<>();
        }
        this.tiers.addAll(Arrays.asList(tiers));
        return this;
    }

    /**
     *  <p>Maps to <code>StandalonePrice.tiers</code>.</p>
     * @param builder function to build the tiers value
     * @return Builder
     */

    public StandalonePriceImportBuilder plusTiers(
            Function<com.commercetools.importapi.models.common.PriceTierBuilder, com.commercetools.importapi.models.common.PriceTierBuilder> builder) {
        if (this.tiers == null) {
            this.tiers = new ArrayList<>();
        }
        this.tiers.add(builder.apply(com.commercetools.importapi.models.common.PriceTierBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Maps to <code>StandalonePrice.tiers</code>.</p>
     * @param builder function to build the tiers value
     * @return Builder
     */

    public StandalonePriceImportBuilder withTiers(
            Function<com.commercetools.importapi.models.common.PriceTierBuilder, com.commercetools.importapi.models.common.PriceTierBuilder> builder) {
        this.tiers = new ArrayList<>();
        this.tiers.add(builder.apply(com.commercetools.importapi.models.common.PriceTierBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Maps to <code>StandalonePrice.tiers</code>.</p>
     * @param builder function to build the tiers value
     * @return Builder
     */

    public StandalonePriceImportBuilder addTiers(
            Function<com.commercetools.importapi.models.common.PriceTierBuilder, com.commercetools.importapi.models.common.PriceTier> builder) {
        return plusTiers(builder.apply(com.commercetools.importapi.models.common.PriceTierBuilder.of()));
    }

    /**
     *  <p>Maps to <code>StandalonePrice.tiers</code>.</p>
     * @param builder function to build the tiers value
     * @return Builder
     */

    public StandalonePriceImportBuilder setTiers(
            Function<com.commercetools.importapi.models.common.PriceTierBuilder, com.commercetools.importapi.models.common.PriceTier> builder) {
        return tiers(builder.apply(com.commercetools.importapi.models.common.PriceTierBuilder.of()));
    }

    /**
     *  <p>Sets a discounted price for this Price that is different from the base price with value.</p>
     * @param builder function to build the discounted value
     * @return Builder
     */

    public StandalonePriceImportBuilder discounted(
            Function<com.commercetools.importapi.models.common.DiscountedPriceBuilder, com.commercetools.importapi.models.common.DiscountedPriceBuilder> builder) {
        this.discounted = builder.apply(com.commercetools.importapi.models.common.DiscountedPriceBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Sets a discounted price for this Price that is different from the base price with value.</p>
     * @param builder function to build the discounted value
     * @return Builder
     */

    public StandalonePriceImportBuilder withDiscounted(
            Function<com.commercetools.importapi.models.common.DiscountedPriceBuilder, com.commercetools.importapi.models.common.DiscountedPrice> builder) {
        this.discounted = builder.apply(com.commercetools.importapi.models.common.DiscountedPriceBuilder.of());
        return this;
    }

    /**
     *  <p>Sets a discounted price for this Price that is different from the base price with value.</p>
     * @param discounted value to be set
     * @return Builder
     */

    public StandalonePriceImportBuilder discounted(
            @Nullable final com.commercetools.importapi.models.common.DiscountedPrice discounted) {
        this.discounted = discounted;
        return this;
    }

    /**
     *  <p>Maps to <code>StandalonePrice.custom</code>.</p>
     * @param builder function to build the custom value
     * @return Builder
     */

    public StandalonePriceImportBuilder custom(
            Function<com.commercetools.importapi.models.customfields.CustomBuilder, com.commercetools.importapi.models.customfields.CustomBuilder> builder) {
        this.custom = builder.apply(com.commercetools.importapi.models.customfields.CustomBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Maps to <code>StandalonePrice.custom</code>.</p>
     * @param builder function to build the custom value
     * @return Builder
     */

    public StandalonePriceImportBuilder withCustom(
            Function<com.commercetools.importapi.models.customfields.CustomBuilder, com.commercetools.importapi.models.customfields.Custom> builder) {
        this.custom = builder.apply(com.commercetools.importapi.models.customfields.CustomBuilder.of());
        return this;
    }

    /**
     *  <p>Maps to <code>StandalonePrice.custom</code>.</p>
     * @param custom value to be set
     * @return Builder
     */

    public StandalonePriceImportBuilder custom(
            @Nullable final com.commercetools.importapi.models.customfields.Custom custom) {
        this.custom = custom;
        return this;
    }

    /**
     *  <p>User-defined unique identifier for the StandalonePrice. If a <a href="https://docs.commercetools.com/apis/ctp:api:type:StandalonePrice" rel="nofollow">StandalonePrice</a>) with this <code>key</code> exists, it is updated with the imported data.</p>
     * @return key
     */

    public String getKey() {
        return this.key;
    }

    /**
     *  <p>Maps to <code>StandalonePrice.sku</code>. This value is not validated to exist in Product Variants.</p>
     * @return sku
     */

    public String getSku() {
        return this.sku;
    }

    /**
     *  <p>Maps to <code>StandalonePrice.value</code>.</p>
     * @return value
     */

    public com.commercetools.importapi.models.common.TypedMoney getValue() {
        return this.value;
    }

    /**
     *  <p>Maps to <code>StandalonePrice.country</code>. This value cannot be updated. Attempting to update this value will result in an <span>InvalidFieldsUpdate</span> error.</p>
     * @return country
     */

    @Nullable
    public String getCountry() {
        return this.country;
    }

    /**
     *  <p>Maps to <code>StandalonePrice.customerGroup</code>. If the referenced <a href="https://docs.commercetools.com/apis/ctp:api:type:CustomerGroup" rel="nofollow">CustomerGroup</a> does not exist, the <code>state</code> of the <a href="https://docs.commercetools.com/apis/ctp:import:type:ImportOperation" rel="nofollow">ImportOperation</a> will be set to <code>unresolved</code> until the referenced CustomerGroup is created.</p>
     *  <p>This value cannot be updated. Attempting to update this value will result in an <span>InvalidFieldsUpdate</span> error.</p>
     * @return customerGroup
     */

    @Nullable
    public com.commercetools.importapi.models.common.CustomerGroupKeyReference getCustomerGroup() {
        return this.customerGroup;
    }

    /**
     *  <p>Maps to <code>StandalonePrice.channel</code>. If the referenced <a href="https://docs.commercetools.com/apis/ctp:api:type:Channel" rel="nofollow">Channel</a> does not exist, the <code>state</code> of the <a href="https://docs.commercetools.com/apis/ctp:import:type:ImportOperation" rel="nofollow">ImportOperation</a> will be set to <code>unresolved</code> until the referenced Channel is created.</p>
     *  <p>This value cannot be updated. Attempting to update this value will result in an <span>InvalidFieldsUpdate</span> error.</p>
     * @return channel
     */

    @Nullable
    public com.commercetools.importapi.models.common.ChannelKeyReference getChannel() {
        return this.channel;
    }

    /**
     *  <p>Maps to <code>StandalonePrice.validFrom</code>.</p>
     * @return validFrom
     */

    @Nullable
    public java.time.ZonedDateTime getValidFrom() {
        return this.validFrom;
    }

    /**
     *  <p>Maps to <code>StandalonePrice.validUntil</code>.</p>
     * @return validUntil
     */

    @Nullable
    public java.time.ZonedDateTime getValidUntil() {
        return this.validUntil;
    }

    /**
     *  <p>Maps to <code>StandalonePrice.tiers</code>.</p>
     * @return tiers
     */

    @Nullable
    public java.util.List<com.commercetools.importapi.models.common.PriceTier> getTiers() {
        return this.tiers;
    }

    /**
     *  <p>Sets a discounted price for this Price that is different from the base price with value.</p>
     * @return discounted
     */

    @Nullable
    public com.commercetools.importapi.models.common.DiscountedPrice getDiscounted() {
        return this.discounted;
    }

    /**
     *  <p>Maps to <code>StandalonePrice.custom</code>.</p>
     * @return custom
     */

    @Nullable
    public com.commercetools.importapi.models.customfields.Custom getCustom() {
        return this.custom;
    }

    /**
     * builds StandalonePriceImport with checking for non-null required values
     * @return StandalonePriceImport
     */
    public StandalonePriceImport build() {
        Objects.requireNonNull(key, StandalonePriceImport.class + ": key is missing");
        Objects.requireNonNull(sku, StandalonePriceImport.class + ": sku is missing");
        Objects.requireNonNull(value, StandalonePriceImport.class + ": value is missing");
        return new StandalonePriceImportImpl(key, sku, value, country, customerGroup, channel, validFrom, validUntil,
            tiers, discounted, custom);
    }

    /**
     * builds StandalonePriceImport without checking for non-null required values
     * @return StandalonePriceImport
     */
    public StandalonePriceImport buildUnchecked() {
        return new StandalonePriceImportImpl(key, sku, value, country, customerGroup, channel, validFrom, validUntil,
            tiers, discounted, custom);
    }

    /**
     * factory method for an instance of StandalonePriceImportBuilder
     * @return builder
     */
    public static StandalonePriceImportBuilder of() {
        return new StandalonePriceImportBuilder();
    }

    /**
     * create builder for StandalonePriceImport instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static StandalonePriceImportBuilder of(final StandalonePriceImport template) {
        StandalonePriceImportBuilder builder = new StandalonePriceImportBuilder();
        builder.key = template.getKey();
        builder.sku = template.getSku();
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
