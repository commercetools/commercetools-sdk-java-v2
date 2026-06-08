
package com.commercetools.api.models.customer_search;

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
 * CustomerPagedSearchResponse
 *
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
@JsonDeserialize(as = CustomerPagedSearchResponseImpl.class)
public interface CustomerPagedSearchResponse {

    /**
     *  <p>Total number of results matching the query.</p>
     * @return total
     */
    @NotNull
    @JsonProperty("total")
    public Long getTotal();

    /**
     *  <p>Number of <span>results requested</span>.</p>
     * @return limit
     */
    @NotNull
    @JsonProperty("limit")
    public Integer getLimit();

    /**
     *  <p>Number of <span>elements skipped</span>.</p>
     * @return offset
     */
    @NotNull
    @JsonProperty("offset")
    public Integer getOffset();

    /**
     *  <p>Search result containing the Customers matching the search query.</p>
     * @return results
     */
    @NotNull
    @Valid
    @JsonProperty("results")
    public List<CustomerSearchResult> getResults();

    /**
     *  <p>Total number of results matching the query.</p>
     * @param total value to be set
     */

    public void setTotal(final Long total);

    /**
     *  <p>Number of <span>results requested</span>.</p>
     * @param limit value to be set
     */

    public void setLimit(final Integer limit);

    /**
     *  <p>Number of <span>elements skipped</span>.</p>
     * @param offset value to be set
     */

    public void setOffset(final Integer offset);

    /**
     *  <p>Search result containing the Customers matching the search query.</p>
     * @param results values to be set
     */

    @JsonIgnore
    public void setResults(final CustomerSearchResult... results);

    /**
     *  <p>Search result containing the Customers matching the search query.</p>
     * @param results values to be set
     */

    public void setResults(final List<CustomerSearchResult> results);

    /**
     * factory method
     * @return instance of CustomerPagedSearchResponse
     */
    public static CustomerPagedSearchResponse of() {
        return new CustomerPagedSearchResponseImpl();
    }

    /**
     * factory method to create a shallow copy CustomerPagedSearchResponse
     * @param template instance to be copied
     * @return copy instance
     */
    public static CustomerPagedSearchResponse of(final CustomerPagedSearchResponse template) {
        CustomerPagedSearchResponseImpl instance = new CustomerPagedSearchResponseImpl();
        instance.setTotal(template.getTotal());
        instance.setLimit(template.getLimit());
        instance.setOffset(template.getOffset());
        instance.setResults(template.getResults());
        return instance;
    }

    public CustomerPagedSearchResponse copyDeep();

    /**
     * factory method to create a deep copy of CustomerPagedSearchResponse
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static CustomerPagedSearchResponse deepCopy(@Nullable final CustomerPagedSearchResponse template) {
        if (template == null) {
            return null;
        }
        CustomerPagedSearchResponseImpl instance = new CustomerPagedSearchResponseImpl();
        instance.setTotal(template.getTotal());
        instance.setLimit(template.getLimit());
        instance.setOffset(template.getOffset());
        instance.setResults(Optional.ofNullable(template.getResults())
                .map(t -> t.stream()
                        .map(com.commercetools.api.models.customer_search.CustomerSearchResult::deepCopy)
                        .collect(Collectors.toList()))
                .orElse(null));
        return instance;
    }

    /**
     * builder factory method for CustomerPagedSearchResponse
     * @return builder
     */
    public static CustomerPagedSearchResponseBuilder builder() {
        return CustomerPagedSearchResponseBuilder.of();
    }

    /**
     * create builder for CustomerPagedSearchResponse instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CustomerPagedSearchResponseBuilder builder(final CustomerPagedSearchResponse template) {
        return CustomerPagedSearchResponseBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withCustomerPagedSearchResponse(Function<CustomerPagedSearchResponse, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<CustomerPagedSearchResponse> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<CustomerPagedSearchResponse>() {
            @Override
            public String toString() {
                return "TypeReference<CustomerPagedSearchResponse>";
            }
        };
    }
}
