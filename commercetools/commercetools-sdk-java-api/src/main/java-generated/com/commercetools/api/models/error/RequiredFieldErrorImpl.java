
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
public final class RequiredFieldErrorImpl implements RequiredFieldError {

    private String code;

    private String message;

    private String field;

    @JsonCreator
    RequiredFieldErrorImpl(@JsonProperty("message") final String message, @JsonProperty("field") final String field) {
        this.message = message;
        this.field = field;
        this.code = REQUIRED_FIELD;
    }

    public RequiredFieldErrorImpl() {
        this.code = REQUIRED_FIELD;
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

    public void setMessage(final String message) {
        this.message = message;
    }

    public void setField(final String field) {
        this.field = field;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        RequiredFieldErrorImpl that = (RequiredFieldErrorImpl) o;

        return new EqualsBuilder().append(code, that.code).append(message, that.message).append(field,
            that.field).isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(code).append(message).append(field).toHashCode();
    }

}
