
package com.commercetools.importapi.models.types;

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
 *  <p>Defines the data type of a Custom Field. Maps to <code>Type.FieldDefinition.type</code>. The <code>discriminator</code> is used to determine the type of the field.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class FieldTypeImpl implements FieldType, ModelBase {

    private String name;

    /**
     * create instance with all properties
     */
    @JsonCreator
    FieldTypeImpl(@JsonProperty("name") final String name) {
        this.name = name;
    }

    /**
     * create empty instance
     */
    public FieldTypeImpl() {
    }

    /**
     *  <p>Name of the field type. Must be unique for a given ResourceTypeId. In case there is a FieldDefinition with the same <code>name</code> in another Type, both FieldDefinitions must have the same <code>type</code>. This value cannot be changed after the Type is imported.</p>
     */

    public String getName() {
        return this.name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        FieldTypeImpl that = (FieldTypeImpl) o;

        return new EqualsBuilder().append(name, that.name).append(name, that.name).isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(name).toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("name", name).build();
    }

    @Override
    public FieldType copyDeep() {
        return FieldType.deepCopy(this);
    }
}
