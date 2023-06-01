package com.commercetools.importapi.models.orders;

import com.commercetools.importapi.models.common.Image;
import com.commercetools.importapi.models.common.ProductVariantKeyReference;
import com.commercetools.importapi.models.orders.LineItemPrice;
import com.commercetools.importapi.models.productvariants.Attribute;
import com.commercetools.importapi.models.orders.LineItemProductVariantImportDraft;
import javax.annotation.Nullable;
import java.util.*;
import java.util.function.Function;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * LineItemProductVariantImportDraftBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     LineItemProductVariantImportDraft lineItemProductVariantImportDraft = LineItemProductVariantImportDraft.builder()
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class LineItemProductVariantImportDraftBuilder implements Builder<LineItemProductVariantImportDraft> {

    
    @Nullable
    private com.commercetools.importapi.models.common.ProductVariantKeyReference productVariant;
    
    
    @Nullable
    private String sku;
    
    
    @Nullable
    private java.util.List<com.commercetools.importapi.models.orders.LineItemPrice> prices;
    
    
    @Nullable
    private java.util.List<com.commercetools.importapi.models.productvariants.Attribute> attributes;
    
    
    @Nullable
    private java.util.List<com.commercetools.importapi.models.common.Image> images;

    
    /**
     *  <p>Maps to <code>ProductVariant.product</code>.</p>
     * @param builder function to build the productVariant value
     * @return Builder
     */
    
    public LineItemProductVariantImportDraftBuilder productVariant(Function<com.commercetools.importapi.models.common.ProductVariantKeyReferenceBuilder, com.commercetools.importapi.models.common.ProductVariantKeyReferenceBuilder> builder) {
        this.productVariant = builder.apply(com.commercetools.importapi.models.common.ProductVariantKeyReferenceBuilder.of()).build();
        return this;
    }
    
    /**
     *  <p>Maps to <code>ProductVariant.product</code>.</p>
     * @param builder function to build the productVariant value
     * @return Builder
     */
    
    public LineItemProductVariantImportDraftBuilder withProductVariant(Function<com.commercetools.importapi.models.common.ProductVariantKeyReferenceBuilder, com.commercetools.importapi.models.common.ProductVariantKeyReference> builder) {
        this.productVariant = builder.apply(com.commercetools.importapi.models.common.ProductVariantKeyReferenceBuilder.of());
        return this;
    }
                    
    /**
     *  <p>Maps to <code>ProductVariant.product</code>.</p>
     * @param productVariant value to be set
     * @return Builder
     */
    
    public LineItemProductVariantImportDraftBuilder productVariant(@Nullable final com.commercetools.importapi.models.common.ProductVariantKeyReference productVariant) {
        this.productVariant = productVariant;
        return this;
    }
    
    
    
    
    /**
     *  <p>Maps to <code>ProductVariantImportDraft.sku</code>.</p>
     * @param sku value to be set
     * @return Builder
     */
    
    public LineItemProductVariantImportDraftBuilder sku(@Nullable final String sku) {
        this.sku = sku;
        return this;
    }
    
    
    
    /**
     *  <p>Maps to <code>ProductVariantImportDraft.prices</code></p>
     * @param prices value to be set
     * @return Builder
     */
    
    public LineItemProductVariantImportDraftBuilder prices(@Nullable final com.commercetools.importapi.models.orders.LineItemPrice ...prices) {
        this.prices = new ArrayList<>(Arrays.asList(prices));
        return this;
    }
    
    /**
     *  <p>Maps to <code>ProductVariantImportDraft.prices</code></p>
     * @param prices value to be set
     * @return Builder
     */
    
    public LineItemProductVariantImportDraftBuilder prices(@Nullable final java.util.List<com.commercetools.importapi.models.orders.LineItemPrice> prices) {
        this.prices = prices;
        return this;
    }
    
    /**
     *  <p>Maps to <code>ProductVariantImportDraft.prices</code></p>
     * @param prices value to be set
     * @return Builder
     */
    
    public LineItemProductVariantImportDraftBuilder plusPrices(@Nullable final com.commercetools.importapi.models.orders.LineItemPrice ...prices) {
        if (this.prices == null) {
            this.prices = new ArrayList<>();
        }
        this.prices.addAll(Arrays.asList(prices));
        return this;
    }
    
    
    
    /**
     *  <p>Maps to <code>ProductVariantImportDraft.prices</code></p>
     * @param builder function to build the prices value
     * @return Builder
     */
    
    public LineItemProductVariantImportDraftBuilder plusPrices(Function<com.commercetools.importapi.models.orders.LineItemPriceBuilder, com.commercetools.importapi.models.orders.LineItemPriceBuilder> builder) {
        if (this.prices == null) {
            this.prices = new ArrayList<>();
        }
        this.prices.add(builder.apply(com.commercetools.importapi.models.orders.LineItemPriceBuilder.of()).build());
        return this;
    }
    
    /**
     *  <p>Maps to <code>ProductVariantImportDraft.prices</code></p>
     * @param builder function to build the prices value
     * @return Builder
     */
    
    public LineItemProductVariantImportDraftBuilder withPrices(Function<com.commercetools.importapi.models.orders.LineItemPriceBuilder, com.commercetools.importapi.models.orders.LineItemPriceBuilder> builder) {
        this.prices = new ArrayList<>();
        this.prices.add(builder.apply(com.commercetools.importapi.models.orders.LineItemPriceBuilder.of()).build());
        return this;
    }
    
    /**
     *  <p>Maps to <code>ProductVariantImportDraft.prices</code></p>
     * @param builder function to build the prices value
     * @return Builder
     */
    
    public LineItemProductVariantImportDraftBuilder addPrices(Function<com.commercetools.importapi.models.orders.LineItemPriceBuilder, com.commercetools.importapi.models.orders.LineItemPrice> builder) {
        return plusPrices(builder.apply(com.commercetools.importapi.models.orders.LineItemPriceBuilder.of()));
    }
    
    /**
     *  <p>Maps to <code>ProductVariantImportDraft.prices</code></p>
     * @param builder function to build the prices value
     * @return Builder
     */
    
    public LineItemProductVariantImportDraftBuilder setPrices(Function<com.commercetools.importapi.models.orders.LineItemPriceBuilder, com.commercetools.importapi.models.orders.LineItemPrice> builder) {
        return prices(builder.apply(com.commercetools.importapi.models.orders.LineItemPriceBuilder.of()));
    }
                    
    
    /**
     *  <p>Maps to <code>ProductVariantImportDraft.attributes</code></p>
     * @param attributes value to be set
     * @return Builder
     */
    
    public LineItemProductVariantImportDraftBuilder attributes(@Nullable final com.commercetools.importapi.models.productvariants.Attribute ...attributes) {
        this.attributes = new ArrayList<>(Arrays.asList(attributes));
        return this;
    }
    
    /**
     *  <p>Maps to <code>ProductVariantImportDraft.attributes</code></p>
     * @param attributes value to be set
     * @return Builder
     */
    
    public LineItemProductVariantImportDraftBuilder attributes(@Nullable final java.util.List<com.commercetools.importapi.models.productvariants.Attribute> attributes) {
        this.attributes = attributes;
        return this;
    }
    
    /**
     *  <p>Maps to <code>ProductVariantImportDraft.attributes</code></p>
     * @param attributes value to be set
     * @return Builder
     */
    
    public LineItemProductVariantImportDraftBuilder plusAttributes(@Nullable final com.commercetools.importapi.models.productvariants.Attribute ...attributes) {
        if (this.attributes == null) {
            this.attributes = new ArrayList<>();
        }
        this.attributes.addAll(Arrays.asList(attributes));
        return this;
    }
    
    
    /**
     *  <p>Maps to <code>ProductVariantImportDraft.attributes</code></p>
     * @param builder function to build the attributes value
     * @return Builder
     */
    
    public LineItemProductVariantImportDraftBuilder plusAttributes(Function<com.commercetools.importapi.models.productvariants.AttributeBuilder, Builder<? extends com.commercetools.importapi.models.productvariants.Attribute>> builder) {
        if (this.attributes == null) {
            this.attributes = new ArrayList<>();
        }
        this.attributes.add(builder.apply(com.commercetools.importapi.models.productvariants.AttributeBuilder.of()).build());
        return this;
    }
    
    /**
     *  <p>Maps to <code>ProductVariantImportDraft.attributes</code></p>
     * @param builder function to build the attributes value
     * @return Builder
     */
    
    public LineItemProductVariantImportDraftBuilder withAttributes(Function<com.commercetools.importapi.models.productvariants.AttributeBuilder, Builder<? extends com.commercetools.importapi.models.productvariants.Attribute>> builder) {
        this.attributes = new ArrayList<>();
        this.attributes.add(builder.apply(com.commercetools.importapi.models.productvariants.AttributeBuilder.of()).build());
        return this;
    }
                    
    
    
    /**
     *  <p>Maps to <code>ProductVariantImportDraft.images</code>.</p>
     * @param images value to be set
     * @return Builder
     */
    
    public LineItemProductVariantImportDraftBuilder images(@Nullable final com.commercetools.importapi.models.common.Image ...images) {
        this.images = new ArrayList<>(Arrays.asList(images));
        return this;
    }
    
    /**
     *  <p>Maps to <code>ProductVariantImportDraft.images</code>.</p>
     * @param images value to be set
     * @return Builder
     */
    
    public LineItemProductVariantImportDraftBuilder images(@Nullable final java.util.List<com.commercetools.importapi.models.common.Image> images) {
        this.images = images;
        return this;
    }
    
    /**
     *  <p>Maps to <code>ProductVariantImportDraft.images</code>.</p>
     * @param images value to be set
     * @return Builder
     */
    
    public LineItemProductVariantImportDraftBuilder plusImages(@Nullable final com.commercetools.importapi.models.common.Image ...images) {
        if (this.images == null) {
            this.images = new ArrayList<>();
        }
        this.images.addAll(Arrays.asList(images));
        return this;
    }
    
    
    
    /**
     *  <p>Maps to <code>ProductVariantImportDraft.images</code>.</p>
     * @param builder function to build the images value
     * @return Builder
     */
    
    public LineItemProductVariantImportDraftBuilder plusImages(Function<com.commercetools.importapi.models.common.ImageBuilder, com.commercetools.importapi.models.common.ImageBuilder> builder) {
        if (this.images == null) {
            this.images = new ArrayList<>();
        }
        this.images.add(builder.apply(com.commercetools.importapi.models.common.ImageBuilder.of()).build());
        return this;
    }
    
    /**
     *  <p>Maps to <code>ProductVariantImportDraft.images</code>.</p>
     * @param builder function to build the images value
     * @return Builder
     */
    
    public LineItemProductVariantImportDraftBuilder withImages(Function<com.commercetools.importapi.models.common.ImageBuilder, com.commercetools.importapi.models.common.ImageBuilder> builder) {
        this.images = new ArrayList<>();
        this.images.add(builder.apply(com.commercetools.importapi.models.common.ImageBuilder.of()).build());
        return this;
    }
    
    /**
     *  <p>Maps to <code>ProductVariantImportDraft.images</code>.</p>
     * @param builder function to build the images value
     * @return Builder
     */
    
    public LineItemProductVariantImportDraftBuilder addImages(Function<com.commercetools.importapi.models.common.ImageBuilder, com.commercetools.importapi.models.common.Image> builder) {
        return plusImages(builder.apply(com.commercetools.importapi.models.common.ImageBuilder.of()));
    }
    
    /**
     *  <p>Maps to <code>ProductVariantImportDraft.images</code>.</p>
     * @param builder function to build the images value
     * @return Builder
     */
    
    public LineItemProductVariantImportDraftBuilder setImages(Function<com.commercetools.importapi.models.common.ImageBuilder, com.commercetools.importapi.models.common.Image> builder) {
        return images(builder.apply(com.commercetools.importapi.models.common.ImageBuilder.of()));
    }
                    

    /**
     *  <p>Maps to <code>ProductVariant.product</code>.</p>
     * @return productVariant
     */
    
    @Nullable
    public com.commercetools.importapi.models.common.ProductVariantKeyReference getProductVariant(){
        return this.productVariant;
    }
    
    /**
     *  <p>Maps to <code>ProductVariantImportDraft.sku</code>.</p>
     * @return sku
     */
    
    @Nullable
    public String getSku(){
        return this.sku;
    }
    
    /**
     *  <p>Maps to <code>ProductVariantImportDraft.prices</code></p>
     * @return prices
     */
    
    @Nullable
    public java.util.List<com.commercetools.importapi.models.orders.LineItemPrice> getPrices(){
        return this.prices;
    }
    
    /**
     *  <p>Maps to <code>ProductVariantImportDraft.attributes</code></p>
     * @return attributes
     */
    
    @Nullable
    public java.util.List<com.commercetools.importapi.models.productvariants.Attribute> getAttributes(){
        return this.attributes;
    }
    
    /**
     *  <p>Maps to <code>ProductVariantImportDraft.images</code>.</p>
     * @return images
     */
    
    @Nullable
    public java.util.List<com.commercetools.importapi.models.common.Image> getImages(){
        return this.images;
    }

    /**
     * builds LineItemProductVariantImportDraft with checking for non-null required values
     * @return LineItemProductVariantImportDraft
     */
    public LineItemProductVariantImportDraft build() {
        return new LineItemProductVariantImportDraftImpl(productVariant, sku, prices, attributes, images);
    }
    
    /**
     * builds LineItemProductVariantImportDraft without checking for non-null required values
     * @return LineItemProductVariantImportDraft
     */
    public LineItemProductVariantImportDraft buildUnchecked() {
        return new LineItemProductVariantImportDraftImpl(productVariant, sku, prices, attributes, images);
    }

    /**
     * factory method for an instance of LineItemProductVariantImportDraftBuilder
     * @return builder 
     */
    public static LineItemProductVariantImportDraftBuilder of() {
        return new LineItemProductVariantImportDraftBuilder();
    }

    /**
     * create builder for LineItemProductVariantImportDraft instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static LineItemProductVariantImportDraftBuilder of(final LineItemProductVariantImportDraft template) {
        LineItemProductVariantImportDraftBuilder builder = new LineItemProductVariantImportDraftBuilder();
        builder.productVariant = template.getProductVariant();
        builder.sku = template.getSku();
        builder.prices = template.getPrices();
        builder.attributes = template.getAttributes();
        builder.images = template.getImages();
        return builder;
    }

}
