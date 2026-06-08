
package com.commercetools.history.models.change_history;

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
 *  <p><span>PagedQueryResult</span> with <code>results</code> containing an array of <a href="https://docs.commercetools.com/apis/ctp:history:type:Record" rel="nofollow">Record</a>.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     RecordPagedQueryResponse recordPagedQueryResponse = RecordPagedQueryResponse.builder()
 *             .limit(1)
 *             .count(1)
 *             .total(1)
 *             .offset(1)
 *             .plusResults(resultsBuilder -> resultsBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = RecordPagedQueryResponseImpl.class)
public interface RecordPagedQueryResponse {

    /**
     *  <p>Number of <span>results requested</span>.</p>
     * @return limit
     */
    @NotNull
    @JsonProperty("limit")
    public Integer getLimit();

    /**
     *  <p>Actual number of results returned.</p>
     * @return count
     */
    @NotNull
    @JsonProperty("count")
    public Integer getCount();

    /**
     *  <p>Total number of results matching the query. This number is an estimation and not <span>strongly consistent</span>.</p>
     * @return total
     */
    @NotNull
    @JsonProperty("total")
    public Integer getTotal();

    /**
     *  <p>Number of <span>elements skipped</span>.</p>
     * @return offset
     */
    @NotNull
    @JsonProperty("offset")
    public Integer getOffset();

    /**
     *  <p>Records matching the query.</p>
     * @return results
     */
    @NotNull
    @Valid
    @JsonProperty("results")
    public List<Record> getResults();

    /**
     *  <p>Number of <span>results requested</span>.</p>
     * @param limit value to be set
     */

    public void setLimit(final Integer limit);

    /**
     *  <p>Actual number of results returned.</p>
     * @param count value to be set
     */

    public void setCount(final Integer count);

    /**
     *  <p>Total number of results matching the query. This number is an estimation and not <span>strongly consistent</span>.</p>
     * @param total value to be set
     */

    public void setTotal(final Integer total);

    /**
     *  <p>Number of <span>elements skipped</span>.</p>
     * @param offset value to be set
     */

    public void setOffset(final Integer offset);

    /**
     *  <p>Records matching the query.</p>
     * @param results values to be set
     */

    @JsonIgnore
    public void setResults(final Record... results);

    /**
     *  <p>Records matching the query.</p>
     * @param results values to be set
     */

    public void setResults(final List<Record> results);

    /**
     * factory method
     * @return instance of RecordPagedQueryResponse
     */
    public static RecordPagedQueryResponse of() {
        return new RecordPagedQueryResponseImpl();
    }

    /**
     * factory method to create a shallow copy RecordPagedQueryResponse
     * @param template instance to be copied
     * @return copy instance
     */
    public static RecordPagedQueryResponse of(final RecordPagedQueryResponse template) {
        RecordPagedQueryResponseImpl instance = new RecordPagedQueryResponseImpl();
        instance.setLimit(template.getLimit());
        instance.setCount(template.getCount());
        instance.setTotal(template.getTotal());
        instance.setOffset(template.getOffset());
        instance.setResults(template.getResults());
        return instance;
    }

    public RecordPagedQueryResponse copyDeep();

    /**
     * factory method to create a deep copy of RecordPagedQueryResponse
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static RecordPagedQueryResponse deepCopy(@Nullable final RecordPagedQueryResponse template) {
        if (template == null) {
            return null;
        }
        RecordPagedQueryResponseImpl instance = new RecordPagedQueryResponseImpl();
        instance.setLimit(template.getLimit());
        instance.setCount(template.getCount());
        instance.setTotal(template.getTotal());
        instance.setOffset(template.getOffset());
        instance.setResults(Optional.ofNullable(template.getResults())
                .map(t -> t.stream()
                        .map(com.commercetools.history.models.change_history.Record::deepCopy)
                        .collect(Collectors.toList()))
                .orElse(null));
        return instance;
    }

    /**
     * builder factory method for RecordPagedQueryResponse
     * @return builder
     */
    public static RecordPagedQueryResponseBuilder builder() {
        return RecordPagedQueryResponseBuilder.of();
    }

    /**
     * create builder for RecordPagedQueryResponse instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static RecordPagedQueryResponseBuilder builder(final RecordPagedQueryResponse template) {
        return RecordPagedQueryResponseBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withRecordPagedQueryResponse(Function<RecordPagedQueryResponse, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<RecordPagedQueryResponse> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<RecordPagedQueryResponse>() {
            @Override
            public String toString() {
                return "TypeReference<RecordPagedQueryResponse>";
            }
        };
    }
}
