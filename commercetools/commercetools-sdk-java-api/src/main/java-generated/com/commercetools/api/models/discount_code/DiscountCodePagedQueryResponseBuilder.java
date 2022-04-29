
package com.commercetools.api.models.discount_code;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class DiscountCodePagedQueryResponseBuilder implements Builder<DiscountCodePagedQueryResponse> {

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

    public DiscountCodePagedQueryResponseBuilder plusResults(
            final com.commercetools.api.models.discount_code.DiscountCode... results) {
        if (this.results == null) {
            this.results = new ArrayList<>();
        }
        this.results.addAll(Arrays.asList(results));
        return this;
    }

    public DiscountCodePagedQueryResponseBuilder plusResults(
            Function<com.commercetools.api.models.discount_code.DiscountCodeBuilder, com.commercetools.api.models.discount_code.DiscountCodeBuilder> builder) {
        if (this.results == null) {
            this.results = new ArrayList<>();
        }
        this.results.add(builder.apply(com.commercetools.api.models.discount_code.DiscountCodeBuilder.of()).build());
        return this;
    }

    public DiscountCodePagedQueryResponseBuilder withResults(
            Function<com.commercetools.api.models.discount_code.DiscountCodeBuilder, com.commercetools.api.models.discount_code.DiscountCodeBuilder> builder) {
        this.results = new ArrayList<>();
        this.results.add(builder.apply(com.commercetools.api.models.discount_code.DiscountCodeBuilder.of()).build());
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
        Objects.requireNonNull(limit, DiscountCodePagedQueryResponse.class + ": limit is missing");
        Objects.requireNonNull(count, DiscountCodePagedQueryResponse.class + ": count is missing");
        Objects.requireNonNull(offset, DiscountCodePagedQueryResponse.class + ": offset is missing");
        Objects.requireNonNull(results, DiscountCodePagedQueryResponse.class + ": results is missing");
        return new DiscountCodePagedQueryResponseImpl(limit, count, total, offset, results);
    }

    /**
     * builds DiscountCodePagedQueryResponse without checking for non null required values
     */
    public DiscountCodePagedQueryResponse buildUnchecked() {
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
