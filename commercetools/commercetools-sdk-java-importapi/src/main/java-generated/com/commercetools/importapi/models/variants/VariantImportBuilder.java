
package com.commercetools.importapi.models.variants;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * VariantImportBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     VariantImport variantImport = VariantImport.builder()
 *             .key("{key}")
 *             .sku("{sku}")
 *             .product(productBuilder -> productBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class VariantImportBuilder implements Builder<VariantImport> {

    private String key;

    private String sku;

    private com.commercetools.importapi.models.common.ProductKeyReference product;

    @Nullable
    private Boolean publish;

    @Nullable
    private java.util.List<com.commercetools.importapi.models.common.Image> images;

    @Nullable
    private java.util.List<com.commercetools.importapi.models.productvariants.Attribute> attributes;

    @Nullable
    private java.util.List<com.commercetools.importapi.models.common.Asset> assets;

    /**
     *  <p>User-defined unique identifier. If a Variant with this <code>key</code> exists, it is updated with the imported data.</p>
     * @param key value to be set
     * @return Builder
     */

    public VariantImportBuilder key(final String key) {
        this.key = key;
        return this;
    }

    /**
     *  <p>Maps to <code>VariantData.sku</code>.</p>
     * @param sku value to be set
     * @return Builder
     */

    public VariantImportBuilder sku(final String sku) {
        this.sku = sku;
        return this;
    }

    /**
     *  <p>Maps to <code>Variant.product</code>.</p>
     * @param builder function to build the product value
     * @return Builder
     */

    public VariantImportBuilder product(
            Function<com.commercetools.importapi.models.common.ProductKeyReferenceBuilder, com.commercetools.importapi.models.common.ProductKeyReferenceBuilder> builder) {
        this.product = builder.apply(com.commercetools.importapi.models.common.ProductKeyReferenceBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Maps to <code>Variant.product</code>.</p>
     * @param builder function to build the product value
     * @return Builder
     */

    public VariantImportBuilder withProduct(
            Function<com.commercetools.importapi.models.common.ProductKeyReferenceBuilder, com.commercetools.importapi.models.common.ProductKeyReference> builder) {
        this.product = builder.apply(com.commercetools.importapi.models.common.ProductKeyReferenceBuilder.of());
        return this;
    }

    /**
     *  <p>Maps to <code>Variant.product</code>.</p>
     * @param product value to be set
     * @return Builder
     */

    public VariantImportBuilder product(final com.commercetools.importapi.models.common.ProductKeyReference product) {
        this.product = product;
        return this;
    }

    /**
     *  <p>Indicates whether the Variant is published. If <code>true</code>, the Variant is immediately available in the current published state. Maps to <code>VariantDraft.publish</code>.</p>
     * @param publish value to be set
     * @return Builder
     */

    public VariantImportBuilder publish(@Nullable final Boolean publish) {
        this.publish = publish;
        return this;
    }

    /**
     *  <p>Maps to <code>VariantData.images</code>.</p>
     * @param images value to be set
     * @return Builder
     */

    public VariantImportBuilder images(@Nullable final com.commercetools.importapi.models.common.Image... images) {
        this.images = new ArrayList<>(Arrays.asList(images));
        return this;
    }

    /**
     *  <p>Maps to <code>VariantData.images</code>.</p>
     * @param images value to be set
     * @return Builder
     */

    public VariantImportBuilder images(
            @Nullable final java.util.List<com.commercetools.importapi.models.common.Image> images) {
        this.images = images;
        return this;
    }

    /**
     *  <p>Maps to <code>VariantData.images</code>.</p>
     * @param images value to be set
     * @return Builder
     */

    public VariantImportBuilder plusImages(@Nullable final com.commercetools.importapi.models.common.Image... images) {
        if (this.images == null) {
            this.images = new ArrayList<>();
        }
        this.images.addAll(Arrays.asList(images));
        return this;
    }

    /**
     *  <p>Maps to <code>VariantData.images</code>.</p>
     * @param builder function to build the images value
     * @return Builder
     */

    public VariantImportBuilder plusImages(
            Function<com.commercetools.importapi.models.common.ImageBuilder, com.commercetools.importapi.models.common.ImageBuilder> builder) {
        if (this.images == null) {
            this.images = new ArrayList<>();
        }
        this.images.add(builder.apply(com.commercetools.importapi.models.common.ImageBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Maps to <code>VariantData.images</code>.</p>
     * @param builder function to build the images value
     * @return Builder
     */

    public VariantImportBuilder withImages(
            Function<com.commercetools.importapi.models.common.ImageBuilder, com.commercetools.importapi.models.common.ImageBuilder> builder) {
        this.images = new ArrayList<>();
        this.images.add(builder.apply(com.commercetools.importapi.models.common.ImageBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Maps to <code>VariantData.images</code>.</p>
     * @param builder function to build the images value
     * @return Builder
     */

    public VariantImportBuilder addImages(
            Function<com.commercetools.importapi.models.common.ImageBuilder, com.commercetools.importapi.models.common.Image> builder) {
        return plusImages(builder.apply(com.commercetools.importapi.models.common.ImageBuilder.of()));
    }

    /**
     *  <p>Maps to <code>VariantData.images</code>.</p>
     * @param builder function to build the images value
     * @return Builder
     */

    public VariantImportBuilder setImages(
            Function<com.commercetools.importapi.models.common.ImageBuilder, com.commercetools.importapi.models.common.Image> builder) {
        return images(builder.apply(com.commercetools.importapi.models.common.ImageBuilder.of()));
    }

    /**
     *  <p>Maps to <code>VariantData.attributes</code>.</p>
     * @param attributes value to be set
     * @return Builder
     */

    public VariantImportBuilder attributes(
            @Nullable final com.commercetools.importapi.models.productvariants.Attribute... attributes) {
        this.attributes = new ArrayList<>(Arrays.asList(attributes));
        return this;
    }

    /**
     *  <p>Maps to <code>VariantData.attributes</code>.</p>
     * @param attributes value to be set
     * @return Builder
     */

    public VariantImportBuilder attributes(
            @Nullable final java.util.List<com.commercetools.importapi.models.productvariants.Attribute> attributes) {
        this.attributes = attributes;
        return this;
    }

    /**
     *  <p>Maps to <code>VariantData.attributes</code>.</p>
     * @param attributes value to be set
     * @return Builder
     */

    public VariantImportBuilder plusAttributes(
            @Nullable final com.commercetools.importapi.models.productvariants.Attribute... attributes) {
        if (this.attributes == null) {
            this.attributes = new ArrayList<>();
        }
        this.attributes.addAll(Arrays.asList(attributes));
        return this;
    }

    /**
     *  <p>Maps to <code>VariantData.attributes</code>.</p>
     * @param builder function to build the attributes value
     * @return Builder
     */

    public VariantImportBuilder plusAttributes(
            Function<com.commercetools.importapi.models.productvariants.AttributeBuilder, Builder<? extends com.commercetools.importapi.models.productvariants.Attribute>> builder) {
        if (this.attributes == null) {
            this.attributes = new ArrayList<>();
        }
        this.attributes
                .add(builder.apply(com.commercetools.importapi.models.productvariants.AttributeBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Maps to <code>VariantData.attributes</code>.</p>
     * @param builder function to build the attributes value
     * @return Builder
     */

    public VariantImportBuilder withAttributes(
            Function<com.commercetools.importapi.models.productvariants.AttributeBuilder, Builder<? extends com.commercetools.importapi.models.productvariants.Attribute>> builder) {
        this.attributes = new ArrayList<>();
        this.attributes
                .add(builder.apply(com.commercetools.importapi.models.productvariants.AttributeBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Maps to <code>VariantData.assets</code>.</p>
     * @param assets value to be set
     * @return Builder
     */

    public VariantImportBuilder assets(@Nullable final com.commercetools.importapi.models.common.Asset... assets) {
        this.assets = new ArrayList<>(Arrays.asList(assets));
        return this;
    }

    /**
     *  <p>Maps to <code>VariantData.assets</code>.</p>
     * @param assets value to be set
     * @return Builder
     */

    public VariantImportBuilder assets(
            @Nullable final java.util.List<com.commercetools.importapi.models.common.Asset> assets) {
        this.assets = assets;
        return this;
    }

    /**
     *  <p>Maps to <code>VariantData.assets</code>.</p>
     * @param assets value to be set
     * @return Builder
     */

    public VariantImportBuilder plusAssets(@Nullable final com.commercetools.importapi.models.common.Asset... assets) {
        if (this.assets == null) {
            this.assets = new ArrayList<>();
        }
        this.assets.addAll(Arrays.asList(assets));
        return this;
    }

    /**
     *  <p>Maps to <code>VariantData.assets</code>.</p>
     * @param builder function to build the assets value
     * @return Builder
     */

    public VariantImportBuilder plusAssets(
            Function<com.commercetools.importapi.models.common.AssetBuilder, com.commercetools.importapi.models.common.AssetBuilder> builder) {
        if (this.assets == null) {
            this.assets = new ArrayList<>();
        }
        this.assets.add(builder.apply(com.commercetools.importapi.models.common.AssetBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Maps to <code>VariantData.assets</code>.</p>
     * @param builder function to build the assets value
     * @return Builder
     */

    public VariantImportBuilder withAssets(
            Function<com.commercetools.importapi.models.common.AssetBuilder, com.commercetools.importapi.models.common.AssetBuilder> builder) {
        this.assets = new ArrayList<>();
        this.assets.add(builder.apply(com.commercetools.importapi.models.common.AssetBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Maps to <code>VariantData.assets</code>.</p>
     * @param builder function to build the assets value
     * @return Builder
     */

    public VariantImportBuilder addAssets(
            Function<com.commercetools.importapi.models.common.AssetBuilder, com.commercetools.importapi.models.common.Asset> builder) {
        return plusAssets(builder.apply(com.commercetools.importapi.models.common.AssetBuilder.of()));
    }

    /**
     *  <p>Maps to <code>VariantData.assets</code>.</p>
     * @param builder function to build the assets value
     * @return Builder
     */

    public VariantImportBuilder setAssets(
            Function<com.commercetools.importapi.models.common.AssetBuilder, com.commercetools.importapi.models.common.Asset> builder) {
        return assets(builder.apply(com.commercetools.importapi.models.common.AssetBuilder.of()));
    }

    /**
     *  <p>User-defined unique identifier. If a Variant with this <code>key</code> exists, it is updated with the imported data.</p>
     * @return key
     */

    public String getKey() {
        return this.key;
    }

    /**
     *  <p>Maps to <code>VariantData.sku</code>.</p>
     * @return sku
     */

    public String getSku() {
        return this.sku;
    }

    /**
     *  <p>Maps to <code>Variant.product</code>.</p>
     * @return product
     */

    public com.commercetools.importapi.models.common.ProductKeyReference getProduct() {
        return this.product;
    }

    /**
     *  <p>Indicates whether the Variant is published. If <code>true</code>, the Variant is immediately available in the current published state. Maps to <code>VariantDraft.publish</code>.</p>
     * @return publish
     */

    @Nullable
    public Boolean getPublish() {
        return this.publish;
    }

    /**
     *  <p>Maps to <code>VariantData.images</code>.</p>
     * @return images
     */

    @Nullable
    public java.util.List<com.commercetools.importapi.models.common.Image> getImages() {
        return this.images;
    }

    /**
     *  <p>Maps to <code>VariantData.attributes</code>.</p>
     * @return attributes
     */

    @Nullable
    public java.util.List<com.commercetools.importapi.models.productvariants.Attribute> getAttributes() {
        return this.attributes;
    }

    /**
     *  <p>Maps to <code>VariantData.assets</code>.</p>
     * @return assets
     */

    @Nullable
    public java.util.List<com.commercetools.importapi.models.common.Asset> getAssets() {
        return this.assets;
    }

    /**
     * builds VariantImport with checking for non-null required values
     * @return VariantImport
     */
    public VariantImport build() {
        Objects.requireNonNull(key, VariantImport.class + ": key is missing");
        Objects.requireNonNull(sku, VariantImport.class + ": sku is missing");
        Objects.requireNonNull(product, VariantImport.class + ": product is missing");
        return new VariantImportImpl(key, sku, product, publish, images, attributes, assets);
    }

    /**
     * builds VariantImport without checking for non-null required values
     * @return VariantImport
     */
    public VariantImport buildUnchecked() {
        return new VariantImportImpl(key, sku, product, publish, images, attributes, assets);
    }

    /**
     * factory method for an instance of VariantImportBuilder
     * @return builder
     */
    public static VariantImportBuilder of() {
        return new VariantImportBuilder();
    }

    /**
     * create builder for VariantImport instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static VariantImportBuilder of(final VariantImport template) {
        VariantImportBuilder builder = new VariantImportBuilder();
        builder.key = template.getKey();
        builder.sku = template.getSku();
        builder.product = template.getProduct();
        builder.publish = template.getPublish();
        builder.images = template.getImages();
        builder.attributes = template.getAttributes();
        builder.assets = template.getAssets();
        return builder;
    }

}
