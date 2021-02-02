
package com.commercetools.api.models.product_type;

import java.time.*;
import java.util.*;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class ProductTypeRemoveEnumValuesActionImpl implements ProductTypeRemoveEnumValuesAction {

    private String action;

    private String attributeName;

    private java.util.List<String> keys;

    @JsonCreator
    ProductTypeRemoveEnumValuesActionImpl(@JsonProperty("attributeName") final String attributeName,
            @JsonProperty("keys") final java.util.List<String> keys) {
        this.attributeName = attributeName;
        this.keys = keys;
        this.action = REMOVE_ENUM_VALUES;
    }

    public ProductTypeRemoveEnumValuesActionImpl() {
        this.action = REMOVE_ENUM_VALUES;
    }

    public String getAction() {
        return this.action;
    }

    public String getAttributeName() {
        return this.attributeName;
    }

    public java.util.List<String> getKeys() {
        return this.keys;
    }

    public void setAttributeName(final String attributeName) {
        this.attributeName = attributeName;
    }

    public void setKeys(final String... keys) {
        this.keys = new ArrayList<>(Arrays.asList(keys));
    }

    public void setKeys(final java.util.List<String> keys) {
        this.keys = keys;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ProductTypeRemoveEnumValuesActionImpl that = (ProductTypeRemoveEnumValuesActionImpl) o;

        return new EqualsBuilder().append(action, that.action).append(attributeName, that.attributeName).append(keys,
            that.keys).isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(action).append(attributeName).append(keys).toHashCode();
    }

}
