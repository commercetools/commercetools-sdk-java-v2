
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
     *  <p>Number of <span>results requested</span>.</p>
     * @param limit value to be set
     * @return Builder
     */

    public CartDiscountPagedQueryResponseBuilder limit(final Long limit) {
        this.limit = limit;
        return this;
    }

    /**
     *  <p>Number of <span>elements skipped</span>.</p>
     * @param offset value to be set
     * @return Builder
     */

    public CartDiscountPagedQueryResponseBuilder offset(final Long offset) {
        this.offset = offset;
        return this;
    }

    /**
     *  <p>Actual number of results returned.</p>
     * @param count value to be set
     * @return Builder
     */

    public CartDiscountPagedQueryResponseBuilder count(final Long count) {
        this.count = count;
        return this;
    }

    /**
     *  <p>Total number of results matching the query. This number is an estimation that is not <span>strongly consistent</span>. This field is returned by default. For improved performance, calculating this field can be deactivated by using the query parameter <code>withTotal=false</code>. When the results are filtered with a <span>Query Predicate</span>, <code>total</code> is subject to a <span>limit</span>.</p>
     * @param total value to be set
     * @return Builder
     */

    public CartDiscountPagedQueryResponseBuilder total(@Nullable final Long total) {
        this.total = total;
        return this;
    }

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:CartDiscount" rel="nofollow">CartDiscounts</a> matching the query.</p>
     * @param results value to be set
     * @return Builder
     */

    public CartDiscountPagedQueryResponseBuilder results(
            final com.commercetools.api.models.cart_discount.CartDiscount... results) {
        this.results = new ArrayList<>(Arrays.asList(results));
        return this;
    }

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:CartDiscount" rel="nofollow">CartDiscounts</a> matching the query.</p>
     * @param results value to be set
     * @return Builder
     */

    public CartDiscountPagedQueryResponseBuilder results(
            final java.util.List<com.commercetools.api.models.cart_discount.CartDiscount> results) {
        this.results = results;
        return this;
    }

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:CartDiscount" rel="nofollow">CartDiscounts</a> matching the query.</p>
     * @param results value to be set
     * @return Builder
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
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:CartDiscount" rel="nofollow">CartDiscounts</a> matching the query.</p>
     * @param builder function to build the results value
     * @return Builder
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
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:CartDiscount" rel="nofollow">CartDiscounts</a> matching the query.</p>
     * @param builder function to build the results value
     * @return Builder
     */

    public CartDiscountPagedQueryResponseBuilder withResults(
            Function<com.commercetools.api.models.cart_discount.CartDiscountBuilder, com.commercetools.api.models.cart_discount.CartDiscountBuilder> builder) {
        this.results = new ArrayList<>();
        this.results.add(builder.apply(com.commercetools.api.models.cart_discount.CartDiscountBuilder.of()).build());
        return this;
    }

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:CartDiscount" rel="nofollow">CartDiscounts</a> matching the query.</p>
     * @param builder function to build the results value
     * @return Builder
     */

    public CartDiscountPagedQueryResponseBuilder addResults(
            Function<com.commercetools.api.models.cart_discount.CartDiscountBuilder, com.commercetools.api.models.cart_discount.CartDiscount> builder) {
        return plusResults(builder.apply(com.commercetools.api.models.cart_discount.CartDiscountBuilder.of()));
    }

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:CartDiscount" rel="nofollow">CartDiscounts</a> matching the query.</p>
     * @param builder function to build the results value
     * @return Builder
     */

    public CartDiscountPagedQueryResponseBuilder setResults(
            Function<com.commercetools.api.models.cart_discount.CartDiscountBuilder, com.commercetools.api.models.cart_discount.CartDiscount> builder) {
        return results(builder.apply(com.commercetools.api.models.cart_discount.CartDiscountBuilder.of()));
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
     *  <p>Total number of results matching the query. This number is an estimation that is not <span>strongly consistent</span>. This field is returned by default. For improved performance, calculating this field can be deactivated by using the query parameter <code>withTotal=false</code>. When the results are filtered with a <span>Query Predicate</span>, <code>total</code> is subject to a <span>limit</span>.</p>
     * @return total
     */

    @Nullable
    public Long getTotal() {
        return this.total;
    }

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:CartDiscount" rel="nofollow">CartDiscounts</a> matching the query.</p>
     * @return results
     */

    public java.util.List<com.commercetools.api.models.cart_discount.CartDiscount> getResults() {
        return this.results;
    }

    /**
     * builds CartDiscountPagedQueryResponse with checking for non-null required values
     * @return CartDiscountPagedQueryResponse
     */
    public CartDiscountPagedQueryResponse build() {
        Objects.requireNonNull(limit, CartDiscountPagedQueryResponse.class + ": limit is missing");
        Objects.requireNonNull(offset, CartDiscountPagedQueryResponse.class + ": offset is missing");
        Objects.requireNonNull(count, CartDiscountPagedQueryResponse.class + ": count is missing");
        Objects.requireNonNull(results, CartDiscountPagedQueryResponse.class + ": results is missing");
        return new CartDiscountPagedQueryResponseImpl(limit, offset, count, total, results);
    }

    /**
     * builds CartDiscountPagedQueryResponse without checking for non-null required values
     * @return CartDiscountPagedQueryResponse
     */
    public CartDiscountPagedQueryResponse buildUnchecked() {
        return new CartDiscountPagedQueryResponseImpl(limit, offset, count, total, results);
    }

    /**
     * factory method for an instance of CartDiscountPagedQueryResponseBuilder
     * @return builder
     */
    public static CartDiscountPagedQueryResponseBuilder of() {
        return new CartDiscountPagedQueryResponseBuilder();
    }

    /**
     * create builder for CartDiscountPagedQueryResponse instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
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
