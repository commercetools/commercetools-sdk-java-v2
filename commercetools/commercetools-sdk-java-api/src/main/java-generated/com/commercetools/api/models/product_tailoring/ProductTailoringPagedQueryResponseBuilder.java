
package com.commercetools.api.models.product_tailoring;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ProductTailoringPagedQueryResponseBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductTailoringPagedQueryResponse productTailoringPagedQueryResponse = ProductTailoringPagedQueryResponse.builder()
 *             .limit(0.3)
 *             .offset(0.3)
 *             .count(0.3)
 *             .plusResults(resultsBuilder -> resultsBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ProductTailoringPagedQueryResponseBuilder implements Builder<ProductTailoringPagedQueryResponse> {

    private Long limit;

    private Long offset;

    private Long count;

    @Nullable
    private Long total;

    private java.util.List<com.commercetools.api.models.product_tailoring.ProductTailoring> results;

    /**
     *  <p>Number of <span>results requested</span>.</p>
     * @param limit value to be set
     * @return Builder
     */

    public ProductTailoringPagedQueryResponseBuilder limit(final Long limit) {
        this.limit = limit;
        return this;
    }

    /**
     *  <p>Number of <span>elements skipped</span>.</p>
     * @param offset value to be set
     * @return Builder
     */

    public ProductTailoringPagedQueryResponseBuilder offset(final Long offset) {
        this.offset = offset;
        return this;
    }

    /**
     *  <p>Actual number of results returned.</p>
     * @param count value to be set
     * @return Builder
     */

    public ProductTailoringPagedQueryResponseBuilder count(final Long count) {
        this.count = count;
        return this;
    }

    /**
     *  <p>Total number of results matching the query. Present only when the <code>withTotal</code> query parameter is set to <code>true</code>. This number is an estimation that is not <span>strongly consistent</span>. When the results are filtered with a <span>Query Predicate</span>, <code>total</code> is subject to a <span>limit</span>.</p>
     * @param total value to be set
     * @return Builder
     */

    public ProductTailoringPagedQueryResponseBuilder total(@Nullable final Long total) {
        this.total = total;
        return this;
    }

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:ProductTailoring" rel="nofollow">ProductTailoring</a> list matching the query.</p>
     * @param results value to be set
     * @return Builder
     */

    public ProductTailoringPagedQueryResponseBuilder results(
            final com.commercetools.api.models.product_tailoring.ProductTailoring... results) {
        this.results = new ArrayList<>(Arrays.asList(results));
        return this;
    }

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:ProductTailoring" rel="nofollow">ProductTailoring</a> list matching the query.</p>
     * @param results value to be set
     * @return Builder
     */

    public ProductTailoringPagedQueryResponseBuilder results(
            final java.util.List<com.commercetools.api.models.product_tailoring.ProductTailoring> results) {
        this.results = results;
        return this;
    }

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:ProductTailoring" rel="nofollow">ProductTailoring</a> list matching the query.</p>
     * @param results value to be set
     * @return Builder
     */

    public ProductTailoringPagedQueryResponseBuilder plusResults(
            final com.commercetools.api.models.product_tailoring.ProductTailoring... results) {
        if (this.results == null) {
            this.results = new ArrayList<>();
        }
        this.results.addAll(Arrays.asList(results));
        return this;
    }

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:ProductTailoring" rel="nofollow">ProductTailoring</a> list matching the query.</p>
     * @param builder function to build the results value
     * @return Builder
     */

    public ProductTailoringPagedQueryResponseBuilder plusResults(
            Function<com.commercetools.api.models.product_tailoring.ProductTailoringBuilder, com.commercetools.api.models.product_tailoring.ProductTailoringBuilder> builder) {
        if (this.results == null) {
            this.results = new ArrayList<>();
        }
        this.results.add(
            builder.apply(com.commercetools.api.models.product_tailoring.ProductTailoringBuilder.of()).build());
        return this;
    }

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:ProductTailoring" rel="nofollow">ProductTailoring</a> list matching the query.</p>
     * @param builder function to build the results value
     * @return Builder
     */

    public ProductTailoringPagedQueryResponseBuilder withResults(
            Function<com.commercetools.api.models.product_tailoring.ProductTailoringBuilder, com.commercetools.api.models.product_tailoring.ProductTailoringBuilder> builder) {
        this.results = new ArrayList<>();
        this.results.add(
            builder.apply(com.commercetools.api.models.product_tailoring.ProductTailoringBuilder.of()).build());
        return this;
    }

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:ProductTailoring" rel="nofollow">ProductTailoring</a> list matching the query.</p>
     * @param builder function to build the results value
     * @return Builder
     */

    public ProductTailoringPagedQueryResponseBuilder addResults(
            Function<com.commercetools.api.models.product_tailoring.ProductTailoringBuilder, com.commercetools.api.models.product_tailoring.ProductTailoring> builder) {
        return plusResults(builder.apply(com.commercetools.api.models.product_tailoring.ProductTailoringBuilder.of()));
    }

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:ProductTailoring" rel="nofollow">ProductTailoring</a> list matching the query.</p>
     * @param builder function to build the results value
     * @return Builder
     */

    public ProductTailoringPagedQueryResponseBuilder setResults(
            Function<com.commercetools.api.models.product_tailoring.ProductTailoringBuilder, com.commercetools.api.models.product_tailoring.ProductTailoring> builder) {
        return results(builder.apply(com.commercetools.api.models.product_tailoring.ProductTailoringBuilder.of()));
    }

    /**
     *  <p>Number of <span>results requested</span>.</p>
     * @return limit
     */

    public Long getLimit() {
        return this.limit;
    }

    /**
     *  <p>Number of <span>elements skipped</span>.</p>
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
     *  <p>Total number of results matching the query. Present only when the <code>withTotal</code> query parameter is set to <code>true</code>. This number is an estimation that is not <span>strongly consistent</span>. When the results are filtered with a <span>Query Predicate</span>, <code>total</code> is subject to a <span>limit</span>.</p>
     * @return total
     */

    @Nullable
    public Long getTotal() {
        return this.total;
    }

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:ProductTailoring" rel="nofollow">ProductTailoring</a> list matching the query.</p>
     * @return results
     */

    public java.util.List<com.commercetools.api.models.product_tailoring.ProductTailoring> getResults() {
        return this.results;
    }

    /**
     * builds ProductTailoringPagedQueryResponse with checking for non-null required values
     * @return ProductTailoringPagedQueryResponse
     */
    public ProductTailoringPagedQueryResponse build() {
        Objects.requireNonNull(limit, ProductTailoringPagedQueryResponse.class + ": limit is missing");
        Objects.requireNonNull(offset, ProductTailoringPagedQueryResponse.class + ": offset is missing");
        Objects.requireNonNull(count, ProductTailoringPagedQueryResponse.class + ": count is missing");
        Objects.requireNonNull(results, ProductTailoringPagedQueryResponse.class + ": results is missing");
        return new ProductTailoringPagedQueryResponseImpl(limit, offset, count, total, results);
    }

    /**
     * builds ProductTailoringPagedQueryResponse without checking for non-null required values
     * @return ProductTailoringPagedQueryResponse
     */
    public ProductTailoringPagedQueryResponse buildUnchecked() {
        return new ProductTailoringPagedQueryResponseImpl(limit, offset, count, total, results);
    }

    /**
     * factory method for an instance of ProductTailoringPagedQueryResponseBuilder
     * @return builder
     */
    public static ProductTailoringPagedQueryResponseBuilder of() {
        return new ProductTailoringPagedQueryResponseBuilder();
    }

    /**
     * create builder for ProductTailoringPagedQueryResponse instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ProductTailoringPagedQueryResponseBuilder of(final ProductTailoringPagedQueryResponse template) {
        ProductTailoringPagedQueryResponseBuilder builder = new ProductTailoringPagedQueryResponseBuilder();
        builder.limit = template.getLimit();
        builder.offset = template.getOffset();
        builder.count = template.getCount();
        builder.total = template.getTotal();
        builder.results = template.getResults();
        return builder;
    }

}
