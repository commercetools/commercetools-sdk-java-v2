
package com.commercetools.importapi.models.productdrafts;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class ProductVariantDraftImportBuilder implements Builder<ProductVariantDraftImport> {

    @Nullable
    private String sku;

    private String key;

    @Nullable
    private java.util.List<com.commercetools.importapi.models.productdrafts.PriceDraftImport> prices;

    @Nullable
    private java.util.List<com.commercetools.importapi.models.productvariants.Attribute> attributes;

    @Nullable
    private java.util.List<com.commercetools.importapi.models.common.Image> images;

    @Nullable
    private java.util.List<com.commercetools.importapi.models.common.Asset> assets;

    public ProductVariantDraftImportBuilder sku(@Nullable final String sku) {
        this.sku = sku;
        return this;
    }

    public ProductVariantDraftImportBuilder key(final String key) {
        this.key = key;
        return this;
    }

    public ProductVariantDraftImportBuilder prices(
            @Nullable final com.commercetools.importapi.models.productdrafts.PriceDraftImport... prices) {
        this.prices = new ArrayList<>(Arrays.asList(prices));
        return this;
    }

    public ProductVariantDraftImportBuilder prices(
            @Nullable final java.util.List<com.commercetools.importapi.models.productdrafts.PriceDraftImport> prices) {
        this.prices = prices;
        return this;
    }

    public ProductVariantDraftImportBuilder plusPrices(
            @Nullable final com.commercetools.importapi.models.productdrafts.PriceDraftImport... prices) {
        if (this.prices == null) {
            this.prices = new ArrayList<>();
        }
        this.prices.addAll(Arrays.asList(prices));
        return this;
    }

    public ProductVariantDraftImportBuilder plusPrices(
            Function<com.commercetools.importapi.models.productdrafts.PriceDraftImportBuilder, com.commercetools.importapi.models.productdrafts.PriceDraftImportBuilder> builder) {
        if (this.prices == null) {
            this.prices = new ArrayList<>();
        }
        this.prices.add(
            builder.apply(com.commercetools.importapi.models.productdrafts.PriceDraftImportBuilder.of()).build());
        return this;
    }

    public ProductVariantDraftImportBuilder withPrices(
            Function<com.commercetools.importapi.models.productdrafts.PriceDraftImportBuilder, com.commercetools.importapi.models.productdrafts.PriceDraftImportBuilder> builder) {
        this.prices = new ArrayList<>();
        this.prices.add(
            builder.apply(com.commercetools.importapi.models.productdrafts.PriceDraftImportBuilder.of()).build());
        return this;
    }

    public ProductVariantDraftImportBuilder attributes(
            @Nullable final com.commercetools.importapi.models.productvariants.Attribute... attributes) {
        this.attributes = new ArrayList<>(Arrays.asList(attributes));
        return this;
    }

    public ProductVariantDraftImportBuilder attributes(
            @Nullable final java.util.List<com.commercetools.importapi.models.productvariants.Attribute> attributes) {
        this.attributes = attributes;
        return this;
    }

    public ProductVariantDraftImportBuilder plusAttributes(
            @Nullable final com.commercetools.importapi.models.productvariants.Attribute... attributes) {
        if (this.attributes == null) {
            this.attributes = new ArrayList<>();
        }
        this.attributes.addAll(Arrays.asList(attributes));
        return this;
    }

    public ProductVariantDraftImportBuilder plusAttributes(
            Function<com.commercetools.importapi.models.productvariants.AttributeBuilder, Builder<? extends com.commercetools.importapi.models.productvariants.Attribute>> builder) {
        if (this.attributes == null) {
            this.attributes = new ArrayList<>();
        }
        this.attributes
                .add(builder.apply(com.commercetools.importapi.models.productvariants.AttributeBuilder.of()).build());
        return this;
    }

    public ProductVariantDraftImportBuilder withAttributes(
            Function<com.commercetools.importapi.models.productvariants.AttributeBuilder, Builder<? extends com.commercetools.importapi.models.productvariants.Attribute>> builder) {
        this.attributes = new ArrayList<>();
        this.attributes
                .add(builder.apply(com.commercetools.importapi.models.productvariants.AttributeBuilder.of()).build());
        return this;
    }

    public ProductVariantDraftImportBuilder images(
            @Nullable final com.commercetools.importapi.models.common.Image... images) {
        this.images = new ArrayList<>(Arrays.asList(images));
        return this;
    }

    public ProductVariantDraftImportBuilder images(
            @Nullable final java.util.List<com.commercetools.importapi.models.common.Image> images) {
        this.images = images;
        return this;
    }

    public ProductVariantDraftImportBuilder plusImages(
            @Nullable final com.commercetools.importapi.models.common.Image... images) {
        if (this.images == null) {
            this.images = new ArrayList<>();
        }
        this.images.addAll(Arrays.asList(images));
        return this;
    }

    public ProductVariantDraftImportBuilder plusImages(
            Function<com.commercetools.importapi.models.common.ImageBuilder, com.commercetools.importapi.models.common.ImageBuilder> builder) {
        if (this.images == null) {
            this.images = new ArrayList<>();
        }
        this.images.add(builder.apply(com.commercetools.importapi.models.common.ImageBuilder.of()).build());
        return this;
    }

    public ProductVariantDraftImportBuilder withImages(
            Function<com.commercetools.importapi.models.common.ImageBuilder, com.commercetools.importapi.models.common.ImageBuilder> builder) {
        this.images = new ArrayList<>();
        this.images.add(builder.apply(com.commercetools.importapi.models.common.ImageBuilder.of()).build());
        return this;
    }

    public ProductVariantDraftImportBuilder assets(
            @Nullable final com.commercetools.importapi.models.common.Asset... assets) {
        this.assets = new ArrayList<>(Arrays.asList(assets));
        return this;
    }

    public ProductVariantDraftImportBuilder assets(
            @Nullable final java.util.List<com.commercetools.importapi.models.common.Asset> assets) {
        this.assets = assets;
        return this;
    }

    public ProductVariantDraftImportBuilder plusAssets(
            @Nullable final com.commercetools.importapi.models.common.Asset... assets) {
        if (this.assets == null) {
            this.assets = new ArrayList<>();
        }
        this.assets.addAll(Arrays.asList(assets));
        return this;
    }

    public ProductVariantDraftImportBuilder plusAssets(
            Function<com.commercetools.importapi.models.common.AssetBuilder, com.commercetools.importapi.models.common.AssetBuilder> builder) {
        if (this.assets == null) {
            this.assets = new ArrayList<>();
        }
        this.assets.add(builder.apply(com.commercetools.importapi.models.common.AssetBuilder.of()).build());
        return this;
    }

    public ProductVariantDraftImportBuilder withAssets(
            Function<com.commercetools.importapi.models.common.AssetBuilder, com.commercetools.importapi.models.common.AssetBuilder> builder) {
        this.assets = new ArrayList<>();
        this.assets.add(builder.apply(com.commercetools.importapi.models.common.AssetBuilder.of()).build());
        return this;
    }

    @Nullable
    public String getSku() {
        return this.sku;
    }

    public String getKey() {
        return this.key;
    }

    @Nullable
    public java.util.List<com.commercetools.importapi.models.productdrafts.PriceDraftImport> getPrices() {
        return this.prices;
    }

    @Nullable
    public java.util.List<com.commercetools.importapi.models.productvariants.Attribute> getAttributes() {
        return this.attributes;
    }

    @Nullable
    public java.util.List<com.commercetools.importapi.models.common.Image> getImages() {
        return this.images;
    }

    @Nullable
    public java.util.List<com.commercetools.importapi.models.common.Asset> getAssets() {
        return this.assets;
    }

    public ProductVariantDraftImport build() {
        Objects.requireNonNull(key, ProductVariantDraftImport.class + ": key is missing");
        return new ProductVariantDraftImportImpl(sku, key, prices, attributes, images, assets);
    }

    /**
     * builds ProductVariantDraftImport without checking for non null required values
     */
    public ProductVariantDraftImport buildUnchecked() {
        return new ProductVariantDraftImportImpl(sku, key, prices, attributes, images, assets);
    }

    public static ProductVariantDraftImportBuilder of() {
        return new ProductVariantDraftImportBuilder();
    }

    public static ProductVariantDraftImportBuilder of(final ProductVariantDraftImport template) {
        ProductVariantDraftImportBuilder builder = new ProductVariantDraftImportBuilder();
        builder.sku = template.getSku();
        builder.key = template.getKey();
        builder.prices = template.getPrices();
        builder.attributes = template.getAttributes();
        builder.images = template.getImages();
        builder.assets = template.getAssets();
        return builder;
    }

}
