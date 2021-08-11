
package com.commercetools.api.models.message;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class MessagePagedQueryResponseBuilder implements Builder<MessagePagedQueryResponse> {

    private Long limit;

    private Long count;

    @Nullable
    private Long total;

    private Long offset;

    private java.util.List<com.commercetools.api.models.message.Message> results;

    public MessagePagedQueryResponseBuilder limit(final Long limit) {
        this.limit = limit;
        return this;
    }

    public MessagePagedQueryResponseBuilder count(final Long count) {
        this.count = count;
        return this;
    }

    public MessagePagedQueryResponseBuilder total(@Nullable final Long total) {
        this.total = total;
        return this;
    }

    public MessagePagedQueryResponseBuilder offset(final Long offset) {
        this.offset = offset;
        return this;
    }

    public MessagePagedQueryResponseBuilder results(final com.commercetools.api.models.message.Message... results) {
        this.results = new ArrayList<>(Arrays.asList(results));
        return this;
    }

    public MessagePagedQueryResponseBuilder results(
            final java.util.List<com.commercetools.api.models.message.Message> results) {
        this.results = results;
        return this;
    }

    public Long getLimit() {
        return this.limit;
    }

    public Long getCount() {
        return this.count;
    }

    @Nullable
    public Long getTotal() {
        return this.total;
    }

    public Long getOffset() {
        return this.offset;
    }

    public java.util.List<com.commercetools.api.models.message.Message> getResults() {
        return this.results;
    }

    public MessagePagedQueryResponse build() {
        Objects.requireNonNull(limit, MessagePagedQueryResponse.class + ": limit is missing");
        Objects.requireNonNull(count, MessagePagedQueryResponse.class + ": count is missing");
        Objects.requireNonNull(offset, MessagePagedQueryResponse.class + ": offset is missing");
        Objects.requireNonNull(results, MessagePagedQueryResponse.class + ": results is missing");
        return new MessagePagedQueryResponseImpl(limit, count, total, offset, results);
    }

    /**
     * builds MessagePagedQueryResponse without checking for non null required values
     */
    public MessagePagedQueryResponse buildUnchecked() {
        return new MessagePagedQueryResponseImpl(limit, count, total, offset, results);
    }

    public static MessagePagedQueryResponseBuilder of() {
        return new MessagePagedQueryResponseBuilder();
    }

    public static MessagePagedQueryResponseBuilder of(final MessagePagedQueryResponse template) {
        MessagePagedQueryResponseBuilder builder = new MessagePagedQueryResponseBuilder();
        builder.limit = template.getLimit();
        builder.count = template.getCount();
        builder.total = template.getTotal();
        builder.offset = template.getOffset();
        builder.results = template.getResults();
        return builder;
    }

}
