
package com.commercetools.api.models.common;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class PagedQueryResponseBuilder implements Builder<PagedQueryResponse> {

    private Long limit;

    private Long count;

    @Nullable
    private Long total;

    private Long offset;

    private java.util.List<com.commercetools.api.models.common.BaseResource> results;

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
    public java.lang.Object getMeta() {
        return this.meta;
    }

    public PagedQueryResponse build() {
        Objects.requireNonNull(limit, PagedQueryResponse.class + ": limit is missing");
        Objects.requireNonNull(count, PagedQueryResponse.class + ": count is missing");
        Objects.requireNonNull(offset, PagedQueryResponse.class + ": offset is missing");
        Objects.requireNonNull(results, PagedQueryResponse.class + ": results is missing");
        return new PagedQueryResponseImpl(limit, count, total, offset, results, meta);
    }

    /**
     * builds PagedQueryResponse without checking for non null required values
     */
    public PagedQueryResponse buildUnchecked() {
        return new PagedQueryResponseImpl(limit, count, total, offset, results, meta);
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
        builder.meta = template.getMeta();
        return builder;
    }

}
