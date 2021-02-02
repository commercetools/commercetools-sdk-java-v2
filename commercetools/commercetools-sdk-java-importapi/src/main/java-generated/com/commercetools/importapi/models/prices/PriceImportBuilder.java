
package com.commercetools.importapi.models.prices;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class PriceImportBuilder {

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

    public PriceImportBuilder key(final String key) {
        this.key = key;
        return this;
    }

    public PriceImportBuilder value(final com.commercetools.importapi.models.common.TypedMoney value) {
        this.value = value;
        return this;
    }

    public PriceImportBuilder country(@Nullable final String country) {
        this.country = country;
        return this;
    }

    public PriceImportBuilder validFrom(@Nullable final java.time.ZonedDateTime validFrom) {
        this.validFrom = validFrom;
        return this;
    }

    public PriceImportBuilder validUntil(@Nullable final java.time.ZonedDateTime validUntil) {
        this.validUntil = validUntil;
        return this;
    }

    public PriceImportBuilder customerGroup(
            @Nullable final com.commercetools.importapi.models.common.CustomerGroupKeyReference customerGroup) {
        this.customerGroup = customerGroup;
        return this;
    }

    public PriceImportBuilder channel(
            @Nullable final com.commercetools.importapi.models.common.ChannelKeyReference channel) {
        this.channel = channel;
        return this;
    }

    public PriceImportBuilder discounted(
            @Nullable final com.commercetools.importapi.models.common.DiscountedPrice discounted) {
        this.discounted = discounted;
        return this;
    }

    public PriceImportBuilder publish(@Nullable final Boolean publish) {
        this.publish = publish;
        return this;
    }

    public PriceImportBuilder tiers(@Nullable final com.commercetools.importapi.models.common.PriceTier... tiers) {
        this.tiers = new ArrayList<>(Arrays.asList(tiers));
        return this;
    }

    public PriceImportBuilder tiers(
            @Nullable final java.util.List<com.commercetools.importapi.models.common.PriceTier> tiers) {
        this.tiers = tiers;
        return this;
    }

    public PriceImportBuilder custom(@Nullable final com.commercetools.importapi.models.customfields.Custom custom) {
        this.custom = custom;
        return this;
    }

    public PriceImportBuilder productVariant(
            final com.commercetools.importapi.models.common.ProductVariantKeyReference productVariant) {
        this.productVariant = productVariant;
        return this;
    }

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
