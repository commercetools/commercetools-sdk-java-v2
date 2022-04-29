
package com.commercetools.ml.models.similar_products;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class SimilarProductsPagedQueryResultBuilder implements Builder<SimilarProductsPagedQueryResult> {

    private Long count;

    private Long total;

    private Long offset;

    private java.util.List<com.commercetools.ml.models.similar_products.SimilarProductPair> results;

    private com.commercetools.ml.models.similar_products.SimilarProductSearchRequestMeta meta;

    public SimilarProductsPagedQueryResultBuilder count(final Long count) {
        this.count = count;
        return this;
    }

    public SimilarProductsPagedQueryResultBuilder total(final Long total) {
        this.total = total;
        return this;
    }

    public SimilarProductsPagedQueryResultBuilder offset(final Long offset) {
        this.offset = offset;
        return this;
    }

    public SimilarProductsPagedQueryResultBuilder results(
            final com.commercetools.ml.models.similar_products.SimilarProductPair... results) {
        this.results = new ArrayList<>(Arrays.asList(results));
        return this;
    }

    public SimilarProductsPagedQueryResultBuilder results(
            final java.util.List<com.commercetools.ml.models.similar_products.SimilarProductPair> results) {
        this.results = results;
        return this;
    }

    public SimilarProductsPagedQueryResultBuilder plusResults(
            final com.commercetools.ml.models.similar_products.SimilarProductPair... results) {
        if (this.results == null) {
            this.results = new ArrayList<>();
        }
        this.results.addAll(Arrays.asList(results));
        return this;
    }

    public SimilarProductsPagedQueryResultBuilder plusResults(
            Function<com.commercetools.ml.models.similar_products.SimilarProductPairBuilder, com.commercetools.ml.models.similar_products.SimilarProductPairBuilder> builder) {
        if (this.results == null) {
            this.results = new ArrayList<>();
        }
        this.results.add(
            builder.apply(com.commercetools.ml.models.similar_products.SimilarProductPairBuilder.of()).build());
        return this;
    }

    public SimilarProductsPagedQueryResultBuilder withResults(
            Function<com.commercetools.ml.models.similar_products.SimilarProductPairBuilder, com.commercetools.ml.models.similar_products.SimilarProductPairBuilder> builder) {
        this.results = new ArrayList<>();
        this.results.add(
            builder.apply(com.commercetools.ml.models.similar_products.SimilarProductPairBuilder.of()).build());
        return this;
    }

    public SimilarProductsPagedQueryResultBuilder meta(
            Function<com.commercetools.ml.models.similar_products.SimilarProductSearchRequestMetaBuilder, com.commercetools.ml.models.similar_products.SimilarProductSearchRequestMetaBuilder> builder) {
        this.meta = builder
                .apply(com.commercetools.ml.models.similar_products.SimilarProductSearchRequestMetaBuilder.of())
                .build();
        return this;
    }

    public SimilarProductsPagedQueryResultBuilder meta(
            final com.commercetools.ml.models.similar_products.SimilarProductSearchRequestMeta meta) {
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

    public java.util.List<com.commercetools.ml.models.similar_products.SimilarProductPair> getResults() {
        return this.results;
    }

    public com.commercetools.ml.models.similar_products.SimilarProductSearchRequestMeta getMeta() {
        return this.meta;
    }

    public SimilarProductsPagedQueryResult build() {
        Objects.requireNonNull(count, SimilarProductsPagedQueryResult.class + ": count is missing");
        Objects.requireNonNull(total, SimilarProductsPagedQueryResult.class + ": total is missing");
        Objects.requireNonNull(offset, SimilarProductsPagedQueryResult.class + ": offset is missing");
        Objects.requireNonNull(results, SimilarProductsPagedQueryResult.class + ": results is missing");
        Objects.requireNonNull(meta, SimilarProductsPagedQueryResult.class + ": meta is missing");
        return new SimilarProductsPagedQueryResultImpl(count, total, offset, results, meta);
    }

    /**
     * builds SimilarProductsPagedQueryResult without checking for non null required values
     */
    public SimilarProductsPagedQueryResult buildUnchecked() {
        return new SimilarProductsPagedQueryResultImpl(count, total, offset, results, meta);
    }

    public static SimilarProductsPagedQueryResultBuilder of() {
        return new SimilarProductsPagedQueryResultBuilder();
    }

    public static SimilarProductsPagedQueryResultBuilder of(final SimilarProductsPagedQueryResult template) {
        SimilarProductsPagedQueryResultBuilder builder = new SimilarProductsPagedQueryResultBuilder();
        builder.count = template.getCount();
        builder.total = template.getTotal();
        builder.offset = template.getOffset();
        builder.results = template.getResults();
        builder.meta = template.getMeta();
        return builder;
    }

}
