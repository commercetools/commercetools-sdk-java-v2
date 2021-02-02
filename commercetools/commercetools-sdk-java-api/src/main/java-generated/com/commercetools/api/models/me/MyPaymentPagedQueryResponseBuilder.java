
package com.commercetools.api.models.me;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class MyPaymentPagedQueryResponseBuilder {

    private Long limit;

    private Long count;

    @Nullable
    private Long total;

    private Long offset;

    private java.util.List<com.commercetools.api.models.me.MyPayment> results;

    public MyPaymentPagedQueryResponseBuilder limit(final Long limit) {
        this.limit = limit;
        return this;
    }

    public MyPaymentPagedQueryResponseBuilder count(final Long count) {
        this.count = count;
        return this;
    }

    public MyPaymentPagedQueryResponseBuilder total(@Nullable final Long total) {
        this.total = total;
        return this;
    }

    public MyPaymentPagedQueryResponseBuilder offset(final Long offset) {
        this.offset = offset;
        return this;
    }

    public MyPaymentPagedQueryResponseBuilder results(final com.commercetools.api.models.me.MyPayment... results) {
        this.results = new ArrayList<>(Arrays.asList(results));
        return this;
    }

    public MyPaymentPagedQueryResponseBuilder results(
            final java.util.List<com.commercetools.api.models.me.MyPayment> results) {
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

    public java.util.List<com.commercetools.api.models.me.MyPayment> getResults() {
        return this.results;
    }

    public MyPaymentPagedQueryResponse build() {
        return new MyPaymentPagedQueryResponseImpl(limit, count, total, offset, results);
    }

    public static MyPaymentPagedQueryResponseBuilder of() {
        return new MyPaymentPagedQueryResponseBuilder();
    }

    public static MyPaymentPagedQueryResponseBuilder of(final MyPaymentPagedQueryResponse template) {
        MyPaymentPagedQueryResponseBuilder builder = new MyPaymentPagedQueryResponseBuilder();
        builder.limit = template.getLimit();
        builder.count = template.getCount();
        builder.total = template.getTotal();
        builder.offset = template.getOffset();
        builder.results = template.getResults();
        return builder;
    }

}
