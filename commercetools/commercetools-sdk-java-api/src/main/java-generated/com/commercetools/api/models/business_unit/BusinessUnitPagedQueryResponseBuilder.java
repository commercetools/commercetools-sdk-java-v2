
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
     * @param limit value to be set
     * @return Builder
     */

    public BusinessUnitPagedQueryResponseBuilder limit(final Long limit) {
        this.limit = limit;
        return this;
    }

    /**
     *  <p>Number of elements skipped.</p>
     * @param offset value to be set
     * @return Builder
     */

    public BusinessUnitPagedQueryResponseBuilder offset(final Long offset) {
        this.offset = offset;
        return this;
    }

    /**
     *  <p>Actual number of results returned.</p>
     * @param count value to be set
     * @return Builder
     */

    public BusinessUnitPagedQueryResponseBuilder count(final Long count) {
        this.count = count;
        return this;
    }

    /**
     *  <p>Total number of results matching the query. This number is an estimation that is not strongly consistent. This field is returned by default. For improved performance, calculating this field can be deactivated by using the query parameter <code>withTotal=false</code>. When the results are filtered with a Query Predicate, <code>total</code> is subject to a limit.</p>
     * @param total value to be set
     * @return Builder
     */

    public BusinessUnitPagedQueryResponseBuilder total(@Nullable final Long total) {
        this.total = total;
        return this;
    }

    /**
     *  <p>BusinessUnits matching the query.</p>
     * @param results value to be set
     * @return Builder
     */

    public BusinessUnitPagedQueryResponseBuilder results(
            final com.commercetools.api.models.business_unit.BusinessUnit... results) {
        this.results = new ArrayList<>(Arrays.asList(results));
        return this;
    }

    /**
     *  <p>BusinessUnits matching the query.</p>
     * @param results value to be set
     * @return Builder
     */

    public BusinessUnitPagedQueryResponseBuilder results(
            final java.util.List<com.commercetools.api.models.business_unit.BusinessUnit> results) {
        this.results = results;
        return this;
    }

    /**
     *  <p>BusinessUnits matching the query.</p>
     * @param results value to be set
     * @return Builder
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
     * @param builder function to build the results value
     * @return Builder
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
     * @param builder function to build the results value
     * @return Builder
     */

    public BusinessUnitPagedQueryResponseBuilder withResults(
            Function<com.commercetools.api.models.business_unit.BusinessUnitBuilder, Builder<? extends com.commercetools.api.models.business_unit.BusinessUnit>> builder) {
        this.results = new ArrayList<>();
        this.results.add(builder.apply(com.commercetools.api.models.business_unit.BusinessUnitBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Number of requested results.</p>
     * @return limit
     */

    public Long getLimit() {
        return this.limit;
    }

    /**
     *  <p>Number of elements skipped.</p>
     * @return offset
     */

    public Long getOffset() {
        return this.offset;
    }

    /**
     *  <p>Actual number of results returned.</p>
     * @return count
     */

    public Long getCount() {
        return this.count;
    }

    /**
     *  <p>Total number of results matching the query. This number is an estimation that is not strongly consistent. This field is returned by default. For improved performance, calculating this field can be deactivated by using the query parameter <code>withTotal=false</code>. When the results are filtered with a Query Predicate, <code>total</code> is subject to a limit.</p>
     * @return total
     */

    @Nullable
    public Long getTotal() {
        return this.total;
    }

    /**
     *  <p>BusinessUnits matching the query.</p>
     * @return results
     */

    public java.util.List<com.commercetools.api.models.business_unit.BusinessUnit> getResults() {
        return this.results;
    }

    /**
     * builds BusinessUnitPagedQueryResponse with checking for non-null required values
     * @return BusinessUnitPagedQueryResponse
     */
    public BusinessUnitPagedQueryResponse build() {
        Objects.requireNonNull(limit, BusinessUnitPagedQueryResponse.class + ": limit is missing");
        Objects.requireNonNull(offset, BusinessUnitPagedQueryResponse.class + ": offset is missing");
        Objects.requireNonNull(count, BusinessUnitPagedQueryResponse.class + ": count is missing");
        Objects.requireNonNull(results, BusinessUnitPagedQueryResponse.class + ": results is missing");
        return new BusinessUnitPagedQueryResponseImpl(limit, offset, count, total, results);
    }

    /**
     * builds BusinessUnitPagedQueryResponse without checking for non-null required values
     * @return BusinessUnitPagedQueryResponse
     */
    public BusinessUnitPagedQueryResponse buildUnchecked() {
        return new BusinessUnitPagedQueryResponseImpl(limit, offset, count, total, results);
    }

    /**
     * factory method for an instance of BusinessUnitPagedQueryResponseBuilder
     * @return builder
     */
    public static BusinessUnitPagedQueryResponseBuilder of() {
        return new BusinessUnitPagedQueryResponseBuilder();
    }

    /**
     * create builder for BusinessUnitPagedQueryResponse instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
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
