
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

/**
 * ProductAddVariantAction
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ProductAddVariantActionImpl implements ProductAddVariantAction, ModelBase {

    private String action;

    private String sku;

    private String key;

    private java.util.List<com.commercetools.api.models.common.PriceDraft> prices;

    private java.util.List<com.commercetools.api.models.common.Image> images;

    private java.util.List<com.commercetools.api.models.product.Attribute> attributes;

    private Boolean staged;

    private java.util.List<com.commercetools.api.models.common.AssetDraft> assets;

    /**
     * create instance with all properties
     */
    @JsonCreator
    ProductAddVariantActionImpl(@JsonProperty("sku") final String sku, @JsonProperty("key") final String key,
            @JsonProperty("prices") final java.util.List<com.commercetools.api.models.common.PriceDraft> prices,
            @JsonProperty("images") final java.util.List<com.commercetools.api.models.common.Image> images,
            @JsonProperty("attributes") final java.util.List<com.commercetools.api.models.product.Attribute> attributes,
            @JsonProperty("staged") final Boolean staged,
            @JsonProperty("assets") final java.util.List<com.commercetools.api.models.common.AssetDraft> assets) {
        this.sku = sku;
        this.key = key;
        this.prices = prices;
        this.images = images;
        this.attributes = attributes;
        this.staged = staged;
        this.assets = assets;
        this.action = ADD_VARIANT;
    }

    /**
     * create empty instance
     */
    public ProductAddVariantActionImpl() {
        this.action = ADD_VARIANT;
    }

    /**
     *
     */

    public String getAction() {
        return this.action;
    }

    /**
     *  <p>Value to set. Must be unique.</p>
     */

    public String getSku() {
        return this.sku;
    }

    /**
     *  <p>Value to set. Must be unique.</p>
     */

    public String getKey() {
        return this.key;
    }

    /**
     *  <p>Embedded Prices for the Product Variant.</p>
     */

    public java.util.List<com.commercetools.api.models.common.PriceDraft> getPrices() {
        return this.prices;
    }

    /**
     *  <p>Images for the Product Variant.</p>
     */

    public java.util.List<com.commercetools.api.models.common.Image> getImages() {
        return this.images;
    }

    /**
     *  <p>Attributes for the Product Variant.</p>
     */

    public java.util.List<com.commercetools.api.models.product.Attribute> getAttributes() {
        return this.attributes;
    }

    /**
     *  <p>If <code>true</code> the new Product Variant is only staged. If <code>false</code> the new Product Variant is both current and staged.</p>
     */

    public Boolean getStaged() {
        return this.staged;
    }

    /**
     *  <p>Media assets for the Product Variant.</p>
     */

    public java.util.List<com.commercetools.api.models.common.AssetDraft> getAssets() {
        return this.assets;
    }

    public void setSku(final String sku) {
        this.sku = sku;
    }

    public void setKey(final String key) {
        this.key = key;
    }

    public void setPrices(final com.commercetools.api.models.common.PriceDraft... prices) {
        this.prices = new ArrayList<>(Arrays.asList(prices));
    }

    public void setPrices(final java.util.List<com.commercetools.api.models.common.PriceDraft> prices) {
        this.prices = prices;
    }

    public void setImages(final com.commercetools.api.models.common.Image... images) {
        this.images = new ArrayList<>(Arrays.asList(images));
    }

    public void setImages(final java.util.List<com.commercetools.api.models.common.Image> images) {
        this.images = images;
    }

    public void setAttributes(final com.commercetools.api.models.product.Attribute... attributes) {
        this.attributes = new ArrayList<>(Arrays.asList(attributes));
    }

    public void setAttributes(final java.util.List<com.commercetools.api.models.product.Attribute> attributes) {
        this.attributes = attributes;
    }

    public void setStaged(final Boolean staged) {
        this.staged = staged;
    }

    public void setAssets(final com.commercetools.api.models.common.AssetDraft... assets) {
        this.assets = new ArrayList<>(Arrays.asList(assets));
    }

    public void setAssets(final java.util.List<com.commercetools.api.models.common.AssetDraft> assets) {
        this.assets = assets;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ProductAddVariantActionImpl that = (ProductAddVariantActionImpl) o;

        return new EqualsBuilder().append(action, that.action)
                .append(sku, that.sku)
                .append(key, that.key)
                .append(prices, that.prices)
                .append(images, that.images)
                .append(attributes, that.attributes)
                .append(staged, that.staged)
                .append(assets, that.assets)
                .append(action, that.action)
                .append(sku, that.sku)
                .append(key, that.key)
                .append(prices, that.prices)
                .append(images, that.images)
                .append(attributes, that.attributes)
                .append(staged, that.staged)
                .append(assets, that.assets)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(action)
                .append(sku)
                .append(key)
                .append(prices)
                .append(images)
                .append(attributes)
                .append(staged)
                .append(assets)
                .toHashCode();
    }

}
