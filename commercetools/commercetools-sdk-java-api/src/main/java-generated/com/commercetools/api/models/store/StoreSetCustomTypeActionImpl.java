
package com.commercetools.api.models.store;

import java.time.*;
import java.util.*;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class StoreSetCustomTypeActionImpl implements StoreSetCustomTypeAction {

    private String action;

    private com.commercetools.api.models.type.TypeResourceIdentifier type;

    private java.lang.Object fields;

    @JsonCreator
    StoreSetCustomTypeActionImpl(
            @JsonProperty("type") final com.commercetools.api.models.type.TypeResourceIdentifier type,
            @JsonProperty("fields") final java.lang.Object fields) {
        this.type = type;
        this.fields = fields;
        this.action = SET_CUSTOM_TYPE;
    }

    public StoreSetCustomTypeActionImpl() {
        this.action = SET_CUSTOM_TYPE;
    }

    public String getAction() {
        return this.action;
    }

    /**
    *  <p>If set, the custom type is reset to this value.
    *  If absent, the custom type and any existing custom fields are removed.</p>
    */
    public com.commercetools.api.models.type.TypeResourceIdentifier getType() {
        return this.type;
    }

    /**
    *  <p>A valid JSON object, based on the FieldDefinitions of the Type
    *  Sets the custom field to this value.</p>
    */
    public java.lang.Object getFields() {
        return this.fields;
    }

    public void setType(final com.commercetools.api.models.type.TypeResourceIdentifier type) {
        this.type = type;
    }

    public void setFields(final java.lang.Object fields) {
        this.fields = fields;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        StoreSetCustomTypeActionImpl that = (StoreSetCustomTypeActionImpl) o;

        return new EqualsBuilder().append(action, that.action).append(type, that.type).append(fields,
            that.fields).isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(action).append(type).append(fields).toHashCode();
    }

}
