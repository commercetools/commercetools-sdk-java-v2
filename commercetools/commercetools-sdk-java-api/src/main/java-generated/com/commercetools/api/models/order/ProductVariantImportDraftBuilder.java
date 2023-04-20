
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
     *  <p>The sequential ID of the variant within the product. The variant with provided ID should exist in some existing product, so you also need to specify the productId if this property is set, or alternatively you can just specify SKU of the product variant.</p>
     * @param id value to be set
     * @return Builder
     */

    public ProductVariantImportDraftBuilder id(@Nullable final Long id) {
        this.id = id;
        return this;
    }

    /**
     *  <p>The SKU of the existing variant.</p>
     * @param sku value to be set
     * @return Builder
     */

    public ProductVariantImportDraftBuilder sku(@Nullable final String sku) {
        this.sku = sku;
        return this;
    }

    /**
     *  <p>The Embedded Prices of the variant. The prices should not contain two prices for the same price scope (same currency, country, customer group, channel, valid from and valid until). If this property is defined, then it will override the <code>prices</code> property from the original product variant, otherwise <code>prices</code> property from the original product variant would be copied in the resulting order.</p>
     * @param prices value to be set
     * @return Builder
     */

    public ProductVariantImportDraftBuilder prices(
            @Nullable final com.commercetools.api.models.common.PriceDraft... prices) {
        this.prices = new ArrayList<>(Arrays.asList(prices));
        return this;
    }

    /**
     *  <p>The Embedded Prices of the variant. The prices should not contain two prices for the same price scope (same currency, country, customer group, channel, valid from and valid until). If this property is defined, then it will override the <code>prices</code> property from the original product variant, otherwise <code>prices</code> property from the original product variant would be copied in the resulting order.</p>
     * @param prices value to be set
     * @return Builder
     */

    public ProductVariantImportDraftBuilder prices(
            @Nullable final java.util.List<com.commercetools.api.models.common.PriceDraft> prices) {
        this.prices = prices;
        return this;
    }

    /**
     *  <p>The Embedded Prices of the variant. The prices should not contain two prices for the same price scope (same currency, country, customer group, channel, valid from and valid until). If this property is defined, then it will override the <code>prices</code> property from the original product variant, otherwise <code>prices</code> property from the original product variant would be copied in the resulting order.</p>
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
     *  <p>The Embedded Prices of the variant. The prices should not contain two prices for the same price scope (same currency, country, customer group, channel, valid from and valid until). If this property is defined, then it will override the <code>prices</code> property from the original product variant, otherwise <code>prices</code> property from the original product variant would be copied in the resulting order.</p>
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
     *  <p>The Embedded Prices of the variant. The prices should not contain two prices for the same price scope (same currency, country, customer group, channel, valid from and valid until). If this property is defined, then it will override the <code>prices</code> property from the original product variant, otherwise <code>prices</code> property from the original product variant would be copied in the resulting order.</p>
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
     *  <p>The Embedded Prices of the variant. The prices should not contain two prices for the same price scope (same currency, country, customer group, channel, valid from and valid until). If this property is defined, then it will override the <code>prices</code> property from the original product variant, otherwise <code>prices</code> property from the original product variant would be copied in the resulting order.</p>
     * @param builder function to build the prices value
     * @return Builder
     */

    public ProductVariantImportDraftBuilder addPrices(
            Function<com.commercetools.api.models.common.PriceDraftBuilder, com.commercetools.api.models.common.PriceDraft> builder) {
        return plusPrices(builder.apply(com.commercetools.api.models.common.PriceDraftBuilder.of()));
    }

    /**
     *  <p>The Embedded Prices of the variant. The prices should not contain two prices for the same price scope (same currency, country, customer group, channel, valid from and valid until). If this property is defined, then it will override the <code>prices</code> property from the original product variant, otherwise <code>prices</code> property from the original product variant would be copied in the resulting order.</p>
     * @param builder function to build the prices value
     * @return Builder
     */

    public ProductVariantImportDraftBuilder setPrices(
            Function<com.commercetools.api.models.common.PriceDraftBuilder, com.commercetools.api.models.common.PriceDraft> builder) {
        return prices(builder.apply(com.commercetools.api.models.common.PriceDraftBuilder.of()));
    }

    /**
     *  <p>If this property is defined, then it will override the <code>attributes</code> property from the original product variant, otherwise <code>attributes</code> property from the original product variant would be copied in the resulting order.</p>
     * @param attributes value to be set
     * @return Builder
     */

    public ProductVariantImportDraftBuilder attributes(
            @Nullable final com.commercetools.api.models.product.Attribute... attributes) {
        this.attributes = new ArrayList<>(Arrays.asList(attributes));
        return this;
    }

    /**
     *  <p>If this property is defined, then it will override the <code>attributes</code> property from the original product variant, otherwise <code>attributes</code> property from the original product variant would be copied in the resulting order.</p>
     * @param attributes value to be set
     * @return Builder
     */

    public ProductVariantImportDraftBuilder attributes(
            @Nullable final java.util.List<com.commercetools.api.models.product.Attribute> attributes) {
        this.attributes = attributes;
        return this;
    }

    /**
     *  <p>If this property is defined, then it will override the <code>attributes</code> property from the original product variant, otherwise <code>attributes</code> property from the original product variant would be copied in the resulting order.</p>
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
     *  <p>If this property is defined, then it will override the <code>attributes</code> property from the original product variant, otherwise <code>attributes</code> property from the original product variant would be copied in the resulting order.</p>
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
     *  <p>If this property is defined, then it will override the <code>attributes</code> property from the original product variant, otherwise <code>attributes</code> property from the original product variant would be copied in the resulting order.</p>
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
     *  <p>If this property is defined, then it will override the <code>attributes</code> property from the original product variant, otherwise <code>attributes</code> property from the original product variant would be copied in the resulting order.</p>
     * @param builder function to build the attributes value
     * @return Builder
     */

    public ProductVariantImportDraftBuilder addAttributes(
            Function<com.commercetools.api.models.product.AttributeBuilder, com.commercetools.api.models.product.Attribute> builder) {
        return plusAttributes(builder.apply(com.commercetools.api.models.product.AttributeBuilder.of()));
    }

    /**
     *  <p>If this property is defined, then it will override the <code>attributes</code> property from the original product variant, otherwise <code>attributes</code> property from the original product variant would be copied in the resulting order.</p>
     * @param builder function to build the attributes value
     * @return Builder
     */

    public ProductVariantImportDraftBuilder setAttributes(
            Function<com.commercetools.api.models.product.AttributeBuilder, com.commercetools.api.models.product.Attribute> builder) {
        return attributes(builder.apply(com.commercetools.api.models.product.AttributeBuilder.of()));
    }

    /**
     *  <p>If this property is defined, then it will override the <code>images</code> property from the original product variant, otherwise <code>images</code> property from the original product variant would be copied in the resulting order.</p>
     * @param images value to be set
     * @return Builder
     */

    public ProductVariantImportDraftBuilder images(
            @Nullable final com.commercetools.api.models.common.Image... images) {
        this.images = new ArrayList<>(Arrays.asList(images));
        return this;
    }

    /**
     *  <p>If this property is defined, then it will override the <code>images</code> property from the original product variant, otherwise <code>images</code> property from the original product variant would be copied in the resulting order.</p>
     * @param images value to be set
     * @return Builder
     */

    public ProductVariantImportDraftBuilder images(
            @Nullable final java.util.List<com.commercetools.api.models.common.Image> images) {
        this.images = images;
        return this;
    }

    /**
     *  <p>If this property is defined, then it will override the <code>images</code> property from the original product variant, otherwise <code>images</code> property from the original product variant would be copied in the resulting order.</p>
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
     *  <p>If this property is defined, then it will override the <code>images</code> property from the original product variant, otherwise <code>images</code> property from the original product variant would be copied in the resulting order.</p>
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
     *  <p>If this property is defined, then it will override the <code>images</code> property from the original product variant, otherwise <code>images</code> property from the original product variant would be copied in the resulting order.</p>
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
     *  <p>If this property is defined, then it will override the <code>images</code> property from the original product variant, otherwise <code>images</code> property from the original product variant would be copied in the resulting order.</p>
     * @param builder function to build the images value
     * @return Builder
     */

    public ProductVariantImportDraftBuilder addImages(
            Function<com.commercetools.api.models.common.ImageBuilder, com.commercetools.api.models.common.Image> builder) {
        return plusImages(builder.apply(com.commercetools.api.models.common.ImageBuilder.of()));
    }

    /**
     *  <p>If this property is defined, then it will override the <code>images</code> property from the original product variant, otherwise <code>images</code> property from the original product variant would be copied in the resulting order.</p>
     * @param builder function to build the images value
     * @return Builder
     */

    public ProductVariantImportDraftBuilder setImages(
            Function<com.commercetools.api.models.common.ImageBuilder, com.commercetools.api.models.common.Image> builder) {
        return images(builder.apply(com.commercetools.api.models.common.ImageBuilder.of()));
    }

    /**
     *  <p>The sequential ID of the variant within the product. The variant with provided ID should exist in some existing product, so you also need to specify the productId if this property is set, or alternatively you can just specify SKU of the product variant.</p>
     * @return id
     */

    @Nullable
    public Long getId() {
        return this.id;
    }

    /**
     *  <p>The SKU of the existing variant.</p>
     * @return sku
     */

    @Nullable
    public String getSku() {
        return this.sku;
    }

    /**
     *  <p>The Embedded Prices of the variant. The prices should not contain two prices for the same price scope (same currency, country, customer group, channel, valid from and valid until). If this property is defined, then it will override the <code>prices</code> property from the original product variant, otherwise <code>prices</code> property from the original product variant would be copied in the resulting order.</p>
     * @return prices
     */

    @Nullable
    public java.util.List<com.commercetools.api.models.common.PriceDraft> getPrices() {
        return this.prices;
    }

    /**
     *  <p>If this property is defined, then it will override the <code>attributes</code> property from the original product variant, otherwise <code>attributes</code> property from the original product variant would be copied in the resulting order.</p>
     * @return attributes
     */

    @Nullable
    public java.util.List<com.commercetools.api.models.product.Attribute> getAttributes() {
        return this.attributes;
    }

    /**
     *  <p>If this property is defined, then it will override the <code>images</code> property from the original product variant, otherwise <code>images</code> property from the original product variant would be copied in the resulting order.</p>
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
