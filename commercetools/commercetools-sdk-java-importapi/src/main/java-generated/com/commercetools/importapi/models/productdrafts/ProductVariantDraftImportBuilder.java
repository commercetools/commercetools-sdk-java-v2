
package com.commercetools.importapi.models.productdrafts;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ProductVariantDraftImportBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductVariantDraftImport productVariantDraftImport = ProductVariantDraftImport.builder()
 *             .key("{key}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
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

    /**
     *  <p>User-defined unique SKU of the Product Variant.</p>
     * @param sku value to be set
     * @return Builder
     */

    public ProductVariantDraftImportBuilder sku(@Nullable final String sku) {
        this.sku = sku;
        return this;
    }

    /**
     *  <p>User-defined unique identifier for the ProductVariant.</p>
     * @param key value to be set
     * @return Builder
     */

    public ProductVariantDraftImportBuilder key(final String key) {
        this.key = key;
        return this;
    }

    /**
     *  <p>The Embedded Prices for the Product Variant. Each Price must have its unique Price scope (with same currency, country, Customer Group, Channel, <code>validFrom</code> and <code>validUntil</code>).</p>
     * @param prices value to be set
     * @return Builder
     */

    public ProductVariantDraftImportBuilder prices(
            @Nullable final com.commercetools.importapi.models.productdrafts.PriceDraftImport... prices) {
        this.prices = new ArrayList<>(Arrays.asList(prices));
        return this;
    }

    /**
     *  <p>The Embedded Prices for the Product Variant. Each Price must have its unique Price scope (with same currency, country, Customer Group, Channel, <code>validFrom</code> and <code>validUntil</code>).</p>
     * @param prices value to be set
     * @return Builder
     */

    public ProductVariantDraftImportBuilder prices(
            @Nullable final java.util.List<com.commercetools.importapi.models.productdrafts.PriceDraftImport> prices) {
        this.prices = prices;
        return this;
    }

    /**
     *  <p>The Embedded Prices for the Product Variant. Each Price must have its unique Price scope (with same currency, country, Customer Group, Channel, <code>validFrom</code> and <code>validUntil</code>).</p>
     * @param prices value to be set
     * @return Builder
     */

    public ProductVariantDraftImportBuilder plusPrices(
            @Nullable final com.commercetools.importapi.models.productdrafts.PriceDraftImport... prices) {
        if (this.prices == null) {
            this.prices = new ArrayList<>();
        }
        this.prices.addAll(Arrays.asList(prices));
        return this;
    }

    /**
     *  <p>The Embedded Prices for the Product Variant. Each Price must have its unique Price scope (with same currency, country, Customer Group, Channel, <code>validFrom</code> and <code>validUntil</code>).</p>
     * @param builder function to build the prices value
     * @return Builder
     */

    public ProductVariantDraftImportBuilder plusPrices(
            Function<com.commercetools.importapi.models.productdrafts.PriceDraftImportBuilder, com.commercetools.importapi.models.productdrafts.PriceDraftImportBuilder> builder) {
        if (this.prices == null) {
            this.prices = new ArrayList<>();
        }
        this.prices.add(
            builder.apply(com.commercetools.importapi.models.productdrafts.PriceDraftImportBuilder.of()).build());
        return this;
    }

    /**
     *  <p>The Embedded Prices for the Product Variant. Each Price must have its unique Price scope (with same currency, country, Customer Group, Channel, <code>validFrom</code> and <code>validUntil</code>).</p>
     * @param builder function to build the prices value
     * @return Builder
     */

    public ProductVariantDraftImportBuilder withPrices(
            Function<com.commercetools.importapi.models.productdrafts.PriceDraftImportBuilder, com.commercetools.importapi.models.productdrafts.PriceDraftImportBuilder> builder) {
        this.prices = new ArrayList<>();
        this.prices.add(
            builder.apply(com.commercetools.importapi.models.productdrafts.PriceDraftImportBuilder.of()).build());
        return this;
    }

    /**
     *  <p>The Embedded Prices for the Product Variant. Each Price must have its unique Price scope (with same currency, country, Customer Group, Channel, <code>validFrom</code> and <code>validUntil</code>).</p>
     * @param builder function to build the prices value
     * @return Builder
     */

    public ProductVariantDraftImportBuilder addPrices(
            Function<com.commercetools.importapi.models.productdrafts.PriceDraftImportBuilder, com.commercetools.importapi.models.productdrafts.PriceDraftImport> builder) {
        return plusPrices(builder.apply(com.commercetools.importapi.models.productdrafts.PriceDraftImportBuilder.of()));
    }

    /**
     *  <p>The Embedded Prices for the Product Variant. Each Price must have its unique Price scope (with same currency, country, Customer Group, Channel, <code>validFrom</code> and <code>validUntil</code>).</p>
     * @param builder function to build the prices value
     * @return Builder
     */

    public ProductVariantDraftImportBuilder setPrices(
            Function<com.commercetools.importapi.models.productdrafts.PriceDraftImportBuilder, com.commercetools.importapi.models.productdrafts.PriceDraftImport> builder) {
        return prices(builder.apply(com.commercetools.importapi.models.productdrafts.PriceDraftImportBuilder.of()));
    }

    /**
     *  <p>Attributes according to the respective AttributeDefinition.</p>
     * @param attributes value to be set
     * @return Builder
     */

    public ProductVariantDraftImportBuilder attributes(
            @Nullable final com.commercetools.importapi.models.productvariants.Attribute... attributes) {
        this.attributes = new ArrayList<>(Arrays.asList(attributes));
        return this;
    }

    /**
     *  <p>Attributes according to the respective AttributeDefinition.</p>
     * @param attributes value to be set
     * @return Builder
     */

    public ProductVariantDraftImportBuilder attributes(
            @Nullable final java.util.List<com.commercetools.importapi.models.productvariants.Attribute> attributes) {
        this.attributes = attributes;
        return this;
    }

    /**
     *  <p>Attributes according to the respective AttributeDefinition.</p>
     * @param attributes value to be set
     * @return Builder
     */

    public ProductVariantDraftImportBuilder plusAttributes(
            @Nullable final com.commercetools.importapi.models.productvariants.Attribute... attributes) {
        if (this.attributes == null) {
            this.attributes = new ArrayList<>();
        }
        this.attributes.addAll(Arrays.asList(attributes));
        return this;
    }

    /**
     *  <p>Attributes according to the respective AttributeDefinition.</p>
     * @param builder function to build the attributes value
     * @return Builder
     */

    public ProductVariantDraftImportBuilder plusAttributes(
            Function<com.commercetools.importapi.models.productvariants.AttributeBuilder, Builder<? extends com.commercetools.importapi.models.productvariants.Attribute>> builder) {
        if (this.attributes == null) {
            this.attributes = new ArrayList<>();
        }
        this.attributes
                .add(builder.apply(com.commercetools.importapi.models.productvariants.AttributeBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Attributes according to the respective AttributeDefinition.</p>
     * @param builder function to build the attributes value
     * @return Builder
     */

    public ProductVariantDraftImportBuilder withAttributes(
            Function<com.commercetools.importapi.models.productvariants.AttributeBuilder, Builder<? extends com.commercetools.importapi.models.productvariants.Attribute>> builder) {
        this.attributes = new ArrayList<>();
        this.attributes
                .add(builder.apply(com.commercetools.importapi.models.productvariants.AttributeBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Images for the Product Variant.</p>
     * @param images value to be set
     * @return Builder
     */

    public ProductVariantDraftImportBuilder images(
            @Nullable final com.commercetools.importapi.models.common.Image... images) {
        this.images = new ArrayList<>(Arrays.asList(images));
        return this;
    }

    /**
     *  <p>Images for the Product Variant.</p>
     * @param images value to be set
     * @return Builder
     */

    public ProductVariantDraftImportBuilder images(
            @Nullable final java.util.List<com.commercetools.importapi.models.common.Image> images) {
        this.images = images;
        return this;
    }

    /**
     *  <p>Images for the Product Variant.</p>
     * @param images value to be set
     * @return Builder
     */

    public ProductVariantDraftImportBuilder plusImages(
            @Nullable final com.commercetools.importapi.models.common.Image... images) {
        if (this.images == null) {
            this.images = new ArrayList<>();
        }
        this.images.addAll(Arrays.asList(images));
        return this;
    }

    /**
     *  <p>Images for the Product Variant.</p>
     * @param builder function to build the images value
     * @return Builder
     */

    public ProductVariantDraftImportBuilder plusImages(
            Function<com.commercetools.importapi.models.common.ImageBuilder, com.commercetools.importapi.models.common.ImageBuilder> builder) {
        if (this.images == null) {
            this.images = new ArrayList<>();
        }
        this.images.add(builder.apply(com.commercetools.importapi.models.common.ImageBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Images for the Product Variant.</p>
     * @param builder function to build the images value
     * @return Builder
     */

    public ProductVariantDraftImportBuilder withImages(
            Function<com.commercetools.importapi.models.common.ImageBuilder, com.commercetools.importapi.models.common.ImageBuilder> builder) {
        this.images = new ArrayList<>();
        this.images.add(builder.apply(com.commercetools.importapi.models.common.ImageBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Images for the Product Variant.</p>
     * @param builder function to build the images value
     * @return Builder
     */

    public ProductVariantDraftImportBuilder addImages(
            Function<com.commercetools.importapi.models.common.ImageBuilder, com.commercetools.importapi.models.common.Image> builder) {
        return plusImages(builder.apply(com.commercetools.importapi.models.common.ImageBuilder.of()));
    }

    /**
     *  <p>Images for the Product Variant.</p>
     * @param builder function to build the images value
     * @return Builder
     */

    public ProductVariantDraftImportBuilder setImages(
            Function<com.commercetools.importapi.models.common.ImageBuilder, com.commercetools.importapi.models.common.Image> builder) {
        return images(builder.apply(com.commercetools.importapi.models.common.ImageBuilder.of()));
    }

    /**
     *  <p>Media assets for the Product Variant.</p>
     * @param assets value to be set
     * @return Builder
     */

    public ProductVariantDraftImportBuilder assets(
            @Nullable final com.commercetools.importapi.models.common.Asset... assets) {
        this.assets = new ArrayList<>(Arrays.asList(assets));
        return this;
    }

    /**
     *  <p>Media assets for the Product Variant.</p>
     * @param assets value to be set
     * @return Builder
     */

    public ProductVariantDraftImportBuilder assets(
            @Nullable final java.util.List<com.commercetools.importapi.models.common.Asset> assets) {
        this.assets = assets;
        return this;
    }

    /**
     *  <p>Media assets for the Product Variant.</p>
     * @param assets value to be set
     * @return Builder
     */

    public ProductVariantDraftImportBuilder plusAssets(
            @Nullable final com.commercetools.importapi.models.common.Asset... assets) {
        if (this.assets == null) {
            this.assets = new ArrayList<>();
        }
        this.assets.addAll(Arrays.asList(assets));
        return this;
    }

    /**
     *  <p>Media assets for the Product Variant.</p>
     * @param builder function to build the assets value
     * @return Builder
     */

    public ProductVariantDraftImportBuilder plusAssets(
            Function<com.commercetools.importapi.models.common.AssetBuilder, com.commercetools.importapi.models.common.AssetBuilder> builder) {
        if (this.assets == null) {
            this.assets = new ArrayList<>();
        }
        this.assets.add(builder.apply(com.commercetools.importapi.models.common.AssetBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Media assets for the Product Variant.</p>
     * @param builder function to build the assets value
     * @return Builder
     */

    public ProductVariantDraftImportBuilder withAssets(
            Function<com.commercetools.importapi.models.common.AssetBuilder, com.commercetools.importapi.models.common.AssetBuilder> builder) {
        this.assets = new ArrayList<>();
        this.assets.add(builder.apply(com.commercetools.importapi.models.common.AssetBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Media assets for the Product Variant.</p>
     * @param builder function to build the assets value
     * @return Builder
     */

    public ProductVariantDraftImportBuilder addAssets(
            Function<com.commercetools.importapi.models.common.AssetBuilder, com.commercetools.importapi.models.common.Asset> builder) {
        return plusAssets(builder.apply(com.commercetools.importapi.models.common.AssetBuilder.of()));
    }

    /**
     *  <p>Media assets for the Product Variant.</p>
     * @param builder function to build the assets value
     * @return Builder
     */

    public ProductVariantDraftImportBuilder setAssets(
            Function<com.commercetools.importapi.models.common.AssetBuilder, com.commercetools.importapi.models.common.Asset> builder) {
        return assets(builder.apply(com.commercetools.importapi.models.common.AssetBuilder.of()));
    }

    /**
     *  <p>User-defined unique SKU of the Product Variant.</p>
     * @return sku
     */

    @Nullable
    public String getSku() {
        return this.sku;
    }

    /**
     *  <p>User-defined unique identifier for the ProductVariant.</p>
     * @return key
     */

    public String getKey() {
        return this.key;
    }

    /**
     *  <p>The Embedded Prices for the Product Variant. Each Price must have its unique Price scope (with same currency, country, Customer Group, Channel, <code>validFrom</code> and <code>validUntil</code>).</p>
     * @return prices
     */

    @Nullable
    public java.util.List<com.commercetools.importapi.models.productdrafts.PriceDraftImport> getPrices() {
        return this.prices;
    }

    /**
     *  <p>Attributes according to the respective AttributeDefinition.</p>
     * @return attributes
     */

    @Nullable
    public java.util.List<com.commercetools.importapi.models.productvariants.Attribute> getAttributes() {
        return this.attributes;
    }

    /**
     *  <p>Images for the Product Variant.</p>
     * @return images
     */

    @Nullable
    public java.util.List<com.commercetools.importapi.models.common.Image> getImages() {
        return this.images;
    }

    /**
     *  <p>Media assets for the Product Variant.</p>
     * @return assets
     */

    @Nullable
    public java.util.List<com.commercetools.importapi.models.common.Asset> getAssets() {
        return this.assets;
    }

    /**
     * builds ProductVariantDraftImport with checking for non-null required values
     * @return ProductVariantDraftImport
     */
    public ProductVariantDraftImport build() {
        Objects.requireNonNull(key, ProductVariantDraftImport.class + ": key is missing");
        return new ProductVariantDraftImportImpl(sku, key, prices, attributes, images, assets);
    }

    /**
     * builds ProductVariantDraftImport without checking for non-null required values
     * @return ProductVariantDraftImport
     */
    public ProductVariantDraftImport buildUnchecked() {
        return new ProductVariantDraftImportImpl(sku, key, prices, attributes, images, assets);
    }

    /**
     * factory method for an instance of ProductVariantDraftImportBuilder
     * @return builder
     */
    public static ProductVariantDraftImportBuilder of() {
        return new ProductVariantDraftImportBuilder();
    }

    /**
     * create builder for ProductVariantDraftImport instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
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
