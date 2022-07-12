
package com.commercetools.api.models.shipping_method;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ShippingMethodPagedQueryResponseBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ShippingMethodPagedQueryResponse shippingMethodPagedQueryResponse = ShippingMethodPagedQueryResponse.builder()
 *             .count(0.3)
 *             .plusResults(resultsBuilder -> resultsBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ShippingMethodPagedQueryResponseBuilder implements Builder<ShippingMethodPagedQueryResponse> {

    @Nullable
    private Long limit;

    private Long count;

    @Nullable
    private Long total;

    @Nullable
    private Long offset;

    private java.util.List<com.commercetools.api.models.shipping_method.ShippingMethod> results;

    /**
     *  <p>Number of results requested.</p>
     */

    public ShippingMethodPagedQueryResponseBuilder limit(@Nullable final Long limit) {
        this.limit = limit;
        return this;
    }

    /**
     *  <p>Actual number of results returned.</p>
     */

    public ShippingMethodPagedQueryResponseBuilder count(final Long count) {
        this.count = count;
        return this;
    }

    /**
     *  <p>Total number of results matching the query. This number is an estimation that is not strongly consistent. This field is returned by default. For improved performance, calculating this field can be deactivated by using the query parameter <code>withTotal=false</code>. When the results are filtered with a Query Predicate, <code>total</code> is subject to a limit.</p>
     */

    public ShippingMethodPagedQueryResponseBuilder total(@Nullable final Long total) {
        this.total = total;
        return this;
    }

    /**
     *  <p>Number of elements skipped.</p>
     */

    public ShippingMethodPagedQueryResponseBuilder offset(@Nullable final Long offset) {
        this.offset = offset;
        return this;
    }

    /**
     *  <p>Shipping Methods matching the query.</p>
     */

    public ShippingMethodPagedQueryResponseBuilder results(
            final com.commercetools.api.models.shipping_method.ShippingMethod... results) {
        this.results = new ArrayList<>(Arrays.asList(results));
        return this;
    }

    /**
     *  <p>Shipping Methods matching the query.</p>
     */

    public ShippingMethodPagedQueryResponseBuilder results(
            final java.util.List<com.commercetools.api.models.shipping_method.ShippingMethod> results) {
        this.results = results;
        return this;
    }

    /**
     *  <p>Shipping Methods matching the query.</p>
     */

    public ShippingMethodPagedQueryResponseBuilder plusResults(
            final com.commercetools.api.models.shipping_method.ShippingMethod... results) {
        if (this.results == null) {
            this.results = new ArrayList<>();
        }
        this.results.addAll(Arrays.asList(results));
        return this;
    }

    /**
     *  <p>Shipping Methods matching the query.</p>
     */

    public ShippingMethodPagedQueryResponseBuilder plusResults(
            Function<com.commercetools.api.models.shipping_method.ShippingMethodBuilder, com.commercetools.api.models.shipping_method.ShippingMethodBuilder> builder) {
        if (this.results == null) {
            this.results = new ArrayList<>();
        }
        this.results
                .add(builder.apply(com.commercetools.api.models.shipping_method.ShippingMethodBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Shipping Methods matching the query.</p>
     */

    public ShippingMethodPagedQueryResponseBuilder withResults(
            Function<com.commercetools.api.models.shipping_method.ShippingMethodBuilder, com.commercetools.api.models.shipping_method.ShippingMethodBuilder> builder) {
        this.results = new ArrayList<>();
        this.results
                .add(builder.apply(com.commercetools.api.models.shipping_method.ShippingMethodBuilder.of()).build());
        return this;
    }

    @Nullable
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

    @Nullable
    public Long getOffset() {
        return this.offset;
    }

    public java.util.List<com.commercetools.api.models.shipping_method.ShippingMethod> getResults() {
        return this.results;
    }

    public ShippingMethodPagedQueryResponse build() {
        Objects.requireNonNull(count, ShippingMethodPagedQueryResponse.class + ": count is missing");
        Objects.requireNonNull(results, ShippingMethodPagedQueryResponse.class + ": results is missing");
        return new ShippingMethodPagedQueryResponseImpl(limit, count, total, offset, results);
    }

    /**
     * builds ShippingMethodPagedQueryResponse without checking for non null required values
     */
    public ShippingMethodPagedQueryResponse buildUnchecked() {
        return new ShippingMethodPagedQueryResponseImpl(limit, count, total, offset, results);
    }

    public static ShippingMethodPagedQueryResponseBuilder of() {
        return new ShippingMethodPagedQueryResponseBuilder();
    }

    public static ShippingMethodPagedQueryResponseBuilder of(final ShippingMethodPagedQueryResponse template) {
        ShippingMethodPagedQueryResponseBuilder builder = new ShippingMethodPagedQueryResponseBuilder();
        builder.limit = template.getLimit();
        builder.count = template.getCount();
        builder.total = template.getTotal();
        builder.offset = template.getOffset();
        builder.results = template.getResults();
        return builder;
    }

}
