
package com.commercetools.api.models.type;

import java.time.*;
import java.util.*;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class CustomFieldsImpl implements CustomFields {

    private com.commercetools.api.models.type.TypeReference type;

    private com.commercetools.api.models.type.FieldContainer fields;

    @JsonCreator
    CustomFieldsImpl(@JsonProperty("type") final com.commercetools.api.models.type.TypeReference type,
            @JsonProperty("fields") final com.commercetools.api.models.type.FieldContainer fields) {
        this.type = type;
        this.fields = fields;
    }

    public CustomFieldsImpl() {
    }

    public com.commercetools.api.models.type.TypeReference getType() {
        return this.type;
    }

    /**
    *  <p>A valid JSON object, based on FieldDefinition.</p>
    */
    public com.commercetools.api.models.type.FieldContainer getFields() {
        return this.fields;
    }

    public void setType(final com.commercetools.api.models.type.TypeReference type) {
        this.type = type;
    }

    public void setFields(final com.commercetools.api.models.type.FieldContainer fields) {
        this.fields = fields;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        CustomFieldsImpl that = (CustomFieldsImpl) o;

        return new EqualsBuilder().append(type, that.type).append(fields, that.fields).isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(type).append(fields).toHashCode();
    }

}
