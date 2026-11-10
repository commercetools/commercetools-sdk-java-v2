
package com.commercetools.api.models.variant;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * VariantDataBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     VariantData variantData = VariantData.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class VariantDataBuilder implements Builder<VariantData> {

    @Nullable
    private String sku;

    @Nullable
    private java.util.List<com.commercetools.api.models.common.Image> images;

    @Nullable
    private java.util.List<com.commercetools.api.models.product.Attribute> attributes;

    @Nullable
    private java.util.List<com.commercetools.api.models.common.Asset> assets;

    /**
     *  <p>User-defined unique SKU of the Variant.</p>
     * @param sku value to be set
     * @return Builder
     */

    public VariantDataBuilder sku(@Nullable final String sku) {
        this.sku = sku;
        return this;
    }

    /**
     *  <p>Images of the Variant.</p>
     * @param images value to be set
     * @return Builder
     */

    public VariantDataBuilder images(@Nullable final com.commercetools.api.models.common.Image... images) {
        this.images = new ArrayList<>(Arrays.asList(images));
        return this;
    }

    /**
     *  <p>Images of the Variant.</p>
     * @param images value to be set
     * @return Builder
     */

    public VariantDataBuilder images(@Nullable final java.util.List<com.commercetools.api.models.common.Image> images) {
        this.images = images;
        return this;
    }

    /**
     *  <p>Images of the Variant.</p>
     * @param images value to be set
     * @return Builder
     */

    public VariantDataBuilder plusImages(@Nullable final com.commercetools.api.models.common.Image... images) {
        if (this.images == null) {
            this.images = new ArrayList<>();
        }
        this.images.addAll(Arrays.asList(images));
        return this;
    }

    /**
     *  <p>Images of the Variant.</p>
     * @param builder function to build the images value
     * @return Builder
     */

    public VariantDataBuilder plusImages(
            Function<com.commercetools.api.models.common.ImageBuilder, com.commercetools.api.models.common.ImageBuilder> builder) {
        if (this.images == null) {
            this.images = new ArrayList<>();
        }
        this.images.add(builder.apply(com.commercetools.api.models.common.ImageBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Images of the Variant.</p>
     * @param builder function to build the images value
     * @return Builder
     */

    public VariantDataBuilder withImages(
            Function<com.commercetools.api.models.common.ImageBuilder, com.commercetools.api.models.common.ImageBuilder> builder) {
        this.images = new ArrayList<>();
        this.images.add(builder.apply(com.commercetools.api.models.common.ImageBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Images of the Variant.</p>
     * @param builder function to build the images value
     * @return Builder
     */

    public VariantDataBuilder addImages(
            Function<com.commercetools.api.models.common.ImageBuilder, com.commercetools.api.models.common.Image> builder) {
        return plusImages(builder.apply(com.commercetools.api.models.common.ImageBuilder.of()));
    }

    /**
     *  <p>Images of the Variant.</p>
     * @param builder function to build the images value
     * @return Builder
     */

    public VariantDataBuilder setImages(
            Function<com.commercetools.api.models.common.ImageBuilder, com.commercetools.api.models.common.Image> builder) {
        return images(builder.apply(com.commercetools.api.models.common.ImageBuilder.of()));
    }

    /**
     *  <p>Attributes of the Variant according to the respective <a href="https://docs.commercetools.com/apis/ctp:api:type:AttributeDefinition" rel="nofollow">AttributeDefinition</a>.</p>
     * @param attributes value to be set
     * @return Builder
     */

    public VariantDataBuilder attributes(@Nullable final com.commercetools.api.models.product.Attribute... attributes) {
        this.attributes = new ArrayList<>(Arrays.asList(attributes));
        return this;
    }

    /**
     *  <p>Attributes of the Variant according to the respective <a href="https://docs.commercetools.com/apis/ctp:api:type:AttributeDefinition" rel="nofollow">AttributeDefinition</a>.</p>
     * @param attributes value to be set
     * @return Builder
     */

    public VariantDataBuilder attributes(
            @Nullable final java.util.List<com.commercetools.api.models.product.Attribute> attributes) {
        this.attributes = attributes;
        return this;
    }

    /**
     *  <p>Attributes of the Variant according to the respective <a href="https://docs.commercetools.com/apis/ctp:api:type:AttributeDefinition" rel="nofollow">AttributeDefinition</a>.</p>
     * @param attributes value to be set
     * @return Builder
     */

    public VariantDataBuilder plusAttributes(
            @Nullable final com.commercetools.api.models.product.Attribute... attributes) {
        if (this.attributes == null) {
            this.attributes = new ArrayList<>();
        }
        this.attributes.addAll(Arrays.asList(attributes));
        return this;
    }

    /**
     *  <p>Attributes of the Variant according to the respective <a href="https://docs.commercetools.com/apis/ctp:api:type:AttributeDefinition" rel="nofollow">AttributeDefinition</a>.</p>
     * @param builder function to build the attributes value
     * @return Builder
     */

    public VariantDataBuilder plusAttributes(
            Function<com.commercetools.api.models.product.AttributeBuilder, com.commercetools.api.models.product.AttributeBuilder> builder) {
        if (this.attributes == null) {
            this.attributes = new ArrayList<>();
        }
        this.attributes.add(builder.apply(com.commercetools.api.models.product.AttributeBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Attributes of the Variant according to the respective <a href="https://docs.commercetools.com/apis/ctp:api:type:AttributeDefinition" rel="nofollow">AttributeDefinition</a>.</p>
     * @param builder function to build the attributes value
     * @return Builder
     */

    public VariantDataBuilder withAttributes(
            Function<com.commercetools.api.models.product.AttributeBuilder, com.commercetools.api.models.product.AttributeBuilder> builder) {
        this.attributes = new ArrayList<>();
        this.attributes.add(builder.apply(com.commercetools.api.models.product.AttributeBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Attributes of the Variant according to the respective <a href="https://docs.commercetools.com/apis/ctp:api:type:AttributeDefinition" rel="nofollow">AttributeDefinition</a>.</p>
     * @param builder function to build the attributes value
     * @return Builder
     */

    public VariantDataBuilder addAttributes(
            Function<com.commercetools.api.models.product.AttributeBuilder, com.commercetools.api.models.product.Attribute> builder) {
        return plusAttributes(builder.apply(com.commercetools.api.models.product.AttributeBuilder.of()));
    }

    /**
     *  <p>Attributes of the Variant according to the respective <a href="https://docs.commercetools.com/apis/ctp:api:type:AttributeDefinition" rel="nofollow">AttributeDefinition</a>.</p>
     * @param builder function to build the attributes value
     * @return Builder
     */

    public VariantDataBuilder setAttributes(
            Function<com.commercetools.api.models.product.AttributeBuilder, com.commercetools.api.models.product.Attribute> builder) {
        return attributes(builder.apply(com.commercetools.api.models.product.AttributeBuilder.of()));
    }

    /**
     *  <p>Media assets of the Variant.</p>
     * @param assets value to be set
     * @return Builder
     */

    public VariantDataBuilder assets(@Nullable final com.commercetools.api.models.common.Asset... assets) {
        this.assets = new ArrayList<>(Arrays.asList(assets));
        return this;
    }

    /**
     *  <p>Media assets of the Variant.</p>
     * @param assets value to be set
     * @return Builder
     */

    public VariantDataBuilder assets(@Nullable final java.util.List<com.commercetools.api.models.common.Asset> assets) {
        this.assets = assets;
        return this;
    }

    /**
     *  <p>Media assets of the Variant.</p>
     * @param assets value to be set
     * @return Builder
     */

    public VariantDataBuilder plusAssets(@Nullable final com.commercetools.api.models.common.Asset... assets) {
        if (this.assets == null) {
            this.assets = new ArrayList<>();
        }
        this.assets.addAll(Arrays.asList(assets));
        return this;
    }

    /**
     *  <p>Media assets of the Variant.</p>
     * @param builder function to build the assets value
     * @return Builder
     */

    public VariantDataBuilder plusAssets(
            Function<com.commercetools.api.models.common.AssetBuilder, com.commercetools.api.models.common.AssetBuilder> builder) {
        if (this.assets == null) {
            this.assets = new ArrayList<>();
        }
        this.assets.add(builder.apply(com.commercetools.api.models.common.AssetBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Media assets of the Variant.</p>
     * @param builder function to build the assets value
     * @return Builder
     */

    public VariantDataBuilder withAssets(
            Function<com.commercetools.api.models.common.AssetBuilder, com.commercetools.api.models.common.AssetBuilder> builder) {
        this.assets = new ArrayList<>();
        this.assets.add(builder.apply(com.commercetools.api.models.common.AssetBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Media assets of the Variant.</p>
     * @param builder function to build the assets value
     * @return Builder
     */

    public VariantDataBuilder addAssets(
            Function<com.commercetools.api.models.common.AssetBuilder, com.commercetools.api.models.common.Asset> builder) {
        return plusAssets(builder.apply(com.commercetools.api.models.common.AssetBuilder.of()));
    }

    /**
     *  <p>Media assets of the Variant.</p>
     * @param builder function to build the assets value
     * @return Builder
     */

    public VariantDataBuilder setAssets(
            Function<com.commercetools.api.models.common.AssetBuilder, com.commercetools.api.models.common.Asset> builder) {
        return assets(builder.apply(com.commercetools.api.models.common.AssetBuilder.of()));
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
     *  <p>Images of the Variant.</p>
     * @return images
     */

    @Nullable
    public java.util.List<com.commercetools.api.models.common.Image> getImages() {
        return this.images;
    }

    /**
     *  <p>Attributes of the Variant according to the respective <a href="https://docs.commercetools.com/apis/ctp:api:type:AttributeDefinition" rel="nofollow">AttributeDefinition</a>.</p>
     * @return attributes
     */

    @Nullable
    public java.util.List<com.commercetools.api.models.product.Attribute> getAttributes() {
        return this.attributes;
    }

    /**
     *  <p>Media assets of the Variant.</p>
     * @return assets
     */

    @Nullable
    public java.util.List<com.commercetools.api.models.common.Asset> getAssets() {
        return this.assets;
    }

    /**
     * builds VariantData with checking for non-null required values
     * @return VariantData
     */
    public VariantData build() {
        return new VariantDataImpl(sku, images, attributes, assets);
    }

    /**
     * builds VariantData without checking for non-null required values
     * @return VariantData
     */
    public VariantData buildUnchecked() {
        return new VariantDataImpl(sku, images, attributes, assets);
    }

    /**
     * factory method for an instance of VariantDataBuilder
     * @return builder
     */
    public static VariantDataBuilder of() {
        return new VariantDataBuilder();
    }

    /**
     * create builder for VariantData instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static VariantDataBuilder of(final VariantData template) {
        VariantDataBuilder builder = new VariantDataBuilder();
        builder.sku = template.getSku();
        builder.images = template.getImages();
        builder.attributes = template.getAttributes();
        builder.assets = template.getAssets();
        return builder;
    }

}
