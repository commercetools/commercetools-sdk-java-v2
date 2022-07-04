
package com.commercetools.api.models.quote_request;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>PagedQueryResult with results containing an array of QuoteRequest.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     QuoteRequestPagedQueryResponse quoteRequestPagedQueryResponse = QuoteRequestPagedQueryResponse.builder()
 *             .limit(0.3)
 *             .offset(0.3)
 *             .count(0.3)
 *             .plusResults(resultsBuilder -> resultsBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = QuoteRequestPagedQueryResponseImpl.class)
public interface QuoteRequestPagedQueryResponse
        extends com.commercetools.api.models.ResourcePagedQueryResponse<QuoteRequest> {

    /**
     *  <p>Number of results requested.</p>
     */
    @NotNull
    @JsonProperty("limit")
    public Long getLimit();

    /**
     *  <p>Number of elements skipped.</p>
     */
    @NotNull
    @JsonProperty("offset")
    public Long getOffset();

    /**
     *  <p>Actual number of results returned.</p>
     */
    @NotNull
    @JsonProperty("count")
    public Long getCount();

    /**
     *  <p>Total number of results matching the query. This number is an estimation that is not strongly consistent. This field is returned by default. For improved performance, calculating this field can be deactivated by using the query parameter <code>withTotal=false</code>. When the results are filtered with a Query Predicate, <code>total</code> is subject to a limit.</p>
     */

    @JsonProperty("total")
    public Long getTotal();

    /**
     *  <p>Quote Requests matching the query.</p>
     */
    @NotNull
    @Valid
    @JsonProperty("results")
    public List<QuoteRequest> getResults();

    public void setLimit(final Long limit);

    public void setOffset(final Long offset);

    public void setCount(final Long count);

    public void setTotal(final Long total);

    @JsonIgnore
    public void setResults(final QuoteRequest... results);

    public void setResults(final List<QuoteRequest> results);

    public static QuoteRequestPagedQueryResponse of() {
        return new QuoteRequestPagedQueryResponseImpl();
    }

    public static QuoteRequestPagedQueryResponse of(final QuoteRequestPagedQueryResponse template) {
        QuoteRequestPagedQueryResponseImpl instance = new QuoteRequestPagedQueryResponseImpl();
        instance.setLimit(template.getLimit());
        instance.setOffset(template.getOffset());
        instance.setCount(template.getCount());
        instance.setTotal(template.getTotal());
        instance.setResults(template.getResults());
        return instance;
    }

    public static QuoteRequestPagedQueryResponseBuilder builder() {
        return QuoteRequestPagedQueryResponseBuilder.of();
    }

    public static QuoteRequestPagedQueryResponseBuilder builder(final QuoteRequestPagedQueryResponse template) {
        return QuoteRequestPagedQueryResponseBuilder.of(template);
    }

    default <T> T withQuoteRequestPagedQueryResponse(Function<QuoteRequestPagedQueryResponse, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<QuoteRequestPagedQueryResponse> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<QuoteRequestPagedQueryResponse>() {
            @Override
            public String toString() {
                return "TypeReference<QuoteRequestPagedQueryResponse>";
            }
        };
    }
}
