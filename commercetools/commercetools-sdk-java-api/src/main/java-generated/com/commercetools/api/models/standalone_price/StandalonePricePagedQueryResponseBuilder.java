
package com.commercetools.api.models.standalone_price;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class StandalonePricePagedQueryResponseBuilder implements Builder<StandalonePricePagedQueryResponse> {

    private Long limit;

    private Long offset;

    private Long count;

    @Nullable
    private Long total;

    private java.util.List<com.commercetools.api.models.standalone_price.StandalonePrice> results;

    public StandalonePricePagedQueryResponseBuilder limit(final Long limit) {
        this.limit = limit;
        return this;
    }

    public StandalonePricePagedQueryResponseBuilder offset(final Long offset) {
        this.offset = offset;
        return this;
    }

    public StandalonePricePagedQueryResponseBuilder count(final Long count) {
        this.count = count;
        return this;
    }

    public StandalonePricePagedQueryResponseBuilder total(@Nullable final Long total) {
        this.total = total;
        return this;
    }

    public StandalonePricePagedQueryResponseBuilder results(
            final com.commercetools.api.models.standalone_price.StandalonePrice... results) {
        this.results = new ArrayList<>(Arrays.asList(results));
        return this;
    }

    public StandalonePricePagedQueryResponseBuilder results(
            final java.util.List<com.commercetools.api.models.standalone_price.StandalonePrice> results) {
        this.results = results;
        return this;
    }

    public StandalonePricePagedQueryResponseBuilder plusResults(
            final com.commercetools.api.models.standalone_price.StandalonePrice... results) {
        if (this.results == null) {
            this.results = new ArrayList<>();
        }
        this.results.addAll(Arrays.asList(results));
        return this;
    }

    public StandalonePricePagedQueryResponseBuilder plusResults(
            Function<com.commercetools.api.models.standalone_price.StandalonePriceBuilder, com.commercetools.api.models.standalone_price.StandalonePriceBuilder> builder) {
        if (this.results == null) {
            this.results = new ArrayList<>();
        }
        this.results
                .add(builder.apply(com.commercetools.api.models.standalone_price.StandalonePriceBuilder.of()).build());
        return this;
    }

    public StandalonePricePagedQueryResponseBuilder withResults(
            Function<com.commercetools.api.models.standalone_price.StandalonePriceBuilder, com.commercetools.api.models.standalone_price.StandalonePriceBuilder> builder) {
        this.results = new ArrayList<>();
        this.results
                .add(builder.apply(com.commercetools.api.models.standalone_price.StandalonePriceBuilder.of()).build());
        return this;
    }

    public Long getLimit() {
        return this.limit;
    }

    public Long getOffset() {
        return this.offset;
    }

    public Long getCount() {
        return this.count;
    }

    @Nullable
    public Long getTotal() {
        return this.total;
    }

    public java.util.List<com.commercetools.api.models.standalone_price.StandalonePrice> getResults() {
        return this.results;
    }

    public StandalonePricePagedQueryResponse build() {
        Objects.requireNonNull(limit, StandalonePricePagedQueryResponse.class + ": limit is missing");
        Objects.requireNonNull(offset, StandalonePricePagedQueryResponse.class + ": offset is missing");
        Objects.requireNonNull(count, StandalonePricePagedQueryResponse.class + ": count is missing");
        Objects.requireNonNull(results, StandalonePricePagedQueryResponse.class + ": results is missing");
        return new StandalonePricePagedQueryResponseImpl(limit, offset, count, total, results);
    }

    /**
     * builds StandalonePricePagedQueryResponse without checking for non null required values
     */
    public StandalonePricePagedQueryResponse buildUnchecked() {
        return new StandalonePricePagedQueryResponseImpl(limit, offset, count, total, results);
    }

    public static StandalonePricePagedQueryResponseBuilder of() {
        return new StandalonePricePagedQueryResponseBuilder();
    }

    public static StandalonePricePagedQueryResponseBuilder of(final StandalonePricePagedQueryResponse template) {
        StandalonePricePagedQueryResponseBuilder builder = new StandalonePricePagedQueryResponseBuilder();
        builder.limit = template.getLimit();
        builder.offset = template.getOffset();
        builder.count = template.getCount();
        builder.total = template.getTotal();
        builder.results = template.getResults();
        return builder;
    }

}
