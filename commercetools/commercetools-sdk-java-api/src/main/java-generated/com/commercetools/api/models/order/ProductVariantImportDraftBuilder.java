
package com.commercetools.api.models.order;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ProductVariantImportDraftBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductVariantImportDraft productVariantImportDraft = ProductVariantImportDraft.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ProductVariantImportDraftBuilder implements Builder<ProductVariantImportDraft> {

    @Nullable
    private Long id;

    @Nullable
    private String sku;

    @Nullable
    private java.util.List<com.commercetools.api.models.common.PriceDraft> prices;

    @Nullable
    private java.util.List<com.commercetools.api.models.product.Attribute> attributes;

    @Nullable
    private java.util.List<com.commercetools.api.models.common.Image> images;

    /**
     *  <p>The <code>id</code> of the ProductVariant. Required if you do not set a value for <code>sku</code>. If set, you must specify a <code>productId</code> in the LineItemImportDraft also.</p>
     * @param id value to be set
     * @return Builder
     */

    public ProductVariantImportDraftBuilder id(@Nullable final Long id) {
        this.id = id;
        return this;
    }

    /**
     *  <p>The <code>sku</code> of the ProductVariant. Required if you do not set a value for <code>id</code>.</p>
     * @param sku value to be set
     * @return Builder
     */

    public ProductVariantImportDraftBuilder sku(@Nullable final String sku) {
        this.sku = sku;
        return this;
    }

    /**
     *  <p>The Prices of the Product Variant if you want to override the <code>prices</code> property in the referenced ProductVariant. If not set, the <code>prices</code> from the referenced ProductVariant are used in the resulting Order. If set, each Price must have its unique price scope (same <code>value.currencyCode</code>, <code>country</code>, <code>customerGroup</code>, <code>channel</code>, <code>validFrom</code> and <code>validUntil</code>).</p>
     * @param prices value to be set
     * @return Builder
     */

    public ProductVariantImportDraftBuilder prices(
            @Nullable final com.commercetools.api.models.common.PriceDraft... prices) {
        this.prices = new ArrayList<>(Arrays.asList(prices));
        return this;
    }

    /**
     *  <p>The Prices of the Product Variant if you want to override the <code>prices</code> property in the referenced ProductVariant. If not set, the <code>prices</code> from the referenced ProductVariant are used in the resulting Order. If set, each Price must have its unique price scope (same <code>value.currencyCode</code>, <code>country</code>, <code>customerGroup</code>, <code>channel</code>, <code>validFrom</code> and <code>validUntil</code>).</p>
     * @param prices value to be set
     * @return Builder
     */

    public ProductVariantImportDraftBuilder prices(
            @Nullable final java.util.List<com.commercetools.api.models.common.PriceDraft> prices) {
        this.prices = prices;
        return this;
    }

    /**
     *  <p>The Prices of the Product Variant if you want to override the <code>prices</code> property in the referenced ProductVariant. If not set, the <code>prices</code> from the referenced ProductVariant are used in the resulting Order. If set, each Price must have its unique price scope (same <code>value.currencyCode</code>, <code>country</code>, <code>customerGroup</code>, <code>channel</code>, <code>validFrom</code> and <code>validUntil</code>).</p>
     * @param prices value to be set
     * @return Builder
     */

    public ProductVariantImportDraftBuilder plusPrices(
            @Nullable final com.commercetools.api.models.common.PriceDraft... prices) {
        if (this.prices == null) {
            this.prices = new ArrayList<>();
        }
        this.prices.addAll(Arrays.asList(prices));
        return this;
    }

    /**
     *  <p>The Prices of the Product Variant if you want to override the <code>prices</code> property in the referenced ProductVariant. If not set, the <code>prices</code> from the referenced ProductVariant are used in the resulting Order. If set, each Price must have its unique price scope (same <code>value.currencyCode</code>, <code>country</code>, <code>customerGroup</code>, <code>channel</code>, <code>validFrom</code> and <code>validUntil</code>).</p>
     * @param builder function to build the prices value
     * @return Builder
     */

    public ProductVariantImportDraftBuilder plusPrices(
            Function<com.commercetools.api.models.common.PriceDraftBuilder, com.commercetools.api.models.common.PriceDraftBuilder> builder) {
        if (this.prices == null) {
            this.prices = new ArrayList<>();
        }
        this.prices.add(builder.apply(com.commercetools.api.models.common.PriceDraftBuilder.of()).build());
        return this;
    }

    /**
     *  <p>The Prices of the Product Variant if you want to override the <code>prices</code> property in the referenced ProductVariant. If not set, the <code>prices</code> from the referenced ProductVariant are used in the resulting Order. If set, each Price must have its unique price scope (same <code>value.currencyCode</code>, <code>country</code>, <code>customerGroup</code>, <code>channel</code>, <code>validFrom</code> and <code>validUntil</code>).</p>
     * @param builder function to build the prices value
     * @return Builder
     */

    public ProductVariantImportDraftBuilder withPrices(
            Function<com.commercetools.api.models.common.PriceDraftBuilder, com.commercetools.api.models.common.PriceDraftBuilder> builder) {
        this.prices = new ArrayList<>();
        this.prices.add(builder.apply(com.commercetools.api.models.common.PriceDraftBuilder.of()).build());
        return this;
    }

    /**
     *  <p>The Prices of the Product Variant if you want to override the <code>prices</code> property in the referenced ProductVariant. If not set, the <code>prices</code> from the referenced ProductVariant are used in the resulting Order. If set, each Price must have its unique price scope (same <code>value.currencyCode</code>, <code>country</code>, <code>customerGroup</code>, <code>channel</code>, <code>validFrom</code> and <code>validUntil</code>).</p>
     * @param builder function to build the prices value
     * @return Builder
     */

    public ProductVariantImportDraftBuilder addPrices(
            Function<com.commercetools.api.models.common.PriceDraftBuilder, com.commercetools.api.models.common.PriceDraft> builder) {
        return plusPrices(builder.apply(com.commercetools.api.models.common.PriceDraftBuilder.of()));
    }

    /**
     *  <p>The Prices of the Product Variant if you want to override the <code>prices</code> property in the referenced ProductVariant. If not set, the <code>prices</code> from the referenced ProductVariant are used in the resulting Order. If set, each Price must have its unique price scope (same <code>value.currencyCode</code>, <code>country</code>, <code>customerGroup</code>, <code>channel</code>, <code>validFrom</code> and <code>validUntil</code>).</p>
     * @param builder function to build the prices value
     * @return Builder
     */

    public ProductVariantImportDraftBuilder setPrices(
            Function<com.commercetools.api.models.common.PriceDraftBuilder, com.commercetools.api.models.common.PriceDraft> builder) {
        return prices(builder.apply(com.commercetools.api.models.common.PriceDraftBuilder.of()));
    }

    /**
     *  <p>The Attributes of the Product Variant if you want to override the <code>attributes</code> property in the referenced ProductVariant. If not set, the <code>attributes</code> from the referenced ProductVariant are copied to the resulting Order.</p>
     * @param attributes value to be set
     * @return Builder
     */

    public ProductVariantImportDraftBuilder attributes(
            @Nullable final com.commercetools.api.models.product.Attribute... attributes) {
        this.attributes = new ArrayList<>(Arrays.asList(attributes));
        return this;
    }

    /**
     *  <p>The Attributes of the Product Variant if you want to override the <code>attributes</code> property in the referenced ProductVariant. If not set, the <code>attributes</code> from the referenced ProductVariant are copied to the resulting Order.</p>
     * @param attributes value to be set
     * @return Builder
     */

    public ProductVariantImportDraftBuilder attributes(
            @Nullable final java.util.List<com.commercetools.api.models.product.Attribute> attributes) {
        this.attributes = attributes;
        return this;
    }

    /**
     *  <p>The Attributes of the Product Variant if you want to override the <code>attributes</code> property in the referenced ProductVariant. If not set, the <code>attributes</code> from the referenced ProductVariant are copied to the resulting Order.</p>
     * @param attributes value to be set
     * @return Builder
     */

    public ProductVariantImportDraftBuilder plusAttributes(
            @Nullable final com.commercetools.api.models.product.Attribute... attributes) {
        if (this.attributes == null) {
            this.attributes = new ArrayList<>();
        }
        this.attributes.addAll(Arrays.asList(attributes));
        return this;
    }

    /**
     *  <p>The Attributes of the Product Variant if you want to override the <code>attributes</code> property in the referenced ProductVariant. If not set, the <code>attributes</code> from the referenced ProductVariant are copied to the resulting Order.</p>
     * @param builder function to build the attributes value
     * @return Builder
     */

    public ProductVariantImportDraftBuilder plusAttributes(
            Function<com.commercetools.api.models.product.AttributeBuilder, com.commercetools.api.models.product.AttributeBuilder> builder) {
        if (this.attributes == null) {
            this.attributes = new ArrayList<>();
        }
        this.attributes.add(builder.apply(com.commercetools.api.models.product.AttributeBuilder.of()).build());
        return this;
    }

    /**
     *  <p>The Attributes of the Product Variant if you want to override the <code>attributes</code> property in the referenced ProductVariant. If not set, the <code>attributes</code> from the referenced ProductVariant are copied to the resulting Order.</p>
     * @param builder function to build the attributes value
     * @return Builder
     */

    public ProductVariantImportDraftBuilder withAttributes(
            Function<com.commercetools.api.models.product.AttributeBuilder, com.commercetools.api.models.product.AttributeBuilder> builder) {
        this.attributes = new ArrayList<>();
        this.attributes.add(builder.apply(com.commercetools.api.models.product.AttributeBuilder.of()).build());
        return this;
    }

    /**
     *  <p>The Attributes of the Product Variant if you want to override the <code>attributes</code> property in the referenced ProductVariant. If not set, the <code>attributes</code> from the referenced ProductVariant are copied to the resulting Order.</p>
     * @param builder function to build the attributes value
     * @return Builder
     */

    public ProductVariantImportDraftBuilder addAttributes(
            Function<com.commercetools.api.models.product.AttributeBuilder, com.commercetools.api.models.product.Attribute> builder) {
        return plusAttributes(builder.apply(com.commercetools.api.models.product.AttributeBuilder.of()));
    }

    /**
     *  <p>The Attributes of the Product Variant if you want to override the <code>attributes</code> property in the referenced ProductVariant. If not set, the <code>attributes</code> from the referenced ProductVariant are copied to the resulting Order.</p>
     * @param builder function to build the attributes value
     * @return Builder
     */

    public ProductVariantImportDraftBuilder setAttributes(
            Function<com.commercetools.api.models.product.AttributeBuilder, com.commercetools.api.models.product.Attribute> builder) {
        return attributes(builder.apply(com.commercetools.api.models.product.AttributeBuilder.of()));
    }

    /**
     *  <p>The Images of the Product Variant if you want to override the <code>images</code> property in the referenced ProductVariant. If not set, the <code>images</code> from the referenced ProductVariant are copied to the resulting Order.</p>
     * @param images value to be set
     * @return Builder
     */

    public ProductVariantImportDraftBuilder images(
            @Nullable final com.commercetools.api.models.common.Image... images) {
        this.images = new ArrayList<>(Arrays.asList(images));
        return this;
    }

    /**
     *  <p>The Images of the Product Variant if you want to override the <code>images</code> property in the referenced ProductVariant. If not set, the <code>images</code> from the referenced ProductVariant are copied to the resulting Order.</p>
     * @param images value to be set
     * @return Builder
     */

    public ProductVariantImportDraftBuilder images(
            @Nullable final java.util.List<com.commercetools.api.models.common.Image> images) {
        this.images = images;
        return this;
    }

    /**
     *  <p>The Images of the Product Variant if you want to override the <code>images</code> property in the referenced ProductVariant. If not set, the <code>images</code> from the referenced ProductVariant are copied to the resulting Order.</p>
     * @param images value to be set
     * @return Builder
     */

    public ProductVariantImportDraftBuilder plusImages(
            @Nullable final com.commercetools.api.models.common.Image... images) {
        if (this.images == null) {
            this.images = new ArrayList<>();
        }
        this.images.addAll(Arrays.asList(images));
        return this;
    }

    /**
     *  <p>The Images of the Product Variant if you want to override the <code>images</code> property in the referenced ProductVariant. If not set, the <code>images</code> from the referenced ProductVariant are copied to the resulting Order.</p>
     * @param builder function to build the images value
     * @return Builder
     */

    public ProductVariantImportDraftBuilder plusImages(
            Function<com.commercetools.api.models.common.ImageBuilder, com.commercetools.api.models.common.ImageBuilder> builder) {
        if (this.images == null) {
            this.images = new ArrayList<>();
        }
        this.images.add(builder.apply(com.commercetools.api.models.common.ImageBuilder.of()).build());
        return this;
    }

    /**
     *  <p>The Images of the Product Variant if you want to override the <code>images</code> property in the referenced ProductVariant. If not set, the <code>images</code> from the referenced ProductVariant are copied to the resulting Order.</p>
     * @param builder function to build the images value
     * @return Builder
     */

    public ProductVariantImportDraftBuilder withImages(
            Function<com.commercetools.api.models.common.ImageBuilder, com.commercetools.api.models.common.ImageBuilder> builder) {
        this.images = new ArrayList<>();
        this.images.add(builder.apply(com.commercetools.api.models.common.ImageBuilder.of()).build());
        return this;
    }

    /**
     *  <p>The Images of the Product Variant if you want to override the <code>images</code> property in the referenced ProductVariant. If not set, the <code>images</code> from the referenced ProductVariant are copied to the resulting Order.</p>
     * @param builder function to build the images value
     * @return Builder
     */

    public ProductVariantImportDraftBuilder addImages(
            Function<com.commercetools.api.models.common.ImageBuilder, com.commercetools.api.models.common.Image> builder) {
        return plusImages(builder.apply(com.commercetools.api.models.common.ImageBuilder.of()));
    }

    /**
     *  <p>The Images of the Product Variant if you want to override the <code>images</code> property in the referenced ProductVariant. If not set, the <code>images</code> from the referenced ProductVariant are copied to the resulting Order.</p>
     * @param builder function to build the images value
     * @return Builder
     */

    public ProductVariantImportDraftBuilder setImages(
            Function<com.commercetools.api.models.common.ImageBuilder, com.commercetools.api.models.common.Image> builder) {
        return images(builder.apply(com.commercetools.api.models.common.ImageBuilder.of()));
    }

    /**
     *  <p>The <code>id</code> of the ProductVariant. Required if you do not set a value for <code>sku</code>. If set, you must specify a <code>productId</code> in the LineItemImportDraft also.</p>
     * @return id
     */

    @Nullable
    public Long getId() {
        return this.id;
    }

    /**
     *  <p>The <code>sku</code> of the ProductVariant. Required if you do not set a value for <code>id</code>.</p>
     * @return sku
     */

    @Nullable
    public String getSku() {
        return this.sku;
    }

    /**
     *  <p>The Prices of the Product Variant if you want to override the <code>prices</code> property in the referenced ProductVariant. If not set, the <code>prices</code> from the referenced ProductVariant are used in the resulting Order. If set, each Price must have its unique price scope (same <code>value.currencyCode</code>, <code>country</code>, <code>customerGroup</code>, <code>channel</code>, <code>validFrom</code> and <code>validUntil</code>).</p>
     * @return prices
     */

    @Nullable
    public java.util.List<com.commercetools.api.models.common.PriceDraft> getPrices() {
        return this.prices;
    }

    /**
     *  <p>The Attributes of the Product Variant if you want to override the <code>attributes</code> property in the referenced ProductVariant. If not set, the <code>attributes</code> from the referenced ProductVariant are copied to the resulting Order.</p>
     * @return attributes
     */

    @Nullable
    public java.util.List<com.commercetools.api.models.product.Attribute> getAttributes() {
        return this.attributes;
    }

    /**
     *  <p>The Images of the Product Variant if you want to override the <code>images</code> property in the referenced ProductVariant. If not set, the <code>images</code> from the referenced ProductVariant are copied to the resulting Order.</p>
     * @return images
     */

    @Nullable
    public java.util.List<com.commercetools.api.models.common.Image> getImages() {
        return this.images;
    }

    /**
     * builds ProductVariantImportDraft with checking for non-null required values
     * @return ProductVariantImportDraft
     */
    public ProductVariantImportDraft build() {
        return new ProductVariantImportDraftImpl(id, sku, prices, attributes, images);
    }

    /**
     * builds ProductVariantImportDraft without checking for non-null required values
     * @return ProductVariantImportDraft
     */
    public ProductVariantImportDraft buildUnchecked() {
        return new ProductVariantImportDraftImpl(id, sku, prices, attributes, images);
    }

    /**
     * factory method for an instance of ProductVariantImportDraftBuilder
     * @return builder
     */
    public static ProductVariantImportDraftBuilder of() {
        return new ProductVariantImportDraftBuilder();
    }

    /**
     * create builder for ProductVariantImportDraft instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ProductVariantImportDraftBuilder of(final ProductVariantImportDraft template) {
        ProductVariantImportDraftBuilder builder = new ProductVariantImportDraftBuilder();
        builder.id = template.getId();
        builder.sku = template.getSku();
        builder.prices = template.getPrices();
        builder.attributes = template.getAttributes();
        builder.images = template.getImages();
        return builder;
    }

}
