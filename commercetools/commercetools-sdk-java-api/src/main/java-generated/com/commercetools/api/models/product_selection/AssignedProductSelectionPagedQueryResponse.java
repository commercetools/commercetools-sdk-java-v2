
package com.commercetools.api.models.product_selection;

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
 *  <p><span>PagedQueryResult</span> containing an array of <a href="https://docs.commercetools.com/apis/ctp:api:type:AssignedProductSelection" rel="nofollow">AssignedProductSelection</a>.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     AssignedProductSelectionPagedQueryResponse assignedProductSelectionPagedQueryResponse = AssignedProductSelectionPagedQueryResponse.builder()
 *             .limit(0.3)
 *             .offset(0.3)
 *             .count(0.3)
 *             .plusResults(resultsBuilder -> resultsBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = AssignedProductSelectionPagedQueryResponseImpl.class)
public interface AssignedProductSelectionPagedQueryResponse
        extends com.commercetools.api.models.ResourcePagedQueryResponse<AssignedProductSelection> {

    /**
     *  <p>Number of <span>results requested</span>.</p>
     * @return limit
     */
    @NotNull
    @JsonProperty("limit")
    public Long getLimit();

    /**
     *  <p>Number of <span>elements skipped</span>.</p>
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
     *  <p>Total number of results matching the query. Present only when the <code>withTotal</code> query parameter is set to <code>true</code>. This number is an estimation that is not <span>strongly consistent</span>. When the results are filtered with a <span>Query Predicate</span>, <code>total</code> is subject to a <span>limit</span>.</p>
     * @return total
     */

    @JsonProperty("total")
    public Long getTotal();

    /**
     *  <p>References to ProductSelection that are assigned to the Product.</p>
     * @return results
     */
    @NotNull
    @Valid
    @JsonProperty("results")
    public List<AssignedProductSelection> getResults();

    /**
     *  <p>Number of <span>results requested</span>.</p>
     * @param limit value to be set
     */

    public void setLimit(final Long limit);

    /**
     *  <p>Number of <span>elements skipped</span>.</p>
     * @param offset value to be set
     */

    public void setOffset(final Long offset);

    /**
     *  <p>Actual number of results returned.</p>
     * @param count value to be set
     */

    public void setCount(final Long count);

    /**
     *  <p>Total number of results matching the query. Present only when the <code>withTotal</code> query parameter is set to <code>true</code>. This number is an estimation that is not <span>strongly consistent</span>. When the results are filtered with a <span>Query Predicate</span>, <code>total</code> is subject to a <span>limit</span>.</p>
     * @param total value to be set
     */

    public void setTotal(final Long total);

    /**
     *  <p>References to ProductSelection that are assigned to the Product.</p>
     * @param results values to be set
     */

    @JsonIgnore
    public void setResults(final AssignedProductSelection... results);

    /**
     *  <p>References to ProductSelection that are assigned to the Product.</p>
     * @param results values to be set
     */

    public void setResults(final List<AssignedProductSelection> results);

    /**
     * factory method
     * @return instance of AssignedProductSelectionPagedQueryResponse
     */
    public static AssignedProductSelectionPagedQueryResponse of() {
        return new AssignedProductSelectionPagedQueryResponseImpl();
    }

    /**
     * factory method to create a shallow copy AssignedProductSelectionPagedQueryResponse
     * @param template instance to be copied
     * @return copy instance
     */
    public static AssignedProductSelectionPagedQueryResponse of(
            final AssignedProductSelectionPagedQueryResponse template) {
        AssignedProductSelectionPagedQueryResponseImpl instance = new AssignedProductSelectionPagedQueryResponseImpl();
        instance.setLimit(template.getLimit());
        instance.setOffset(template.getOffset());
        instance.setCount(template.getCount());
        instance.setTotal(template.getTotal());
        instance.setResults(template.getResults());
        return instance;
    }

    public AssignedProductSelectionPagedQueryResponse copyDeep();

    /**
     * factory method to create a deep copy of AssignedProductSelectionPagedQueryResponse
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static AssignedProductSelectionPagedQueryResponse deepCopy(
            @Nullable final AssignedProductSelectionPagedQueryResponse template) {
        if (template == null) {
            return null;
        }
        AssignedProductSelectionPagedQueryResponseImpl instance = new AssignedProductSelectionPagedQueryResponseImpl();
        instance.setLimit(template.getLimit());
        instance.setOffset(template.getOffset());
        instance.setCount(template.getCount());
        instance.setTotal(template.getTotal());
        instance.setResults(Optional.ofNullable(template.getResults())
                .map(t -> t.stream()
                        .map(com.commercetools.api.models.product_selection.AssignedProductSelection::deepCopy)
                        .collect(Collectors.toList()))
                .orElse(null));
        return instance;
    }

    /**
     * builder factory method for AssignedProductSelectionPagedQueryResponse
     * @return builder
     */
    public static AssignedProductSelectionPagedQueryResponseBuilder builder() {
        return AssignedProductSelectionPagedQueryResponseBuilder.of();
    }

    /**
     * create builder for AssignedProductSelectionPagedQueryResponse instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static AssignedProductSelectionPagedQueryResponseBuilder builder(
            final AssignedProductSelectionPagedQueryResponse template) {
        return AssignedProductSelectionPagedQueryResponseBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withAssignedProductSelectionPagedQueryResponse(
            Function<AssignedProductSelectionPagedQueryResponse, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<AssignedProductSelectionPagedQueryResponse> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<AssignedProductSelectionPagedQueryResponse>() {
            @Override
            public String toString() {
                return "TypeReference<AssignedProductSelectionPagedQueryResponse>";
            }
        };
    }
}
