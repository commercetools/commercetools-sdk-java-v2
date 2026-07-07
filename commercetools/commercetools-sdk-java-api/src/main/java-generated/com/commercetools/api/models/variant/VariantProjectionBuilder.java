
package com.commercetools.api.models.variant;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * VariantProjectionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     VariantProjection variantProjection = VariantProjection.builder()
 *             .id("{id}")
 *             .version(0.3)
 *             .createdAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .staged(true)
 *             .variantId(0.3)
 *             .product(productBuilder -> productBuilder)
 *             .name(nameBuilder -> nameBuilder)
 *             .slug(slugBuilder -> slugBuilder)
 *             .plusImages(imagesBuilder -> imagesBuilder)
 *             .plusAssets(assetsBuilder -> assetsBuilder)
 *             .plusAttributes(attributesBuilder -> attributesBuilder)
 *             .default(true)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class VariantProjectionBuilder implements Builder<VariantProjection> {

    private String id;

    private Long version;

    private java.time.ZonedDateTime createdAt;

    private Boolean staged;

    private Integer variantId;

    private com.commercetools.api.models.product.ProductReference product;

    private com.commercetools.api.models.common.LocalizedString name;

    private com.commercetools.api.models.common.LocalizedString slug;

    @Nullable
    private com.commercetools.api.models.common.LocalizedString description;

    @Nullable
    private String key;

    @Nullable
    private String sku;

    private java.util.List<com.commercetools.api.models.common.Image> images;

    private java.util.List<com.commercetools.api.models.common.Asset> assets;

    private java.util.List<com.commercetools.api.models.product.Attribute> attributes;

    @Nullable
    private com.commercetools.api.models.common.Price price;

    private Boolean _default;

    /**
     *  <p>Unique identifier of the Variant within its parent Product.</p>
     * @param id value to be set
     * @return Builder
     */

    public VariantProjectionBuilder id(final String id) {
        this.id = id;
        return this;
    }

    /**
     *  <p>Current version of the Variant Projection.</p>
     * @param version value to be set
     * @return Builder
     */

    public VariantProjectionBuilder version(final Long version) {
        this.version = version;
        return this;
    }

    /**
     *  <p>Date and time (UTC) the Variant Projection was initially created.</p>
     * @param createdAt value to be set
     * @return Builder
     */

    public VariantProjectionBuilder createdAt(final java.time.ZonedDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     *  <p><code>true</code> for the staged (draft) projection, <code>false</code> for the current (published) projection.</p>
     * @param staged value to be set
     * @return Builder
     */

    public VariantProjectionBuilder staged(final Boolean staged) {
        this.staged = staged;
        return this;
    }

    /**
     *  <p>The <code>id</code> of the <a href="https://docs.commercetools.com/apis/ctp:api:type:Variant" rel="nofollow">Variant</a>.</p>
     * @param variantId value to be set
     * @return Builder
     */

    public VariantProjectionBuilder variantId(final Integer variantId) {
        this.variantId = variantId;
        return this;
    }

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:Reference" rel="nofollow">Reference</a> to the parent <a href="https://docs.commercetools.com/apis/ctp:api:type:Product" rel="nofollow">Product</a>.</p>
     * @param builder function to build the product value
     * @return Builder
     */

    public VariantProjectionBuilder product(
            Function<com.commercetools.api.models.product.ProductReferenceBuilder, com.commercetools.api.models.product.ProductReferenceBuilder> builder) {
        this.product = builder.apply(com.commercetools.api.models.product.ProductReferenceBuilder.of()).build();
        return this;
    }

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:Reference" rel="nofollow">Reference</a> to the parent <a href="https://docs.commercetools.com/apis/ctp:api:type:Product" rel="nofollow">Product</a>.</p>
     * @param builder function to build the product value
     * @return Builder
     */

    public VariantProjectionBuilder withProduct(
            Function<com.commercetools.api.models.product.ProductReferenceBuilder, com.commercetools.api.models.product.ProductReference> builder) {
        this.product = builder.apply(com.commercetools.api.models.product.ProductReferenceBuilder.of());
        return this;
    }

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:Reference" rel="nofollow">Reference</a> to the parent <a href="https://docs.commercetools.com/apis/ctp:api:type:Product" rel="nofollow">Product</a>.</p>
     * @param product value to be set
     * @return Builder
     */

    public VariantProjectionBuilder product(final com.commercetools.api.models.product.ProductReference product) {
        this.product = product;
        return this;
    }

    /**
     *  <p>Name of the parent <a href="https://docs.commercetools.com/apis/ctp:api:type:Product" rel="nofollow">Product</a>.</p>
     * @param builder function to build the name value
     * @return Builder
     */

    public VariantProjectionBuilder name(
            Function<com.commercetools.api.models.common.LocalizedStringBuilder, com.commercetools.api.models.common.LocalizedStringBuilder> builder) {
        this.name = builder.apply(com.commercetools.api.models.common.LocalizedStringBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Name of the parent <a href="https://docs.commercetools.com/apis/ctp:api:type:Product" rel="nofollow">Product</a>.</p>
     * @param builder function to build the name value
     * @return Builder
     */

    public VariantProjectionBuilder withName(
            Function<com.commercetools.api.models.common.LocalizedStringBuilder, com.commercetools.api.models.common.LocalizedString> builder) {
        this.name = builder.apply(com.commercetools.api.models.common.LocalizedStringBuilder.of());
        return this;
    }

    /**
     *  <p>Name of the parent <a href="https://docs.commercetools.com/apis/ctp:api:type:Product" rel="nofollow">Product</a>.</p>
     * @param name value to be set
     * @return Builder
     */

    public VariantProjectionBuilder name(final com.commercetools.api.models.common.LocalizedString name) {
        this.name = name;
        return this;
    }

    /**
     *  <p>Slug of the parent <a href="https://docs.commercetools.com/apis/ctp:api:type:Product" rel="nofollow">Product</a>.</p>
     * @param builder function to build the slug value
     * @return Builder
     */

    public VariantProjectionBuilder slug(
            Function<com.commercetools.api.models.common.LocalizedStringBuilder, com.commercetools.api.models.common.LocalizedStringBuilder> builder) {
        this.slug = builder.apply(com.commercetools.api.models.common.LocalizedStringBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Slug of the parent <a href="https://docs.commercetools.com/apis/ctp:api:type:Product" rel="nofollow">Product</a>.</p>
     * @param builder function to build the slug value
     * @return Builder
     */

    public VariantProjectionBuilder withSlug(
            Function<com.commercetools.api.models.common.LocalizedStringBuilder, com.commercetools.api.models.common.LocalizedString> builder) {
        this.slug = builder.apply(com.commercetools.api.models.common.LocalizedStringBuilder.of());
        return this;
    }

    /**
     *  <p>Slug of the parent <a href="https://docs.commercetools.com/apis/ctp:api:type:Product" rel="nofollow">Product</a>.</p>
     * @param slug value to be set
     * @return Builder
     */

    public VariantProjectionBuilder slug(final com.commercetools.api.models.common.LocalizedString slug) {
        this.slug = slug;
        return this;
    }

    /**
     *  <p>Description of the parent <a href="https://docs.commercetools.com/apis/ctp:api:type:Product" rel="nofollow">Product</a>.</p>
     * @param builder function to build the description value
     * @return Builder
     */

    public VariantProjectionBuilder description(
            Function<com.commercetools.api.models.common.LocalizedStringBuilder, com.commercetools.api.models.common.LocalizedStringBuilder> builder) {
        this.description = builder.apply(com.commercetools.api.models.common.LocalizedStringBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Description of the parent <a href="https://docs.commercetools.com/apis/ctp:api:type:Product" rel="nofollow">Product</a>.</p>
     * @param builder function to build the description value
     * @return Builder
     */

    public VariantProjectionBuilder withDescription(
            Function<com.commercetools.api.models.common.LocalizedStringBuilder, com.commercetools.api.models.common.LocalizedString> builder) {
        this.description = builder.apply(com.commercetools.api.models.common.LocalizedStringBuilder.of());
        return this;
    }

    /**
     *  <p>Description of the parent <a href="https://docs.commercetools.com/apis/ctp:api:type:Product" rel="nofollow">Product</a>.</p>
     * @param description value to be set
     * @return Builder
     */

    public VariantProjectionBuilder description(
            @Nullable final com.commercetools.api.models.common.LocalizedString description) {
        this.description = description;
        return this;
    }

    /**
     *  <p>User-defined unique identifier of the <a href="https://docs.commercetools.com/apis/ctp:api:type:Variant" rel="nofollow">Variant</a>.</p>
     * @param key value to be set
     * @return Builder
     */

    public VariantProjectionBuilder key(@Nullable final String key) {
        this.key = key;
        return this;
    }

    /**
     *  <p>SKU of the <a href="https://docs.commercetools.com/apis/ctp:api:type:Variant" rel="nofollow">Variant</a>.</p>
     * @param sku value to be set
     * @return Builder
     */

    public VariantProjectionBuilder sku(@Nullable final String sku) {
        this.sku = sku;
        return this;
    }

    /**
     *  <p>Images of the <a href="https://docs.commercetools.com/apis/ctp:api:type:Variant" rel="nofollow">Variant</a>.</p>
     * @param images value to be set
     * @return Builder
     */

    public VariantProjectionBuilder images(final com.commercetools.api.models.common.Image... images) {
        this.images = new ArrayList<>(Arrays.asList(images));
        return this;
    }

    /**
     *  <p>Images of the <a href="https://docs.commercetools.com/apis/ctp:api:type:Variant" rel="nofollow">Variant</a>.</p>
     * @param images value to be set
     * @return Builder
     */

    public VariantProjectionBuilder images(final java.util.List<com.commercetools.api.models.common.Image> images) {
        this.images = images;
        return this;
    }

    /**
     *  <p>Images of the <a href="https://docs.commercetools.com/apis/ctp:api:type:Variant" rel="nofollow">Variant</a>.</p>
     * @param images value to be set
     * @return Builder
     */

    public VariantProjectionBuilder plusImages(final com.commercetools.api.models.common.Image... images) {
        if (this.images == null) {
            this.images = new ArrayList<>();
        }
        this.images.addAll(Arrays.asList(images));
        return this;
    }

    /**
     *  <p>Images of the <a href="https://docs.commercetools.com/apis/ctp:api:type:Variant" rel="nofollow">Variant</a>.</p>
     * @param builder function to build the images value
     * @return Builder
     */

    public VariantProjectionBuilder plusImages(
            Function<com.commercetools.api.models.common.ImageBuilder, com.commercetools.api.models.common.ImageBuilder> builder) {
        if (this.images == null) {
            this.images = new ArrayList<>();
        }
        this.images.add(builder.apply(com.commercetools.api.models.common.ImageBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Images of the <a href="https://docs.commercetools.com/apis/ctp:api:type:Variant" rel="nofollow">Variant</a>.</p>
     * @param builder function to build the images value
     * @return Builder
     */

    public VariantProjectionBuilder withImages(
            Function<com.commercetools.api.models.common.ImageBuilder, com.commercetools.api.models.common.ImageBuilder> builder) {
        this.images = new ArrayList<>();
        this.images.add(builder.apply(com.commercetools.api.models.common.ImageBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Images of the <a href="https://docs.commercetools.com/apis/ctp:api:type:Variant" rel="nofollow">Variant</a>.</p>
     * @param builder function to build the images value
     * @return Builder
     */

    public VariantProjectionBuilder addImages(
            Function<com.commercetools.api.models.common.ImageBuilder, com.commercetools.api.models.common.Image> builder) {
        return plusImages(builder.apply(com.commercetools.api.models.common.ImageBuilder.of()));
    }

    /**
     *  <p>Images of the <a href="https://docs.commercetools.com/apis/ctp:api:type:Variant" rel="nofollow">Variant</a>.</p>
     * @param builder function to build the images value
     * @return Builder
     */

    public VariantProjectionBuilder setImages(
            Function<com.commercetools.api.models.common.ImageBuilder, com.commercetools.api.models.common.Image> builder) {
        return images(builder.apply(com.commercetools.api.models.common.ImageBuilder.of()));
    }

    /**
     *  <p>Assets of the <a href="https://docs.commercetools.com/apis/ctp:api:type:Variant" rel="nofollow">Variant</a>.</p>
     * @param assets value to be set
     * @return Builder
     */

    public VariantProjectionBuilder assets(final com.commercetools.api.models.common.Asset... assets) {
        this.assets = new ArrayList<>(Arrays.asList(assets));
        return this;
    }

    /**
     *  <p>Assets of the <a href="https://docs.commercetools.com/apis/ctp:api:type:Variant" rel="nofollow">Variant</a>.</p>
     * @param assets value to be set
     * @return Builder
     */

    public VariantProjectionBuilder assets(final java.util.List<com.commercetools.api.models.common.Asset> assets) {
        this.assets = assets;
        return this;
    }

    /**
     *  <p>Assets of the <a href="https://docs.commercetools.com/apis/ctp:api:type:Variant" rel="nofollow">Variant</a>.</p>
     * @param assets value to be set
     * @return Builder
     */

    public VariantProjectionBuilder plusAssets(final com.commercetools.api.models.common.Asset... assets) {
        if (this.assets == null) {
            this.assets = new ArrayList<>();
        }
        this.assets.addAll(Arrays.asList(assets));
        return this;
    }

    /**
     *  <p>Assets of the <a href="https://docs.commercetools.com/apis/ctp:api:type:Variant" rel="nofollow">Variant</a>.</p>
     * @param builder function to build the assets value
     * @return Builder
     */

    public VariantProjectionBuilder plusAssets(
            Function<com.commercetools.api.models.common.AssetBuilder, com.commercetools.api.models.common.AssetBuilder> builder) {
        if (this.assets == null) {
            this.assets = new ArrayList<>();
        }
        this.assets.add(builder.apply(com.commercetools.api.models.common.AssetBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Assets of the <a href="https://docs.commercetools.com/apis/ctp:api:type:Variant" rel="nofollow">Variant</a>.</p>
     * @param builder function to build the assets value
     * @return Builder
     */

    public VariantProjectionBuilder withAssets(
            Function<com.commercetools.api.models.common.AssetBuilder, com.commercetools.api.models.common.AssetBuilder> builder) {
        this.assets = new ArrayList<>();
        this.assets.add(builder.apply(com.commercetools.api.models.common.AssetBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Assets of the <a href="https://docs.commercetools.com/apis/ctp:api:type:Variant" rel="nofollow">Variant</a>.</p>
     * @param builder function to build the assets value
     * @return Builder
     */

    public VariantProjectionBuilder addAssets(
            Function<com.commercetools.api.models.common.AssetBuilder, com.commercetools.api.models.common.Asset> builder) {
        return plusAssets(builder.apply(com.commercetools.api.models.common.AssetBuilder.of()));
    }

    /**
     *  <p>Assets of the <a href="https://docs.commercetools.com/apis/ctp:api:type:Variant" rel="nofollow">Variant</a>.</p>
     * @param builder function to build the assets value
     * @return Builder
     */

    public VariantProjectionBuilder setAssets(
            Function<com.commercetools.api.models.common.AssetBuilder, com.commercetools.api.models.common.Asset> builder) {
        return assets(builder.apply(com.commercetools.api.models.common.AssetBuilder.of()));
    }

    /**
     *  <p>Attributes of the <a href="https://docs.commercetools.com/apis/ctp:api:type:Variant" rel="nofollow">Variant</a>, including product-level Attributes merged at projection time.</p>
     * @param attributes value to be set
     * @return Builder
     */

    public VariantProjectionBuilder attributes(final com.commercetools.api.models.product.Attribute... attributes) {
        this.attributes = new ArrayList<>(Arrays.asList(attributes));
        return this;
    }

    /**
     *  <p>Attributes of the <a href="https://docs.commercetools.com/apis/ctp:api:type:Variant" rel="nofollow">Variant</a>, including product-level Attributes merged at projection time.</p>
     * @param attributes value to be set
     * @return Builder
     */

    public VariantProjectionBuilder attributes(
            final java.util.List<com.commercetools.api.models.product.Attribute> attributes) {
        this.attributes = attributes;
        return this;
    }

    /**
     *  <p>Attributes of the <a href="https://docs.commercetools.com/apis/ctp:api:type:Variant" rel="nofollow">Variant</a>, including product-level Attributes merged at projection time.</p>
     * @param attributes value to be set
     * @return Builder
     */

    public VariantProjectionBuilder plusAttributes(final com.commercetools.api.models.product.Attribute... attributes) {
        if (this.attributes == null) {
            this.attributes = new ArrayList<>();
        }
        this.attributes.addAll(Arrays.asList(attributes));
        return this;
    }

    /**
     *  <p>Attributes of the <a href="https://docs.commercetools.com/apis/ctp:api:type:Variant" rel="nofollow">Variant</a>, including product-level Attributes merged at projection time.</p>
     * @param builder function to build the attributes value
     * @return Builder
     */

    public VariantProjectionBuilder plusAttributes(
            Function<com.commercetools.api.models.product.AttributeBuilder, com.commercetools.api.models.product.AttributeBuilder> builder) {
        if (this.attributes == null) {
            this.attributes = new ArrayList<>();
        }
        this.attributes.add(builder.apply(com.commercetools.api.models.product.AttributeBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Attributes of the <a href="https://docs.commercetools.com/apis/ctp:api:type:Variant" rel="nofollow">Variant</a>, including product-level Attributes merged at projection time.</p>
     * @param builder function to build the attributes value
     * @return Builder
     */

    public VariantProjectionBuilder withAttributes(
            Function<com.commercetools.api.models.product.AttributeBuilder, com.commercetools.api.models.product.AttributeBuilder> builder) {
        this.attributes = new ArrayList<>();
        this.attributes.add(builder.apply(com.commercetools.api.models.product.AttributeBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Attributes of the <a href="https://docs.commercetools.com/apis/ctp:api:type:Variant" rel="nofollow">Variant</a>, including product-level Attributes merged at projection time.</p>
     * @param builder function to build the attributes value
     * @return Builder
     */

    public VariantProjectionBuilder addAttributes(
            Function<com.commercetools.api.models.product.AttributeBuilder, com.commercetools.api.models.product.Attribute> builder) {
        return plusAttributes(builder.apply(com.commercetools.api.models.product.AttributeBuilder.of()));
    }

    /**
     *  <p>Attributes of the <a href="https://docs.commercetools.com/apis/ctp:api:type:Variant" rel="nofollow">Variant</a>, including product-level Attributes merged at projection time.</p>
     * @param builder function to build the attributes value
     * @return Builder
     */

    public VariantProjectionBuilder setAttributes(
            Function<com.commercetools.api.models.product.AttributeBuilder, com.commercetools.api.models.product.Attribute> builder) {
        return attributes(builder.apply(com.commercetools.api.models.product.AttributeBuilder.of()));
    }

    /**
     *  <p>The selected price based on the <span>price selection</span> query parameters. Only present when price selection parameters are provided.</p>
     * @param builder function to build the price value
     * @return Builder
     */

    public VariantProjectionBuilder price(
            Function<com.commercetools.api.models.common.PriceBuilder, com.commercetools.api.models.common.PriceBuilder> builder) {
        this.price = builder.apply(com.commercetools.api.models.common.PriceBuilder.of()).build();
        return this;
    }

    /**
     *  <p>The selected price based on the <span>price selection</span> query parameters. Only present when price selection parameters are provided.</p>
     * @param builder function to build the price value
     * @return Builder
     */

    public VariantProjectionBuilder withPrice(
            Function<com.commercetools.api.models.common.PriceBuilder, com.commercetools.api.models.common.Price> builder) {
        this.price = builder.apply(com.commercetools.api.models.common.PriceBuilder.of());
        return this;
    }

    /**
     *  <p>The selected price based on the <span>price selection</span> query parameters. Only present when price selection parameters are provided.</p>
     * @param price value to be set
     * @return Builder
     */

    public VariantProjectionBuilder price(@Nullable final com.commercetools.api.models.common.Price price) {
        this.price = price;
        return this;
    }

    /**
     *  <p><code>true</code> if this Variant is the default Variant of its <a href="https://docs.commercetools.com/apis/ctp:api:type:Product" rel="nofollow">Product</a> (see <span>Product.defaultVariant</span>). <code>false</code> otherwise.</p>
     * @param _default value to be set
     * @return Builder
     */

    public VariantProjectionBuilder _default(final Boolean _default) {
        this._default = _default;
        return this;
    }

    /**
     *  <p>Unique identifier of the Variant within its parent Product.</p>
     * @return id
     */

    public String getId() {
        return this.id;
    }

    /**
     *  <p>Current version of the Variant Projection.</p>
     * @return version
     */

    public Long getVersion() {
        return this.version;
    }

    /**
     *  <p>Date and time (UTC) the Variant Projection was initially created.</p>
     * @return createdAt
     */

    public java.time.ZonedDateTime getCreatedAt() {
        return this.createdAt;
    }

    /**
     *  <p><code>true</code> for the staged (draft) projection, <code>false</code> for the current (published) projection.</p>
     * @return staged
     */

    public Boolean getStaged() {
        return this.staged;
    }

    /**
     *  <p>The <code>id</code> of the <a href="https://docs.commercetools.com/apis/ctp:api:type:Variant" rel="nofollow">Variant</a>.</p>
     * @return variantId
     */

    public Integer getVariantId() {
        return this.variantId;
    }

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:Reference" rel="nofollow">Reference</a> to the parent <a href="https://docs.commercetools.com/apis/ctp:api:type:Product" rel="nofollow">Product</a>.</p>
     * @return product
     */

    public com.commercetools.api.models.product.ProductReference getProduct() {
        return this.product;
    }

    /**
     *  <p>Name of the parent <a href="https://docs.commercetools.com/apis/ctp:api:type:Product" rel="nofollow">Product</a>.</p>
     * @return name
     */

    public com.commercetools.api.models.common.LocalizedString getName() {
        return this.name;
    }

    /**
     *  <p>Slug of the parent <a href="https://docs.commercetools.com/apis/ctp:api:type:Product" rel="nofollow">Product</a>.</p>
     * @return slug
     */

    public com.commercetools.api.models.common.LocalizedString getSlug() {
        return this.slug;
    }

    /**
     *  <p>Description of the parent <a href="https://docs.commercetools.com/apis/ctp:api:type:Product" rel="nofollow">Product</a>.</p>
     * @return description
     */

    @Nullable
    public com.commercetools.api.models.common.LocalizedString getDescription() {
        return this.description;
    }

    /**
     *  <p>User-defined unique identifier of the <a href="https://docs.commercetools.com/apis/ctp:api:type:Variant" rel="nofollow">Variant</a>.</p>
     * @return key
     */

    @Nullable
    public String getKey() {
        return this.key;
    }

    /**
     *  <p>SKU of the <a href="https://docs.commercetools.com/apis/ctp:api:type:Variant" rel="nofollow">Variant</a>.</p>
     * @return sku
     */

    @Nullable
    public String getSku() {
        return this.sku;
    }

    /**
     *  <p>Images of the <a href="https://docs.commercetools.com/apis/ctp:api:type:Variant" rel="nofollow">Variant</a>.</p>
     * @return images
     */

    public java.util.List<com.commercetools.api.models.common.Image> getImages() {
        return this.images;
    }

    /**
     *  <p>Assets of the <a href="https://docs.commercetools.com/apis/ctp:api:type:Variant" rel="nofollow">Variant</a>.</p>
     * @return assets
     */

    public java.util.List<com.commercetools.api.models.common.Asset> getAssets() {
        return this.assets;
    }

    /**
     *  <p>Attributes of the <a href="https://docs.commercetools.com/apis/ctp:api:type:Variant" rel="nofollow">Variant</a>, including product-level Attributes merged at projection time.</p>
     * @return attributes
     */

    public java.util.List<com.commercetools.api.models.product.Attribute> getAttributes() {
        return this.attributes;
    }

    /**
     *  <p>The selected price based on the <span>price selection</span> query parameters. Only present when price selection parameters are provided.</p>
     * @return price
     */

    @Nullable
    public com.commercetools.api.models.common.Price getPrice() {
        return this.price;
    }

    /**
     *  <p><code>true</code> if this Variant is the default Variant of its <a href="https://docs.commercetools.com/apis/ctp:api:type:Product" rel="nofollow">Product</a> (see <span>Product.defaultVariant</span>). <code>false</code> otherwise.</p>
     * @return default
     */

    public Boolean getDefault() {
        return this._default;
    }

    /**
     * builds VariantProjection with checking for non-null required values
     * @return VariantProjection
     */
    public VariantProjection build() {
        Objects.requireNonNull(id, VariantProjection.class + ": id is missing");
        Objects.requireNonNull(version, VariantProjection.class + ": version is missing");
        Objects.requireNonNull(createdAt, VariantProjection.class + ": createdAt is missing");
        Objects.requireNonNull(staged, VariantProjection.class + ": staged is missing");
        Objects.requireNonNull(variantId, VariantProjection.class + ": variantId is missing");
        Objects.requireNonNull(product, VariantProjection.class + ": product is missing");
        Objects.requireNonNull(name, VariantProjection.class + ": name is missing");
        Objects.requireNonNull(slug, VariantProjection.class + ": slug is missing");
        Objects.requireNonNull(images, VariantProjection.class + ": images is missing");
        Objects.requireNonNull(assets, VariantProjection.class + ": assets is missing");
        Objects.requireNonNull(attributes, VariantProjection.class + ": attributes is missing");
        Objects.requireNonNull(_default, VariantProjection.class + ": default is missing");
        return new VariantProjectionImpl(id, version, createdAt, staged, variantId, product, name, slug, description,
            key, sku, images, assets, attributes, price, _default);
    }

    /**
     * builds VariantProjection without checking for non-null required values
     * @return VariantProjection
     */
    public VariantProjection buildUnchecked() {
        return new VariantProjectionImpl(id, version, createdAt, staged, variantId, product, name, slug, description,
            key, sku, images, assets, attributes, price, _default);
    }

    /**
     * factory method for an instance of VariantProjectionBuilder
     * @return builder
     */
    public static VariantProjectionBuilder of() {
        return new VariantProjectionBuilder();
    }

    /**
     * create builder for VariantProjection instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static VariantProjectionBuilder of(final VariantProjection template) {
        VariantProjectionBuilder builder = new VariantProjectionBuilder();
        builder.id = template.getId();
        builder.version = template.getVersion();
        builder.createdAt = template.getCreatedAt();
        builder.staged = template.getStaged();
        builder.variantId = template.getVariantId();
        builder.product = template.getProduct();
        builder.name = template.getName();
        builder.slug = template.getSlug();
        builder.description = template.getDescription();
        builder.key = template.getKey();
        builder.sku = template.getSku();
        builder.images = template.getImages();
        builder.assets = template.getAssets();
        builder.attributes = template.getAttributes();
        builder.price = template.getPrice();
        builder._default = template.getDefault();
        return builder;
    }

}
