
package com.commercetools.api.models.product;

import java.time.*;
import java.util.*;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.ModelBase;
import io.vrap.rmf.base.client.utils.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 *  <p>A concrete sellable good for which inventory can be tracked. Product Variants are generally mapped to specific SKUs.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ProductVariantImpl implements ProductVariant, ModelBase {

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

    private java.util.List<com.commercetools.api.models.common.Price> recurrencePrices;

    /**
     * create instance with all properties
     */
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
            @JsonProperty("scopedPriceDiscounted") final Boolean scopedPriceDiscounted,
            @JsonProperty("recurrencePrices") final java.util.List<com.commercetools.api.models.common.Price> recurrencePrices) {
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
        this.recurrencePrices = recurrencePrices;
    }

    /**
     * create empty instance
     */
    public ProductVariantImpl() {
    }

    /**
     *  <p>A unique, sequential identifier of the Product Variant within the Product.</p>
     */

    public Long getId() {
        return this.id;
    }

    /**
     *  <p>User-defined unique SKU of the Product Variant.</p>
     */

    public String getSku() {
        return this.sku;
    }

    /**
     *  <p>User-defined unique identifier of the ProductVariant.</p>
     *  <p>This is different from Product <code>key</code>.</p>
     */

    public String getKey() {
        return this.key;
    }

    /**
     *  <p>The Embedded Prices of the Product Variant. Cannot contain two Prices of the same Price scope (with same currency, country, Customer Group, Channel, <code>validFrom</code> and <code>validUntil</code>).</p>
     */

    public java.util.List<com.commercetools.api.models.common.Price> getPrices() {
        return this.prices;
    }

    /**
     *  <p>Variant Attributes according to the respective AttributeDefinition.</p>
     */

    public java.util.List<com.commercetools.api.models.product.Attribute> getAttributes() {
        return this.attributes;
    }

    /**
     *  <p>Only available when price selection is used. Cannot be used in a Query Predicate.</p>
     */

    public com.commercetools.api.models.common.Price getPrice() {
        return this.price;
    }

    /**
     *  <p>Images of the Product Variant.</p>
     */

    public java.util.List<com.commercetools.api.models.common.Image> getImages() {
        return this.images;
    }

    /**
     *  <p>Media assets of the Product Variant.</p>
     */

    public java.util.List<com.commercetools.api.models.common.Asset> getAssets() {
        return this.assets;
    }

    /**
     *  <p>Set if the Product Variant is tracked by Inventory. Can be used as an optimization to reduce calls to the Inventory service. May not contain the latest Inventory State (it is eventually consistent).</p>
     */

    public com.commercetools.api.models.product.ProductVariantAvailability getAvailability() {
        return this.availability;
    }

    /**
     *  <p><code>true</code> if the Product Variant matches the search query. Only available in response to a Product Projection Search request.</p>
     */

    public Boolean getIsMatchingVariant() {
        return this.isMatchingVariant;
    }

    /**
     *  <p>Only available in response to a Product Projection Search request with Product price selection. Can be used to sort, filter, and facet.</p>
     */

    public com.commercetools.api.models.common.ScopedPrice getScopedPrice() {
        return this.scopedPrice;
    }

    /**
     *  <p>Only available in response to a Product Projection Search request with Product price selection.</p>
     */

    public Boolean getScopedPriceDiscounted() {
        return this.scopedPriceDiscounted;
    }

    /**
     *  <p>Only available when Product price selection is used. Cannot be used in a Query Predicate.</p>
     */

    public java.util.List<com.commercetools.api.models.common.Price> getRecurrencePrices() {
        return this.recurrencePrices;
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

    public void setRecurrencePrices(final com.commercetools.api.models.common.Price... recurrencePrices) {
        this.recurrencePrices = new ArrayList<>(Arrays.asList(recurrencePrices));
    }

    public void setRecurrencePrices(final java.util.List<com.commercetools.api.models.common.Price> recurrencePrices) {
        this.recurrencePrices = recurrencePrices;
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
                .append(recurrencePrices, that.recurrencePrices)
                .append(id, that.id)
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
                .append(recurrencePrices, that.recurrencePrices)
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
                .append(recurrencePrices)
                .toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("id", id)
                .append("sku", sku)
                .append("key", key)
                .append("prices", prices)
                .append("attributes", attributes)
                .append("price", price)
                .append("images", images)
                .append("assets", assets)
                .append("availability", availability)
                .append("isMatchingVariant", isMatchingVariant)
                .append("scopedPrice", scopedPrice)
                .append("scopedPriceDiscounted", scopedPriceDiscounted)
                .append("recurrencePrices", recurrencePrices)
                .build();
    }

    @Override
    public ProductVariant copyDeep() {
        return ProductVariant.deepCopy(this);
    }
}
