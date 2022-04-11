
package com.commercetools.api.models.subscription;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class SubscriptionPagedQueryResponseBuilder implements Builder<SubscriptionPagedQueryResponse> {

    private Long limit;

    private Long count;

    @Nullable
    private Long total;

    private Long offset;

    private java.util.List<com.commercetools.api.models.subscription.Subscription> results;

    public SubscriptionPagedQueryResponseBuilder limit(final Long limit) {
        this.limit = limit;
        return this;
    }

    public SubscriptionPagedQueryResponseBuilder count(final Long count) {
        this.count = count;
        return this;
    }

    public SubscriptionPagedQueryResponseBuilder total(@Nullable final Long total) {
        this.total = total;
        return this;
    }

    public SubscriptionPagedQueryResponseBuilder offset(final Long offset) {
        this.offset = offset;
        return this;
    }

    public SubscriptionPagedQueryResponseBuilder results(
            final com.commercetools.api.models.subscription.Subscription... results) {
        this.results = new ArrayList<>(Arrays.asList(results));
        return this;
    }

    public SubscriptionPagedQueryResponseBuilder results(
            final java.util.List<com.commercetools.api.models.subscription.Subscription> results) {
        this.results = results;
        return this;
    }

    public SubscriptionPagedQueryResponseBuilder plusResults(
            final com.commercetools.api.models.subscription.Subscription... results) {
        if (this.results == null) {
            this.results = new ArrayList<>();
        }
        this.results.addAll(Arrays.asList(results));
        return this;
    }

    public SubscriptionPagedQueryResponseBuilder plusResults(
            Function<com.commercetools.api.models.subscription.SubscriptionBuilder, com.commercetools.api.models.subscription.SubscriptionBuilder> builder) {
        if (this.results == null) {
            this.results = new ArrayList<>();
        }
        this.results.add(builder.apply(com.commercetools.api.models.subscription.SubscriptionBuilder.of()).build());
        return this;
    }

    public SubscriptionPagedQueryResponseBuilder withResults(
            Function<com.commercetools.api.models.subscription.SubscriptionBuilder, com.commercetools.api.models.subscription.SubscriptionBuilder> builder) {
        this.results = new ArrayList<>();
        this.results.add(builder.apply(com.commercetools.api.models.subscription.SubscriptionBuilder.of()).build());
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

    public java.util.List<com.commercetools.api.models.subscription.Subscription> getResults() {
        return this.results;
    }

    public SubscriptionPagedQueryResponse build() {
        Objects.requireNonNull(limit, SubscriptionPagedQueryResponse.class + ": limit is missing");
        Objects.requireNonNull(count, SubscriptionPagedQueryResponse.class + ": count is missing");
        Objects.requireNonNull(offset, SubscriptionPagedQueryResponse.class + ": offset is missing");
        Objects.requireNonNull(results, SubscriptionPagedQueryResponse.class + ": results is missing");
        return new SubscriptionPagedQueryResponseImpl(limit, count, total, offset, results);
    }

    /**
     * builds SubscriptionPagedQueryResponse without checking for non null required values
     */
    public SubscriptionPagedQueryResponse buildUnchecked() {
        return new SubscriptionPagedQueryResponseImpl(limit, count, total, offset, results);
    }

    public static SubscriptionPagedQueryResponseBuilder of() {
        return new SubscriptionPagedQueryResponseBuilder();
    }

    public static SubscriptionPagedQueryResponseBuilder of(final SubscriptionPagedQueryResponse template) {
        SubscriptionPagedQueryResponseBuilder builder = new SubscriptionPagedQueryResponseBuilder();
        builder.limit = template.getLimit();
        builder.count = template.getCount();
        builder.total = template.getTotal();
        builder.offset = template.getOffset();
        builder.results = template.getResults();
        return builder;
    }

}
