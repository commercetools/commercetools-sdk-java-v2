
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
public final class EnumKeyAlreadyExistsErrorImpl implements EnumKeyAlreadyExistsError {

    private String code;

    private String message;

    private String conflictingEnumKey;

    private String conflictingAttributeName;

    @JsonCreator
    EnumKeyAlreadyExistsErrorImpl(@JsonProperty("message") final String message,
            @JsonProperty("conflictingEnumKey") final String conflictingEnumKey,
            @JsonProperty("conflictingAttributeName") final String conflictingAttributeName) {
        this.message = message;
        this.conflictingEnumKey = conflictingEnumKey;
        this.conflictingAttributeName = conflictingAttributeName;
        this.code = ENUM_KEY_ALREADY_EXISTS;
    }

    public EnumKeyAlreadyExistsErrorImpl() {
        this.code = ENUM_KEY_ALREADY_EXISTS;
    }

    public String getCode() {
        return this.code;
    }

    public String getMessage() {
        return this.message;
    }

    public String getConflictingEnumKey() {
        return this.conflictingEnumKey;
    }

    public String getConflictingAttributeName() {
        return this.conflictingAttributeName;
    }

    public void setMessage(final String message) {
        this.message = message;
    }

    public void setConflictingEnumKey(final String conflictingEnumKey) {
        this.conflictingEnumKey = conflictingEnumKey;
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

        EnumKeyAlreadyExistsErrorImpl that = (EnumKeyAlreadyExistsErrorImpl) o;

        return new EqualsBuilder().append(code, that.code)
                .append(message, that.message)
                .append(conflictingEnumKey, that.conflictingEnumKey)
                .append(conflictingAttributeName, that.conflictingAttributeName)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(code)
                .append(message)
                .append(conflictingEnumKey)
                .append(conflictingAttributeName)
                .toHashCode();
    }

}
