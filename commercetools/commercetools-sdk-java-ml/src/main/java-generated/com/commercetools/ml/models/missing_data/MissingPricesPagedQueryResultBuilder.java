
package com.commercetools.ml.models.missing_data;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class MissingPricesPagedQueryResultBuilder implements Builder<MissingPricesPagedQueryResult> {

    private Long count;

    private Long total;

    private Long offset;

    private java.util.List<com.commercetools.ml.models.missing_data.MissingPrices> results;

    private com.commercetools.ml.models.missing_data.MissingPricesMeta meta;

    public MissingPricesPagedQueryResultBuilder count(final Long count) {
        this.count = count;
        return this;
    }

    public MissingPricesPagedQueryResultBuilder total(final Long total) {
        this.total = total;
        return this;
    }

    public MissingPricesPagedQueryResultBuilder offset(final Long offset) {
        this.offset = offset;
        return this;
    }

    public MissingPricesPagedQueryResultBuilder results(
            final com.commercetools.ml.models.missing_data.MissingPrices... results) {
        this.results = new ArrayList<>(Arrays.asList(results));
        return this;
    }

    public MissingPricesPagedQueryResultBuilder withResults(
            Function<com.commercetools.ml.models.missing_data.MissingPricesBuilder, com.commercetools.ml.models.missing_data.MissingPricesBuilder> builder) {
        this.results = new ArrayList<>();
        this.results.add(builder.apply(com.commercetools.ml.models.missing_data.MissingPricesBuilder.of()).build());
        return this;
    }

    public MissingPricesPagedQueryResultBuilder plusResults(
            Function<com.commercetools.ml.models.missing_data.MissingPricesBuilder, com.commercetools.ml.models.missing_data.MissingPricesBuilder> builder) {
        if (this.results == null) {
            this.results = new ArrayList<>();
        }
        this.results.add(builder.apply(com.commercetools.ml.models.missing_data.MissingPricesBuilder.of()).build());
        return this;
    }

    public MissingPricesPagedQueryResultBuilder results(
            final java.util.List<com.commercetools.ml.models.missing_data.MissingPrices> results) {
        this.results = results;
        return this;
    }

    public MissingPricesPagedQueryResultBuilder meta(
            Function<com.commercetools.ml.models.missing_data.MissingPricesMetaBuilder, com.commercetools.ml.models.missing_data.MissingPricesMetaBuilder> builder) {
        this.meta = builder.apply(com.commercetools.ml.models.missing_data.MissingPricesMetaBuilder.of()).build();
        return this;
    }

    public MissingPricesPagedQueryResultBuilder meta(
            final com.commercetools.ml.models.missing_data.MissingPricesMeta meta) {
        this.meta = meta;
        return this;
    }

    public Long getCount() {
        return this.count;
    }

    public Long getTotal() {
        return this.total;
    }

    public Long getOffset() {
        return this.offset;
    }

    public java.util.List<com.commercetools.ml.models.missing_data.MissingPrices> getResults() {
        return this.results;
    }

    public com.commercetools.ml.models.missing_data.MissingPricesMeta getMeta() {
        return this.meta;
    }

    public MissingPricesPagedQueryResult build() {
        Objects.requireNonNull(count, MissingPricesPagedQueryResult.class + ": count is missing");
        Objects.requireNonNull(total, MissingPricesPagedQueryResult.class + ": total is missing");
        Objects.requireNonNull(offset, MissingPricesPagedQueryResult.class + ": offset is missing");
        Objects.requireNonNull(results, MissingPricesPagedQueryResult.class + ": results is missing");
        Objects.requireNonNull(meta, MissingPricesPagedQueryResult.class + ": meta is missing");
        return new MissingPricesPagedQueryResultImpl(count, total, offset, results, meta);
    }

    /**
     * builds MissingPricesPagedQueryResult without checking for non null required values
     */
    public MissingPricesPagedQueryResult buildUnchecked() {
        return new MissingPricesPagedQueryResultImpl(count, total, offset, results, meta);
    }

    public static MissingPricesPagedQueryResultBuilder of() {
        return new MissingPricesPagedQueryResultBuilder();
    }

    public static MissingPricesPagedQueryResultBuilder of(final MissingPricesPagedQueryResult template) {
        MissingPricesPagedQueryResultBuilder builder = new MissingPricesPagedQueryResultBuilder();
        builder.count = template.getCount();
        builder.total = template.getTotal();
        builder.offset = template.getOffset();
        builder.results = template.getResults();
        builder.meta = template.getMeta();
        return builder;
    }

}
