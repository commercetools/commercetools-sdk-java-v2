
package com.commercetools.api.models.product_type;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ProductTypePagedQueryResponseBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductTypePagedQueryResponse productTypePagedQueryResponse = ProductTypePagedQueryResponse.builder()
 *             .limit(0.3)
 *             .offset(0.3)
 *             .count(0.3)
 *             .plusResults(resultsBuilder -> resultsBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ProductTypePagedQueryResponseBuilder implements Builder<ProductTypePagedQueryResponse> {

    private Long limit;

    private Long offset;

    private Long count;

    @Nullable
    private Long total;

    private java.util.List<com.commercetools.api.models.product_type.ProductType> results;

    /**
     *  <p>Number of results requested.</p>
     */

    public ProductTypePagedQueryResponseBuilder limit(final Long limit) {
        this.limit = limit;
        return this;
    }

    /**
     *  <p>Number of elements skipped.</p>
     */

    public ProductTypePagedQueryResponseBuilder offset(final Long offset) {
        this.offset = offset;
        return this;
    }

    /**
     *  <p>Actual number of results returned.</p>
     */

    public ProductTypePagedQueryResponseBuilder count(final Long count) {
        this.count = count;
        return this;
    }

    /**
     *  <p>Total number of results matching the query. This number is an estimation that is not strongly consistent. This field is returned by default. For improved performance, calculating this field can be deactivated by using the query parameter <code>withTotal=false</code>. When the results are filtered with a Query Predicate, <code>total</code> is subject to a limit.</p>
     */

    public ProductTypePagedQueryResponseBuilder total(@Nullable final Long total) {
        this.total = total;
        return this;
    }

    /**
     *  <p>ProductTypes matching the query.</p>
     */

    public ProductTypePagedQueryResponseBuilder results(
            final com.commercetools.api.models.product_type.ProductType... results) {
        this.results = new ArrayList<>(Arrays.asList(results));
        return this;
    }

    /**
     *  <p>ProductTypes matching the query.</p>
     */

    public ProductTypePagedQueryResponseBuilder results(
            final java.util.List<com.commercetools.api.models.product_type.ProductType> results) {
        this.results = results;
        return this;
    }

    /**
     *  <p>ProductTypes matching the query.</p>
     */

    public ProductTypePagedQueryResponseBuilder plusResults(
            final com.commercetools.api.models.product_type.ProductType... results) {
        if (this.results == null) {
            this.results = new ArrayList<>();
        }
        this.results.addAll(Arrays.asList(results));
        return this;
    }

    /**
     *  <p>ProductTypes matching the query.</p>
     */

    public ProductTypePagedQueryResponseBuilder plusResults(
            Function<com.commercetools.api.models.product_type.ProductTypeBuilder, com.commercetools.api.models.product_type.ProductTypeBuilder> builder) {
        if (this.results == null) {
            this.results = new ArrayList<>();
        }
        this.results.add(builder.apply(com.commercetools.api.models.product_type.ProductTypeBuilder.of()).build());
        return this;
    }

    /**
     *  <p>ProductTypes matching the query.</p>
     */

    public ProductTypePagedQueryResponseBuilder withResults(
            Function<com.commercetools.api.models.product_type.ProductTypeBuilder, com.commercetools.api.models.product_type.ProductTypeBuilder> builder) {
        this.results = new ArrayList<>();
        this.results.add(builder.apply(com.commercetools.api.models.product_type.ProductTypeBuilder.of()).build());
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

    public java.util.List<com.commercetools.api.models.product_type.ProductType> getResults() {
        return this.results;
    }

    public ProductTypePagedQueryResponse build() {
        Objects.requireNonNull(limit, ProductTypePagedQueryResponse.class + ": limit is missing");
        Objects.requireNonNull(offset, ProductTypePagedQueryResponse.class + ": offset is missing");
        Objects.requireNonNull(count, ProductTypePagedQueryResponse.class + ": count is missing");
        Objects.requireNonNull(results, ProductTypePagedQueryResponse.class + ": results is missing");
        return new ProductTypePagedQueryResponseImpl(limit, offset, count, total, results);
    }

    /**
     * builds ProductTypePagedQueryResponse without checking for non null required values
     */
    public ProductTypePagedQueryResponse buildUnchecked() {
        return new ProductTypePagedQueryResponseImpl(limit, offset, count, total, results);
    }

    public static ProductTypePagedQueryResponseBuilder of() {
        return new ProductTypePagedQueryResponseBuilder();
    }

    public static ProductTypePagedQueryResponseBuilder of(final ProductTypePagedQueryResponse template) {
        ProductTypePagedQueryResponseBuilder builder = new ProductTypePagedQueryResponseBuilder();
        builder.limit = template.getLimit();
        builder.offset = template.getOffset();
        builder.count = template.getCount();
        builder.total = template.getTotal();
        builder.results = template.getResults();
        return builder;
    }

}
