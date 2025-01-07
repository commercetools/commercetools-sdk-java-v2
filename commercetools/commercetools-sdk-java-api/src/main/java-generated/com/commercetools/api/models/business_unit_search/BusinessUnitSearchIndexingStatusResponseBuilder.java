
package com.commercetools.api.models.business_unit_search;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * BusinessUnitSearchIndexingStatusResponseBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     BusinessUnitSearchIndexingStatusResponse businessUnitSearchIndexingStatusResponse = BusinessUnitSearchIndexingStatusResponse.builder()
 *             .status(BusinessUnitIndexingStatus.SCHEDULED)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class BusinessUnitSearchIndexingStatusResponseBuilder
        implements Builder<BusinessUnitSearchIndexingStatusResponse> {

    private com.commercetools.api.models.project.BusinessUnitIndexingStatus status;

    @Nullable
    private com.commercetools.api.models.business_unit_search.BusinessUnitIndexingProgress states;

    @Nullable
    private java.time.ZonedDateTime startedAt;

    @Nullable
    private java.time.ZonedDateTime lastModifiedAt;

    @Nullable
    private Integer retryCount;

    /**
     *  <p>Current status of indexing the Business Unit Search.</p>
     * @param status value to be set
     * @return Builder
     */

    public BusinessUnitSearchIndexingStatusResponseBuilder status(
            final com.commercetools.api.models.project.BusinessUnitIndexingStatus status) {
        this.status = status;
        return this;
    }

    /**
     *  <p>Progress of indexing. Only available when indexing is in progress.</p>
     * @param builder function to build the states value
     * @return Builder
     */

    public BusinessUnitSearchIndexingStatusResponseBuilder states(
            Function<com.commercetools.api.models.business_unit_search.BusinessUnitIndexingProgressBuilder, com.commercetools.api.models.business_unit_search.BusinessUnitIndexingProgressBuilder> builder) {
        this.states = builder
                .apply(com.commercetools.api.models.business_unit_search.BusinessUnitIndexingProgressBuilder.of())
                .build();
        return this;
    }

    /**
     *  <p>Progress of indexing. Only available when indexing is in progress.</p>
     * @param builder function to build the states value
     * @return Builder
     */

    public BusinessUnitSearchIndexingStatusResponseBuilder withStates(
            Function<com.commercetools.api.models.business_unit_search.BusinessUnitIndexingProgressBuilder, com.commercetools.api.models.business_unit_search.BusinessUnitIndexingProgress> builder) {
        this.states = builder
                .apply(com.commercetools.api.models.business_unit_search.BusinessUnitIndexingProgressBuilder.of());
        return this;
    }

    /**
     *  <p>Progress of indexing. Only available when indexing is in progress.</p>
     * @param states value to be set
     * @return Builder
     */

    public BusinessUnitSearchIndexingStatusResponseBuilder states(
            @Nullable final com.commercetools.api.models.business_unit_search.BusinessUnitIndexingProgress states) {
        this.states = states;
        return this;
    }

    /**
     *  <p>Date and time (UTC) when the last indexing started.</p>
     * @param startedAt value to be set
     * @return Builder
     */

    public BusinessUnitSearchIndexingStatusResponseBuilder startedAt(
            @Nullable final java.time.ZonedDateTime startedAt) {
        this.startedAt = startedAt;
        return this;
    }

    /**
     *  <p>Time when the status was last modified.</p>
     * @param lastModifiedAt value to be set
     * @return Builder
     */

    public BusinessUnitSearchIndexingStatusResponseBuilder lastModifiedAt(
            @Nullable final java.time.ZonedDateTime lastModifiedAt) {
        this.lastModifiedAt = lastModifiedAt;
        return this;
    }

    /**
     *  <p>Indicates how many times the system tried to start indexing after failed attempts. The counter is set to null after an indexing finished successfully.</p>
     * @param retryCount value to be set
     * @return Builder
     */

    public BusinessUnitSearchIndexingStatusResponseBuilder retryCount(@Nullable final Integer retryCount) {
        this.retryCount = retryCount;
        return this;
    }

    /**
     *  <p>Current status of indexing the Business Unit Search.</p>
     * @return status
     */

    public com.commercetools.api.models.project.BusinessUnitIndexingStatus getStatus() {
        return this.status;
    }

    /**
     *  <p>Progress of indexing. Only available when indexing is in progress.</p>
     * @return states
     */

    @Nullable
    public com.commercetools.api.models.business_unit_search.BusinessUnitIndexingProgress getStates() {
        return this.states;
    }

    /**
     *  <p>Date and time (UTC) when the last indexing started.</p>
     * @return startedAt
     */

    @Nullable
    public java.time.ZonedDateTime getStartedAt() {
        return this.startedAt;
    }

    /**
     *  <p>Time when the status was last modified.</p>
     * @return lastModifiedAt
     */

    @Nullable
    public java.time.ZonedDateTime getLastModifiedAt() {
        return this.lastModifiedAt;
    }

    /**
     *  <p>Indicates how many times the system tried to start indexing after failed attempts. The counter is set to null after an indexing finished successfully.</p>
     * @return retryCount
     */

    @Nullable
    public Integer getRetryCount() {
        return this.retryCount;
    }

    /**
     * builds BusinessUnitSearchIndexingStatusResponse with checking for non-null required values
     * @return BusinessUnitSearchIndexingStatusResponse
     */
    public BusinessUnitSearchIndexingStatusResponse build() {
        Objects.requireNonNull(status, BusinessUnitSearchIndexingStatusResponse.class + ": status is missing");
        return new BusinessUnitSearchIndexingStatusResponseImpl(status, states, startedAt, lastModifiedAt, retryCount);
    }

    /**
     * builds BusinessUnitSearchIndexingStatusResponse without checking for non-null required values
     * @return BusinessUnitSearchIndexingStatusResponse
     */
    public BusinessUnitSearchIndexingStatusResponse buildUnchecked() {
        return new BusinessUnitSearchIndexingStatusResponseImpl(status, states, startedAt, lastModifiedAt, retryCount);
    }

    /**
     * factory method for an instance of BusinessUnitSearchIndexingStatusResponseBuilder
     * @return builder
     */
    public static BusinessUnitSearchIndexingStatusResponseBuilder of() {
        return new BusinessUnitSearchIndexingStatusResponseBuilder();
    }

    /**
     * create builder for BusinessUnitSearchIndexingStatusResponse instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static BusinessUnitSearchIndexingStatusResponseBuilder of(
            final BusinessUnitSearchIndexingStatusResponse template) {
        BusinessUnitSearchIndexingStatusResponseBuilder builder = new BusinessUnitSearchIndexingStatusResponseBuilder();
        builder.status = template.getStatus();
        builder.states = template.getStates();
        builder.startedAt = template.getStartedAt();
        builder.lastModifiedAt = template.getLastModifiedAt();
        builder.retryCount = template.getRetryCount();
        return builder;
    }

}
