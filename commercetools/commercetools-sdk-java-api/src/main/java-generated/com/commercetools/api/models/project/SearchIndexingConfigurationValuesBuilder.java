
package com.commercetools.api.models.project;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * SearchIndexingConfigurationValuesBuilder
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
public class SearchIndexingConfigurationValuesBuilder implements Builder<SearchIndexingConfigurationValues> {

    @Nullable
    private com.commercetools.api.models.project.SearchIndexingConfigurationStatus status;

    @Nullable
    private java.time.ZonedDateTime lastModifiedAt;

    @Nullable
    private com.commercetools.api.models.common.LastModifiedBy lastModifiedBy;

    /**
     *  <p>Current status of resource indexing. Present on Projects from 1 February 2019.</p>
     * @param status value to be set
     * @return Builder
     */

    public SearchIndexingConfigurationValuesBuilder status(
            @Nullable final com.commercetools.api.models.project.SearchIndexingConfigurationStatus status) {
        this.status = status;
        return this;
    }

    /**
     *  <p>Date and time (UTC) the Project was last updated. Only present on Projects last modified after 1 February 2019.</p>
     * @param lastModifiedAt value to be set
     * @return Builder
     */

    public SearchIndexingConfigurationValuesBuilder lastModifiedAt(
            @Nullable final java.time.ZonedDateTime lastModifiedAt) {
        this.lastModifiedAt = lastModifiedAt;
        return this;
    }

    /**
     *  <p>IDs and references that last modified the SearchIndexingConfigurationValues.</p>
     * @param builder function to build the lastModifiedBy value
     * @return Builder
     */

    public SearchIndexingConfigurationValuesBuilder lastModifiedBy(
            Function<com.commercetools.api.models.common.LastModifiedByBuilder, com.commercetools.api.models.common.LastModifiedByBuilder> builder) {
        this.lastModifiedBy = builder.apply(com.commercetools.api.models.common.LastModifiedByBuilder.of()).build();
        return this;
    }

    /**
     *  <p>IDs and references that last modified the SearchIndexingConfigurationValues.</p>
     * @param builder function to build the lastModifiedBy value
     * @return Builder
     */

    public SearchIndexingConfigurationValuesBuilder withLastModifiedBy(
            Function<com.commercetools.api.models.common.LastModifiedByBuilder, com.commercetools.api.models.common.LastModifiedBy> builder) {
        this.lastModifiedBy = builder.apply(com.commercetools.api.models.common.LastModifiedByBuilder.of());
        return this;
    }

    /**
     *  <p>IDs and references that last modified the SearchIndexingConfigurationValues.</p>
     * @param lastModifiedBy value to be set
     * @return Builder
     */

    public SearchIndexingConfigurationValuesBuilder lastModifiedBy(
            @Nullable final com.commercetools.api.models.common.LastModifiedBy lastModifiedBy) {
        this.lastModifiedBy = lastModifiedBy;
        return this;
    }

    /**
     *  <p>Current status of resource indexing. Present on Projects from 1 February 2019.</p>
     * @return status
     */

    @Nullable
    public com.commercetools.api.models.project.SearchIndexingConfigurationStatus getStatus() {
        return this.status;
    }

    /**
     *  <p>Date and time (UTC) the Project was last updated. Only present on Projects last modified after 1 February 2019.</p>
     * @return lastModifiedAt
     */

    @Nullable
    public java.time.ZonedDateTime getLastModifiedAt() {
        return this.lastModifiedAt;
    }

    /**
     *  <p>IDs and references that last modified the SearchIndexingConfigurationValues.</p>
     * @return lastModifiedBy
     */

    @Nullable
    public com.commercetools.api.models.common.LastModifiedBy getLastModifiedBy() {
        return this.lastModifiedBy;
    }

    /**
     * builds SearchIndexingConfigurationValues with checking for non-null required values
     * @return SearchIndexingConfigurationValues
     */
    public SearchIndexingConfigurationValues build() {
        return new SearchIndexingConfigurationValuesImpl(status, lastModifiedAt, lastModifiedBy);
    }

    /**
     * builds SearchIndexingConfigurationValues without checking for non-null required values
     * @return SearchIndexingConfigurationValues
     */
    public SearchIndexingConfigurationValues buildUnchecked() {
        return new SearchIndexingConfigurationValuesImpl(status, lastModifiedAt, lastModifiedBy);
    }

    /**
     * factory method for an instance of SearchIndexingConfigurationValuesBuilder
     * @return builder
     */
    public static SearchIndexingConfigurationValuesBuilder of() {
        return new SearchIndexingConfigurationValuesBuilder();
    }

    /**
     * create builder for SearchIndexingConfigurationValues instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static SearchIndexingConfigurationValuesBuilder of(final SearchIndexingConfigurationValues template) {
        SearchIndexingConfigurationValuesBuilder builder = new SearchIndexingConfigurationValuesBuilder();
        builder.status = template.getStatus();
        builder.lastModifiedAt = template.getLastModifiedAt();
        builder.lastModifiedBy = template.getLastModifiedBy();
        return builder;
    }

}
