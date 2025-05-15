
package com.commercetools.api.models.business_unit_search;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.constraints.NotNull;

/**
 * BusinessUnitSearchResult
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     BusinessUnitSearchResult businessUnitSearchResult = BusinessUnitSearchResult.builder()
 *             .id("{id}")
 *             .relevance(0.3)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = BusinessUnitSearchResultImpl.class)
public interface BusinessUnitSearchResult {

    /**
     *  <p><code>id</code> of the BusinessUnit matching the search query.</p>
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
     *  <p><code>id</code> of the BusinessUnit matching the search query.</p>
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
     * @return instance of BusinessUnitSearchResult
     */
    public static BusinessUnitSearchResult of() {
        return new BusinessUnitSearchResultImpl();
    }

    /**
     * factory method to create a shallow copy BusinessUnitSearchResult
     * @param template instance to be copied
     * @return copy instance
     */
    public static BusinessUnitSearchResult of(final BusinessUnitSearchResult template) {
        BusinessUnitSearchResultImpl instance = new BusinessUnitSearchResultImpl();
        instance.setId(template.getId());
        instance.setRelevance(template.getRelevance());
        return instance;
    }

    public BusinessUnitSearchResult copyDeep();

    /**
     * factory method to create a deep copy of BusinessUnitSearchResult
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static BusinessUnitSearchResult deepCopy(@Nullable final BusinessUnitSearchResult template) {
        if (template == null) {
            return null;
        }
        BusinessUnitSearchResultImpl instance = new BusinessUnitSearchResultImpl();
        instance.setId(template.getId());
        instance.setRelevance(template.getRelevance());
        return instance;
    }

    /**
     * builder factory method for BusinessUnitSearchResult
     * @return builder
     */
    public static BusinessUnitSearchResultBuilder builder() {
        return BusinessUnitSearchResultBuilder.of();
    }

    /**
     * create builder for BusinessUnitSearchResult instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static BusinessUnitSearchResultBuilder builder(final BusinessUnitSearchResult template) {
        return BusinessUnitSearchResultBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withBusinessUnitSearchResult(Function<BusinessUnitSearchResult, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<BusinessUnitSearchResult> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<BusinessUnitSearchResult>() {
            @Override
            public String toString() {
                return "TypeReference<BusinessUnitSearchResult>";
            }
        };
    }
}
