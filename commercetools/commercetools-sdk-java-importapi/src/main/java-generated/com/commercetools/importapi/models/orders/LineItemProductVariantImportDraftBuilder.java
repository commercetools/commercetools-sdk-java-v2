
package com.commercetools.importapi.models.orders;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
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

    public LineItemProductVariantImportDraftBuilder productVariant(
            Function<com.commercetools.importapi.models.common.ProductVariantKeyReferenceBuilder, com.commercetools.importapi.models.common.ProductVariantKeyReferenceBuilder> builder) {
        this.productVariant = builder
                .apply(com.commercetools.importapi.models.common.ProductVariantKeyReferenceBuilder.of())
                .build();
        return this;
    }

    public LineItemProductVariantImportDraftBuilder productVariant(
            @Nullable final com.commercetools.importapi.models.common.ProductVariantKeyReference productVariant) {
        this.productVariant = productVariant;
        return this;
    }

    public LineItemProductVariantImportDraftBuilder sku(@Nullable final String sku) {
        this.sku = sku;
        return this;
    }

    public LineItemProductVariantImportDraftBuilder prices(
            @Nullable final com.commercetools.importapi.models.orders.LineItemPrice... prices) {
        this.prices = new ArrayList<>(Arrays.asList(prices));
        return this;
    }

    public LineItemProductVariantImportDraftBuilder prices(
            @Nullable final java.util.List<com.commercetools.importapi.models.orders.LineItemPrice> prices) {
        this.prices = prices;
        return this;
    }

    public LineItemProductVariantImportDraftBuilder plusPrices(
            @Nullable final com.commercetools.importapi.models.orders.LineItemPrice... prices) {
        if (this.prices == null) {
            this.prices = new ArrayList<>();
        }
        this.prices.addAll(Arrays.asList(prices));
        return this;
    }

    public LineItemProductVariantImportDraftBuilder plusPrices(
            Function<com.commercetools.importapi.models.orders.LineItemPriceBuilder, com.commercetools.importapi.models.orders.LineItemPriceBuilder> builder) {
        if (this.prices == null) {
            this.prices = new ArrayList<>();
        }
        this.prices.add(builder.apply(com.commercetools.importapi.models.orders.LineItemPriceBuilder.of()).build());
        return this;
    }

    public LineItemProductVariantImportDraftBuilder withPrices(
            Function<com.commercetools.importapi.models.orders.LineItemPriceBuilder, com.commercetools.importapi.models.orders.LineItemPriceBuilder> builder) {
        this.prices = new ArrayList<>();
        this.prices.add(builder.apply(com.commercetools.importapi.models.orders.LineItemPriceBuilder.of()).build());
        return this;
    }

    public LineItemProductVariantImportDraftBuilder attributes(
            @Nullable final com.commercetools.importapi.models.productvariants.Attribute... attributes) {
        this.attributes = new ArrayList<>(Arrays.asList(attributes));
        return this;
    }

    public LineItemProductVariantImportDraftBuilder attributes(
            @Nullable final java.util.List<com.commercetools.importapi.models.productvariants.Attribute> attributes) {
        this.attributes = attributes;
        return this;
    }

    public LineItemProductVariantImportDraftBuilder plusAttributes(
            @Nullable final com.commercetools.importapi.models.productvariants.Attribute... attributes) {
        if (this.attributes == null) {
            this.attributes = new ArrayList<>();
        }
        this.attributes.addAll(Arrays.asList(attributes));
        return this;
    }

    public LineItemProductVariantImportDraftBuilder plusAttributes(
            Function<com.commercetools.importapi.models.productvariants.AttributeBuilder, Builder<? extends com.commercetools.importapi.models.productvariants.Attribute>> builder) {
        if (this.attributes == null) {
            this.attributes = new ArrayList<>();
        }
        this.attributes
                .add(builder.apply(com.commercetools.importapi.models.productvariants.AttributeBuilder.of()).build());
        return this;
    }

    public LineItemProductVariantImportDraftBuilder withAttributes(
            Function<com.commercetools.importapi.models.productvariants.AttributeBuilder, Builder<? extends com.commercetools.importapi.models.productvariants.Attribute>> builder) {
        this.attributes = new ArrayList<>();
        this.attributes
                .add(builder.apply(com.commercetools.importapi.models.productvariants.AttributeBuilder.of()).build());
        return this;
    }

    public LineItemProductVariantImportDraftBuilder images(
            @Nullable final com.commercetools.importapi.models.common.Image... images) {
        this.images = new ArrayList<>(Arrays.asList(images));
        return this;
    }

    public LineItemProductVariantImportDraftBuilder images(
            @Nullable final java.util.List<com.commercetools.importapi.models.common.Image> images) {
        this.images = images;
        return this;
    }

    public LineItemProductVariantImportDraftBuilder plusImages(
            @Nullable final com.commercetools.importapi.models.common.Image... images) {
        if (this.images == null) {
            this.images = new ArrayList<>();
        }
        this.images.addAll(Arrays.asList(images));
        return this;
    }

    public LineItemProductVariantImportDraftBuilder plusImages(
            Function<com.commercetools.importapi.models.common.ImageBuilder, com.commercetools.importapi.models.common.ImageBuilder> builder) {
        if (this.images == null) {
            this.images = new ArrayList<>();
        }
        this.images.add(builder.apply(com.commercetools.importapi.models.common.ImageBuilder.of()).build());
        return this;
    }

    public LineItemProductVariantImportDraftBuilder withImages(
            Function<com.commercetools.importapi.models.common.ImageBuilder, com.commercetools.importapi.models.common.ImageBuilder> builder) {
        this.images = new ArrayList<>();
        this.images.add(builder.apply(com.commercetools.importapi.models.common.ImageBuilder.of()).build());
        return this;
    }

    @Nullable
    public com.commercetools.importapi.models.common.ProductVariantKeyReference getProductVariant() {
        return this.productVariant;
    }

    @Nullable
    public String getSku() {
        return this.sku;
    }

    @Nullable
    public java.util.List<com.commercetools.importapi.models.orders.LineItemPrice> getPrices() {
        return this.prices;
    }

    @Nullable
    public java.util.List<com.commercetools.importapi.models.productvariants.Attribute> getAttributes() {
        return this.attributes;
    }

    @Nullable
    public java.util.List<com.commercetools.importapi.models.common.Image> getImages() {
        return this.images;
    }

    public LineItemProductVariantImportDraft build() {
        return new LineItemProductVariantImportDraftImpl(productVariant, sku, prices, attributes, images);
    }

    /**
     * builds LineItemProductVariantImportDraft without checking for non null required values
     */
    public LineItemProductVariantImportDraft buildUnchecked() {
        return new LineItemProductVariantImportDraftImpl(productVariant, sku, prices, attributes, images);
    }

    public static LineItemProductVariantImportDraftBuilder of() {
        return new LineItemProductVariantImportDraftBuilder();
    }

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
