
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
     *  <p>Number of results requested.</p>
     * @param limit value to be set
     * @return Builder
     */

    public ProductSelectionPagedQueryResponseBuilder limit(final Long limit) {
        this.limit = limit;
        return this;
    }

    /**
     *  <p>Number of elements skipped.</p>
     * @param offset value to be set
     * @return Builder
     */

    public ProductSelectionPagedQueryResponseBuilder offset(final Long offset) {
        this.offset = offset;
        return this;
    }

    /**
     *  <p>Actual number of results returned.</p>
     * @param count value to be set
     * @return Builder
     */

    public ProductSelectionPagedQueryResponseBuilder count(final Long count) {
        this.count = count;
        return this;
    }

    /**
     *  <p>Total number of results matching the query. This number is an estimation that is not strongly consistent. Unlike other endpoints, the Product Selection endpoint does not return this field by default. To get <code>total</code>, pass the query parameter <code>withTotal</code> set to <code>true</code>. When the results are filtered with a Query Predicate, <code>total</code> is subject to a limit.</p>
     * @param total value to be set
     * @return Builder
     */

    public ProductSelectionPagedQueryResponseBuilder total(@Nullable final Long total) {
        this.total = total;
        return this;
    }

    /**
     *  <p>ProductSelections matching the query.</p>
     * @param results value to be set
     * @return Builder
     */

    public ProductSelectionPagedQueryResponseBuilder results(
            final com.commercetools.api.models.product_selection.ProductSelection... results) {
        this.results = new ArrayList<>(Arrays.asList(results));
        return this;
    }

    /**
     *  <p>ProductSelections matching the query.</p>
     * @param results value to be set
     * @return Builder
     */

    public ProductSelectionPagedQueryResponseBuilder results(
            final java.util.List<com.commercetools.api.models.product_selection.ProductSelection> results) {
        this.results = results;
        return this;
    }

    /**
     *  <p>ProductSelections matching the query.</p>
     * @param results value to be set
     * @return Builder
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
     *  <p>ProductSelections matching the query.</p>
     * @param builder function to build the results value
     * @return Builder
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
     *  <p>ProductSelections matching the query.</p>
     * @param builder function to build the results value
     * @return Builder
     */

    public ProductSelectionPagedQueryResponseBuilder withResults(
            Function<com.commercetools.api.models.product_selection.ProductSelectionBuilder, com.commercetools.api.models.product_selection.ProductSelectionBuilder> builder) {
        this.results = new ArrayList<>();
        this.results.add(
            builder.apply(com.commercetools.api.models.product_selection.ProductSelectionBuilder.of()).build());
        return this;
    }

    /**
     *  <p>ProductSelections matching the query.</p>
     * @param builder function to build the results value
     * @return Builder
     */

    public ProductSelectionPagedQueryResponseBuilder addResults(
            Function<com.commercetools.api.models.product_selection.ProductSelectionBuilder, com.commercetools.api.models.product_selection.ProductSelection> builder) {
        return plusResults(builder.apply(com.commercetools.api.models.product_selection.ProductSelectionBuilder.of()));
    }

    /**
     *  <p>ProductSelections matching the query.</p>
     * @param builder function to build the results value
     * @return Builder
     */

    public ProductSelectionPagedQueryResponseBuilder setResults(
            Function<com.commercetools.api.models.product_selection.ProductSelectionBuilder, com.commercetools.api.models.product_selection.ProductSelection> builder) {
        return results(builder.apply(com.commercetools.api.models.product_selection.ProductSelectionBuilder.of()));
    }

    /**
     *  <p>Number of results requested.</p>
     * @return limit
     */

    public Long getLimit() {
        return this.limit;
    }

    /**
     *  <p>Number of elements skipped.</p>
     * @return offset
     */

    public Long getOffset() {
        return this.offset;
    }

    /**
     *  <p>Actual number of results returned.</p>
     * @return count
     */

    public Long getCount() {
        return this.count;
    }

    /**
     *  <p>Total number of results matching the query. This number is an estimation that is not strongly consistent. Unlike other endpoints, the Product Selection endpoint does not return this field by default. To get <code>total</code>, pass the query parameter <code>withTotal</code> set to <code>true</code>. When the results are filtered with a Query Predicate, <code>total</code> is subject to a limit.</p>
     * @return total
     */

    @Nullable
    public Long getTotal() {
        return this.total;
    }

    /**
     *  <p>ProductSelections matching the query.</p>
     * @return results
     */

    public java.util.List<com.commercetools.api.models.product_selection.ProductSelection> getResults() {
        return this.results;
    }

    /**
     * builds ProductSelectionPagedQueryResponse with checking for non-null required values
     * @return ProductSelectionPagedQueryResponse
     */
    public ProductSelectionPagedQueryResponse build() {
        Objects.requireNonNull(limit, ProductSelectionPagedQueryResponse.class + ": limit is missing");
        Objects.requireNonNull(offset, ProductSelectionPagedQueryResponse.class + ": offset is missing");
        Objects.requireNonNull(count, ProductSelectionPagedQueryResponse.class + ": count is missing");
        Objects.requireNonNull(results, ProductSelectionPagedQueryResponse.class + ": results is missing");
        return new ProductSelectionPagedQueryResponseImpl(limit, offset, count, total, results);
    }

    /**
     * builds ProductSelectionPagedQueryResponse without checking for non-null required values
     * @return ProductSelectionPagedQueryResponse
     */
    public ProductSelectionPagedQueryResponse buildUnchecked() {
        return new ProductSelectionPagedQueryResponseImpl(limit, offset, count, total, results);
    }

    /**
     * factory method for an instance of ProductSelectionPagedQueryResponseBuilder
     * @return builder
     */
    public static ProductSelectionPagedQueryResponseBuilder of() {
        return new ProductSelectionPagedQueryResponseBuilder();
    }

    /**
     * create builder for ProductSelectionPagedQueryResponse instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
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
