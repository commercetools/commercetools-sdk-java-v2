
package com.commercetools.api.models.variant_attributes;

import java.time.*;
import java.util.*;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

import io.vrap.rmf.base.client.ModelBase;
import io.vrap.rmf.base.client.utils.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import tools.jackson.databind.annotation.*;

/**
 *  <p>A lightweight representation of a <a href="https://docs.commercetools.com/apis/ctp:api:type:Product" rel="nofollow">Product's</a> Variants with only the requested Attributes and minimal availability data. Designed for building attribute selectors on product detail pages (PDPs).</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class VariantAttributesImpl implements VariantAttributes, ModelBase {

    private String productId;

    private String productKey;

    private java.util.List<com.commercetools.api.models.variant_attributes.VariantAttributesAttributeMetadata> attributes;

    private java.util.List<com.commercetools.api.models.variant_attributes.VariantAttributesVariant> variants;

    /**
     * create instance with all properties
     */
    @JsonCreator
    VariantAttributesImpl(@JsonProperty("productId") final String productId,
            @JsonProperty("productKey") final String productKey,
            @JsonProperty("attributes") final java.util.List<com.commercetools.api.models.variant_attributes.VariantAttributesAttributeMetadata> attributes,
            @JsonProperty("variants") final java.util.List<com.commercetools.api.models.variant_attributes.VariantAttributesVariant> variants) {
        this.productId = productId;
        this.productKey = productKey;
        this.attributes = attributes;
        this.variants = variants;
    }

    /**
     * create empty instance
     */
    public VariantAttributesImpl() {
    }

    /**
     *  <p>Unique identifier of the <a href="https://docs.commercetools.com/apis/ctp:api:type:Product" rel="nofollow">Product</a>.</p>
     */

    public String getProductId() {
        return this.productId;
    }

    /**
     *  <p>User-defined unique identifier of the <a href="https://docs.commercetools.com/apis/ctp:api:type:Product" rel="nofollow">Product</a>.</p>
     */

    public String getProductKey() {
        return this.productKey;
    }

    /**
     *  <p>Metadata for the requested Attributes, derived from the <a href="https://docs.commercetools.com/apis/ctp:api:type:ProductType" rel="nofollow">ProductType</a>. Attributes not found in the ProductType are silently omitted.</p>
     */

    public java.util.List<com.commercetools.api.models.variant_attributes.VariantAttributesAttributeMetadata> getAttributes() {
        return this.attributes;
    }

    /**
     *  <p>All Variants of the Product with their requested Attributes and availability.</p>
     */

    public java.util.List<com.commercetools.api.models.variant_attributes.VariantAttributesVariant> getVariants() {
        return this.variants;
    }

    public void setProductId(final String productId) {
        this.productId = productId;
    }

    public void setProductKey(final String productKey) {
        this.productKey = productKey;
    }

    public void setAttributes(
            final com.commercetools.api.models.variant_attributes.VariantAttributesAttributeMetadata... attributes) {
        this.attributes = new ArrayList<>(Arrays.asList(attributes));
    }

    public void setAttributes(
            final java.util.List<com.commercetools.api.models.variant_attributes.VariantAttributesAttributeMetadata> attributes) {
        this.attributes = attributes;
    }

    public void setVariants(
            final com.commercetools.api.models.variant_attributes.VariantAttributesVariant... variants) {
        this.variants = new ArrayList<>(Arrays.asList(variants));
    }

    public void setVariants(
            final java.util.List<com.commercetools.api.models.variant_attributes.VariantAttributesVariant> variants) {
        this.variants = variants;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        VariantAttributesImpl that = (VariantAttributesImpl) o;

        return new EqualsBuilder().append(productId, that.productId)
                .append(productKey, that.productKey)
                .append(attributes, that.attributes)
                .append(variants, that.variants)
                .append(productId, that.productId)
                .append(productKey, that.productKey)
                .append(attributes, that.attributes)
                .append(variants, that.variants)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(productId)
                .append(productKey)
                .append(attributes)
                .append(variants)
                .toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("productId", productId)
                .append("productKey", productKey)
                .append("attributes", attributes)
                .append("variants", variants)
                .build();
    }

    @Override
    public VariantAttributes copyDeep() {
        return VariantAttributes.deepCopy(this);
    }
}
