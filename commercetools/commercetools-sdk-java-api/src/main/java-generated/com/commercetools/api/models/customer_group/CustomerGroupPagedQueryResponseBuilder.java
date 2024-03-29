
package com.commercetools.api.models.customer_group;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * CustomerGroupPagedQueryResponseBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CustomerGroupPagedQueryResponse customerGroupPagedQueryResponse = CustomerGroupPagedQueryResponse.builder()
 *             .limit(0.3)
 *             .offset(0.3)
 *             .count(0.3)
 *             .plusResults(resultsBuilder -> resultsBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class CustomerGroupPagedQueryResponseBuilder implements Builder<CustomerGroupPagedQueryResponse> {

    private Long limit;

    private Long offset;

    private Long count;

    @Nullable
    private Long total;

    private java.util.List<com.commercetools.api.models.customer_group.CustomerGroup> results;

    /**
     *  <p>Number of results requested.</p>
     * @param limit value to be set
     * @return Builder
     */

    public CustomerGroupPagedQueryResponseBuilder limit(final Long limit) {
        this.limit = limit;
        return this;
    }

    /**
     *  <p>Number of elements skipped.</p>
     * @param offset value to be set
     * @return Builder
     */

    public CustomerGroupPagedQueryResponseBuilder offset(final Long offset) {
        this.offset = offset;
        return this;
    }

    /**
     *  <p>Actual number of results returned.</p>
     * @param count value to be set
     * @return Builder
     */

    public CustomerGroupPagedQueryResponseBuilder count(final Long count) {
        this.count = count;
        return this;
    }

    /**
     *  <p>Total number of results matching the query. This number is an estimation that is not strongly consistent. This field is returned by default. For improved performance, calculating this field can be deactivated by using the query parameter <code>withTotal=false</code>. When the results are filtered with a Query Predicate, <code>total</code> is subject to a limit.</p>
     * @param total value to be set
     * @return Builder
     */

    public CustomerGroupPagedQueryResponseBuilder total(@Nullable final Long total) {
        this.total = total;
        return this;
    }

    /**
     *  <p>CustomerGroups matching the query.</p>
     * @param results value to be set
     * @return Builder
     */

    public CustomerGroupPagedQueryResponseBuilder results(
            final com.commercetools.api.models.customer_group.CustomerGroup... results) {
        this.results = new ArrayList<>(Arrays.asList(results));
        return this;
    }

    /**
     *  <p>CustomerGroups matching the query.</p>
     * @param results value to be set
     * @return Builder
     */

    public CustomerGroupPagedQueryResponseBuilder results(
            final java.util.List<com.commercetools.api.models.customer_group.CustomerGroup> results) {
        this.results = results;
        return this;
    }

    /**
     *  <p>CustomerGroups matching the query.</p>
     * @param results value to be set
     * @return Builder
     */

    public CustomerGroupPagedQueryResponseBuilder plusResults(
            final com.commercetools.api.models.customer_group.CustomerGroup... results) {
        if (this.results == null) {
            this.results = new ArrayList<>();
        }
        this.results.addAll(Arrays.asList(results));
        return this;
    }

    /**
     *  <p>CustomerGroups matching the query.</p>
     * @param builder function to build the results value
     * @return Builder
     */

    public CustomerGroupPagedQueryResponseBuilder plusResults(
            Function<com.commercetools.api.models.customer_group.CustomerGroupBuilder, com.commercetools.api.models.customer_group.CustomerGroupBuilder> builder) {
        if (this.results == null) {
            this.results = new ArrayList<>();
        }
        this.results.add(builder.apply(com.commercetools.api.models.customer_group.CustomerGroupBuilder.of()).build());
        return this;
    }

    /**
     *  <p>CustomerGroups matching the query.</p>
     * @param builder function to build the results value
     * @return Builder
     */

    public CustomerGroupPagedQueryResponseBuilder withResults(
            Function<com.commercetools.api.models.customer_group.CustomerGroupBuilder, com.commercetools.api.models.customer_group.CustomerGroupBuilder> builder) {
        this.results = new ArrayList<>();
        this.results.add(builder.apply(com.commercetools.api.models.customer_group.CustomerGroupBuilder.of()).build());
        return this;
    }

    /**
     *  <p>CustomerGroups matching the query.</p>
     * @param builder function to build the results value
     * @return Builder
     */

    public CustomerGroupPagedQueryResponseBuilder addResults(
            Function<com.commercetools.api.models.customer_group.CustomerGroupBuilder, com.commercetools.api.models.customer_group.CustomerGroup> builder) {
        return plusResults(builder.apply(com.commercetools.api.models.customer_group.CustomerGroupBuilder.of()));
    }

    /**
     *  <p>CustomerGroups matching the query.</p>
     * @param builder function to build the results value
     * @return Builder
     */

    public CustomerGroupPagedQueryResponseBuilder setResults(
            Function<com.commercetools.api.models.customer_group.CustomerGroupBuilder, com.commercetools.api.models.customer_group.CustomerGroup> builder) {
        return results(builder.apply(com.commercetools.api.models.customer_group.CustomerGroupBuilder.of()));
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
     *  <p>CustomerGroups matching the query.</p>
     * @return results
     */

    public java.util.List<com.commercetools.api.models.customer_group.CustomerGroup> getResults() {
        return this.results;
    }

    /**
     * builds CustomerGroupPagedQueryResponse with checking for non-null required values
     * @return CustomerGroupPagedQueryResponse
     */
    public CustomerGroupPagedQueryResponse build() {
        Objects.requireNonNull(limit, CustomerGroupPagedQueryResponse.class + ": limit is missing");
        Objects.requireNonNull(offset, CustomerGroupPagedQueryResponse.class + ": offset is missing");
        Objects.requireNonNull(count, CustomerGroupPagedQueryResponse.class + ": count is missing");
        Objects.requireNonNull(results, CustomerGroupPagedQueryResponse.class + ": results is missing");
        return new CustomerGroupPagedQueryResponseImpl(limit, offset, count, total, results);
    }

    /**
     * builds CustomerGroupPagedQueryResponse without checking for non-null required values
     * @return CustomerGroupPagedQueryResponse
     */
    public CustomerGroupPagedQueryResponse buildUnchecked() {
        return new CustomerGroupPagedQueryResponseImpl(limit, offset, count, total, results);
    }

    /**
     * factory method for an instance of CustomerGroupPagedQueryResponseBuilder
     * @return builder
     */
    public static CustomerGroupPagedQueryResponseBuilder of() {
        return new CustomerGroupPagedQueryResponseBuilder();
    }

    /**
     * create builder for CustomerGroupPagedQueryResponse instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CustomerGroupPagedQueryResponseBuilder of(final CustomerGroupPagedQueryResponse template) {
        CustomerGroupPagedQueryResponseBuilder builder = new CustomerGroupPagedQueryResponseBuilder();
        builder.limit = template.getLimit();
        builder.offset = template.getOffset();
        builder.count = template.getCount();
        builder.total = template.getTotal();
        builder.results = template.getResults();
        return builder;
    }

}
