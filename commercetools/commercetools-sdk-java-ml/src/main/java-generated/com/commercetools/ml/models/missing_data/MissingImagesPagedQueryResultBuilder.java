
package com.commercetools.ml.models.missing_data;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class MissingImagesPagedQueryResultBuilder implements Builder<MissingImagesPagedQueryResult> {

    private Long count;

    private Long total;

    private Long offset;

    private java.util.List<com.commercetools.ml.models.missing_data.MissingImages> results;

    private com.commercetools.ml.models.missing_data.MissingImagesMeta meta;

    public MissingImagesPagedQueryResultBuilder count(final Long count) {
        this.count = count;
        return this;
    }

    public MissingImagesPagedQueryResultBuilder total(final Long total) {
        this.total = total;
        return this;
    }

    public MissingImagesPagedQueryResultBuilder offset(final Long offset) {
        this.offset = offset;
        return this;
    }

    public MissingImagesPagedQueryResultBuilder results(
            final com.commercetools.ml.models.missing_data.MissingImages... results) {
        this.results = new ArrayList<>(Arrays.asList(results));
        return this;
    }

    public MissingImagesPagedQueryResultBuilder results(
            final java.util.List<com.commercetools.ml.models.missing_data.MissingImages> results) {
        this.results = results;
        return this;
    }

    public MissingImagesPagedQueryResultBuilder meta(
            final com.commercetools.ml.models.missing_data.MissingImagesMeta meta) {
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

    public java.util.List<com.commercetools.ml.models.missing_data.MissingImages> getResults() {
        return this.results;
    }

    public com.commercetools.ml.models.missing_data.MissingImagesMeta getMeta() {
        return this.meta;
    }

    public MissingImagesPagedQueryResult build() {
        Objects.requireNonNull(count);
        Objects.requireNonNull(total);
        Objects.requireNonNull(offset);
        Objects.requireNonNull(results);
        Objects.requireNonNull(meta);
        return new MissingImagesPagedQueryResultImpl(count, total, offset, results, meta);
    }

    /**
     * builds MissingImagesPagedQueryResult without checking for non null required values
     */
    public MissingImagesPagedQueryResult buildUnchecked() {
        return new MissingImagesPagedQueryResultImpl(count, total, offset, results, meta);
    }

    public static MissingImagesPagedQueryResultBuilder of() {
        return new MissingImagesPagedQueryResultBuilder();
    }

    public static MissingImagesPagedQueryResultBuilder of(final MissingImagesPagedQueryResult template) {
        MissingImagesPagedQueryResultBuilder builder = new MissingImagesPagedQueryResultBuilder();
        builder.count = template.getCount();
        builder.total = template.getTotal();
        builder.offset = template.getOffset();
        builder.results = template.getResults();
        builder.meta = template.getMeta();
        return builder;
    }

}
