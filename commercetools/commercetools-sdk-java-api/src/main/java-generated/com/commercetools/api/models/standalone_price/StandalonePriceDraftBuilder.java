
package com.commercetools.api.models.standalone_price;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class StandalonePriceDraftBuilder implements Builder<StandalonePriceDraft> {

    @Nullable
    private String key;

    private String sku;

    private com.commercetools.api.models.common.Money value;

    @Nullable
    private String country;

    @Nullable
    private com.commercetools.api.models.customer_group.CustomerGroupResourceIdentifier customerGroup;

    @Nullable
    private com.commercetools.api.models.channel.ChannelResourceIdentifier channel;

    @Nullable
    private java.time.ZonedDateTime validFrom;

    @Nullable
    private java.time.ZonedDateTime validUntil;

    @Nullable
    private java.util.List<com.commercetools.api.models.common.PriceTierDraft> tiers;

    @Nullable
    private com.commercetools.api.models.common.DiscountedPriceDraft discounted;

    @Nullable
    private com.commercetools.api.models.type.CustomFieldsDraft custom;

    public StandalonePriceDraftBuilder key(@Nullable final String key) {
        this.key = key;
        return this;
    }

    public StandalonePriceDraftBuilder sku(final String sku) {
        this.sku = sku;
        return this;
    }

    public StandalonePriceDraftBuilder value(
            Function<com.commercetools.api.models.common.MoneyBuilder, com.commercetools.api.models.common.MoneyBuilder> builder) {
        this.value = builder.apply(com.commercetools.api.models.common.MoneyBuilder.of()).build();
        return this;
    }

    public StandalonePriceDraftBuilder value(final com.commercetools.api.models.common.Money value) {
        this.value = value;
        return this;
    }

    public StandalonePriceDraftBuilder country(@Nullable final String country) {
        this.country = country;
        return this;
    }

    public StandalonePriceDraftBuilder customerGroup(
            Function<com.commercetools.api.models.customer_group.CustomerGroupResourceIdentifierBuilder, com.commercetools.api.models.customer_group.CustomerGroupResourceIdentifierBuilder> builder) {
        this.customerGroup = builder
                .apply(com.commercetools.api.models.customer_group.CustomerGroupResourceIdentifierBuilder.of())
                .build();
        return this;
    }

    public StandalonePriceDraftBuilder customerGroup(
            @Nullable final com.commercetools.api.models.customer_group.CustomerGroupResourceIdentifier customerGroup) {
        this.customerGroup = customerGroup;
        return this;
    }

    public StandalonePriceDraftBuilder channel(
            Function<com.commercetools.api.models.channel.ChannelResourceIdentifierBuilder, com.commercetools.api.models.channel.ChannelResourceIdentifierBuilder> builder) {
        this.channel = builder.apply(com.commercetools.api.models.channel.ChannelResourceIdentifierBuilder.of())
                .build();
        return this;
    }

    public StandalonePriceDraftBuilder channel(
            @Nullable final com.commercetools.api.models.channel.ChannelResourceIdentifier channel) {
        this.channel = channel;
        return this;
    }

    public StandalonePriceDraftBuilder validFrom(@Nullable final java.time.ZonedDateTime validFrom) {
        this.validFrom = validFrom;
        return this;
    }

    public StandalonePriceDraftBuilder validUntil(@Nullable final java.time.ZonedDateTime validUntil) {
        this.validUntil = validUntil;
        return this;
    }

    public StandalonePriceDraftBuilder tiers(
            @Nullable final com.commercetools.api.models.common.PriceTierDraft... tiers) {
        this.tiers = new ArrayList<>(Arrays.asList(tiers));
        return this;
    }

    public StandalonePriceDraftBuilder tiers(
            @Nullable final java.util.List<com.commercetools.api.models.common.PriceTierDraft> tiers) {
        this.tiers = tiers;
        return this;
    }

    public StandalonePriceDraftBuilder plusTiers(
            @Nullable final com.commercetools.api.models.common.PriceTierDraft... tiers) {
        if (this.tiers == null) {
            this.tiers = new ArrayList<>();
        }
        this.tiers.addAll(Arrays.asList(tiers));
        return this;
    }

    public StandalonePriceDraftBuilder plusTiers(
            Function<com.commercetools.api.models.common.PriceTierDraftBuilder, com.commercetools.api.models.common.PriceTierDraftBuilder> builder) {
        if (this.tiers == null) {
            this.tiers = new ArrayList<>();
        }
        this.tiers.add(builder.apply(com.commercetools.api.models.common.PriceTierDraftBuilder.of()).build());
        return this;
    }

    public StandalonePriceDraftBuilder withTiers(
            Function<com.commercetools.api.models.common.PriceTierDraftBuilder, com.commercetools.api.models.common.PriceTierDraftBuilder> builder) {
        this.tiers = new ArrayList<>();
        this.tiers.add(builder.apply(com.commercetools.api.models.common.PriceTierDraftBuilder.of()).build());
        return this;
    }

    public StandalonePriceDraftBuilder discounted(
            Function<com.commercetools.api.models.common.DiscountedPriceDraftBuilder, com.commercetools.api.models.common.DiscountedPriceDraftBuilder> builder) {
        this.discounted = builder.apply(com.commercetools.api.models.common.DiscountedPriceDraftBuilder.of()).build();
        return this;
    }

    public StandalonePriceDraftBuilder discounted(
            @Nullable final com.commercetools.api.models.common.DiscountedPriceDraft discounted) {
        this.discounted = discounted;
        return this;
    }

    public StandalonePriceDraftBuilder custom(
            Function<com.commercetools.api.models.type.CustomFieldsDraftBuilder, com.commercetools.api.models.type.CustomFieldsDraftBuilder> builder) {
        this.custom = builder.apply(com.commercetools.api.models.type.CustomFieldsDraftBuilder.of()).build();
        return this;
    }

    public StandalonePriceDraftBuilder custom(
            @Nullable final com.commercetools.api.models.type.CustomFieldsDraft custom) {
        this.custom = custom;
        return this;
    }

    @Nullable
    public String getKey() {
        return this.key;
    }

    public String getSku() {
        return this.sku;
    }

    public com.commercetools.api.models.common.Money getValue() {
        return this.value;
    }

    @Nullable
    public String getCountry() {
        return this.country;
    }

    @Nullable
    public com.commercetools.api.models.customer_group.CustomerGroupResourceIdentifier getCustomerGroup() {
        return this.customerGroup;
    }

    @Nullable
    public com.commercetools.api.models.channel.ChannelResourceIdentifier getChannel() {
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
    public java.util.List<com.commercetools.api.models.common.PriceTierDraft> getTiers() {
        return this.tiers;
    }

    @Nullable
    public com.commercetools.api.models.common.DiscountedPriceDraft getDiscounted() {
        return this.discounted;
    }

    @Nullable
    public com.commercetools.api.models.type.CustomFieldsDraft getCustom() {
        return this.custom;
    }

    public StandalonePriceDraft build() {
        Objects.requireNonNull(sku, StandalonePriceDraft.class + ": sku is missing");
        Objects.requireNonNull(value, StandalonePriceDraft.class + ": value is missing");
        return new StandalonePriceDraftImpl(key, sku, value, country, customerGroup, channel, validFrom, validUntil,
            tiers, discounted, custom);
    }

    /**
     * builds StandalonePriceDraft without checking for non null required values
     */
    public StandalonePriceDraft buildUnchecked() {
        return new StandalonePriceDraftImpl(key, sku, value, country, customerGroup, channel, validFrom, validUntil,
            tiers, discounted, custom);
    }

    public static StandalonePriceDraftBuilder of() {
        return new StandalonePriceDraftBuilder();
    }

    public static StandalonePriceDraftBuilder of(final StandalonePriceDraft template) {
        StandalonePriceDraftBuilder builder = new StandalonePriceDraftBuilder();
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
