
package com.commercetools.api.models.order;

import java.time.*;
import java.util.*;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class ProductVariantImportDraftImpl implements ProductVariantImportDraft {

    private Long id;

    private String sku;

    private java.util.List<com.commercetools.api.models.common.PriceDraft> prices;

    private java.util.List<com.commercetools.api.models.product.Attribute> attributes;

    private java.util.List<com.commercetools.api.models.common.Image> images;

    @JsonCreator
    ProductVariantImportDraftImpl(@JsonProperty("id") final Long id, @JsonProperty("sku") final String sku,
            @JsonProperty("prices") final java.util.List<com.commercetools.api.models.common.PriceDraft> prices,
            @JsonProperty("attributes") final java.util.List<com.commercetools.api.models.product.Attribute> attributes,
            @JsonProperty("images") final java.util.List<com.commercetools.api.models.common.Image> images) {
        this.id = id;
        this.sku = sku;
        this.prices = prices;
        this.attributes = attributes;
        this.images = images;
    }

    public ProductVariantImportDraftImpl() {
    }

    /**
    *  <p>The sequential ID of the variant within the product.
    *  The variant with provided ID should exist in some existing product, so you also need to specify the productId if this property is set,
    *  or alternatively you can just specify SKU of the product variant.</p>
    */
    public Long getId() {
        return this.id;
    }

    /**
    *  <p>The SKU of the existing variant.</p>
    */
    public String getSku() {
        return this.sku;
    }

    /**
    *  <p>The prices of the variant.
    *  The prices should not contain two prices for the same price scope (same currency, country and customer group).
    *  If this property is defined, then it will override the <code>prices</code> property from the original product variant, otherwise <code>prices</code> property from the original product variant would be copied in the resulting order.</p>
    */
    public java.util.List<com.commercetools.api.models.common.PriceDraft> getPrices() {
        return this.prices;
    }

    /**
    *  <p>If this property is defined, then it will override the <code>attributes</code> property from the original
    *  product variant, otherwise <code>attributes</code> property from the original product variant would be copied in the resulting order.</p>
    */
    public java.util.List<com.commercetools.api.models.product.Attribute> getAttributes() {
        return this.attributes;
    }

    /**
    *  <p>If this property is defined, then it will override the <code>images</code> property from the original
    *  product variant, otherwise <code>images</code> property from the original product variant would be copied in the resulting order.</p>
    */
    public java.util.List<com.commercetools.api.models.common.Image> getImages() {
        return this.images;
    }

    public void setId(final Long id) {
        this.id = id;
    }

    public void setSku(final String sku) {
        this.sku = sku;
    }

    public void setPrices(final com.commercetools.api.models.common.PriceDraft... prices) {
        this.prices = new ArrayList<>(Arrays.asList(prices));
    }

    public void setPrices(final java.util.List<com.commercetools.api.models.common.PriceDraft> prices) {
        this.prices = prices;
    }

    public void setAttributes(final com.commercetools.api.models.product.Attribute... attributes) {
        this.attributes = new ArrayList<>(Arrays.asList(attributes));
    }

    public void setAttributes(final java.util.List<com.commercetools.api.models.product.Attribute> attributes) {
        this.attributes = attributes;
    }

    public void setImages(final com.commercetools.api.models.common.Image... images) {
        this.images = new ArrayList<>(Arrays.asList(images));
    }

    public void setImages(final java.util.List<com.commercetools.api.models.common.Image> images) {
        this.images = images;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ProductVariantImportDraftImpl that = (ProductVariantImportDraftImpl) o;

        return new EqualsBuilder().append(id, that.id).append(sku, that.sku).append(prices, that.prices).append(
            attributes, that.attributes).append(images, that.images).isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(id).append(sku).append(prices).append(attributes).append(
            images).toHashCode();
    }

}
