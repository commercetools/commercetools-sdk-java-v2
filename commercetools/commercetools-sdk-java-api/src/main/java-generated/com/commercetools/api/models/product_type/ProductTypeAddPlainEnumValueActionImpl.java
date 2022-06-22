
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

/**
 *  <p>Adds an enum to the values of AttributeEnumType AttributeDefinition, or AttributeSetType of AttributeEnumType AttributeDefinition.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ProductTypeAddPlainEnumValueActionImpl implements ProductTypeAddPlainEnumValueAction, ModelBase {

    private String action;

    private String attributeName;

    private com.commercetools.api.models.product_type.AttributePlainEnumValue value;

    @JsonCreator
    ProductTypeAddPlainEnumValueActionImpl(@JsonProperty("attributeName") final String attributeName,
            @JsonProperty("value") final com.commercetools.api.models.product_type.AttributePlainEnumValue value) {
        this.attributeName = attributeName;
        this.value = value;
        this.action = ADD_PLAIN_ENUM_VALUE;
    }

    public ProductTypeAddPlainEnumValueActionImpl() {
        this.action = ADD_PLAIN_ENUM_VALUE;
    }

    /**
     *
     */

    public String getAction() {
        return this.action;
    }

    /**
     *  <p>Name of the AttributeDefinition to update.</p>
     */

    public String getAttributeName() {
        return this.attributeName;
    }

    /**
     *  <p>Value to append to the array.</p>
     */

    public com.commercetools.api.models.product_type.AttributePlainEnumValue getValue() {
        return this.value;
    }

    public void setAttributeName(final String attributeName) {
        this.attributeName = attributeName;
    }

    public void setValue(final com.commercetools.api.models.product_type.AttributePlainEnumValue value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ProductTypeAddPlainEnumValueActionImpl that = (ProductTypeAddPlainEnumValueActionImpl) o;

        return new EqualsBuilder().append(action, that.action)
                .append(attributeName, that.attributeName)
                .append(value, that.value)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(action).append(attributeName).append(value).toHashCode();
    }

}
