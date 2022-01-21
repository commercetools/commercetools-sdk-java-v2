
package com.commercetools.importapi.models.errors;

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
*  <p>The request conflicts with the current state of the involved resources.
*  This error typically occurs when the request attempts to modify a resource that is out of date, that is, it has been modified by another client since the last time it was retrieved by the system attempting to update it.
*  The client application should resolve the conflict (with or without involving the end-user) before retrying the request.</p>
*/
@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class ConcurrentModificationErrorImpl implements ConcurrentModificationError, ModelBase {

    private String code;

    private String message;

    private Long specifiedVersion;

    private Long currentVersion;

    private java.lang.Object conflictedResource;

    @JsonCreator
    ConcurrentModificationErrorImpl(@JsonProperty("message") final String message,
            @JsonProperty("specifiedVersion") final Long specifiedVersion,
            @JsonProperty("currentVersion") final Long currentVersion,
            @JsonProperty("conflictedResource") final java.lang.Object conflictedResource) {
        this.message = message;
        this.specifiedVersion = specifiedVersion;
        this.currentVersion = currentVersion;
        this.conflictedResource = conflictedResource;
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

    /**
    *  <p>The version specified in the failed request.</p>
    */
    public Long getSpecifiedVersion() {
        return this.specifiedVersion;
    }

    /**
    *  <p>The current version of the resource.</p>
    */
    public Long getCurrentVersion() {
        return this.currentVersion;
    }

    /**
    *  <p>The resource in conflict.</p>
    */
    public java.lang.Object getConflictedResource() {
        return this.conflictedResource;
    }

    public void setMessage(final String message) {
        this.message = message;
    }

    public void setSpecifiedVersion(final Long specifiedVersion) {
        this.specifiedVersion = specifiedVersion;
    }

    public void setCurrentVersion(final Long currentVersion) {
        this.currentVersion = currentVersion;
    }

    public void setConflictedResource(final java.lang.Object conflictedResource) {
        this.conflictedResource = conflictedResource;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ConcurrentModificationErrorImpl that = (ConcurrentModificationErrorImpl) o;

        return new EqualsBuilder().append(code, that.code)
                .append(message, that.message)
                .append(specifiedVersion, that.specifiedVersion)
                .append(currentVersion, that.currentVersion)
                .append(conflictedResource, that.conflictedResource)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(code)
                .append(message)
                .append(specifiedVersion)
                .append(currentVersion)
                .append(conflictedResource)
                .toHashCode();
    }

}
