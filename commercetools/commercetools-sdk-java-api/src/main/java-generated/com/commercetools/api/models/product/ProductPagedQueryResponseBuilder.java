
package com.commercetools.api.models.product;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ProductPagedQueryResponseBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductPagedQueryResponse productPagedQueryResponse = ProductPagedQueryResponse.builder()
 *             .limit(0.3)
 *             .offset(0.3)
 *             .count(0.3)
 *             .plusResults(resultsBuilder -> resultsBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ProductPagedQueryResponseBuilder implements Builder<ProductPagedQueryResponse> {

    private Long limit;

    private Long offset;

    private Long count;

    @Nullable
    private Long total;

    private java.util.List<com.commercetools.api.models.product.Product> results;

    /**
     *  <p>Number of results requested.</p>
     * @param limit value to be set
     * @return Builder
     */

    public ProductPagedQueryResponseBuilder limit(final Long limit) {
        this.limit = limit;
        return this;
    }

    /**
     *  <p>Number of elements skipped.</p>
     * @param offset value to be set
     * @return Builder
     */

    public ProductPagedQueryResponseBuilder offset(final Long offset) {
        this.offset = offset;
        return this;
    }

    /**
     *  <p>Actual number of results returned.</p>
     * @param count value to be set
     * @return Builder
     */

    public ProductPagedQueryResponseBuilder count(final Long count) {
        this.count = count;
        return this;
    }

    /**
     *  <p>Total number of results matching the query. This number is an estimation that is not strongly consistent. This field is returned by default. For improved performance, calculating this field can be deactivated by using the query parameter <code>withTotal=false</code>. When the results are filtered with a Query Predicate, <code>total</code> is subject to a limit.</p>
     * @param total value to be set
     * @return Builder
     */

    public ProductPagedQueryResponseBuilder total(@Nullable final Long total) {
        this.total = total;
        return this;
    }

    /**
     *  <p>Products matching the query.</p>
     * @param results value to be set
     * @return Builder
     */

    public ProductPagedQueryResponseBuilder results(final com.commercetools.api.models.product.Product... results) {
        this.results = new ArrayList<>(Arrays.asList(results));
        return this;
    }

    /**
     *  <p>Products matching the query.</p>
     * @param results value to be set
     * @return Builder
     */

    public ProductPagedQueryResponseBuilder results(
            final java.util.List<com.commercetools.api.models.product.Product> results) {
        this.results = results;
        return this;
    }

    /**
     *  <p>Products matching the query.</p>
     * @param results value to be set
     * @return Builder
     */

    public ProductPagedQueryResponseBuilder plusResults(final com.commercetools.api.models.product.Product... results) {
        if (this.results == null) {
            this.results = new ArrayList<>();
        }
        this.results.addAll(Arrays.asList(results));
        return this;
    }

    /**
     *  <p>Products matching the query.</p>
     * @param builder function to build the results value
     * @return Builder
     */

    public ProductPagedQueryResponseBuilder plusResults(
            Function<com.commercetools.api.models.product.ProductBuilder, com.commercetools.api.models.product.ProductBuilder> builder) {
        if (this.results == null) {
            this.results = new ArrayList<>();
        }
        this.results.add(builder.apply(com.commercetools.api.models.product.ProductBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Products matching the query.</p>
     * @param builder function to build the results value
     * @return Builder
     */

    public ProductPagedQueryResponseBuilder withResults(
            Function<com.commercetools.api.models.product.ProductBuilder, com.commercetools.api.models.product.ProductBuilder> builder) {
        this.results = new ArrayList<>();
        this.results.add(builder.apply(com.commercetools.api.models.product.ProductBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Products matching the query.</p>
     * @param builder function to build the results value
     * @return Builder
     */

    public ProductPagedQueryResponseBuilder addResults(
            Function<com.commercetools.api.models.product.ProductBuilder, com.commercetools.api.models.product.Product> builder) {
        return plusResults(builder.apply(com.commercetools.api.models.product.ProductBuilder.of()));
    }

    /**
     *  <p>Products matching the query.</p>
     * @param builder function to build the results value
     * @return Builder
     */

    public ProductPagedQueryResponseBuilder setResults(
            Function<com.commercetools.api.models.product.ProductBuilder, com.commercetools.api.models.product.Product> builder) {
        return results(builder.apply(com.commercetools.api.models.product.ProductBuilder.of()));
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
     *  <p>Total number of results matching the query. This number is an estimation that is not strongly consistent. This field is returned by default. For improved performance, calculating this field can be deactivated by using the query parameter <code>withTotal=false</code>. When the results are filtered with a Query Predicate, <code>total</code> is subject to a limit.</p>
     * @return total
     */

    @Nullable
    public Long getTotal() {
        return this.total;
    }

    /**
     *  <p>Products matching the query.</p>
     * @return results
     */

    public java.util.List<com.commercetools.api.models.product.Product> getResults() {
        return this.results;
    }

    /**
     * builds ProductPagedQueryResponse with checking for non-null required values
     * @return ProductPagedQueryResponse
     */
    public ProductPagedQueryResponse build() {
        Objects.requireNonNull(limit, ProductPagedQueryResponse.class + ": limit is missing");
        Objects.requireNonNull(offset, ProductPagedQueryResponse.class + ": offset is missing");
        Objects.requireNonNull(count, ProductPagedQueryResponse.class + ": count is missing");
        Objects.requireNonNull(results, ProductPagedQueryResponse.class + ": results is missing");
        return new ProductPagedQueryResponseImpl(limit, offset, count, total, results);
    }

    /**
     * builds ProductPagedQueryResponse without checking for non-null required values
     * @return ProductPagedQueryResponse
     */
    public ProductPagedQueryResponse buildUnchecked() {
        return new ProductPagedQueryResponseImpl(limit, offset, count, total, results);
    }

    /**
     * factory method for an instance of ProductPagedQueryResponseBuilder
     * @return builder
     */
    public static ProductPagedQueryResponseBuilder of() {
        return new ProductPagedQueryResponseBuilder();
    }

    /**
     * create builder for ProductPagedQueryResponse instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ProductPagedQueryResponseBuilder of(final ProductPagedQueryResponse template) {
        ProductPagedQueryResponseBuilder builder = new ProductPagedQueryResponseBuilder();
        builder.limit = template.getLimit();
        builder.offset = template.getOffset();
        builder.count = template.getCount();
        builder.total = template.getTotal();
        builder.results = template.getResults();
        return builder;
    }

}
