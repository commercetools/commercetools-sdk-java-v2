
package com.commercetools.importapi.models.orders;

import java.time.*;
import java.util.*;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class LineItemProductVariantImportDraftImpl implements LineItemProductVariantImportDraft {

    private com.commercetools.importapi.models.common.ProductKeyReference product;

    private String sku;

    private java.util.List<com.commercetools.importapi.models.orders.LineItemPrice> prices;

    private java.util.List<com.commercetools.importapi.models.productvariants.Attribute> attributes;

    private java.util.List<com.commercetools.importapi.models.common.Image> images;

    @JsonCreator
    LineItemProductVariantImportDraftImpl(
            @JsonProperty("product") final com.commercetools.importapi.models.common.ProductKeyReference product,
            @JsonProperty("sku") final String sku,
            @JsonProperty("prices") final java.util.List<com.commercetools.importapi.models.orders.LineItemPrice> prices,
            @JsonProperty("attributes") final java.util.List<com.commercetools.importapi.models.productvariants.Attribute> attributes,
            @JsonProperty("images") final java.util.List<com.commercetools.importapi.models.common.Image> images) {
        this.product = product;
        this.sku = sku;
        this.prices = prices;
        this.attributes = attributes;
        this.images = images;
    }

    public LineItemProductVariantImportDraftImpl() {
    }

    /**
    *  <p>Maps to <code>ProductVariant.product</code>.</p>
    */
    public com.commercetools.importapi.models.common.ProductKeyReference getProduct() {
        return this.product;
    }

    /**
    *  <p>Maps to <code>ProductVariantImportDraft.sku</code>.</p>
    */
    public String getSku() {
        return this.sku;
    }

    /**
    *  <p>Maps to <code>ProductVariantImportDraft.prices</code></p>
    */
    public java.util.List<com.commercetools.importapi.models.orders.LineItemPrice> getPrices() {
        return this.prices;
    }

    /**
    *  <p>Maps to <code>ProductVariantImportDraft.attributes</code></p>
    */
    public java.util.List<com.commercetools.importapi.models.productvariants.Attribute> getAttributes() {
        return this.attributes;
    }

    /**
    *  <p>Maps to <code>ProductVariantImportDraft.images</code>.</p>
    */
    public java.util.List<com.commercetools.importapi.models.common.Image> getImages() {
        return this.images;
    }

    public void setProduct(final com.commercetools.importapi.models.common.ProductKeyReference product) {
        this.product = product;
    }

    public void setSku(final String sku) {
        this.sku = sku;
    }

    public void setPrices(final com.commercetools.importapi.models.orders.LineItemPrice... prices) {
        this.prices = new ArrayList<>(Arrays.asList(prices));
    }

    public void setPrices(final java.util.List<com.commercetools.importapi.models.orders.LineItemPrice> prices) {
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

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        LineItemProductVariantImportDraftImpl that = (LineItemProductVariantImportDraftImpl) o;

        return new EqualsBuilder().append(product, that.product).append(sku, that.sku).append(prices,
            that.prices).append(attributes, that.attributes).append(images, that.images).isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(product).append(sku).append(prices).append(attributes).append(
            images).toHashCode();
    }

}
