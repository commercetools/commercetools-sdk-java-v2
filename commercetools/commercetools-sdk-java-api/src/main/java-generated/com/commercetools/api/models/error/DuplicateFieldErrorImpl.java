
package com.commercetools.api.models.error;

import java.time.*;
import java.util.*;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class DuplicateFieldErrorImpl implements DuplicateFieldError {

    private String code;

    private String message;

    private String field;

    private java.lang.Object duplicateValue;

    private com.commercetools.api.models.common.Reference conflictingResource;

    @JsonCreator
    DuplicateFieldErrorImpl(@JsonProperty("message") final String message, @JsonProperty("field") final String field,
            @JsonProperty("duplicateValue") final java.lang.Object duplicateValue,
            @JsonProperty("conflictingResource") final com.commercetools.api.models.common.Reference conflictingResource) {
        this.message = message;
        this.field = field;
        this.duplicateValue = duplicateValue;
        this.conflictingResource = conflictingResource;
        this.code = DUPLICATE_FIELD;
    }

    public DuplicateFieldErrorImpl() {
        this.code = DUPLICATE_FIELD;
    }

    public String getCode() {
        return this.code;
    }

    public String getMessage() {
        return this.message;
    }

    public String getField() {
        return this.field;
    }

    public java.lang.Object getDuplicateValue() {
        return this.duplicateValue;
    }

    public com.commercetools.api.models.common.Reference getConflictingResource() {
        return this.conflictingResource;
    }

    public void setMessage(final String message) {
        this.message = message;
    }

    public void setField(final String field) {
        this.field = field;
    }

    public void setDuplicateValue(final java.lang.Object duplicateValue) {
        this.duplicateValue = duplicateValue;
    }

    public void setConflictingResource(final com.commercetools.api.models.common.Reference conflictingResource) {
        this.conflictingResource = conflictingResource;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        DuplicateFieldErrorImpl that = (DuplicateFieldErrorImpl) o;

        return new EqualsBuilder().append(code, that.code).append(message, that.message).append(field,
            that.field).append(duplicateValue, that.duplicateValue).append(conflictingResource,
                that.conflictingResource).isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(code).append(message).append(field).append(duplicateValue).append(
            conflictingResource).toHashCode();
    }

}
