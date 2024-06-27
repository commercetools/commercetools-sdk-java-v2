
package com.commercetools.api.models.customer_search;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * CustomerSearchIndexingStatusResponseBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CustomerSearchIndexingStatusResponse customerSearchIndexingStatusResponse = CustomerSearchIndexingStatusResponse.builder()
 *             .status(CustomerIndexingStatus.SCHEDULED)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class CustomerSearchIndexingStatusResponseBuilder implements Builder<CustomerSearchIndexingStatusResponse> {

    private com.commercetools.api.models.project.CustomerIndexingStatus status;

    @Nullable
    private com.commercetools.api.models.customer_search.CustomerIndexingProgress states;

    @Nullable
    private java.time.ZonedDateTime startedAt;

    @Nullable
    private java.time.ZonedDateTime lastModifiedAt;

    @Nullable
    private Integer retryCount;

    /**
     *  <p>Current status of indexing the Customer Search.</p>
     * @param status value to be set
     * @return Builder
     */

    public CustomerSearchIndexingStatusResponseBuilder status(
            final com.commercetools.api.models.project.CustomerIndexingStatus status) {
        this.status = status;
        return this;
    }

    /**
     *  <p>Progress of indexing. Only available when indexing is in progress.</p>
     * @param builder function to build the states value
     * @return Builder
     */

    public CustomerSearchIndexingStatusResponseBuilder states(
            Function<com.commercetools.api.models.customer_search.CustomerIndexingProgressBuilder, com.commercetools.api.models.customer_search.CustomerIndexingProgressBuilder> builder) {
        this.states = builder.apply(com.commercetools.api.models.customer_search.CustomerIndexingProgressBuilder.of())
                .build();
        return this;
    }

    /**
     *  <p>Progress of indexing. Only available when indexing is in progress.</p>
     * @param builder function to build the states value
     * @return Builder
     */

    public CustomerSearchIndexingStatusResponseBuilder withStates(
            Function<com.commercetools.api.models.customer_search.CustomerIndexingProgressBuilder, com.commercetools.api.models.customer_search.CustomerIndexingProgress> builder) {
        this.states = builder.apply(com.commercetools.api.models.customer_search.CustomerIndexingProgressBuilder.of());
        return this;
    }

    /**
     *  <p>Progress of indexing. Only available when indexing is in progress.</p>
     * @param states value to be set
     * @return Builder
     */

    public CustomerSearchIndexingStatusResponseBuilder states(
            @Nullable final com.commercetools.api.models.customer_search.CustomerIndexingProgress states) {
        this.states = states;
        return this;
    }

    /**
     *  <p>Date and time (UTC) when the last indexing started.</p>
     * @param startedAt value to be set
     * @return Builder
     */

    public CustomerSearchIndexingStatusResponseBuilder startedAt(@Nullable final java.time.ZonedDateTime startedAt) {
        this.startedAt = startedAt;
        return this;
    }

    /**
     *  <p>Time when the status was last modified.</p>
     * @param lastModifiedAt value to be set
     * @return Builder
     */

    public CustomerSearchIndexingStatusResponseBuilder lastModifiedAt(
            @Nullable final java.time.ZonedDateTime lastModifiedAt) {
        this.lastModifiedAt = lastModifiedAt;
        return this;
    }

    /**
     *  <p>Indicates how many times the system tried to start indexing after failed attempts. The counter is set to null after an indexing finished successfully.</p>
     * @param retryCount value to be set
     * @return Builder
     */

    public CustomerSearchIndexingStatusResponseBuilder retryCount(@Nullable final Integer retryCount) {
        this.retryCount = retryCount;
        return this;
    }

    /**
     *  <p>Current status of indexing the Customer Search.</p>
     * @return status
     */

    public com.commercetools.api.models.project.CustomerIndexingStatus getStatus() {
        return this.status;
    }

    /**
     *  <p>Progress of indexing. Only available when indexing is in progress.</p>
     * @return states
     */

    @Nullable
    public com.commercetools.api.models.customer_search.CustomerIndexingProgress getStates() {
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
     * builds CustomerSearchIndexingStatusResponse with checking for non-null required values
     * @return CustomerSearchIndexingStatusResponse
     */
    public CustomerSearchIndexingStatusResponse build() {
        Objects.requireNonNull(status, CustomerSearchIndexingStatusResponse.class + ": status is missing");
        return new CustomerSearchIndexingStatusResponseImpl(status, states, startedAt, lastModifiedAt, retryCount);
    }

    /**
     * builds CustomerSearchIndexingStatusResponse without checking for non-null required values
     * @return CustomerSearchIndexingStatusResponse
     */
    public CustomerSearchIndexingStatusResponse buildUnchecked() {
        return new CustomerSearchIndexingStatusResponseImpl(status, states, startedAt, lastModifiedAt, retryCount);
    }

    /**
     * factory method for an instance of CustomerSearchIndexingStatusResponseBuilder
     * @return builder
     */
    public static CustomerSearchIndexingStatusResponseBuilder of() {
        return new CustomerSearchIndexingStatusResponseBuilder();
    }

    /**
     * create builder for CustomerSearchIndexingStatusResponse instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CustomerSearchIndexingStatusResponseBuilder of(final CustomerSearchIndexingStatusResponse template) {
        CustomerSearchIndexingStatusResponseBuilder builder = new CustomerSearchIndexingStatusResponseBuilder();
        builder.status = template.getStatus();
        builder.states = template.getStates();
        builder.startedAt = template.getStartedAt();
        builder.lastModifiedAt = template.getLastModifiedAt();
        builder.retryCount = template.getRetryCount();
        return builder;
    }

}
