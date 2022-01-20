
package com.commercetools.importapi.models.customfields;

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
*  <p>The representation to be sent to the server when creating a resource with custom fields.</p>
*/
@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class CustomImpl implements Custom, ModelBase {

    private com.commercetools.importapi.models.common.TypeKeyReference type;

    private com.commercetools.importapi.models.customfields.FieldContainer fields;

    @JsonCreator
    CustomImpl(@JsonProperty("type") final com.commercetools.importapi.models.common.TypeKeyReference type,
            @JsonProperty("fields") final com.commercetools.importapi.models.customfields.FieldContainer fields) {
        this.type = type;
        this.fields = fields;
    }

    public CustomImpl() {
    }

    /**
    *  <p>The type that provides the field definitions for this object.</p>
    */
    public com.commercetools.importapi.models.common.TypeKeyReference getType() {
        return this.type;
    }

    /**
    *  <p>The custom fields of this object.</p>
    */
    public com.commercetools.importapi.models.customfields.FieldContainer getFields() {
        return this.fields;
    }

    public void setType(final com.commercetools.importapi.models.common.TypeKeyReference type) {
        this.type = type;
    }

    public void setFields(final com.commercetools.importapi.models.customfields.FieldContainer fields) {
        this.fields = fields;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        CustomImpl that = (CustomImpl) o;

        return new EqualsBuilder().append(type, that.type).append(fields, that.fields).isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(type).append(fields).toHashCode();
    }

}
