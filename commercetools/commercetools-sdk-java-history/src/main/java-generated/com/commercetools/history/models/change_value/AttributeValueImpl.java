
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

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class AttributeValueImpl implements AttributeValue, ModelBase {

    private String name;

    private java.lang.Object value;

    @JsonCreator
    AttributeValueImpl(@JsonProperty("name") final String name, @JsonProperty("value") final java.lang.Object value) {
        this.name = name;
        this.value = value;
    }

    public AttributeValueImpl() {
    }

    public String getName() {
        return this.name;
    }

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

        return new EqualsBuilder().append(name, that.name).append(value, that.value).isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(name).append(value).toHashCode();
    }

}
