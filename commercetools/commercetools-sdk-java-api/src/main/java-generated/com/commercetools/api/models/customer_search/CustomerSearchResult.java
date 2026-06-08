
package com.commercetools.api.models.customer_search;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.constraints.NotNull;

/**
 * CustomerSearchResult
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CustomerSearchResult customerSearchResult = CustomerSearchResult.builder()
 *             .id("{id}")
 *             .relevance(0.3)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = CustomerSearchResultImpl.class)
public interface CustomerSearchResult {

    /**
     *  <p><code>id</code> of the <a href="https://docs.commercetools.com/apis/ctp:api:type:Customer" rel="nofollow">Customer</a> matching the search query.</p>
     * @return id
     */
    @NotNull
    @JsonProperty("id")
    public String getId();

    /**
     *  <p>How closely this customer matches the search query.</p>
     * @return relevance
     */
    @NotNull
    @JsonProperty("relevance")
    public Double getRelevance();

    /**
     *  <p><code>id</code> of the <a href="https://docs.commercetools.com/apis/ctp:api:type:Customer" rel="nofollow">Customer</a> matching the search query.</p>
     * @param id value to be set
     */

    public void setId(final String id);

    /**
     *  <p>How closely this customer matches the search query.</p>
     * @param relevance value to be set
     */

    public void setRelevance(final Double relevance);

    /**
     * factory method
     * @return instance of CustomerSearchResult
     */
    public static CustomerSearchResult of() {
        return new CustomerSearchResultImpl();
    }

    /**
     * factory method to create a shallow copy CustomerSearchResult
     * @param template instance to be copied
     * @return copy instance
     */
    public static CustomerSearchResult of(final CustomerSearchResult template) {
        CustomerSearchResultImpl instance = new CustomerSearchResultImpl();
        instance.setId(template.getId());
        instance.setRelevance(template.getRelevance());
        return instance;
    }

    public CustomerSearchResult copyDeep();

    /**
     * factory method to create a deep copy of CustomerSearchResult
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static CustomerSearchResult deepCopy(@Nullable final CustomerSearchResult template) {
        if (template == null) {
            return null;
        }
        CustomerSearchResultImpl instance = new CustomerSearchResultImpl();
        instance.setId(template.getId());
        instance.setRelevance(template.getRelevance());
        return instance;
    }

    /**
     * builder factory method for CustomerSearchResult
     * @return builder
     */
    public static CustomerSearchResultBuilder builder() {
        return CustomerSearchResultBuilder.of();
    }

    /**
     * create builder for CustomerSearchResult instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CustomerSearchResultBuilder builder(final CustomerSearchResult template) {
        return CustomerSearchResultBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withCustomerSearchResult(Function<CustomerSearchResult, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<CustomerSearchResult> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<CustomerSearchResult>() {
            @Override
            public String toString() {
                return "TypeReference<CustomerSearchResult>";
            }
        };
    }
}
