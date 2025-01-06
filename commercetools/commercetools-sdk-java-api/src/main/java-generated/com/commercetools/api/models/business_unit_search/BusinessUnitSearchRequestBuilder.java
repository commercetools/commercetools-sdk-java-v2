
package com.commercetools.api.models.business_unit_search;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * BusinessUnitSearchRequestBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     BusinessUnitSearchRequest businessUnitSearchRequest = BusinessUnitSearchRequest.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class BusinessUnitSearchRequestBuilder implements Builder<BusinessUnitSearchRequest> {

    @Nullable
    private com.commercetools.api.models.search.SearchQuery query;

    @Nullable
    private java.util.List<com.commercetools.api.models.search.SearchSorting> sort;

    @Nullable
    private Integer limit;

    @Nullable
    private Integer offset;

    /**
     *  <p>The Business Unit Search query.</p>
     * @param builder function to build the query value
     * @return Builder
     */

    public BusinessUnitSearchRequestBuilder query(
            Function<com.commercetools.api.models.search.SearchQueryBuilder, com.commercetools.api.models.search.SearchQueryBuilder> builder) {
        this.query = builder.apply(com.commercetools.api.models.search.SearchQueryBuilder.of()).build();
        return this;
    }

    /**
     *  <p>The Business Unit Search query.</p>
     * @param builder function to build the query value
     * @return Builder
     */

    public BusinessUnitSearchRequestBuilder withQuery(
            Function<com.commercetools.api.models.search.SearchQueryBuilder, com.commercetools.api.models.search.SearchQuery> builder) {
        this.query = builder.apply(com.commercetools.api.models.search.SearchQueryBuilder.of());
        return this;
    }

    /**
     *  <p>The Business Unit Search query.</p>
     * @param query value to be set
     * @return Builder
     */

    public BusinessUnitSearchRequestBuilder query(
            @Nullable final com.commercetools.api.models.search.SearchQuery query) {
        this.query = query;
        return this;
    }

    /**
     *  <p>Controls how results to your query are sorted. If not provided, the results are sorted by relevance in descending order.</p>
     * @param sort value to be set
     * @return Builder
     */

    public BusinessUnitSearchRequestBuilder sort(
            @Nullable final com.commercetools.api.models.search.SearchSorting... sort) {
        this.sort = new ArrayList<>(Arrays.asList(sort));
        return this;
    }

    /**
     *  <p>Controls how results to your query are sorted. If not provided, the results are sorted by relevance in descending order.</p>
     * @param sort value to be set
     * @return Builder
     */

    public BusinessUnitSearchRequestBuilder sort(
            @Nullable final java.util.List<com.commercetools.api.models.search.SearchSorting> sort) {
        this.sort = sort;
        return this;
    }

    /**
     *  <p>Controls how results to your query are sorted. If not provided, the results are sorted by relevance in descending order.</p>
     * @param sort value to be set
     * @return Builder
     */

    public BusinessUnitSearchRequestBuilder plusSort(
            @Nullable final com.commercetools.api.models.search.SearchSorting... sort) {
        if (this.sort == null) {
            this.sort = new ArrayList<>();
        }
        this.sort.addAll(Arrays.asList(sort));
        return this;
    }

    /**
     *  <p>Controls how results to your query are sorted. If not provided, the results are sorted by relevance in descending order.</p>
     * @param builder function to build the sort value
     * @return Builder
     */

    public BusinessUnitSearchRequestBuilder plusSort(
            Function<com.commercetools.api.models.search.SearchSortingBuilder, com.commercetools.api.models.search.SearchSortingBuilder> builder) {
        if (this.sort == null) {
            this.sort = new ArrayList<>();
        }
        this.sort.add(builder.apply(com.commercetools.api.models.search.SearchSortingBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Controls how results to your query are sorted. If not provided, the results are sorted by relevance in descending order.</p>
     * @param builder function to build the sort value
     * @return Builder
     */

    public BusinessUnitSearchRequestBuilder withSort(
            Function<com.commercetools.api.models.search.SearchSortingBuilder, com.commercetools.api.models.search.SearchSortingBuilder> builder) {
        this.sort = new ArrayList<>();
        this.sort.add(builder.apply(com.commercetools.api.models.search.SearchSortingBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Controls how results to your query are sorted. If not provided, the results are sorted by relevance in descending order.</p>
     * @param builder function to build the sort value
     * @return Builder
     */

    public BusinessUnitSearchRequestBuilder addSort(
            Function<com.commercetools.api.models.search.SearchSortingBuilder, com.commercetools.api.models.search.SearchSorting> builder) {
        return plusSort(builder.apply(com.commercetools.api.models.search.SearchSortingBuilder.of()));
    }

    /**
     *  <p>Controls how results to your query are sorted. If not provided, the results are sorted by relevance in descending order.</p>
     * @param builder function to build the sort value
     * @return Builder
     */

    public BusinessUnitSearchRequestBuilder setSort(
            Function<com.commercetools.api.models.search.SearchSortingBuilder, com.commercetools.api.models.search.SearchSorting> builder) {
        return sort(builder.apply(com.commercetools.api.models.search.SearchSortingBuilder.of()));
    }

    /**
     *  <p>The maximum number of search results to be returned.</p>
     * @param limit value to be set
     * @return Builder
     */

    public BusinessUnitSearchRequestBuilder limit(@Nullable final Integer limit) {
        this.limit = limit;
        return this;
    }

    /**
     *  <p>The number of search results to be skipped in the response for pagination.</p>
     * @param offset value to be set
     * @return Builder
     */

    public BusinessUnitSearchRequestBuilder offset(@Nullable final Integer offset) {
        this.offset = offset;
        return this;
    }

    /**
     *  <p>The Business Unit Search query.</p>
     * @return query
     */

    @Nullable
    public com.commercetools.api.models.search.SearchQuery getQuery() {
        return this.query;
    }

    /**
     *  <p>Controls how results to your query are sorted. If not provided, the results are sorted by relevance in descending order.</p>
     * @return sort
     */

    @Nullable
    public java.util.List<com.commercetools.api.models.search.SearchSorting> getSort() {
        return this.sort;
    }

    /**
     *  <p>The maximum number of search results to be returned.</p>
     * @return limit
     */

    @Nullable
    public Integer getLimit() {
        return this.limit;
    }

    /**
     *  <p>The number of search results to be skipped in the response for pagination.</p>
     * @return offset
     */

    @Nullable
    public Integer getOffset() {
        return this.offset;
    }

    /**
     * builds BusinessUnitSearchRequest with checking for non-null required values
     * @return BusinessUnitSearchRequest
     */
    public BusinessUnitSearchRequest build() {
        return new BusinessUnitSearchRequestImpl(query, sort, limit, offset);
    }

    /**
     * builds BusinessUnitSearchRequest without checking for non-null required values
     * @return BusinessUnitSearchRequest
     */
    public BusinessUnitSearchRequest buildUnchecked() {
        return new BusinessUnitSearchRequestImpl(query, sort, limit, offset);
    }

    /**
     * factory method for an instance of BusinessUnitSearchRequestBuilder
     * @return builder
     */
    public static BusinessUnitSearchRequestBuilder of() {
        return new BusinessUnitSearchRequestBuilder();
    }

    /**
     * create builder for BusinessUnitSearchRequest instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static BusinessUnitSearchRequestBuilder of(final BusinessUnitSearchRequest template) {
        BusinessUnitSearchRequestBuilder builder = new BusinessUnitSearchRequestBuilder();
        builder.query = template.getQuery();
        builder.sort = template.getSort();
        builder.limit = template.getLimit();
        builder.offset = template.getOffset();
        return builder;
    }

}
