
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
    private Boolean staged;

    private com.commercetools.importapi.models.common.ProductKeyReference product;

    /**
     *  <p>User-defined unique identifier. If a ProductVariant with this <code>key</code> exists on the specified <code>product</code>, it is updated with the imported data.</p>
     * @param key value to be set
     * @return Builder
     */

    public ProductVariantImportBuilder key(final String key) {
        this.key = key;
        return this;
    }

    /**
     *  <p>Maps to <code>ProductVariant.sku</code>.</p>
     * @param sku value to be set
     * @return Builder
     */

    public ProductVariantImportBuilder sku(@Nullable final String sku) {
        this.sku = sku;
        return this;
    }

    /**
     *  <ul>
     *   <li>When creating a new ProductVariant, set to <code>false</code>; otherwise, the import operation will fail with a NewMasterVariantAdditionNotAllowed error.</li>
     *   <li>Set to <code>true</code> if the ProductVariant exists and you want to set this ProductVariant as the Master Variant.</li>
     *  </ul>
     * @param isMasterVariant value to be set
     * @return Builder
     */

    public ProductVariantImportBuilder isMasterVariant(final Boolean isMasterVariant) {
        this.isMasterVariant = isMasterVariant;
        return this;
    }

    /**
     *  <p>Maps to <code>ProductVariant.attributes</code>. The referenced attribute must be defined in an already existing ProductType in the project, or the <code>state</code> of the ImportOperation will be <code>unresolved</code>.</p>
     * @param attributes value to be set
     * @return Builder
     */

    public ProductVariantImportBuilder attributes(
            @Nullable final com.commercetools.importapi.models.productvariants.Attribute... attributes) {
        this.attributes = new ArrayList<>(Arrays.asList(attributes));
        return this;
    }

    /**
     *  <p>Maps to <code>ProductVariant.attributes</code>. The referenced attribute must be defined in an already existing ProductType in the project, or the <code>state</code> of the ImportOperation will be <code>unresolved</code>.</p>
     * @param attributes value to be set
     * @return Builder
     */

    public ProductVariantImportBuilder attributes(
            @Nullable final java.util.List<com.commercetools.importapi.models.productvariants.Attribute> attributes) {
        this.attributes = attributes;
        return this;
    }

    /**
     *  <p>Maps to <code>ProductVariant.attributes</code>. The referenced attribute must be defined in an already existing ProductType in the project, or the <code>state</code> of the ImportOperation will be <code>unresolved</code>.</p>
     * @param attributes value to be set
     * @return Builder
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
     *  <p>Maps to <code>ProductVariant.attributes</code>. The referenced attribute must be defined in an already existing ProductType in the project, or the <code>state</code> of the ImportOperation will be <code>unresolved</code>.</p>
     * @param builder function to build the attributes value
     * @return Builder
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
     *  <p>Maps to <code>ProductVariant.attributes</code>. The referenced attribute must be defined in an already existing ProductType in the project, or the <code>state</code> of the ImportOperation will be <code>unresolved</code>.</p>
     * @param builder function to build the attributes value
     * @return Builder
     */

    public ProductVariantImportBuilder withAttributes(
            Function<com.commercetools.importapi.models.productvariants.AttributeBuilder, Builder<? extends com.commercetools.importapi.models.productvariants.Attribute>> builder) {
        this.attributes = new ArrayList<>();
        this.attributes
                .add(builder.apply(com.commercetools.importapi.models.productvariants.AttributeBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Maps to <code>ProductVariant.images</code>.</p>
     * @param images value to be set
     * @return Builder
     */

    public ProductVariantImportBuilder images(
            @Nullable final com.commercetools.importapi.models.common.Image... images) {
        this.images = new ArrayList<>(Arrays.asList(images));
        return this;
    }

    /**
     *  <p>Maps to <code>ProductVariant.images</code>.</p>
     * @param images value to be set
     * @return Builder
     */

    public ProductVariantImportBuilder images(
            @Nullable final java.util.List<com.commercetools.importapi.models.common.Image> images) {
        this.images = images;
        return this;
    }

    /**
     *  <p>Maps to <code>ProductVariant.images</code>.</p>
     * @param images value to be set
     * @return Builder
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
     *  <p>Maps to <code>ProductVariant.images</code>.</p>
     * @param builder function to build the images value
     * @return Builder
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
     *  <p>Maps to <code>ProductVariant.images</code>.</p>
     * @param builder function to build the images value
     * @return Builder
     */

    public ProductVariantImportBuilder withImages(
            Function<com.commercetools.importapi.models.common.ImageBuilder, com.commercetools.importapi.models.common.ImageBuilder> builder) {
        this.images = new ArrayList<>();
        this.images.add(builder.apply(com.commercetools.importapi.models.common.ImageBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Maps to <code>ProductVariant.images</code>.</p>
     * @param builder function to build the images value
     * @return Builder
     */

    public ProductVariantImportBuilder addImages(
            Function<com.commercetools.importapi.models.common.ImageBuilder, com.commercetools.importapi.models.common.Image> builder) {
        return plusImages(builder.apply(com.commercetools.importapi.models.common.ImageBuilder.of()));
    }

    /**
     *  <p>Maps to <code>ProductVariant.images</code>.</p>
     * @param builder function to build the images value
     * @return Builder
     */

    public ProductVariantImportBuilder setImages(
            Function<com.commercetools.importapi.models.common.ImageBuilder, com.commercetools.importapi.models.common.Image> builder) {
        return images(builder.apply(com.commercetools.importapi.models.common.ImageBuilder.of()));
    }

    /**
     *  <p>Maps to <code>ProductVariant.assets</code>.</p>
     * @param assets value to be set
     * @return Builder
     */

    public ProductVariantImportBuilder assets(
            @Nullable final com.commercetools.importapi.models.common.Asset... assets) {
        this.assets = new ArrayList<>(Arrays.asList(assets));
        return this;
    }

    /**
     *  <p>Maps to <code>ProductVariant.assets</code>.</p>
     * @param assets value to be set
     * @return Builder
     */

    public ProductVariantImportBuilder assets(
            @Nullable final java.util.List<com.commercetools.importapi.models.common.Asset> assets) {
        this.assets = assets;
        return this;
    }

    /**
     *  <p>Maps to <code>ProductVariant.assets</code>.</p>
     * @param assets value to be set
     * @return Builder
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
     *  <p>Maps to <code>ProductVariant.assets</code>.</p>
     * @param builder function to build the assets value
     * @return Builder
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
     *  <p>Maps to <code>ProductVariant.assets</code>.</p>
     * @param builder function to build the assets value
     * @return Builder
     */

    public ProductVariantImportBuilder withAssets(
            Function<com.commercetools.importapi.models.common.AssetBuilder, com.commercetools.importapi.models.common.AssetBuilder> builder) {
        this.assets = new ArrayList<>();
        this.assets.add(builder.apply(com.commercetools.importapi.models.common.AssetBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Maps to <code>ProductVariant.assets</code>.</p>
     * @param builder function to build the assets value
     * @return Builder
     */

    public ProductVariantImportBuilder addAssets(
            Function<com.commercetools.importapi.models.common.AssetBuilder, com.commercetools.importapi.models.common.Asset> builder) {
        return plusAssets(builder.apply(com.commercetools.importapi.models.common.AssetBuilder.of()));
    }

    /**
     *  <p>Maps to <code>ProductVariant.assets</code>.</p>
     * @param builder function to build the assets value
     * @return Builder
     */

    public ProductVariantImportBuilder setAssets(
            Function<com.commercetools.importapi.models.common.AssetBuilder, com.commercetools.importapi.models.common.Asset> builder) {
        return assets(builder.apply(com.commercetools.importapi.models.common.AssetBuilder.of()));
    }

    /**
     *  <ul>
     *   <li>Set to <code>false</code> to update both the current and staged projections of the Product with the new Product Variant data.</li>
     *   <li>Leave empty or set to <code>true</code> to only update the staged projection.</li>
     *  </ul>
     * @param staged value to be set
     * @return Builder
     */

    public ProductVariantImportBuilder staged(@Nullable final Boolean staged) {
        this.staged = staged;
        return this;
    }

    /**
     *  <p>The Product containing this ProductVariant. If the referenced Product does not exist, the <code>state</code> of the ImportOperation will be set to <code>unresolved</code> until the referenced Product is created.</p>
     * @param builder function to build the product value
     * @return Builder
     */

    public ProductVariantImportBuilder product(
            Function<com.commercetools.importapi.models.common.ProductKeyReferenceBuilder, com.commercetools.importapi.models.common.ProductKeyReferenceBuilder> builder) {
        this.product = builder.apply(com.commercetools.importapi.models.common.ProductKeyReferenceBuilder.of()).build();
        return this;
    }

    /**
     *  <p>The Product containing this ProductVariant. If the referenced Product does not exist, the <code>state</code> of the ImportOperation will be set to <code>unresolved</code> until the referenced Product is created.</p>
     * @param builder function to build the product value
     * @return Builder
     */

    public ProductVariantImportBuilder withProduct(
            Function<com.commercetools.importapi.models.common.ProductKeyReferenceBuilder, com.commercetools.importapi.models.common.ProductKeyReference> builder) {
        this.product = builder.apply(com.commercetools.importapi.models.common.ProductKeyReferenceBuilder.of());
        return this;
    }

    /**
     *  <p>The Product containing this ProductVariant. If the referenced Product does not exist, the <code>state</code> of the ImportOperation will be set to <code>unresolved</code> until the referenced Product is created.</p>
     * @param product value to be set
     * @return Builder
     */

    public ProductVariantImportBuilder product(
            final com.commercetools.importapi.models.common.ProductKeyReference product) {
        this.product = product;
        return this;
    }

    /**
     *  <p>User-defined unique identifier. If a ProductVariant with this <code>key</code> exists on the specified <code>product</code>, it is updated with the imported data.</p>
     * @return key
     */

    public String getKey() {
        return this.key;
    }

    /**
     *  <p>Maps to <code>ProductVariant.sku</code>.</p>
     * @return sku
     */

    @Nullable
    public String getSku() {
        return this.sku;
    }

    /**
     *  <ul>
     *   <li>When creating a new ProductVariant, set to <code>false</code>; otherwise, the import operation will fail with a NewMasterVariantAdditionNotAllowed error.</li>
     *   <li>Set to <code>true</code> if the ProductVariant exists and you want to set this ProductVariant as the Master Variant.</li>
     *  </ul>
     * @return isMasterVariant
     */

    public Boolean getIsMasterVariant() {
        return this.isMasterVariant;
    }

    /**
     *  <p>Maps to <code>ProductVariant.attributes</code>. The referenced attribute must be defined in an already existing ProductType in the project, or the <code>state</code> of the ImportOperation will be <code>unresolved</code>.</p>
     * @return attributes
     */

    @Nullable
    public java.util.List<com.commercetools.importapi.models.productvariants.Attribute> getAttributes() {
        return this.attributes;
    }

    /**
     *  <p>Maps to <code>ProductVariant.images</code>.</p>
     * @return images
     */

    @Nullable
    public java.util.List<com.commercetools.importapi.models.common.Image> getImages() {
        return this.images;
    }

    /**
     *  <p>Maps to <code>ProductVariant.assets</code>.</p>
     * @return assets
     */

    @Nullable
    public java.util.List<com.commercetools.importapi.models.common.Asset> getAssets() {
        return this.assets;
    }

    /**
     *  <ul>
     *   <li>Set to <code>false</code> to update both the current and staged projections of the Product with the new Product Variant data.</li>
     *   <li>Leave empty or set to <code>true</code> to only update the staged projection.</li>
     *  </ul>
     * @return staged
     */

    @Nullable
    public Boolean getStaged() {
        return this.staged;
    }

    /**
     *  <p>The Product containing this ProductVariant. If the referenced Product does not exist, the <code>state</code> of the ImportOperation will be set to <code>unresolved</code> until the referenced Product is created.</p>
     * @return product
     */

    public com.commercetools.importapi.models.common.ProductKeyReference getProduct() {
        return this.product;
    }

    /**
     * builds ProductVariantImport with checking for non-null required values
     * @return ProductVariantImport
     */
    public ProductVariantImport build() {
        Objects.requireNonNull(key, ProductVariantImport.class + ": key is missing");
        Objects.requireNonNull(isMasterVariant, ProductVariantImport.class + ": isMasterVariant is missing");
        Objects.requireNonNull(product, ProductVariantImport.class + ": product is missing");
        return new ProductVariantImportImpl(key, sku, isMasterVariant, attributes, images, assets, staged, product);
    }

    /**
     * builds ProductVariantImport without checking for non-null required values
     * @return ProductVariantImport
     */
    public ProductVariantImport buildUnchecked() {
        return new ProductVariantImportImpl(key, sku, isMasterVariant, attributes, images, assets, staged, product);
    }

    /**
     * factory method for an instance of ProductVariantImportBuilder
     * @return builder
     */
    public static ProductVariantImportBuilder of() {
        return new ProductVariantImportBuilder();
    }

    /**
     * create builder for ProductVariantImport instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ProductVariantImportBuilder of(final ProductVariantImport template) {
        ProductVariantImportBuilder builder = new ProductVariantImportBuilder();
        builder.key = template.getKey();
        builder.sku = template.getSku();
        builder.isMasterVariant = template.getIsMasterVariant();
        builder.attributes = template.getAttributes();
        builder.images = template.getImages();
        builder.assets = template.getAssets();
        builder.staged = template.getStaged();
        builder.product = template.getProduct();
        return builder;
    }

}
