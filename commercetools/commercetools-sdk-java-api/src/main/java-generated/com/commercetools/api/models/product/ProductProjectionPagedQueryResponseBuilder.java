
package com.commercetools.api.models.product;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ProductProjectionPagedQueryResponseBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductProjectionPagedQueryResponse productProjectionPagedQueryResponse = ProductProjectionPagedQueryResponse.builder()
 *             .limit(0.3)
 *             .count(0.3)
 *             .offset(0.3)
 *             .plusResults(resultsBuilder -> resultsBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ProductProjectionPagedQueryResponseBuilder implements Builder<ProductProjectionPagedQueryResponse> {

    private Long limit;

    private Long count;

    @Nullable
    private Long total;

    private Long offset;

    private java.util.List<com.commercetools.api.models.product.ProductProjection> results;

    /**
     *  <p>Number of results requested.</p>
     * @param limit value to be set
     * @return Builder
     */

    public ProductProjectionPagedQueryResponseBuilder limit(final Long limit) {
        this.limit = limit;
        return this;
    }

    /**
     *  <p>Actual number of results returned.</p>
     * @param count value to be set
     * @return Builder
     */

    public ProductProjectionPagedQueryResponseBuilder count(final Long count) {
        this.count = count;
        return this;
    }

    /**
     *  <p>Total number of results matching the query. This number is an estimation that is not strongly consistent. This field is returned by default. For improved performance, calculating this field can be deactivated by using the query parameter <code>withTotal=false</code>. When the results are filtered with a Query Predicate, <code>total</code> is subject to a limit.</p>
     * @param total value to be set
     * @return Builder
     */

    public ProductProjectionPagedQueryResponseBuilder total(@Nullable final Long total) {
        this.total = total;
        return this;
    }

    /**
     *  <p>Number of elements skipped.</p>
     * @param offset value to be set
     * @return Builder
     */

    public ProductProjectionPagedQueryResponseBuilder offset(final Long offset) {
        this.offset = offset;
        return this;
    }

    /**
     *  <p>ProductProjections matching the query.</p>
     * @param results value to be set
     * @return Builder
     */

    public ProductProjectionPagedQueryResponseBuilder results(
            final com.commercetools.api.models.product.ProductProjection... results) {
        this.results = new ArrayList<>(Arrays.asList(results));
        return this;
    }

    /**
     *  <p>ProductProjections matching the query.</p>
     * @param results value to be set
     * @return Builder
     */

    public ProductProjectionPagedQueryResponseBuilder results(
            final java.util.List<com.commercetools.api.models.product.ProductProjection> results) {
        this.results = results;
        return this;
    }

    /**
     *  <p>ProductProjections matching the query.</p>
     * @param results value to be set
     * @return Builder
     */

    public ProductProjectionPagedQueryResponseBuilder plusResults(
            final com.commercetools.api.models.product.ProductProjection... results) {
        if (this.results == null) {
            this.results = new ArrayList<>();
        }
        this.results.addAll(Arrays.asList(results));
        return this;
    }

    /**
     *  <p>ProductProjections matching the query.</p>
     * @param builder function to build the results value
     * @return Builder
     */

    public ProductProjectionPagedQueryResponseBuilder plusResults(
            Function<com.commercetools.api.models.product.ProductProjectionBuilder, com.commercetools.api.models.product.ProductProjectionBuilder> builder) {
        if (this.results == null) {
            this.results = new ArrayList<>();
        }
        this.results.add(builder.apply(com.commercetools.api.models.product.ProductProjectionBuilder.of()).build());
        return this;
    }

    /**
     *  <p>ProductProjections matching the query.</p>
     * @param builder function to build the results value
     * @return Builder
     */

    public ProductProjectionPagedQueryResponseBuilder withResults(
            Function<com.commercetools.api.models.product.ProductProjectionBuilder, com.commercetools.api.models.product.ProductProjectionBuilder> builder) {
        this.results = new ArrayList<>();
        this.results.add(builder.apply(com.commercetools.api.models.product.ProductProjectionBuilder.of()).build());
        return this;
    }

    /**
     *  <p>ProductProjections matching the query.</p>
     * @param builder function to build the results value
     * @return Builder
     */

    public ProductProjectionPagedQueryResponseBuilder addResults(
            Function<com.commercetools.api.models.product.ProductProjectionBuilder, com.commercetools.api.models.product.ProductProjection> builder) {
        return plusResults(builder.apply(com.commercetools.api.models.product.ProductProjectionBuilder.of()));
    }

    /**
     *  <p>ProductProjections matching the query.</p>
     * @param builder function to build the results value
     * @return Builder
     */

    public ProductProjectionPagedQueryResponseBuilder setResults(
            Function<com.commercetools.api.models.product.ProductProjectionBuilder, com.commercetools.api.models.product.ProductProjection> builder) {
        return results(builder.apply(com.commercetools.api.models.product.ProductProjectionBuilder.of()));
    }

    /**
     *  <p>Number of results requested.</p>
     * @return limit
     */

    public Long getLimit() {
        return this.limit;
    }

    /**
     *  <p>Actual number of results returned.</p>
     * @return count
     */

    public Long getCount() {
        return this.count;
    }

    /**
     *  <p>Total number of results matching the query. This number is an estimation that is not strongly consistent. This field is returned by default. For improved performance, calculating this field can be deactivated by using the query parameter <code>withTotal=false</code>. When the results are filtered with a Query Predicate, <code>total</code> is subject to a limit.</p>
     * @return total
     */

    @Nullable
    public Long getTotal() {
        return this.total;
    }

    /**
     *  <p>Number of elements skipped.</p>
     * @return offset
     */

    public Long getOffset() {
        return this.offset;
    }

    /**
     *  <p>ProductProjections matching the query.</p>
     * @return results
     */

    public java.util.List<com.commercetools.api.models.product.ProductProjection> getResults() {
        return this.results;
    }

    /**
     * builds ProductProjectionPagedQueryResponse with checking for non-null required values
     * @return ProductProjectionPagedQueryResponse
     */
    public ProductProjectionPagedQueryResponse build() {
        Objects.requireNonNull(limit, ProductProjectionPagedQueryResponse.class + ": limit is missing");
        Objects.requireNonNull(count, ProductProjectionPagedQueryResponse.class + ": count is missing");
        Objects.requireNonNull(offset, ProductProjectionPagedQueryResponse.class + ": offset is missing");
        Objects.requireNonNull(results, ProductProjectionPagedQueryResponse.class + ": results is missing");
        return new ProductProjectionPagedQueryResponseImpl(limit, count, total, offset, results);
    }

    /**
     * builds ProductProjectionPagedQueryResponse without checking for non-null required values
     * @return ProductProjectionPagedQueryResponse
     */
    public ProductProjectionPagedQueryResponse buildUnchecked() {
        return new ProductProjectionPagedQueryResponseImpl(limit, count, total, offset, results);
    }

    /**
     * factory method for an instance of ProductProjectionPagedQueryResponseBuilder
     * @return builder
     */
    public static ProductProjectionPagedQueryResponseBuilder of() {
        return new ProductProjectionPagedQueryResponseBuilder();
    }

    /**
     * create builder for ProductProjectionPagedQueryResponse instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ProductProjectionPagedQueryResponseBuilder of(final ProductProjectionPagedQueryResponse template) {
        ProductProjectionPagedQueryResponseBuilder builder = new ProductProjectionPagedQueryResponseBuilder();
        builder.limit = template.getLimit();
        builder.count = template.getCount();
        builder.total = template.getTotal();
        builder.offset = template.getOffset();
        builder.results = template.getResults();
        return builder;
    }

}
