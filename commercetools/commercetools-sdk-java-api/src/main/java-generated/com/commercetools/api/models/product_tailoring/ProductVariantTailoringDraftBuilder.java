
package com.commercetools.api.models.product_tailoring;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ProductVariantTailoringDraftBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductVariantTailoringDraft productVariantTailoringDraft = ProductVariantTailoringDraft.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ProductVariantTailoringDraftBuilder implements Builder<ProductVariantTailoringDraft> {

    @Nullable
    private Long id;

    @Nullable
    private String sku;

    @Nullable
    private java.util.List<com.commercetools.api.models.common.Image> images;

    @Nullable
    private java.util.List<com.commercetools.api.models.common.Asset> assets;

    @Nullable
    private java.util.List<com.commercetools.api.models.product_tailoring.ProductTailoringAttribute> attributes;

    /**
     *  <p>The <code>id</code> of the <a href="https://docs.commercetools.com/apis/ctp:api:type:ProductVariant" rel="nofollow">ProductVariant</a> to be tailored.</p>
     * @param id value to be set
     * @return Builder
     */

    public ProductVariantTailoringDraftBuilder id(@Nullable final Long id) {
        this.id = id;
        return this;
    }

    /**
     *  <p>The <code>sku</code> of the <a href="https://docs.commercetools.com/apis/ctp:api:type:ProductVariant" rel="nofollow">ProductVariant</a> to be tailored.</p>
     * @param sku value to be set
     * @return Builder
     */

    public ProductVariantTailoringDraftBuilder sku(@Nullable final String sku) {
        this.sku = sku;
        return this;
    }

    /**
     *  <p>Images of the tailored Product Variant.</p>
     * @param images value to be set
     * @return Builder
     */

    public ProductVariantTailoringDraftBuilder images(
            @Nullable final com.commercetools.api.models.common.Image... images) {
        this.images = new ArrayList<>(Arrays.asList(images));
        return this;
    }

    /**
     *  <p>Images of the tailored Product Variant.</p>
     * @param images value to be set
     * @return Builder
     */

    public ProductVariantTailoringDraftBuilder images(
            @Nullable final java.util.List<com.commercetools.api.models.common.Image> images) {
        this.images = images;
        return this;
    }

    /**
     *  <p>Images of the tailored Product Variant.</p>
     * @param images value to be set
     * @return Builder
     */

    public ProductVariantTailoringDraftBuilder plusImages(
            @Nullable final com.commercetools.api.models.common.Image... images) {
        if (this.images == null) {
            this.images = new ArrayList<>();
        }
        this.images.addAll(Arrays.asList(images));
        return this;
    }

    /**
     *  <p>Images of the tailored Product Variant.</p>
     * @param builder function to build the images value
     * @return Builder
     */

    public ProductVariantTailoringDraftBuilder plusImages(
            Function<com.commercetools.api.models.common.ImageBuilder, com.commercetools.api.models.common.ImageBuilder> builder) {
        if (this.images == null) {
            this.images = new ArrayList<>();
        }
        this.images.add(builder.apply(com.commercetools.api.models.common.ImageBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Images of the tailored Product Variant.</p>
     * @param builder function to build the images value
     * @return Builder
     */

    public ProductVariantTailoringDraftBuilder withImages(
            Function<com.commercetools.api.models.common.ImageBuilder, com.commercetools.api.models.common.ImageBuilder> builder) {
        this.images = new ArrayList<>();
        this.images.add(builder.apply(com.commercetools.api.models.common.ImageBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Images of the tailored Product Variant.</p>
     * @param builder function to build the images value
     * @return Builder
     */

    public ProductVariantTailoringDraftBuilder addImages(
            Function<com.commercetools.api.models.common.ImageBuilder, com.commercetools.api.models.common.Image> builder) {
        return plusImages(builder.apply(com.commercetools.api.models.common.ImageBuilder.of()));
    }

    /**
     *  <p>Images of the tailored Product Variant.</p>
     * @param builder function to build the images value
     * @return Builder
     */

    public ProductVariantTailoringDraftBuilder setImages(
            Function<com.commercetools.api.models.common.ImageBuilder, com.commercetools.api.models.common.Image> builder) {
        return images(builder.apply(com.commercetools.api.models.common.ImageBuilder.of()));
    }

    /**
     *  <p>Media assets of the tailored Product Variant.</p>
     * @param assets value to be set
     * @return Builder
     */

    public ProductVariantTailoringDraftBuilder assets(
            @Nullable final com.commercetools.api.models.common.Asset... assets) {
        this.assets = new ArrayList<>(Arrays.asList(assets));
        return this;
    }

    /**
     *  <p>Media assets of the tailored Product Variant.</p>
     * @param assets value to be set
     * @return Builder
     */

    public ProductVariantTailoringDraftBuilder assets(
            @Nullable final java.util.List<com.commercetools.api.models.common.Asset> assets) {
        this.assets = assets;
        return this;
    }

    /**
     *  <p>Media assets of the tailored Product Variant.</p>
     * @param assets value to be set
     * @return Builder
     */

    public ProductVariantTailoringDraftBuilder plusAssets(
            @Nullable final com.commercetools.api.models.common.Asset... assets) {
        if (this.assets == null) {
            this.assets = new ArrayList<>();
        }
        this.assets.addAll(Arrays.asList(assets));
        return this;
    }

    /**
     *  <p>Media assets of the tailored Product Variant.</p>
     * @param builder function to build the assets value
     * @return Builder
     */

    public ProductVariantTailoringDraftBuilder plusAssets(
            Function<com.commercetools.api.models.common.AssetBuilder, com.commercetools.api.models.common.AssetBuilder> builder) {
        if (this.assets == null) {
            this.assets = new ArrayList<>();
        }
        this.assets.add(builder.apply(com.commercetools.api.models.common.AssetBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Media assets of the tailored Product Variant.</p>
     * @param builder function to build the assets value
     * @return Builder
     */

    public ProductVariantTailoringDraftBuilder withAssets(
            Function<com.commercetools.api.models.common.AssetBuilder, com.commercetools.api.models.common.AssetBuilder> builder) {
        this.assets = new ArrayList<>();
        this.assets.add(builder.apply(com.commercetools.api.models.common.AssetBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Media assets of the tailored Product Variant.</p>
     * @param builder function to build the assets value
     * @return Builder
     */

    public ProductVariantTailoringDraftBuilder addAssets(
            Function<com.commercetools.api.models.common.AssetBuilder, com.commercetools.api.models.common.Asset> builder) {
        return plusAssets(builder.apply(com.commercetools.api.models.common.AssetBuilder.of()));
    }

    /**
     *  <p>Media assets of the tailored Product Variant.</p>
     * @param builder function to build the assets value
     * @return Builder
     */

    public ProductVariantTailoringDraftBuilder setAssets(
            Function<com.commercetools.api.models.common.AssetBuilder, com.commercetools.api.models.common.Asset> builder) {
        return assets(builder.apply(com.commercetools.api.models.common.AssetBuilder.of()));
    }

    /**
     *  <p>Attributes of the tailored Product Variant according to the respective <a href="https://docs.commercetools.com/apis/ctp:api:type:AttributeDefinition" rel="nofollow">AttributeDefinition</a>. If provided, these Attributes are selectively merged into the <code>attributes</code> of the corresponding <a href="https://docs.commercetools.com/apis/ctp:api:type:ProductVariant" rel="nofollow">ProductVariant</a>:</p>
     *  <ul>
     *   <li>If the ProductVariant contains an Attribute with the same <code>name</code>, its <code>value</code> is overwritten,</li>
     *   <li>otherwise the Attribute and its value are added to the ProductVariant.</li>
     *  </ul>
     * @param attributes value to be set
     * @return Builder
     */

    public ProductVariantTailoringDraftBuilder attributes(
            @Nullable final com.commercetools.api.models.product_tailoring.ProductTailoringAttribute... attributes) {
        this.attributes = new ArrayList<>(Arrays.asList(attributes));
        return this;
    }

    /**
     *  <p>Attributes of the tailored Product Variant according to the respective <a href="https://docs.commercetools.com/apis/ctp:api:type:AttributeDefinition" rel="nofollow">AttributeDefinition</a>. If provided, these Attributes are selectively merged into the <code>attributes</code> of the corresponding <a href="https://docs.commercetools.com/apis/ctp:api:type:ProductVariant" rel="nofollow">ProductVariant</a>:</p>
     *  <ul>
     *   <li>If the ProductVariant contains an Attribute with the same <code>name</code>, its <code>value</code> is overwritten,</li>
     *   <li>otherwise the Attribute and its value are added to the ProductVariant.</li>
     *  </ul>
     * @param attributes value to be set
     * @return Builder
     */

    public ProductVariantTailoringDraftBuilder attributes(
            @Nullable final java.util.List<com.commercetools.api.models.product_tailoring.ProductTailoringAttribute> attributes) {
        this.attributes = attributes;
        return this;
    }

    /**
     *  <p>Attributes of the tailored Product Variant according to the respective <a href="https://docs.commercetools.com/apis/ctp:api:type:AttributeDefinition" rel="nofollow">AttributeDefinition</a>. If provided, these Attributes are selectively merged into the <code>attributes</code> of the corresponding <a href="https://docs.commercetools.com/apis/ctp:api:type:ProductVariant" rel="nofollow">ProductVariant</a>:</p>
     *  <ul>
     *   <li>If the ProductVariant contains an Attribute with the same <code>name</code>, its <code>value</code> is overwritten,</li>
     *   <li>otherwise the Attribute and its value are added to the ProductVariant.</li>
     *  </ul>
     * @param attributes value to be set
     * @return Builder
     */

    public ProductVariantTailoringDraftBuilder plusAttributes(
            @Nullable final com.commercetools.api.models.product_tailoring.ProductTailoringAttribute... attributes) {
        if (this.attributes == null) {
            this.attributes = new ArrayList<>();
        }
        this.attributes.addAll(Arrays.asList(attributes));
        return this;
    }

    /**
     *  <p>Attributes of the tailored Product Variant according to the respective <a href="https://docs.commercetools.com/apis/ctp:api:type:AttributeDefinition" rel="nofollow">AttributeDefinition</a>. If provided, these Attributes are selectively merged into the <code>attributes</code> of the corresponding <a href="https://docs.commercetools.com/apis/ctp:api:type:ProductVariant" rel="nofollow">ProductVariant</a>:</p>
     *  <ul>
     *   <li>If the ProductVariant contains an Attribute with the same <code>name</code>, its <code>value</code> is overwritten,</li>
     *   <li>otherwise the Attribute and its value are added to the ProductVariant.</li>
     *  </ul>
     * @param builder function to build the attributes value
     * @return Builder
     */

    public ProductVariantTailoringDraftBuilder plusAttributes(
            Function<com.commercetools.api.models.product_tailoring.ProductTailoringAttributeBuilder, com.commercetools.api.models.product_tailoring.ProductTailoringAttributeBuilder> builder) {
        if (this.attributes == null) {
            this.attributes = new ArrayList<>();
        }
        this.attributes
                .add(builder.apply(com.commercetools.api.models.product_tailoring.ProductTailoringAttributeBuilder.of())
                        .build());
        return this;
    }

    /**
     *  <p>Attributes of the tailored Product Variant according to the respective <a href="https://docs.commercetools.com/apis/ctp:api:type:AttributeDefinition" rel="nofollow">AttributeDefinition</a>. If provided, these Attributes are selectively merged into the <code>attributes</code> of the corresponding <a href="https://docs.commercetools.com/apis/ctp:api:type:ProductVariant" rel="nofollow">ProductVariant</a>:</p>
     *  <ul>
     *   <li>If the ProductVariant contains an Attribute with the same <code>name</code>, its <code>value</code> is overwritten,</li>
     *   <li>otherwise the Attribute and its value are added to the ProductVariant.</li>
     *  </ul>
     * @param builder function to build the attributes value
     * @return Builder
     */

    public ProductVariantTailoringDraftBuilder withAttributes(
            Function<com.commercetools.api.models.product_tailoring.ProductTailoringAttributeBuilder, com.commercetools.api.models.product_tailoring.ProductTailoringAttributeBuilder> builder) {
        this.attributes = new ArrayList<>();
        this.attributes
                .add(builder.apply(com.commercetools.api.models.product_tailoring.ProductTailoringAttributeBuilder.of())
                        .build());
        return this;
    }

    /**
     *  <p>Attributes of the tailored Product Variant according to the respective <a href="https://docs.commercetools.com/apis/ctp:api:type:AttributeDefinition" rel="nofollow">AttributeDefinition</a>. If provided, these Attributes are selectively merged into the <code>attributes</code> of the corresponding <a href="https://docs.commercetools.com/apis/ctp:api:type:ProductVariant" rel="nofollow">ProductVariant</a>:</p>
     *  <ul>
     *   <li>If the ProductVariant contains an Attribute with the same <code>name</code>, its <code>value</code> is overwritten,</li>
     *   <li>otherwise the Attribute and its value are added to the ProductVariant.</li>
     *  </ul>
     * @param builder function to build the attributes value
     * @return Builder
     */

    public ProductVariantTailoringDraftBuilder addAttributes(
            Function<com.commercetools.api.models.product_tailoring.ProductTailoringAttributeBuilder, com.commercetools.api.models.product_tailoring.ProductTailoringAttribute> builder) {
        return plusAttributes(
            builder.apply(com.commercetools.api.models.product_tailoring.ProductTailoringAttributeBuilder.of()));
    }

    /**
     *  <p>Attributes of the tailored Product Variant according to the respective <a href="https://docs.commercetools.com/apis/ctp:api:type:AttributeDefinition" rel="nofollow">AttributeDefinition</a>. If provided, these Attributes are selectively merged into the <code>attributes</code> of the corresponding <a href="https://docs.commercetools.com/apis/ctp:api:type:ProductVariant" rel="nofollow">ProductVariant</a>:</p>
     *  <ul>
     *   <li>If the ProductVariant contains an Attribute with the same <code>name</code>, its <code>value</code> is overwritten,</li>
     *   <li>otherwise the Attribute and its value are added to the ProductVariant.</li>
     *  </ul>
     * @param builder function to build the attributes value
     * @return Builder
     */

    public ProductVariantTailoringDraftBuilder setAttributes(
            Function<com.commercetools.api.models.product_tailoring.ProductTailoringAttributeBuilder, com.commercetools.api.models.product_tailoring.ProductTailoringAttribute> builder) {
        return attributes(
            builder.apply(com.commercetools.api.models.product_tailoring.ProductTailoringAttributeBuilder.of()));
    }

    /**
     *  <p>The <code>id</code> of the <a href="https://docs.commercetools.com/apis/ctp:api:type:ProductVariant" rel="nofollow">ProductVariant</a> to be tailored.</p>
     * @return id
     */

    @Nullable
    public Long getId() {
        return this.id;
    }

    /**
     *  <p>The <code>sku</code> of the <a href="https://docs.commercetools.com/apis/ctp:api:type:ProductVariant" rel="nofollow">ProductVariant</a> to be tailored.</p>
     * @return sku
     */

    @Nullable
    public String getSku() {
        return this.sku;
    }

    /**
     *  <p>Images of the tailored Product Variant.</p>
     * @return images
     */

    @Nullable
    public java.util.List<com.commercetools.api.models.common.Image> getImages() {
        return this.images;
    }

    /**
     *  <p>Media assets of the tailored Product Variant.</p>
     * @return assets
     */

    @Nullable
    public java.util.List<com.commercetools.api.models.common.Asset> getAssets() {
        return this.assets;
    }

    /**
     *  <p>Attributes of the tailored Product Variant according to the respective <a href="https://docs.commercetools.com/apis/ctp:api:type:AttributeDefinition" rel="nofollow">AttributeDefinition</a>. If provided, these Attributes are selectively merged into the <code>attributes</code> of the corresponding <a href="https://docs.commercetools.com/apis/ctp:api:type:ProductVariant" rel="nofollow">ProductVariant</a>:</p>
     *  <ul>
     *   <li>If the ProductVariant contains an Attribute with the same <code>name</code>, its <code>value</code> is overwritten,</li>
     *   <li>otherwise the Attribute and its value are added to the ProductVariant.</li>
     *  </ul>
     * @return attributes
     */

    @Nullable
    public java.util.List<com.commercetools.api.models.product_tailoring.ProductTailoringAttribute> getAttributes() {
        return this.attributes;
    }

    /**
     * builds ProductVariantTailoringDraft with checking for non-null required values
     * @return ProductVariantTailoringDraft
     */
    public ProductVariantTailoringDraft build() {
        return new ProductVariantTailoringDraftImpl(id, sku, images, assets, attributes);
    }

    /**
     * builds ProductVariantTailoringDraft without checking for non-null required values
     * @return ProductVariantTailoringDraft
     */
    public ProductVariantTailoringDraft buildUnchecked() {
        return new ProductVariantTailoringDraftImpl(id, sku, images, assets, attributes);
    }

    /**
     * factory method for an instance of ProductVariantTailoringDraftBuilder
     * @return builder
     */
    public static ProductVariantTailoringDraftBuilder of() {
        return new ProductVariantTailoringDraftBuilder();
    }

    /**
     * create builder for ProductVariantTailoringDraft instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ProductVariantTailoringDraftBuilder of(final ProductVariantTailoringDraft template) {
        ProductVariantTailoringDraftBuilder builder = new ProductVariantTailoringDraftBuilder();
        builder.id = template.getId();
        builder.sku = template.getSku();
        builder.images = template.getImages();
        builder.assets = template.getAssets();
        builder.attributes = template.getAttributes();
        return builder;
    }

}
