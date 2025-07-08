
package com.commercetools.importapi.models.productdrafts;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * PriceDraftImportBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     PriceDraftImport priceDraftImport = PriceDraftImport.builder()
 *             .value(valueBuilder -> valueBuilder)
 *             .key("{key}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class PriceDraftImportBuilder implements Builder<PriceDraftImport> {

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
    private com.commercetools.importapi.models.customfields.Custom custom;

    @Nullable
    private com.commercetools.importapi.models.common.DiscountedPrice discounted;

    @Nullable
    private java.util.List<com.commercetools.importapi.models.common.PriceTier> tiers;

    private String key;

    /**
     *  <p>Money value of this Price.</p>
     * @param value value to be set
     * @return Builder
     */

    public PriceDraftImportBuilder value(final com.commercetools.importapi.models.common.TypedMoney value) {
        this.value = value;
        return this;
    }

    /**
     *  <p>Money value of this Price.</p>
     * @param builder function to build the value value
     * @return Builder
     */

    public PriceDraftImportBuilder value(
            Function<com.commercetools.importapi.models.common.TypedMoneyBuilder, Builder<? extends com.commercetools.importapi.models.common.TypedMoney>> builder) {
        this.value = builder.apply(com.commercetools.importapi.models.common.TypedMoneyBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Set this field if this Price is only valid for the specified country.</p>
     * @param country value to be set
     * @return Builder
     */

    public PriceDraftImportBuilder country(@Nullable final String country) {
        this.country = country;
        return this;
    }

    /**
     *  <p>Set this field if this Price is only valid for the referenced CustomerGroup. If the referenced CustomerGroup does not exist, the <code>state</code> of the ImportOperation will be set to <code>unresolved</code> until the referenced CustomerGroup is created.</p>
     * @param builder function to build the customerGroup value
     * @return Builder
     */

    public PriceDraftImportBuilder customerGroup(
            Function<com.commercetools.importapi.models.common.CustomerGroupKeyReferenceBuilder, com.commercetools.importapi.models.common.CustomerGroupKeyReferenceBuilder> builder) {
        this.customerGroup = builder
                .apply(com.commercetools.importapi.models.common.CustomerGroupKeyReferenceBuilder.of())
                .build();
        return this;
    }

    /**
     *  <p>Set this field if this Price is only valid for the referenced CustomerGroup. If the referenced CustomerGroup does not exist, the <code>state</code> of the ImportOperation will be set to <code>unresolved</code> until the referenced CustomerGroup is created.</p>
     * @param builder function to build the customerGroup value
     * @return Builder
     */

    public PriceDraftImportBuilder withCustomerGroup(
            Function<com.commercetools.importapi.models.common.CustomerGroupKeyReferenceBuilder, com.commercetools.importapi.models.common.CustomerGroupKeyReference> builder) {
        this.customerGroup = builder
                .apply(com.commercetools.importapi.models.common.CustomerGroupKeyReferenceBuilder.of());
        return this;
    }

    /**
     *  <p>Set this field if this Price is only valid for the referenced CustomerGroup. If the referenced CustomerGroup does not exist, the <code>state</code> of the ImportOperation will be set to <code>unresolved</code> until the referenced CustomerGroup is created.</p>
     * @param customerGroup value to be set
     * @return Builder
     */

    public PriceDraftImportBuilder customerGroup(
            @Nullable final com.commercetools.importapi.models.common.CustomerGroupKeyReference customerGroup) {
        this.customerGroup = customerGroup;
        return this;
    }

    /**
     *  <p>Set this field if this Price is only valid for the referenced <code>ProductDistribution</code> Channel. If the referenced Channel does not exist, the <code>state</code> of the ImportOperation will be set to <code>unresolved</code> until the referenced Channel is created.</p>
     * @param builder function to build the channel value
     * @return Builder
     */

    public PriceDraftImportBuilder channel(
            Function<com.commercetools.importapi.models.common.ChannelKeyReferenceBuilder, com.commercetools.importapi.models.common.ChannelKeyReferenceBuilder> builder) {
        this.channel = builder.apply(com.commercetools.importapi.models.common.ChannelKeyReferenceBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Set this field if this Price is only valid for the referenced <code>ProductDistribution</code> Channel. If the referenced Channel does not exist, the <code>state</code> of the ImportOperation will be set to <code>unresolved</code> until the referenced Channel is created.</p>
     * @param builder function to build the channel value
     * @return Builder
     */

    public PriceDraftImportBuilder withChannel(
            Function<com.commercetools.importapi.models.common.ChannelKeyReferenceBuilder, com.commercetools.importapi.models.common.ChannelKeyReference> builder) {
        this.channel = builder.apply(com.commercetools.importapi.models.common.ChannelKeyReferenceBuilder.of());
        return this;
    }

    /**
     *  <p>Set this field if this Price is only valid for the referenced <code>ProductDistribution</code> Channel. If the referenced Channel does not exist, the <code>state</code> of the ImportOperation will be set to <code>unresolved</code> until the referenced Channel is created.</p>
     * @param channel value to be set
     * @return Builder
     */

    public PriceDraftImportBuilder channel(
            @Nullable final com.commercetools.importapi.models.common.ChannelKeyReference channel) {
        this.channel = channel;
        return this;
    }

    /**
     *  <p>Set this field if this Price is only valid from the specified date and time. Must be at least 1 ms earlier than <code>validUntil</code>.</p>
     * @param validFrom value to be set
     * @return Builder
     */

    public PriceDraftImportBuilder validFrom(@Nullable final java.time.ZonedDateTime validFrom) {
        this.validFrom = validFrom;
        return this;
    }

    /**
     *  <p>Set this field if this Price is only valid until the specified date and time. Must be at least 1 ms later than <code>validFrom</code>.</p>
     * @param validUntil value to be set
     * @return Builder
     */

    public PriceDraftImportBuilder validUntil(@Nullable final java.time.ZonedDateTime validUntil) {
        this.validUntil = validUntil;
        return this;
    }

    /**
     *  <p>Custom Fields for the Embedded Price.</p>
     * @param builder function to build the custom value
     * @return Builder
     */

    public PriceDraftImportBuilder custom(
            Function<com.commercetools.importapi.models.customfields.CustomBuilder, com.commercetools.importapi.models.customfields.CustomBuilder> builder) {
        this.custom = builder.apply(com.commercetools.importapi.models.customfields.CustomBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Custom Fields for the Embedded Price.</p>
     * @param builder function to build the custom value
     * @return Builder
     */

    public PriceDraftImportBuilder withCustom(
            Function<com.commercetools.importapi.models.customfields.CustomBuilder, com.commercetools.importapi.models.customfields.Custom> builder) {
        this.custom = builder.apply(com.commercetools.importapi.models.customfields.CustomBuilder.of());
        return this;
    }

    /**
     *  <p>Custom Fields for the Embedded Price.</p>
     * @param custom value to be set
     * @return Builder
     */

    public PriceDraftImportBuilder custom(
            @Nullable final com.commercetools.importapi.models.customfields.Custom custom) {
        this.custom = custom;
        return this;
    }

    /**
     *  <p>Set this field to add a DiscountedPrice from an <strong>external service</strong>.</p>
     * @param builder function to build the discounted value
     * @return Builder
     */

    public PriceDraftImportBuilder discounted(
            Function<com.commercetools.importapi.models.common.DiscountedPriceBuilder, com.commercetools.importapi.models.common.DiscountedPriceBuilder> builder) {
        this.discounted = builder.apply(com.commercetools.importapi.models.common.DiscountedPriceBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Set this field to add a DiscountedPrice from an <strong>external service</strong>.</p>
     * @param builder function to build the discounted value
     * @return Builder
     */

    public PriceDraftImportBuilder withDiscounted(
            Function<com.commercetools.importapi.models.common.DiscountedPriceBuilder, com.commercetools.importapi.models.common.DiscountedPrice> builder) {
        this.discounted = builder.apply(com.commercetools.importapi.models.common.DiscountedPriceBuilder.of());
        return this;
    }

    /**
     *  <p>Set this field to add a DiscountedPrice from an <strong>external service</strong>.</p>
     * @param discounted value to be set
     * @return Builder
     */

    public PriceDraftImportBuilder discounted(
            @Nullable final com.commercetools.importapi.models.common.DiscountedPrice discounted) {
        this.discounted = discounted;
        return this;
    }

    /**
     *  <p>The tiered prices for this price.</p>
     * @param tiers value to be set
     * @return Builder
     */

    public PriceDraftImportBuilder tiers(@Nullable final com.commercetools.importapi.models.common.PriceTier... tiers) {
        this.tiers = new ArrayList<>(Arrays.asList(tiers));
        return this;
    }

    /**
     *  <p>The tiered prices for this price.</p>
     * @param tiers value to be set
     * @return Builder
     */

    public PriceDraftImportBuilder tiers(
            @Nullable final java.util.List<com.commercetools.importapi.models.common.PriceTier> tiers) {
        this.tiers = tiers;
        return this;
    }

    /**
     *  <p>The tiered prices for this price.</p>
     * @param tiers value to be set
     * @return Builder
     */

    public PriceDraftImportBuilder plusTiers(
            @Nullable final com.commercetools.importapi.models.common.PriceTier... tiers) {
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

    public PriceDraftImportBuilder plusTiers(
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

    public PriceDraftImportBuilder withTiers(
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

    public PriceDraftImportBuilder addTiers(
            Function<com.commercetools.importapi.models.common.PriceTierBuilder, com.commercetools.importapi.models.common.PriceTier> builder) {
        return plusTiers(builder.apply(com.commercetools.importapi.models.common.PriceTierBuilder.of()));
    }

    /**
     *  <p>The tiered prices for this price.</p>
     * @param builder function to build the tiers value
     * @return Builder
     */

    public PriceDraftImportBuilder setTiers(
            Function<com.commercetools.importapi.models.common.PriceTierBuilder, com.commercetools.importapi.models.common.PriceTier> builder) {
        return tiers(builder.apply(com.commercetools.importapi.models.common.PriceTierBuilder.of()));
    }

    /**
     *  <p>User-defined unique identifier for the Embedded Price.</p>
     * @param key value to be set
     * @return Builder
     */

    public PriceDraftImportBuilder key(final String key) {
        this.key = key;
        return this;
    }

    /**
     *  <p>Money value of this Price.</p>
     * @return value
     */

    public com.commercetools.importapi.models.common.TypedMoney getValue() {
        return this.value;
    }

    /**
     *  <p>Set this field if this Price is only valid for the specified country.</p>
     * @return country
     */

    @Nullable
    public String getCountry() {
        return this.country;
    }

    /**
     *  <p>Set this field if this Price is only valid for the referenced CustomerGroup. If the referenced CustomerGroup does not exist, the <code>state</code> of the ImportOperation will be set to <code>unresolved</code> until the referenced CustomerGroup is created.</p>
     * @return customerGroup
     */

    @Nullable
    public com.commercetools.importapi.models.common.CustomerGroupKeyReference getCustomerGroup() {
        return this.customerGroup;
    }

    /**
     *  <p>Set this field if this Price is only valid for the referenced <code>ProductDistribution</code> Channel. If the referenced Channel does not exist, the <code>state</code> of the ImportOperation will be set to <code>unresolved</code> until the referenced Channel is created.</p>
     * @return channel
     */

    @Nullable
    public com.commercetools.importapi.models.common.ChannelKeyReference getChannel() {
        return this.channel;
    }

    /**
     *  <p>Set this field if this Price is only valid from the specified date and time. Must be at least 1 ms earlier than <code>validUntil</code>.</p>
     * @return validFrom
     */

    @Nullable
    public java.time.ZonedDateTime getValidFrom() {
        return this.validFrom;
    }

    /**
     *  <p>Set this field if this Price is only valid until the specified date and time. Must be at least 1 ms later than <code>validFrom</code>.</p>
     * @return validUntil
     */

    @Nullable
    public java.time.ZonedDateTime getValidUntil() {
        return this.validUntil;
    }

    /**
     *  <p>Custom Fields for the Embedded Price.</p>
     * @return custom
     */

    @Nullable
    public com.commercetools.importapi.models.customfields.Custom getCustom() {
        return this.custom;
    }

    /**
     *  <p>Set this field to add a DiscountedPrice from an <strong>external service</strong>.</p>
     * @return discounted
     */

    @Nullable
    public com.commercetools.importapi.models.common.DiscountedPrice getDiscounted() {
        return this.discounted;
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
     *  <p>User-defined unique identifier for the Embedded Price.</p>
     * @return key
     */

    public String getKey() {
        return this.key;
    }

    /**
     * builds PriceDraftImport with checking for non-null required values
     * @return PriceDraftImport
     */
    public PriceDraftImport build() {
        Objects.requireNonNull(value, PriceDraftImport.class + ": value is missing");
        Objects.requireNonNull(key, PriceDraftImport.class + ": key is missing");
        return new PriceDraftImportImpl(value, country, customerGroup, channel, validFrom, validUntil, custom,
            discounted, tiers, key);
    }

    /**
     * builds PriceDraftImport without checking for non-null required values
     * @return PriceDraftImport
     */
    public PriceDraftImport buildUnchecked() {
        return new PriceDraftImportImpl(value, country, customerGroup, channel, validFrom, validUntil, custom,
            discounted, tiers, key);
    }

    /**
     * factory method for an instance of PriceDraftImportBuilder
     * @return builder
     */
    public static PriceDraftImportBuilder of() {
        return new PriceDraftImportBuilder();
    }

    /**
     * create builder for PriceDraftImport instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static PriceDraftImportBuilder of(final PriceDraftImport template) {
        PriceDraftImportBuilder builder = new PriceDraftImportBuilder();
        builder.value = template.getValue();
        builder.country = template.getCountry();
        builder.customerGroup = template.getCustomerGroup();
        builder.channel = template.getChannel();
        builder.validFrom = template.getValidFrom();
        builder.validUntil = template.getValidUntil();
        builder.custom = template.getCustom();
        builder.discounted = template.getDiscounted();
        builder.tiers = template.getTiers();
        builder.key = template.getKey();
        return builder;
    }

}
