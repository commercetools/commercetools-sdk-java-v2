
package com.commercetools.api.models.order;

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
 *  <p>Contains the Product Variant to be used in the LineItemImportDraft.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ProductVariantImportDraftImpl implements ProductVariantImportDraft, ModelBase {

    private Long id;

    private String sku;

    private java.util.List<com.commercetools.api.models.common.PriceDraft> prices;

    private java.util.List<com.commercetools.api.models.product.Attribute> attributes;

    private java.util.List<com.commercetools.api.models.common.Image> images;

    /**
     * create instance with all properties
     */
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

    /**
     * create empty instance
     */
    public ProductVariantImportDraftImpl() {
    }

    /**
     *  <p>The <code>id</code> of the ProductVariant. Required if you do not set a value for <code>sku</code>. If set, you must specify a <code>productId</code> in the LineItemImportDraft also.</p>
     */

    public Long getId() {
        return this.id;
    }

    /**
     *  <p>The <code>sku</code> of the ProductVariant. Required if you do not set a value for <code>id</code>.</p>
     */

    public String getSku() {
        return this.sku;
    }

    /**
     *  <p>The Prices of the Product Variant if you want to override the <code>prices</code> property in the referenced ProductVariant. If not set, the <code>prices</code> from the referenced ProductVariant are used in the resulting Order. If set, each Price must have its unique price scope (same <code>value.currencyCode</code>, <code>country</code>, <code>customerGroup</code>, <code>channel</code>, <code>validFrom</code> and <code>validUntil</code>).</p>
     */

    public java.util.List<com.commercetools.api.models.common.PriceDraft> getPrices() {
        return this.prices;
    }

    /**
     *  <p>The Attributes of the Product Variant if you want to override the <code>attributes</code> property in the referenced ProductVariant. If not set, the <code>attributes</code> from the referenced ProductVariant are copied to the resulting Order.</p>
     */

    public java.util.List<com.commercetools.api.models.product.Attribute> getAttributes() {
        return this.attributes;
    }

    /**
     *  <p>The Images of the Product Variant if you want to override the <code>images</code> property in the referenced ProductVariant. If not set, the <code>images</code> from the referenced ProductVariant are copied to the resulting Order.</p>
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

        return new EqualsBuilder().append(id, that.id)
                .append(sku, that.sku)
                .append(prices, that.prices)
                .append(attributes, that.attributes)
                .append(images, that.images)
                .append(id, that.id)
                .append(sku, that.sku)
                .append(prices, that.prices)
                .append(attributes, that.attributes)
                .append(images, that.images)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(id)
                .append(sku)
                .append(prices)
                .append(attributes)
                .append(images)
                .toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("id", id)
                .append("sku", sku)
                .append("prices", prices)
                .append("attributes", attributes)
                .append("images", images)
                .build();
    }

}
