
package com.commercetools.api.models.product_selection;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * AssignedProductSelectionPagedQueryResponseBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     AssignedProductSelectionPagedQueryResponse assignedProductSelectionPagedQueryResponse = AssignedProductSelectionPagedQueryResponse.builder()
 *             .limit(0.3)
 *             .offset(0.3)
 *             .count(0.3)
 *             .plusResults(resultsBuilder -> resultsBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class AssignedProductSelectionPagedQueryResponseBuilder
        implements Builder<AssignedProductSelectionPagedQueryResponse> {

    private Long limit;

    private Long offset;

    private Long count;

    @Nullable
    private Long total;

    private java.util.List<com.commercetools.api.models.product_selection.AssignedProductSelection> results;

    /**
     *  <p>Number of results requested.</p>
     * @param limit value to be set
     * @return Builder
     */

    public AssignedProductSelectionPagedQueryResponseBuilder limit(final Long limit) {
        this.limit = limit;
        return this;
    }

    /**
     *  <p>Number of elements skipped.</p>
     * @param offset value to be set
     * @return Builder
     */

    public AssignedProductSelectionPagedQueryResponseBuilder offset(final Long offset) {
        this.offset = offset;
        return this;
    }

    /**
     *  <p>Actual number of results returned.</p>
     * @param count value to be set
     * @return Builder
     */

    public AssignedProductSelectionPagedQueryResponseBuilder count(final Long count) {
        this.count = count;
        return this;
    }

    /**
     *  <p>Total number of results matching the query. This number is an estimation that is not strongly consistent. Unlike other endpoints, the Product Selection endpoint does not return this field by default. To get <code>total</code>, pass the query parameter <code>withTotal</code> set to <code>true</code>. When the results are filtered with a Query Predicate, <code>total</code> is subject to a limit.</p>
     * @param total value to be set
     * @return Builder
     */

    public AssignedProductSelectionPagedQueryResponseBuilder total(@Nullable final Long total) {
        this.total = total;
        return this;
    }

    /**
     *  <p>References to ProductSelection that are assigned to the Product.</p>
     * @param results value to be set
     * @return Builder
     */

    public AssignedProductSelectionPagedQueryResponseBuilder results(
            final com.commercetools.api.models.product_selection.AssignedProductSelection... results) {
        this.results = new ArrayList<>(Arrays.asList(results));
        return this;
    }

    /**
     *  <p>References to ProductSelection that are assigned to the Product.</p>
     * @param results value to be set
     * @return Builder
     */

    public AssignedProductSelectionPagedQueryResponseBuilder results(
            final java.util.List<com.commercetools.api.models.product_selection.AssignedProductSelection> results) {
        this.results = results;
        return this;
    }

    /**
     *  <p>References to ProductSelection that are assigned to the Product.</p>
     * @param results value to be set
     * @return Builder
     */

    public AssignedProductSelectionPagedQueryResponseBuilder plusResults(
            final com.commercetools.api.models.product_selection.AssignedProductSelection... results) {
        if (this.results == null) {
            this.results = new ArrayList<>();
        }
        this.results.addAll(Arrays.asList(results));
        return this;
    }

    /**
     *  <p>References to ProductSelection that are assigned to the Product.</p>
     * @param builder function to build the results value
     * @return Builder
     */

    public AssignedProductSelectionPagedQueryResponseBuilder plusResults(
            Function<com.commercetools.api.models.product_selection.AssignedProductSelectionBuilder, com.commercetools.api.models.product_selection.AssignedProductSelectionBuilder> builder) {
        if (this.results == null) {
            this.results = new ArrayList<>();
        }
        this.results.add(
            builder.apply(com.commercetools.api.models.product_selection.AssignedProductSelectionBuilder.of()).build());
        return this;
    }

    /**
     *  <p>References to ProductSelection that are assigned to the Product.</p>
     * @param builder function to build the results value
     * @return Builder
     */

    public AssignedProductSelectionPagedQueryResponseBuilder withResults(
            Function<com.commercetools.api.models.product_selection.AssignedProductSelectionBuilder, com.commercetools.api.models.product_selection.AssignedProductSelectionBuilder> builder) {
        this.results = new ArrayList<>();
        this.results.add(
            builder.apply(com.commercetools.api.models.product_selection.AssignedProductSelectionBuilder.of()).build());
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

    /**
     * builds AssignedProductSelectionPagedQueryResponse with checking for non-null required values
     * @return AssignedProductSelectionPagedQueryResponse
     */
    public AssignedProductSelectionPagedQueryResponse build() {
        Objects.requireNonNull(limit, AssignedProductSelectionPagedQueryResponse.class + ": limit is missing");
        Objects.requireNonNull(offset, AssignedProductSelectionPagedQueryResponse.class + ": offset is missing");
        Objects.requireNonNull(count, AssignedProductSelectionPagedQueryResponse.class + ": count is missing");
        Objects.requireNonNull(results, AssignedProductSelectionPagedQueryResponse.class + ": results is missing");
        return new AssignedProductSelectionPagedQueryResponseImpl(limit, offset, count, total, results);
    }

    /**
     * builds AssignedProductSelectionPagedQueryResponse without checking for non-null required values
     * @return AssignedProductSelectionPagedQueryResponse
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
