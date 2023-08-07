
package com.commercetools.history.models.change_value;

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
 * AttributeValue
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class AttributeValueImpl implements AttributeValue, ModelBase {

    private String name;

    private java.lang.Object value;

    /**
     * create instance with all properties
     */
    @JsonCreator
    AttributeValueImpl(@JsonProperty("name") final String name, @JsonProperty("value") final java.lang.Object value) {
        this.name = name;
        this.value = value;
    }

    /**
     * create empty instance
     */
    public AttributeValueImpl() {
    }

    /**
     *  <p>Name of the Attribute set.</p>
     */

    public String getName() {
        return this.name;
    }

    /**
     *  <p>Value set for the Attribute determined by the AttributeType:</p>
     *  <ul>
     *   <li>For Enum Type and Localized Enum Type, <code>value</code> is the <code>key</code> of the Plain Enum Value or Localized Enum Value objects, or the complete objects.</li>
     *   <li>For Localizable Text Type, <code>value</code> is the LocalizedString object.</li>
     *   <li>For Money Type Attributes, <code>value</code> is the Money object.</li>
     *   <li>For Set Type Attributes, <code>value</code> is the entire <code>set</code> object.</li>
     *   <li>For Nested Type Attributes, <code>value</code> is the list of values of all Attributes of the nested Product.</li>
     *   <li>For Reference Type Attributes, <code>value</code> is the Reference object.</li>
     *  </ul>
     */

    public java.lang.Object getValue() {
        return this.value;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public void setValue(final java.lang.Object value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        AttributeValueImpl that = (AttributeValueImpl) o;

        return new EqualsBuilder().append(name, that.name)
                .append(value, that.value)
                .append(name, that.name)
                .append(value, that.value)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(name).append(value).toHashCode();
    }

}
