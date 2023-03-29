
package com.commercetools.api.models.standalone_price;

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
 * StandalonePricePagedQueryResponse
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     StandalonePricePagedQueryResponse standalonePricePagedQueryResponse = StandalonePricePagedQueryResponse.builder()
 *             .limit(0.3)
 *             .offset(0.3)
 *             .count(0.3)
 *             .plusResults(resultsBuilder -> resultsBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = StandalonePricePagedQueryResponseImpl.class)
public interface StandalonePricePagedQueryResponse
        extends com.commercetools.api.models.ResourcePagedQueryResponse<StandalonePrice> {

    /**
     *  <p>Number of requested results.</p>
     * @return limit
     */
    @NotNull
    @JsonProperty("limit")
    public Long getLimit();

    /**
     *  <p>Offset supplied by the client or server default. It is the number of elements skipped, not a page number.</p>
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
     *  <p>StandalonePrices matching the query.</p>
     * @return results
     */
    @NotNull
    @Valid
    @JsonProperty("results")
    public List<StandalonePrice> getResults();

    /**
     *  <p>Number of requested results.</p>
     * @param limit value to be set
     */

    public void setLimit(final Long limit);

    /**
     *  <p>Offset supplied by the client or server default. It is the number of elements skipped, not a page number.</p>
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
     *  <p>StandalonePrices matching the query.</p>
     * @param results values to be set
     */

    @JsonIgnore
    public void setResults(final StandalonePrice... results);

    /**
     *  <p>StandalonePrices matching the query.</p>
     * @param results values to be set
     */

    public void setResults(final List<StandalonePrice> results);

    /**
     * factory method
     * @return instance of StandalonePricePagedQueryResponse
     */
    public static StandalonePricePagedQueryResponse of() {
        return new StandalonePricePagedQueryResponseImpl();
    }

    /**
     * factory method to create a shallow copy StandalonePricePagedQueryResponse
     * @param template instance to be copied
     * @return copy instance
     */
    public static StandalonePricePagedQueryResponse of(final StandalonePricePagedQueryResponse template) {
        StandalonePricePagedQueryResponseImpl instance = new StandalonePricePagedQueryResponseImpl();
        instance.setLimit(template.getLimit());
        instance.setOffset(template.getOffset());
        instance.setCount(template.getCount());
        instance.setTotal(template.getTotal());
        instance.setResults(template.getResults());
        return instance;
    }

    /**
     * factory method to create a deep copy of StandalonePricePagedQueryResponse
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static StandalonePricePagedQueryResponse deepCopy(
            @Nullable final StandalonePricePagedQueryResponse template) {
        if (template == null) {
            return null;
        }
        StandalonePricePagedQueryResponseImpl instance = new StandalonePricePagedQueryResponseImpl();
        instance.setLimit(template.getLimit());
        instance.setOffset(template.getOffset());
        instance.setCount(template.getCount());
        instance.setTotal(template.getTotal());
        instance.setResults(Optional.ofNullable(template.getResults())
                .map(t -> t.stream()
                        .map(com.commercetools.api.models.standalone_price.StandalonePrice::deepCopy)
                        .collect(Collectors.toList()))
                .orElse(null));
        return instance;
    }

    /**
     * builder factory method for StandalonePricePagedQueryResponse
     * @return builder
     */
    public static StandalonePricePagedQueryResponseBuilder builder() {
        return StandalonePricePagedQueryResponseBuilder.of();
    }

    /**
     * create builder for StandalonePricePagedQueryResponse instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static StandalonePricePagedQueryResponseBuilder builder(final StandalonePricePagedQueryResponse template) {
        return StandalonePricePagedQueryResponseBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withStandalonePricePagedQueryResponse(Function<StandalonePricePagedQueryResponse, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<StandalonePricePagedQueryResponse> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<StandalonePricePagedQueryResponse>() {
            @Override
            public String toString() {
                return "TypeReference<StandalonePricePagedQueryResponse>";
            }
        };
    }
}
