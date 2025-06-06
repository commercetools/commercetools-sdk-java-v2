
package com.commercetools.importapi.models.producttypes;

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
 * AttributeLocalizedEnumType
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class AttributeLocalizedEnumTypeImpl implements AttributeLocalizedEnumType, ModelBase {

    private String name;

    private java.util.List<com.commercetools.importapi.models.producttypes.AttributeLocalizedEnumValue> values;

    /**
     * create instance with all properties
     */
    @JsonCreator
    AttributeLocalizedEnumTypeImpl(
            @JsonProperty("values") final java.util.List<com.commercetools.importapi.models.producttypes.AttributeLocalizedEnumValue> values) {
        this.values = values;
        this.name = LENUM;
    }

    /**
     * create empty instance
     */
    public AttributeLocalizedEnumTypeImpl() {
        this.name = LENUM;
    }

    /**
     *
     */

    public String getName() {
        return this.name;
    }

    /**
     *
     */

    public java.util.List<com.commercetools.importapi.models.producttypes.AttributeLocalizedEnumValue> getValues() {
        return this.values;
    }

    public void setValues(final com.commercetools.importapi.models.producttypes.AttributeLocalizedEnumValue... values) {
        this.values = new ArrayList<>(Arrays.asList(values));
    }

    public void setValues(
            final java.util.List<com.commercetools.importapi.models.producttypes.AttributeLocalizedEnumValue> values) {
        this.values = values;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        AttributeLocalizedEnumTypeImpl that = (AttributeLocalizedEnumTypeImpl) o;

        return new EqualsBuilder().append(name, that.name)
                .append(values, that.values)
                .append(name, that.name)
                .append(values, that.values)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(name).append(values).toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("name", name)
                .append("values", values)
                .build();
    }

    @Override
    public AttributeLocalizedEnumType copyDeep() {
        return AttributeLocalizedEnumType.deepCopy(this);
    }
}
