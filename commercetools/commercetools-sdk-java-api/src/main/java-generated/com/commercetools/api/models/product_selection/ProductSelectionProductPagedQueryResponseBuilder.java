
package com.commercetools.api.models.product_selection;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class ProductSelectionProductPagedQueryResponseBuilder
        implements Builder<ProductSelectionProductPagedQueryResponse> {

    private Long limit;

    private Long offset;

    private Long count;

    @Nullable
    private Long total;

    private java.util.List<com.commercetools.api.models.product_selection.AssignedProductReference> results;

    public ProductSelectionProductPagedQueryResponseBuilder limit(final Long limit) {
        this.limit = limit;
        return this;
    }

    public ProductSelectionProductPagedQueryResponseBuilder offset(final Long offset) {
        this.offset = offset;
        return this;
    }

    public ProductSelectionProductPagedQueryResponseBuilder count(final Long count) {
        this.count = count;
        return this;
    }

    public ProductSelectionProductPagedQueryResponseBuilder total(@Nullable final Long total) {
        this.total = total;
        return this;
    }

    public ProductSelectionProductPagedQueryResponseBuilder results(
            final com.commercetools.api.models.product_selection.AssignedProductReference... results) {
        this.results = new ArrayList<>(Arrays.asList(results));
        return this;
    }

    public ProductSelectionProductPagedQueryResponseBuilder results(
            final java.util.List<com.commercetools.api.models.product_selection.AssignedProductReference> results) {
        this.results = results;
        return this;
    }

    public ProductSelectionProductPagedQueryResponseBuilder plusResults(
            final com.commercetools.api.models.product_selection.AssignedProductReference... results) {
        if (this.results == null) {
            this.results = new ArrayList<>();
        }
        this.results.addAll(Arrays.asList(results));
        return this;
    }

    public ProductSelectionProductPagedQueryResponseBuilder plusResults(
            Function<com.commercetools.api.models.product_selection.AssignedProductReferenceBuilder, com.commercetools.api.models.product_selection.AssignedProductReferenceBuilder> builder) {
        if (this.results == null) {
            this.results = new ArrayList<>();
        }
        this.results.add(
            builder.apply(com.commercetools.api.models.product_selection.AssignedProductReferenceBuilder.of()).build());
        return this;
    }

    public ProductSelectionProductPagedQueryResponseBuilder withResults(
            Function<com.commercetools.api.models.product_selection.AssignedProductReferenceBuilder, com.commercetools.api.models.product_selection.AssignedProductReferenceBuilder> builder) {
        this.results = new ArrayList<>();
        this.results.add(
            builder.apply(com.commercetools.api.models.product_selection.AssignedProductReferenceBuilder.of()).build());
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

    public java.util.List<com.commercetools.api.models.product_selection.AssignedProductReference> getResults() {
        return this.results;
    }

    public ProductSelectionProductPagedQueryResponse build() {
        Objects.requireNonNull(limit, ProductSelectionProductPagedQueryResponse.class + ": limit is missing");
        Objects.requireNonNull(offset, ProductSelectionProductPagedQueryResponse.class + ": offset is missing");
        Objects.requireNonNull(count, ProductSelectionProductPagedQueryResponse.class + ": count is missing");
        Objects.requireNonNull(results, ProductSelectionProductPagedQueryResponse.class + ": results is missing");
        return new ProductSelectionProductPagedQueryResponseImpl(limit, offset, count, total, results);
    }

    /**
     * builds ProductSelectionProductPagedQueryResponse without checking for non null required values
     */
    public ProductSelectionProductPagedQueryResponse buildUnchecked() {
        return new ProductSelectionProductPagedQueryResponseImpl(limit, offset, count, total, results);
    }

    public static ProductSelectionProductPagedQueryResponseBuilder of() {
        return new ProductSelectionProductPagedQueryResponseBuilder();
    }

    public static ProductSelectionProductPagedQueryResponseBuilder of(
            final ProductSelectionProductPagedQueryResponse template) {
        ProductSelectionProductPagedQueryResponseBuilder builder = new ProductSelectionProductPagedQueryResponseBuilder();
        builder.limit = template.getLimit();
        builder.offset = template.getOffset();
        builder.count = template.getCount();
        builder.total = template.getTotal();
        builder.results = template.getResults();
        return builder;
    }

}
