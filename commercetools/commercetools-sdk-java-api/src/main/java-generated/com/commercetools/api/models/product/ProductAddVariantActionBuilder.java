
package com.commercetools.api.models.product;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class ProductAddVariantActionBuilder implements Builder<ProductAddVariantAction> {

    @Nullable
    private String sku;

    @Nullable
    private String key;

    @Nullable
    private java.util.List<com.commercetools.api.models.common.PriceDraft> prices;

    @Nullable
    private java.util.List<com.commercetools.api.models.common.Image> images;

    @Nullable
    private java.util.List<com.commercetools.api.models.product.Attribute> attributes;

    @Nullable
    private Boolean staged;

    @Nullable
    private java.util.List<com.commercetools.api.models.common.Asset> assets;

    public ProductAddVariantActionBuilder sku(@Nullable final String sku) {
        this.sku = sku;
        return this;
    }

    public ProductAddVariantActionBuilder key(@Nullable final String key) {
        this.key = key;
        return this;
    }

    public ProductAddVariantActionBuilder prices(
            @Nullable final com.commercetools.api.models.common.PriceDraft... prices) {
        this.prices = new ArrayList<>(Arrays.asList(prices));
        return this;
    }

    public ProductAddVariantActionBuilder prices(
            @Nullable final java.util.List<com.commercetools.api.models.common.PriceDraft> prices) {
        this.prices = prices;
        return this;
    }

    public ProductAddVariantActionBuilder plusPrices(
            @Nullable final com.commercetools.api.models.common.PriceDraft... prices) {
        if (this.prices == null) {
            this.prices = new ArrayList<>();
        }
        this.prices.addAll(Arrays.asList(prices));
        return this;
    }

    public ProductAddVariantActionBuilder plusPrices(
            Function<com.commercetools.api.models.common.PriceDraftBuilder, com.commercetools.api.models.common.PriceDraftBuilder> builder) {
        if (this.prices == null) {
            this.prices = new ArrayList<>();
        }
        this.prices.add(builder.apply(com.commercetools.api.models.common.PriceDraftBuilder.of()).build());
        return this;
    }

    public ProductAddVariantActionBuilder withPrices(
            Function<com.commercetools.api.models.common.PriceDraftBuilder, com.commercetools.api.models.common.PriceDraftBuilder> builder) {
        this.prices = new ArrayList<>();
        this.prices.add(builder.apply(com.commercetools.api.models.common.PriceDraftBuilder.of()).build());
        return this;
    }

    public ProductAddVariantActionBuilder images(@Nullable final com.commercetools.api.models.common.Image... images) {
        this.images = new ArrayList<>(Arrays.asList(images));
        return this;
    }

    public ProductAddVariantActionBuilder images(
            @Nullable final java.util.List<com.commercetools.api.models.common.Image> images) {
        this.images = images;
        return this;
    }

    public ProductAddVariantActionBuilder plusImages(
            @Nullable final com.commercetools.api.models.common.Image... images) {
        if (this.images == null) {
            this.images = new ArrayList<>();
        }
        this.images.addAll(Arrays.asList(images));
        return this;
    }

    public ProductAddVariantActionBuilder plusImages(
            Function<com.commercetools.api.models.common.ImageBuilder, com.commercetools.api.models.common.ImageBuilder> builder) {
        if (this.images == null) {
            this.images = new ArrayList<>();
        }
        this.images.add(builder.apply(com.commercetools.api.models.common.ImageBuilder.of()).build());
        return this;
    }

    public ProductAddVariantActionBuilder withImages(
            Function<com.commercetools.api.models.common.ImageBuilder, com.commercetools.api.models.common.ImageBuilder> builder) {
        this.images = new ArrayList<>();
        this.images.add(builder.apply(com.commercetools.api.models.common.ImageBuilder.of()).build());
        return this;
    }

    public ProductAddVariantActionBuilder attributes(
            @Nullable final com.commercetools.api.models.product.Attribute... attributes) {
        this.attributes = new ArrayList<>(Arrays.asList(attributes));
        return this;
    }

    public ProductAddVariantActionBuilder attributes(
            @Nullable final java.util.List<com.commercetools.api.models.product.Attribute> attributes) {
        this.attributes = attributes;
        return this;
    }

    public ProductAddVariantActionBuilder plusAttributes(
            @Nullable final com.commercetools.api.models.product.Attribute... attributes) {
        if (this.attributes == null) {
            this.attributes = new ArrayList<>();
        }
        this.attributes.addAll(Arrays.asList(attributes));
        return this;
    }

    public ProductAddVariantActionBuilder plusAttributes(
            Function<com.commercetools.api.models.product.AttributeBuilder, com.commercetools.api.models.product.AttributeBuilder> builder) {
        if (this.attributes == null) {
            this.attributes = new ArrayList<>();
        }
        this.attributes.add(builder.apply(com.commercetools.api.models.product.AttributeBuilder.of()).build());
        return this;
    }

    public ProductAddVariantActionBuilder withAttributes(
            Function<com.commercetools.api.models.product.AttributeBuilder, com.commercetools.api.models.product.AttributeBuilder> builder) {
        this.attributes = new ArrayList<>();
        this.attributes.add(builder.apply(com.commercetools.api.models.product.AttributeBuilder.of()).build());
        return this;
    }

    public ProductAddVariantActionBuilder staged(@Nullable final Boolean staged) {
        this.staged = staged;
        return this;
    }

    public ProductAddVariantActionBuilder assets(@Nullable final com.commercetools.api.models.common.Asset... assets) {
        this.assets = new ArrayList<>(Arrays.asList(assets));
        return this;
    }

    public ProductAddVariantActionBuilder assets(
            @Nullable final java.util.List<com.commercetools.api.models.common.Asset> assets) {
        this.assets = assets;
        return this;
    }

    public ProductAddVariantActionBuilder plusAssets(
            @Nullable final com.commercetools.api.models.common.Asset... assets) {
        if (this.assets == null) {
            this.assets = new ArrayList<>();
        }
        this.assets.addAll(Arrays.asList(assets));
        return this;
    }

    public ProductAddVariantActionBuilder plusAssets(
            Function<com.commercetools.api.models.common.AssetBuilder, com.commercetools.api.models.common.AssetBuilder> builder) {
        if (this.assets == null) {
            this.assets = new ArrayList<>();
        }
        this.assets.add(builder.apply(com.commercetools.api.models.common.AssetBuilder.of()).build());
        return this;
    }

    public ProductAddVariantActionBuilder withAssets(
            Function<com.commercetools.api.models.common.AssetBuilder, com.commercetools.api.models.common.AssetBuilder> builder) {
        this.assets = new ArrayList<>();
        this.assets.add(builder.apply(com.commercetools.api.models.common.AssetBuilder.of()).build());
        return this;
    }

    @Nullable
    public String getSku() {
        return this.sku;
    }

    @Nullable
    public String getKey() {
        return this.key;
    }

    @Nullable
    public java.util.List<com.commercetools.api.models.common.PriceDraft> getPrices() {
        return this.prices;
    }

    @Nullable
    public java.util.List<com.commercetools.api.models.common.Image> getImages() {
        return this.images;
    }

    @Nullable
    public java.util.List<com.commercetools.api.models.product.Attribute> getAttributes() {
        return this.attributes;
    }

    @Nullable
    public Boolean getStaged() {
        return this.staged;
    }

    @Nullable
    public java.util.List<com.commercetools.api.models.common.Asset> getAssets() {
        return this.assets;
    }

    public ProductAddVariantAction build() {
        return new ProductAddVariantActionImpl(sku, key, prices, images, attributes, staged, assets);
    }

    /**
     * builds ProductAddVariantAction without checking for non null required values
     */
    public ProductAddVariantAction buildUnchecked() {
        return new ProductAddVariantActionImpl(sku, key, prices, images, attributes, staged, assets);
    }

    public static ProductAddVariantActionBuilder of() {
        return new ProductAddVariantActionBuilder();
    }

    public static ProductAddVariantActionBuilder of(final ProductAddVariantAction template) {
        ProductAddVariantActionBuilder builder = new ProductAddVariantActionBuilder();
        builder.sku = template.getSku();
        builder.key = template.getKey();
        builder.prices = template.getPrices();
        builder.images = template.getImages();
        builder.attributes = template.getAttributes();
        builder.staged = template.getStaged();
        builder.assets = template.getAssets();
        return builder;
    }

}
