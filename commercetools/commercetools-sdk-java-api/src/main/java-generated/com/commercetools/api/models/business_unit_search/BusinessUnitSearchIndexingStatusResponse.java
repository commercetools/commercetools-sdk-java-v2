
package com.commercetools.api.models.business_unit_search;

import java.time.*;
import java.time.ZonedDateTime;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.commercetools.api.models.project.BusinessUnitIndexingStatus;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

/**
 * BusinessUnitSearchIndexingStatusResponse
 *
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
@JsonDeserialize(as = BusinessUnitSearchIndexingStatusResponseImpl.class)
public interface BusinessUnitSearchIndexingStatusResponse {

    /**
     *  <p>Current status of indexing the Business Unit Search.</p>
     * @return status
     */
    @NotNull
    @JsonProperty("status")
    public BusinessUnitIndexingStatus getStatus();

    /**
     *  <p>Progress of indexing. Only available when indexing is in progress.</p>
     * @return states
     */
    @Valid
    @JsonProperty("states")
    public BusinessUnitIndexingProgress getStates();

    /**
     *  <p>Date and time (UTC) when the last indexing started.</p>
     * @return startedAt
     */

    @JsonProperty("startedAt")
    public ZonedDateTime getStartedAt();

    /**
     *  <p>Time when the status was last modified.</p>
     * @return lastModifiedAt
     */

    @JsonProperty("lastModifiedAt")
    public ZonedDateTime getLastModifiedAt();

    /**
     *  <p>Indicates how many times the system tried to start indexing after failed attempts. The counter is set to null after an indexing finished successfully.</p>
     * @return retryCount
     */

    @JsonProperty("retryCount")
    public Integer getRetryCount();

    /**
     *  <p>Current status of indexing the Business Unit Search.</p>
     * @param status value to be set
     */

    public void setStatus(final BusinessUnitIndexingStatus status);

    /**
     *  <p>Progress of indexing. Only available when indexing is in progress.</p>
     * @param states value to be set
     */

    public void setStates(final BusinessUnitIndexingProgress states);

    /**
     *  <p>Date and time (UTC) when the last indexing started.</p>
     * @param startedAt value to be set
     */

    public void setStartedAt(final ZonedDateTime startedAt);

    /**
     *  <p>Time when the status was last modified.</p>
     * @param lastModifiedAt value to be set
     */

    public void setLastModifiedAt(final ZonedDateTime lastModifiedAt);

    /**
     *  <p>Indicates how many times the system tried to start indexing after failed attempts. The counter is set to null after an indexing finished successfully.</p>
     * @param retryCount value to be set
     */

    public void setRetryCount(final Integer retryCount);

    /**
     * factory method
     * @return instance of BusinessUnitSearchIndexingStatusResponse
     */
    public static BusinessUnitSearchIndexingStatusResponse of() {
        return new BusinessUnitSearchIndexingStatusResponseImpl();
    }

    /**
     * factory method to create a shallow copy BusinessUnitSearchIndexingStatusResponse
     * @param template instance to be copied
     * @return copy instance
     */
    public static BusinessUnitSearchIndexingStatusResponse of(final BusinessUnitSearchIndexingStatusResponse template) {
        BusinessUnitSearchIndexingStatusResponseImpl instance = new BusinessUnitSearchIndexingStatusResponseImpl();
        instance.setStatus(template.getStatus());
        instance.setStates(template.getStates());
        instance.setStartedAt(template.getStartedAt());
        instance.setLastModifiedAt(template.getLastModifiedAt());
        instance.setRetryCount(template.getRetryCount());
        return instance;
    }

    public BusinessUnitSearchIndexingStatusResponse copyDeep();

    /**
     * factory method to create a deep copy of BusinessUnitSearchIndexingStatusResponse
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static BusinessUnitSearchIndexingStatusResponse deepCopy(
            @Nullable final BusinessUnitSearchIndexingStatusResponse template) {
        if (template == null) {
            return null;
        }
        BusinessUnitSearchIndexingStatusResponseImpl instance = new BusinessUnitSearchIndexingStatusResponseImpl();
        instance.setStatus(template.getStatus());
        instance.setStates(com.commercetools.api.models.business_unit_search.BusinessUnitIndexingProgress
                .deepCopy(template.getStates()));
        instance.setStartedAt(template.getStartedAt());
        instance.setLastModifiedAt(template.getLastModifiedAt());
        instance.setRetryCount(template.getRetryCount());
        return instance;
    }

    /**
     * builder factory method for BusinessUnitSearchIndexingStatusResponse
     * @return builder
     */
    public static BusinessUnitSearchIndexingStatusResponseBuilder builder() {
        return BusinessUnitSearchIndexingStatusResponseBuilder.of();
    }

    /**
     * create builder for BusinessUnitSearchIndexingStatusResponse instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static BusinessUnitSearchIndexingStatusResponseBuilder builder(
            final BusinessUnitSearchIndexingStatusResponse template) {
        return BusinessUnitSearchIndexingStatusResponseBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withBusinessUnitSearchIndexingStatusResponse(
            Function<BusinessUnitSearchIndexingStatusResponse, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<BusinessUnitSearchIndexingStatusResponse> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<BusinessUnitSearchIndexingStatusResponse>() {
            @Override
            public String toString() {
                return "TypeReference<BusinessUnitSearchIndexingStatusResponse>";
            }
        };
    }
}
