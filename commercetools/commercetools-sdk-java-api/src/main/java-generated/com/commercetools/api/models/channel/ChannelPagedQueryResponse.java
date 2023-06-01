package com.commercetools.api.models.channel;

import com.commercetools.api.models.channel.Channel;
import com.commercetools.api.models.channel.ChannelPagedQueryResponseImpl;

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
 *  <p>PagedQueryResult with results containing an array of Channel.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ChannelPagedQueryResponse channelPagedQueryResponse = ChannelPagedQueryResponse.builder()
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
@JsonDeserialize(as = ChannelPagedQueryResponseImpl.class)
public interface ChannelPagedQueryResponse extends com.commercetools.api.models.ResourcePagedQueryResponse<Channel> {


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
     *  <p>Channels matching the query.</p>
     * @return results
     */
    @NotNull
    @Valid
    @JsonProperty("results")
    public List<Channel> getResults();

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
     *  <p>Channels matching the query.</p>
     * @param results values to be set
     */
    
    @JsonIgnore
    public void setResults(final Channel ...results);
    /**
     *  <p>Channels matching the query.</p>
     * @param results values to be set
     */
    
    public void setResults(final List<Channel> results);

    /**
     * factory method
     * @return instance of ChannelPagedQueryResponse
     */
    public static ChannelPagedQueryResponse of(){
        return new ChannelPagedQueryResponseImpl();
    }
    

    /**
     * factory method to create a shallow copy ChannelPagedQueryResponse
     * @param template instance to be copied
     * @return copy instance
     */
    public static ChannelPagedQueryResponse of(final ChannelPagedQueryResponse template) {
        ChannelPagedQueryResponseImpl instance = new ChannelPagedQueryResponseImpl();
        instance.setLimit(template.getLimit());
        instance.setOffset(template.getOffset());
        instance.setCount(template.getCount());
        instance.setTotal(template.getTotal());
        instance.setResults(template.getResults());
        return instance;
    }

    /**
     * factory method to create a deep copy of ChannelPagedQueryResponse
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ChannelPagedQueryResponse deepCopy(@Nullable final ChannelPagedQueryResponse template) {
        if (template == null) {
            return null;
        }
        ChannelPagedQueryResponseImpl instance = new ChannelPagedQueryResponseImpl();
        instance.setLimit(template.getLimit());
        instance.setOffset(template.getOffset());
        instance.setCount(template.getCount());
        instance.setTotal(template.getTotal());
        instance.setResults(Optional.ofNullable(template.getResults())
                .map(t -> t.stream().map(com.commercetools.api.models.channel.Channel::deepCopy).collect(Collectors.toList()))
                .orElse(null));
        return instance;
    }

    /**
     * builder factory method for ChannelPagedQueryResponse
     * @return builder
     */
    public static ChannelPagedQueryResponseBuilder builder() {
        return ChannelPagedQueryResponseBuilder.of();
    }
    
    /**
     * create builder for ChannelPagedQueryResponse instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ChannelPagedQueryResponseBuilder builder(final ChannelPagedQueryResponse template) {
        return ChannelPagedQueryResponseBuilder.of(template);
    }


    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withChannelPagedQueryResponse(Function<ChannelPagedQueryResponse, T> helper) {
        return helper.apply(this);
    }
    
    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ChannelPagedQueryResponse> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ChannelPagedQueryResponse>() {
            @Override
            public String toString() {
                return "TypeReference<ChannelPagedQueryResponse>";
            }
        };
    }
}
