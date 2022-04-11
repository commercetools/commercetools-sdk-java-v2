
package com.commercetools.api.models.product;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class ProductVariantBuilder implements Builder<ProductVariant> {

    private Long id;

    @Nullable
    private String sku;

    @Nullable
    private String key;

    @Nullable
    private java.util.List<com.commercetools.api.models.common.Price> prices;

    @Nullable
    private java.util.List<com.commercetools.api.models.product.Attribute> attributes;

    @Nullable
    private com.commercetools.api.models.common.Price price;

    @Nullable
    private java.util.List<com.commercetools.api.models.common.Image> images;

    @Nullable
    private java.util.List<com.commercetools.api.models.common.Asset> assets;

    @Nullable
    private com.commercetools.api.models.product.ProductVariantAvailability availability;

    @Nullable
    private Boolean isMatchingVariant;

    @Nullable
    private com.commercetools.api.models.common.ScopedPrice scopedPrice;

    @Nullable
    private Boolean scopedPriceDiscounted;

    public ProductVariantBuilder id(final Long id) {
        this.id = id;
        return this;
    }

    public ProductVariantBuilder sku(@Nullable final String sku) {
        this.sku = sku;
        return this;
    }

    public ProductVariantBuilder key(@Nullable final String key) {
        this.key = key;
        return this;
    }

    public ProductVariantBuilder prices(@Nullable final com.commercetools.api.models.common.Price... prices) {
        this.prices = new ArrayList<>(Arrays.asList(prices));
        return this;
    }

    public ProductVariantBuilder prices(
            @Nullable final java.util.List<com.commercetools.api.models.common.Price> prices) {
        this.prices = prices;
        return this;
    }

    public ProductVariantBuilder plusPrices(@Nullable final com.commercetools.api.models.common.Price... prices) {
        if (this.prices == null) {
            this.prices = new ArrayList<>();
        }
        this.prices.addAll(Arrays.asList(prices));
        return this;
    }

    public ProductVariantBuilder plusPrices(
            Function<com.commercetools.api.models.common.PriceBuilder, com.commercetools.api.models.common.PriceBuilder> builder) {
        if (this.prices == null) {
            this.prices = new ArrayList<>();
        }
        this.prices.add(builder.apply(com.commercetools.api.models.common.PriceBuilder.of()).build());
        return this;
    }

    public ProductVariantBuilder withPrices(
            Function<com.commercetools.api.models.common.PriceBuilder, com.commercetools.api.models.common.PriceBuilder> builder) {
        this.prices = new ArrayList<>();
        this.prices.add(builder.apply(com.commercetools.api.models.common.PriceBuilder.of()).build());
        return this;
    }

    public ProductVariantBuilder attributes(
            @Nullable final com.commercetools.api.models.product.Attribute... attributes) {
        this.attributes = new ArrayList<>(Arrays.asList(attributes));
        return this;
    }

    public ProductVariantBuilder attributes(
            @Nullable final java.util.List<com.commercetools.api.models.product.Attribute> attributes) {
        this.attributes = attributes;
        return this;
    }

    public ProductVariantBuilder plusAttributes(
            @Nullable final com.commercetools.api.models.product.Attribute... attributes) {
        if (this.attributes == null) {
            this.attributes = new ArrayList<>();
        }
        this.attributes.addAll(Arrays.asList(attributes));
        return this;
    }

    public ProductVariantBuilder plusAttributes(
            Function<com.commercetools.api.models.product.AttributeBuilder, com.commercetools.api.models.product.AttributeBuilder> builder) {
        if (this.attributes == null) {
            this.attributes = new ArrayList<>();
        }
        this.attributes.add(builder.apply(com.commercetools.api.models.product.AttributeBuilder.of()).build());
        return this;
    }

    public ProductVariantBuilder withAttributes(
            Function<com.commercetools.api.models.product.AttributeBuilder, com.commercetools.api.models.product.AttributeBuilder> builder) {
        this.attributes = new ArrayList<>();
        this.attributes.add(builder.apply(com.commercetools.api.models.product.AttributeBuilder.of()).build());
        return this;
    }

    public ProductVariantBuilder price(
            Function<com.commercetools.api.models.common.PriceBuilder, com.commercetools.api.models.common.PriceBuilder> builder) {
        this.price = builder.apply(com.commercetools.api.models.common.PriceBuilder.of()).build();
        return this;
    }

    public ProductVariantBuilder price(@Nullable final com.commercetools.api.models.common.Price price) {
        this.price = price;
        return this;
    }

    public ProductVariantBuilder images(@Nullable final com.commercetools.api.models.common.Image... images) {
        this.images = new ArrayList<>(Arrays.asList(images));
        return this;
    }

    public ProductVariantBuilder images(
            @Nullable final java.util.List<com.commercetools.api.models.common.Image> images) {
        this.images = images;
        return this;
    }

    public ProductVariantBuilder plusImages(@Nullable final com.commercetools.api.models.common.Image... images) {
        if (this.images == null) {
            this.images = new ArrayList<>();
        }
        this.images.addAll(Arrays.asList(images));
        return this;
    }

    public ProductVariantBuilder plusImages(
            Function<com.commercetools.api.models.common.ImageBuilder, com.commercetools.api.models.common.ImageBuilder> builder) {
        if (this.images == null) {
            this.images = new ArrayList<>();
        }
        this.images.add(builder.apply(com.commercetools.api.models.common.ImageBuilder.of()).build());
        return this;
    }

    public ProductVariantBuilder withImages(
            Function<com.commercetools.api.models.common.ImageBuilder, com.commercetools.api.models.common.ImageBuilder> builder) {
        this.images = new ArrayList<>();
        this.images.add(builder.apply(com.commercetools.api.models.common.ImageBuilder.of()).build());
        return this;
    }

    public ProductVariantBuilder assets(@Nullable final com.commercetools.api.models.common.Asset... assets) {
        this.assets = new ArrayList<>(Arrays.asList(assets));
        return this;
    }

    public ProductVariantBuilder assets(
            @Nullable final java.util.List<com.commercetools.api.models.common.Asset> assets) {
        this.assets = assets;
        return this;
    }

    public ProductVariantBuilder plusAssets(@Nullable final com.commercetools.api.models.common.Asset... assets) {
        if (this.assets == null) {
            this.assets = new ArrayList<>();
        }
        this.assets.addAll(Arrays.asList(assets));
        return this;
    }

    public ProductVariantBuilder plusAssets(
            Function<com.commercetools.api.models.common.AssetBuilder, com.commercetools.api.models.common.AssetBuilder> builder) {
        if (this.assets == null) {
            this.assets = new ArrayList<>();
        }
        this.assets.add(builder.apply(com.commercetools.api.models.common.AssetBuilder.of()).build());
        return this;
    }

    public ProductVariantBuilder withAssets(
            Function<com.commercetools.api.models.common.AssetBuilder, com.commercetools.api.models.common.AssetBuilder> builder) {
        this.assets = new ArrayList<>();
        this.assets.add(builder.apply(com.commercetools.api.models.common.AssetBuilder.of()).build());
        return this;
    }

    public ProductVariantBuilder availability(
            Function<com.commercetools.api.models.product.ProductVariantAvailabilityBuilder, com.commercetools.api.models.product.ProductVariantAvailabilityBuilder> builder) {
        this.availability = builder.apply(com.commercetools.api.models.product.ProductVariantAvailabilityBuilder.of())
                .build();
        return this;
    }

    public ProductVariantBuilder availability(
            @Nullable final com.commercetools.api.models.product.ProductVariantAvailability availability) {
        this.availability = availability;
        return this;
    }

    public ProductVariantBuilder isMatchingVariant(@Nullable final Boolean isMatchingVariant) {
        this.isMatchingVariant = isMatchingVariant;
        return this;
    }

    public ProductVariantBuilder scopedPrice(
            Function<com.commercetools.api.models.common.ScopedPriceBuilder, com.commercetools.api.models.common.ScopedPriceBuilder> builder) {
        this.scopedPrice = builder.apply(com.commercetools.api.models.common.ScopedPriceBuilder.of()).build();
        return this;
    }

    public ProductVariantBuilder scopedPrice(
            @Nullable final com.commercetools.api.models.common.ScopedPrice scopedPrice) {
        this.scopedPrice = scopedPrice;
        return this;
    }

    public ProductVariantBuilder scopedPriceDiscounted(@Nullable final Boolean scopedPriceDiscounted) {
        this.scopedPriceDiscounted = scopedPriceDiscounted;
        return this;
    }

    public Long getId() {
        return this.id;
    }

    @Nullable
    public String getSku() {
        return this.sku;
    }

    @Nullable
    public String getKey() {
        return this.key;
    }

    @Nullable
    public java.util.List<com.commercetools.api.models.common.Price> getPrices() {
        return this.prices;
    }

    @Nullable
    public java.util.List<com.commercetools.api.models.product.Attribute> getAttributes() {
        return this.attributes;
    }

    @Nullable
    public com.commercetools.api.models.common.Price getPrice() {
        return this.price;
    }

    @Nullable
    public java.util.List<com.commercetools.api.models.common.Image> getImages() {
        return this.images;
    }

    @Nullable
    public java.util.List<com.commercetools.api.models.common.Asset> getAssets() {
        return this.assets;
    }

    @Nullable
    public com.commercetools.api.models.product.ProductVariantAvailability getAvailability() {
        return this.availability;
    }

    @Nullable
    public Boolean getIsMatchingVariant() {
        return this.isMatchingVariant;
    }

    @Nullable
    public com.commercetools.api.models.common.ScopedPrice getScopedPrice() {
        return this.scopedPrice;
    }

    @Nullable
    public Boolean getScopedPriceDiscounted() {
        return this.scopedPriceDiscounted;
    }

    public ProductVariant build() {
        Objects.requireNonNull(id, ProductVariant.class + ": id is missing");
        return new ProductVariantImpl(id, sku, key, prices, attributes, price, images, assets, availability,
            isMatchingVariant, scopedPrice, scopedPriceDiscounted);
    }

    /**
     * builds ProductVariant without checking for non null required values
     */
    public ProductVariant buildUnchecked() {
        return new ProductVariantImpl(id, sku, key, prices, attributes, price, images, assets, availability,
            isMatchingVariant, scopedPrice, scopedPriceDiscounted);
    }

    public static ProductVariantBuilder of() {
        return new ProductVariantBuilder();
    }

    public static ProductVariantBuilder of(final ProductVariant template) {
        ProductVariantBuilder builder = new ProductVariantBuilder();
        builder.id = template.getId();
        builder.sku = template.getSku();
        builder.key = template.getKey();
        builder.prices = template.getPrices();
        builder.attributes = template.getAttributes();
        builder.price = template.getPrice();
        builder.images = template.getImages();
        builder.assets = template.getAssets();
        builder.availability = template.getAvailability();
        builder.isMatchingVariant = template.getIsMatchingVariant();
        builder.scopedPrice = template.getScopedPrice();
        builder.scopedPriceDiscounted = template.getScopedPriceDiscounted();
        return builder;
    }

}
