
package com.commercetools.api.models.common;

import java.lang.Object;
import java.time.ZonedDateTime;
import java.util.*;

import javax.annotation.Nullable;

import com.commercetools.api.models.common.BaseResource;
import com.commercetools.api.models.common.PagedQueryResponse;
import com.commercetools.api.models.product.FacetResults;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class PagedQueryResponseBuilder {

    private Long limit;

    private Long count;

    @Nullable
    private Long total;

    private Long offset;

    private java.util.List<com.commercetools.api.models.common.BaseResource> results;

    @Nullable
    private com.commercetools.api.models.product.FacetResults facets;

    @Nullable
    private java.lang.Object meta;

    public PagedQueryResponseBuilder limit(final Long limit) {
        this.limit = limit;
        return this;
    }

    public PagedQueryResponseBuilder count(final Long count) {
        this.count = count;
        return this;
    }

    public PagedQueryResponseBuilder total(@Nullable final Long total) {
        this.total = total;
        return this;
    }

    public PagedQueryResponseBuilder offset(final Long offset) {
        this.offset = offset;
        return this;
    }

    public PagedQueryResponseBuilder results(final com.commercetools.api.models.common.BaseResource... results) {
        this.results = new ArrayList<>(Arrays.asList(results));
        return this;
    }

    public PagedQueryResponseBuilder results(
            final java.util.List<com.commercetools.api.models.common.BaseResource> results) {
        this.results = results;
        return this;
    }

    public PagedQueryResponseBuilder facets(@Nullable final com.commercetools.api.models.product.FacetResults facets) {
        this.facets = facets;
        return this;
    }

    public PagedQueryResponseBuilder meta(@Nullable final java.lang.Object meta) {
        this.meta = meta;
        return this;
    }

    public Long getLimit() {
        return this.limit;
    }

    public Long getCount() {
        return this.count;
    }

    @Nullable
    public Long getTotal() {
        return this.total;
    }

    public Long getOffset() {
        return this.offset;
    }

    public java.util.List<com.commercetools.api.models.common.BaseResource> getResults() {
        return this.results;
    }

    @Nullable
    public com.commercetools.api.models.product.FacetResults getFacets() {
        return this.facets;
    }

    @Nullable
    public java.lang.Object getMeta() {
        return this.meta;
    }

    public PagedQueryResponse build() {
        return new PagedQueryResponseImpl(limit, count, total, offset, results, facets, meta);
    }

    public static PagedQueryResponseBuilder of() {
        return new PagedQueryResponseBuilder();
    }

    public static PagedQueryResponseBuilder of(final PagedQueryResponse template) {
        PagedQueryResponseBuilder builder = new PagedQueryResponseBuilder();
        builder.limit = template.getLimit();
        builder.count = template.getCount();
        builder.total = template.getTotal();
        builder.offset = template.getOffset();
        builder.results = template.getResults();
        builder.facets = template.getFacets();
        builder.meta = template.getMeta();
        return builder;
    }

}
