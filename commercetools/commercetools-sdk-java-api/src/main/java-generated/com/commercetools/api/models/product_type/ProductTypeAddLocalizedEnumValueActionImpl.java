
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
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 *  <p>Adds a localizable enum to the values of AttributeLocalizedEnumType. It can update an AttributeLocalizedEnumType AttributeDefinition or an AttributeSetType of AttributeLocalizedEnumType AttributeDefinition.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ProductTypeAddLocalizedEnumValueActionImpl implements ProductTypeAddLocalizedEnumValueAction, ModelBase {

    private String action;

    private String attributeName;

    private com.commercetools.api.models.product_type.AttributeLocalizedEnumValue value;

    /**
     * create instance with all properties
     */
    @JsonCreator
    ProductTypeAddLocalizedEnumValueActionImpl(@JsonProperty("attributeName") final String attributeName,
            @JsonProperty("value") final com.commercetools.api.models.product_type.AttributeLocalizedEnumValue value) {
        this.attributeName = attributeName;
        this.value = value;
        this.action = ADD_LOCALIZED_ENUM_VALUE;
    }

    /**
     * create empty instance
     */
    public ProductTypeAddLocalizedEnumValueActionImpl() {
        this.action = ADD_LOCALIZED_ENUM_VALUE;
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

    public com.commercetools.api.models.product_type.AttributeLocalizedEnumValue getValue() {
        return this.value;
    }

    public void setAttributeName(final String attributeName) {
        this.attributeName = attributeName;
    }

    public void setValue(final com.commercetools.api.models.product_type.AttributeLocalizedEnumValue value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ProductTypeAddLocalizedEnumValueActionImpl that = (ProductTypeAddLocalizedEnumValueActionImpl) o;

        return new EqualsBuilder().append(action, that.action)
                .append(attributeName, that.attributeName)
                .append(value, that.value)
                .append(action, that.action)
                .append(attributeName, that.attributeName)
                .append(value, that.value)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(action).append(attributeName).append(value).toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("action", action)
                .append("attributeName", attributeName)
                .append("value", value)
                .build();
    }

    @Override
    public ProductTypeAddLocalizedEnumValueAction copyDeep() {
        return ProductTypeAddLocalizedEnumValueAction.deepCopy(this);
    }
}
