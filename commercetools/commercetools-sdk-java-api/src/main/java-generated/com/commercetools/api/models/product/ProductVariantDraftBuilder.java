
package com.commercetools.api.models.product;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ProductVariantDraftBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductVariantDraft productVariantDraft = ProductVariantDraft.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ProductVariantDraftBuilder implements Builder<ProductVariantDraft> {

    @Nullable
    private String sku;

    @Nullable
    private String key;

    @Nullable
    private java.util.List<com.commercetools.api.models.common.PriceDraft> prices;

    @Nullable
    private java.util.List<com.commercetools.api.models.product.Attribute> attributes;

    @Nullable
    private java.util.List<com.commercetools.api.models.common.Image> images;

    @Nullable
    private java.util.List<com.commercetools.api.models.common.AssetDraft> assets;

    /**
     *  <p>User-defined unique SKU of the Product Variant.</p>
     * @param sku value to be set
     * @return Builder
     */

    public ProductVariantDraftBuilder sku(@Nullable final String sku) {
        this.sku = sku;
        return this;
    }

    /**
     *  <p>User-defined unique identifier for the ProductVariant.</p>
     * @param key value to be set
     * @return Builder
     */

    public ProductVariantDraftBuilder key(@Nullable final String key) {
        this.key = key;
        return this;
    }

    /**
     *  <p>The Embedded Prices for the Product Variant. Each Price must have its unique Price scope (with same currency, country, Customer Group, Channel, <code>validFrom</code> and <code>validUntil</code>).</p>
     * @param prices value to be set
     * @return Builder
     */

    public ProductVariantDraftBuilder prices(@Nullable final com.commercetools.api.models.common.PriceDraft... prices) {
        this.prices = new ArrayList<>(Arrays.asList(prices));
        return this;
    }

    /**
     *  <p>The Embedded Prices for the Product Variant. Each Price must have its unique Price scope (with same currency, country, Customer Group, Channel, <code>validFrom</code> and <code>validUntil</code>).</p>
     * @param prices value to be set
     * @return Builder
     */

    public ProductVariantDraftBuilder prices(
            @Nullable final java.util.List<com.commercetools.api.models.common.PriceDraft> prices) {
        this.prices = prices;
        return this;
    }

    /**
     *  <p>The Embedded Prices for the Product Variant. Each Price must have its unique Price scope (with same currency, country, Customer Group, Channel, <code>validFrom</code> and <code>validUntil</code>).</p>
     * @param prices value to be set
     * @return Builder
     */

    public ProductVariantDraftBuilder plusPrices(
            @Nullable final com.commercetools.api.models.common.PriceDraft... prices) {
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

    public ProductVariantDraftBuilder plusPrices(
            Function<com.commercetools.api.models.common.PriceDraftBuilder, com.commercetools.api.models.common.PriceDraftBuilder> builder) {
        if (this.prices == null) {
            this.prices = new ArrayList<>();
        }
        this.prices.add(builder.apply(com.commercetools.api.models.common.PriceDraftBuilder.of()).build());
        return this;
    }

    /**
     *  <p>The Embedded Prices for the Product Variant. Each Price must have its unique Price scope (with same currency, country, Customer Group, Channel, <code>validFrom</code> and <code>validUntil</code>).</p>
     * @param builder function to build the prices value
     * @return Builder
     */

    public ProductVariantDraftBuilder withPrices(
            Function<com.commercetools.api.models.common.PriceDraftBuilder, com.commercetools.api.models.common.PriceDraftBuilder> builder) {
        this.prices = new ArrayList<>();
        this.prices.add(builder.apply(com.commercetools.api.models.common.PriceDraftBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Attributes according to the respective AttributeDefinition.</p>
     * @param attributes value to be set
     * @return Builder
     */

    public ProductVariantDraftBuilder attributes(
            @Nullable final com.commercetools.api.models.product.Attribute... attributes) {
        this.attributes = new ArrayList<>(Arrays.asList(attributes));
        return this;
    }

    /**
     *  <p>Attributes according to the respective AttributeDefinition.</p>
     * @param attributes value to be set
     * @return Builder
     */

    public ProductVariantDraftBuilder attributes(
            @Nullable final java.util.List<com.commercetools.api.models.product.Attribute> attributes) {
        this.attributes = attributes;
        return this;
    }

    /**
     *  <p>Attributes according to the respective AttributeDefinition.</p>
     * @param attributes value to be set
     * @return Builder
     */

    public ProductVariantDraftBuilder plusAttributes(
            @Nullable final com.commercetools.api.models.product.Attribute... attributes) {
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

    public ProductVariantDraftBuilder plusAttributes(
            Function<com.commercetools.api.models.product.AttributeBuilder, com.commercetools.api.models.product.AttributeBuilder> builder) {
        if (this.attributes == null) {
            this.attributes = new ArrayList<>();
        }
        this.attributes.add(builder.apply(com.commercetools.api.models.product.AttributeBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Attributes according to the respective AttributeDefinition.</p>
     * @param builder function to build the attributes value
     * @return Builder
     */

    public ProductVariantDraftBuilder withAttributes(
            Function<com.commercetools.api.models.product.AttributeBuilder, com.commercetools.api.models.product.AttributeBuilder> builder) {
        this.attributes = new ArrayList<>();
        this.attributes.add(builder.apply(com.commercetools.api.models.product.AttributeBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Images for the Product Variant.</p>
     * @param images value to be set
     * @return Builder
     */

    public ProductVariantDraftBuilder images(@Nullable final com.commercetools.api.models.common.Image... images) {
        this.images = new ArrayList<>(Arrays.asList(images));
        return this;
    }

    /**
     *  <p>Images for the Product Variant.</p>
     * @param images value to be set
     * @return Builder
     */

    public ProductVariantDraftBuilder images(
            @Nullable final java.util.List<com.commercetools.api.models.common.Image> images) {
        this.images = images;
        return this;
    }

    /**
     *  <p>Images for the Product Variant.</p>
     * @param images value to be set
     * @return Builder
     */

    public ProductVariantDraftBuilder plusImages(@Nullable final com.commercetools.api.models.common.Image... images) {
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

    public ProductVariantDraftBuilder plusImages(
            Function<com.commercetools.api.models.common.ImageBuilder, com.commercetools.api.models.common.ImageBuilder> builder) {
        if (this.images == null) {
            this.images = new ArrayList<>();
        }
        this.images.add(builder.apply(com.commercetools.api.models.common.ImageBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Images for the Product Variant.</p>
     * @param builder function to build the images value
     * @return Builder
     */

    public ProductVariantDraftBuilder withImages(
            Function<com.commercetools.api.models.common.ImageBuilder, com.commercetools.api.models.common.ImageBuilder> builder) {
        this.images = new ArrayList<>();
        this.images.add(builder.apply(com.commercetools.api.models.common.ImageBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Media assets for the Product Variant.</p>
     * @param assets value to be set
     * @return Builder
     */

    public ProductVariantDraftBuilder assets(@Nullable final com.commercetools.api.models.common.AssetDraft... assets) {
        this.assets = new ArrayList<>(Arrays.asList(assets));
        return this;
    }

    /**
     *  <p>Media assets for the Product Variant.</p>
     * @param assets value to be set
     * @return Builder
     */

    public ProductVariantDraftBuilder assets(
            @Nullable final java.util.List<com.commercetools.api.models.common.AssetDraft> assets) {
        this.assets = assets;
        return this;
    }

    /**
     *  <p>Media assets for the Product Variant.</p>
     * @param assets value to be set
     * @return Builder
     */

    public ProductVariantDraftBuilder plusAssets(
            @Nullable final com.commercetools.api.models.common.AssetDraft... assets) {
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

    public ProductVariantDraftBuilder plusAssets(
            Function<com.commercetools.api.models.common.AssetDraftBuilder, com.commercetools.api.models.common.AssetDraftBuilder> builder) {
        if (this.assets == null) {
            this.assets = new ArrayList<>();
        }
        this.assets.add(builder.apply(com.commercetools.api.models.common.AssetDraftBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Media assets for the Product Variant.</p>
     * @param builder function to build the assets value
     * @return Builder
     */

    public ProductVariantDraftBuilder withAssets(
            Function<com.commercetools.api.models.common.AssetDraftBuilder, com.commercetools.api.models.common.AssetDraftBuilder> builder) {
        this.assets = new ArrayList<>();
        this.assets.add(builder.apply(com.commercetools.api.models.common.AssetDraftBuilder.of()).build());
        return this;
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

    @Nullable
    public String getKey() {
        return this.key;
    }

    /**
     *  <p>The Embedded Prices for the Product Variant. Each Price must have its unique Price scope (with same currency, country, Customer Group, Channel, <code>validFrom</code> and <code>validUntil</code>).</p>
     * @return prices
     */

    @Nullable
    public java.util.List<com.commercetools.api.models.common.PriceDraft> getPrices() {
        return this.prices;
    }

    /**
     *  <p>Attributes according to the respective AttributeDefinition.</p>
     * @return attributes
     */

    @Nullable
    public java.util.List<com.commercetools.api.models.product.Attribute> getAttributes() {
        return this.attributes;
    }

    /**
     *  <p>Images for the Product Variant.</p>
     * @return images
     */

    @Nullable
    public java.util.List<com.commercetools.api.models.common.Image> getImages() {
        return this.images;
    }

    /**
     *  <p>Media assets for the Product Variant.</p>
     * @return assets
     */

    @Nullable
    public java.util.List<com.commercetools.api.models.common.AssetDraft> getAssets() {
        return this.assets;
    }

    /**
     * builds ProductVariantDraft with checking for non-null required values
     * @return ProductVariantDraft
     */
    public ProductVariantDraft build() {
        return new ProductVariantDraftImpl(sku, key, prices, attributes, images, assets);
    }

    /**
     * builds ProductVariantDraft without checking for non-null required values
     * @return ProductVariantDraft
     */
    public ProductVariantDraft buildUnchecked() {
        return new ProductVariantDraftImpl(sku, key, prices, attributes, images, assets);
    }

    /**
     * factory method for an instance of ProductVariantDraftBuilder
     * @return builder
     */
    public static ProductVariantDraftBuilder of() {
        return new ProductVariantDraftBuilder();
    }

    /**
     * create builder for ProductVariantDraft instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ProductVariantDraftBuilder of(final ProductVariantDraft template) {
        ProductVariantDraftBuilder builder = new ProductVariantDraftBuilder();
        builder.sku = template.getSku();
        builder.key = template.getKey();
        builder.prices = template.getPrices();
        builder.attributes = template.getAttributes();
        builder.images = template.getImages();
        builder.assets = template.getAssets();
        return builder;
    }

}
