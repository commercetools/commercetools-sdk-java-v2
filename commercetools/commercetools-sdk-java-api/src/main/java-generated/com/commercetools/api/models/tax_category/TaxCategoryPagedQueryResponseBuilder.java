
package com.commercetools.api.models.tax_category;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class TaxCategoryPagedQueryResponseBuilder implements Builder<TaxCategoryPagedQueryResponse> {

    private Long limit;

    private Long offset;

    private Long count;

    @Nullable
    private Long total;

    private java.util.List<com.commercetools.api.models.tax_category.TaxCategory> results;

    public TaxCategoryPagedQueryResponseBuilder limit(final Long limit) {
        this.limit = limit;
        return this;
    }

    public TaxCategoryPagedQueryResponseBuilder offset(final Long offset) {
        this.offset = offset;
        return this;
    }

    public TaxCategoryPagedQueryResponseBuilder count(final Long count) {
        this.count = count;
        return this;
    }

    public TaxCategoryPagedQueryResponseBuilder total(@Nullable final Long total) {
        this.total = total;
        return this;
    }

    public TaxCategoryPagedQueryResponseBuilder results(
            final com.commercetools.api.models.tax_category.TaxCategory... results) {
        this.results = new ArrayList<>(Arrays.asList(results));
        return this;
    }

    public TaxCategoryPagedQueryResponseBuilder results(
            final java.util.List<com.commercetools.api.models.tax_category.TaxCategory> results) {
        this.results = results;
        return this;
    }

    public TaxCategoryPagedQueryResponseBuilder plusResults(
            final com.commercetools.api.models.tax_category.TaxCategory... results) {
        if (this.results == null) {
            this.results = new ArrayList<>();
        }
        this.results.addAll(Arrays.asList(results));
        return this;
    }

    public TaxCategoryPagedQueryResponseBuilder plusResults(
            Function<com.commercetools.api.models.tax_category.TaxCategoryBuilder, com.commercetools.api.models.tax_category.TaxCategoryBuilder> builder) {
        if (this.results == null) {
            this.results = new ArrayList<>();
        }
        this.results.add(builder.apply(com.commercetools.api.models.tax_category.TaxCategoryBuilder.of()).build());
        return this;
    }

    public TaxCategoryPagedQueryResponseBuilder withResults(
            Function<com.commercetools.api.models.tax_category.TaxCategoryBuilder, com.commercetools.api.models.tax_category.TaxCategoryBuilder> builder) {
        this.results = new ArrayList<>();
        this.results.add(builder.apply(com.commercetools.api.models.tax_category.TaxCategoryBuilder.of()).build());
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

    public java.util.List<com.commercetools.api.models.tax_category.TaxCategory> getResults() {
        return this.results;
    }

    public TaxCategoryPagedQueryResponse build() {
        Objects.requireNonNull(limit, TaxCategoryPagedQueryResponse.class + ": limit is missing");
        Objects.requireNonNull(offset, TaxCategoryPagedQueryResponse.class + ": offset is missing");
        Objects.requireNonNull(count, TaxCategoryPagedQueryResponse.class + ": count is missing");
        Objects.requireNonNull(results, TaxCategoryPagedQueryResponse.class + ": results is missing");
        return new TaxCategoryPagedQueryResponseImpl(limit, offset, count, total, results);
    }

    /**
     * builds TaxCategoryPagedQueryResponse without checking for non null required values
     */
    public TaxCategoryPagedQueryResponse buildUnchecked() {
        return new TaxCategoryPagedQueryResponseImpl(limit, offset, count, total, results);
    }

    public static TaxCategoryPagedQueryResponseBuilder of() {
        return new TaxCategoryPagedQueryResponseBuilder();
    }

    public static TaxCategoryPagedQueryResponseBuilder of(final TaxCategoryPagedQueryResponse template) {
        TaxCategoryPagedQueryResponseBuilder builder = new TaxCategoryPagedQueryResponseBuilder();
        builder.limit = template.getLimit();
        builder.offset = template.getOffset();
        builder.count = template.getCount();
        builder.total = template.getTotal();
        builder.results = template.getResults();
        return builder;
    }

}
