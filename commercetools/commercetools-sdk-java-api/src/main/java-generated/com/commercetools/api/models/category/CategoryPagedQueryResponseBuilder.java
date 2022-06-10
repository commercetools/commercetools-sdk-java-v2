
package com.commercetools.api.models.category;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * CategoryPagedQueryResponseBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CategoryPagedQueryResponse categoryPagedQueryResponse = CategoryPagedQueryResponse.builder()
 *             .limit(0.3)
 *             .offset(0.3)
 *             .count(0.3)
 *             .plusResults(resultsBuilder -> resultsBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class CategoryPagedQueryResponseBuilder implements Builder<CategoryPagedQueryResponse> {

    private Long limit;

    private Long offset;

    private Long count;

    @Nullable
    private Long total;

    private java.util.List<com.commercetools.api.models.category.Category> results;

    /**
     *  <p>Number of results requested.</p>
     */

    public CategoryPagedQueryResponseBuilder limit(final Long limit) {
        this.limit = limit;
        return this;
    }

    /**
     *  <p>Number of elements skipped.</p>
     */

    public CategoryPagedQueryResponseBuilder offset(final Long offset) {
        this.offset = offset;
        return this;
    }

    /**
     *  <p>Actual number of results returned.</p>
     */

    public CategoryPagedQueryResponseBuilder count(final Long count) {
        this.count = count;
        return this;
    }

    /**
     *  <p>Total number of results matching the query. This number is an estimation that is not strongly consistent. This field is returned by default. For improved performance, calculating this field can be deactivated by using the query parameter <code>withTotal=false</code>. When the results are filtered with a Query Predicate, <code>total</code> is subject to a limit.</p>
     */

    public CategoryPagedQueryResponseBuilder total(@Nullable final Long total) {
        this.total = total;
        return this;
    }

    /**
     *  <p>Category matching the query.</p>
     */

    public CategoryPagedQueryResponseBuilder results(final com.commercetools.api.models.category.Category... results) {
        this.results = new ArrayList<>(Arrays.asList(results));
        return this;
    }

    /**
     *  <p>Category matching the query.</p>
     */

    public CategoryPagedQueryResponseBuilder results(
            final java.util.List<com.commercetools.api.models.category.Category> results) {
        this.results = results;
        return this;
    }

    /**
     *  <p>Category matching the query.</p>
     */

    public CategoryPagedQueryResponseBuilder plusResults(
            final com.commercetools.api.models.category.Category... results) {
        if (this.results == null) {
            this.results = new ArrayList<>();
        }
        this.results.addAll(Arrays.asList(results));
        return this;
    }

    /**
     *  <p>Category matching the query.</p>
     */

    public CategoryPagedQueryResponseBuilder plusResults(
            Function<com.commercetools.api.models.category.CategoryBuilder, com.commercetools.api.models.category.CategoryBuilder> builder) {
        if (this.results == null) {
            this.results = new ArrayList<>();
        }
        this.results.add(builder.apply(com.commercetools.api.models.category.CategoryBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Category matching the query.</p>
     */

    public CategoryPagedQueryResponseBuilder withResults(
            Function<com.commercetools.api.models.category.CategoryBuilder, com.commercetools.api.models.category.CategoryBuilder> builder) {
        this.results = new ArrayList<>();
        this.results.add(builder.apply(com.commercetools.api.models.category.CategoryBuilder.of()).build());
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

    public java.util.List<com.commercetools.api.models.category.Category> getResults() {
        return this.results;
    }

    public CategoryPagedQueryResponse build() {
        Objects.requireNonNull(limit, CategoryPagedQueryResponse.class + ": limit is missing");
        Objects.requireNonNull(offset, CategoryPagedQueryResponse.class + ": offset is missing");
        Objects.requireNonNull(count, CategoryPagedQueryResponse.class + ": count is missing");
        Objects.requireNonNull(results, CategoryPagedQueryResponse.class + ": results is missing");
        return new CategoryPagedQueryResponseImpl(limit, offset, count, total, results);
    }

    /**
     * builds CategoryPagedQueryResponse without checking for non null required values
     */
    public CategoryPagedQueryResponse buildUnchecked() {
        return new CategoryPagedQueryResponseImpl(limit, offset, count, total, results);
    }

    public static CategoryPagedQueryResponseBuilder of() {
        return new CategoryPagedQueryResponseBuilder();
    }

    public static CategoryPagedQueryResponseBuilder of(final CategoryPagedQueryResponse template) {
        CategoryPagedQueryResponseBuilder builder = new CategoryPagedQueryResponseBuilder();
        builder.limit = template.getLimit();
        builder.offset = template.getOffset();
        builder.count = template.getCount();
        builder.total = template.getTotal();
        builder.results = template.getResults();
        return builder;
    }

}
