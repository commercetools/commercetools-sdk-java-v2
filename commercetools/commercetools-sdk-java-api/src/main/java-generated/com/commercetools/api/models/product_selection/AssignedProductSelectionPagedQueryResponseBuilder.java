
package com.commercetools.api.models.product_selection;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class AssignedProductSelectionPagedQueryResponseBuilder
        implements Builder<AssignedProductSelectionPagedQueryResponse> {

    private Long limit;

    private Long offset;

    private Long count;

    @Nullable
    private Long total;

    private java.util.List<com.commercetools.api.models.product_selection.AssignedProductSelection> results;

    public AssignedProductSelectionPagedQueryResponseBuilder limit(final Long limit) {
        this.limit = limit;
        return this;
    }

    public AssignedProductSelectionPagedQueryResponseBuilder offset(final Long offset) {
        this.offset = offset;
        return this;
    }

    public AssignedProductSelectionPagedQueryResponseBuilder count(final Long count) {
        this.count = count;
        return this;
    }

    public AssignedProductSelectionPagedQueryResponseBuilder total(@Nullable final Long total) {
        this.total = total;
        return this;
    }

    public AssignedProductSelectionPagedQueryResponseBuilder results(
            final com.commercetools.api.models.product_selection.AssignedProductSelection... results) {
        this.results = new ArrayList<>(Arrays.asList(results));
        return this;
    }

    public AssignedProductSelectionPagedQueryResponseBuilder withResults(
            Function<com.commercetools.api.models.product_selection.AssignedProductSelectionBuilder, com.commercetools.api.models.product_selection.AssignedProductSelectionBuilder> builder) {
        this.results = new ArrayList<>();
        this.results.add(
            builder.apply(com.commercetools.api.models.product_selection.AssignedProductSelectionBuilder.of()).build());
        return this;
    }

    public AssignedProductSelectionPagedQueryResponseBuilder plusResults(
            Function<com.commercetools.api.models.product_selection.AssignedProductSelectionBuilder, com.commercetools.api.models.product_selection.AssignedProductSelectionBuilder> builder) {
        if (this.results == null) {
            this.results = new ArrayList<>();
        }
        this.results.add(
            builder.apply(com.commercetools.api.models.product_selection.AssignedProductSelectionBuilder.of()).build());
        return this;
    }

    public AssignedProductSelectionPagedQueryResponseBuilder results(
            final java.util.List<com.commercetools.api.models.product_selection.AssignedProductSelection> results) {
        this.results = results;
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

    public java.util.List<com.commercetools.api.models.product_selection.AssignedProductSelection> getResults() {
        return this.results;
    }

    public AssignedProductSelectionPagedQueryResponse build() {
        Objects.requireNonNull(limit, AssignedProductSelectionPagedQueryResponse.class + ": limit is missing");
        Objects.requireNonNull(offset, AssignedProductSelectionPagedQueryResponse.class + ": offset is missing");
        Objects.requireNonNull(count, AssignedProductSelectionPagedQueryResponse.class + ": count is missing");
        Objects.requireNonNull(results, AssignedProductSelectionPagedQueryResponse.class + ": results is missing");
        return new AssignedProductSelectionPagedQueryResponseImpl(limit, offset, count, total, results);
    }

    /**
     * builds AssignedProductSelectionPagedQueryResponse without checking for non null required values
     */
    public AssignedProductSelectionPagedQueryResponse buildUnchecked() {
        return new AssignedProductSelectionPagedQueryResponseImpl(limit, offset, count, total, results);
    }

    public static AssignedProductSelectionPagedQueryResponseBuilder of() {
        return new AssignedProductSelectionPagedQueryResponseBuilder();
    }

    public static AssignedProductSelectionPagedQueryResponseBuilder of(
            final AssignedProductSelectionPagedQueryResponse template) {
        AssignedProductSelectionPagedQueryResponseBuilder builder = new AssignedProductSelectionPagedQueryResponseBuilder();
        builder.limit = template.getLimit();
        builder.offset = template.getOffset();
        builder.count = template.getCount();
        builder.total = template.getTotal();
        builder.results = template.getResults();
        return builder;
    }

}
