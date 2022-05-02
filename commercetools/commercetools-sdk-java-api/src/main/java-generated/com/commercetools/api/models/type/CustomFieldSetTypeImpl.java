
package com.commercetools.api.models.type;

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
*  <p>Values of a SetType Custom Field are sets of values of the specified <code>elementType</code> (without duplicate elements).</p>
*/
@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class CustomFieldSetTypeImpl implements CustomFieldSetType, ModelBase {

    private String name;

    private com.commercetools.api.models.type.FieldType elementType;

    @JsonCreator
    CustomFieldSetTypeImpl(@JsonProperty("elementType") final com.commercetools.api.models.type.FieldType elementType) {
        this.elementType = elementType;
        this.name = SET;
    }

    public CustomFieldSetTypeImpl() {
        this.name = SET;
    }

    public String getName() {
        return this.name;
    }

    /**
    *  <p>Field type of the elements in the set.</p>
    */
    public com.commercetools.api.models.type.FieldType getElementType() {
        return this.elementType;
    }

    public void setElementType(final com.commercetools.api.models.type.FieldType elementType) {
        this.elementType = elementType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        CustomFieldSetTypeImpl that = (CustomFieldSetTypeImpl) o;

        return new EqualsBuilder().append(name, that.name).append(elementType, that.elementType).isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(name).append(elementType).toHashCode();
    }

}
