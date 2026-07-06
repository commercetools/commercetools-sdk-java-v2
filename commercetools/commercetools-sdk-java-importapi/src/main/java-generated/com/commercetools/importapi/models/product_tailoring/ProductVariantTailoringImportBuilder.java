
package com.commercetools.importapi.models.product_tailoring;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ProductVariantTailoringImportBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductVariantTailoringImport productVariantTailoringImport = ProductVariantTailoringImport.builder()
 *             .sku("{sku}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ProductVariantTailoringImportBuilder implements Builder<ProductVariantTailoringImport> {

    private String sku;

    @Nullable
    private java.util.List<com.commercetools.importapi.models.common.Image> images;

    @Nullable
    private java.util.List<com.commercetools.importapi.models.common.Asset> assets;

    @Nullable
    private java.util.List<com.commercetools.importapi.models.productvariants.Attribute> attributes;

    /**
     *  <p>The <code>sku</code> of the <a href="https://docs.commercetools.com/apis/ctp:api:type:ProductVariant" rel="nofollow">ProductVariant</a> to be tailored.</p>
     * @param sku value to be set
     * @return Builder
     */

    public ProductVariantTailoringImportBuilder sku(final String sku) {
        this.sku = sku;
        return this;
    }

    /**
     *  <p>Maps to <code>ProductVariantTailoring.images</code>.</p>
     * @param images value to be set
     * @return Builder
     */

    public ProductVariantTailoringImportBuilder images(
            @Nullable final com.commercetools.importapi.models.common.Image... images) {
        this.images = new ArrayList<>(Arrays.asList(images));
        return this;
    }

    /**
     *  <p>Maps to <code>ProductVariantTailoring.images</code>.</p>
     * @param images value to be set
     * @return Builder
     */

    public ProductVariantTailoringImportBuilder images(
            @Nullable final java.util.List<com.commercetools.importapi.models.common.Image> images) {
        this.images = images;
        return this;
    }

    /**
     *  <p>Maps to <code>ProductVariantTailoring.images</code>.</p>
     * @param images value to be set
     * @return Builder
     */

    public ProductVariantTailoringImportBuilder plusImages(
            @Nullable final com.commercetools.importapi.models.common.Image... images) {
        if (this.images == null) {
            this.images = new ArrayList<>();
        }
        this.images.addAll(Arrays.asList(images));
        return this;
    }

    /**
     *  <p>Maps to <code>ProductVariantTailoring.images</code>.</p>
     * @param builder function to build the images value
     * @return Builder
     */

    public ProductVariantTailoringImportBuilder plusImages(
            Function<com.commercetools.importapi.models.common.ImageBuilder, com.commercetools.importapi.models.common.ImageBuilder> builder) {
        if (this.images == null) {
            this.images = new ArrayList<>();
        }
        this.images.add(builder.apply(com.commercetools.importapi.models.common.ImageBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Maps to <code>ProductVariantTailoring.images</code>.</p>
     * @param builder function to build the images value
     * @return Builder
     */

    public ProductVariantTailoringImportBuilder withImages(
            Function<com.commercetools.importapi.models.common.ImageBuilder, com.commercetools.importapi.models.common.ImageBuilder> builder) {
        this.images = new ArrayList<>();
        this.images.add(builder.apply(com.commercetools.importapi.models.common.ImageBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Maps to <code>ProductVariantTailoring.images</code>.</p>
     * @param builder function to build the images value
     * @return Builder
     */

    public ProductVariantTailoringImportBuilder addImages(
            Function<com.commercetools.importapi.models.common.ImageBuilder, com.commercetools.importapi.models.common.Image> builder) {
        return plusImages(builder.apply(com.commercetools.importapi.models.common.ImageBuilder.of()));
    }

    /**
     *  <p>Maps to <code>ProductVariantTailoring.images</code>.</p>
     * @param builder function to build the images value
     * @return Builder
     */

    public ProductVariantTailoringImportBuilder setImages(
            Function<com.commercetools.importapi.models.common.ImageBuilder, com.commercetools.importapi.models.common.Image> builder) {
        return images(builder.apply(com.commercetools.importapi.models.common.ImageBuilder.of()));
    }

    /**
     *  <p>Maps to <code>ProductVariantTailoring.assets</code>.</p>
     * @param assets value to be set
     * @return Builder
     */

    public ProductVariantTailoringImportBuilder assets(
            @Nullable final com.commercetools.importapi.models.common.Asset... assets) {
        this.assets = new ArrayList<>(Arrays.asList(assets));
        return this;
    }

    /**
     *  <p>Maps to <code>ProductVariantTailoring.assets</code>.</p>
     * @param assets value to be set
     * @return Builder
     */

    public ProductVariantTailoringImportBuilder assets(
            @Nullable final java.util.List<com.commercetools.importapi.models.common.Asset> assets) {
        this.assets = assets;
        return this;
    }

    /**
     *  <p>Maps to <code>ProductVariantTailoring.assets</code>.</p>
     * @param assets value to be set
     * @return Builder
     */

    public ProductVariantTailoringImportBuilder plusAssets(
            @Nullable final com.commercetools.importapi.models.common.Asset... assets) {
        if (this.assets == null) {
            this.assets = new ArrayList<>();
        }
        this.assets.addAll(Arrays.asList(assets));
        return this;
    }

    /**
     *  <p>Maps to <code>ProductVariantTailoring.assets</code>.</p>
     * @param builder function to build the assets value
     * @return Builder
     */

    public ProductVariantTailoringImportBuilder plusAssets(
            Function<com.commercetools.importapi.models.common.AssetBuilder, com.commercetools.importapi.models.common.AssetBuilder> builder) {
        if (this.assets == null) {
            this.assets = new ArrayList<>();
        }
        this.assets.add(builder.apply(com.commercetools.importapi.models.common.AssetBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Maps to <code>ProductVariantTailoring.assets</code>.</p>
     * @param builder function to build the assets value
     * @return Builder
     */

    public ProductVariantTailoringImportBuilder withAssets(
            Function<com.commercetools.importapi.models.common.AssetBuilder, com.commercetools.importapi.models.common.AssetBuilder> builder) {
        this.assets = new ArrayList<>();
        this.assets.add(builder.apply(com.commercetools.importapi.models.common.AssetBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Maps to <code>ProductVariantTailoring.assets</code>.</p>
     * @param builder function to build the assets value
     * @return Builder
     */

    public ProductVariantTailoringImportBuilder addAssets(
            Function<com.commercetools.importapi.models.common.AssetBuilder, com.commercetools.importapi.models.common.Asset> builder) {
        return plusAssets(builder.apply(com.commercetools.importapi.models.common.AssetBuilder.of()));
    }

    /**
     *  <p>Maps to <code>ProductVariantTailoring.assets</code>.</p>
     * @param builder function to build the assets value
     * @return Builder
     */

    public ProductVariantTailoringImportBuilder setAssets(
            Function<com.commercetools.importapi.models.common.AssetBuilder, com.commercetools.importapi.models.common.Asset> builder) {
        return assets(builder.apply(com.commercetools.importapi.models.common.AssetBuilder.of()));
    }

    /**
     *  <p>Maps to <code>ProductVariantTailoring.attributes</code>.</p>
     * @param attributes value to be set
     * @return Builder
     */

    public ProductVariantTailoringImportBuilder attributes(
            @Nullable final com.commercetools.importapi.models.productvariants.Attribute... attributes) {
        this.attributes = new ArrayList<>(Arrays.asList(attributes));
        return this;
    }

    /**
     *  <p>Maps to <code>ProductVariantTailoring.attributes</code>.</p>
     * @param attributes value to be set
     * @return Builder
     */

    public ProductVariantTailoringImportBuilder attributes(
            @Nullable final java.util.List<com.commercetools.importapi.models.productvariants.Attribute> attributes) {
        this.attributes = attributes;
        return this;
    }

    /**
     *  <p>Maps to <code>ProductVariantTailoring.attributes</code>.</p>
     * @param attributes value to be set
     * @return Builder
     */

    public ProductVariantTailoringImportBuilder plusAttributes(
            @Nullable final com.commercetools.importapi.models.productvariants.Attribute... attributes) {
        if (this.attributes == null) {
            this.attributes = new ArrayList<>();
        }
        this.attributes.addAll(Arrays.asList(attributes));
        return this;
    }

    /**
     *  <p>Maps to <code>ProductVariantTailoring.attributes</code>.</p>
     * @param builder function to build the attributes value
     * @return Builder
     */

    public ProductVariantTailoringImportBuilder plusAttributes(
            Function<com.commercetools.importapi.models.productvariants.AttributeBuilder, Builder<? extends com.commercetools.importapi.models.productvariants.Attribute>> builder) {
        if (this.attributes == null) {
            this.attributes = new ArrayList<>();
        }
        this.attributes
                .add(builder.apply(com.commercetools.importapi.models.productvariants.AttributeBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Maps to <code>ProductVariantTailoring.attributes</code>.</p>
     * @param builder function to build the attributes value
     * @return Builder
     */

    public ProductVariantTailoringImportBuilder withAttributes(
            Function<com.commercetools.importapi.models.productvariants.AttributeBuilder, Builder<? extends com.commercetools.importapi.models.productvariants.Attribute>> builder) {
        this.attributes = new ArrayList<>();
        this.attributes
                .add(builder.apply(com.commercetools.importapi.models.productvariants.AttributeBuilder.of()).build());
        return this;
    }

    /**
     *  <p>The <code>sku</code> of the <a href="https://docs.commercetools.com/apis/ctp:api:type:ProductVariant" rel="nofollow">ProductVariant</a> to be tailored.</p>
     * @return sku
     */

    public String getSku() {
        return this.sku;
    }

    /**
     *  <p>Maps to <code>ProductVariantTailoring.images</code>.</p>
     * @return images
     */

    @Nullable
    public java.util.List<com.commercetools.importapi.models.common.Image> getImages() {
        return this.images;
    }

    /**
     *  <p>Maps to <code>ProductVariantTailoring.assets</code>.</p>
     * @return assets
     */

    @Nullable
    public java.util.List<com.commercetools.importapi.models.common.Asset> getAssets() {
        return this.assets;
    }

    /**
     *  <p>Maps to <code>ProductVariantTailoring.attributes</code>.</p>
     * @return attributes
     */

    @Nullable
    public java.util.List<com.commercetools.importapi.models.productvariants.Attribute> getAttributes() {
        return this.attributes;
    }

    /**
     * builds ProductVariantTailoringImport with checking for non-null required values
     * @return ProductVariantTailoringImport
     */
    public ProductVariantTailoringImport build() {
        Objects.requireNonNull(sku, ProductVariantTailoringImport.class + ": sku is missing");
        return new ProductVariantTailoringImportImpl(sku, images, assets, attributes);
    }

    /**
     * builds ProductVariantTailoringImport without checking for non-null required values
     * @return ProductVariantTailoringImport
     */
    public ProductVariantTailoringImport buildUnchecked() {
        return new ProductVariantTailoringImportImpl(sku, images, assets, attributes);
    }

    /**
     * factory method for an instance of ProductVariantTailoringImportBuilder
     * @return builder
     */
    public static ProductVariantTailoringImportBuilder of() {
        return new ProductVariantTailoringImportBuilder();
    }

    /**
     * create builder for ProductVariantTailoringImport instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ProductVariantTailoringImportBuilder of(final ProductVariantTailoringImport template) {
        ProductVariantTailoringImportBuilder builder = new ProductVariantTailoringImportBuilder();
        builder.sku = template.getSku();
        builder.images = template.getImages();
        builder.assets = template.getAssets();
        builder.attributes = template.getAttributes();
        return builder;
    }

}
