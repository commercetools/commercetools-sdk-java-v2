
package com.commercetools.api.models.product;

import java.time.*;
import java.util.*;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class ProductVariantImpl implements ProductVariant {

    private Long id;

    private String sku;

    private String key;

    private java.util.List<com.commercetools.api.models.common.Price> prices;

    private java.util.List<com.commercetools.api.models.product.Attribute> attributes;

    private com.commercetools.api.models.common.Price price;

    private java.util.List<com.commercetools.api.models.common.Image> images;

    private java.util.List<com.commercetools.api.models.common.Asset> assets;

    private com.commercetools.api.models.product.ProductVariantAvailability availability;

    private Boolean isMatchingVariant;

    private com.commercetools.api.models.common.ScopedPrice scopedPrice;

    private Boolean scopedPriceDiscounted;

    @JsonCreator
    ProductVariantImpl(@JsonProperty("id") final Long id, @JsonProperty("sku") final String sku,
            @JsonProperty("key") final String key,
            @JsonProperty("prices") final java.util.List<com.commercetools.api.models.common.Price> prices,
            @JsonProperty("attributes") final java.util.List<com.commercetools.api.models.product.Attribute> attributes,
            @JsonProperty("price") final com.commercetools.api.models.common.Price price,
            @JsonProperty("images") final java.util.List<com.commercetools.api.models.common.Image> images,
            @JsonProperty("assets") final java.util.List<com.commercetools.api.models.common.Asset> assets,
            @JsonProperty("availability") final com.commercetools.api.models.product.ProductVariantAvailability availability,
            @JsonProperty("isMatchingVariant") final Boolean isMatchingVariant,
            @JsonProperty("scopedPrice") final com.commercetools.api.models.common.ScopedPrice scopedPrice,
            @JsonProperty("scopedPriceDiscounted") final Boolean scopedPriceDiscounted) {
        this.id = id;
        this.sku = sku;
        this.key = key;
        this.prices = prices;
        this.attributes = attributes;
        this.price = price;
        this.images = images;
        this.assets = assets;
        this.availability = availability;
        this.isMatchingVariant = isMatchingVariant;
        this.scopedPrice = scopedPrice;
        this.scopedPriceDiscounted = scopedPriceDiscounted;
    }

    public ProductVariantImpl() {
    }

    public Long getId() {
        return this.id;
    }

    public String getSku() {
        return this.sku;
    }

    public String getKey() {
        return this.key;
    }

    public java.util.List<com.commercetools.api.models.common.Price> getPrices() {
        return this.prices;
    }

    public java.util.List<com.commercetools.api.models.product.Attribute> getAttributes() {
        return this.attributes;
    }

    public com.commercetools.api.models.common.Price getPrice() {
        return this.price;
    }

    public java.util.List<com.commercetools.api.models.common.Image> getImages() {
        return this.images;
    }

    public java.util.List<com.commercetools.api.models.common.Asset> getAssets() {
        return this.assets;
    }

    public com.commercetools.api.models.product.ProductVariantAvailability getAvailability() {
        return this.availability;
    }

    public Boolean getIsMatchingVariant() {
        return this.isMatchingVariant;
    }

    public com.commercetools.api.models.common.ScopedPrice getScopedPrice() {
        return this.scopedPrice;
    }

    public Boolean getScopedPriceDiscounted() {
        return this.scopedPriceDiscounted;
    }

    public void setId(final Long id) {
        this.id = id;
    }

    public void setSku(final String sku) {
        this.sku = sku;
    }

    public void setKey(final String key) {
        this.key = key;
    }

    public void setPrices(final com.commercetools.api.models.common.Price... prices) {
        this.prices = new ArrayList<>(Arrays.asList(prices));
    }

    public void setPrices(final java.util.List<com.commercetools.api.models.common.Price> prices) {
        this.prices = prices;
    }

    public void setAttributes(final com.commercetools.api.models.product.Attribute... attributes) {
        this.attributes = new ArrayList<>(Arrays.asList(attributes));
    }

    public void setAttributes(final java.util.List<com.commercetools.api.models.product.Attribute> attributes) {
        this.attributes = attributes;
    }

    public void setPrice(final com.commercetools.api.models.common.Price price) {
        this.price = price;
    }

    public void setImages(final com.commercetools.api.models.common.Image... images) {
        this.images = new ArrayList<>(Arrays.asList(images));
    }

    public void setImages(final java.util.List<com.commercetools.api.models.common.Image> images) {
        this.images = images;
    }

    public void setAssets(final com.commercetools.api.models.common.Asset... assets) {
        this.assets = new ArrayList<>(Arrays.asList(assets));
    }

    public void setAssets(final java.util.List<com.commercetools.api.models.common.Asset> assets) {
        this.assets = assets;
    }

    public void setAvailability(final com.commercetools.api.models.product.ProductVariantAvailability availability) {
        this.availability = availability;
    }

    public void setIsMatchingVariant(final Boolean isMatchingVariant) {
        this.isMatchingVariant = isMatchingVariant;
    }

    public void setScopedPrice(final com.commercetools.api.models.common.ScopedPrice scopedPrice) {
        this.scopedPrice = scopedPrice;
    }

    public void setScopedPriceDiscounted(final Boolean scopedPriceDiscounted) {
        this.scopedPriceDiscounted = scopedPriceDiscounted;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ProductVariantImpl that = (ProductVariantImpl) o;

        return new EqualsBuilder().append(id, that.id)
                .append(sku, that.sku)
                .append(key, that.key)
                .append(prices, that.prices)
                .append(attributes, that.attributes)
                .append(price, that.price)
                .append(images, that.images)
                .append(assets, that.assets)
                .append(availability, that.availability)
                .append(isMatchingVariant, that.isMatchingVariant)
                .append(scopedPrice, that.scopedPrice)
                .append(scopedPriceDiscounted, that.scopedPriceDiscounted)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(id)
                .append(sku)
                .append(key)
                .append(prices)
                .append(attributes)
                .append(price)
                .append(images)
                .append(assets)
                .append(availability)
                .append(isMatchingVariant)
                .append(scopedPrice)
                .append(scopedPriceDiscounted)
                .toHashCode();
    }

}
