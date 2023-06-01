package com.commercetools.api.models.staged_quote;

import com.commercetools.api.models.staged_quote.StagedQuote;
import com.commercetools.api.models.staged_quote.StagedQuotePagedQueryResponseImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import io.vrap.rmf.base.client.utils.Generated;
import io.vrap.rmf.base.client.Accessor;
import javax.validation.Valid;
import javax.annotation.Nullable;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.io.IOException;

/**
 *  <p>PagedQueryResult with results containing an array of StagedQuote.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     StagedQuotePagedQueryResponse stagedQuotePagedQueryResponse = StagedQuotePagedQueryResponse.builder()
 *             .limit(0.3)
 *             .offset(0.3)
 *             .count(0.3)
 *             .plusResults(resultsBuilder -> resultsBuilder)
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
@JsonDeserialize(as = StagedQuotePagedQueryResponseImpl.class)
public interface StagedQuotePagedQueryResponse extends com.commercetools.api.models.ResourcePagedQueryResponse<StagedQuote> {


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
     *  <p>Staged Quotes matching the query.</p>
     * @return results
     */
    @NotNull
    @Valid
    @JsonProperty("results")
    public List<StagedQuote> getResults();

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
     *  <p>Staged Quotes matching the query.</p>
     * @param results values to be set
     */
    
    @JsonIgnore
    public void setResults(final StagedQuote ...results);
    /**
     *  <p>Staged Quotes matching the query.</p>
     * @param results values to be set
     */
    
    public void setResults(final List<StagedQuote> results);

    /**
     * factory method
     * @return instance of StagedQuotePagedQueryResponse
     */
    public static StagedQuotePagedQueryResponse of(){
        return new StagedQuotePagedQueryResponseImpl();
    }
    

    /**
     * factory method to create a shallow copy StagedQuotePagedQueryResponse
     * @param template instance to be copied
     * @return copy instance
     */
    public static StagedQuotePagedQueryResponse of(final StagedQuotePagedQueryResponse template) {
        StagedQuotePagedQueryResponseImpl instance = new StagedQuotePagedQueryResponseImpl();
        instance.setLimit(template.getLimit());
        instance.setOffset(template.getOffset());
        instance.setCount(template.getCount());
        instance.setTotal(template.getTotal());
        instance.setResults(template.getResults());
        return instance;
    }

    /**
     * factory method to create a deep copy of StagedQuotePagedQueryResponse
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static StagedQuotePagedQueryResponse deepCopy(@Nullable final StagedQuotePagedQueryResponse template) {
        if (template == null) {
            return null;
        }
        StagedQuotePagedQueryResponseImpl instance = new StagedQuotePagedQueryResponseImpl();
        instance.setLimit(template.getLimit());
        instance.setOffset(template.getOffset());
        instance.setCount(template.getCount());
        instance.setTotal(template.getTotal());
        instance.setResults(Optional.ofNullable(template.getResults())
                .map(t -> t.stream().map(com.commercetools.api.models.staged_quote.StagedQuote::deepCopy).collect(Collectors.toList()))
                .orElse(null));
        return instance;
    }

    /**
     * builder factory method for StagedQuotePagedQueryResponse
     * @return builder
     */
    public static StagedQuotePagedQueryResponseBuilder builder() {
        return StagedQuotePagedQueryResponseBuilder.of();
    }
    
    /**
     * create builder for StagedQuotePagedQueryResponse instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static StagedQuotePagedQueryResponseBuilder builder(final StagedQuotePagedQueryResponse template) {
        return StagedQuotePagedQueryResponseBuilder.of(template);
    }


    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withStagedQuotePagedQueryResponse(Function<StagedQuotePagedQueryResponse, T> helper) {
        return helper.apply(this);
    }
    
    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<StagedQuotePagedQueryResponse> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<StagedQuotePagedQueryResponse>() {
            @Override
            public String toString() {
                return "TypeReference<StagedQuotePagedQueryResponse>";
            }
        };
    }
}
