
package com.commercetools.api.models.variant;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * VariantBulkUpdateResponseBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     VariantBulkUpdateResponse variantBulkUpdateResponse = VariantBulkUpdateResponse.builder()
 *             .successCount(0.3)
 *             .failureCount(0.3)
 *             .plusResults(resultsBuilder -> resultsBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class VariantBulkUpdateResponseBuilder implements Builder<VariantBulkUpdateResponse> {

    private Integer successCount;

    private Integer failureCount;

    private java.util.List<com.commercetools.api.models.variant.VariantBulkUpdateResult> results;

    /**
     *  <p>Number of Variants that were successfully updated.</p>
     * @param successCount value to be set
     * @return Builder
     */

    public VariantBulkUpdateResponseBuilder successCount(final Integer successCount) {
        this.successCount = successCount;
        return this;
    }

    /**
     *  <p>Number of Variants that failed to update.</p>
     * @param failureCount value to be set
     * @return Builder
     */

    public VariantBulkUpdateResponseBuilder failureCount(final Integer failureCount) {
        this.failureCount = failureCount;
        return this;
    }

    /**
     *  <p>Results for each Variant in the request, in the same order as the <code>items</code> in the request body.</p>
     * @param results value to be set
     * @return Builder
     */

    public VariantBulkUpdateResponseBuilder results(
            final com.commercetools.api.models.variant.VariantBulkUpdateResult... results) {
        this.results = new ArrayList<>(Arrays.asList(results));
        return this;
    }

    /**
     *  <p>Results for each Variant in the request, in the same order as the <code>items</code> in the request body.</p>
     * @param results value to be set
     * @return Builder
     */

    public VariantBulkUpdateResponseBuilder results(
            final java.util.List<com.commercetools.api.models.variant.VariantBulkUpdateResult> results) {
        this.results = results;
        return this;
    }

    /**
     *  <p>Results for each Variant in the request, in the same order as the <code>items</code> in the request body.</p>
     * @param results value to be set
     * @return Builder
     */

    public VariantBulkUpdateResponseBuilder plusResults(
            final com.commercetools.api.models.variant.VariantBulkUpdateResult... results) {
        if (this.results == null) {
            this.results = new ArrayList<>();
        }
        this.results.addAll(Arrays.asList(results));
        return this;
    }

    /**
     *  <p>Results for each Variant in the request, in the same order as the <code>items</code> in the request body.</p>
     * @param builder function to build the results value
     * @return Builder
     */

    public VariantBulkUpdateResponseBuilder plusResults(
            Function<com.commercetools.api.models.variant.VariantBulkUpdateResultBuilder, Builder<? extends com.commercetools.api.models.variant.VariantBulkUpdateResult>> builder) {
        if (this.results == null) {
            this.results = new ArrayList<>();
        }
        this.results
                .add(builder.apply(com.commercetools.api.models.variant.VariantBulkUpdateResultBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Results for each Variant in the request, in the same order as the <code>items</code> in the request body.</p>
     * @param builder function to build the results value
     * @return Builder
     */

    public VariantBulkUpdateResponseBuilder withResults(
            Function<com.commercetools.api.models.variant.VariantBulkUpdateResultBuilder, Builder<? extends com.commercetools.api.models.variant.VariantBulkUpdateResult>> builder) {
        this.results = new ArrayList<>();
        this.results
                .add(builder.apply(com.commercetools.api.models.variant.VariantBulkUpdateResultBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Number of Variants that were successfully updated.</p>
     * @return successCount
     */

    public Integer getSuccessCount() {
        return this.successCount;
    }

    /**
     *  <p>Number of Variants that failed to update.</p>
     * @return failureCount
     */

    public Integer getFailureCount() {
        return this.failureCount;
    }

    /**
     *  <p>Results for each Variant in the request, in the same order as the <code>items</code> in the request body.</p>
     * @return results
     */

    public java.util.List<com.commercetools.api.models.variant.VariantBulkUpdateResult> getResults() {
        return this.results;
    }

    /**
     * builds VariantBulkUpdateResponse with checking for non-null required values
     * @return VariantBulkUpdateResponse
     */
    public VariantBulkUpdateResponse build() {
        Objects.requireNonNull(successCount, VariantBulkUpdateResponse.class + ": successCount is missing");
        Objects.requireNonNull(failureCount, VariantBulkUpdateResponse.class + ": failureCount is missing");
        Objects.requireNonNull(results, VariantBulkUpdateResponse.class + ": results is missing");
        return new VariantBulkUpdateResponseImpl(successCount, failureCount, results);
    }

    /**
     * builds VariantBulkUpdateResponse without checking for non-null required values
     * @return VariantBulkUpdateResponse
     */
    public VariantBulkUpdateResponse buildUnchecked() {
        return new VariantBulkUpdateResponseImpl(successCount, failureCount, results);
    }

    /**
     * factory method for an instance of VariantBulkUpdateResponseBuilder
     * @return builder
     */
    public static VariantBulkUpdateResponseBuilder of() {
        return new VariantBulkUpdateResponseBuilder();
    }

    /**
     * create builder for VariantBulkUpdateResponse instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static VariantBulkUpdateResponseBuilder of(final VariantBulkUpdateResponse template) {
        VariantBulkUpdateResponseBuilder builder = new VariantBulkUpdateResponseBuilder();
        builder.successCount = template.getSuccessCount();
        builder.failureCount = template.getFailureCount();
        builder.results = template.getResults();
        return builder;
    }

}
