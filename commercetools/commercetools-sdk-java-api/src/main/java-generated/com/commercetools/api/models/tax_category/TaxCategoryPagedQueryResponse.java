
package com.commercetools.api.models.tax_category;

import java.time.*;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

import javax.annotation.Nullable;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>PagedQueryResult with <code>results</code> containing an array of TaxCategory.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     TaxCategoryPagedQueryResponse taxCategoryPagedQueryResponse = TaxCategoryPagedQueryResponse.builder()
 *             .limit(0.3)
 *             .offset(0.3)
 *             .count(0.3)
 *             .plusResults(resultsBuilder -> resultsBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = TaxCategoryPagedQueryResponseImpl.class)
public interface TaxCategoryPagedQueryResponse
        extends com.commercetools.api.models.ResourcePagedQueryResponse<TaxCategory> {

    /**
     *  <p>Number of results requested.</p>
     * @return limit
     */
    @NotNull
    @JsonProperty("limit")
    public Long getLimit();

    /**
     *  <p>Number of elements skipped.</p>
     * @return offset
     */
    @NotNull
    @JsonProperty("offset")
    public Long getOffset();

    /**
     *  <p>Actual number of results returned.</p>
     * @return count
     */
    @NotNull
    @JsonProperty("count")
    public Long getCount();

    /**
     *  <p>Total number of results matching the query. This number is an estimation that is not strongly consistent. This field is returned by default. For improved performance, calculating this field can be deactivated by using the query parameter <code>withTotal=false</code>. When the results are filtered with a Query Predicate, <code>total</code> is subject to a limit.</p>
     * @return total
     */

    @JsonProperty("total")
    public Long getTotal();

    /**
     *  <p>TaxCategories matching the query.</p>
     * @return results
     */
    @NotNull
    @Valid
    @JsonProperty("results")
    public List<TaxCategory> getResults();

    /**
     *  <p>Number of results requested.</p>
     * @param limit value to be set
     */

    public void setLimit(final Long limit);

    /**
     *  <p>Number of elements skipped.</p>
     * @param offset value to be set
     */

    public void setOffset(final Long offset);

    /**
     *  <p>Actual number of results returned.</p>
     * @param count value to be set
     */

    public void setCount(final Long count);

    /**
     *  <p>Total number of results matching the query. This number is an estimation that is not strongly consistent. This field is returned by default. For improved performance, calculating this field can be deactivated by using the query parameter <code>withTotal=false</code>. When the results are filtered with a Query Predicate, <code>total</code> is subject to a limit.</p>
     * @param total value to be set
     */

    public void setTotal(final Long total);

    /**
     *  <p>TaxCategories matching the query.</p>
     * @param results values to be set
     */

    @JsonIgnore
    public void setResults(final TaxCategory... results);

    /**
     *  <p>TaxCategories matching the query.</p>
     * @param results values to be set
     */

    public void setResults(final List<TaxCategory> results);

    /**
     * factory method
     * @return instance of TaxCategoryPagedQueryResponse
     */
    public static TaxCategoryPagedQueryResponse of() {
        return new TaxCategoryPagedQueryResponseImpl();
    }

    /**
     * factory method to create a shallow copy TaxCategoryPagedQueryResponse
     * @param template instance to be copied
     * @return copy instance
     */
    public static TaxCategoryPagedQueryResponse of(final TaxCategoryPagedQueryResponse template) {
        TaxCategoryPagedQueryResponseImpl instance = new TaxCategoryPagedQueryResponseImpl();
        instance.setLimit(template.getLimit());
        instance.setOffset(template.getOffset());
        instance.setCount(template.getCount());
        instance.setTotal(template.getTotal());
        instance.setResults(template.getResults());
        return instance;
    }

    /**
     * factory method to create a deep copy of TaxCategoryPagedQueryResponse
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static TaxCategoryPagedQueryResponse deepCopy(@Nullable final TaxCategoryPagedQueryResponse template) {
        if (template == null) {
            return null;
        }
        TaxCategoryPagedQueryResponseImpl instance = new TaxCategoryPagedQueryResponseImpl();
        instance.setLimit(template.getLimit());
        instance.setOffset(template.getOffset());
        instance.setCount(template.getCount());
        instance.setTotal(template.getTotal());
        instance.setResults(Optional.ofNullable(template.getResults())
                .map(t -> t.stream()
                        .map(com.commercetools.api.models.tax_category.TaxCategory::deepCopy)
                        .collect(Collectors.toList()))
                .orElse(null));
        return instance;
    }

    /**
     * builder factory method for TaxCategoryPagedQueryResponse
     * @return builder
     */
    public static TaxCategoryPagedQueryResponseBuilder builder() {
        return TaxCategoryPagedQueryResponseBuilder.of();
    }

    /**
     * create builder for TaxCategoryPagedQueryResponse instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static TaxCategoryPagedQueryResponseBuilder builder(final TaxCategoryPagedQueryResponse template) {
        return TaxCategoryPagedQueryResponseBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withTaxCategoryPagedQueryResponse(Function<TaxCategoryPagedQueryResponse, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<TaxCategoryPagedQueryResponse> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<TaxCategoryPagedQueryResponse>() {
            @Override
            public String toString() {
                return "TypeReference<TaxCategoryPagedQueryResponse>";
            }
        };
    }
}
