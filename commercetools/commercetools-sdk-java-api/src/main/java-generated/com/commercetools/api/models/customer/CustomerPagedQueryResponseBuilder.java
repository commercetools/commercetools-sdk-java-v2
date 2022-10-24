
package com.commercetools.api.models.customer;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * CustomerPagedQueryResponseBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CustomerPagedQueryResponse customerPagedQueryResponse = CustomerPagedQueryResponse.builder()
 *             .limit(0.3)
 *             .offset(0.3)
 *             .count(0.3)
 *             .plusResults(resultsBuilder -> resultsBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class CustomerPagedQueryResponseBuilder implements Builder<CustomerPagedQueryResponse> {

    private Long limit;

    private Long offset;

    private Long count;

    @Nullable
    private Long total;

    private java.util.List<com.commercetools.api.models.customer.Customer> results;

    /**
     *  <p>Number of results requested.</p>
     */

    public CustomerPagedQueryResponseBuilder limit(final Long limit) {
        this.limit = limit;
        return this;
    }

    /**
     *  <p>Number of elements skipped.</p>
     */

    public CustomerPagedQueryResponseBuilder offset(final Long offset) {
        this.offset = offset;
        return this;
    }

    /**
     *  <p>Actual number of results returned.</p>
     */

    public CustomerPagedQueryResponseBuilder count(final Long count) {
        this.count = count;
        return this;
    }

    /**
     *  <p>Total number of results matching the query. This number is an estimation that is not strongly consistent. This field is returned by default. For improved performance, calculating this field can be deactivated by using the query parameter <code>withTotal=false</code>. When the results are filtered with a Query Predicate, <code>total</code> is subject to a limit.</p>
     */

    public CustomerPagedQueryResponseBuilder total(@Nullable final Long total) {
        this.total = total;
        return this;
    }

    /**
     *  <p>Customers matching the query.</p>
     */

    public CustomerPagedQueryResponseBuilder results(final com.commercetools.api.models.customer.Customer... results) {
        this.results = new ArrayList<>(Arrays.asList(results));
        return this;
    }

    /**
     *  <p>Customers matching the query.</p>
     */

    public CustomerPagedQueryResponseBuilder results(
            final java.util.List<com.commercetools.api.models.customer.Customer> results) {
        this.results = results;
        return this;
    }

    /**
     *  <p>Customers matching the query.</p>
     */

    public CustomerPagedQueryResponseBuilder plusResults(
            final com.commercetools.api.models.customer.Customer... results) {
        if (this.results == null) {
            this.results = new ArrayList<>();
        }
        this.results.addAll(Arrays.asList(results));
        return this;
    }

    /**
     *  <p>Customers matching the query.</p>
     */

    public CustomerPagedQueryResponseBuilder plusResults(
            Function<com.commercetools.api.models.customer.CustomerBuilder, com.commercetools.api.models.customer.CustomerBuilder> builder) {
        if (this.results == null) {
            this.results = new ArrayList<>();
        }
        this.results.add(builder.apply(com.commercetools.api.models.customer.CustomerBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Customers matching the query.</p>
     */

    public CustomerPagedQueryResponseBuilder withResults(
            Function<com.commercetools.api.models.customer.CustomerBuilder, com.commercetools.api.models.customer.CustomerBuilder> builder) {
        this.results = new ArrayList<>();
        this.results.add(builder.apply(com.commercetools.api.models.customer.CustomerBuilder.of()).build());
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

    public java.util.List<com.commercetools.api.models.customer.Customer> getResults() {
        return this.results;
    }

    public CustomerPagedQueryResponse build() {
        Objects.requireNonNull(limit, CustomerPagedQueryResponse.class + ": limit is missing");
        Objects.requireNonNull(offset, CustomerPagedQueryResponse.class + ": offset is missing");
        Objects.requireNonNull(count, CustomerPagedQueryResponse.class + ": count is missing");
        Objects.requireNonNull(results, CustomerPagedQueryResponse.class + ": results is missing");
        return new CustomerPagedQueryResponseImpl(limit, offset, count, total, results);
    }

    /**
     * builds CustomerPagedQueryResponse without checking for non null required values
     */
    public CustomerPagedQueryResponse buildUnchecked() {
        return new CustomerPagedQueryResponseImpl(limit, offset, count, total, results);
    }

    public static CustomerPagedQueryResponseBuilder of() {
        return new CustomerPagedQueryResponseBuilder();
    }

    public static CustomerPagedQueryResponseBuilder of(final CustomerPagedQueryResponse template) {
        CustomerPagedQueryResponseBuilder builder = new CustomerPagedQueryResponseBuilder();
        builder.limit = template.getLimit();
        builder.offset = template.getOffset();
        builder.count = template.getCount();
        builder.total = template.getTotal();
        builder.results = template.getResults();
        return builder;
    }

}
