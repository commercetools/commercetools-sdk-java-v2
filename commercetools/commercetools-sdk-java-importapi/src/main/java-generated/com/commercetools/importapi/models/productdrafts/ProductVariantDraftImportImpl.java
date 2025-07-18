
package com.commercetools.importapi.models.productdrafts;

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
 *  <p>The representation of a Product Variant Draft for the import purpose.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ProductVariantDraftImportImpl implements ProductVariantDraftImport, ModelBase {

    private String sku;

    private String key;

    private java.util.List<com.commercetools.importapi.models.productdrafts.PriceDraftImport> prices;

    private java.util.List<com.commercetools.importapi.models.productvariants.Attribute> attributes;

    private java.util.List<com.commercetools.importapi.models.common.Image> images;

    private java.util.List<com.commercetools.importapi.models.common.Asset> assets;

    /**
     * create instance with all properties
     */
    @JsonCreator
    ProductVariantDraftImportImpl(@JsonProperty("sku") final String sku, @JsonProperty("key") final String key,
            @JsonProperty("prices") final java.util.List<com.commercetools.importapi.models.productdrafts.PriceDraftImport> prices,
            @JsonProperty("attributes") final java.util.List<com.commercetools.importapi.models.productvariants.Attribute> attributes,
            @JsonProperty("images") final java.util.List<com.commercetools.importapi.models.common.Image> images,
            @JsonProperty("assets") final java.util.List<com.commercetools.importapi.models.common.Asset> assets) {
        this.sku = sku;
        this.key = key;
        this.prices = prices;
        this.attributes = attributes;
        this.images = images;
        this.assets = assets;
    }

    /**
     * create empty instance
     */
    public ProductVariantDraftImportImpl() {
    }

    /**
     *  <p>User-defined unique SKU of the Product Variant.</p>
     */

    public String getSku() {
        return this.sku;
    }

    /**
     *  <p>User-defined unique identifier for the ProductVariant.</p>
     */

    public String getKey() {
        return this.key;
    }

    /**
     *  <p>The Embedded Prices for the Product Variant. Each Price must have its unique Price scope (with same currency, country, Customer Group, Channel, <code>validFrom</code> and <code>validUntil</code>).</p>
     */

    public java.util.List<com.commercetools.importapi.models.productdrafts.PriceDraftImport> getPrices() {
        return this.prices;
    }

    /**
     *  <p>Attributes according to the respective AttributeDefinition.</p>
     */

    public java.util.List<com.commercetools.importapi.models.productvariants.Attribute> getAttributes() {
        return this.attributes;
    }

    /**
     *  <p>Images for the Product Variant.</p>
     */

    public java.util.List<com.commercetools.importapi.models.common.Image> getImages() {
        return this.images;
    }

    /**
     *  <p>Media assets for the Product Variant.</p>
     */

    public java.util.List<com.commercetools.importapi.models.common.Asset> getAssets() {
        return this.assets;
    }

    public void setSku(final String sku) {
        this.sku = sku;
    }

    public void setKey(final String key) {
        this.key = key;
    }

    public void setPrices(final com.commercetools.importapi.models.productdrafts.PriceDraftImport... prices) {
        this.prices = new ArrayList<>(Arrays.asList(prices));
    }

    public void setPrices(
            final java.util.List<com.commercetools.importapi.models.productdrafts.PriceDraftImport> prices) {
        this.prices = prices;
    }

    public void setAttributes(final com.commercetools.importapi.models.productvariants.Attribute... attributes) {
        this.attributes = new ArrayList<>(Arrays.asList(attributes));
    }

    public void setAttributes(
            final java.util.List<com.commercetools.importapi.models.productvariants.Attribute> attributes) {
        this.attributes = attributes;
    }

    public void setImages(final com.commercetools.importapi.models.common.Image... images) {
        this.images = new ArrayList<>(Arrays.asList(images));
    }

    public void setImages(final java.util.List<com.commercetools.importapi.models.common.Image> images) {
        this.images = images;
    }

    public void setAssets(final com.commercetools.importapi.models.common.Asset... assets) {
        this.assets = new ArrayList<>(Arrays.asList(assets));
    }

    public void setAssets(final java.util.List<com.commercetools.importapi.models.common.Asset> assets) {
        this.assets = assets;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ProductVariantDraftImportImpl that = (ProductVariantDraftImportImpl) o;

        return new EqualsBuilder().append(sku, that.sku)
                .append(key, that.key)
                .append(prices, that.prices)
                .append(attributes, that.attributes)
                .append(images, that.images)
                .append(assets, that.assets)
                .append(sku, that.sku)
                .append(key, that.key)
                .append(prices, that.prices)
                .append(attributes, that.attributes)
                .append(images, that.images)
                .append(assets, that.assets)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(sku)
                .append(key)
                .append(prices)
                .append(attributes)
                .append(images)
                .append(assets)
                .toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("sku", sku)
                .append("key", key)
                .append("prices", prices)
                .append("attributes", attributes)
                .append("images", images)
                .append("assets", assets)
                .build();
    }

    @Override
    public ProductVariantDraftImport copyDeep() {
        return ProductVariantDraftImport.deepCopy(this);
    }
}
