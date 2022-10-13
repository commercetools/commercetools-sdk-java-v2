
package com.commercetools.api.models.business_unit;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * BusinessUnitPagedQueryResponseBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     BusinessUnitPagedQueryResponse businessUnitPagedQueryResponse = BusinessUnitPagedQueryResponse.builder()
 *             .limit(0.3)
 *             .offset(0.3)
 *             .count(0.3)
 *             .plusResults(resultsBuilder -> resultsBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class BusinessUnitPagedQueryResponseBuilder implements Builder<BusinessUnitPagedQueryResponse> {

    private Long limit;

    private Long offset;

    private Long count;

    @Nullable
    private Long total;

    private java.util.List<com.commercetools.api.models.business_unit.BusinessUnit> results;

    /**
     *  <p>Number of requested results.</p>
     */

    public BusinessUnitPagedQueryResponseBuilder limit(final Long limit) {
        this.limit = limit;
        return this;
    }

    /**
     *  <p>Number of elements skipped.</p>
     */

    public BusinessUnitPagedQueryResponseBuilder offset(final Long offset) {
        this.offset = offset;
        return this;
    }

    /**
     *  <p>Actual number of results returned.</p>
     */

    public BusinessUnitPagedQueryResponseBuilder count(final Long count) {
        this.count = count;
        return this;
    }

    /**
     *  <p>Total number of results matching the query. This number is an estimation that is not strongly consistent. This field is returned by default. For improved performance, calculating this field can be deactivated by using the query parameter <code>withTotal=false</code>. When the results are filtered with a Query Predicate, <code>total</code> is subject to a limit.</p>
     */

    public BusinessUnitPagedQueryResponseBuilder total(@Nullable final Long total) {
        this.total = total;
        return this;
    }

    /**
     *  <p>BusinessUnits matching the query.</p>
     */

    public BusinessUnitPagedQueryResponseBuilder results(
            final com.commercetools.api.models.business_unit.BusinessUnit... results) {
        this.results = new ArrayList<>(Arrays.asList(results));
        return this;
    }

    /**
     *  <p>BusinessUnits matching the query.</p>
     */

    public BusinessUnitPagedQueryResponseBuilder results(
            final java.util.List<com.commercetools.api.models.business_unit.BusinessUnit> results) {
        this.results = results;
        return this;
    }

    /**
     *  <p>BusinessUnits matching the query.</p>
     */

    public BusinessUnitPagedQueryResponseBuilder plusResults(
            final com.commercetools.api.models.business_unit.BusinessUnit... results) {
        if (this.results == null) {
            this.results = new ArrayList<>();
        }
        this.results.addAll(Arrays.asList(results));
        return this;
    }

    /**
     *  <p>BusinessUnits matching the query.</p>
     */

    public BusinessUnitPagedQueryResponseBuilder plusResults(
            Function<com.commercetools.api.models.business_unit.BusinessUnitBuilder, Builder<? extends com.commercetools.api.models.business_unit.BusinessUnit>> builder) {
        if (this.results == null) {
            this.results = new ArrayList<>();
        }
        this.results.add(builder.apply(com.commercetools.api.models.business_unit.BusinessUnitBuilder.of()).build());
        return this;
    }

    /**
     *  <p>BusinessUnits matching the query.</p>
     */

    public BusinessUnitPagedQueryResponseBuilder withResults(
            Function<com.commercetools.api.models.business_unit.BusinessUnitBuilder, Builder<? extends com.commercetools.api.models.business_unit.BusinessUnit>> builder) {
        this.results = new ArrayList<>();
        this.results.add(builder.apply(com.commercetools.api.models.business_unit.BusinessUnitBuilder.of()).build());
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

    public java.util.List<com.commercetools.api.models.business_unit.BusinessUnit> getResults() {
        return this.results;
    }

    public BusinessUnitPagedQueryResponse build() {
        Objects.requireNonNull(limit, BusinessUnitPagedQueryResponse.class + ": limit is missing");
        Objects.requireNonNull(offset, BusinessUnitPagedQueryResponse.class + ": offset is missing");
        Objects.requireNonNull(count, BusinessUnitPagedQueryResponse.class + ": count is missing");
        Objects.requireNonNull(results, BusinessUnitPagedQueryResponse.class + ": results is missing");
        return new BusinessUnitPagedQueryResponseImpl(limit, offset, count, total, results);
    }

    /**
     * builds BusinessUnitPagedQueryResponse without checking for non null required values
     */
    public BusinessUnitPagedQueryResponse buildUnchecked() {
        return new BusinessUnitPagedQueryResponseImpl(limit, offset, count, total, results);
    }

    public static BusinessUnitPagedQueryResponseBuilder of() {
        return new BusinessUnitPagedQueryResponseBuilder();
    }

    public static BusinessUnitPagedQueryResponseBuilder of(final BusinessUnitPagedQueryResponse template) {
        BusinessUnitPagedQueryResponseBuilder builder = new BusinessUnitPagedQueryResponseBuilder();
        builder.limit = template.getLimit();
        builder.offset = template.getOffset();
        builder.count = template.getCount();
        builder.total = template.getTotal();
        builder.results = template.getResults();
        return builder;
    }

}
