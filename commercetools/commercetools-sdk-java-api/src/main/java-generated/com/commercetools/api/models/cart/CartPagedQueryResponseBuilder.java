
package com.commercetools.api.models.cart;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * CartPagedQueryResponseBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CartPagedQueryResponse cartPagedQueryResponse = CartPagedQueryResponse.builder()
 *             .limit(0.3)
 *             .offset(0.3)
 *             .count(0.3)
 *             .plusResults(resultsBuilder -> resultsBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class CartPagedQueryResponseBuilder implements Builder<CartPagedQueryResponse> {

    private Long limit;

    private Long offset;

    private Long count;

    @Nullable
    private Long total;

    private java.util.List<com.commercetools.api.models.cart.Cart> results;

    /**
     *  <p>Number of results requested.</p>
     * @param limit value to be set
     * @return Builder
     */

    public CartPagedQueryResponseBuilder limit(final Long limit) {
        this.limit = limit;
        return this;
    }

    /**
     *  <p>Number of elements skipped.</p>
     * @param offset value to be set
     * @return Builder
     */

    public CartPagedQueryResponseBuilder offset(final Long offset) {
        this.offset = offset;
        return this;
    }

    /**
     *  <p>Actual number of results returned.</p>
     * @param count value to be set
     * @return Builder
     */

    public CartPagedQueryResponseBuilder count(final Long count) {
        this.count = count;
        return this;
    }

    /**
     *  <p>Total number of results matching the query. This number is an estimation that is not strongly consistent. This field is returned by default. For improved performance, calculating this field can be deactivated by using the query parameter <code>withTotal=false</code>. When the results are filtered with a Query Predicate, <code>total</code> is subject to a limit.</p>
     * @param total value to be set
     * @return Builder
     */

    public CartPagedQueryResponseBuilder total(@Nullable final Long total) {
        this.total = total;
        return this;
    }

    /**
     *  <p>Carts matching the query.</p>
     * @param results value to be set
     * @return Builder
     */

    public CartPagedQueryResponseBuilder results(final com.commercetools.api.models.cart.Cart... results) {
        this.results = new ArrayList<>(Arrays.asList(results));
        return this;
    }

    /**
     *  <p>Carts matching the query.</p>
     * @param results value to be set
     * @return Builder
     */

    public CartPagedQueryResponseBuilder results(final java.util.List<com.commercetools.api.models.cart.Cart> results) {
        this.results = results;
        return this;
    }

    /**
     *  <p>Carts matching the query.</p>
     * @param results value to be set
     * @return Builder
     */

    public CartPagedQueryResponseBuilder plusResults(final com.commercetools.api.models.cart.Cart... results) {
        if (this.results == null) {
            this.results = new ArrayList<>();
        }
        this.results.addAll(Arrays.asList(results));
        return this;
    }

    /**
     *  <p>Carts matching the query.</p>
     * @param builder function to build the results value
     * @return Builder
     */

    public CartPagedQueryResponseBuilder plusResults(
            Function<com.commercetools.api.models.cart.CartBuilder, com.commercetools.api.models.cart.CartBuilder> builder) {
        if (this.results == null) {
            this.results = new ArrayList<>();
        }
        this.results.add(builder.apply(com.commercetools.api.models.cart.CartBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Carts matching the query.</p>
     * @param builder function to build the results value
     * @return Builder
     */

    public CartPagedQueryResponseBuilder withResults(
            Function<com.commercetools.api.models.cart.CartBuilder, com.commercetools.api.models.cart.CartBuilder> builder) {
        this.results = new ArrayList<>();
        this.results.add(builder.apply(com.commercetools.api.models.cart.CartBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Carts matching the query.</p>
     * @param builder function to build the results value
     * @return Builder
     */

    public CartPagedQueryResponseBuilder addResults(
            Function<com.commercetools.api.models.cart.CartBuilder, com.commercetools.api.models.cart.Cart> builder) {
        return plusResults(builder.apply(com.commercetools.api.models.cart.CartBuilder.of()));
    }

    /**
     *  <p>Carts matching the query.</p>
     * @param builder function to build the results value
     * @return Builder
     */

    public CartPagedQueryResponseBuilder setResults(
            Function<com.commercetools.api.models.cart.CartBuilder, com.commercetools.api.models.cart.Cart> builder) {
        return results(builder.apply(com.commercetools.api.models.cart.CartBuilder.of()));
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
     *  <p>Carts matching the query.</p>
     * @return results
     */

    public java.util.List<com.commercetools.api.models.cart.Cart> getResults() {
        return this.results;
    }

    /**
     * builds CartPagedQueryResponse with checking for non-null required values
     * @return CartPagedQueryResponse
     */
    public CartPagedQueryResponse build() {
        Objects.requireNonNull(limit, CartPagedQueryResponse.class + ": limit is missing");
        Objects.requireNonNull(offset, CartPagedQueryResponse.class + ": offset is missing");
        Objects.requireNonNull(count, CartPagedQueryResponse.class + ": count is missing");
        Objects.requireNonNull(results, CartPagedQueryResponse.class + ": results is missing");
        return new CartPagedQueryResponseImpl(limit, offset, count, total, results);
    }

    /**
     * builds CartPagedQueryResponse without checking for non-null required values
     * @return CartPagedQueryResponse
     */
    public CartPagedQueryResponse buildUnchecked() {
        return new CartPagedQueryResponseImpl(limit, offset, count, total, results);
    }

    /**
     * factory method for an instance of CartPagedQueryResponseBuilder
     * @return builder
     */
    public static CartPagedQueryResponseBuilder of() {
        return new CartPagedQueryResponseBuilder();
    }

    /**
     * create builder for CartPagedQueryResponse instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CartPagedQueryResponseBuilder of(final CartPagedQueryResponse template) {
        CartPagedQueryResponseBuilder builder = new CartPagedQueryResponseBuilder();
        builder.limit = template.getLimit();
        builder.offset = template.getOffset();
        builder.count = template.getCount();
        builder.total = template.getTotal();
        builder.results = template.getResults();
        return builder;
    }

}
