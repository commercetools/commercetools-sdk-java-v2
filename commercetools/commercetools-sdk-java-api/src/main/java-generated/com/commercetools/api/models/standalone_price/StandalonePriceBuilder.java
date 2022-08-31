
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

    /**
     *  <p>Unique identifier of the StandalonePrice.</p>
     */

    public StandalonePriceBuilder id(final String id) {
        this.id = id;
        return this;
    }

    /**
     *  <p>Current version of the StandalonePrice.</p>
     */

    public StandalonePriceBuilder version(final Long version) {
        this.version = version;
        return this;
    }

    /**
     *  <p>Date and time (UTC) the StandalonePrice was initially created.</p>
     */

    public StandalonePriceBuilder createdAt(final java.time.ZonedDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     *  <p>Date and time (UTC) the StandalonePrice was last updated.</p>
     */

    public StandalonePriceBuilder lastModifiedAt(final java.time.ZonedDateTime lastModifiedAt) {
        this.lastModifiedAt = lastModifiedAt;
        return this;
    }

    /**
     *  <p>Present on resources created after 1 February 2019 except for events not tracked.</p>
     */

    public StandalonePriceBuilder lastModifiedBy(
            Function<com.commercetools.api.models.common.LastModifiedByBuilder, com.commercetools.api.models.common.LastModifiedByBuilder> builder) {
        this.lastModifiedBy = builder.apply(com.commercetools.api.models.common.LastModifiedByBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Present on resources created after 1 February 2019 except for events not tracked.</p>
     */

    public StandalonePriceBuilder lastModifiedBy(
            @Nullable final com.commercetools.api.models.common.LastModifiedBy lastModifiedBy) {
        this.lastModifiedBy = lastModifiedBy;
        return this;
    }

    /**
     *  <p>Present on resources created after 1 February 2019 except for events not tracked.</p>
     */

    public StandalonePriceBuilder createdBy(
            Function<com.commercetools.api.models.common.CreatedByBuilder, com.commercetools.api.models.common.CreatedByBuilder> builder) {
        this.createdBy = builder.apply(com.commercetools.api.models.common.CreatedByBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Present on resources created after 1 February 2019 except for events not tracked.</p>
     */

    public StandalonePriceBuilder createdBy(@Nullable final com.commercetools.api.models.common.CreatedBy createdBy) {
        this.createdBy = createdBy;
        return this;
    }

    /**
     *  <p>User-defined unique identifier of the StandalonePrice.</p>
     */

    public StandalonePriceBuilder key(@Nullable final String key) {
        this.key = key;
        return this;
    }

    /**
     *  <p>SKU of the ProductVariant to which this Price is associated.</p>
     */

    public StandalonePriceBuilder sku(final String sku) {
        this.sku = sku;
        return this;
    }

    /**
     *  <p>Money value of this Price.</p>
     */

    public StandalonePriceBuilder value(final com.commercetools.api.models.common.TypedMoney value) {
        this.value = value;
        return this;
    }

    /**
     *  <p>Money value of this Price.</p>
     */

    public StandalonePriceBuilder value(
            Function<com.commercetools.api.models.common.TypedMoneyBuilder, Builder<? extends com.commercetools.api.models.common.TypedMoney>> builder) {
        this.value = builder.apply(com.commercetools.api.models.common.TypedMoneyBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Country for which this Price is valid.</p>
     */

    public StandalonePriceBuilder country(@Nullable final String country) {
        this.country = country;
        return this;
    }

    /**
     *  <p>CustomerGroup for which this Price is valid.</p>
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
     */

    public StandalonePriceBuilder customerGroup(
            @Nullable final com.commercetools.api.models.customer_group.CustomerGroupReference customerGroup) {
        this.customerGroup = customerGroup;
        return this;
    }

    /**
     *  <p>Product distribution Channel for which this Price is valid.</p>
     */

    public StandalonePriceBuilder channel(
            Function<com.commercetools.api.models.channel.ChannelReferenceBuilder, com.commercetools.api.models.channel.ChannelReferenceBuilder> builder) {
        this.channel = builder.apply(com.commercetools.api.models.channel.ChannelReferenceBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Product distribution Channel for which this Price is valid.</p>
     */

    public StandalonePriceBuilder channel(
            @Nullable final com.commercetools.api.models.channel.ChannelReference channel) {
        this.channel = channel;
        return this;
    }

    /**
     *  <p>Date from which the Price is valid.</p>
     */

    public StandalonePriceBuilder validFrom(@Nullable final java.time.ZonedDateTime validFrom) {
        this.validFrom = validFrom;
        return this;
    }

    /**
     *  <p>Date until the Price is valid.</p>
     */

    public StandalonePriceBuilder validUntil(@Nullable final java.time.ZonedDateTime validUntil) {
        this.validUntil = validUntil;
        return this;
    }

    /**
     *  <p>Price tiers if any are defined.</p>
     */

    public StandalonePriceBuilder tiers(@Nullable final com.commercetools.api.models.common.PriceTier... tiers) {
        this.tiers = new ArrayList<>(Arrays.asList(tiers));
        return this;
    }

    /**
     *  <p>Price tiers if any are defined.</p>
     */

    public StandalonePriceBuilder tiers(
            @Nullable final java.util.List<com.commercetools.api.models.common.PriceTier> tiers) {
        this.tiers = tiers;
        return this;
    }

    /**
     *  <p>Price tiers if any are defined.</p>
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
     */

    public StandalonePriceBuilder withTiers(
            Function<com.commercetools.api.models.common.PriceTierBuilder, com.commercetools.api.models.common.PriceTierBuilder> builder) {
        this.tiers = new ArrayList<>();
        this.tiers.add(builder.apply(com.commercetools.api.models.common.PriceTierBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Set if a matching ProductDiscount exists. If set, the API uses the <code>discounted</code> value for the LineItem Price selection. When a relative discount is applied and the fraction part of the <code>discounted</code> price is 0.5, the discounted price is rounded in favor of the customer with the half down rounding.</p>
     */

    public StandalonePriceBuilder discounted(
            Function<com.commercetools.api.models.common.DiscountedPriceBuilder, com.commercetools.api.models.common.DiscountedPriceBuilder> builder) {
        this.discounted = builder.apply(com.commercetools.api.models.common.DiscountedPriceBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Set if a matching ProductDiscount exists. If set, the API uses the <code>discounted</code> value for the LineItem Price selection. When a relative discount is applied and the fraction part of the <code>discounted</code> price is 0.5, the discounted price is rounded in favor of the customer with the half down rounding.</p>
     */

    public StandalonePriceBuilder discounted(
            @Nullable final com.commercetools.api.models.common.DiscountedPrice discounted) {
        this.discounted = discounted;
        return this;
    }

    /**
     *  <p>Custom Fields for the StandalonePrice.</p>
     */

    public StandalonePriceBuilder custom(
            Function<com.commercetools.api.models.type.CustomFieldsBuilder, com.commercetools.api.models.type.CustomFieldsBuilder> builder) {
        this.custom = builder.apply(com.commercetools.api.models.type.CustomFieldsBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Custom Fields for the StandalonePrice.</p>
     */

    public StandalonePriceBuilder custom(@Nullable final com.commercetools.api.models.type.CustomFields custom) {
        this.custom = custom;
        return this;
    }

    /**
     *  <p>Staged changes of the StandalonePrice. Only present if the StandalonePrice has staged changes.</p>
     */

    public StandalonePriceBuilder staged(
            Function<com.commercetools.api.models.standalone_price.StagedStandalonePriceBuilder, com.commercetools.api.models.standalone_price.StagedStandalonePriceBuilder> builder) {
        this.staged = builder.apply(com.commercetools.api.models.standalone_price.StagedStandalonePriceBuilder.of())
                .build();
        return this;
    }

    /**
     *  <p>Staged changes of the StandalonePrice. Only present if the StandalonePrice has staged changes.</p>
     */

    public StandalonePriceBuilder staged(
            @Nullable final com.commercetools.api.models.standalone_price.StagedStandalonePrice staged) {
        this.staged = staged;
        return this;
    }

    public String getId() {
        return this.id;
    }

    public Long getVersion() {
        return this.version;
    }

    public java.time.ZonedDateTime getCreatedAt() {
        return this.createdAt;
    }

    public java.time.ZonedDateTime getLastModifiedAt() {
        return this.lastModifiedAt;
    }

    @Nullable
    public com.commercetools.api.models.common.LastModifiedBy getLastModifiedBy() {
        return this.lastModifiedBy;
    }

    @Nullable
    public com.commercetools.api.models.common.CreatedBy getCreatedBy() {
        return this.createdBy;
    }

    @Nullable
    public String getKey() {
        return this.key;
    }

    public String getSku() {
        return this.sku;
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

    @Nullable
    public com.commercetools.api.models.standalone_price.StagedStandalonePrice getStaged() {
        return this.staged;
    }

    public StandalonePrice build() {
        Objects.requireNonNull(id, StandalonePrice.class + ": id is missing");
        Objects.requireNonNull(version, StandalonePrice.class + ": version is missing");
        Objects.requireNonNull(createdAt, StandalonePrice.class + ": createdAt is missing");
        Objects.requireNonNull(lastModifiedAt, StandalonePrice.class + ": lastModifiedAt is missing");
        Objects.requireNonNull(sku, StandalonePrice.class + ": sku is missing");
        Objects.requireNonNull(value, StandalonePrice.class + ": value is missing");
        return new StandalonePriceImpl(id, version, createdAt, lastModifiedAt, lastModifiedBy, createdBy, key, sku,
            value, country, customerGroup, channel, validFrom, validUntil, tiers, discounted, custom, staged);
    }

    /**
     * builds StandalonePrice without checking for non null required values
     */
    public StandalonePrice buildUnchecked() {
        return new StandalonePriceImpl(id, version, createdAt, lastModifiedAt, lastModifiedBy, createdBy, key, sku,
            value, country, customerGroup, channel, validFrom, validUntil, tiers, discounted, custom, staged);
    }

    public static StandalonePriceBuilder of() {
        return new StandalonePriceBuilder();
    }

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
        return builder;
    }

}
