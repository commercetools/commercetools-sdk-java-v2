
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
 *  <p>Updates the order of localized enum <code>values</code> in an AttributeLocalizedEnumType AttributeDefinition. It can update an AttributeLocalizedEnumType AttributeDefinition or an AttributeSetType of AttributeLocalizedEnumType AttributeDefinition.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ProductTypeChangeLocalizedEnumValueOrderActionImpl
        implements ProductTypeChangeLocalizedEnumValueOrderAction, ModelBase {

    private String action;

    private String attributeName;

    private java.util.List<com.commercetools.api.models.product_type.AttributeLocalizedEnumValue> values;

    /**
     * create instance with all properties
     */
    @JsonCreator
    ProductTypeChangeLocalizedEnumValueOrderActionImpl(@JsonProperty("attributeName") final String attributeName,
            @JsonProperty("values") final java.util.List<com.commercetools.api.models.product_type.AttributeLocalizedEnumValue> values) {
        this.attributeName = attributeName;
        this.values = values;
        this.action = CHANGE_LOCALIZED_ENUM_VALUE_ORDER;
    }

    /**
     * create empty instance
     */
    public ProductTypeChangeLocalizedEnumValueOrderActionImpl() {
        this.action = CHANGE_LOCALIZED_ENUM_VALUE_ORDER;
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
     *  <p>Values must be equal to the values of the Attribute enum values (except for the order). If not, an EnumValuesMustMatch error is returned.</p>
     */

    public java.util.List<com.commercetools.api.models.product_type.AttributeLocalizedEnumValue> getValues() {
        return this.values;
    }

    public void setAttributeName(final String attributeName) {
        this.attributeName = attributeName;
    }

    public void setValues(final com.commercetools.api.models.product_type.AttributeLocalizedEnumValue... values) {
        this.values = new ArrayList<>(Arrays.asList(values));
    }

    public void setValues(
            final java.util.List<com.commercetools.api.models.product_type.AttributeLocalizedEnumValue> values) {
        this.values = values;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ProductTypeChangeLocalizedEnumValueOrderActionImpl that = (ProductTypeChangeLocalizedEnumValueOrderActionImpl) o;

        return new EqualsBuilder().append(action, that.action)
                .append(attributeName, that.attributeName)
                .append(values, that.values)
                .append(action, that.action)
                .append(attributeName, that.attributeName)
                .append(values, that.values)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(action).append(attributeName).append(values).toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("action", action)
                .append("attributeName", attributeName)
                .append("values", values)
                .build();
    }

    @Override
    public ProductTypeChangeLocalizedEnumValueOrderAction copyDeep() {
        return ProductTypeChangeLocalizedEnumValueOrderAction.deepCopy(this);
    }
}
