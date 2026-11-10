
package com.commercetools.api.models.business_unit_search;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * BusinessUnitPagedSearchResponseBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     BusinessUnitPagedSearchResponse businessUnitPagedSearchResponse = BusinessUnitPagedSearchResponse.builder()
 *             .total(0.3)
 *             .limit(0.3)
 *             .offset(0.3)
 *             .plusResults(resultsBuilder -> resultsBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class BusinessUnitPagedSearchResponseBuilder implements Builder<BusinessUnitPagedSearchResponse> {

    private Long total;

    private Integer limit;

    private Integer offset;

    private java.util.List<com.commercetools.api.models.business_unit_search.BusinessUnitSearchResult> results;

    /**
     *  <p>Total number of results matching the query.</p>
     * @param total value to be set
     * @return Builder
     */

    public BusinessUnitPagedSearchResponseBuilder total(final Long total) {
        this.total = total;
        return this;
    }

    /**
     *  <p>Number of <span>results requested</span>.</p>
     * @param limit value to be set
     * @return Builder
     */

    public BusinessUnitPagedSearchResponseBuilder limit(final Integer limit) {
        this.limit = limit;
        return this;
    }

    /**
     *  <p>Number of <span>elements skipped</span>.</p>
     * @param offset value to be set
     * @return Builder
     */

    public BusinessUnitPagedSearchResponseBuilder offset(final Integer offset) {
        this.offset = offset;
        return this;
    }

    /**
     *  <p>Search result containing the Business Units matching the search query.</p>
     * @param results value to be set
     * @return Builder
     */

    public BusinessUnitPagedSearchResponseBuilder results(
            final com.commercetools.api.models.business_unit_search.BusinessUnitSearchResult... results) {
        this.results = new ArrayList<>(Arrays.asList(results));
        return this;
    }

    /**
     *  <p>Search result containing the Business Units matching the search query.</p>
     * @param results value to be set
     * @return Builder
     */

    public BusinessUnitPagedSearchResponseBuilder results(
            final java.util.List<com.commercetools.api.models.business_unit_search.BusinessUnitSearchResult> results) {
        this.results = results;
        return this;
    }

    /**
     *  <p>Search result containing the Business Units matching the search query.</p>
     * @param results value to be set
     * @return Builder
     */

    public BusinessUnitPagedSearchResponseBuilder plusResults(
            final com.commercetools.api.models.business_unit_search.BusinessUnitSearchResult... results) {
        if (this.results == null) {
            this.results = new ArrayList<>();
        }
        this.results.addAll(Arrays.asList(results));
        return this;
    }

    /**
     *  <p>Search result containing the Business Units matching the search query.</p>
     * @param builder function to build the results value
     * @return Builder
     */

    public BusinessUnitPagedSearchResponseBuilder plusResults(
            Function<com.commercetools.api.models.business_unit_search.BusinessUnitSearchResultBuilder, com.commercetools.api.models.business_unit_search.BusinessUnitSearchResultBuilder> builder) {
        if (this.results == null) {
            this.results = new ArrayList<>();
        }
        this.results.add(
            builder.apply(com.commercetools.api.models.business_unit_search.BusinessUnitSearchResultBuilder.of())
                    .build());
        return this;
    }

    /**
     *  <p>Search result containing the Business Units matching the search query.</p>
     * @param builder function to build the results value
     * @return Builder
     */

    public BusinessUnitPagedSearchResponseBuilder withResults(
            Function<com.commercetools.api.models.business_unit_search.BusinessUnitSearchResultBuilder, com.commercetools.api.models.business_unit_search.BusinessUnitSearchResultBuilder> builder) {
        this.results = new ArrayList<>();
        this.results.add(
            builder.apply(com.commercetools.api.models.business_unit_search.BusinessUnitSearchResultBuilder.of())
                    .build());
        return this;
    }

    /**
     *  <p>Search result containing the Business Units matching the search query.</p>
     * @param builder function to build the results value
     * @return Builder
     */

    public BusinessUnitPagedSearchResponseBuilder addResults(
            Function<com.commercetools.api.models.business_unit_search.BusinessUnitSearchResultBuilder, com.commercetools.api.models.business_unit_search.BusinessUnitSearchResult> builder) {
        return plusResults(
            builder.apply(com.commercetools.api.models.business_unit_search.BusinessUnitSearchResultBuilder.of()));
    }

    /**
     *  <p>Search result containing the Business Units matching the search query.</p>
     * @param builder function to build the results value
     * @return Builder
     */

    public BusinessUnitPagedSearchResponseBuilder setResults(
            Function<com.commercetools.api.models.business_unit_search.BusinessUnitSearchResultBuilder, com.commercetools.api.models.business_unit_search.BusinessUnitSearchResult> builder) {
        return results(
            builder.apply(com.commercetools.api.models.business_unit_search.BusinessUnitSearchResultBuilder.of()));
    }

    /**
     *  <p>Total number of results matching the query.</p>
     * @return total
     */

    public Long getTotal() {
        return this.total;
    }

    /**
     *  <p>Number of <span>results requested</span>.</p>
     * @return limit
     */

    public Integer getLimit() {
        return this.limit;
    }

    /**
     *  <p>Number of <span>elements skipped</span>.</p>
     * @return offset
     */

    public Integer getOffset() {
        return this.offset;
    }

    /**
     *  <p>Search result containing the Business Units matching the search query.</p>
     * @return results
     */

    public java.util.List<com.commercetools.api.models.business_unit_search.BusinessUnitSearchResult> getResults() {
        return this.results;
    }

    /**
     * builds BusinessUnitPagedSearchResponse with checking for non-null required values
     * @return BusinessUnitPagedSearchResponse
     */
    public BusinessUnitPagedSearchResponse build() {
        Objects.requireNonNull(total, BusinessUnitPagedSearchResponse.class + ": total is missing");
        Objects.requireNonNull(limit, BusinessUnitPagedSearchResponse.class + ": limit is missing");
        Objects.requireNonNull(offset, BusinessUnitPagedSearchResponse.class + ": offset is missing");
        Objects.requireNonNull(results, BusinessUnitPagedSearchResponse.class + ": results is missing");
        return new BusinessUnitPagedSearchResponseImpl(total, limit, offset, results);
    }

    /**
     * builds BusinessUnitPagedSearchResponse without checking for non-null required values
     * @return BusinessUnitPagedSearchResponse
     */
    public BusinessUnitPagedSearchResponse buildUnchecked() {
        return new BusinessUnitPagedSearchResponseImpl(total, limit, offset, results);
    }

    /**
     * factory method for an instance of BusinessUnitPagedSearchResponseBuilder
     * @return builder
     */
    public static BusinessUnitPagedSearchResponseBuilder of() {
        return new BusinessUnitPagedSearchResponseBuilder();
    }

    /**
     * create builder for BusinessUnitPagedSearchResponse instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static BusinessUnitPagedSearchResponseBuilder of(final BusinessUnitPagedSearchResponse template) {
        BusinessUnitPagedSearchResponseBuilder builder = new BusinessUnitPagedSearchResponseBuilder();
        builder.total = template.getTotal();
        builder.limit = template.getLimit();
        builder.offset = template.getOffset();
        builder.results = template.getResults();
        return builder;
    }

}
