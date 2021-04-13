
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
public final class ProductTypeChangePlainEnumValueLabelActionImpl
        implements ProductTypeChangePlainEnumValueLabelAction {

    private String action;

    private String attributeName;

    private com.commercetools.api.models.product_type.AttributePlainEnumValue newValue;

    @JsonCreator
    ProductTypeChangePlainEnumValueLabelActionImpl(@JsonProperty("attributeName") final String attributeName,
            @JsonProperty("newValue") final com.commercetools.api.models.product_type.AttributePlainEnumValue newValue) {
        this.attributeName = attributeName;
        this.newValue = newValue;
        this.action = CHANGE_PLAIN_ENUM_VALUE_LABEL;
    }

    public ProductTypeChangePlainEnumValueLabelActionImpl() {
        this.action = CHANGE_PLAIN_ENUM_VALUE_LABEL;
    }

    public String getAction() {
        return this.action;
    }

    public String getAttributeName() {
        return this.attributeName;
    }

    public com.commercetools.api.models.product_type.AttributePlainEnumValue getNewValue() {
        return this.newValue;
    }

    public void setAttributeName(final String attributeName) {
        this.attributeName = attributeName;
    }

    public void setNewValue(final com.commercetools.api.models.product_type.AttributePlainEnumValue newValue) {
        this.newValue = newValue;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ProductTypeChangePlainEnumValueLabelActionImpl that = (ProductTypeChangePlainEnumValueLabelActionImpl) o;

        return new EqualsBuilder().append(action, that.action)
                .append(attributeName, that.attributeName)
                .append(newValue, that.newValue)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(action).append(attributeName).append(newValue).toHashCode();
    }

}
