
package com.commercetools.api.models.project;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class SearchIndexingConfigurationValuesBuilder implements Builder<SearchIndexingConfigurationValues> {

    @Nullable
    private com.commercetools.api.models.project.SearchIndexingConfigurationStatus status;

    @Nullable
    private java.time.ZonedDateTime lastModifiedAt;

    @Nullable
    private com.commercetools.api.models.common.LastModifiedBy lastModifiedBy;

    public SearchIndexingConfigurationValuesBuilder status(
            @Nullable final com.commercetools.api.models.project.SearchIndexingConfigurationStatus status) {
        this.status = status;
        return this;
    }

    public SearchIndexingConfigurationValuesBuilder lastModifiedAt(
            @Nullable final java.time.ZonedDateTime lastModifiedAt) {
        this.lastModifiedAt = lastModifiedAt;
        return this;
    }

    public SearchIndexingConfigurationValuesBuilder lastModifiedBy(
            Function<com.commercetools.api.models.common.LastModifiedByBuilder, com.commercetools.api.models.common.LastModifiedByBuilder> builder) {
        this.lastModifiedBy = builder.apply(com.commercetools.api.models.common.LastModifiedByBuilder.of()).build();
        return this;
    }

    public SearchIndexingConfigurationValuesBuilder lastModifiedBy(
            @Nullable final com.commercetools.api.models.common.LastModifiedBy lastModifiedBy) {
        this.lastModifiedBy = lastModifiedBy;
        return this;
    }

    @Nullable
    public com.commercetools.api.models.project.SearchIndexingConfigurationStatus getStatus() {
        return this.status;
    }

    @Nullable
    public java.time.ZonedDateTime getLastModifiedAt() {
        return this.lastModifiedAt;
    }

    @Nullable
    public com.commercetools.api.models.common.LastModifiedBy getLastModifiedBy() {
        return this.lastModifiedBy;
    }

    public SearchIndexingConfigurationValues build() {
        return new SearchIndexingConfigurationValuesImpl(status, lastModifiedAt, lastModifiedBy);
    }

    /**
     * builds SearchIndexingConfigurationValues without checking for non null required values
     */
    public SearchIndexingConfigurationValues buildUnchecked() {
        return new SearchIndexingConfigurationValuesImpl(status, lastModifiedAt, lastModifiedBy);
    }

    public static SearchIndexingConfigurationValuesBuilder of() {
        return new SearchIndexingConfigurationValuesBuilder();
    }

    public static SearchIndexingConfigurationValuesBuilder of(final SearchIndexingConfigurationValues template) {
        SearchIndexingConfigurationValuesBuilder builder = new SearchIndexingConfigurationValuesBuilder();
        builder.status = template.getStatus();
        builder.lastModifiedAt = template.getLastModifiedAt();
        builder.lastModifiedBy = template.getLastModifiedBy();
        return builder;
    }

}
