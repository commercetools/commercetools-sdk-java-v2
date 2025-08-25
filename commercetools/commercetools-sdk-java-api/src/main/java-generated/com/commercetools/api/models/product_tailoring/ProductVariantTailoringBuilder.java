
package com.commercetools.api.models.product_tailoring;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ProductVariantTailoringBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductVariantTailoring productVariantTailoring = ProductVariantTailoring.builder()
 *             .id(0.3)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ProductVariantTailoringBuilder implements Builder<ProductVariantTailoring> {

    private Long id;

    @Nullable
    private java.util.List<com.commercetools.api.models.common.Image> images;

    @Nullable
    private java.util.List<com.commercetools.api.models.common.Asset> assets;

    @Nullable
    private java.util.List<com.commercetools.api.models.product_tailoring.ProductTailoringAttribute> attributes;

    /**
     *  <p>The <code>id</code> of the tailored <a href="https://docs.commercetools.com/apis/ctp:api:type:ProductVariant" rel="nofollow">ProductVariant</a>.</p>
     * @param id value to be set
     * @return Builder
     */

    public ProductVariantTailoringBuilder id(final Long id) {
        this.id = id;
        return this;
    }

    /**
     *  <p>Images of the tailored Product Variant. If present, these images will override the images of the corresponding <a href="https://docs.commercetools.com/apis/ctp:api:type:ProductVariant" rel="nofollow">ProductVariant</a> in total.</p>
     * @param images value to be set
     * @return Builder
     */

    public ProductVariantTailoringBuilder images(@Nullable final com.commercetools.api.models.common.Image... images) {
        this.images = new ArrayList<>(Arrays.asList(images));
        return this;
    }

    /**
     *  <p>Images of the tailored Product Variant. If present, these images will override the images of the corresponding <a href="https://docs.commercetools.com/apis/ctp:api:type:ProductVariant" rel="nofollow">ProductVariant</a> in total.</p>
     * @param images value to be set
     * @return Builder
     */

    public ProductVariantTailoringBuilder images(
            @Nullable final java.util.List<com.commercetools.api.models.common.Image> images) {
        this.images = images;
        return this;
    }

    /**
     *  <p>Images of the tailored Product Variant. If present, these images will override the images of the corresponding <a href="https://docs.commercetools.com/apis/ctp:api:type:ProductVariant" rel="nofollow">ProductVariant</a> in total.</p>
     * @param images value to be set
     * @return Builder
     */

    public ProductVariantTailoringBuilder plusImages(
            @Nullable final com.commercetools.api.models.common.Image... images) {
        if (this.images == null) {
            this.images = new ArrayList<>();
        }
        this.images.addAll(Arrays.asList(images));
        return this;
    }

    /**
     *  <p>Images of the tailored Product Variant. If present, these images will override the images of the corresponding <a href="https://docs.commercetools.com/apis/ctp:api:type:ProductVariant" rel="nofollow">ProductVariant</a> in total.</p>
     * @param builder function to build the images value
     * @return Builder
     */

    public ProductVariantTailoringBuilder plusImages(
            Function<com.commercetools.api.models.common.ImageBuilder, com.commercetools.api.models.common.ImageBuilder> builder) {
        if (this.images == null) {
            this.images = new ArrayList<>();
        }
        this.images.add(builder.apply(com.commercetools.api.models.common.ImageBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Images of the tailored Product Variant. If present, these images will override the images of the corresponding <a href="https://docs.commercetools.com/apis/ctp:api:type:ProductVariant" rel="nofollow">ProductVariant</a> in total.</p>
     * @param builder function to build the images value
     * @return Builder
     */

    public ProductVariantTailoringBuilder withImages(
            Function<com.commercetools.api.models.common.ImageBuilder, com.commercetools.api.models.common.ImageBuilder> builder) {
        this.images = new ArrayList<>();
        this.images.add(builder.apply(com.commercetools.api.models.common.ImageBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Images of the tailored Product Variant. If present, these images will override the images of the corresponding <a href="https://docs.commercetools.com/apis/ctp:api:type:ProductVariant" rel="nofollow">ProductVariant</a> in total.</p>
     * @param builder function to build the images value
     * @return Builder
     */

    public ProductVariantTailoringBuilder addImages(
            Function<com.commercetools.api.models.common.ImageBuilder, com.commercetools.api.models.common.Image> builder) {
        return plusImages(builder.apply(com.commercetools.api.models.common.ImageBuilder.of()));
    }

    /**
     *  <p>Images of the tailored Product Variant. If present, these images will override the images of the corresponding <a href="https://docs.commercetools.com/apis/ctp:api:type:ProductVariant" rel="nofollow">ProductVariant</a> in total.</p>
     * @param builder function to build the images value
     * @return Builder
     */

    public ProductVariantTailoringBuilder setImages(
            Function<com.commercetools.api.models.common.ImageBuilder, com.commercetools.api.models.common.Image> builder) {
        return images(builder.apply(com.commercetools.api.models.common.ImageBuilder.of()));
    }

    /**
     *  <p>Media assets of the tailored Product Variant. If present, these assets will override the assets of the corresponding <a href="https://docs.commercetools.com/apis/ctp:api:type:ProductVariant" rel="nofollow">ProductVariant</a> in total.</p>
     * @param assets value to be set
     * @return Builder
     */

    public ProductVariantTailoringBuilder assets(@Nullable final com.commercetools.api.models.common.Asset... assets) {
        this.assets = new ArrayList<>(Arrays.asList(assets));
        return this;
    }

    /**
     *  <p>Media assets of the tailored Product Variant. If present, these assets will override the assets of the corresponding <a href="https://docs.commercetools.com/apis/ctp:api:type:ProductVariant" rel="nofollow">ProductVariant</a> in total.</p>
     * @param assets value to be set
     * @return Builder
     */

    public ProductVariantTailoringBuilder assets(
            @Nullable final java.util.List<com.commercetools.api.models.common.Asset> assets) {
        this.assets = assets;
        return this;
    }

    /**
     *  <p>Media assets of the tailored Product Variant. If present, these assets will override the assets of the corresponding <a href="https://docs.commercetools.com/apis/ctp:api:type:ProductVariant" rel="nofollow">ProductVariant</a> in total.</p>
     * @param assets value to be set
     * @return Builder
     */

    public ProductVariantTailoringBuilder plusAssets(
            @Nullable final com.commercetools.api.models.common.Asset... assets) {
        if (this.assets == null) {
            this.assets = new ArrayList<>();
        }
        this.assets.addAll(Arrays.asList(assets));
        return this;
    }

    /**
     *  <p>Media assets of the tailored Product Variant. If present, these assets will override the assets of the corresponding <a href="https://docs.commercetools.com/apis/ctp:api:type:ProductVariant" rel="nofollow">ProductVariant</a> in total.</p>
     * @param builder function to build the assets value
     * @return Builder
     */

    public ProductVariantTailoringBuilder plusAssets(
            Function<com.commercetools.api.models.common.AssetBuilder, com.commercetools.api.models.common.AssetBuilder> builder) {
        if (this.assets == null) {
            this.assets = new ArrayList<>();
        }
        this.assets.add(builder.apply(com.commercetools.api.models.common.AssetBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Media assets of the tailored Product Variant. If present, these assets will override the assets of the corresponding <a href="https://docs.commercetools.com/apis/ctp:api:type:ProductVariant" rel="nofollow">ProductVariant</a> in total.</p>
     * @param builder function to build the assets value
     * @return Builder
     */

    public ProductVariantTailoringBuilder withAssets(
            Function<com.commercetools.api.models.common.AssetBuilder, com.commercetools.api.models.common.AssetBuilder> builder) {
        this.assets = new ArrayList<>();
        this.assets.add(builder.apply(com.commercetools.api.models.common.AssetBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Media assets of the tailored Product Variant. If present, these assets will override the assets of the corresponding <a href="https://docs.commercetools.com/apis/ctp:api:type:ProductVariant" rel="nofollow">ProductVariant</a> in total.</p>
     * @param builder function to build the assets value
     * @return Builder
     */

    public ProductVariantTailoringBuilder addAssets(
            Function<com.commercetools.api.models.common.AssetBuilder, com.commercetools.api.models.common.Asset> builder) {
        return plusAssets(builder.apply(com.commercetools.api.models.common.AssetBuilder.of()));
    }

    /**
     *  <p>Media assets of the tailored Product Variant. If present, these assets will override the assets of the corresponding <a href="https://docs.commercetools.com/apis/ctp:api:type:ProductVariant" rel="nofollow">ProductVariant</a> in total.</p>
     * @param builder function to build the assets value
     * @return Builder
     */

    public ProductVariantTailoringBuilder setAssets(
            Function<com.commercetools.api.models.common.AssetBuilder, com.commercetools.api.models.common.Asset> builder) {
        return assets(builder.apply(com.commercetools.api.models.common.AssetBuilder.of()));
    }

    /**
     *  <p>Attributes of the tailored Product Variant. If present, these Attributes are selectively merged into the <code>attributes</code> of the corresponding <a href="https://docs.commercetools.com/apis/ctp:api:type:ProductVariant" rel="nofollow">ProductVariant</a>:</p>
     *  <ul>
     *   <li>If the ProductVariant contains an Attribute with the same <code>name</code>, its <code>value</code> is overwritten,</li>
     *   <li>otherwise the Attribute and its value are added to the ProductVariant.</li>
     *  </ul>
     * @param attributes value to be set
     * @return Builder
     */

    public ProductVariantTailoringBuilder attributes(
            @Nullable final com.commercetools.api.models.product_tailoring.ProductTailoringAttribute... attributes) {
        this.attributes = new ArrayList<>(Arrays.asList(attributes));
        return this;
    }

    /**
     *  <p>Attributes of the tailored Product Variant. If present, these Attributes are selectively merged into the <code>attributes</code> of the corresponding <a href="https://docs.commercetools.com/apis/ctp:api:type:ProductVariant" rel="nofollow">ProductVariant</a>:</p>
     *  <ul>
     *   <li>If the ProductVariant contains an Attribute with the same <code>name</code>, its <code>value</code> is overwritten,</li>
     *   <li>otherwise the Attribute and its value are added to the ProductVariant.</li>
     *  </ul>
     * @param attributes value to be set
     * @return Builder
     */

    public ProductVariantTailoringBuilder attributes(
            @Nullable final java.util.List<com.commercetools.api.models.product_tailoring.ProductTailoringAttribute> attributes) {
        this.attributes = attributes;
        return this;
    }

    /**
     *  <p>Attributes of the tailored Product Variant. If present, these Attributes are selectively merged into the <code>attributes</code> of the corresponding <a href="https://docs.commercetools.com/apis/ctp:api:type:ProductVariant" rel="nofollow">ProductVariant</a>:</p>
     *  <ul>
     *   <li>If the ProductVariant contains an Attribute with the same <code>name</code>, its <code>value</code> is overwritten,</li>
     *   <li>otherwise the Attribute and its value are added to the ProductVariant.</li>
     *  </ul>
     * @param attributes value to be set
     * @return Builder
     */

    public ProductVariantTailoringBuilder plusAttributes(
            @Nullable final com.commercetools.api.models.product_tailoring.ProductTailoringAttribute... attributes) {
        if (this.attributes == null) {
            this.attributes = new ArrayList<>();
        }
        this.attributes.addAll(Arrays.asList(attributes));
        return this;
    }

    /**
     *  <p>Attributes of the tailored Product Variant. If present, these Attributes are selectively merged into the <code>attributes</code> of the corresponding <a href="https://docs.commercetools.com/apis/ctp:api:type:ProductVariant" rel="nofollow">ProductVariant</a>:</p>
     *  <ul>
     *   <li>If the ProductVariant contains an Attribute with the same <code>name</code>, its <code>value</code> is overwritten,</li>
     *   <li>otherwise the Attribute and its value are added to the ProductVariant.</li>
     *  </ul>
     * @param builder function to build the attributes value
     * @return Builder
     */

    public ProductVariantTailoringBuilder plusAttributes(
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
     *  <p>Attributes of the tailored Product Variant. If present, these Attributes are selectively merged into the <code>attributes</code> of the corresponding <a href="https://docs.commercetools.com/apis/ctp:api:type:ProductVariant" rel="nofollow">ProductVariant</a>:</p>
     *  <ul>
     *   <li>If the ProductVariant contains an Attribute with the same <code>name</code>, its <code>value</code> is overwritten,</li>
     *   <li>otherwise the Attribute and its value are added to the ProductVariant.</li>
     *  </ul>
     * @param builder function to build the attributes value
     * @return Builder
     */

    public ProductVariantTailoringBuilder withAttributes(
            Function<com.commercetools.api.models.product_tailoring.ProductTailoringAttributeBuilder, com.commercetools.api.models.product_tailoring.ProductTailoringAttributeBuilder> builder) {
        this.attributes = new ArrayList<>();
        this.attributes
                .add(builder.apply(com.commercetools.api.models.product_tailoring.ProductTailoringAttributeBuilder.of())
                        .build());
        return this;
    }

    /**
     *  <p>Attributes of the tailored Product Variant. If present, these Attributes are selectively merged into the <code>attributes</code> of the corresponding <a href="https://docs.commercetools.com/apis/ctp:api:type:ProductVariant" rel="nofollow">ProductVariant</a>:</p>
     *  <ul>
     *   <li>If the ProductVariant contains an Attribute with the same <code>name</code>, its <code>value</code> is overwritten,</li>
     *   <li>otherwise the Attribute and its value are added to the ProductVariant.</li>
     *  </ul>
     * @param builder function to build the attributes value
     * @return Builder
     */

    public ProductVariantTailoringBuilder addAttributes(
            Function<com.commercetools.api.models.product_tailoring.ProductTailoringAttributeBuilder, com.commercetools.api.models.product_tailoring.ProductTailoringAttribute> builder) {
        return plusAttributes(
            builder.apply(com.commercetools.api.models.product_tailoring.ProductTailoringAttributeBuilder.of()));
    }

    /**
     *  <p>Attributes of the tailored Product Variant. If present, these Attributes are selectively merged into the <code>attributes</code> of the corresponding <a href="https://docs.commercetools.com/apis/ctp:api:type:ProductVariant" rel="nofollow">ProductVariant</a>:</p>
     *  <ul>
     *   <li>If the ProductVariant contains an Attribute with the same <code>name</code>, its <code>value</code> is overwritten,</li>
     *   <li>otherwise the Attribute and its value are added to the ProductVariant.</li>
     *  </ul>
     * @param builder function to build the attributes value
     * @return Builder
     */

    public ProductVariantTailoringBuilder setAttributes(
            Function<com.commercetools.api.models.product_tailoring.ProductTailoringAttributeBuilder, com.commercetools.api.models.product_tailoring.ProductTailoringAttribute> builder) {
        return attributes(
            builder.apply(com.commercetools.api.models.product_tailoring.ProductTailoringAttributeBuilder.of()));
    }

    /**
     *  <p>The <code>id</code> of the tailored <a href="https://docs.commercetools.com/apis/ctp:api:type:ProductVariant" rel="nofollow">ProductVariant</a>.</p>
     * @return id
     */

    public Long getId() {
        return this.id;
    }

    /**
     *  <p>Images of the tailored Product Variant. If present, these images will override the images of the corresponding <a href="https://docs.commercetools.com/apis/ctp:api:type:ProductVariant" rel="nofollow">ProductVariant</a> in total.</p>
     * @return images
     */

    @Nullable
    public java.util.List<com.commercetools.api.models.common.Image> getImages() {
        return this.images;
    }

    /**
     *  <p>Media assets of the tailored Product Variant. If present, these assets will override the assets of the corresponding <a href="https://docs.commercetools.com/apis/ctp:api:type:ProductVariant" rel="nofollow">ProductVariant</a> in total.</p>
     * @return assets
     */

    @Nullable
    public java.util.List<com.commercetools.api.models.common.Asset> getAssets() {
        return this.assets;
    }

    /**
     *  <p>Attributes of the tailored Product Variant. If present, these Attributes are selectively merged into the <code>attributes</code> of the corresponding <a href="https://docs.commercetools.com/apis/ctp:api:type:ProductVariant" rel="nofollow">ProductVariant</a>:</p>
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
     * builds ProductVariantTailoring with checking for non-null required values
     * @return ProductVariantTailoring
     */
    public ProductVariantTailoring build() {
        Objects.requireNonNull(id, ProductVariantTailoring.class + ": id is missing");
        return new ProductVariantTailoringImpl(id, images, assets, attributes);
    }

    /**
     * builds ProductVariantTailoring without checking for non-null required values
     * @return ProductVariantTailoring
     */
    public ProductVariantTailoring buildUnchecked() {
        return new ProductVariantTailoringImpl(id, images, assets, attributes);
    }

    /**
     * factory method for an instance of ProductVariantTailoringBuilder
     * @return builder
     */
    public static ProductVariantTailoringBuilder of() {
        return new ProductVariantTailoringBuilder();
    }

    /**
     * create builder for ProductVariantTailoring instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ProductVariantTailoringBuilder of(final ProductVariantTailoring template) {
        ProductVariantTailoringBuilder builder = new ProductVariantTailoringBuilder();
        builder.id = template.getId();
        builder.images = template.getImages();
        builder.assets = template.getAssets();
        builder.attributes = template.getAttributes();
        return builder;
    }

}
