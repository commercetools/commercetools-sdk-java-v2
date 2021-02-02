
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
public final class DuplicateEnumValuesErrorImpl implements DuplicateEnumValuesError {

    private String code;

    private String message;

    private java.util.List<String> duplicates;

    @JsonCreator
    DuplicateEnumValuesErrorImpl(@JsonProperty("message") final String message,
            @JsonProperty("duplicates") final java.util.List<String> duplicates) {
        this.message = message;
        this.duplicates = duplicates;
        this.code = DUPLICATE_ENUM_VALUES;
    }

    public DuplicateEnumValuesErrorImpl() {
        this.code = DUPLICATE_ENUM_VALUES;
    }

    public String getCode() {
        return this.code;
    }

    public String getMessage() {
        return this.message;
    }

    public java.util.List<String> getDuplicates() {
        return this.duplicates;
    }

    public void setMessage(final String message) {
        this.message = message;
    }

    public void setDuplicates(final String... duplicates) {
        this.duplicates = new ArrayList<>(Arrays.asList(duplicates));
    }

    public void setDuplicates(final java.util.List<String> duplicates) {
        this.duplicates = duplicates;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        DuplicateEnumValuesErrorImpl that = (DuplicateEnumValuesErrorImpl) o;

        return new EqualsBuilder().append(code, that.code).append(message, that.message).append(duplicates,
            that.duplicates).isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(code).append(message).append(duplicates).toHashCode();
    }

}
