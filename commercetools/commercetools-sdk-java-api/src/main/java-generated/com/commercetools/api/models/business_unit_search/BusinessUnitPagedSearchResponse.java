
package com.commercetools.api.models.business_unit_search;

import java.time.*;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

/**
 * BusinessUnitPagedSearchResponse
 *
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
@JsonDeserialize(as = BusinessUnitPagedSearchResponseImpl.class)
public interface BusinessUnitPagedSearchResponse {

    /**
     *  <p>Total number of results matching the query.</p>
     * @return total
     */
    @NotNull
    @JsonProperty("total")
    public Long getTotal();

    /**
     *  <p>Number of results requested.</p>
     * @return limit
     */
    @NotNull
    @JsonProperty("limit")
    public Integer getLimit();

    /**
     *  <p>Number of elements skipped.</p>
     * @return offset
     */
    @NotNull
    @JsonProperty("offset")
    public Integer getOffset();

    /**
     *  <p>Search result containing the Business Units matching the search query.</p>
     * @return results
     */
    @NotNull
    @Valid
    @JsonProperty("results")
    public List<BusinessUnitSearchResult> getResults();

    /**
     *  <p>Total number of results matching the query.</p>
     * @param total value to be set
     */

    public void setTotal(final Long total);

    /**
     *  <p>Number of results requested.</p>
     * @param limit value to be set
     */

    public void setLimit(final Integer limit);

    /**
     *  <p>Number of elements skipped.</p>
     * @param offset value to be set
     */

    public void setOffset(final Integer offset);

    /**
     *  <p>Search result containing the Business Units matching the search query.</p>
     * @param results values to be set
     */

    @JsonIgnore
    public void setResults(final BusinessUnitSearchResult... results);

    /**
     *  <p>Search result containing the Business Units matching the search query.</p>
     * @param results values to be set
     */

    public void setResults(final List<BusinessUnitSearchResult> results);

    /**
     * factory method
     * @return instance of BusinessUnitPagedSearchResponse
     */
    public static BusinessUnitPagedSearchResponse of() {
        return new BusinessUnitPagedSearchResponseImpl();
    }

    /**
     * factory method to create a shallow copy BusinessUnitPagedSearchResponse
     * @param template instance to be copied
     * @return copy instance
     */
    public static BusinessUnitPagedSearchResponse of(final BusinessUnitPagedSearchResponse template) {
        BusinessUnitPagedSearchResponseImpl instance = new BusinessUnitPagedSearchResponseImpl();
        instance.setTotal(template.getTotal());
        instance.setLimit(template.getLimit());
        instance.setOffset(template.getOffset());
        instance.setResults(template.getResults());
        return instance;
    }

    /**
     * factory method to create a deep copy of BusinessUnitPagedSearchResponse
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static BusinessUnitPagedSearchResponse deepCopy(@Nullable final BusinessUnitPagedSearchResponse template) {
        if (template == null) {
            return null;
        }
        BusinessUnitPagedSearchResponseImpl instance = new BusinessUnitPagedSearchResponseImpl();
        instance.setTotal(template.getTotal());
        instance.setLimit(template.getLimit());
        instance.setOffset(template.getOffset());
        instance.setResults(Optional.ofNullable(template.getResults())
                .map(t -> t.stream()
                        .map(com.commercetools.api.models.business_unit_search.BusinessUnitSearchResult::deepCopy)
                        .collect(Collectors.toList()))
                .orElse(null));
        return instance;
    }

    /**
     * builder factory method for BusinessUnitPagedSearchResponse
     * @return builder
     */
    public static BusinessUnitPagedSearchResponseBuilder builder() {
        return BusinessUnitPagedSearchResponseBuilder.of();
    }

    /**
     * create builder for BusinessUnitPagedSearchResponse instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static BusinessUnitPagedSearchResponseBuilder builder(final BusinessUnitPagedSearchResponse template) {
        return BusinessUnitPagedSearchResponseBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withBusinessUnitPagedSearchResponse(Function<BusinessUnitPagedSearchResponse, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<BusinessUnitPagedSearchResponse> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<BusinessUnitPagedSearchResponse>() {
            @Override
            public String toString() {
                return "TypeReference<BusinessUnitPagedSearchResponse>";
            }
        };
    }
}
