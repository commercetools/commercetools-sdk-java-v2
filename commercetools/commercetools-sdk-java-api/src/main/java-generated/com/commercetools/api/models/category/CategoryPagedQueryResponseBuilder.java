
package com.commercetools.api.models.category;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class CategoryPagedQueryResponseBuilder {

    private Long limit;

    private Long count;

    @Nullable
    private Long total;

    private Long offset;

    private java.util.List<com.commercetools.api.models.category.Category> results;

    public CategoryPagedQueryResponseBuilder limit(final Long limit) {
        this.limit = limit;
        return this;
    }

    public CategoryPagedQueryResponseBuilder count(final Long count) {
        this.count = count;
        return this;
    }

    public CategoryPagedQueryResponseBuilder total(@Nullable final Long total) {
        this.total = total;
        return this;
    }

    public CategoryPagedQueryResponseBuilder offset(final Long offset) {
        this.offset = offset;
        return this;
    }

    public CategoryPagedQueryResponseBuilder results(final com.commercetools.api.models.category.Category... results) {
        this.results = new ArrayList<>(Arrays.asList(results));
        return this;
    }

    public CategoryPagedQueryResponseBuilder results(
            final java.util.List<com.commercetools.api.models.category.Category> results) {
        this.results = results;
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

    public java.util.List<com.commercetools.api.models.category.Category> getResults() {
        return this.results;
    }

    public CategoryPagedQueryResponse build() {
        return new CategoryPagedQueryResponseImpl(limit, count, total, offset, results);
    }

    public static CategoryPagedQueryResponseBuilder of() {
        return new CategoryPagedQueryResponseBuilder();
    }

    public static CategoryPagedQueryResponseBuilder of(final CategoryPagedQueryResponse template) {
        CategoryPagedQueryResponseBuilder builder = new CategoryPagedQueryResponseBuilder();
        builder.limit = template.getLimit();
        builder.count = template.getCount();
        builder.total = template.getTotal();
        builder.offset = template.getOffset();
        builder.results = template.getResults();
        return builder;
    }

}
