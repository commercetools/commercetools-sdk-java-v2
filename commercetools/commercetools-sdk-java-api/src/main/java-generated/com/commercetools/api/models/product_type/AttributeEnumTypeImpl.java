
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
 *  <p>Attribute type for plain enum values. Useful for predefined language-agnostic values selectable in drop downs when only one value should be selected. Use AttributeSetType of AttributeEnumType instead if multiple values can be selected from the list.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class AttributeEnumTypeImpl implements AttributeEnumType, ModelBase {

    private String name;

    private java.util.List<com.commercetools.api.models.product_type.AttributePlainEnumValue> values;

    @JsonCreator
    AttributeEnumTypeImpl(
            @JsonProperty("values") final java.util.List<com.commercetools.api.models.product_type.AttributePlainEnumValue> values) {
        this.values = values;
        this.name = ENUM;
    }

    public AttributeEnumTypeImpl() {
        this.name = ENUM;
    }

    /**
     *
     */

    public String getName() {
        return this.name;
    }

    /**
     *  <p>Available values that can be assigned to Products.</p>
     */

    public java.util.List<com.commercetools.api.models.product_type.AttributePlainEnumValue> getValues() {
        return this.values;
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

        AttributeEnumTypeImpl that = (AttributeEnumTypeImpl) o;

        return new EqualsBuilder().append(name, that.name).append(values, that.values).isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(name).append(values).toHashCode();
    }

}
