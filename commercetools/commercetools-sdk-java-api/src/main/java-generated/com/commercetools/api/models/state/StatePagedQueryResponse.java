
package com.commercetools.api.models.state;

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
 *  <p><span>PagedQueryResult</span> with <code>results</code> containing an array of <a href="https://docs.commercetools.com/apis/ctp:api:type:State" rel="nofollow">State</a>.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     StatePagedQueryResponse statePagedQueryResponse = StatePagedQueryResponse.builder()
 *             .limit(0.3)
 *             .offset(0.3)
 *             .count(0.3)
 *             .plusResults(resultsBuilder -> resultsBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = StatePagedQueryResponseImpl.class)
public interface StatePagedQueryResponse extends com.commercetools.api.models.ResourcePagedQueryResponse<State> {

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
     *  <p>Total number of results matching the query. This number is an estimation that is not <span>strongly consistent</span>. This field is returned by default. For improved performance, calculating this field can be deactivated by using the query parameter <code>withTotal=false</code>. When the results are filtered with a <span>Query Predicate</span>, <code>total</code> is subject to a <span>limit</span>.</p>
     * @return total
     */

    @JsonProperty("total")
    public Long getTotal();

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:State" rel="nofollow">States</a> matching the query.</p>
     * @return results
     */
    @NotNull
    @Valid
    @JsonProperty("results")
    public List<State> getResults();

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
     *  <p>Total number of results matching the query. This number is an estimation that is not <span>strongly consistent</span>. This field is returned by default. For improved performance, calculating this field can be deactivated by using the query parameter <code>withTotal=false</code>. When the results are filtered with a <span>Query Predicate</span>, <code>total</code> is subject to a <span>limit</span>.</p>
     * @param total value to be set
     */

    public void setTotal(final Long total);

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:State" rel="nofollow">States</a> matching the query.</p>
     * @param results values to be set
     */

    @JsonIgnore
    public void setResults(final State... results);

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:State" rel="nofollow">States</a> matching the query.</p>
     * @param results values to be set
     */

    public void setResults(final List<State> results);

    /**
     * factory method
     * @return instance of StatePagedQueryResponse
     */
    public static StatePagedQueryResponse of() {
        return new StatePagedQueryResponseImpl();
    }

    /**
     * factory method to create a shallow copy StatePagedQueryResponse
     * @param template instance to be copied
     * @return copy instance
     */
    public static StatePagedQueryResponse of(final StatePagedQueryResponse template) {
        StatePagedQueryResponseImpl instance = new StatePagedQueryResponseImpl();
        instance.setLimit(template.getLimit());
        instance.setOffset(template.getOffset());
        instance.setCount(template.getCount());
        instance.setTotal(template.getTotal());
        instance.setResults(template.getResults());
        return instance;
    }

    public StatePagedQueryResponse copyDeep();

    /**
     * factory method to create a deep copy of StatePagedQueryResponse
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static StatePagedQueryResponse deepCopy(@Nullable final StatePagedQueryResponse template) {
        if (template == null) {
            return null;
        }
        StatePagedQueryResponseImpl instance = new StatePagedQueryResponseImpl();
        instance.setLimit(template.getLimit());
        instance.setOffset(template.getOffset());
        instance.setCount(template.getCount());
        instance.setTotal(template.getTotal());
        instance.setResults(Optional.ofNullable(template.getResults())
                .map(t -> t.stream()
                        .map(com.commercetools.api.models.state.State::deepCopy)
                        .collect(Collectors.toList()))
                .orElse(null));
        return instance;
    }

    /**
     * builder factory method for StatePagedQueryResponse
     * @return builder
     */
    public static StatePagedQueryResponseBuilder builder() {
        return StatePagedQueryResponseBuilder.of();
    }

    /**
     * create builder for StatePagedQueryResponse instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static StatePagedQueryResponseBuilder builder(final StatePagedQueryResponse template) {
        return StatePagedQueryResponseBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withStatePagedQueryResponse(Function<StatePagedQueryResponse, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<StatePagedQueryResponse> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<StatePagedQueryResponse>() {
            @Override
            public String toString() {
                return "TypeReference<StatePagedQueryResponse>";
            }
        };
    }
}
