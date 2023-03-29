
package com.commercetools.api.models.project;

import java.time.*;
import java.time.ZonedDateTime;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;
import javax.validation.Valid;

import com.commercetools.api.models.common.LastModifiedBy;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * SearchIndexingConfigurationValues
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     SearchIndexingConfigurationValues searchIndexingConfigurationValues = SearchIndexingConfigurationValues.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = SearchIndexingConfigurationValuesImpl.class)
public interface SearchIndexingConfigurationValues {

    /**
     *  <p>Current status of resource indexing. Present on Projects from 1 February 2019.</p>
     * @return status
     */

    @JsonProperty("status")
    public SearchIndexingConfigurationStatus getStatus();

    /**
     *  <p>Date and time (UTC) the Project was last updated. Only present on Projects last modified after 1 February 2019.</p>
     * @return lastModifiedAt
     */

    @JsonProperty("lastModifiedAt")
    public ZonedDateTime getLastModifiedAt();

    /**
     *  <p>Present on resources created after 1 February 2019 except for events not tracked.</p>
     * @return lastModifiedBy
     */
    @Valid
    @JsonProperty("lastModifiedBy")
    public LastModifiedBy getLastModifiedBy();

    /**
     *  <p>Current status of resource indexing. Present on Projects from 1 February 2019.</p>
     * @param status value to be set
     */

    public void setStatus(final SearchIndexingConfigurationStatus status);

    /**
     *  <p>Date and time (UTC) the Project was last updated. Only present on Projects last modified after 1 February 2019.</p>
     * @param lastModifiedAt value to be set
     */

    public void setLastModifiedAt(final ZonedDateTime lastModifiedAt);

    /**
     *  <p>Present on resources created after 1 February 2019 except for events not tracked.</p>
     * @param lastModifiedBy value to be set
     */

    public void setLastModifiedBy(final LastModifiedBy lastModifiedBy);

    /**
     * factory method
     * @return instance of SearchIndexingConfigurationValues
     */
    public static SearchIndexingConfigurationValues of() {
        return new SearchIndexingConfigurationValuesImpl();
    }

    /**
     * factory method to create a shallow copy SearchIndexingConfigurationValues
     * @param template instance to be copied
     * @return copy instance
     */
    public static SearchIndexingConfigurationValues of(final SearchIndexingConfigurationValues template) {
        SearchIndexingConfigurationValuesImpl instance = new SearchIndexingConfigurationValuesImpl();
        instance.setStatus(template.getStatus());
        instance.setLastModifiedAt(template.getLastModifiedAt());
        instance.setLastModifiedBy(template.getLastModifiedBy());
        return instance;
    }

    /**
     * factory method to create a deep copy of SearchIndexingConfigurationValues
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static SearchIndexingConfigurationValues deepCopy(
            @Nullable final SearchIndexingConfigurationValues template) {
        if (template == null) {
            return null;
        }
        SearchIndexingConfigurationValuesImpl instance = new SearchIndexingConfigurationValuesImpl();
        instance.setStatus(template.getStatus());
        instance.setLastModifiedAt(template.getLastModifiedAt());
        instance.setLastModifiedBy(
            com.commercetools.api.models.common.LastModifiedBy.deepCopy(template.getLastModifiedBy()));
        return instance;
    }

    /**
     * builder factory method for SearchIndexingConfigurationValues
     * @return builder
     */
    public static SearchIndexingConfigurationValuesBuilder builder() {
        return SearchIndexingConfigurationValuesBuilder.of();
    }

    /**
     * create builder for SearchIndexingConfigurationValues instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static SearchIndexingConfigurationValuesBuilder builder(final SearchIndexingConfigurationValues template) {
        return SearchIndexingConfigurationValuesBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withSearchIndexingConfigurationValues(Function<SearchIndexingConfigurationValues, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<SearchIndexingConfigurationValues> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<SearchIndexingConfigurationValues>() {
            @Override
            public String toString() {
                return "TypeReference<SearchIndexingConfigurationValues>";
            }
        };
    }
}
