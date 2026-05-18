
package com.commercetools.checkout.models.application;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * PaginatedApplicationBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     PaginatedApplication paginatedApplication = PaginatedApplication.builder()
 *             .limit(1)
 *             .offset(1)
 *             .count(1)
 *             .total(1)
 *             .plusResults(resultsBuilder -> resultsBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class PaginatedApplicationBuilder implements Builder<PaginatedApplication> {

    private Integer limit;

    private Integer offset;

    private Integer count;

    private Integer total;

    private java.util.List<com.commercetools.checkout.models.application.Application> results;

    /**
     *  <p>Number of results requested.</p>
     * @param limit value to be set
     * @return Builder
     */

    public PaginatedApplicationBuilder limit(final Integer limit) {
        this.limit = limit;
        return this;
    }

    /**
     *  <p>Number of elements skipped.</p>
     * @param offset value to be set
     * @return Builder
     */

    public PaginatedApplicationBuilder offset(final Integer offset) {
        this.offset = offset;
        return this;
    }

    /**
     *  <p>Actual number of results returned.</p>
     * @param count value to be set
     * @return Builder
     */

    public PaginatedApplicationBuilder count(final Integer count) {
        this.count = count;
        return this;
    }

    /**
     *  <p>Total number of results matching the query.</p>
     * @param total value to be set
     * @return Builder
     */

    public PaginatedApplicationBuilder total(final Integer total) {
        this.total = total;
        return this;
    }

    /**
     *  <p>Applications matching the query.</p>
     * @param results value to be set
     * @return Builder
     */

    public PaginatedApplicationBuilder results(
            final com.commercetools.checkout.models.application.Application... results) {
        this.results = new ArrayList<>(Arrays.asList(results));
        return this;
    }

    /**
     *  <p>Applications matching the query.</p>
     * @param results value to be set
     * @return Builder
     */

    public PaginatedApplicationBuilder results(
            final java.util.List<com.commercetools.checkout.models.application.Application> results) {
        this.results = results;
        return this;
    }

    /**
     *  <p>Applications matching the query.</p>
     * @param results value to be set
     * @return Builder
     */

    public PaginatedApplicationBuilder plusResults(
            final com.commercetools.checkout.models.application.Application... results) {
        if (this.results == null) {
            this.results = new ArrayList<>();
        }
        this.results.addAll(Arrays.asList(results));
        return this;
    }

    /**
     *  <p>Applications matching the query.</p>
     * @param builder function to build the results value
     * @return Builder
     */

    public PaginatedApplicationBuilder plusResults(
            Function<com.commercetools.checkout.models.application.ApplicationBuilder, com.commercetools.checkout.models.application.ApplicationBuilder> builder) {
        if (this.results == null) {
            this.results = new ArrayList<>();
        }
        this.results.add(builder.apply(com.commercetools.checkout.models.application.ApplicationBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Applications matching the query.</p>
     * @param builder function to build the results value
     * @return Builder
     */

    public PaginatedApplicationBuilder withResults(
            Function<com.commercetools.checkout.models.application.ApplicationBuilder, com.commercetools.checkout.models.application.ApplicationBuilder> builder) {
        this.results = new ArrayList<>();
        this.results.add(builder.apply(com.commercetools.checkout.models.application.ApplicationBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Applications matching the query.</p>
     * @param builder function to build the results value
     * @return Builder
     */

    public PaginatedApplicationBuilder addResults(
            Function<com.commercetools.checkout.models.application.ApplicationBuilder, com.commercetools.checkout.models.application.Application> builder) {
        return plusResults(builder.apply(com.commercetools.checkout.models.application.ApplicationBuilder.of()));
    }

    /**
     *  <p>Applications matching the query.</p>
     * @param builder function to build the results value
     * @return Builder
     */

    public PaginatedApplicationBuilder setResults(
            Function<com.commercetools.checkout.models.application.ApplicationBuilder, com.commercetools.checkout.models.application.Application> builder) {
        return results(builder.apply(com.commercetools.checkout.models.application.ApplicationBuilder.of()));
    }

    /**
     *  <p>Number of results requested.</p>
     * @return limit
     */

    public Integer getLimit() {
        return this.limit;
    }

    /**
     *  <p>Number of elements skipped.</p>
     * @return offset
     */

    public Integer getOffset() {
        return this.offset;
    }

    /**
     *  <p>Actual number of results returned.</p>
     * @return count
     */

    public Integer getCount() {
        return this.count;
    }

    /**
     *  <p>Total number of results matching the query.</p>
     * @return total
     */

    public Integer getTotal() {
        return this.total;
    }

    /**
     *  <p>Applications matching the query.</p>
     * @return results
     */

    public java.util.List<com.commercetools.checkout.models.application.Application> getResults() {
        return this.results;
    }

    /**
     * builds PaginatedApplication with checking for non-null required values
     * @return PaginatedApplication
     */
    public PaginatedApplication build() {
        Objects.requireNonNull(limit, PaginatedApplication.class + ": limit is missing");
        Objects.requireNonNull(offset, PaginatedApplication.class + ": offset is missing");
        Objects.requireNonNull(count, PaginatedApplication.class + ": count is missing");
        Objects.requireNonNull(total, PaginatedApplication.class + ": total is missing");
        Objects.requireNonNull(results, PaginatedApplication.class + ": results is missing");
        return new PaginatedApplicationImpl(limit, offset, count, total, results);
    }

    /**
     * builds PaginatedApplication without checking for non-null required values
     * @return PaginatedApplication
     */
    public PaginatedApplication buildUnchecked() {
        return new PaginatedApplicationImpl(limit, offset, count, total, results);
    }

    /**
     * factory method for an instance of PaginatedApplicationBuilder
     * @return builder
     */
    public static PaginatedApplicationBuilder of() {
        return new PaginatedApplicationBuilder();
    }

    /**
     * create builder for PaginatedApplication instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static PaginatedApplicationBuilder of(final PaginatedApplication template) {
        PaginatedApplicationBuilder builder = new PaginatedApplicationBuilder();
        builder.limit = template.getLimit();
        builder.offset = template.getOffset();
        builder.count = template.getCount();
        builder.total = template.getTotal();
        builder.results = template.getResults();
        return builder;
    }

}
