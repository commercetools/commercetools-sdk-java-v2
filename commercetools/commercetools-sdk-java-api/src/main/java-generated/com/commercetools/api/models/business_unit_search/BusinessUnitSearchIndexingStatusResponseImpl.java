
package com.commercetools.api.models.business_unit_search;

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
 * BusinessUnitSearchIndexingStatusResponse
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class BusinessUnitSearchIndexingStatusResponseImpl
        implements BusinessUnitSearchIndexingStatusResponse, ModelBase {

    private com.commercetools.api.models.project.BusinessUnitIndexingStatus status;

    private com.commercetools.api.models.business_unit_search.BusinessUnitIndexingProgress states;

    private java.time.ZonedDateTime startedAt;

    private java.time.ZonedDateTime lastModifiedAt;

    private Integer retryCount;

    /**
     * create instance with all properties
     */
    @JsonCreator
    BusinessUnitSearchIndexingStatusResponseImpl(
            @JsonProperty("status") final com.commercetools.api.models.project.BusinessUnitIndexingStatus status,
            @JsonProperty("states") final com.commercetools.api.models.business_unit_search.BusinessUnitIndexingProgress states,
            @JsonProperty("startedAt") final java.time.ZonedDateTime startedAt,
            @JsonProperty("lastModifiedAt") final java.time.ZonedDateTime lastModifiedAt,
            @JsonProperty("retryCount") final Integer retryCount) {
        this.status = status;
        this.states = states;
        this.startedAt = startedAt;
        this.lastModifiedAt = lastModifiedAt;
        this.retryCount = retryCount;
    }

    /**
     * create empty instance
     */
    public BusinessUnitSearchIndexingStatusResponseImpl() {
    }

    /**
     *  <p>Current status of indexing the Business Unit Search.</p>
     */

    public com.commercetools.api.models.project.BusinessUnitIndexingStatus getStatus() {
        return this.status;
    }

    /**
     *  <p>Progress of indexing. Only available when indexing is in progress.</p>
     */

    public com.commercetools.api.models.business_unit_search.BusinessUnitIndexingProgress getStates() {
        return this.states;
    }

    /**
     *  <p>Date and time (UTC) when the last indexing started.</p>
     */

    public java.time.ZonedDateTime getStartedAt() {
        return this.startedAt;
    }

    /**
     *  <p>Time when the status was last modified.</p>
     */

    public java.time.ZonedDateTime getLastModifiedAt() {
        return this.lastModifiedAt;
    }

    /**
     *  <p>Indicates how many times the system tried to start indexing after failed attempts. The counter is set to null after an indexing finished successfully.</p>
     */

    public Integer getRetryCount() {
        return this.retryCount;
    }

    public void setStatus(final com.commercetools.api.models.project.BusinessUnitIndexingStatus status) {
        this.status = status;
    }

    public void setStates(final com.commercetools.api.models.business_unit_search.BusinessUnitIndexingProgress states) {
        this.states = states;
    }

    public void setStartedAt(final java.time.ZonedDateTime startedAt) {
        this.startedAt = startedAt;
    }

    public void setLastModifiedAt(final java.time.ZonedDateTime lastModifiedAt) {
        this.lastModifiedAt = lastModifiedAt;
    }

    public void setRetryCount(final Integer retryCount) {
        this.retryCount = retryCount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        BusinessUnitSearchIndexingStatusResponseImpl that = (BusinessUnitSearchIndexingStatusResponseImpl) o;

        return new EqualsBuilder().append(status, that.status)
                .append(states, that.states)
                .append(startedAt, that.startedAt)
                .append(lastModifiedAt, that.lastModifiedAt)
                .append(retryCount, that.retryCount)
                .append(status, that.status)
                .append(states, that.states)
                .append(startedAt, that.startedAt)
                .append(lastModifiedAt, that.lastModifiedAt)
                .append(retryCount, that.retryCount)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(status)
                .append(states)
                .append(startedAt)
                .append(lastModifiedAt)
                .append(retryCount)
                .toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("status", status)
                .append("states", states)
                .append("startedAt", startedAt)
                .append("lastModifiedAt", lastModifiedAt)
                .append("retryCount", retryCount)
                .build();
    }

    @Override
    public BusinessUnitSearchIndexingStatusResponse copyDeep() {
        return BusinessUnitSearchIndexingStatusResponse.deepCopy(this);
    }
}
