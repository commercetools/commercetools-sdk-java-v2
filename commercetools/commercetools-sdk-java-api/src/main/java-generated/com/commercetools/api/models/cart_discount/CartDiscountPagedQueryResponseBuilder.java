
package com.commercetools.api.models.cart_discount;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * CartDiscountPagedQueryResponseBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CartDiscountPagedQueryResponse cartDiscountPagedQueryResponse = CartDiscountPagedQueryResponse.builder()
 *             .limit(0.3)
 *             .offset(0.3)
 *             .count(0.3)
 *             .plusResults(resultsBuilder -> resultsBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class CartDiscountPagedQueryResponseBuilder implements Builder<CartDiscountPagedQueryResponse> {

    private Long limit;

    private Long offset;

    private Long count;

    @Nullable
    private Long total;

    private java.util.List<com.commercetools.api.models.cart_discount.CartDiscount> results;

    /**
     <*  <p>Number of results requested.</p>>
     */

    public CartDiscountPagedQueryResponseBuilder limit(final Long limit) {
        this.limit = limit;
        return this;
    }

    /**
     <*  <p>Number of elements skipped.</p>>
     */

    public CartDiscountPagedQueryResponseBuilder offset(final Long offset) {
        this.offset = offset;
        return this;
    }

    /**
     <*  <p>Actual number of results returned.</p>>
     */

    public CartDiscountPagedQueryResponseBuilder count(final Long count) {
        this.count = count;
        return this;
    }

    /**
     <*  <p>Total number of results matching the query. This number is an estimation that is not strongly consistent. This field is returned by default. For improved performance, calculating this field can be deactivated by using the query parameter <code>withTotal=false</code>. When the results are filtered with a Query Predicate, <code>total</code> is subject to a limit.</p>>
     */

    public CartDiscountPagedQueryResponseBuilder total(@Nullable final Long total) {
        this.total = total;
        return this;
    }

    /**
     <*  <p>CartDiscounts matching the query.</p>>
     */

    public CartDiscountPagedQueryResponseBuilder results(
            final com.commercetools.api.models.cart_discount.CartDiscount... results) {
        this.results = new ArrayList<>(Arrays.asList(results));
        return this;
    }

    /**
     <*  <p>CartDiscounts matching the query.</p>>
     */

    public CartDiscountPagedQueryResponseBuilder results(
            final java.util.List<com.commercetools.api.models.cart_discount.CartDiscount> results) {
        this.results = results;
        return this;
    }

    /**
     <*  <p>CartDiscounts matching the query.</p>>
     */

    public CartDiscountPagedQueryResponseBuilder plusResults(
            final com.commercetools.api.models.cart_discount.CartDiscount... results) {
        if (this.results == null) {
            this.results = new ArrayList<>();
        }
        this.results.addAll(Arrays.asList(results));
        return this;
    }

    /**
     <*  <p>CartDiscounts matching the query.</p>>
     */

    public CartDiscountPagedQueryResponseBuilder plusResults(
            Function<com.commercetools.api.models.cart_discount.CartDiscountBuilder, com.commercetools.api.models.cart_discount.CartDiscountBuilder> builder) {
        if (this.results == null) {
            this.results = new ArrayList<>();
        }
        this.results.add(builder.apply(com.commercetools.api.models.cart_discount.CartDiscountBuilder.of()).build());
        return this;
    }

    /**
     <*  <p>CartDiscounts matching the query.</p>>
     */

    public CartDiscountPagedQueryResponseBuilder withResults(
            Function<com.commercetools.api.models.cart_discount.CartDiscountBuilder, com.commercetools.api.models.cart_discount.CartDiscountBuilder> builder) {
        this.results = new ArrayList<>();
        this.results.add(builder.apply(com.commercetools.api.models.cart_discount.CartDiscountBuilder.of()).build());
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

    public java.util.List<com.commercetools.api.models.cart_discount.CartDiscount> getResults() {
        return this.results;
    }

    public CartDiscountPagedQueryResponse build() {
        Objects.requireNonNull(limit, CartDiscountPagedQueryResponse.class + ": limit is missing");
        Objects.requireNonNull(offset, CartDiscountPagedQueryResponse.class + ": offset is missing");
        Objects.requireNonNull(count, CartDiscountPagedQueryResponse.class + ": count is missing");
        Objects.requireNonNull(results, CartDiscountPagedQueryResponse.class + ": results is missing");
        return new CartDiscountPagedQueryResponseImpl(limit, offset, count, total, results);
    }

    /**
     * builds CartDiscountPagedQueryResponse without checking for non null required values
     */
    public CartDiscountPagedQueryResponse buildUnchecked() {
        return new CartDiscountPagedQueryResponseImpl(limit, offset, count, total, results);
    }

    public static CartDiscountPagedQueryResponseBuilder of() {
        return new CartDiscountPagedQueryResponseBuilder();
    }

    public static CartDiscountPagedQueryResponseBuilder of(final CartDiscountPagedQueryResponse template) {
        CartDiscountPagedQueryResponseBuilder builder = new CartDiscountPagedQueryResponseBuilder();
        builder.limit = template.getLimit();
        builder.offset = template.getOffset();
        builder.count = template.getCount();
        builder.total = template.getTotal();
        builder.results = template.getResults();
        return builder;
    }

}
