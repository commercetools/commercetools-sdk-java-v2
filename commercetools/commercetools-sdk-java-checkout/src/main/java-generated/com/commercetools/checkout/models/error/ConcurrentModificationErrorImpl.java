
package com.commercetools.checkout.models.error;

import java.time.*;
import java.util.*;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.ModelBase;
import io.vrap.rmf.base.client.utils.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 *  <p>Returned when the request conflicts with the current state of the involved resources. Typically, the request attempts to modify a resource that is out of date (that is modified by another client since it was last retrieved). The client application should resolve the conflict (with or without involving the end user) before retrying the request.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ConcurrentModificationErrorImpl implements ConcurrentModificationError, ModelBase {

    private String code;

    private String message;

    private String resourceId;

    private Long expectedVersion;

    private Long currentVersion;

    /**
     * create instance with all properties
     */
    @JsonCreator
    ConcurrentModificationErrorImpl(@JsonProperty("message") final String message,
            @JsonProperty("resourceId") final String resourceId,
            @JsonProperty("expectedVersion") final Long expectedVersion,
            @JsonProperty("currentVersion") final Long currentVersion) {
        this.message = message;
        this.resourceId = resourceId;
        this.expectedVersion = expectedVersion;
        this.currentVersion = currentVersion;
        this.code = CONCURRENT_MODIFICATION;
    }

    /**
     * create empty instance
     */
    public ConcurrentModificationErrorImpl() {
        this.code = CONCURRENT_MODIFICATION;
    }

    /**
     *
     */

    public String getCode() {
        return this.code;
    }

    /**
     *  <p><code>"Object $resourceId has a different version than expected. Expected: $expectedVersion - Actual: $currentVersion."</code></p>
     */

    public String getMessage() {
        return this.message;
    }

    /**
     *  <p>The ID of the resource that has a version conflict.</p>
     */

    public String getResourceId() {
        return this.resourceId;
    }

    /**
     *  <p>Expected version of the resource.</p>
     */

    public Long getExpectedVersion() {
        return this.expectedVersion;
    }

    /**
     *  <p>Current version of the resource.</p>
     */

    public Long getCurrentVersion() {
        return this.currentVersion;
    }

    public void setMessage(final String message) {
        this.message = message;
    }

    public void setResourceId(final String resourceId) {
        this.resourceId = resourceId;
    }

    public void setExpectedVersion(final Long expectedVersion) {
        this.expectedVersion = expectedVersion;
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

        return new EqualsBuilder().append(code, that.code)
                .append(message, that.message)
                .append(resourceId, that.resourceId)
                .append(expectedVersion, that.expectedVersion)
                .append(currentVersion, that.currentVersion)
                .append(code, that.code)
                .append(message, that.message)
                .append(resourceId, that.resourceId)
                .append(expectedVersion, that.expectedVersion)
                .append(currentVersion, that.currentVersion)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(code)
                .append(message)
                .append(resourceId)
                .append(expectedVersion)
                .append(currentVersion)
                .toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("code", code)
                .append("message", message)
                .append("resourceId", resourceId)
                .append("expectedVersion", expectedVersion)
                .append("currentVersion", currentVersion)
                .build();
    }

    @Override
    public ConcurrentModificationError copyDeep() {
        return ConcurrentModificationError.deepCopy(this);
    }
}
