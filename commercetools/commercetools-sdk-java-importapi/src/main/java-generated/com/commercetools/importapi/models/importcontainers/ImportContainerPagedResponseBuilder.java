
package com.commercetools.importapi.models.importcontainers;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ImportContainerPagedResponseBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ImportContainerPagedResponse importContainerPagedResponse = ImportContainerPagedResponse.builder()
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
public class ImportContainerPagedResponseBuilder implements Builder<ImportContainerPagedResponse> {

    private Integer limit;

    private Long offset;

    private Long count;

    private Long total;

    private java.util.List<com.commercetools.importapi.models.importcontainers.ImportContainer> results;

    /**
     *  <p>Number of results requested.</p>
     * @param limit value to be set
     * @return Builder
     */

    public ImportContainerPagedResponseBuilder limit(final Integer limit) {
        this.limit = limit;
        return this;
    }

    /**
     *  <p>Number of elements skipped.</p>
     * @param offset value to be set
     * @return Builder
     */

    public ImportContainerPagedResponseBuilder offset(final Long offset) {
        this.offset = offset;
        return this;
    }

    /**
     *  <p>Actual number of results returned.</p>
     * @param count value to be set
     * @return Builder
     */

    public ImportContainerPagedResponseBuilder count(final Long count) {
        this.count = count;
        return this;
    }

    /**
     *  <p>Total number of results matching the query.</p>
     * @param total value to be set
     * @return Builder
     */

    public ImportContainerPagedResponseBuilder total(final Long total) {
        this.total = total;
        return this;
    }

    /**
     *  <p>ImportContainers matching the query.</p>
     * @param results value to be set
     * @return Builder
     */

    public ImportContainerPagedResponseBuilder results(
            final com.commercetools.importapi.models.importcontainers.ImportContainer... results) {
        this.results = new ArrayList<>(Arrays.asList(results));
        return this;
    }

    /**
     *  <p>ImportContainers matching the query.</p>
     * @param results value to be set
     * @return Builder
     */

    public ImportContainerPagedResponseBuilder results(
            final java.util.List<com.commercetools.importapi.models.importcontainers.ImportContainer> results) {
        this.results = results;
        return this;
    }

    /**
     *  <p>ImportContainers matching the query.</p>
     * @param results value to be set
     * @return Builder
     */

    public ImportContainerPagedResponseBuilder plusResults(
            final com.commercetools.importapi.models.importcontainers.ImportContainer... results) {
        if (this.results == null) {
            this.results = new ArrayList<>();
        }
        this.results.addAll(Arrays.asList(results));
        return this;
    }

    /**
     *  <p>ImportContainers matching the query.</p>
     * @param builder function to build the results value
     * @return Builder
     */

    public ImportContainerPagedResponseBuilder plusResults(
            Function<com.commercetools.importapi.models.importcontainers.ImportContainerBuilder, com.commercetools.importapi.models.importcontainers.ImportContainerBuilder> builder) {
        if (this.results == null) {
            this.results = new ArrayList<>();
        }
        this.results.add(
            builder.apply(com.commercetools.importapi.models.importcontainers.ImportContainerBuilder.of()).build());
        return this;
    }

    /**
     *  <p>ImportContainers matching the query.</p>
     * @param builder function to build the results value
     * @return Builder
     */

    public ImportContainerPagedResponseBuilder withResults(
            Function<com.commercetools.importapi.models.importcontainers.ImportContainerBuilder, com.commercetools.importapi.models.importcontainers.ImportContainerBuilder> builder) {
        this.results = new ArrayList<>();
        this.results.add(
            builder.apply(com.commercetools.importapi.models.importcontainers.ImportContainerBuilder.of()).build());
        return this;
    }

    /**
     *  <p>ImportContainers matching the query.</p>
     * @param builder function to build the results value
     * @return Builder
     */

    public ImportContainerPagedResponseBuilder addResults(
            Function<com.commercetools.importapi.models.importcontainers.ImportContainerBuilder, com.commercetools.importapi.models.importcontainers.ImportContainer> builder) {
        return plusResults(
            builder.apply(com.commercetools.importapi.models.importcontainers.ImportContainerBuilder.of()));
    }

    /**
     *  <p>ImportContainers matching the query.</p>
     * @param builder function to build the results value
     * @return Builder
     */

    public ImportContainerPagedResponseBuilder setResults(
            Function<com.commercetools.importapi.models.importcontainers.ImportContainerBuilder, com.commercetools.importapi.models.importcontainers.ImportContainer> builder) {
        return results(builder.apply(com.commercetools.importapi.models.importcontainers.ImportContainerBuilder.of()));
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
     *  <p>Total number of results matching the query.</p>
     * @return total
     */

    public Long getTotal() {
        return this.total;
    }

    /**
     *  <p>ImportContainers matching the query.</p>
     * @return results
     */

    public java.util.List<com.commercetools.importapi.models.importcontainers.ImportContainer> getResults() {
        return this.results;
    }

    /**
     * builds ImportContainerPagedResponse with checking for non-null required values
     * @return ImportContainerPagedResponse
     */
    public ImportContainerPagedResponse build() {
        Objects.requireNonNull(limit, ImportContainerPagedResponse.class + ": limit is missing");
        Objects.requireNonNull(offset, ImportContainerPagedResponse.class + ": offset is missing");
        Objects.requireNonNull(count, ImportContainerPagedResponse.class + ": count is missing");
        Objects.requireNonNull(total, ImportContainerPagedResponse.class + ": total is missing");
        Objects.requireNonNull(results, ImportContainerPagedResponse.class + ": results is missing");
        return new ImportContainerPagedResponseImpl(limit, offset, count, total, results);
    }

    /**
     * builds ImportContainerPagedResponse without checking for non-null required values
     * @return ImportContainerPagedResponse
     */
    public ImportContainerPagedResponse buildUnchecked() {
        return new ImportContainerPagedResponseImpl(limit, offset, count, total, results);
    }

    /**
     * factory method for an instance of ImportContainerPagedResponseBuilder
     * @return builder
     */
    public static ImportContainerPagedResponseBuilder of() {
        return new ImportContainerPagedResponseBuilder();
    }

    /**
     * create builder for ImportContainerPagedResponse instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ImportContainerPagedResponseBuilder of(final ImportContainerPagedResponse template) {
        ImportContainerPagedResponseBuilder builder = new ImportContainerPagedResponseBuilder();
        builder.limit = template.getLimit();
        builder.offset = template.getOffset();
        builder.count = template.getCount();
        builder.total = template.getTotal();
        builder.results = template.getResults();
        return builder;
    }

}
