
package com.commercetools.api.models.product;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ProductVariantBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductVariant productVariant = ProductVariant.builder()
 *             .id(0.3)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
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

    @Nullable
    private java.util.List<com.commercetools.api.models.common.Price> recurrencePrices;

    /**
     *  <p>A unique, sequential identifier of the Product Variant within the Product.</p>
     * @param id value to be set
     * @return Builder
     */

    public ProductVariantBuilder id(final Long id) {
        this.id = id;
        return this;
    }

    /**
     *  <p>User-defined unique SKU of the Product Variant.</p>
     * @param sku value to be set
     * @return Builder
     */

    public ProductVariantBuilder sku(@Nullable final String sku) {
        this.sku = sku;
        return this;
    }

    /**
     *  <p>User-defined unique identifier of the ProductVariant.</p>
     *  <p>This is different from Product <code>key</code>.</p>
     * @param key value to be set
     * @return Builder
     */

    public ProductVariantBuilder key(@Nullable final String key) {
        this.key = key;
        return this;
    }

    /**
     *  <p>The Embedded Prices of the Product Variant. Cannot contain two Prices of the same Price scope (with same currency, country, Customer Group, Channel, <code>validFrom</code> and <code>validUntil</code>).</p>
     * @param prices value to be set
     * @return Builder
     */

    public ProductVariantBuilder prices(@Nullable final com.commercetools.api.models.common.Price... prices) {
        this.prices = new ArrayList<>(Arrays.asList(prices));
        return this;
    }

    /**
     *  <p>The Embedded Prices of the Product Variant. Cannot contain two Prices of the same Price scope (with same currency, country, Customer Group, Channel, <code>validFrom</code> and <code>validUntil</code>).</p>
     * @param prices value to be set
     * @return Builder
     */

    public ProductVariantBuilder prices(
            @Nullable final java.util.List<com.commercetools.api.models.common.Price> prices) {
        this.prices = prices;
        return this;
    }

    /**
     *  <p>The Embedded Prices of the Product Variant. Cannot contain two Prices of the same Price scope (with same currency, country, Customer Group, Channel, <code>validFrom</code> and <code>validUntil</code>).</p>
     * @param prices value to be set
     * @return Builder
     */

    public ProductVariantBuilder plusPrices(@Nullable final com.commercetools.api.models.common.Price... prices) {
        if (this.prices == null) {
            this.prices = new ArrayList<>();
        }
        this.prices.addAll(Arrays.asList(prices));
        return this;
    }

    /**
     *  <p>The Embedded Prices of the Product Variant. Cannot contain two Prices of the same Price scope (with same currency, country, Customer Group, Channel, <code>validFrom</code> and <code>validUntil</code>).</p>
     * @param builder function to build the prices value
     * @return Builder
     */

    public ProductVariantBuilder plusPrices(
            Function<com.commercetools.api.models.common.PriceBuilder, com.commercetools.api.models.common.PriceBuilder> builder) {
        if (this.prices == null) {
            this.prices = new ArrayList<>();
        }
        this.prices.add(builder.apply(com.commercetools.api.models.common.PriceBuilder.of()).build());
        return this;
    }

    /**
     *  <p>The Embedded Prices of the Product Variant. Cannot contain two Prices of the same Price scope (with same currency, country, Customer Group, Channel, <code>validFrom</code> and <code>validUntil</code>).</p>
     * @param builder function to build the prices value
     * @return Builder
     */

    public ProductVariantBuilder withPrices(
            Function<com.commercetools.api.models.common.PriceBuilder, com.commercetools.api.models.common.PriceBuilder> builder) {
        this.prices = new ArrayList<>();
        this.prices.add(builder.apply(com.commercetools.api.models.common.PriceBuilder.of()).build());
        return this;
    }

    /**
     *  <p>The Embedded Prices of the Product Variant. Cannot contain two Prices of the same Price scope (with same currency, country, Customer Group, Channel, <code>validFrom</code> and <code>validUntil</code>).</p>
     * @param builder function to build the prices value
     * @return Builder
     */

    public ProductVariantBuilder addPrices(
            Function<com.commercetools.api.models.common.PriceBuilder, com.commercetools.api.models.common.Price> builder) {
        return plusPrices(builder.apply(com.commercetools.api.models.common.PriceBuilder.of()));
    }

    /**
     *  <p>The Embedded Prices of the Product Variant. Cannot contain two Prices of the same Price scope (with same currency, country, Customer Group, Channel, <code>validFrom</code> and <code>validUntil</code>).</p>
     * @param builder function to build the prices value
     * @return Builder
     */

    public ProductVariantBuilder setPrices(
            Function<com.commercetools.api.models.common.PriceBuilder, com.commercetools.api.models.common.Price> builder) {
        return prices(builder.apply(com.commercetools.api.models.common.PriceBuilder.of()));
    }

    /**
     *  <p>Attributes of the Product Variant.</p>
     * @param attributes value to be set
     * @return Builder
     */

    public ProductVariantBuilder attributes(
            @Nullable final com.commercetools.api.models.product.Attribute... attributes) {
        this.attributes = new ArrayList<>(Arrays.asList(attributes));
        return this;
    }

    /**
     *  <p>Attributes of the Product Variant.</p>
     * @param attributes value to be set
     * @return Builder
     */

    public ProductVariantBuilder attributes(
            @Nullable final java.util.List<com.commercetools.api.models.product.Attribute> attributes) {
        this.attributes = attributes;
        return this;
    }

    /**
     *  <p>Attributes of the Product Variant.</p>
     * @param attributes value to be set
     * @return Builder
     */

    public ProductVariantBuilder plusAttributes(
            @Nullable final com.commercetools.api.models.product.Attribute... attributes) {
        if (this.attributes == null) {
            this.attributes = new ArrayList<>();
        }
        this.attributes.addAll(Arrays.asList(attributes));
        return this;
    }

    /**
     *  <p>Attributes of the Product Variant.</p>
     * @param builder function to build the attributes value
     * @return Builder
     */

    public ProductVariantBuilder plusAttributes(
            Function<com.commercetools.api.models.product.AttributeBuilder, com.commercetools.api.models.product.AttributeBuilder> builder) {
        if (this.attributes == null) {
            this.attributes = new ArrayList<>();
        }
        this.attributes.add(builder.apply(com.commercetools.api.models.product.AttributeBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Attributes of the Product Variant.</p>
     * @param builder function to build the attributes value
     * @return Builder
     */

    public ProductVariantBuilder withAttributes(
            Function<com.commercetools.api.models.product.AttributeBuilder, com.commercetools.api.models.product.AttributeBuilder> builder) {
        this.attributes = new ArrayList<>();
        this.attributes.add(builder.apply(com.commercetools.api.models.product.AttributeBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Attributes of the Product Variant.</p>
     * @param builder function to build the attributes value
     * @return Builder
     */

    public ProductVariantBuilder addAttributes(
            Function<com.commercetools.api.models.product.AttributeBuilder, com.commercetools.api.models.product.Attribute> builder) {
        return plusAttributes(builder.apply(com.commercetools.api.models.product.AttributeBuilder.of()));
    }

    /**
     *  <p>Attributes of the Product Variant.</p>
     * @param builder function to build the attributes value
     * @return Builder
     */

    public ProductVariantBuilder setAttributes(
            Function<com.commercetools.api.models.product.AttributeBuilder, com.commercetools.api.models.product.Attribute> builder) {
        return attributes(builder.apply(com.commercetools.api.models.product.AttributeBuilder.of()));
    }

    /**
     *  <p>Only available when price selection is used. Cannot be used in a Query Predicate.</p>
     * @param builder function to build the price value
     * @return Builder
     */

    public ProductVariantBuilder price(
            Function<com.commercetools.api.models.common.PriceBuilder, com.commercetools.api.models.common.PriceBuilder> builder) {
        this.price = builder.apply(com.commercetools.api.models.common.PriceBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Only available when price selection is used. Cannot be used in a Query Predicate.</p>
     * @param builder function to build the price value
     * @return Builder
     */

    public ProductVariantBuilder withPrice(
            Function<com.commercetools.api.models.common.PriceBuilder, com.commercetools.api.models.common.Price> builder) {
        this.price = builder.apply(com.commercetools.api.models.common.PriceBuilder.of());
        return this;
    }

    /**
     *  <p>Only available when price selection is used. Cannot be used in a Query Predicate.</p>
     * @param price value to be set
     * @return Builder
     */

    public ProductVariantBuilder price(@Nullable final com.commercetools.api.models.common.Price price) {
        this.price = price;
        return this;
    }

    /**
     *  <p>Images of the Product Variant.</p>
     * @param images value to be set
     * @return Builder
     */

    public ProductVariantBuilder images(@Nullable final com.commercetools.api.models.common.Image... images) {
        this.images = new ArrayList<>(Arrays.asList(images));
        return this;
    }

    /**
     *  <p>Images of the Product Variant.</p>
     * @param images value to be set
     * @return Builder
     */

    public ProductVariantBuilder images(
            @Nullable final java.util.List<com.commercetools.api.models.common.Image> images) {
        this.images = images;
        return this;
    }

    /**
     *  <p>Images of the Product Variant.</p>
     * @param images value to be set
     * @return Builder
     */

    public ProductVariantBuilder plusImages(@Nullable final com.commercetools.api.models.common.Image... images) {
        if (this.images == null) {
            this.images = new ArrayList<>();
        }
        this.images.addAll(Arrays.asList(images));
        return this;
    }

    /**
     *  <p>Images of the Product Variant.</p>
     * @param builder function to build the images value
     * @return Builder
     */

    public ProductVariantBuilder plusImages(
            Function<com.commercetools.api.models.common.ImageBuilder, com.commercetools.api.models.common.ImageBuilder> builder) {
        if (this.images == null) {
            this.images = new ArrayList<>();
        }
        this.images.add(builder.apply(com.commercetools.api.models.common.ImageBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Images of the Product Variant.</p>
     * @param builder function to build the images value
     * @return Builder
     */

    public ProductVariantBuilder withImages(
            Function<com.commercetools.api.models.common.ImageBuilder, com.commercetools.api.models.common.ImageBuilder> builder) {
        this.images = new ArrayList<>();
        this.images.add(builder.apply(com.commercetools.api.models.common.ImageBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Images of the Product Variant.</p>
     * @param builder function to build the images value
     * @return Builder
     */

    public ProductVariantBuilder addImages(
            Function<com.commercetools.api.models.common.ImageBuilder, com.commercetools.api.models.common.Image> builder) {
        return plusImages(builder.apply(com.commercetools.api.models.common.ImageBuilder.of()));
    }

    /**
     *  <p>Images of the Product Variant.</p>
     * @param builder function to build the images value
     * @return Builder
     */

    public ProductVariantBuilder setImages(
            Function<com.commercetools.api.models.common.ImageBuilder, com.commercetools.api.models.common.Image> builder) {
        return images(builder.apply(com.commercetools.api.models.common.ImageBuilder.of()));
    }

    /**
     *  <p>Media assets of the Product Variant.</p>
     * @param assets value to be set
     * @return Builder
     */

    public ProductVariantBuilder assets(@Nullable final com.commercetools.api.models.common.Asset... assets) {
        this.assets = new ArrayList<>(Arrays.asList(assets));
        return this;
    }

    /**
     *  <p>Media assets of the Product Variant.</p>
     * @param assets value to be set
     * @return Builder
     */

    public ProductVariantBuilder assets(
            @Nullable final java.util.List<com.commercetools.api.models.common.Asset> assets) {
        this.assets = assets;
        return this;
    }

    /**
     *  <p>Media assets of the Product Variant.</p>
     * @param assets value to be set
     * @return Builder
     */

    public ProductVariantBuilder plusAssets(@Nullable final com.commercetools.api.models.common.Asset... assets) {
        if (this.assets == null) {
            this.assets = new ArrayList<>();
        }
        this.assets.addAll(Arrays.asList(assets));
        return this;
    }

    /**
     *  <p>Media assets of the Product Variant.</p>
     * @param builder function to build the assets value
     * @return Builder
     */

    public ProductVariantBuilder plusAssets(
            Function<com.commercetools.api.models.common.AssetBuilder, com.commercetools.api.models.common.AssetBuilder> builder) {
        if (this.assets == null) {
            this.assets = new ArrayList<>();
        }
        this.assets.add(builder.apply(com.commercetools.api.models.common.AssetBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Media assets of the Product Variant.</p>
     * @param builder function to build the assets value
     * @return Builder
     */

    public ProductVariantBuilder withAssets(
            Function<com.commercetools.api.models.common.AssetBuilder, com.commercetools.api.models.common.AssetBuilder> builder) {
        this.assets = new ArrayList<>();
        this.assets.add(builder.apply(com.commercetools.api.models.common.AssetBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Media assets of the Product Variant.</p>
     * @param builder function to build the assets value
     * @return Builder
     */

    public ProductVariantBuilder addAssets(
            Function<com.commercetools.api.models.common.AssetBuilder, com.commercetools.api.models.common.Asset> builder) {
        return plusAssets(builder.apply(com.commercetools.api.models.common.AssetBuilder.of()));
    }

    /**
     *  <p>Media assets of the Product Variant.</p>
     * @param builder function to build the assets value
     * @return Builder
     */

    public ProductVariantBuilder setAssets(
            Function<com.commercetools.api.models.common.AssetBuilder, com.commercetools.api.models.common.Asset> builder) {
        return assets(builder.apply(com.commercetools.api.models.common.AssetBuilder.of()));
    }

    /**
     *  <p>Set if the Product Variant is tracked by Inventory. Can be used as an optimization to reduce calls to the Inventory service. May not contain the latest Inventory State (it is eventually consistent).</p>
     * @param builder function to build the availability value
     * @return Builder
     */

    public ProductVariantBuilder availability(
            Function<com.commercetools.api.models.product.ProductVariantAvailabilityBuilder, com.commercetools.api.models.product.ProductVariantAvailabilityBuilder> builder) {
        this.availability = builder.apply(com.commercetools.api.models.product.ProductVariantAvailabilityBuilder.of())
                .build();
        return this;
    }

    /**
     *  <p>Set if the Product Variant is tracked by Inventory. Can be used as an optimization to reduce calls to the Inventory service. May not contain the latest Inventory State (it is eventually consistent).</p>
     * @param builder function to build the availability value
     * @return Builder
     */

    public ProductVariantBuilder withAvailability(
            Function<com.commercetools.api.models.product.ProductVariantAvailabilityBuilder, com.commercetools.api.models.product.ProductVariantAvailability> builder) {
        this.availability = builder.apply(com.commercetools.api.models.product.ProductVariantAvailabilityBuilder.of());
        return this;
    }

    /**
     *  <p>Set if the Product Variant is tracked by Inventory. Can be used as an optimization to reduce calls to the Inventory service. May not contain the latest Inventory State (it is eventually consistent).</p>
     * @param availability value to be set
     * @return Builder
     */

    public ProductVariantBuilder availability(
            @Nullable final com.commercetools.api.models.product.ProductVariantAvailability availability) {
        this.availability = availability;
        return this;
    }

    /**
     *  <p><code>true</code> if the Product Variant matches the search query. Only available in response to a Product Projection Search request.</p>
     * @param isMatchingVariant value to be set
     * @return Builder
     */

    public ProductVariantBuilder isMatchingVariant(@Nullable final Boolean isMatchingVariant) {
        this.isMatchingVariant = isMatchingVariant;
        return this;
    }

    /**
     *  <p>Only available in response to a Product Projection Search request with Product price selection. Can be used to sort, filter, and facet.</p>
     * @param builder function to build the scopedPrice value
     * @return Builder
     */

    public ProductVariantBuilder scopedPrice(
            Function<com.commercetools.api.models.common.ScopedPriceBuilder, com.commercetools.api.models.common.ScopedPriceBuilder> builder) {
        this.scopedPrice = builder.apply(com.commercetools.api.models.common.ScopedPriceBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Only available in response to a Product Projection Search request with Product price selection. Can be used to sort, filter, and facet.</p>
     * @param builder function to build the scopedPrice value
     * @return Builder
     */

    public ProductVariantBuilder withScopedPrice(
            Function<com.commercetools.api.models.common.ScopedPriceBuilder, com.commercetools.api.models.common.ScopedPrice> builder) {
        this.scopedPrice = builder.apply(com.commercetools.api.models.common.ScopedPriceBuilder.of());
        return this;
    }

    /**
     *  <p>Only available in response to a Product Projection Search request with Product price selection. Can be used to sort, filter, and facet.</p>
     * @param scopedPrice value to be set
     * @return Builder
     */

    public ProductVariantBuilder scopedPrice(
            @Nullable final com.commercetools.api.models.common.ScopedPrice scopedPrice) {
        this.scopedPrice = scopedPrice;
        return this;
    }

    /**
     *  <p>Only available in response to a Product Projection Search request with Product price selection.</p>
     * @param scopedPriceDiscounted value to be set
     * @return Builder
     */

    public ProductVariantBuilder scopedPriceDiscounted(@Nullable final Boolean scopedPriceDiscounted) {
        this.scopedPriceDiscounted = scopedPriceDiscounted;
        return this;
    }

    /**
     *  <p>Only available when Product price selection is used. Cannot be used in a Query Predicate.</p>
     * @param recurrencePrices value to be set
     * @return Builder
     */

    public ProductVariantBuilder recurrencePrices(
            @Nullable final com.commercetools.api.models.common.Price... recurrencePrices) {
        this.recurrencePrices = new ArrayList<>(Arrays.asList(recurrencePrices));
        return this;
    }

    /**
     *  <p>Only available when Product price selection is used. Cannot be used in a Query Predicate.</p>
     * @param recurrencePrices value to be set
     * @return Builder
     */

    public ProductVariantBuilder recurrencePrices(
            @Nullable final java.util.List<com.commercetools.api.models.common.Price> recurrencePrices) {
        this.recurrencePrices = recurrencePrices;
        return this;
    }

    /**
     *  <p>Only available when Product price selection is used. Cannot be used in a Query Predicate.</p>
     * @param recurrencePrices value to be set
     * @return Builder
     */

    public ProductVariantBuilder plusRecurrencePrices(
            @Nullable final com.commercetools.api.models.common.Price... recurrencePrices) {
        if (this.recurrencePrices == null) {
            this.recurrencePrices = new ArrayList<>();
        }
        this.recurrencePrices.addAll(Arrays.asList(recurrencePrices));
        return this;
    }

    /**
     *  <p>Only available when Product price selection is used. Cannot be used in a Query Predicate.</p>
     * @param builder function to build the recurrencePrices value
     * @return Builder
     */

    public ProductVariantBuilder plusRecurrencePrices(
            Function<com.commercetools.api.models.common.PriceBuilder, com.commercetools.api.models.common.PriceBuilder> builder) {
        if (this.recurrencePrices == null) {
            this.recurrencePrices = new ArrayList<>();
        }
        this.recurrencePrices.add(builder.apply(com.commercetools.api.models.common.PriceBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Only available when Product price selection is used. Cannot be used in a Query Predicate.</p>
     * @param builder function to build the recurrencePrices value
     * @return Builder
     */

    public ProductVariantBuilder withRecurrencePrices(
            Function<com.commercetools.api.models.common.PriceBuilder, com.commercetools.api.models.common.PriceBuilder> builder) {
        this.recurrencePrices = new ArrayList<>();
        this.recurrencePrices.add(builder.apply(com.commercetools.api.models.common.PriceBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Only available when Product price selection is used. Cannot be used in a Query Predicate.</p>
     * @param builder function to build the recurrencePrices value
     * @return Builder
     */

    public ProductVariantBuilder addRecurrencePrices(
            Function<com.commercetools.api.models.common.PriceBuilder, com.commercetools.api.models.common.Price> builder) {
        return plusRecurrencePrices(builder.apply(com.commercetools.api.models.common.PriceBuilder.of()));
    }

    /**
     *  <p>Only available when Product price selection is used. Cannot be used in a Query Predicate.</p>
     * @param builder function to build the recurrencePrices value
     * @return Builder
     */

    public ProductVariantBuilder setRecurrencePrices(
            Function<com.commercetools.api.models.common.PriceBuilder, com.commercetools.api.models.common.Price> builder) {
        return recurrencePrices(builder.apply(com.commercetools.api.models.common.PriceBuilder.of()));
    }

    /**
     *  <p>A unique, sequential identifier of the Product Variant within the Product.</p>
     * @return id
     */

    public Long getId() {
        return this.id;
    }

    /**
     *  <p>User-defined unique SKU of the Product Variant.</p>
     * @return sku
     */

    @Nullable
    public String getSku() {
        return this.sku;
    }

    /**
     *  <p>User-defined unique identifier of the ProductVariant.</p>
     *  <p>This is different from Product <code>key</code>.</p>
     * @return key
     */

    @Nullable
    public String getKey() {
        return this.key;
    }

    /**
     *  <p>The Embedded Prices of the Product Variant. Cannot contain two Prices of the same Price scope (with same currency, country, Customer Group, Channel, <code>validFrom</code> and <code>validUntil</code>).</p>
     * @return prices
     */

    @Nullable
    public java.util.List<com.commercetools.api.models.common.Price> getPrices() {
        return this.prices;
    }

    /**
     *  <p>Attributes of the Product Variant.</p>
     * @return attributes
     */

    @Nullable
    public java.util.List<com.commercetools.api.models.product.Attribute> getAttributes() {
        return this.attributes;
    }

    /**
     *  <p>Only available when price selection is used. Cannot be used in a Query Predicate.</p>
     * @return price
     */

    @Nullable
    public com.commercetools.api.models.common.Price getPrice() {
        return this.price;
    }

    /**
     *  <p>Images of the Product Variant.</p>
     * @return images
     */

    @Nullable
    public java.util.List<com.commercetools.api.models.common.Image> getImages() {
        return this.images;
    }

    /**
     *  <p>Media assets of the Product Variant.</p>
     * @return assets
     */

    @Nullable
    public java.util.List<com.commercetools.api.models.common.Asset> getAssets() {
        return this.assets;
    }

    /**
     *  <p>Set if the Product Variant is tracked by Inventory. Can be used as an optimization to reduce calls to the Inventory service. May not contain the latest Inventory State (it is eventually consistent).</p>
     * @return availability
     */

    @Nullable
    public com.commercetools.api.models.product.ProductVariantAvailability getAvailability() {
        return this.availability;
    }

    /**
     *  <p><code>true</code> if the Product Variant matches the search query. Only available in response to a Product Projection Search request.</p>
     * @return isMatchingVariant
     */

    @Nullable
    public Boolean getIsMatchingVariant() {
        return this.isMatchingVariant;
    }

    /**
     *  <p>Only available in response to a Product Projection Search request with Product price selection. Can be used to sort, filter, and facet.</p>
     * @return scopedPrice
     */

    @Nullable
    public com.commercetools.api.models.common.ScopedPrice getScopedPrice() {
        return this.scopedPrice;
    }

    /**
     *  <p>Only available in response to a Product Projection Search request with Product price selection.</p>
     * @return scopedPriceDiscounted
     */

    @Nullable
    public Boolean getScopedPriceDiscounted() {
        return this.scopedPriceDiscounted;
    }

    /**
     *  <p>Only available when Product price selection is used. Cannot be used in a Query Predicate.</p>
     * @return recurrencePrices
     */

    @Nullable
    public java.util.List<com.commercetools.api.models.common.Price> getRecurrencePrices() {
        return this.recurrencePrices;
    }

    /**
     * builds ProductVariant with checking for non-null required values
     * @return ProductVariant
     */
    public ProductVariant build() {
        Objects.requireNonNull(id, ProductVariant.class + ": id is missing");
        return new ProductVariantImpl(id, sku, key, prices, attributes, price, images, assets, availability,
            isMatchingVariant, scopedPrice, scopedPriceDiscounted, recurrencePrices);
    }

    /**
     * builds ProductVariant without checking for non-null required values
     * @return ProductVariant
     */
    public ProductVariant buildUnchecked() {
        return new ProductVariantImpl(id, sku, key, prices, attributes, price, images, assets, availability,
            isMatchingVariant, scopedPrice, scopedPriceDiscounted, recurrencePrices);
    }

    /**
     * factory method for an instance of ProductVariantBuilder
     * @return builder
     */
    public static ProductVariantBuilder of() {
        return new ProductVariantBuilder();
    }

    /**
     * create builder for ProductVariant instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
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
        builder.recurrencePrices = template.getRecurrencePrices();
        return builder;
    }

}
