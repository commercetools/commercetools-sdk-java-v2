
package com.commercetools.api.models.customer_search;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * CustomerPagedSearchResponseBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CustomerPagedSearchResponse customerPagedSearchResponse = CustomerPagedSearchResponse.builder()
 *             .total(0.3)
 *             .limit(0.3)
 *             .offset(0.3)
 *             .plusResults(resultsBuilder -> resultsBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class CustomerPagedSearchResponseBuilder implements Builder<CustomerPagedSearchResponse> {

    private Long total;

    private Integer limit;

    private Integer offset;

    private java.util.List<com.commercetools.api.models.customer_search.CustomerSearchResult> results;

    /**
     *  <p>Total number of results matching the query.</p>
     * @param total value to be set
     * @return Builder
     */

    public CustomerPagedSearchResponseBuilder total(final Long total) {
        this.total = total;
        return this;
    }

    /**
     *  <p>Number of results requested.</p>
     * @param limit value to be set
     * @return Builder
     */

    public CustomerPagedSearchResponseBuilder limit(final Integer limit) {
        this.limit = limit;
        return this;
    }

    /**
     *  <p>Number of elements skipped.</p>
     * @param offset value to be set
     * @return Builder
     */

    public CustomerPagedSearchResponseBuilder offset(final Integer offset) {
        this.offset = offset;
        return this;
    }

    /**
     *  <p>Search result containing the Customers matching the search query.</p>
     * @param results value to be set
     * @return Builder
     */

    public CustomerPagedSearchResponseBuilder results(
            final com.commercetools.api.models.customer_search.CustomerSearchResult... results) {
        this.results = new ArrayList<>(Arrays.asList(results));
        return this;
    }

    /**
     *  <p>Search result containing the Customers matching the search query.</p>
     * @param results value to be set
     * @return Builder
     */

    public CustomerPagedSearchResponseBuilder results(
            final java.util.List<com.commercetools.api.models.customer_search.CustomerSearchResult> results) {
        this.results = results;
        return this;
    }

    /**
     *  <p>Search result containing the Customers matching the search query.</p>
     * @param results value to be set
     * @return Builder
     */

    public CustomerPagedSearchResponseBuilder plusResults(
            final com.commercetools.api.models.customer_search.CustomerSearchResult... results) {
        if (this.results == null) {
            this.results = new ArrayList<>();
        }
        this.results.addAll(Arrays.asList(results));
        return this;
    }

    /**
     *  <p>Search result containing the Customers matching the search query.</p>
     * @param builder function to build the results value
     * @return Builder
     */

    public CustomerPagedSearchResponseBuilder plusResults(
            Function<com.commercetools.api.models.customer_search.CustomerSearchResultBuilder, com.commercetools.api.models.customer_search.CustomerSearchResultBuilder> builder) {
        if (this.results == null) {
            this.results = new ArrayList<>();
        }
        this.results.add(
            builder.apply(com.commercetools.api.models.customer_search.CustomerSearchResultBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Search result containing the Customers matching the search query.</p>
     * @param builder function to build the results value
     * @return Builder
     */

    public CustomerPagedSearchResponseBuilder withResults(
            Function<com.commercetools.api.models.customer_search.CustomerSearchResultBuilder, com.commercetools.api.models.customer_search.CustomerSearchResultBuilder> builder) {
        this.results = new ArrayList<>();
        this.results.add(
            builder.apply(com.commercetools.api.models.customer_search.CustomerSearchResultBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Search result containing the Customers matching the search query.</p>
     * @param builder function to build the results value
     * @return Builder
     */

    public CustomerPagedSearchResponseBuilder addResults(
            Function<com.commercetools.api.models.customer_search.CustomerSearchResultBuilder, com.commercetools.api.models.customer_search.CustomerSearchResult> builder) {
        return plusResults(
            builder.apply(com.commercetools.api.models.customer_search.CustomerSearchResultBuilder.of()));
    }

    /**
     *  <p>Search result containing the Customers matching the search query.</p>
     * @param builder function to build the results value
     * @return Builder
     */

    public CustomerPagedSearchResponseBuilder setResults(
            Function<com.commercetools.api.models.customer_search.CustomerSearchResultBuilder, com.commercetools.api.models.customer_search.CustomerSearchResult> builder) {
        return results(builder.apply(com.commercetools.api.models.customer_search.CustomerSearchResultBuilder.of()));
    }

    /**
     *  <p>Total number of results matching the query.</p>
     * @return total
     */

    public Long getTotal() {
        return this.total;
    }

    /**
     *  <p>Number of results requested.</p>
     * @return limit
     */

    public Integer getLimit() {
        return this.limit;
    }

    /**
     *  <p>Number of elements skipped.</p>
     * @return offset
     */

    public Integer getOffset() {
        return this.offset;
    }

    /**
     *  <p>Search result containing the Customers matching the search query.</p>
     * @return results
     */

    public java.util.List<com.commercetools.api.models.customer_search.CustomerSearchResult> getResults() {
        return this.results;
    }

    /**
     * builds CustomerPagedSearchResponse with checking for non-null required values
     * @return CustomerPagedSearchResponse
     */
    public CustomerPagedSearchResponse build() {
        Objects.requireNonNull(total, CustomerPagedSearchResponse.class + ": total is missing");
        Objects.requireNonNull(limit, CustomerPagedSearchResponse.class + ": limit is missing");
        Objects.requireNonNull(offset, CustomerPagedSearchResponse.class + ": offset is missing");
        Objects.requireNonNull(results, CustomerPagedSearchResponse.class + ": results is missing");
        return new CustomerPagedSearchResponseImpl(total, limit, offset, results);
    }

    /**
     * builds CustomerPagedSearchResponse without checking for non-null required values
     * @return CustomerPagedSearchResponse
     */
    public CustomerPagedSearchResponse buildUnchecked() {
        return new CustomerPagedSearchResponseImpl(total, limit, offset, results);
    }

    /**
     * factory method for an instance of CustomerPagedSearchResponseBuilder
     * @return builder
     */
    public static CustomerPagedSearchResponseBuilder of() {
        return new CustomerPagedSearchResponseBuilder();
    }

    /**
     * create builder for CustomerPagedSearchResponse instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CustomerPagedSearchResponseBuilder of(final CustomerPagedSearchResponse template) {
        CustomerPagedSearchResponseBuilder builder = new CustomerPagedSearchResponseBuilder();
        builder.total = template.getTotal();
        builder.limit = template.getLimit();
        builder.offset = template.getOffset();
        builder.results = template.getResults();
        return builder;
    }

}
