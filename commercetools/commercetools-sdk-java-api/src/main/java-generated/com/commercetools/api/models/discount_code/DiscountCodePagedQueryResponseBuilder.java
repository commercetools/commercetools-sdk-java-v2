
package com.commercetools.api.models.discount_code;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class DiscountCodePagedQueryResponseBuilder {

    private Long limit;

    private Long count;

    @Nullable
    private Long total;

    private Long offset;

    private java.util.List<com.commercetools.api.models.discount_code.DiscountCode> results;

    public DiscountCodePagedQueryResponseBuilder limit(final Long limit) {
        this.limit = limit;
        return this;
    }

    public DiscountCodePagedQueryResponseBuilder count(final Long count) {
        this.count = count;
        return this;
    }

    public DiscountCodePagedQueryResponseBuilder total(@Nullable final Long total) {
        this.total = total;
        return this;
    }

    public DiscountCodePagedQueryResponseBuilder offset(final Long offset) {
        this.offset = offset;
        return this;
    }

    public DiscountCodePagedQueryResponseBuilder results(
            final com.commercetools.api.models.discount_code.DiscountCode... results) {
        this.results = new ArrayList<>(Arrays.asList(results));
        return this;
    }

    public DiscountCodePagedQueryResponseBuilder results(
            final java.util.List<com.commercetools.api.models.discount_code.DiscountCode> results) {
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

    public java.util.List<com.commercetools.api.models.discount_code.DiscountCode> getResults() {
        return this.results;
    }

    public DiscountCodePagedQueryResponse build() {
        return new DiscountCodePagedQueryResponseImpl(limit, count, total, offset, results);
    }

    public static DiscountCodePagedQueryResponseBuilder of() {
        return new DiscountCodePagedQueryResponseBuilder();
    }

    public static DiscountCodePagedQueryResponseBuilder of(final DiscountCodePagedQueryResponse template) {
        DiscountCodePagedQueryResponseBuilder builder = new DiscountCodePagedQueryResponseBuilder();
        builder.limit = template.getLimit();
        builder.count = template.getCount();
        builder.total = template.getTotal();
        builder.offset = template.getOffset();
        builder.results = template.getResults();
        return builder;
    }

}
