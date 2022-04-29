
package com.commercetools.api.models.message;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = MessagePagedQueryResponseImpl.class)
public interface MessagePagedQueryResponse extends com.commercetools.api.models.ResourcePagedQueryResponse<Message> {

    @NotNull
    @JsonProperty("limit")
    public Long getLimit();

    @NotNull
    @JsonProperty("count")
    public Long getCount();

    @JsonProperty("total")
    public Long getTotal();

    @NotNull
    @JsonProperty("offset")
    public Long getOffset();

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
