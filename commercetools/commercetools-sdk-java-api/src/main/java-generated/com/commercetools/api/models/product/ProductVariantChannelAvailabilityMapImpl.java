
package com.commercetools.api.models.product;

import java.time.*;
import java.util.*;

import com.fasterxml.jackson.annotation.JsonAnySetter;
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
 *  <p>JSON object where the keys are supply Channel <code>id</code>, and the values are ProductVariantChannelAvailability.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ProductVariantChannelAvailabilityMapImpl implements ProductVariantChannelAvailabilityMap, ModelBase {

    private Map<String, com.commercetools.api.models.product.ProductVariantChannelAvailability> values;

    /**
     * create instance with all properties
     */
    @JsonCreator
    ProductVariantChannelAvailabilityMapImpl(
            @JsonAnySetter @JsonProperty("values") final Map<String, com.commercetools.api.models.product.ProductVariantChannelAvailability> values) {
        this.values = values;
    }

    /**
     * create empty instance
     */
    public ProductVariantChannelAvailabilityMapImpl() {
    }

    /**
     *  <p>JSON object where the keys are supply Channel <code>id</code>, and the values are ProductVariantChannelAvailability.</p>
     */

    public Map<String, com.commercetools.api.models.product.ProductVariantChannelAvailability> values() {
        return values;
    }

    public void setValue(String key, com.commercetools.api.models.product.ProductVariantChannelAvailability value) {
        if (values == null) {
            values = new HashMap<>();
        }
        values.put(key, value);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ProductVariantChannelAvailabilityMapImpl that = (ProductVariantChannelAvailabilityMapImpl) o;

        return new EqualsBuilder().append(values, that.values).append(values, that.values).isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(values).toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("values", values).build();
    }

    @Override
    public ProductVariantChannelAvailabilityMap copyDeep() {
        return ProductVariantChannelAvailabilityMap.deepCopy(this);
    }
}
