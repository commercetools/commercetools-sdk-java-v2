
package com.commercetools.api.models.tax_category;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 Example to create an instance using the builder pattern
 <div class=code-example>
 <pre><code class='java'>
   TaxCategoryPagedQueryResponse taxCategoryPagedQueryResponse = TaxCategoryPagedQueryResponse.builder()
           .limit(0.3)
           .offset(0.3)
           .count(0.3)
           .plusResults(resultsBuilder -> resultsBuilder)
           .build()
 </code></pre>
 </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class TaxCategoryPagedQueryResponseBuilder implements Builder<TaxCategoryPagedQueryResponse> {

    private Long limit;

    private Long offset;

    private Long count;

    @Nullable
    private Long total;

    private java.util.List<com.commercetools.api.models.tax_category.TaxCategory> results;

    /**
     *  <p>Number of results requested.</p>
     */

    public TaxCategoryPagedQueryResponseBuilder limit(final Long limit) {
        this.limit = limit;
        return this;
    }

    /**
     *  <p>Number of elements skipped.</p>
     */

    public TaxCategoryPagedQueryResponseBuilder offset(final Long offset) {
        this.offset = offset;
        return this;
    }

    /**
     *  <p>Actual number of results returned.</p>
     */

    public TaxCategoryPagedQueryResponseBuilder count(final Long count) {
        this.count = count;
        return this;
    }

    /**
     *  <p>Total number of results matching the query. This number is an estimation that is not strongly consistent. This field is returned by default. For improved performance, calculating this field can be deactivated by using the query parameter <code>withTotal=false</code>. When the results are filtered with a Query Predicate, <code>total</code> is subject to a limit.</p>
     */

    public TaxCategoryPagedQueryResponseBuilder total(@Nullable final Long total) {
        this.total = total;
        return this;
    }

    /**
     *  <p>TaxCategories matching the query.</p>
     */

    public TaxCategoryPagedQueryResponseBuilder results(
            final com.commercetools.api.models.tax_category.TaxCategory... results) {
        this.results = new ArrayList<>(Arrays.asList(results));
        return this;
    }

    /**
     *  <p>TaxCategories matching the query.</p>
     */

    public TaxCategoryPagedQueryResponseBuilder results(
            final java.util.List<com.commercetools.api.models.tax_category.TaxCategory> results) {
        this.results = results;
        return this;
    }

    /**
     *  <p>TaxCategories matching the query.</p>
     */

    public TaxCategoryPagedQueryResponseBuilder plusResults(
            final com.commercetools.api.models.tax_category.TaxCategory... results) {
        if (this.results == null) {
            this.results = new ArrayList<>();
        }
        this.results.addAll(Arrays.asList(results));
        return this;
    }

    /**
     *  <p>TaxCategories matching the query.</p>
     */

    public TaxCategoryPagedQueryResponseBuilder plusResults(
            Function<com.commercetools.api.models.tax_category.TaxCategoryBuilder, com.commercetools.api.models.tax_category.TaxCategoryBuilder> builder) {
        if (this.results == null) {
            this.results = new ArrayList<>();
        }
        this.results.add(builder.apply(com.commercetools.api.models.tax_category.TaxCategoryBuilder.of()).build());
        return this;
    }

    /**
     *  <p>TaxCategories matching the query.</p>
     */

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
