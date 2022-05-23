
package com.commercetools.api.models.product_selection;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ProductSelectionPagedQueryResponseBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductSelectionPagedQueryResponse productSelectionPagedQueryResponse = ProductSelectionPagedQueryResponse.builder()
 *             .limit(0.3)
 *             .offset(0.3)
 *             .count(0.3)
 *             .plusResults(resultsBuilder -> resultsBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ProductSelectionPagedQueryResponseBuilder implements Builder<ProductSelectionPagedQueryResponse> {

    private Long limit;

    private Long offset;

    private Long count;

    @Nullable
    private Long total;

    private java.util.List<com.commercetools.api.models.product_selection.ProductSelection> results;

    /**
     <*  <p>Number of results requested.</p>>
     */

    public ProductSelectionPagedQueryResponseBuilder limit(final Long limit) {
        this.limit = limit;
        return this;
    }

    /**
     <*  <p>Number of elements skipped.</p>>
     */

    public ProductSelectionPagedQueryResponseBuilder offset(final Long offset) {
        this.offset = offset;
        return this;
    }

    /**
     <*  <p>Actual number of results returned.</p>>
     */

    public ProductSelectionPagedQueryResponseBuilder count(final Long count) {
        this.count = count;
        return this;
    }

    /**
     <*  <p>Total number of results matching the query. This number is an estimation that is not strongly consistent. Unlike other endpoints, the Product Selection endpoint does not return this field by default. To get <code>total</code>, pass the query parameter <code>withTotal</code> set to <code>true</code>. When the results are filtered with a Query Predicate, <code>total</code> is subject to a limit.</p>>
     */

    public ProductSelectionPagedQueryResponseBuilder total(@Nullable final Long total) {
        this.total = total;
        return this;
    }

    /**
     <*  <p>ProductSelections matching the query.</p>>
     */

    public ProductSelectionPagedQueryResponseBuilder results(
            final com.commercetools.api.models.product_selection.ProductSelection... results) {
        this.results = new ArrayList<>(Arrays.asList(results));
        return this;
    }

    /**
     <*  <p>ProductSelections matching the query.</p>>
     */

    public ProductSelectionPagedQueryResponseBuilder results(
            final java.util.List<com.commercetools.api.models.product_selection.ProductSelection> results) {
        this.results = results;
        return this;
    }

    /**
     <*  <p>ProductSelections matching the query.</p>>
     */

    public ProductSelectionPagedQueryResponseBuilder plusResults(
            final com.commercetools.api.models.product_selection.ProductSelection... results) {
        if (this.results == null) {
            this.results = new ArrayList<>();
        }
        this.results.addAll(Arrays.asList(results));
        return this;
    }

    /**
     <*  <p>ProductSelections matching the query.</p>>
     */

    public ProductSelectionPagedQueryResponseBuilder plusResults(
            Function<com.commercetools.api.models.product_selection.ProductSelectionBuilder, com.commercetools.api.models.product_selection.ProductSelectionBuilder> builder) {
        if (this.results == null) {
            this.results = new ArrayList<>();
        }
        this.results.add(
            builder.apply(com.commercetools.api.models.product_selection.ProductSelectionBuilder.of()).build());
        return this;
    }

    /**
     <*  <p>ProductSelections matching the query.</p>>
     */

    public ProductSelectionPagedQueryResponseBuilder withResults(
            Function<com.commercetools.api.models.product_selection.ProductSelectionBuilder, com.commercetools.api.models.product_selection.ProductSelectionBuilder> builder) {
        this.results = new ArrayList<>();
        this.results.add(
            builder.apply(com.commercetools.api.models.product_selection.ProductSelectionBuilder.of()).build());
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

    public java.util.List<com.commercetools.api.models.product_selection.ProductSelection> getResults() {
        return this.results;
    }

    public ProductSelectionPagedQueryResponse build() {
        Objects.requireNonNull(limit, ProductSelectionPagedQueryResponse.class + ": limit is missing");
        Objects.requireNonNull(offset, ProductSelectionPagedQueryResponse.class + ": offset is missing");
        Objects.requireNonNull(count, ProductSelectionPagedQueryResponse.class + ": count is missing");
        Objects.requireNonNull(results, ProductSelectionPagedQueryResponse.class + ": results is missing");
        return new ProductSelectionPagedQueryResponseImpl(limit, offset, count, total, results);
    }

    /**
     * builds ProductSelectionPagedQueryResponse without checking for non null required values
     */
    public ProductSelectionPagedQueryResponse buildUnchecked() {
        return new ProductSelectionPagedQueryResponseImpl(limit, offset, count, total, results);
    }

    public static ProductSelectionPagedQueryResponseBuilder of() {
        return new ProductSelectionPagedQueryResponseBuilder();
    }

    public static ProductSelectionPagedQueryResponseBuilder of(final ProductSelectionPagedQueryResponse template) {
        ProductSelectionPagedQueryResponseBuilder builder = new ProductSelectionPagedQueryResponseBuilder();
        builder.limit = template.getLimit();
        builder.offset = template.getOffset();
        builder.count = template.getCount();
        builder.total = template.getTotal();
        builder.results = template.getResults();
        return builder;
    }

}
