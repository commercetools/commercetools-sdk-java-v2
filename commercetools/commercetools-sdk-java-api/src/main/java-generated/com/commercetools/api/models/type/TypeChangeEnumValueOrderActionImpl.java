
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
public final class TypeChangeEnumValueOrderActionImpl implements TypeChangeEnumValueOrderAction {

    private String action;

    private String fieldName;

    private java.util.List<String> keys;

    @JsonCreator
    TypeChangeEnumValueOrderActionImpl(@JsonProperty("fieldName") final String fieldName,
            @JsonProperty("keys") final java.util.List<String> keys) {
        this.fieldName = fieldName;
        this.keys = keys;
        this.action = CHANGE_ENUM_VALUE_ORDER;
    }

    public TypeChangeEnumValueOrderActionImpl() {
        this.action = CHANGE_ENUM_VALUE_ORDER;
    }

    public String getAction() {
        return this.action;
    }

    public String getFieldName() {
        return this.fieldName;
    }

    public java.util.List<String> getKeys() {
        return this.keys;
    }

    public void setFieldName(final String fieldName) {
        this.fieldName = fieldName;
    }

    public void setKeys(final String... keys) {
        this.keys = new ArrayList<>(Arrays.asList(keys));
    }

    public void setKeys(final java.util.List<String> keys) {
        this.keys = keys;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        TypeChangeEnumValueOrderActionImpl that = (TypeChangeEnumValueOrderActionImpl) o;

        return new EqualsBuilder().append(action, that.action)
                .append(fieldName, that.fieldName)
                .append(keys, that.keys)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(action).append(fieldName).append(keys).toHashCode();
    }

}
