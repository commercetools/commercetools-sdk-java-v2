
package com.commercetools.api.models.error;

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
public class AttributeDefinitionTypeConflictErrorImpl implements AttributeDefinitionTypeConflictError, ModelBase {

    private String code;

    private String message;

    private Map<String, java.lang.Object> values;

    private String conflictingProductTypeId;

    private String conflictingProductTypeName;

    private String conflictingAttributeName;

    @JsonCreator
    AttributeDefinitionTypeConflictErrorImpl(@JsonProperty("message") final String message,
            @JsonProperty("values") final Map<String, java.lang.Object> values,
            @JsonProperty("conflictingProductTypeId") final String conflictingProductTypeId,
            @JsonProperty("conflictingProductTypeName") final String conflictingProductTypeName,
            @JsonProperty("conflictingAttributeName") final String conflictingAttributeName) {
        this.message = message;
        this.values = values;
        this.conflictingProductTypeId = conflictingProductTypeId;
        this.conflictingProductTypeName = conflictingProductTypeName;
        this.conflictingAttributeName = conflictingAttributeName;
        this.code = ATTRIBUTE_DEFINITION_TYPE_CONFLICT;
    }

    public AttributeDefinitionTypeConflictErrorImpl() {
        this.code = ATTRIBUTE_DEFINITION_TYPE_CONFLICT;
    }

    public String getCode() {
        return this.code;
    }

    public String getMessage() {
        return this.message;
    }

    public Map<String, java.lang.Object> values() {
        return values;
    }

    public String getConflictingProductTypeId() {
        return this.conflictingProductTypeId;
    }

    public String getConflictingProductTypeName() {
        return this.conflictingProductTypeName;
    }

    public String getConflictingAttributeName() {
        return this.conflictingAttributeName;
    }

    public void setMessage(final String message) {
        this.message = message;
    }

    public void setValue(String key, java.lang.Object value) {
        if (values == null) {
            values = new HashMap<>();
        }
        values.put(key, value);
    }

    public void setConflictingProductTypeId(final String conflictingProductTypeId) {
        this.conflictingProductTypeId = conflictingProductTypeId;
    }

    public void setConflictingProductTypeName(final String conflictingProductTypeName) {
        this.conflictingProductTypeName = conflictingProductTypeName;
    }

    public void setConflictingAttributeName(final String conflictingAttributeName) {
        this.conflictingAttributeName = conflictingAttributeName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        AttributeDefinitionTypeConflictErrorImpl that = (AttributeDefinitionTypeConflictErrorImpl) o;

        return new EqualsBuilder().append(code, that.code)
                .append(message, that.message)
                .append(values, that.values)
                .append(conflictingProductTypeId, that.conflictingProductTypeId)
                .append(conflictingProductTypeName, that.conflictingProductTypeName)
                .append(conflictingAttributeName, that.conflictingAttributeName)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(code)
                .append(message)
                .append(values)
                .append(conflictingProductTypeId)
                .append(conflictingProductTypeName)
                .append(conflictingAttributeName)
                .toHashCode();
    }

}
