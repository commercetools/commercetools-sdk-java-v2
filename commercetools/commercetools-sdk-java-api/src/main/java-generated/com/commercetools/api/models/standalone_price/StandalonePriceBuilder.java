
package com.commercetools.api.models.standalone_price;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * StandalonePriceBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     StandalonePrice standalonePrice = StandalonePrice.builder()
 *             .id("{id}")
 *             .version(0.3)
 *             .createdAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .lastModifiedAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .sku("{sku}")
 *             .value(valueBuilder -> valueBuilder)
 *             .active(true)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class StandalonePriceBuilder implements Builder<StandalonePrice> {

    private String id;

    private Long version;

    private java.time.ZonedDateTime createdAt;

    private java.time.ZonedDateTime lastModifiedAt;

    @Nullable
    private com.commercetools.api.models.common.LastModifiedBy lastModifiedBy;

    @Nullable
    private com.commercetools.api.models.common.CreatedBy createdBy;

    @Nullable
    private String key;

    private String sku;

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

    @Nullable
    private com.commercetools.api.models.standalone_price.StagedStandalonePrice staged;

    private Boolean active;

    /**
     *  <p>Unique identifier of the StandalonePrice.</p>
     * @param id value to be set
     * @return Builder
     */

    public StandalonePriceBuilder id(final String id) {
        this.id = id;
        return this;
    }

    /**
     *  <p>Current version of the StandalonePrice.</p>
     * @param version value to be set
     * @return Builder
     */

    public StandalonePriceBuilder version(final Long version) {
        this.version = version;
        return this;
    }

    /**
     *  <p>Date and time (UTC) the StandalonePrice was initially created.</p>
     * @param createdAt value to be set
     * @return Builder
     */

    public StandalonePriceBuilder createdAt(final java.time.ZonedDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     *  <p>Date and time (UTC) the StandalonePrice was last updated.</p>
     * @param lastModifiedAt value to be set
     * @return Builder
     */

    public StandalonePriceBuilder lastModifiedAt(final java.time.ZonedDateTime lastModifiedAt) {
        this.lastModifiedAt = lastModifiedAt;
        return this;
    }

    /**
     *  <p>Present on resources created after 1 February 2019 except for events not tracked.</p>
     * @param builder function to build the lastModifiedBy value
     * @return Builder
     */

    public StandalonePriceBuilder lastModifiedBy(
            Function<com.commercetools.api.models.common.LastModifiedByBuilder, com.commercetools.api.models.common.LastModifiedByBuilder> builder) {
        this.lastModifiedBy = builder.apply(com.commercetools.api.models.common.LastModifiedByBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Present on resources created after 1 February 2019 except for events not tracked.</p>
     * @param builder function to build the lastModifiedBy value
     * @return Builder
     */

    public StandalonePriceBuilder withLastModifiedBy(
            Function<com.commercetools.api.models.common.LastModifiedByBuilder, com.commercetools.api.models.common.LastModifiedBy> builder) {
        this.lastModifiedBy = builder.apply(com.commercetools.api.models.common.LastModifiedByBuilder.of());
        return this;
    }

    /**
     *  <p>Present on resources created after 1 February 2019 except for events not tracked.</p>
     * @param lastModifiedBy value to be set
     * @return Builder
     */

    public StandalonePriceBuilder lastModifiedBy(
            @Nullable final com.commercetools.api.models.common.LastModifiedBy lastModifiedBy) {
        this.lastModifiedBy = lastModifiedBy;
        return this;
    }

    /**
     *  <p>Present on resources created after 1 February 2019 except for events not tracked.</p>
     * @param builder function to build the createdBy value
     * @return Builder
     */

    public StandalonePriceBuilder createdBy(
            Function<com.commercetools.api.models.common.CreatedByBuilder, com.commercetools.api.models.common.CreatedByBuilder> builder) {
        this.createdBy = builder.apply(com.commercetools.api.models.common.CreatedByBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Present on resources created after 1 February 2019 except for events not tracked.</p>
     * @param builder function to build the createdBy value
     * @return Builder
     */

    public StandalonePriceBuilder withCreatedBy(
            Function<com.commercetools.api.models.common.CreatedByBuilder, com.commercetools.api.models.common.CreatedBy> builder) {
        this.createdBy = builder.apply(com.commercetools.api.models.common.CreatedByBuilder.of());
        return this;
    }

    /**
     *  <p>Present on resources created after 1 February 2019 except for events not tracked.</p>
     * @param createdBy value to be set
     * @return Builder
     */

    public StandalonePriceBuilder createdBy(@Nullable final com.commercetools.api.models.common.CreatedBy createdBy) {
        this.createdBy = createdBy;
        return this;
    }

    /**
     *  <p>User-defined unique identifier of the StandalonePrice.</p>
     * @param key value to be set
     * @return Builder
     */

    public StandalonePriceBuilder key(@Nullable final String key) {
        this.key = key;
        return this;
    }

    /**
     *  <p>SKU of the ProductVariant to which this Price is associated.</p>
     * @param sku value to be set
     * @return Builder
     */

    public StandalonePriceBuilder sku(final String sku) {
        this.sku = sku;
        return this;
    }

    /**
     *  <p>Money value of this Price.</p>
     * @param value value to be set
     * @return Builder
     */

    public StandalonePriceBuilder value(final com.commercetools.api.models.common.TypedMoney value) {
        this.value = value;
        return this;
    }

    /**
     *  <p>Money value of this Price.</p>
     * @param builder function to build the value value
     * @return Builder
     */

    public StandalonePriceBuilder value(
            Function<com.commercetools.api.models.common.TypedMoneyBuilder, Builder<? extends com.commercetools.api.models.common.TypedMoney>> builder) {
        this.value = builder.apply(com.commercetools.api.models.common.TypedMoneyBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Country for which this Price is valid.</p>
     * @param country value to be set
     * @return Builder
     */

    public StandalonePriceBuilder country(@Nullable final String country) {
        this.country = country;
        return this;
    }

    /**
     *  <p>CustomerGroup for which this Price is valid.</p>
     * @param builder function to build the customerGroup value
     * @return Builder
     */

    public StandalonePriceBuilder customerGroup(
            Function<com.commercetools.api.models.customer_group.CustomerGroupReferenceBuilder, com.commercetools.api.models.customer_group.CustomerGroupReferenceBuilder> builder) {
        this.customerGroup = builder
                .apply(com.commercetools.api.models.customer_group.CustomerGroupReferenceBuilder.of())
                .build();
        return this;
    }

    /**
     *  <p>CustomerGroup for which this Price is valid.</p>
     * @param builder function to build the customerGroup value
     * @return Builder
     */

    public StandalonePriceBuilder withCustomerGroup(
            Function<com.commercetools.api.models.customer_group.CustomerGroupReferenceBuilder, com.commercetools.api.models.customer_group.CustomerGroupReference> builder) {
        this.customerGroup = builder
                .apply(com.commercetools.api.models.customer_group.CustomerGroupReferenceBuilder.of());
        return this;
    }

    /**
     *  <p>CustomerGroup for which this Price is valid.</p>
     * @param customerGroup value to be set
     * @return Builder
     */

    public StandalonePriceBuilder customerGroup(
            @Nullable final com.commercetools.api.models.customer_group.CustomerGroupReference customerGroup) {
        this.customerGroup = customerGroup;
        return this;
    }

    /**
     *  <p>Product distribution Channel for which this Price is valid.</p>
     * @param builder function to build the channel value
     * @return Builder
     */

    public StandalonePriceBuilder channel(
            Function<com.commercetools.api.models.channel.ChannelReferenceBuilder, com.commercetools.api.models.channel.ChannelReferenceBuilder> builder) {
        this.channel = builder.apply(com.commercetools.api.models.channel.ChannelReferenceBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Product distribution Channel for which this Price is valid.</p>
     * @param builder function to build the channel value
     * @return Builder
     */

    public StandalonePriceBuilder withChannel(
            Function<com.commercetools.api.models.channel.ChannelReferenceBuilder, com.commercetools.api.models.channel.ChannelReference> builder) {
        this.channel = builder.apply(com.commercetools.api.models.channel.ChannelReferenceBuilder.of());
        return this;
    }

    /**
     *  <p>Product distribution Channel for which this Price is valid.</p>
     * @param channel value to be set
     * @return Builder
     */

    public StandalonePriceBuilder channel(
            @Nullable final com.commercetools.api.models.channel.ChannelReference channel) {
        this.channel = channel;
        return this;
    }

    /**
     *  <p>Date from which the Price is valid.</p>
     * @param validFrom value to be set
     * @return Builder
     */

    public StandalonePriceBuilder validFrom(@Nullable final java.time.ZonedDateTime validFrom) {
        this.validFrom = validFrom;
        return this;
    }

    /**
     *  <p>Date until the Price is valid. Standalone Prices that are no longer valid are not automatically deleted, but they can be deleted if necessary.</p>
     * @param validUntil value to be set
     * @return Builder
     */

    public StandalonePriceBuilder validUntil(@Nullable final java.time.ZonedDateTime validUntil) {
        this.validUntil = validUntil;
        return this;
    }

    /**
     *  <p>Price tiers if any are defined.</p>
     *  <p>If <code>discounted</code> is present, the tiered Price is ignored for a Product Variant.</p>
     * @param tiers value to be set
     * @return Builder
     */

    public StandalonePriceBuilder tiers(@Nullable final com.commercetools.api.models.common.PriceTier... tiers) {
        this.tiers = new ArrayList<>(Arrays.asList(tiers));
        return this;
    }

    /**
     *  <p>Price tiers if any are defined.</p>
     *  <p>If <code>discounted</code> is present, the tiered Price is ignored for a Product Variant.</p>
     * @param tiers value to be set
     * @return Builder
     */

    public StandalonePriceBuilder tiers(
            @Nullable final java.util.List<com.commercetools.api.models.common.PriceTier> tiers) {
        this.tiers = tiers;
        return this;
    }

    /**
     *  <p>Price tiers if any are defined.</p>
     *  <p>If <code>discounted</code> is present, the tiered Price is ignored for a Product Variant.</p>
     * @param tiers value to be set
     * @return Builder
     */

    public StandalonePriceBuilder plusTiers(@Nullable final com.commercetools.api.models.common.PriceTier... tiers) {
        if (this.tiers == null) {
            this.tiers = new ArrayList<>();
        }
        this.tiers.addAll(Arrays.asList(tiers));
        return this;
    }

    /**
     *  <p>Price tiers if any are defined.</p>
     *  <p>If <code>discounted</code> is present, the tiered Price is ignored for a Product Variant.</p>
     * @param builder function to build the tiers value
     * @return Builder
     */

    public StandalonePriceBuilder plusTiers(
            Function<com.commercetools.api.models.common.PriceTierBuilder, com.commercetools.api.models.common.PriceTierBuilder> builder) {
        if (this.tiers == null) {
            this.tiers = new ArrayList<>();
        }
        this.tiers.add(builder.apply(com.commercetools.api.models.common.PriceTierBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Price tiers if any are defined.</p>
     *  <p>If <code>discounted</code> is present, the tiered Price is ignored for a Product Variant.</p>
     * @param builder function to build the tiers value
     * @return Builder
     */

    public StandalonePriceBuilder withTiers(
            Function<com.commercetools.api.models.common.PriceTierBuilder, com.commercetools.api.models.common.PriceTierBuilder> builder) {
        this.tiers = new ArrayList<>();
        this.tiers.add(builder.apply(com.commercetools.api.models.common.PriceTierBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Price tiers if any are defined.</p>
     *  <p>If <code>discounted</code> is present, the tiered Price is ignored for a Product Variant.</p>
     * @param builder function to build the tiers value
     * @return Builder
     */

    public StandalonePriceBuilder addTiers(
            Function<com.commercetools.api.models.common.PriceTierBuilder, com.commercetools.api.models.common.PriceTier> builder) {
        return plusTiers(builder.apply(com.commercetools.api.models.common.PriceTierBuilder.of()));
    }

    /**
     *  <p>Price tiers if any are defined.</p>
     *  <p>If <code>discounted</code> is present, the tiered Price is ignored for a Product Variant.</p>
     * @param builder function to build the tiers value
     * @return Builder
     */

    public StandalonePriceBuilder setTiers(
            Function<com.commercetools.api.models.common.PriceTierBuilder, com.commercetools.api.models.common.PriceTier> builder) {
        return tiers(builder.apply(com.commercetools.api.models.common.PriceTierBuilder.of()));
    }

    /**
     *  <p>Set if a matching ProductDiscount exists. If set, the API uses the <code>discounted</code> value for the LineItem Price selection. When a relative discount is applied and the fraction part of the <code>discounted</code> price is 0.5, the discounted price is rounded in favor of the customer with the half down rounding.</p>
     * @param builder function to build the discounted value
     * @return Builder
     */

    public StandalonePriceBuilder discounted(
            Function<com.commercetools.api.models.common.DiscountedPriceBuilder, com.commercetools.api.models.common.DiscountedPriceBuilder> builder) {
        this.discounted = builder.apply(com.commercetools.api.models.common.DiscountedPriceBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Set if a matching ProductDiscount exists. If set, the API uses the <code>discounted</code> value for the LineItem Price selection. When a relative discount is applied and the fraction part of the <code>discounted</code> price is 0.5, the discounted price is rounded in favor of the customer with the half down rounding.</p>
     * @param builder function to build the discounted value
     * @return Builder
     */

    public StandalonePriceBuilder withDiscounted(
            Function<com.commercetools.api.models.common.DiscountedPriceBuilder, com.commercetools.api.models.common.DiscountedPrice> builder) {
        this.discounted = builder.apply(com.commercetools.api.models.common.DiscountedPriceBuilder.of());
        return this;
    }

    /**
     *  <p>Set if a matching ProductDiscount exists. If set, the API uses the <code>discounted</code> value for the LineItem Price selection. When a relative discount is applied and the fraction part of the <code>discounted</code> price is 0.5, the discounted price is rounded in favor of the customer with the half down rounding.</p>
     * @param discounted value to be set
     * @return Builder
     */

    public StandalonePriceBuilder discounted(
            @Nullable final com.commercetools.api.models.common.DiscountedPrice discounted) {
        this.discounted = discounted;
        return this;
    }

    /**
     *  <p>Custom Fields for the StandalonePrice.</p>
     * @param builder function to build the custom value
     * @return Builder
     */

    public StandalonePriceBuilder custom(
            Function<com.commercetools.api.models.type.CustomFieldsBuilder, com.commercetools.api.models.type.CustomFieldsBuilder> builder) {
        this.custom = builder.apply(com.commercetools.api.models.type.CustomFieldsBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Custom Fields for the StandalonePrice.</p>
     * @param builder function to build the custom value
     * @return Builder
     */

    public StandalonePriceBuilder withCustom(
            Function<com.commercetools.api.models.type.CustomFieldsBuilder, com.commercetools.api.models.type.CustomFields> builder) {
        this.custom = builder.apply(com.commercetools.api.models.type.CustomFieldsBuilder.of());
        return this;
    }

    /**
     *  <p>Custom Fields for the StandalonePrice.</p>
     * @param custom value to be set
     * @return Builder
     */

    public StandalonePriceBuilder custom(@Nullable final com.commercetools.api.models.type.CustomFields custom) {
        this.custom = custom;
        return this;
    }

    /**
     *  <p>Staged changes of the StandalonePrice. Only present if the StandalonePrice has some changes staged.</p>
     * @param builder function to build the staged value
     * @return Builder
     */

    public StandalonePriceBuilder staged(
            Function<com.commercetools.api.models.standalone_price.StagedStandalonePriceBuilder, com.commercetools.api.models.standalone_price.StagedStandalonePriceBuilder> builder) {
        this.staged = builder.apply(com.commercetools.api.models.standalone_price.StagedStandalonePriceBuilder.of())
                .build();
        return this;
    }

    /**
     *  <p>Staged changes of the StandalonePrice. Only present if the StandalonePrice has some changes staged.</p>
     * @param builder function to build the staged value
     * @return Builder
     */

    public StandalonePriceBuilder withStaged(
            Function<com.commercetools.api.models.standalone_price.StagedStandalonePriceBuilder, com.commercetools.api.models.standalone_price.StagedStandalonePrice> builder) {
        this.staged = builder.apply(com.commercetools.api.models.standalone_price.StagedStandalonePriceBuilder.of());
        return this;
    }

    /**
     *  <p>Staged changes of the StandalonePrice. Only present if the StandalonePrice has some changes staged.</p>
     * @param staged value to be set
     * @return Builder
     */

    public StandalonePriceBuilder staged(
            @Nullable final com.commercetools.api.models.standalone_price.StagedStandalonePrice staged) {
        this.staged = staged;
        return this;
    }

    /**
     *  <p>If set to <code>true</code>, the StandalonePrice is considered during price selection. If set to <code>false</code>, the StandalonePrice is not considered during price selection.</p>
     * @param active value to be set
     * @return Builder
     */

    public StandalonePriceBuilder active(final Boolean active) {
        this.active = active;
        return this;
    }

    /**
     *  <p>Unique identifier of the StandalonePrice.</p>
     * @return id
     */

    public String getId() {
        return this.id;
    }

    /**
     *  <p>Current version of the StandalonePrice.</p>
     * @return version
     */

    public Long getVersion() {
        return this.version;
    }

    /**
     *  <p>Date and time (UTC) the StandalonePrice was initially created.</p>
     * @return createdAt
     */

    public java.time.ZonedDateTime getCreatedAt() {
        return this.createdAt;
    }

    /**
     *  <p>Date and time (UTC) the StandalonePrice was last updated.</p>
     * @return lastModifiedAt
     */

    public java.time.ZonedDateTime getLastModifiedAt() {
        return this.lastModifiedAt;
    }

    /**
     *  <p>Present on resources created after 1 February 2019 except for events not tracked.</p>
     * @return lastModifiedBy
     */

    @Nullable
    public com.commercetools.api.models.common.LastModifiedBy getLastModifiedBy() {
        return this.lastModifiedBy;
    }

    /**
     *  <p>Present on resources created after 1 February 2019 except for events not tracked.</p>
     * @return createdBy
     */

    @Nullable
    public com.commercetools.api.models.common.CreatedBy getCreatedBy() {
        return this.createdBy;
    }

    /**
     *  <p>User-defined unique identifier of the StandalonePrice.</p>
     * @return key
     */

    @Nullable
    public String getKey() {
        return this.key;
    }

    /**
     *  <p>SKU of the ProductVariant to which this Price is associated.</p>
     * @return sku
     */

    public String getSku() {
        return this.sku;
    }

    /**
     *  <p>Money value of this Price.</p>
     * @return value
     */

    public com.commercetools.api.models.common.TypedMoney getValue() {
        return this.value;
    }

    /**
     *  <p>Country for which this Price is valid.</p>
     * @return country
     */

    @Nullable
    public String getCountry() {
        return this.country;
    }

    /**
     *  <p>CustomerGroup for which this Price is valid.</p>
     * @return customerGroup
     */

    @Nullable
    public com.commercetools.api.models.customer_group.CustomerGroupReference getCustomerGroup() {
        return this.customerGroup;
    }

    /**
     *  <p>Product distribution Channel for which this Price is valid.</p>
     * @return channel
     */

    @Nullable
    public com.commercetools.api.models.channel.ChannelReference getChannel() {
        return this.channel;
    }

    /**
     *  <p>Date from which the Price is valid.</p>
     * @return validFrom
     */

    @Nullable
    public java.time.ZonedDateTime getValidFrom() {
        return this.validFrom;
    }

    /**
     *  <p>Date until the Price is valid. Standalone Prices that are no longer valid are not automatically deleted, but they can be deleted if necessary.</p>
     * @return validUntil
     */

    @Nullable
    public java.time.ZonedDateTime getValidUntil() {
        return this.validUntil;
    }

    /**
     *  <p>Price tiers if any are defined.</p>
     *  <p>If <code>discounted</code> is present, the tiered Price is ignored for a Product Variant.</p>
     * @return tiers
     */

    @Nullable
    public java.util.List<com.commercetools.api.models.common.PriceTier> getTiers() {
        return this.tiers;
    }

    /**
     *  <p>Set if a matching ProductDiscount exists. If set, the API uses the <code>discounted</code> value for the LineItem Price selection. When a relative discount is applied and the fraction part of the <code>discounted</code> price is 0.5, the discounted price is rounded in favor of the customer with the half down rounding.</p>
     * @return discounted
     */

    @Nullable
    public com.commercetools.api.models.common.DiscountedPrice getDiscounted() {
        return this.discounted;
    }

    /**
     *  <p>Custom Fields for the StandalonePrice.</p>
     * @return custom
     */

    @Nullable
    public com.commercetools.api.models.type.CustomFields getCustom() {
        return this.custom;
    }

    /**
     *  <p>Staged changes of the StandalonePrice. Only present if the StandalonePrice has some changes staged.</p>
     * @return staged
     */

    @Nullable
    public com.commercetools.api.models.standalone_price.StagedStandalonePrice getStaged() {
        return this.staged;
    }

    /**
     *  <p>If set to <code>true</code>, the StandalonePrice is considered during price selection. If set to <code>false</code>, the StandalonePrice is not considered during price selection.</p>
     * @return active
     */

    public Boolean getActive() {
        return this.active;
    }

    /**
     * builds StandalonePrice with checking for non-null required values
     * @return StandalonePrice
     */
    public StandalonePrice build() {
        Objects.requireNonNull(id, StandalonePrice.class + ": id is missing");
        Objects.requireNonNull(version, StandalonePrice.class + ": version is missing");
        Objects.requireNonNull(createdAt, StandalonePrice.class + ": createdAt is missing");
        Objects.requireNonNull(lastModifiedAt, StandalonePrice.class + ": lastModifiedAt is missing");
        Objects.requireNonNull(sku, StandalonePrice.class + ": sku is missing");
        Objects.requireNonNull(value, StandalonePrice.class + ": value is missing");
        Objects.requireNonNull(active, StandalonePrice.class + ": active is missing");
        return new StandalonePriceImpl(id, version, createdAt, lastModifiedAt, lastModifiedBy, createdBy, key, sku,
            value, country, customerGroup, channel, validFrom, validUntil, tiers, discounted, custom, staged, active);
    }

    /**
     * builds StandalonePrice without checking for non-null required values
     * @return StandalonePrice
     */
    public StandalonePrice buildUnchecked() {
        return new StandalonePriceImpl(id, version, createdAt, lastModifiedAt, lastModifiedBy, createdBy, key, sku,
            value, country, customerGroup, channel, validFrom, validUntil, tiers, discounted, custom, staged, active);
    }

    /**
     * factory method for an instance of StandalonePriceBuilder
     * @return builder
     */
    public static StandalonePriceBuilder of() {
        return new StandalonePriceBuilder();
    }

    /**
     * create builder for StandalonePrice instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static StandalonePriceBuilder of(final StandalonePrice template) {
        StandalonePriceBuilder builder = new StandalonePriceBuilder();
        builder.id = template.getId();
        builder.version = template.getVersion();
        builder.createdAt = template.getCreatedAt();
        builder.lastModifiedAt = template.getLastModifiedAt();
        builder.lastModifiedBy = template.getLastModifiedBy();
        builder.createdBy = template.getCreatedBy();
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
        builder.staged = template.getStaged();
        builder.active = template.getActive();
        return builder;
    }

}
