
package com.commercetools.api.models.product_selection;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ProductSelectionProductPagedQueryResponseBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductSelectionProductPagedQueryResponse productSelectionProductPagedQueryResponse = ProductSelectionProductPagedQueryResponse.builder()
 *             .limit(0.3)
 *             .offset(0.3)
 *             .count(0.3)
 *             .plusResults(resultsBuilder -> resultsBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ProductSelectionProductPagedQueryResponseBuilder
        implements Builder<ProductSelectionProductPagedQueryResponse> {

    private Long limit;

    private Long offset;

    private Long count;

    @Nullable
    private Long total;

    private java.util.List<com.commercetools.api.models.product_selection.AssignedProductReference> results;

    /**
     *  <p>Number of results requested.</p>
     * @param limit value to be set
     * @return Builder
     */

    public ProductSelectionProductPagedQueryResponseBuilder limit(final Long limit) {
        this.limit = limit;
        return this;
    }

    /**
     *  <p>Number of elements skipped.</p>
     * @param offset value to be set
     * @return Builder
     */

    public ProductSelectionProductPagedQueryResponseBuilder offset(final Long offset) {
        this.offset = offset;
        return this;
    }

    /**
     *  <p>Actual number of results returned.</p>
     * @param count value to be set
     * @return Builder
     */

    public ProductSelectionProductPagedQueryResponseBuilder count(final Long count) {
        this.count = count;
        return this;
    }

    /**
     *  <p>Total number of results matching the query. This number is an estimation that is not strongly consistent. Unlike other endpoints, the Product Selection endpoint does not return this field by default. To get <code>total</code>, pass the query parameter <code>withTotal</code> set to <code>true</code>. When the results are filtered with a Query Predicate, <code>total</code> is subject to a limit.</p>
     * @param total value to be set
     * @return Builder
     */

    public ProductSelectionProductPagedQueryResponseBuilder total(@Nullable final Long total) {
        this.total = total;
        return this;
    }

    /**
     *  <p>References to Products that are assigned to the ProductSelection.</p>
     * @param results value to be set
     * @return Builder
     */

    public ProductSelectionProductPagedQueryResponseBuilder results(
            final com.commercetools.api.models.product_selection.AssignedProductReference... results) {
        this.results = new ArrayList<>(Arrays.asList(results));
        return this;
    }

    /**
     *  <p>References to Products that are assigned to the ProductSelection.</p>
     * @param results value to be set
     * @return Builder
     */

    public ProductSelectionProductPagedQueryResponseBuilder results(
            final java.util.List<com.commercetools.api.models.product_selection.AssignedProductReference> results) {
        this.results = results;
        return this;
    }

    /**
     *  <p>References to Products that are assigned to the ProductSelection.</p>
     * @param results value to be set
     * @return Builder
     */

    public ProductSelectionProductPagedQueryResponseBuilder plusResults(
            final com.commercetools.api.models.product_selection.AssignedProductReference... results) {
        if (this.results == null) {
            this.results = new ArrayList<>();
        }
        this.results.addAll(Arrays.asList(results));
        return this;
    }

    /**
     *  <p>References to Products that are assigned to the ProductSelection.</p>
     * @param builder function to build the results value
     * @return Builder
     */

    public ProductSelectionProductPagedQueryResponseBuilder plusResults(
            Function<com.commercetools.api.models.product_selection.AssignedProductReferenceBuilder, com.commercetools.api.models.product_selection.AssignedProductReferenceBuilder> builder) {
        if (this.results == null) {
            this.results = new ArrayList<>();
        }
        this.results.add(
            builder.apply(com.commercetools.api.models.product_selection.AssignedProductReferenceBuilder.of()).build());
        return this;
    }

    /**
     *  <p>References to Products that are assigned to the ProductSelection.</p>
     * @param builder function to build the results value
     * @return Builder
     */

    public ProductSelectionProductPagedQueryResponseBuilder withResults(
            Function<com.commercetools.api.models.product_selection.AssignedProductReferenceBuilder, com.commercetools.api.models.product_selection.AssignedProductReferenceBuilder> builder) {
        this.results = new ArrayList<>();
        this.results.add(
            builder.apply(com.commercetools.api.models.product_selection.AssignedProductReferenceBuilder.of()).build());
        return this;
    }

    /**
     *  <p>References to Products that are assigned to the ProductSelection.</p>
     * @param builder function to build the results value
     * @return Builder
     */

    public ProductSelectionProductPagedQueryResponseBuilder addResults(
            Function<com.commercetools.api.models.product_selection.AssignedProductReferenceBuilder, com.commercetools.api.models.product_selection.AssignedProductReference> builder) {
        return plusResults(
            builder.apply(com.commercetools.api.models.product_selection.AssignedProductReferenceBuilder.of()));
    }

    /**
     *  <p>References to Products that are assigned to the ProductSelection.</p>
     * @param builder function to build the results value
     * @return Builder
     */

    public ProductSelectionProductPagedQueryResponseBuilder setResults(
            Function<com.commercetools.api.models.product_selection.AssignedProductReferenceBuilder, com.commercetools.api.models.product_selection.AssignedProductReference> builder) {
        return results(
            builder.apply(com.commercetools.api.models.product_selection.AssignedProductReferenceBuilder.of()));
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
     *  <p>References to Products that are assigned to the ProductSelection.</p>
     * @return results
     */

    public java.util.List<com.commercetools.api.models.product_selection.AssignedProductReference> getResults() {
        return this.results;
    }

    /**
     * builds ProductSelectionProductPagedQueryResponse with checking for non-null required values
     * @return ProductSelectionProductPagedQueryResponse
     */
    public ProductSelectionProductPagedQueryResponse build() {
        Objects.requireNonNull(limit, ProductSelectionProductPagedQueryResponse.class + ": limit is missing");
        Objects.requireNonNull(offset, ProductSelectionProductPagedQueryResponse.class + ": offset is missing");
        Objects.requireNonNull(count, ProductSelectionProductPagedQueryResponse.class + ": count is missing");
        Objects.requireNonNull(results, ProductSelectionProductPagedQueryResponse.class + ": results is missing");
        return new ProductSelectionProductPagedQueryResponseImpl(limit, offset, count, total, results);
    }

    /**
     * builds ProductSelectionProductPagedQueryResponse without checking for non-null required values
     * @return ProductSelectionProductPagedQueryResponse
     */
    public ProductSelectionProductPagedQueryResponse buildUnchecked() {
        return new ProductSelectionProductPagedQueryResponseImpl(limit, offset, count, total, results);
    }

    /**
     * factory method for an instance of ProductSelectionProductPagedQueryResponseBuilder
     * @return builder
     */
    public static ProductSelectionProductPagedQueryResponseBuilder of() {
        return new ProductSelectionProductPagedQueryResponseBuilder();
    }

    /**
     * create builder for ProductSelectionProductPagedQueryResponse instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ProductSelectionProductPagedQueryResponseBuilder of(
            final ProductSelectionProductPagedQueryResponse template) {
        ProductSelectionProductPagedQueryResponseBuilder builder = new ProductSelectionProductPagedQueryResponseBuilder();
        builder.limit = template.getLimit();
        builder.offset = template.getOffset();
        builder.count = template.getCount();
        builder.total = template.getTotal();
        builder.results = template.getResults();
        return builder;
    }

}
