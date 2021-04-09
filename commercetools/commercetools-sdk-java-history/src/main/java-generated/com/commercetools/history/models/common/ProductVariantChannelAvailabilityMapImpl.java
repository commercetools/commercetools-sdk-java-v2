
package com.commercetools.history.models.common;

import java.time.*;
import java.util.*;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class ProductVariantChannelAvailabilityMapImpl implements ProductVariantChannelAvailabilityMap {

    private Map<String, com.commercetools.history.models.common.ProductVariantChannelAvailability> values;

    @JsonCreator
    ProductVariantChannelAvailabilityMapImpl(
            @JsonProperty("values") final Map<String, com.commercetools.history.models.common.ProductVariantChannelAvailability> values) {
        this.values = values;
    }

    public ProductVariantChannelAvailabilityMapImpl() {
    }

    public Map<String, com.commercetools.history.models.common.ProductVariantChannelAvailability> values() {
        return values;
    }

    public void setValue(String key, com.commercetools.history.models.common.ProductVariantChannelAvailability value) {
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

        return new EqualsBuilder().append(values, that.values).isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(values).toHashCode();
    }

}
