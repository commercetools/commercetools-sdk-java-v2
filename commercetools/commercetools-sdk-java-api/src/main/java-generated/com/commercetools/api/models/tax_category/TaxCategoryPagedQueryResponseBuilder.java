
package com.commercetools.api.models.tax_category;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class TaxCategoryPagedQueryResponseBuilder {

    private Long limit;

    private Long count;

    @Nullable
    private Long total;

    private Long offset;

    private java.util.List<com.commercetools.api.models.tax_category.TaxCategory> results;

    public TaxCategoryPagedQueryResponseBuilder limit(final Long limit) {
        this.limit = limit;
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

    public TaxCategoryPagedQueryResponseBuilder offset(final Long offset) {
        this.offset = offset;
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

    public java.util.List<com.commercetools.api.models.tax_category.TaxCategory> getResults() {
        return this.results;
    }

    public TaxCategoryPagedQueryResponse build() {
        return new TaxCategoryPagedQueryResponseImpl(limit, count, total, offset, results);
    }

    public static TaxCategoryPagedQueryResponseBuilder of() {
        return new TaxCategoryPagedQueryResponseBuilder();
    }

    public static TaxCategoryPagedQueryResponseBuilder of(final TaxCategoryPagedQueryResponse template) {
        TaxCategoryPagedQueryResponseBuilder builder = new TaxCategoryPagedQueryResponseBuilder();
        builder.limit = template.getLimit();
        builder.count = template.getCount();
        builder.total = template.getTotal();
        builder.offset = template.getOffset();
        builder.results = template.getResults();
        return builder;
    }

}
