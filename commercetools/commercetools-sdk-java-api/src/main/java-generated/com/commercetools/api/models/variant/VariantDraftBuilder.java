
package com.commercetools.api.models.variant;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * VariantDraftBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     VariantDraft variantDraft = VariantDraft.builder()
 *             .product(productBuilder -> productBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class VariantDraftBuilder implements Builder<VariantDraft> {

    @Nullable
    private String key;

    @Nullable
    private String sku;

    private com.commercetools.api.models.product.ProductResourceIdentifier product;

    @Nullable
    private Boolean publish;

    @Nullable
    private java.util.List<com.commercetools.api.models.common.Image> images;

    @Nullable
    private java.util.List<com.commercetools.api.models.product.Attribute> attributes;

    @Nullable
    private java.util.List<com.commercetools.api.models.common.AssetDraft> assets;

    /**
     *  <p>User-defined unique identifier for the Variant. This field is optional, but we strongly recommend setting it.</p>
     * @param key value to be set
     * @return Builder
     */

    public VariantDraftBuilder key(@Nullable final String key) {
        this.key = key;
        return this;
    }

    /**
     *  <p>User-defined unique SKU of the Variant.</p>
     * @param sku value to be set
     * @return Builder
     */

    public VariantDraftBuilder sku(@Nullable final String sku) {
        this.sku = sku;
        return this;
    }

    /**
     *  <p>ResourceIdentifier of the <a href="https://docs.commercetools.com/apis/ctp:api:type:Product" rel="nofollow">Product</a> the Variant belongs to.</p>
     * @param builder function to build the product value
     * @return Builder
     */

    public VariantDraftBuilder product(
            Function<com.commercetools.api.models.product.ProductResourceIdentifierBuilder, com.commercetools.api.models.product.ProductResourceIdentifierBuilder> builder) {
        this.product = builder.apply(com.commercetools.api.models.product.ProductResourceIdentifierBuilder.of())
                .build();
        return this;
    }

    /**
     *  <p>ResourceIdentifier of the <a href="https://docs.commercetools.com/apis/ctp:api:type:Product" rel="nofollow">Product</a> the Variant belongs to.</p>
     * @param builder function to build the product value
     * @return Builder
     */

    public VariantDraftBuilder withProduct(
            Function<com.commercetools.api.models.product.ProductResourceIdentifierBuilder, com.commercetools.api.models.product.ProductResourceIdentifier> builder) {
        this.product = builder.apply(com.commercetools.api.models.product.ProductResourceIdentifierBuilder.of());
        return this;
    }

    /**
     *  <p>ResourceIdentifier of the <a href="https://docs.commercetools.com/apis/ctp:api:type:Product" rel="nofollow">Product</a> the Variant belongs to.</p>
     * @param product value to be set
     * @return Builder
     */

    public VariantDraftBuilder product(final com.commercetools.api.models.product.ProductResourceIdentifier product) {
        this.product = product;
        return this;
    }

    /**
     *  <p>Indicates whether the Variant is published. If <code>true</code>, the Variant will be immediately available in the current published state.</p>
     * @param publish value to be set
     * @return Builder
     */

    public VariantDraftBuilder publish(@Nullable final Boolean publish) {
        this.publish = publish;
        return this;
    }

    /**
     *  <p>Images for the Variant.</p>
     * @param images value to be set
     * @return Builder
     */

    public VariantDraftBuilder images(@Nullable final com.commercetools.api.models.common.Image... images) {
        this.images = new ArrayList<>(Arrays.asList(images));
        return this;
    }

    /**
     *  <p>Images for the Variant.</p>
     * @param images value to be set
     * @return Builder
     */

    public VariantDraftBuilder images(
            @Nullable final java.util.List<com.commercetools.api.models.common.Image> images) {
        this.images = images;
        return this;
    }

    /**
     *  <p>Images for the Variant.</p>
     * @param images value to be set
     * @return Builder
     */

    public VariantDraftBuilder plusImages(@Nullable final com.commercetools.api.models.common.Image... images) {
        if (this.images == null) {
            this.images = new ArrayList<>();
        }
        this.images.addAll(Arrays.asList(images));
        return this;
    }

    /**
     *  <p>Images for the Variant.</p>
     * @param builder function to build the images value
     * @return Builder
     */

    public VariantDraftBuilder plusImages(
            Function<com.commercetools.api.models.common.ImageBuilder, com.commercetools.api.models.common.ImageBuilder> builder) {
        if (this.images == null) {
            this.images = new ArrayList<>();
        }
        this.images.add(builder.apply(com.commercetools.api.models.common.ImageBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Images for the Variant.</p>
     * @param builder function to build the images value
     * @return Builder
     */

    public VariantDraftBuilder withImages(
            Function<com.commercetools.api.models.common.ImageBuilder, com.commercetools.api.models.common.ImageBuilder> builder) {
        this.images = new ArrayList<>();
        this.images.add(builder.apply(com.commercetools.api.models.common.ImageBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Images for the Variant.</p>
     * @param builder function to build the images value
     * @return Builder
     */

    public VariantDraftBuilder addImages(
            Function<com.commercetools.api.models.common.ImageBuilder, com.commercetools.api.models.common.Image> builder) {
        return plusImages(builder.apply(com.commercetools.api.models.common.ImageBuilder.of()));
    }

    /**
     *  <p>Images for the Variant.</p>
     * @param builder function to build the images value
     * @return Builder
     */

    public VariantDraftBuilder setImages(
            Function<com.commercetools.api.models.common.ImageBuilder, com.commercetools.api.models.common.Image> builder) {
        return images(builder.apply(com.commercetools.api.models.common.ImageBuilder.of()));
    }

    /**
     *  <p>Variant Attributes according to the respective <a href="https://docs.commercetools.com/apis/ctp:api:type:AttributeDefinition" rel="nofollow">AttributeDefinition</a>.</p>
     * @param attributes value to be set
     * @return Builder
     */

    public VariantDraftBuilder attributes(
            @Nullable final com.commercetools.api.models.product.Attribute... attributes) {
        this.attributes = new ArrayList<>(Arrays.asList(attributes));
        return this;
    }

    /**
     *  <p>Variant Attributes according to the respective <a href="https://docs.commercetools.com/apis/ctp:api:type:AttributeDefinition" rel="nofollow">AttributeDefinition</a>.</p>
     * @param attributes value to be set
     * @return Builder
     */

    public VariantDraftBuilder attributes(
            @Nullable final java.util.List<com.commercetools.api.models.product.Attribute> attributes) {
        this.attributes = attributes;
        return this;
    }

    /**
     *  <p>Variant Attributes according to the respective <a href="https://docs.commercetools.com/apis/ctp:api:type:AttributeDefinition" rel="nofollow">AttributeDefinition</a>.</p>
     * @param attributes value to be set
     * @return Builder
     */

    public VariantDraftBuilder plusAttributes(
            @Nullable final com.commercetools.api.models.product.Attribute... attributes) {
        if (this.attributes == null) {
            this.attributes = new ArrayList<>();
        }
        this.attributes.addAll(Arrays.asList(attributes));
        return this;
    }

    /**
     *  <p>Variant Attributes according to the respective <a href="https://docs.commercetools.com/apis/ctp:api:type:AttributeDefinition" rel="nofollow">AttributeDefinition</a>.</p>
     * @param builder function to build the attributes value
     * @return Builder
     */

    public VariantDraftBuilder plusAttributes(
            Function<com.commercetools.api.models.product.AttributeBuilder, com.commercetools.api.models.product.AttributeBuilder> builder) {
        if (this.attributes == null) {
            this.attributes = new ArrayList<>();
        }
        this.attributes.add(builder.apply(com.commercetools.api.models.product.AttributeBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Variant Attributes according to the respective <a href="https://docs.commercetools.com/apis/ctp:api:type:AttributeDefinition" rel="nofollow">AttributeDefinition</a>.</p>
     * @param builder function to build the attributes value
     * @return Builder
     */

    public VariantDraftBuilder withAttributes(
            Function<com.commercetools.api.models.product.AttributeBuilder, com.commercetools.api.models.product.AttributeBuilder> builder) {
        this.attributes = new ArrayList<>();
        this.attributes.add(builder.apply(com.commercetools.api.models.product.AttributeBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Variant Attributes according to the respective <a href="https://docs.commercetools.com/apis/ctp:api:type:AttributeDefinition" rel="nofollow">AttributeDefinition</a>.</p>
     * @param builder function to build the attributes value
     * @return Builder
     */

    public VariantDraftBuilder addAttributes(
            Function<com.commercetools.api.models.product.AttributeBuilder, com.commercetools.api.models.product.Attribute> builder) {
        return plusAttributes(builder.apply(com.commercetools.api.models.product.AttributeBuilder.of()));
    }

    /**
     *  <p>Variant Attributes according to the respective <a href="https://docs.commercetools.com/apis/ctp:api:type:AttributeDefinition" rel="nofollow">AttributeDefinition</a>.</p>
     * @param builder function to build the attributes value
     * @return Builder
     */

    public VariantDraftBuilder setAttributes(
            Function<com.commercetools.api.models.product.AttributeBuilder, com.commercetools.api.models.product.Attribute> builder) {
        return attributes(builder.apply(com.commercetools.api.models.product.AttributeBuilder.of()));
    }

    /**
     *  <p>Media assets for the Variant.</p>
     * @param assets value to be set
     * @return Builder
     */

    public VariantDraftBuilder assets(@Nullable final com.commercetools.api.models.common.AssetDraft... assets) {
        this.assets = new ArrayList<>(Arrays.asList(assets));
        return this;
    }

    /**
     *  <p>Media assets for the Variant.</p>
     * @param assets value to be set
     * @return Builder
     */

    public VariantDraftBuilder assets(
            @Nullable final java.util.List<com.commercetools.api.models.common.AssetDraft> assets) {
        this.assets = assets;
        return this;
    }

    /**
     *  <p>Media assets for the Variant.</p>
     * @param assets value to be set
     * @return Builder
     */

    public VariantDraftBuilder plusAssets(@Nullable final com.commercetools.api.models.common.AssetDraft... assets) {
        if (this.assets == null) {
            this.assets = new ArrayList<>();
        }
        this.assets.addAll(Arrays.asList(assets));
        return this;
    }

    /**
     *  <p>Media assets for the Variant.</p>
     * @param builder function to build the assets value
     * @return Builder
     */

    public VariantDraftBuilder plusAssets(
            Function<com.commercetools.api.models.common.AssetDraftBuilder, com.commercetools.api.models.common.AssetDraftBuilder> builder) {
        if (this.assets == null) {
            this.assets = new ArrayList<>();
        }
        this.assets.add(builder.apply(com.commercetools.api.models.common.AssetDraftBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Media assets for the Variant.</p>
     * @param builder function to build the assets value
     * @return Builder
     */

    public VariantDraftBuilder withAssets(
            Function<com.commercetools.api.models.common.AssetDraftBuilder, com.commercetools.api.models.common.AssetDraftBuilder> builder) {
        this.assets = new ArrayList<>();
        this.assets.add(builder.apply(com.commercetools.api.models.common.AssetDraftBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Media assets for the Variant.</p>
     * @param builder function to build the assets value
     * @return Builder
     */

    public VariantDraftBuilder addAssets(
            Function<com.commercetools.api.models.common.AssetDraftBuilder, com.commercetools.api.models.common.AssetDraft> builder) {
        return plusAssets(builder.apply(com.commercetools.api.models.common.AssetDraftBuilder.of()));
    }

    /**
     *  <p>Media assets for the Variant.</p>
     * @param builder function to build the assets value
     * @return Builder
     */

    public VariantDraftBuilder setAssets(
            Function<com.commercetools.api.models.common.AssetDraftBuilder, com.commercetools.api.models.common.AssetDraft> builder) {
        return assets(builder.apply(com.commercetools.api.models.common.AssetDraftBuilder.of()));
    }

    /**
     *  <p>User-defined unique identifier for the Variant. This field is optional, but we strongly recommend setting it.</p>
     * @return key
     */

    @Nullable
    public String getKey() {
        return this.key;
    }

    /**
     *  <p>User-defined unique SKU of the Variant.</p>
     * @return sku
     */

    @Nullable
    public String getSku() {
        return this.sku;
    }

    /**
     *  <p>ResourceIdentifier of the <a href="https://docs.commercetools.com/apis/ctp:api:type:Product" rel="nofollow">Product</a> the Variant belongs to.</p>
     * @return product
     */

    public com.commercetools.api.models.product.ProductResourceIdentifier getProduct() {
        return this.product;
    }

    /**
     *  <p>Indicates whether the Variant is published. If <code>true</code>, the Variant will be immediately available in the current published state.</p>
     * @return publish
     */

    @Nullable
    public Boolean getPublish() {
        return this.publish;
    }

    /**
     *  <p>Images for the Variant.</p>
     * @return images
     */

    @Nullable
    public java.util.List<com.commercetools.api.models.common.Image> getImages() {
        return this.images;
    }

    /**
     *  <p>Variant Attributes according to the respective <a href="https://docs.commercetools.com/apis/ctp:api:type:AttributeDefinition" rel="nofollow">AttributeDefinition</a>.</p>
     * @return attributes
     */

    @Nullable
    public java.util.List<com.commercetools.api.models.product.Attribute> getAttributes() {
        return this.attributes;
    }

    /**
     *  <p>Media assets for the Variant.</p>
     * @return assets
     */

    @Nullable
    public java.util.List<com.commercetools.api.models.common.AssetDraft> getAssets() {
        return this.assets;
    }

    /**
     * builds VariantDraft with checking for non-null required values
     * @return VariantDraft
     */
    public VariantDraft build() {
        Objects.requireNonNull(product, VariantDraft.class + ": product is missing");
        return new VariantDraftImpl(key, sku, product, publish, images, attributes, assets);
    }

    /**
     * builds VariantDraft without checking for non-null required values
     * @return VariantDraft
     */
    public VariantDraft buildUnchecked() {
        return new VariantDraftImpl(key, sku, product, publish, images, attributes, assets);
    }

    /**
     * factory method for an instance of VariantDraftBuilder
     * @return builder
     */
    public static VariantDraftBuilder of() {
        return new VariantDraftBuilder();
    }

    /**
     * create builder for VariantDraft instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static VariantDraftBuilder of(final VariantDraft template) {
        VariantDraftBuilder builder = new VariantDraftBuilder();
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
