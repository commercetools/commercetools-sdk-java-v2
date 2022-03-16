
package com.commercetools.api.models.project;

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
public class SearchIndexingConfigurationValuesImpl implements SearchIndexingConfigurationValues, ModelBase {

    private com.commercetools.api.models.project.SearchIndexingConfigurationStatus status;

    private java.time.ZonedDateTime lastModifiedAt;

    private com.commercetools.api.models.common.LastModifiedBy lastModifiedBy;

    @JsonCreator
    SearchIndexingConfigurationValuesImpl(
            @JsonProperty("status") final com.commercetools.api.models.project.SearchIndexingConfigurationStatus status,
            @JsonProperty("lastModifiedAt") final java.time.ZonedDateTime lastModifiedAt,
            @JsonProperty("lastModifiedBy") final com.commercetools.api.models.common.LastModifiedBy lastModifiedBy) {
        this.status = status;
        this.lastModifiedAt = lastModifiedAt;
        this.lastModifiedBy = lastModifiedBy;
    }

    public SearchIndexingConfigurationValuesImpl() {
    }

    /**
    *  <p>Current status of resource indexing. Present on Projects from 1 February 2019.</p>
    */
    public com.commercetools.api.models.project.SearchIndexingConfigurationStatus getStatus() {
        return this.status;
    }

    /**
    *  <p>Date and time (UTC) the Project was last updated. Only present on Projects last modified after 1 February 2019.</p>
    */
    public java.time.ZonedDateTime getLastModifiedAt() {
        return this.lastModifiedAt;
    }

    /**
    *  <p>Present on resources created after 1 February 2019 except for <a href="/../api/client-logging#events-tracked">events not tracked</a>.</p>
    */
    public com.commercetools.api.models.common.LastModifiedBy getLastModifiedBy() {
        return this.lastModifiedBy;
    }

    public void setStatus(final com.commercetools.api.models.project.SearchIndexingConfigurationStatus status) {
        this.status = status;
    }

    public void setLastModifiedAt(final java.time.ZonedDateTime lastModifiedAt) {
        this.lastModifiedAt = lastModifiedAt;
    }

    public void setLastModifiedBy(final com.commercetools.api.models.common.LastModifiedBy lastModifiedBy) {
        this.lastModifiedBy = lastModifiedBy;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        SearchIndexingConfigurationValuesImpl that = (SearchIndexingConfigurationValuesImpl) o;

        return new EqualsBuilder().append(status, that.status)
                .append(lastModifiedAt, that.lastModifiedAt)
                .append(lastModifiedBy, that.lastModifiedBy)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(status).append(lastModifiedAt).append(lastModifiedBy).toHashCode();
    }

}
