
package com.commercetools.api.models.product;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ProductAddVariantActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductAddVariantAction productAddVariantAction = ProductAddVariantAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
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
    private java.util.List<com.commercetools.api.models.common.AssetDraft> assets;

    /**
     *  <p>Value to set. Must be unique.</p>
     * @param sku value to be set
     * @return Builder
     */

    public ProductAddVariantActionBuilder sku(@Nullable final String sku) {
        this.sku = sku;
        return this;
    }

    /**
     *  <p>Value to set. Must be unique.</p>
     * @param key value to be set
     * @return Builder
     */

    public ProductAddVariantActionBuilder key(@Nullable final String key) {
        this.key = key;
        return this;
    }

    /**
     *  <p>Embedded Prices for the Product Variant.</p>
     * @param prices value to be set
     * @return Builder
     */

    public ProductAddVariantActionBuilder prices(
            @Nullable final com.commercetools.api.models.common.PriceDraft... prices) {
        this.prices = new ArrayList<>(Arrays.asList(prices));
        return this;
    }

    /**
     *  <p>Embedded Prices for the Product Variant.</p>
     * @param prices value to be set
     * @return Builder
     */

    public ProductAddVariantActionBuilder prices(
            @Nullable final java.util.List<com.commercetools.api.models.common.PriceDraft> prices) {
        this.prices = prices;
        return this;
    }

    /**
     *  <p>Embedded Prices for the Product Variant.</p>
     * @param prices value to be set
     * @return Builder
     */

    public ProductAddVariantActionBuilder plusPrices(
            @Nullable final com.commercetools.api.models.common.PriceDraft... prices) {
        if (this.prices == null) {
            this.prices = new ArrayList<>();
        }
        this.prices.addAll(Arrays.asList(prices));
        return this;
    }

    /**
     *  <p>Embedded Prices for the Product Variant.</p>
     * @param builder function to build the prices value
     * @return Builder
     */

    public ProductAddVariantActionBuilder plusPrices(
            Function<com.commercetools.api.models.common.PriceDraftBuilder, com.commercetools.api.models.common.PriceDraftBuilder> builder) {
        if (this.prices == null) {
            this.prices = new ArrayList<>();
        }
        this.prices.add(builder.apply(com.commercetools.api.models.common.PriceDraftBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Embedded Prices for the Product Variant.</p>
     * @param builder function to build the prices value
     * @return Builder
     */

    public ProductAddVariantActionBuilder withPrices(
            Function<com.commercetools.api.models.common.PriceDraftBuilder, com.commercetools.api.models.common.PriceDraftBuilder> builder) {
        this.prices = new ArrayList<>();
        this.prices.add(builder.apply(com.commercetools.api.models.common.PriceDraftBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Embedded Prices for the Product Variant.</p>
     * @param builder function to build the prices value
     * @return Builder
     */

    public ProductAddVariantActionBuilder addPrices(
            Function<com.commercetools.api.models.common.PriceDraftBuilder, com.commercetools.api.models.common.PriceDraft> builder) {
        return plusPrices(builder.apply(com.commercetools.api.models.common.PriceDraftBuilder.of()));
    }

    /**
     *  <p>Embedded Prices for the Product Variant.</p>
     * @param builder function to build the prices value
     * @return Builder
     */

    public ProductAddVariantActionBuilder setPrices(
            Function<com.commercetools.api.models.common.PriceDraftBuilder, com.commercetools.api.models.common.PriceDraft> builder) {
        return prices(builder.apply(com.commercetools.api.models.common.PriceDraftBuilder.of()));
    }

    /**
     *  <p>Images for the Product Variant.</p>
     * @param images value to be set
     * @return Builder
     */

    public ProductAddVariantActionBuilder images(@Nullable final com.commercetools.api.models.common.Image... images) {
        this.images = new ArrayList<>(Arrays.asList(images));
        return this;
    }

    /**
     *  <p>Images for the Product Variant.</p>
     * @param images value to be set
     * @return Builder
     */

    public ProductAddVariantActionBuilder images(
            @Nullable final java.util.List<com.commercetools.api.models.common.Image> images) {
        this.images = images;
        return this;
    }

    /**
     *  <p>Images for the Product Variant.</p>
     * @param images value to be set
     * @return Builder
     */

    public ProductAddVariantActionBuilder plusImages(
            @Nullable final com.commercetools.api.models.common.Image... images) {
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

    public ProductAddVariantActionBuilder plusImages(
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

    public ProductAddVariantActionBuilder withImages(
            Function<com.commercetools.api.models.common.ImageBuilder, com.commercetools.api.models.common.ImageBuilder> builder) {
        this.images = new ArrayList<>();
        this.images.add(builder.apply(com.commercetools.api.models.common.ImageBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Images for the Product Variant.</p>
     * @param builder function to build the images value
     * @return Builder
     */

    public ProductAddVariantActionBuilder addImages(
            Function<com.commercetools.api.models.common.ImageBuilder, com.commercetools.api.models.common.Image> builder) {
        return plusImages(builder.apply(com.commercetools.api.models.common.ImageBuilder.of()));
    }

    /**
     *  <p>Images for the Product Variant.</p>
     * @param builder function to build the images value
     * @return Builder
     */

    public ProductAddVariantActionBuilder setImages(
            Function<com.commercetools.api.models.common.ImageBuilder, com.commercetools.api.models.common.Image> builder) {
        return images(builder.apply(com.commercetools.api.models.common.ImageBuilder.of()));
    }

    /**
     *  <p>Attributes for the Product Variant.</p>
     * @param attributes value to be set
     * @return Builder
     */

    public ProductAddVariantActionBuilder attributes(
            @Nullable final com.commercetools.api.models.product.Attribute... attributes) {
        this.attributes = new ArrayList<>(Arrays.asList(attributes));
        return this;
    }

    /**
     *  <p>Attributes for the Product Variant.</p>
     * @param attributes value to be set
     * @return Builder
     */

    public ProductAddVariantActionBuilder attributes(
            @Nullable final java.util.List<com.commercetools.api.models.product.Attribute> attributes) {
        this.attributes = attributes;
        return this;
    }

    /**
     *  <p>Attributes for the Product Variant.</p>
     * @param attributes value to be set
     * @return Builder
     */

    public ProductAddVariantActionBuilder plusAttributes(
            @Nullable final com.commercetools.api.models.product.Attribute... attributes) {
        if (this.attributes == null) {
            this.attributes = new ArrayList<>();
        }
        this.attributes.addAll(Arrays.asList(attributes));
        return this;
    }

    /**
     *  <p>Attributes for the Product Variant.</p>
     * @param builder function to build the attributes value
     * @return Builder
     */

    public ProductAddVariantActionBuilder plusAttributes(
            Function<com.commercetools.api.models.product.AttributeBuilder, com.commercetools.api.models.product.AttributeBuilder> builder) {
        if (this.attributes == null) {
            this.attributes = new ArrayList<>();
        }
        this.attributes.add(builder.apply(com.commercetools.api.models.product.AttributeBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Attributes for the Product Variant.</p>
     * @param builder function to build the attributes value
     * @return Builder
     */

    public ProductAddVariantActionBuilder withAttributes(
            Function<com.commercetools.api.models.product.AttributeBuilder, com.commercetools.api.models.product.AttributeBuilder> builder) {
        this.attributes = new ArrayList<>();
        this.attributes.add(builder.apply(com.commercetools.api.models.product.AttributeBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Attributes for the Product Variant.</p>
     * @param builder function to build the attributes value
     * @return Builder
     */

    public ProductAddVariantActionBuilder addAttributes(
            Function<com.commercetools.api.models.product.AttributeBuilder, com.commercetools.api.models.product.Attribute> builder) {
        return plusAttributes(builder.apply(com.commercetools.api.models.product.AttributeBuilder.of()));
    }

    /**
     *  <p>Attributes for the Product Variant.</p>
     * @param builder function to build the attributes value
     * @return Builder
     */

    public ProductAddVariantActionBuilder setAttributes(
            Function<com.commercetools.api.models.product.AttributeBuilder, com.commercetools.api.models.product.Attribute> builder) {
        return attributes(builder.apply(com.commercetools.api.models.product.AttributeBuilder.of()));
    }

    /**
     *  <p>If <code>true</code> the new Product Variant is only staged. If <code>false</code> the new Product Variant is both current and staged.</p>
     * @param staged value to be set
     * @return Builder
     */

    public ProductAddVariantActionBuilder staged(@Nullable final Boolean staged) {
        this.staged = staged;
        return this;
    }

    /**
     *  <p>Media assets for the Product Variant.</p>
     * @param assets value to be set
     * @return Builder
     */

    public ProductAddVariantActionBuilder assets(
            @Nullable final com.commercetools.api.models.common.AssetDraft... assets) {
        this.assets = new ArrayList<>(Arrays.asList(assets));
        return this;
    }

    /**
     *  <p>Media assets for the Product Variant.</p>
     * @param assets value to be set
     * @return Builder
     */

    public ProductAddVariantActionBuilder assets(
            @Nullable final java.util.List<com.commercetools.api.models.common.AssetDraft> assets) {
        this.assets = assets;
        return this;
    }

    /**
     *  <p>Media assets for the Product Variant.</p>
     * @param assets value to be set
     * @return Builder
     */

    public ProductAddVariantActionBuilder plusAssets(
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

    public ProductAddVariantActionBuilder plusAssets(
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

    public ProductAddVariantActionBuilder withAssets(
            Function<com.commercetools.api.models.common.AssetDraftBuilder, com.commercetools.api.models.common.AssetDraftBuilder> builder) {
        this.assets = new ArrayList<>();
        this.assets.add(builder.apply(com.commercetools.api.models.common.AssetDraftBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Media assets for the Product Variant.</p>
     * @param builder function to build the assets value
     * @return Builder
     */

    public ProductAddVariantActionBuilder addAssets(
            Function<com.commercetools.api.models.common.AssetDraftBuilder, com.commercetools.api.models.common.AssetDraft> builder) {
        return plusAssets(builder.apply(com.commercetools.api.models.common.AssetDraftBuilder.of()));
    }

    /**
     *  <p>Media assets for the Product Variant.</p>
     * @param builder function to build the assets value
     * @return Builder
     */

    public ProductAddVariantActionBuilder setAssets(
            Function<com.commercetools.api.models.common.AssetDraftBuilder, com.commercetools.api.models.common.AssetDraft> builder) {
        return assets(builder.apply(com.commercetools.api.models.common.AssetDraftBuilder.of()));
    }

    /**
     *  <p>Value to set. Must be unique.</p>
     * @return sku
     */

    @Nullable
    public String getSku() {
        return this.sku;
    }

    /**
     *  <p>Value to set. Must be unique.</p>
     * @return key
     */

    @Nullable
    public String getKey() {
        return this.key;
    }

    /**
     *  <p>Embedded Prices for the Product Variant.</p>
     * @return prices
     */

    @Nullable
    public java.util.List<com.commercetools.api.models.common.PriceDraft> getPrices() {
        return this.prices;
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
     *  <p>Attributes for the Product Variant.</p>
     * @return attributes
     */

    @Nullable
    public java.util.List<com.commercetools.api.models.product.Attribute> getAttributes() {
        return this.attributes;
    }

    /**
     *  <p>If <code>true</code> the new Product Variant is only staged. If <code>false</code> the new Product Variant is both current and staged.</p>
     * @return staged
     */

    @Nullable
    public Boolean getStaged() {
        return this.staged;
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
     * builds ProductAddVariantAction with checking for non-null required values
     * @return ProductAddVariantAction
     */
    public ProductAddVariantAction build() {
        return new ProductAddVariantActionImpl(sku, key, prices, images, attributes, staged, assets);
    }

    /**
     * builds ProductAddVariantAction without checking for non-null required values
     * @return ProductAddVariantAction
     */
    public ProductAddVariantAction buildUnchecked() {
        return new ProductAddVariantActionImpl(sku, key, prices, images, attributes, staged, assets);
    }

    /**
     * factory method for an instance of ProductAddVariantActionBuilder
     * @return builder
     */
    public static ProductAddVariantActionBuilder of() {
        return new ProductAddVariantActionBuilder();
    }

    /**
     * create builder for ProductAddVariantAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
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
