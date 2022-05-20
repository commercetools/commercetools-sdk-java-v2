
package com.commercetools.api.models.common;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class PagedQueryResponseBuilder implements Builder<PagedQueryResponse> {

    private Long limit;

    private Long offset;

    private Long count;

    @Nullable
    private Long total;

    private java.util.List<com.commercetools.api.models.common.BaseResource> results;

    @Nullable
    private java.lang.Object meta;

    /**
    *  <p>Number of results requested.</p>
    */

    public PagedQueryResponseBuilder limit(final Long limit) {
        this.limit = limit;
        return this;
    }

    /**
    *  <p>Number of elements skipped.</p>
    */

    public PagedQueryResponseBuilder offset(final Long offset) {
        this.offset = offset;
        return this;
    }

    /**
    *  <p>Actual number of results returned.</p>
    */

    public PagedQueryResponseBuilder count(final Long count) {
        this.count = count;
        return this;
    }

    /**
    *  <p>Total number of results matching the query. This number is an estimation that is not strongly consistent. This field is returned by default. For improved performance, calculating this field can be deactivated by using the query parameter <code>withTotal=false</code>. When the results are filtered with a Query Predicate, <code>total</code> is subject to a limit.</p>
    */

    public PagedQueryResponseBuilder total(@Nullable final Long total) {
        this.total = total;
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

    public PagedQueryResponseBuilder plusResults(final com.commercetools.api.models.common.BaseResource... results) {
        if (this.results == null) {
            this.results = new ArrayList<>();
        }
        this.results.addAll(Arrays.asList(results));
        return this;
    }

    public PagedQueryResponseBuilder meta(@Nullable final java.lang.Object meta) {
        this.meta = meta;
        return this;
    }

    public Long getLimit() {
        return this.limit;
    }

    public Long getOffset() {
        return this.offset;
    }

    public Long getCount() {
        return this.count;
    }

    @Nullable
    public Long getTotal() {
        return this.total;
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
        Objects.requireNonNull(offset, PagedQueryResponse.class + ": offset is missing");
        Objects.requireNonNull(count, PagedQueryResponse.class + ": count is missing");
        Objects.requireNonNull(results, PagedQueryResponse.class + ": results is missing");
        return new PagedQueryResponseImpl(limit, offset, count, total, results, meta);
    }

    /**
     * builds PagedQueryResponse without checking for non null required values
     */
    public PagedQueryResponse buildUnchecked() {
        return new PagedQueryResponseImpl(limit, offset, count, total, results, meta);
    }

    public static PagedQueryResponseBuilder of() {
        return new PagedQueryResponseBuilder();
    }

    public static PagedQueryResponseBuilder of(final PagedQueryResponse template) {
        PagedQueryResponseBuilder builder = new PagedQueryResponseBuilder();
        builder.limit = template.getLimit();
        builder.offset = template.getOffset();
        builder.count = template.getCount();
        builder.total = template.getTotal();
        builder.results = template.getResults();
        builder.meta = template.getMeta();
        return builder;
    }

}
