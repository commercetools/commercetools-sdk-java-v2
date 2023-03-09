
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
 *             .count(0.3)
 *             .offset(0.3)
 *             .plusResults(resultsBuilder -> resultsBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class CartPagedQueryResponseBuilder implements Builder<CartPagedQueryResponse> {

    private Long limit;

    private Long count;

    @Nullable
    private Long total;

    private Long offset;

    private java.util.List<com.commercetools.api.models.cart.Cart> results;

    /**
     *  <p>Number of results requested.</p>
     */

    public CartPagedQueryResponseBuilder limit(final Long limit) {
        this.limit = limit;
        return this;
    }

    /**
     *
     */

    public CartPagedQueryResponseBuilder count(final Long count) {
        this.count = count;
        return this;
    }

    /**
     *
     */

    public CartPagedQueryResponseBuilder total(@Nullable final Long total) {
        this.total = total;
        return this;
    }

    /**
     *  <p>Number of elements skipped.</p>
     */

    public CartPagedQueryResponseBuilder offset(final Long offset) {
        this.offset = offset;
        return this;
    }

    /**
     *
     */

    public CartPagedQueryResponseBuilder results(final com.commercetools.api.models.cart.Cart... results) {
        this.results = new ArrayList<>(Arrays.asList(results));
        return this;
    }

    /**
     *
     */

    public CartPagedQueryResponseBuilder results(final java.util.List<com.commercetools.api.models.cart.Cart> results) {
        this.results = results;
        return this;
    }

    /**
     *
     */

    public CartPagedQueryResponseBuilder plusResults(final com.commercetools.api.models.cart.Cart... results) {
        if (this.results == null) {
            this.results = new ArrayList<>();
        }
        this.results.addAll(Arrays.asList(results));
        return this;
    }

    /**
     *
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
     *
     */

    public CartPagedQueryResponseBuilder withResults(
            Function<com.commercetools.api.models.cart.CartBuilder, com.commercetools.api.models.cart.CartBuilder> builder) {
        this.results = new ArrayList<>();
        this.results.add(builder.apply(com.commercetools.api.models.cart.CartBuilder.of()).build());
        return this;
    }

    public Long getLimit() {
        return this.limit;
    }

    public Long getCount() {
        return this.count;
    }

    @Nullable
    public Long getTotal() {
        return this.total;
    }

    public Long getOffset() {
        return this.offset;
    }

    public java.util.List<com.commercetools.api.models.cart.Cart> getResults() {
        return this.results;
    }

    public CartPagedQueryResponse build() {
        Objects.requireNonNull(limit, CartPagedQueryResponse.class + ": limit is missing");
        Objects.requireNonNull(count, CartPagedQueryResponse.class + ": count is missing");
        Objects.requireNonNull(offset, CartPagedQueryResponse.class + ": offset is missing");
        Objects.requireNonNull(results, CartPagedQueryResponse.class + ": results is missing");
        return new CartPagedQueryResponseImpl(limit, count, total, offset, results);
    }

    /**
     * builds CartPagedQueryResponse without checking for non null required values
     */
    public CartPagedQueryResponse buildUnchecked() {
        return new CartPagedQueryResponseImpl(limit, count, total, offset, results);
    }

    public static CartPagedQueryResponseBuilder of() {
        return new CartPagedQueryResponseBuilder();
    }

    public static CartPagedQueryResponseBuilder of(final CartPagedQueryResponse template) {
        CartPagedQueryResponseBuilder builder = new CartPagedQueryResponseBuilder();
        builder.limit = template.getLimit();
        builder.count = template.getCount();
        builder.total = template.getTotal();
        builder.offset = template.getOffset();
        builder.results = template.getResults();
        return builder;
    }

}
