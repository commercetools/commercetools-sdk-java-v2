
package com.commercetools.api.models.zone;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class ZonePagedQueryResponseBuilder implements Builder<ZonePagedQueryResponse> {

    private Long limit;

    private Long count;

    @Nullable
    private Long total;

    private Long offset;

    private java.util.List<com.commercetools.api.models.zone.Zone> results;

    public ZonePagedQueryResponseBuilder limit(final Long limit) {
        this.limit = limit;
        return this;
    }

    public ZonePagedQueryResponseBuilder count(final Long count) {
        this.count = count;
        return this;
    }

    public ZonePagedQueryResponseBuilder total(@Nullable final Long total) {
        this.total = total;
        return this;
    }

    public ZonePagedQueryResponseBuilder offset(final Long offset) {
        this.offset = offset;
        return this;
    }

    public ZonePagedQueryResponseBuilder results(final com.commercetools.api.models.zone.Zone... results) {
        this.results = new ArrayList<>(Arrays.asList(results));
        return this;
    }

    public ZonePagedQueryResponseBuilder withResults(
            Function<com.commercetools.api.models.zone.ZoneBuilder, com.commercetools.api.models.zone.ZoneBuilder> builder) {
        this.results = new ArrayList<>();
        this.results.add(builder.apply(com.commercetools.api.models.zone.ZoneBuilder.of()).build());
        return this;
    }

    public ZonePagedQueryResponseBuilder plusResults(
            Function<com.commercetools.api.models.zone.ZoneBuilder, com.commercetools.api.models.zone.ZoneBuilder> builder) {
        if (this.results == null) {
            this.results = new ArrayList<>();
        }
        this.results.add(builder.apply(com.commercetools.api.models.zone.ZoneBuilder.of()).build());
        return this;
    }

    public ZonePagedQueryResponseBuilder results(final java.util.List<com.commercetools.api.models.zone.Zone> results) {
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

    public java.util.List<com.commercetools.api.models.zone.Zone> getResults() {
        return this.results;
    }

    public ZonePagedQueryResponse build() {
        Objects.requireNonNull(limit, ZonePagedQueryResponse.class + ": limit is missing");
        Objects.requireNonNull(count, ZonePagedQueryResponse.class + ": count is missing");
        Objects.requireNonNull(offset, ZonePagedQueryResponse.class + ": offset is missing");
        Objects.requireNonNull(results, ZonePagedQueryResponse.class + ": results is missing");
        return new ZonePagedQueryResponseImpl(limit, count, total, offset, results);
    }

    /**
     * builds ZonePagedQueryResponse without checking for non null required values
     */
    public ZonePagedQueryResponse buildUnchecked() {
        return new ZonePagedQueryResponseImpl(limit, count, total, offset, results);
    }

    public static ZonePagedQueryResponseBuilder of() {
        return new ZonePagedQueryResponseBuilder();
    }

    public static ZonePagedQueryResponseBuilder of(final ZonePagedQueryResponse template) {
        ZonePagedQueryResponseBuilder builder = new ZonePagedQueryResponseBuilder();
        builder.limit = template.getLimit();
        builder.count = template.getCount();
        builder.total = template.getTotal();
        builder.offset = template.getOffset();
        builder.results = template.getResults();
        return builder;
    }

}
