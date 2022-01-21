
package com.commercetools.api.models.product_type;

import java.time.*;
import java.util.*;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.ModelBase;
import io.vrap.rmf.base.client.utils.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class ProductTypeChangePlainEnumValueOrderActionImpl
        implements ProductTypeChangePlainEnumValueOrderAction, ModelBase {

    private String action;

    private String attributeName;

    private java.util.List<com.commercetools.api.models.product_type.AttributePlainEnumValue> values;

    @JsonCreator
    ProductTypeChangePlainEnumValueOrderActionImpl(@JsonProperty("attributeName") final String attributeName,
            @JsonProperty("values") final java.util.List<com.commercetools.api.models.product_type.AttributePlainEnumValue> values) {
        this.attributeName = attributeName;
        this.values = values;
        this.action = CHANGE_PLAIN_ENUM_VALUE_ORDER;
    }

    public ProductTypeChangePlainEnumValueOrderActionImpl() {
        this.action = CHANGE_PLAIN_ENUM_VALUE_ORDER;
    }

    public String getAction() {
        return this.action;
    }

    public String getAttributeName() {
        return this.attributeName;
    }

    public java.util.List<com.commercetools.api.models.product_type.AttributePlainEnumValue> getValues() {
        return this.values;
    }

    public void setAttributeName(final String attributeName) {
        this.attributeName = attributeName;
    }

    public void setValues(final com.commercetools.api.models.product_type.AttributePlainEnumValue... values) {
        this.values = new ArrayList<>(Arrays.asList(values));
    }

    public void setValues(
            final java.util.List<com.commercetools.api.models.product_type.AttributePlainEnumValue> values) {
        this.values = values;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ProductTypeChangePlainEnumValueOrderActionImpl that = (ProductTypeChangePlainEnumValueOrderActionImpl) o;

        return new EqualsBuilder().append(action, that.action)
                .append(attributeName, that.attributeName)
                .append(values, that.values)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(action).append(attributeName).append(values).toHashCode();
    }

}
