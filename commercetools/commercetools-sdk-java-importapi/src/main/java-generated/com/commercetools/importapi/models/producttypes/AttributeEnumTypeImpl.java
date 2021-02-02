
package com.commercetools.importapi.models.producttypes;

import java.time.*;
import java.util.*;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class AttributeEnumTypeImpl implements AttributeEnumType {

    private String name;

    private java.util.List<com.commercetools.importapi.models.producttypes.AttributePlainEnumValue> values;

    @JsonCreator
    AttributeEnumTypeImpl(
            @JsonProperty("values") final java.util.List<com.commercetools.importapi.models.producttypes.AttributePlainEnumValue> values) {
        this.values = values;
        this.name = ENUM;
    }

    public AttributeEnumTypeImpl() {
        this.name = ENUM;
    }

    public String getName() {
        return this.name;
    }

    public java.util.List<com.commercetools.importapi.models.producttypes.AttributePlainEnumValue> getValues() {
        return this.values;
    }

    public void setValues(final com.commercetools.importapi.models.producttypes.AttributePlainEnumValue... values) {
        this.values = new ArrayList<>(Arrays.asList(values));
    }

    public void setValues(
            final java.util.List<com.commercetools.importapi.models.producttypes.AttributePlainEnumValue> values) {
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
