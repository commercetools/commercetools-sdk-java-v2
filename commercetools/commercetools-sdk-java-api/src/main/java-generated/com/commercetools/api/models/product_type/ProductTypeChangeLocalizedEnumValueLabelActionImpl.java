
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
public final class ProductTypeChangeLocalizedEnumValueLabelActionImpl
        implements ProductTypeChangeLocalizedEnumValueLabelAction {

    private String action;

    private String attributeName;

    private com.commercetools.api.models.product_type.AttributeLocalizedEnumValue newValue;

    @JsonCreator
    ProductTypeChangeLocalizedEnumValueLabelActionImpl(@JsonProperty("attributeName") final String attributeName,
            @JsonProperty("newValue") final com.commercetools.api.models.product_type.AttributeLocalizedEnumValue newValue) {
        this.attributeName = attributeName;
        this.newValue = newValue;
        this.action = CHANGE_LOCALIZED_ENUM_VALUE_LABEL;
    }

    public ProductTypeChangeLocalizedEnumValueLabelActionImpl() {
        this.action = CHANGE_LOCALIZED_ENUM_VALUE_LABEL;
    }

    public String getAction() {
        return this.action;
    }

    public String getAttributeName() {
        return this.attributeName;
    }

    public com.commercetools.api.models.product_type.AttributeLocalizedEnumValue getNewValue() {
        return this.newValue;
    }

    public void setAttributeName(final String attributeName) {
        this.attributeName = attributeName;
    }

    public void setNewValue(final com.commercetools.api.models.product_type.AttributeLocalizedEnumValue newValue) {
        this.newValue = newValue;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ProductTypeChangeLocalizedEnumValueLabelActionImpl that = (ProductTypeChangeLocalizedEnumValueLabelActionImpl) o;

        return new EqualsBuilder().append(action, that.action).append(attributeName, that.attributeName).append(
            newValue, that.newValue).isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(action).append(attributeName).append(newValue).toHashCode();
    }

}
