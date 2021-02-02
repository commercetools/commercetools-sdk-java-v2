
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
public final class ConcurrentModificationErrorImpl implements ConcurrentModificationError {

    private String code;

    private String message;

    private Long currentVersion;

    @JsonCreator
    ConcurrentModificationErrorImpl(@JsonProperty("message") final String message,
            @JsonProperty("currentVersion") final Long currentVersion) {
        this.message = message;
        this.currentVersion = currentVersion;
        this.code = CONCURRENT_MODIFICATION;
    }

    public ConcurrentModificationErrorImpl() {
        this.code = CONCURRENT_MODIFICATION;
    }

    public String getCode() {
        return this.code;
    }

    public String getMessage() {
        return this.message;
    }

    public Long getCurrentVersion() {
        return this.currentVersion;
    }

    public void setMessage(final String message) {
        this.message = message;
    }

    public void setCurrentVersion(final Long currentVersion) {
        this.currentVersion = currentVersion;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ConcurrentModificationErrorImpl that = (ConcurrentModificationErrorImpl) o;

        return new EqualsBuilder().append(code, that.code).append(message, that.message).append(currentVersion,
            that.currentVersion).isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(code).append(message).append(currentVersion).toHashCode();
    }

}
