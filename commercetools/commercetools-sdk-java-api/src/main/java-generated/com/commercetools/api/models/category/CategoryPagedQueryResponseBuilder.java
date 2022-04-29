
package com.commercetools.api.models.category;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class CategoryPagedQueryResponseBuilder implements Builder<CategoryPagedQueryResponse> {

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

    public CategoryPagedQueryResponseBuilder plusResults(
            final com.commercetools.api.models.category.Category... results) {
        if (this.results == null) {
            this.results = new ArrayList<>();
        }
        this.results.addAll(Arrays.asList(results));
        return this;
    }

    public CategoryPagedQueryResponseBuilder plusResults(
            Function<com.commercetools.api.models.category.CategoryBuilder, com.commercetools.api.models.category.CategoryBuilder> builder) {
        if (this.results == null) {
            this.results = new ArrayList<>();
        }
        this.results.add(builder.apply(com.commercetools.api.models.category.CategoryBuilder.of()).build());
        return this;
    }

    public CategoryPagedQueryResponseBuilder withResults(
            Function<com.commercetools.api.models.category.CategoryBuilder, com.commercetools.api.models.category.CategoryBuilder> builder) {
        this.results = new ArrayList<>();
        this.results.add(builder.apply(com.commercetools.api.models.category.CategoryBuilder.of()).build());
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
        Objects.requireNonNull(limit, CategoryPagedQueryResponse.class + ": limit is missing");
        Objects.requireNonNull(count, CategoryPagedQueryResponse.class + ": count is missing");
        Objects.requireNonNull(offset, CategoryPagedQueryResponse.class + ": offset is missing");
        Objects.requireNonNull(results, CategoryPagedQueryResponse.class + ": results is missing");
        return new CategoryPagedQueryResponseImpl(limit, count, total, offset, results);
    }

    /**
     * builds CategoryPagedQueryResponse without checking for non null required values
     */
    public CategoryPagedQueryResponse buildUnchecked() {
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
