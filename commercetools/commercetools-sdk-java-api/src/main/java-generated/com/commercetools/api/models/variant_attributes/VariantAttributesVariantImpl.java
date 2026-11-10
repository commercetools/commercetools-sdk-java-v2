
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
 *  <p>A Variant with its requested Attributes and lightweight availability information.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class VariantAttributesVariantImpl implements VariantAttributesVariant, ModelBase {

    private String id;

    private String sku;

    private String key;

    private com.commercetools.api.models.variant_attributes.VariantAttributesAvailability availability;

    private java.util.List<com.commercetools.api.models.product.Attribute> attributes;

    /**
     * create instance with all properties
     */
    @JsonCreator
    VariantAttributesVariantImpl(@JsonProperty("id") final String id, @JsonProperty("sku") final String sku,
            @JsonProperty("key") final String key,
            @JsonProperty("availability") final com.commercetools.api.models.variant_attributes.VariantAttributesAvailability availability,
            @JsonProperty("attributes") final java.util.List<com.commercetools.api.models.product.Attribute> attributes) {
        this.id = id;
        this.sku = sku;
        this.key = key;
        this.availability = availability;
        this.attributes = attributes;
    }

    /**
     * create empty instance
     */
    public VariantAttributesVariantImpl() {
    }

    /**
     *  <p>Unique identifier of the <a href="https://docs.commercetools.com/apis/ctp:api:type:Variant" rel="nofollow">Variant</a>.</p>
     */

    public String getId() {
        return this.id;
    }

    /**
     *  <p>SKU of the <a href="https://docs.commercetools.com/apis/ctp:api:type:Variant" rel="nofollow">Variant</a>.</p>
     */

    public String getSku() {
        return this.sku;
    }

    /**
     *  <p>Key of the <a href="https://docs.commercetools.com/apis/ctp:api:type:Variant" rel="nofollow">Variant</a>.</p>
     */

    public String getKey() {
        return this.key;
    }

    /**
     *  <p>Availability information for this variant. Present only if <a href="https://docs.commercetools.com/apis/ctp:api:type:InventoryEntry" rel="nofollow">InventoryEntries</a> exist for the variant's SKU.</p>
     */

    public com.commercetools.api.models.variant_attributes.VariantAttributesAvailability getAvailability() {
        return this.availability;
    }

    /**
     *  <p>Requested <a href="https://docs.commercetools.com/apis/ctp:api:type:Attribute" rel="nofollow">Attributes</a> of the Variant. Only Variant-level Attributes that exist on this Variant and were requested via <code>filter[attributes]</code> are included.</p>
     */

    public java.util.List<com.commercetools.api.models.product.Attribute> getAttributes() {
        return this.attributes;
    }

    public void setId(final String id) {
        this.id = id;
    }

    public void setSku(final String sku) {
        this.sku = sku;
    }

    public void setKey(final String key) {
        this.key = key;
    }

    public void setAvailability(
            final com.commercetools.api.models.variant_attributes.VariantAttributesAvailability availability) {
        this.availability = availability;
    }

    public void setAttributes(final com.commercetools.api.models.product.Attribute... attributes) {
        this.attributes = new ArrayList<>(Arrays.asList(attributes));
    }

    public void setAttributes(final java.util.List<com.commercetools.api.models.product.Attribute> attributes) {
        this.attributes = attributes;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        VariantAttributesVariantImpl that = (VariantAttributesVariantImpl) o;

        return new EqualsBuilder().append(id, that.id)
                .append(sku, that.sku)
                .append(key, that.key)
                .append(availability, that.availability)
                .append(attributes, that.attributes)
                .append(id, that.id)
                .append(sku, that.sku)
                .append(key, that.key)
                .append(availability, that.availability)
                .append(attributes, that.attributes)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(id)
                .append(sku)
                .append(key)
                .append(availability)
                .append(attributes)
                .toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("id", id)
                .append("sku", sku)
                .append("key", key)
                .append("availability", availability)
                .append("attributes", attributes)
                .build();
    }

    @Override
    public VariantAttributesVariant copyDeep() {
        return VariantAttributesVariant.deepCopy(this);
    }
}
