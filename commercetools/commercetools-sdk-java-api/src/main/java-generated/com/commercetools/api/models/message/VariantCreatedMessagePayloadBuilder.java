
package com.commercetools.api.models.message;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * VariantCreatedMessagePayloadBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     VariantCreatedMessagePayload variantCreatedMessagePayload = VariantCreatedMessagePayload.builder()
 *             .id("{id}")
 *             .productId("{productId}")
 *             .variantId(1)
 *             .publish(true)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class VariantCreatedMessagePayloadBuilder implements Builder<VariantCreatedMessagePayload> {

    private String id;

    private String productId;

    private Integer variantId;

    @Nullable
    private String key;

    @Nullable
    private String sku;

    @Nullable
    private java.util.List<com.commercetools.api.models.product.Attribute> attributes;

    @Nullable
    private java.util.List<com.commercetools.api.models.common.Asset> assets;

    @Nullable
    private java.util.List<com.commercetools.api.models.common.Image> images;

    private Boolean publish;

    /**
     *  <p>Unique identifier of the Variant.</p>
     * @param id value to be set
     * @return Builder
     */

    public VariantCreatedMessagePayloadBuilder id(final String id) {
        this.id = id;
        return this;
    }

    /**
     *  <p>Unique identifier of the Product to which the Variant belongs.</p>
     * @param productId value to be set
     * @return Builder
     */

    public VariantCreatedMessagePayloadBuilder productId(final String productId) {
        this.productId = productId;
        return this;
    }

    /**
     *  <p>Unique identifier of the Variant within its parent Product.</p>
     * @param variantId value to be set
     * @return Builder
     */

    public VariantCreatedMessagePayloadBuilder variantId(final Integer variantId) {
        this.variantId = variantId;
        return this;
    }

    /**
     *  <p>User-defined unique identifier of the Variant.</p>
     * @param key value to be set
     * @return Builder
     */

    public VariantCreatedMessagePayloadBuilder key(@Nullable final String key) {
        this.key = key;
        return this;
    }

    /**
     *  <p>SKU of the Variant.</p>
     * @param sku value to be set
     * @return Builder
     */

    public VariantCreatedMessagePayloadBuilder sku(@Nullable final String sku) {
        this.sku = sku;
        return this;
    }

    /**
     *  <p>Attributes of the Variant.</p>
     * @param attributes value to be set
     * @return Builder
     */

    public VariantCreatedMessagePayloadBuilder attributes(
            @Nullable final com.commercetools.api.models.product.Attribute... attributes) {
        this.attributes = new ArrayList<>(Arrays.asList(attributes));
        return this;
    }

    /**
     *  <p>Attributes of the Variant.</p>
     * @param attributes value to be set
     * @return Builder
     */

    public VariantCreatedMessagePayloadBuilder attributes(
            @Nullable final java.util.List<com.commercetools.api.models.product.Attribute> attributes) {
        this.attributes = attributes;
        return this;
    }

    /**
     *  <p>Attributes of the Variant.</p>
     * @param attributes value to be set
     * @return Builder
     */

    public VariantCreatedMessagePayloadBuilder plusAttributes(
            @Nullable final com.commercetools.api.models.product.Attribute... attributes) {
        if (this.attributes == null) {
            this.attributes = new ArrayList<>();
        }
        this.attributes.addAll(Arrays.asList(attributes));
        return this;
    }

    /**
     *  <p>Attributes of the Variant.</p>
     * @param builder function to build the attributes value
     * @return Builder
     */

    public VariantCreatedMessagePayloadBuilder plusAttributes(
            Function<com.commercetools.api.models.product.AttributeBuilder, com.commercetools.api.models.product.AttributeBuilder> builder) {
        if (this.attributes == null) {
            this.attributes = new ArrayList<>();
        }
        this.attributes.add(builder.apply(com.commercetools.api.models.product.AttributeBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Attributes of the Variant.</p>
     * @param builder function to build the attributes value
     * @return Builder
     */

    public VariantCreatedMessagePayloadBuilder withAttributes(
            Function<com.commercetools.api.models.product.AttributeBuilder, com.commercetools.api.models.product.AttributeBuilder> builder) {
        this.attributes = new ArrayList<>();
        this.attributes.add(builder.apply(com.commercetools.api.models.product.AttributeBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Attributes of the Variant.</p>
     * @param builder function to build the attributes value
     * @return Builder
     */

    public VariantCreatedMessagePayloadBuilder addAttributes(
            Function<com.commercetools.api.models.product.AttributeBuilder, com.commercetools.api.models.product.Attribute> builder) {
        return plusAttributes(builder.apply(com.commercetools.api.models.product.AttributeBuilder.of()));
    }

    /**
     *  <p>Attributes of the Variant.</p>
     * @param builder function to build the attributes value
     * @return Builder
     */

    public VariantCreatedMessagePayloadBuilder setAttributes(
            Function<com.commercetools.api.models.product.AttributeBuilder, com.commercetools.api.models.product.Attribute> builder) {
        return attributes(builder.apply(com.commercetools.api.models.product.AttributeBuilder.of()));
    }

    /**
     *  <p>Assets of the Variant.</p>
     * @param assets value to be set
     * @return Builder
     */

    public VariantCreatedMessagePayloadBuilder assets(
            @Nullable final com.commercetools.api.models.common.Asset... assets) {
        this.assets = new ArrayList<>(Arrays.asList(assets));
        return this;
    }

    /**
     *  <p>Assets of the Variant.</p>
     * @param assets value to be set
     * @return Builder
     */

    public VariantCreatedMessagePayloadBuilder assets(
            @Nullable final java.util.List<com.commercetools.api.models.common.Asset> assets) {
        this.assets = assets;
        return this;
    }

    /**
     *  <p>Assets of the Variant.</p>
     * @param assets value to be set
     * @return Builder
     */

    public VariantCreatedMessagePayloadBuilder plusAssets(
            @Nullable final com.commercetools.api.models.common.Asset... assets) {
        if (this.assets == null) {
            this.assets = new ArrayList<>();
        }
        this.assets.addAll(Arrays.asList(assets));
        return this;
    }

    /**
     *  <p>Assets of the Variant.</p>
     * @param builder function to build the assets value
     * @return Builder
     */

    public VariantCreatedMessagePayloadBuilder plusAssets(
            Function<com.commercetools.api.models.common.AssetBuilder, com.commercetools.api.models.common.AssetBuilder> builder) {
        if (this.assets == null) {
            this.assets = new ArrayList<>();
        }
        this.assets.add(builder.apply(com.commercetools.api.models.common.AssetBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Assets of the Variant.</p>
     * @param builder function to build the assets value
     * @return Builder
     */

    public VariantCreatedMessagePayloadBuilder withAssets(
            Function<com.commercetools.api.models.common.AssetBuilder, com.commercetools.api.models.common.AssetBuilder> builder) {
        this.assets = new ArrayList<>();
        this.assets.add(builder.apply(com.commercetools.api.models.common.AssetBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Assets of the Variant.</p>
     * @param builder function to build the assets value
     * @return Builder
     */

    public VariantCreatedMessagePayloadBuilder addAssets(
            Function<com.commercetools.api.models.common.AssetBuilder, com.commercetools.api.models.common.Asset> builder) {
        return plusAssets(builder.apply(com.commercetools.api.models.common.AssetBuilder.of()));
    }

    /**
     *  <p>Assets of the Variant.</p>
     * @param builder function to build the assets value
     * @return Builder
     */

    public VariantCreatedMessagePayloadBuilder setAssets(
            Function<com.commercetools.api.models.common.AssetBuilder, com.commercetools.api.models.common.Asset> builder) {
        return assets(builder.apply(com.commercetools.api.models.common.AssetBuilder.of()));
    }

    /**
     *  <p>Images of the Variant.</p>
     * @param images value to be set
     * @return Builder
     */

    public VariantCreatedMessagePayloadBuilder images(
            @Nullable final com.commercetools.api.models.common.Image... images) {
        this.images = new ArrayList<>(Arrays.asList(images));
        return this;
    }

    /**
     *  <p>Images of the Variant.</p>
     * @param images value to be set
     * @return Builder
     */

    public VariantCreatedMessagePayloadBuilder images(
            @Nullable final java.util.List<com.commercetools.api.models.common.Image> images) {
        this.images = images;
        return this;
    }

    /**
     *  <p>Images of the Variant.</p>
     * @param images value to be set
     * @return Builder
     */

    public VariantCreatedMessagePayloadBuilder plusImages(
            @Nullable final com.commercetools.api.models.common.Image... images) {
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

    public VariantCreatedMessagePayloadBuilder plusImages(
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

    public VariantCreatedMessagePayloadBuilder withImages(
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

    public VariantCreatedMessagePayloadBuilder addImages(
            Function<com.commercetools.api.models.common.ImageBuilder, com.commercetools.api.models.common.Image> builder) {
        return plusImages(builder.apply(com.commercetools.api.models.common.ImageBuilder.of()));
    }

    /**
     *  <p>Images of the Variant.</p>
     * @param builder function to build the images value
     * @return Builder
     */

    public VariantCreatedMessagePayloadBuilder setImages(
            Function<com.commercetools.api.models.common.ImageBuilder, com.commercetools.api.models.common.Image> builder) {
        return images(builder.apply(com.commercetools.api.models.common.ImageBuilder.of()));
    }

    /**
     *  <p>Whether the Variant was published.</p>
     * @param publish value to be set
     * @return Builder
     */

    public VariantCreatedMessagePayloadBuilder publish(final Boolean publish) {
        this.publish = publish;
        return this;
    }

    /**
     *  <p>Unique identifier of the Variant.</p>
     * @return id
     */

    public String getId() {
        return this.id;
    }

    /**
     *  <p>Unique identifier of the Product to which the Variant belongs.</p>
     * @return productId
     */

    public String getProductId() {
        return this.productId;
    }

    /**
     *  <p>Unique identifier of the Variant within its parent Product.</p>
     * @return variantId
     */

    public Integer getVariantId() {
        return this.variantId;
    }

    /**
     *  <p>User-defined unique identifier of the Variant.</p>
     * @return key
     */

    @Nullable
    public String getKey() {
        return this.key;
    }

    /**
     *  <p>SKU of the Variant.</p>
     * @return sku
     */

    @Nullable
    public String getSku() {
        return this.sku;
    }

    /**
     *  <p>Attributes of the Variant.</p>
     * @return attributes
     */

    @Nullable
    public java.util.List<com.commercetools.api.models.product.Attribute> getAttributes() {
        return this.attributes;
    }

    /**
     *  <p>Assets of the Variant.</p>
     * @return assets
     */

    @Nullable
    public java.util.List<com.commercetools.api.models.common.Asset> getAssets() {
        return this.assets;
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
     *  <p>Whether the Variant was published.</p>
     * @return publish
     */

    public Boolean getPublish() {
        return this.publish;
    }

    /**
     * builds VariantCreatedMessagePayload with checking for non-null required values
     * @return VariantCreatedMessagePayload
     */
    public VariantCreatedMessagePayload build() {
        Objects.requireNonNull(id, VariantCreatedMessagePayload.class + ": id is missing");
        Objects.requireNonNull(productId, VariantCreatedMessagePayload.class + ": productId is missing");
        Objects.requireNonNull(variantId, VariantCreatedMessagePayload.class + ": variantId is missing");
        Objects.requireNonNull(publish, VariantCreatedMessagePayload.class + ": publish is missing");
        return new VariantCreatedMessagePayloadImpl(id, productId, variantId, key, sku, attributes, assets, images,
            publish);
    }

    /**
     * builds VariantCreatedMessagePayload without checking for non-null required values
     * @return VariantCreatedMessagePayload
     */
    public VariantCreatedMessagePayload buildUnchecked() {
        return new VariantCreatedMessagePayloadImpl(id, productId, variantId, key, sku, attributes, assets, images,
            publish);
    }

    /**
     * factory method for an instance of VariantCreatedMessagePayloadBuilder
     * @return builder
     */
    public static VariantCreatedMessagePayloadBuilder of() {
        return new VariantCreatedMessagePayloadBuilder();
    }

    /**
     * create builder for VariantCreatedMessagePayload instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static VariantCreatedMessagePayloadBuilder of(final VariantCreatedMessagePayload template) {
        VariantCreatedMessagePayloadBuilder builder = new VariantCreatedMessagePayloadBuilder();
        builder.id = template.getId();
        builder.productId = template.getProductId();
        builder.variantId = template.getVariantId();
        builder.key = template.getKey();
        builder.sku = template.getSku();
        builder.attributes = template.getAttributes();
        builder.assets = template.getAssets();
        builder.images = template.getImages();
        builder.publish = template.getPublish();
        return builder;
    }

}
