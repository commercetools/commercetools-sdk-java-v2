
package com.commercetools.api.models.message;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>PagedQueryResult with <code>results</code> containing an array of Message.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     MessagePagedQueryResponse messagePagedQueryResponse = MessagePagedQueryResponse.builder()
 *             .limit(0.3)
 *             .count(0.3)
 *             .offset(0.3)
 *             .plusResults(resultsBuilder -> resultsBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = MessagePagedQueryResponseImpl.class)
public interface MessagePagedQueryResponse extends com.commercetools.api.models.ResourcePagedQueryResponse<Message> {

    /**
     *  <p>Number of results requested.</p>
     * @return limit
     */
    @NotNull
    @JsonProperty("limit")
    public Long getLimit();

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
     *  <p>Number of elements skipped.</p>
     * @return offset
     */
    @NotNull
    @JsonProperty("offset")
    public Long getOffset();

    /**
     *  <p>Messages matching the query.</p>
     * @return results
     */
    @NotNull
    @Valid
    @JsonProperty("results")
    public List<Message> getResults();

    public void setLimit(final Long limit);

    public void setCount(final Long count);

    public void setTotal(final Long total);

    public void setOffset(final Long offset);

    @JsonIgnore
    public void setResults(final Message... results);

    public void setResults(final List<Message> results);

    public static MessagePagedQueryResponse of() {
        return new MessagePagedQueryResponseImpl();
    }

    public static MessagePagedQueryResponse of(final MessagePagedQueryResponse template) {
        MessagePagedQueryResponseImpl instance = new MessagePagedQueryResponseImpl();
        instance.setLimit(template.getLimit());
        instance.setCount(template.getCount());
        instance.setTotal(template.getTotal());
        instance.setOffset(template.getOffset());
        instance.setResults(template.getResults());
        return instance;
    }

    public static MessagePagedQueryResponseBuilder builder() {
        return MessagePagedQueryResponseBuilder.of();
    }

    public static MessagePagedQueryResponseBuilder builder(final MessagePagedQueryResponse template) {
        return MessagePagedQueryResponseBuilder.of(template);
    }

    default <T> T withMessagePagedQueryResponse(Function<MessagePagedQueryResponse, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<MessagePagedQueryResponse> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<MessagePagedQueryResponse>() {
            @Override
            public String toString() {
                return "TypeReference<MessagePagedQueryResponse>";
            }
        };
    }
}
