
package com.commercetools.api.models.standalone_price;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
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

    public StandalonePriceBuilder id(final String id) {
        this.id = id;
        return this;
    }

    public StandalonePriceBuilder version(final Long version) {
        this.version = version;
        return this;
    }

    public StandalonePriceBuilder createdAt(final java.time.ZonedDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    public StandalonePriceBuilder lastModifiedAt(final java.time.ZonedDateTime lastModifiedAt) {
        this.lastModifiedAt = lastModifiedAt;
        return this;
    }

    public StandalonePriceBuilder lastModifiedBy(
            Function<com.commercetools.api.models.common.LastModifiedByBuilder, com.commercetools.api.models.common.LastModifiedByBuilder> builder) {
        this.lastModifiedBy = builder.apply(com.commercetools.api.models.common.LastModifiedByBuilder.of()).build();
        return this;
    }

    public StandalonePriceBuilder lastModifiedBy(
            @Nullable final com.commercetools.api.models.common.LastModifiedBy lastModifiedBy) {
        this.lastModifiedBy = lastModifiedBy;
        return this;
    }

    public StandalonePriceBuilder createdBy(
            Function<com.commercetools.api.models.common.CreatedByBuilder, com.commercetools.api.models.common.CreatedByBuilder> builder) {
        this.createdBy = builder.apply(com.commercetools.api.models.common.CreatedByBuilder.of()).build();
        return this;
    }

    public StandalonePriceBuilder createdBy(@Nullable final com.commercetools.api.models.common.CreatedBy createdBy) {
        this.createdBy = createdBy;
        return this;
    }

    public StandalonePriceBuilder key(@Nullable final String key) {
        this.key = key;
        return this;
    }

    public StandalonePriceBuilder sku(final String sku) {
        this.sku = sku;
        return this;
    }

    public StandalonePriceBuilder value(final com.commercetools.api.models.common.TypedMoney value) {
        this.value = value;
        return this;
    }

    public StandalonePriceBuilder value(
            Function<com.commercetools.api.models.common.TypedMoneyBuilder, Builder<? extends com.commercetools.api.models.common.TypedMoney>> builder) {
        this.value = builder.apply(com.commercetools.api.models.common.TypedMoneyBuilder.of()).build();
        return this;
    }

    public StandalonePriceBuilder country(@Nullable final String country) {
        this.country = country;
        return this;
    }

    public StandalonePriceBuilder customerGroup(
            Function<com.commercetools.api.models.customer_group.CustomerGroupReferenceBuilder, com.commercetools.api.models.customer_group.CustomerGroupReferenceBuilder> builder) {
        this.customerGroup = builder
                .apply(com.commercetools.api.models.customer_group.CustomerGroupReferenceBuilder.of())
                .build();
        return this;
    }

    public StandalonePriceBuilder customerGroup(
            @Nullable final com.commercetools.api.models.customer_group.CustomerGroupReference customerGroup) {
        this.customerGroup = customerGroup;
        return this;
    }

    public StandalonePriceBuilder channel(
            Function<com.commercetools.api.models.channel.ChannelReferenceBuilder, com.commercetools.api.models.channel.ChannelReferenceBuilder> builder) {
        this.channel = builder.apply(com.commercetools.api.models.channel.ChannelReferenceBuilder.of()).build();
        return this;
    }

    public StandalonePriceBuilder channel(
            @Nullable final com.commercetools.api.models.channel.ChannelReference channel) {
        this.channel = channel;
        return this;
    }

    public StandalonePriceBuilder validFrom(@Nullable final java.time.ZonedDateTime validFrom) {
        this.validFrom = validFrom;
        return this;
    }

    public StandalonePriceBuilder validUntil(@Nullable final java.time.ZonedDateTime validUntil) {
        this.validUntil = validUntil;
        return this;
    }

    public StandalonePriceBuilder tiers(@Nullable final com.commercetools.api.models.common.PriceTier... tiers) {
        this.tiers = new ArrayList<>(Arrays.asList(tiers));
        return this;
    }

    public StandalonePriceBuilder tiers(
            @Nullable final java.util.List<com.commercetools.api.models.common.PriceTier> tiers) {
        this.tiers = tiers;
        return this;
    }

    public StandalonePriceBuilder plusTiers(@Nullable final com.commercetools.api.models.common.PriceTier... tiers) {
        if (this.tiers == null) {
            this.tiers = new ArrayList<>();
        }
        this.tiers.addAll(Arrays.asList(tiers));
        return this;
    }

    public StandalonePriceBuilder plusTiers(
            Function<com.commercetools.api.models.common.PriceTierBuilder, com.commercetools.api.models.common.PriceTierBuilder> builder) {
        if (this.tiers == null) {
            this.tiers = new ArrayList<>();
        }
        this.tiers.add(builder.apply(com.commercetools.api.models.common.PriceTierBuilder.of()).build());
        return this;
    }

    public StandalonePriceBuilder withTiers(
            Function<com.commercetools.api.models.common.PriceTierBuilder, com.commercetools.api.models.common.PriceTierBuilder> builder) {
        this.tiers = new ArrayList<>();
        this.tiers.add(builder.apply(com.commercetools.api.models.common.PriceTierBuilder.of()).build());
        return this;
    }

    public StandalonePriceBuilder discounted(
            Function<com.commercetools.api.models.common.DiscountedPriceBuilder, com.commercetools.api.models.common.DiscountedPriceBuilder> builder) {
        this.discounted = builder.apply(com.commercetools.api.models.common.DiscountedPriceBuilder.of()).build();
        return this;
    }

    public StandalonePriceBuilder discounted(
            @Nullable final com.commercetools.api.models.common.DiscountedPrice discounted) {
        this.discounted = discounted;
        return this;
    }

    public StandalonePriceBuilder custom(
            Function<com.commercetools.api.models.type.CustomFieldsBuilder, com.commercetools.api.models.type.CustomFieldsBuilder> builder) {
        this.custom = builder.apply(com.commercetools.api.models.type.CustomFieldsBuilder.of()).build();
        return this;
    }

    public StandalonePriceBuilder custom(@Nullable final com.commercetools.api.models.type.CustomFields custom) {
        this.custom = custom;
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

    public StandalonePrice build() {
        Objects.requireNonNull(id, StandalonePrice.class + ": id is missing");
        Objects.requireNonNull(version, StandalonePrice.class + ": version is missing");
        Objects.requireNonNull(createdAt, StandalonePrice.class + ": createdAt is missing");
        Objects.requireNonNull(lastModifiedAt, StandalonePrice.class + ": lastModifiedAt is missing");
        Objects.requireNonNull(sku, StandalonePrice.class + ": sku is missing");
        Objects.requireNonNull(value, StandalonePrice.class + ": value is missing");
        return new StandalonePriceImpl(id, version, createdAt, lastModifiedAt, lastModifiedBy, createdBy, key, sku,
            value, country, customerGroup, channel, validFrom, validUntil, tiers, discounted, custom);
    }

    /**
     * builds StandalonePrice without checking for non null required values
     */
    public StandalonePrice buildUnchecked() {
        return new StandalonePriceImpl(id, version, createdAt, lastModifiedAt, lastModifiedBy, createdBy, key, sku,
            value, country, customerGroup, channel, validFrom, validUntil, tiers, discounted, custom);
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
        return builder;
    }

}
