
package com.commercetools.api.models.business_unit_search;

import java.time.*;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

import javax.annotation.Nullable;

import com.commercetools.api.models.search.SearchQuery;
import com.commercetools.api.models.search.SearchSorting;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;

/**
 * BusinessUnitSearchRequest
 *
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
@JsonDeserialize(as = BusinessUnitSearchRequestImpl.class)
public interface BusinessUnitSearchRequest {

    /**
     *  <p>The Business Unit Search query.</p>
     * @return query
     */
    @Valid
    @JsonProperty("query")
    public SearchQuery getQuery();

    /**
     *  <p>Controls how results to your query are sorted. If not provided, the results are sorted by relevance in descending order.</p>
     * @return sort
     */
    @Valid
    @JsonProperty("sort")
    public List<SearchSorting> getSort();

    /**
     *  <p>The maximum number of search results to be returned.</p>
     * @return limit
     */

    @JsonProperty("limit")
    public Integer getLimit();

    /**
     *  <p>The number of search results to be skipped in the response for pagination.</p>
     * @return offset
     */

    @JsonProperty("offset")
    public Integer getOffset();

    /**
     *  <p>The Business Unit Search query.</p>
     * @param query value to be set
     */

    public void setQuery(final SearchQuery query);

    /**
     *  <p>Controls how results to your query are sorted. If not provided, the results are sorted by relevance in descending order.</p>
     * @param sort values to be set
     */

    @JsonIgnore
    public void setSort(final SearchSorting... sort);

    /**
     *  <p>Controls how results to your query are sorted. If not provided, the results are sorted by relevance in descending order.</p>
     * @param sort values to be set
     */

    public void setSort(final List<SearchSorting> sort);

    /**
     *  <p>The maximum number of search results to be returned.</p>
     * @param limit value to be set
     */

    public void setLimit(final Integer limit);

    /**
     *  <p>The number of search results to be skipped in the response for pagination.</p>
     * @param offset value to be set
     */

    public void setOffset(final Integer offset);

    /**
     * factory method
     * @return instance of BusinessUnitSearchRequest
     */
    public static BusinessUnitSearchRequest of() {
        return new BusinessUnitSearchRequestImpl();
    }

    /**
     * factory method to create a shallow copy BusinessUnitSearchRequest
     * @param template instance to be copied
     * @return copy instance
     */
    public static BusinessUnitSearchRequest of(final BusinessUnitSearchRequest template) {
        BusinessUnitSearchRequestImpl instance = new BusinessUnitSearchRequestImpl();
        instance.setQuery(template.getQuery());
        instance.setSort(template.getSort());
        instance.setLimit(template.getLimit());
        instance.setOffset(template.getOffset());
        return instance;
    }

    public BusinessUnitSearchRequest copyDeep();

    /**
     * factory method to create a deep copy of BusinessUnitSearchRequest
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static BusinessUnitSearchRequest deepCopy(@Nullable final BusinessUnitSearchRequest template) {
        if (template == null) {
            return null;
        }
        BusinessUnitSearchRequestImpl instance = new BusinessUnitSearchRequestImpl();
        instance.setQuery(com.commercetools.api.models.search.SearchQuery.deepCopy(template.getQuery()));
        instance.setSort(Optional.ofNullable(template.getSort())
                .map(t -> t.stream()
                        .map(com.commercetools.api.models.search.SearchSorting::deepCopy)
                        .collect(Collectors.toList()))
                .orElse(null));
        instance.setLimit(template.getLimit());
        instance.setOffset(template.getOffset());
        return instance;
    }

    /**
     * builder factory method for BusinessUnitSearchRequest
     * @return builder
     */
    public static BusinessUnitSearchRequestBuilder builder() {
        return BusinessUnitSearchRequestBuilder.of();
    }

    /**
     * create builder for BusinessUnitSearchRequest instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static BusinessUnitSearchRequestBuilder builder(final BusinessUnitSearchRequest template) {
        return BusinessUnitSearchRequestBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withBusinessUnitSearchRequest(Function<BusinessUnitSearchRequest, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<BusinessUnitSearchRequest> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<BusinessUnitSearchRequest>() {
            @Override
            public String toString() {
                return "TypeReference<BusinessUnitSearchRequest>";
            }
        };
    }
}
