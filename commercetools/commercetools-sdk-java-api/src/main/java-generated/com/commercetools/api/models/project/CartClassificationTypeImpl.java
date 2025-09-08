
package com.commercetools.api.models.project;

import java.time.*;
import java.util.*;

import com.commercetools.api.models.shipping_method.ShippingRateTierType;
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
 *  <p>The <a href="https://docs.commercetools.com/apis/ctp:api:type:ShippingRate" rel="nofollow">ShippingRate</a> maps to an abstract Cart categorization expressed by strings (for example, <code>Light</code>, <code>Medium</code>, or <code>Heavy</code>). Only keys defined in the <code>values</code> array can be used to create a tier or to set a value of the <code>shippingRateInput</code> on the <a href="https://docs.commercetools.com/apis/ctp:api:type:Cart" rel="nofollow">Cart</a>. Keys must be unique.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class CartClassificationTypeImpl implements CartClassificationType, ModelBase {

    private com.commercetools.api.models.shipping_method.ShippingRateTierType type;

    private java.util.List<com.commercetools.api.models.type.CustomFieldLocalizedEnumValue> values;

    /**
     * create instance with all properties
     */
    @JsonCreator
    CartClassificationTypeImpl(
            @JsonProperty("values") final java.util.List<com.commercetools.api.models.type.CustomFieldLocalizedEnumValue> values) {
        this.values = values;
        this.type = ShippingRateTierType.findEnum("CartClassification");
    }

    /**
     * create empty instance
     */
    public CartClassificationTypeImpl() {
        this.type = ShippingRateTierType.findEnum("CartClassification");
    }

    /**
     *
     */

    public com.commercetools.api.models.shipping_method.ShippingRateTierType getType() {
        return this.type;
    }

    /**
     *  <p>The classification items that can be used for specifying any <a href="https://docs.commercetools.com/apis/ctp:api:type:ShippingRatePriceTier" rel="nofollow">ShippingRatePriceTier</a>.</p>
     */

    public java.util.List<com.commercetools.api.models.type.CustomFieldLocalizedEnumValue> getValues() {
        return this.values;
    }

    public void setValues(final com.commercetools.api.models.type.CustomFieldLocalizedEnumValue... values) {
        this.values = new ArrayList<>(Arrays.asList(values));
    }

    public void setValues(
            final java.util.List<com.commercetools.api.models.type.CustomFieldLocalizedEnumValue> values) {
        this.values = values;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        CartClassificationTypeImpl that = (CartClassificationTypeImpl) o;

        return new EqualsBuilder().append(type, that.type)
                .append(values, that.values)
                .append(type, that.type)
                .append(values, that.values)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(type).append(values).toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("type", type)
                .append("values", values)
                .build();
    }

    @Override
    public CartClassificationType copyDeep() {
        return CartClassificationType.deepCopy(this);
    }
}
