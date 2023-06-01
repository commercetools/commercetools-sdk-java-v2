package com.commercetools.api.models.quote;

import com.commercetools.api.models.quote.Quote;
import com.commercetools.api.models.quote.QuotePagedQueryResponseImpl;

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
 *  <p>PagedQueryResult with results containing an array of Quote.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     QuotePagedQueryResponse quotePagedQueryResponse = QuotePagedQueryResponse.builder()
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
@JsonDeserialize(as = QuotePagedQueryResponseImpl.class)
public interface QuotePagedQueryResponse extends com.commercetools.api.models.ResourcePagedQueryResponse<Quote> {


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
     *  <p>Quotes matching the query.</p>
     * @return results
     */
    @NotNull
    @Valid
    @JsonProperty("results")
    public List<Quote> getResults();

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
     *  <p>Quotes matching the query.</p>
     * @param results values to be set
     */
    
    @JsonIgnore
    public void setResults(final Quote ...results);
    /**
     *  <p>Quotes matching the query.</p>
     * @param results values to be set
     */
    
    public void setResults(final List<Quote> results);

    /**
     * factory method
     * @return instance of QuotePagedQueryResponse
     */
    public static QuotePagedQueryResponse of(){
        return new QuotePagedQueryResponseImpl();
    }
    

    /**
     * factory method to create a shallow copy QuotePagedQueryResponse
     * @param template instance to be copied
     * @return copy instance
     */
    public static QuotePagedQueryResponse of(final QuotePagedQueryResponse template) {
        QuotePagedQueryResponseImpl instance = new QuotePagedQueryResponseImpl();
        instance.setLimit(template.getLimit());
        instance.setOffset(template.getOffset());
        instance.setCount(template.getCount());
        instance.setTotal(template.getTotal());
        instance.setResults(template.getResults());
        return instance;
    }

    /**
     * factory method to create a deep copy of QuotePagedQueryResponse
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static QuotePagedQueryResponse deepCopy(@Nullable final QuotePagedQueryResponse template) {
        if (template == null) {
            return null;
        }
        QuotePagedQueryResponseImpl instance = new QuotePagedQueryResponseImpl();
        instance.setLimit(template.getLimit());
        instance.setOffset(template.getOffset());
        instance.setCount(template.getCount());
        instance.setTotal(template.getTotal());
        instance.setResults(Optional.ofNullable(template.getResults())
                .map(t -> t.stream().map(com.commercetools.api.models.quote.Quote::deepCopy).collect(Collectors.toList()))
                .orElse(null));
        return instance;
    }

    /**
     * builder factory method for QuotePagedQueryResponse
     * @return builder
     */
    public static QuotePagedQueryResponseBuilder builder() {
        return QuotePagedQueryResponseBuilder.of();
    }
    
    /**
     * create builder for QuotePagedQueryResponse instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static QuotePagedQueryResponseBuilder builder(final QuotePagedQueryResponse template) {
        return QuotePagedQueryResponseBuilder.of(template);
    }


    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withQuotePagedQueryResponse(Function<QuotePagedQueryResponse, T> helper) {
        return helper.apply(this);
    }
    
    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<QuotePagedQueryResponse> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<QuotePagedQueryResponse>() {
            @Override
            public String toString() {
                return "TypeReference<QuotePagedQueryResponse>";
            }
        };
    }
}
