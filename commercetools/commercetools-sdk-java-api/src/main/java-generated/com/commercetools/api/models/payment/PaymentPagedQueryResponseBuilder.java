
package com.commercetools.api.models.payment;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class PaymentPagedQueryResponseBuilder implements Builder<PaymentPagedQueryResponse> {

    private Long limit;

    private Long count;

    @Nullable
    private Long total;

    private Long offset;

    private java.util.List<com.commercetools.api.models.payment.Payment> results;

    public PaymentPagedQueryResponseBuilder limit(final Long limit) {
        this.limit = limit;
        return this;
    }

    public PaymentPagedQueryResponseBuilder count(final Long count) {
        this.count = count;
        return this;
    }

    public PaymentPagedQueryResponseBuilder total(@Nullable final Long total) {
        this.total = total;
        return this;
    }

    public PaymentPagedQueryResponseBuilder offset(final Long offset) {
        this.offset = offset;
        return this;
    }

    public PaymentPagedQueryResponseBuilder results(final com.commercetools.api.models.payment.Payment... results) {
        this.results = new ArrayList<>(Arrays.asList(results));
        return this;
    }

    public PaymentPagedQueryResponseBuilder results(
            final java.util.List<com.commercetools.api.models.payment.Payment> results) {
        this.results = results;
        return this;
    }

    public PaymentPagedQueryResponseBuilder plusResults(final com.commercetools.api.models.payment.Payment... results) {
        if (this.results == null) {
            this.results = new ArrayList<>();
        }
        this.results.addAll(Arrays.asList(results));
        return this;
    }

    public PaymentPagedQueryResponseBuilder plusResults(
            Function<com.commercetools.api.models.payment.PaymentBuilder, com.commercetools.api.models.payment.PaymentBuilder> builder) {
        if (this.results == null) {
            this.results = new ArrayList<>();
        }
        this.results.add(builder.apply(com.commercetools.api.models.payment.PaymentBuilder.of()).build());
        return this;
    }

    public PaymentPagedQueryResponseBuilder withResults(
            Function<com.commercetools.api.models.payment.PaymentBuilder, com.commercetools.api.models.payment.PaymentBuilder> builder) {
        this.results = new ArrayList<>();
        this.results.add(builder.apply(com.commercetools.api.models.payment.PaymentBuilder.of()).build());
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

    public java.util.List<com.commercetools.api.models.payment.Payment> getResults() {
        return this.results;
    }

    public PaymentPagedQueryResponse build() {
        Objects.requireNonNull(limit, PaymentPagedQueryResponse.class + ": limit is missing");
        Objects.requireNonNull(count, PaymentPagedQueryResponse.class + ": count is missing");
        Objects.requireNonNull(offset, PaymentPagedQueryResponse.class + ": offset is missing");
        Objects.requireNonNull(results, PaymentPagedQueryResponse.class + ": results is missing");
        return new PaymentPagedQueryResponseImpl(limit, count, total, offset, results);
    }

    /**
     * builds PaymentPagedQueryResponse without checking for non null required values
     */
    public PaymentPagedQueryResponse buildUnchecked() {
        return new PaymentPagedQueryResponseImpl(limit, count, total, offset, results);
    }

    public static PaymentPagedQueryResponseBuilder of() {
        return new PaymentPagedQueryResponseBuilder();
    }

    public static PaymentPagedQueryResponseBuilder of(final PaymentPagedQueryResponse template) {
        PaymentPagedQueryResponseBuilder builder = new PaymentPagedQueryResponseBuilder();
        builder.limit = template.getLimit();
        builder.count = template.getCount();
        builder.total = template.getTotal();
        builder.offset = template.getOffset();
        builder.results = template.getResults();
        return builder;
    }

}
