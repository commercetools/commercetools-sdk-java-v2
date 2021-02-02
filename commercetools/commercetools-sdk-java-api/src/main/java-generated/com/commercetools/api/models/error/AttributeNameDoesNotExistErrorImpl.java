
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
public final class AttributeNameDoesNotExistErrorImpl implements AttributeNameDoesNotExistError {

    private String code;

    private String message;

    private String invalidAttributeName;

    @JsonCreator
    AttributeNameDoesNotExistErrorImpl(@JsonProperty("message") final String message,
            @JsonProperty("invalidAttributeName") final String invalidAttributeName) {
        this.message = message;
        this.invalidAttributeName = invalidAttributeName;
        this.code = ATTRIBUTE_NAME_DOES_NOT_EXIST;
    }

    public AttributeNameDoesNotExistErrorImpl() {
        this.code = ATTRIBUTE_NAME_DOES_NOT_EXIST;
    }

    public String getCode() {
        return this.code;
    }

    public String getMessage() {
        return this.message;
    }

    public String getInvalidAttributeName() {
        return this.invalidAttributeName;
    }

    public void setMessage(final String message) {
        this.message = message;
    }

    public void setInvalidAttributeName(final String invalidAttributeName) {
        this.invalidAttributeName = invalidAttributeName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        AttributeNameDoesNotExistErrorImpl that = (AttributeNameDoesNotExistErrorImpl) o;

        return new EqualsBuilder().append(code, that.code).append(message, that.message).append(invalidAttributeName,
            that.invalidAttributeName).isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(code).append(message).append(invalidAttributeName).toHashCode();
    }

}
