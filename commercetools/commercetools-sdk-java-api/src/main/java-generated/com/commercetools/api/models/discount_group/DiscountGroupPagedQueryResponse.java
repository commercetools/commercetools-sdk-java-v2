
package com.commercetools.api.models.discount_group;

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
 *  <p>PagedQueryResult with <code>results</code> containing an array of DiscountGroup.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     DiscountGroupPagedQueryResponse discountGroupPagedQueryResponse = DiscountGroupPagedQueryResponse.builder()
 *             .limit(0.3)
 *             .offset(0.3)
 *             .count(0.3)
 *             .plusResults(resultsBuilder -> resultsBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = DiscountGroupPagedQueryResponseImpl.class)
public interface DiscountGroupPagedQueryResponse {

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
     *  <p>DiscountGroups matching the query.</p>
     * @return results
     */
    @NotNull
    @Valid
    @JsonProperty("results")
    public List<DiscountGroup> getResults();

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
     *  <p>DiscountGroups matching the query.</p>
     * @param results values to be set
     */

    @JsonIgnore
    public void setResults(final DiscountGroup... results);

    /**
     *  <p>DiscountGroups matching the query.</p>
     * @param results values to be set
     */

    public void setResults(final List<DiscountGroup> results);

    /**
     * factory method
     * @return instance of DiscountGroupPagedQueryResponse
     */
    public static DiscountGroupPagedQueryResponse of() {
        return new DiscountGroupPagedQueryResponseImpl();
    }

    /**
     * factory method to create a shallow copy DiscountGroupPagedQueryResponse
     * @param template instance to be copied
     * @return copy instance
     */
    public static DiscountGroupPagedQueryResponse of(final DiscountGroupPagedQueryResponse template) {
        DiscountGroupPagedQueryResponseImpl instance = new DiscountGroupPagedQueryResponseImpl();
        instance.setLimit(template.getLimit());
        instance.setOffset(template.getOffset());
        instance.setCount(template.getCount());
        instance.setTotal(template.getTotal());
        instance.setResults(template.getResults());
        return instance;
    }

    public DiscountGroupPagedQueryResponse copyDeep();

    /**
     * factory method to create a deep copy of DiscountGroupPagedQueryResponse
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static DiscountGroupPagedQueryResponse deepCopy(@Nullable final DiscountGroupPagedQueryResponse template) {
        if (template == null) {
            return null;
        }
        DiscountGroupPagedQueryResponseImpl instance = new DiscountGroupPagedQueryResponseImpl();
        instance.setLimit(template.getLimit());
        instance.setOffset(template.getOffset());
        instance.setCount(template.getCount());
        instance.setTotal(template.getTotal());
        instance.setResults(Optional.ofNullable(template.getResults())
                .map(t -> t.stream()
                        .map(com.commercetools.api.models.discount_group.DiscountGroup::deepCopy)
                        .collect(Collectors.toList()))
                .orElse(null));
        return instance;
    }

    /**
     * builder factory method for DiscountGroupPagedQueryResponse
     * @return builder
     */
    public static DiscountGroupPagedQueryResponseBuilder builder() {
        return DiscountGroupPagedQueryResponseBuilder.of();
    }

    /**
     * create builder for DiscountGroupPagedQueryResponse instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static DiscountGroupPagedQueryResponseBuilder builder(final DiscountGroupPagedQueryResponse template) {
        return DiscountGroupPagedQueryResponseBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withDiscountGroupPagedQueryResponse(Function<DiscountGroupPagedQueryResponse, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<DiscountGroupPagedQueryResponse> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<DiscountGroupPagedQueryResponse>() {
            @Override
            public String toString() {
                return "TypeReference<DiscountGroupPagedQueryResponse>";
            }
        };
    }
}
