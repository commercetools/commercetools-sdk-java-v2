
package com.commercetools.importapi.models.productvariants;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ProductVariantImportBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductVariantImport productVariantImport = ProductVariantImport.builder()
 *             .key("{key}")
 *             .isMasterVariant(true)
 *             .product(productBuilder -> productBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ProductVariantImportBuilder implements Builder<ProductVariantImport> {

    private String key;

    @Nullable
    private String sku;

    private Boolean isMasterVariant;

    @Nullable
    private java.util.List<com.commercetools.importapi.models.productvariants.Attribute> attributes;

    @Nullable
    private java.util.List<com.commercetools.importapi.models.common.Image> images;

    @Nullable
    private java.util.List<com.commercetools.importapi.models.common.Asset> assets;

    @Nullable
    private Boolean publish;

    private com.commercetools.importapi.models.common.ProductKeyReference product;

    /**
     <>
     */

    public ProductVariantImportBuilder key(final String key) {
        this.key = key;
        return this;
    }

    /**
     <*  <p>Maps to <code>ProductVariant.sku</code>.</p>>
     */

    public ProductVariantImportBuilder sku(@Nullable final String sku) {
        this.sku = sku;
        return this;
    }

    /**
     <*  <p>Maps to <code>ProductVariant.isMasterVariant</code>.</p>>
     */

    public ProductVariantImportBuilder isMasterVariant(final Boolean isMasterVariant) {
        this.isMasterVariant = isMasterVariant;
        return this;
    }

    /**
     <*  <p>Maps to <code>ProductVariant.attributes</code>. The referenced attribute must be defined in an already existing ProductType in the commercetools project, or the <code>state</code> of the ImportOperation will be <code>unresolved</code>.</p>>
     */

    public ProductVariantImportBuilder attributes(
            @Nullable final com.commercetools.importapi.models.productvariants.Attribute... attributes) {
        this.attributes = new ArrayList<>(Arrays.asList(attributes));
        return this;
    }

    /**
     <*  <p>Maps to <code>ProductVariant.attributes</code>. The referenced attribute must be defined in an already existing ProductType in the commercetools project, or the <code>state</code> of the ImportOperation will be <code>unresolved</code>.</p>>
     */

    public ProductVariantImportBuilder attributes(
            @Nullable final java.util.List<com.commercetools.importapi.models.productvariants.Attribute> attributes) {
        this.attributes = attributes;
        return this;
    }

    /**
     <*  <p>Maps to <code>ProductVariant.attributes</code>. The referenced attribute must be defined in an already existing ProductType in the commercetools project, or the <code>state</code> of the ImportOperation will be <code>unresolved</code>.</p>>
     */

    public ProductVariantImportBuilder plusAttributes(
            @Nullable final com.commercetools.importapi.models.productvariants.Attribute... attributes) {
        if (this.attributes == null) {
            this.attributes = new ArrayList<>();
        }
        this.attributes.addAll(Arrays.asList(attributes));
        return this;
    }

    /**
     <*  <p>Maps to <code>ProductVariant.attributes</code>. The referenced attribute must be defined in an already existing ProductType in the commercetools project, or the <code>state</code> of the ImportOperation will be <code>unresolved</code>.</p>>
     */

    public ProductVariantImportBuilder plusAttributes(
            Function<com.commercetools.importapi.models.productvariants.AttributeBuilder, Builder<? extends com.commercetools.importapi.models.productvariants.Attribute>> builder) {
        if (this.attributes == null) {
            this.attributes = new ArrayList<>();
        }
        this.attributes
                .add(builder.apply(com.commercetools.importapi.models.productvariants.AttributeBuilder.of()).build());
        return this;
    }

    /**
     <*  <p>Maps to <code>ProductVariant.attributes</code>. The referenced attribute must be defined in an already existing ProductType in the commercetools project, or the <code>state</code> of the ImportOperation will be <code>unresolved</code>.</p>>
     */

    public ProductVariantImportBuilder withAttributes(
            Function<com.commercetools.importapi.models.productvariants.AttributeBuilder, Builder<? extends com.commercetools.importapi.models.productvariants.Attribute>> builder) {
        this.attributes = new ArrayList<>();
        this.attributes
                .add(builder.apply(com.commercetools.importapi.models.productvariants.AttributeBuilder.of()).build());
        return this;
    }

    /**
     <*  <p>Maps to <code>ProductVariant.images</code>.</p>>
     */

    public ProductVariantImportBuilder images(
            @Nullable final com.commercetools.importapi.models.common.Image... images) {
        this.images = new ArrayList<>(Arrays.asList(images));
        return this;
    }

    /**
     <*  <p>Maps to <code>ProductVariant.images</code>.</p>>
     */

    public ProductVariantImportBuilder images(
            @Nullable final java.util.List<com.commercetools.importapi.models.common.Image> images) {
        this.images = images;
        return this;
    }

    /**
     <*  <p>Maps to <code>ProductVariant.images</code>.</p>>
     */

    public ProductVariantImportBuilder plusImages(
            @Nullable final com.commercetools.importapi.models.common.Image... images) {
        if (this.images == null) {
            this.images = new ArrayList<>();
        }
        this.images.addAll(Arrays.asList(images));
        return this;
    }

    /**
     <*  <p>Maps to <code>ProductVariant.images</code>.</p>>
     */

    public ProductVariantImportBuilder plusImages(
            Function<com.commercetools.importapi.models.common.ImageBuilder, com.commercetools.importapi.models.common.ImageBuilder> builder) {
        if (this.images == null) {
            this.images = new ArrayList<>();
        }
        this.images.add(builder.apply(com.commercetools.importapi.models.common.ImageBuilder.of()).build());
        return this;
    }

    /**
     <*  <p>Maps to <code>ProductVariant.images</code>.</p>>
     */

    public ProductVariantImportBuilder withImages(
            Function<com.commercetools.importapi.models.common.ImageBuilder, com.commercetools.importapi.models.common.ImageBuilder> builder) {
        this.images = new ArrayList<>();
        this.images.add(builder.apply(com.commercetools.importapi.models.common.ImageBuilder.of()).build());
        return this;
    }

    /**
     <*  <p>Maps to <code>ProductVariant.assets</code>.</p>>
     */

    public ProductVariantImportBuilder assets(
            @Nullable final com.commercetools.importapi.models.common.Asset... assets) {
        this.assets = new ArrayList<>(Arrays.asList(assets));
        return this;
    }

    /**
     <*  <p>Maps to <code>ProductVariant.assets</code>.</p>>
     */

    public ProductVariantImportBuilder assets(
            @Nullable final java.util.List<com.commercetools.importapi.models.common.Asset> assets) {
        this.assets = assets;
        return this;
    }

    /**
     <*  <p>Maps to <code>ProductVariant.assets</code>.</p>>
     */

    public ProductVariantImportBuilder plusAssets(
            @Nullable final com.commercetools.importapi.models.common.Asset... assets) {
        if (this.assets == null) {
            this.assets = new ArrayList<>();
        }
        this.assets.addAll(Arrays.asList(assets));
        return this;
    }

    /**
     <*  <p>Maps to <code>ProductVariant.assets</code>.</p>>
     */

    public ProductVariantImportBuilder plusAssets(
            Function<com.commercetools.importapi.models.common.AssetBuilder, com.commercetools.importapi.models.common.AssetBuilder> builder) {
        if (this.assets == null) {
            this.assets = new ArrayList<>();
        }
        this.assets.add(builder.apply(com.commercetools.importapi.models.common.AssetBuilder.of()).build());
        return this;
    }

    /**
     <*  <p>Maps to <code>ProductVariant.assets</code>.</p>>
     */

    public ProductVariantImportBuilder withAssets(
            Function<com.commercetools.importapi.models.common.AssetBuilder, com.commercetools.importapi.models.common.AssetBuilder> builder) {
        this.assets = new ArrayList<>();
        this.assets.add(builder.apply(com.commercetools.importapi.models.common.AssetBuilder.of()).build());
        return this;
    }

    /**
     <*  <p>If <code>publish</code> is set to either <code>true</code> or <code>false</code>, both staged and current projections are set to the same value provided by the import data. If <code>publish</code> is not set, the staged projection is set to the provided import data, but the current projection stays unchanged. However, if the import data contains no update, that is, if it matches the staged projection of the existing Product in the platform, the import induces no change in the existing Product whether <code>publish</code> is set or not.</p>>
     */

    public ProductVariantImportBuilder publish(@Nullable final Boolean publish) {
        this.publish = publish;
        return this;
    }

    /**
     <*  <p>The Product to which this Product Variant belongs. Maps to <code>ProductVariant.product</code>. The Reference to the Product with which the ProductVariant is associated. If referenced Product does not exist, the <code>state</code> of the ImportOperation will be set to <code>unresolved</code> until the necessary Product is created.</p>>
     */

    public ProductVariantImportBuilder product(
            Function<com.commercetools.importapi.models.common.ProductKeyReferenceBuilder, com.commercetools.importapi.models.common.ProductKeyReferenceBuilder> builder) {
        this.product = builder.apply(com.commercetools.importapi.models.common.ProductKeyReferenceBuilder.of()).build();
        return this;
    }

    /**
     <*  <p>The Product to which this Product Variant belongs. Maps to <code>ProductVariant.product</code>. The Reference to the Product with which the ProductVariant is associated. If referenced Product does not exist, the <code>state</code> of the ImportOperation will be set to <code>unresolved</code> until the necessary Product is created.</p>>
     */

    public ProductVariantImportBuilder product(
            final com.commercetools.importapi.models.common.ProductKeyReference product) {
        this.product = product;
        return this;
    }

    public String getKey() {
        return this.key;
    }

    @Nullable
    public String getSku() {
        return this.sku;
    }

    public Boolean getIsMasterVariant() {
        return this.isMasterVariant;
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

    @Nullable
    public Boolean getPublish() {
        return this.publish;
    }

    public com.commercetools.importapi.models.common.ProductKeyReference getProduct() {
        return this.product;
    }

    public ProductVariantImport build() {
        Objects.requireNonNull(key, ProductVariantImport.class + ": key is missing");
        Objects.requireNonNull(isMasterVariant, ProductVariantImport.class + ": isMasterVariant is missing");
        Objects.requireNonNull(product, ProductVariantImport.class + ": product is missing");
        return new ProductVariantImportImpl(key, sku, isMasterVariant, attributes, images, assets, publish, product);
    }

    /**
     * builds ProductVariantImport without checking for non null required values
     */
    public ProductVariantImport buildUnchecked() {
        return new ProductVariantImportImpl(key, sku, isMasterVariant, attributes, images, assets, publish, product);
    }

    public static ProductVariantImportBuilder of() {
        return new ProductVariantImportBuilder();
    }

    public static ProductVariantImportBuilder of(final ProductVariantImport template) {
        ProductVariantImportBuilder builder = new ProductVariantImportBuilder();
        builder.key = template.getKey();
        builder.sku = template.getSku();
        builder.isMasterVariant = template.getIsMasterVariant();
        builder.attributes = template.getAttributes();
        builder.images = template.getImages();
        builder.assets = template.getAssets();
        builder.publish = template.getPublish();
        builder.product = template.getProduct();
        return builder;
    }

}
