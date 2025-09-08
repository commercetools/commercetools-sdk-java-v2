
package com.commercetools.importapi.models.importsummaries;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ImportSummaryBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ImportSummary importSummary = ImportSummary.builder()
 *             .states(statesBuilder -> statesBuilder)
 *             .total(1)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ImportSummaryBuilder implements Builder<ImportSummary> {

    private com.commercetools.importapi.models.importsummaries.OperationStates states;

    private Long total;

    /**
     *  <p>The current <a href="https://docs.commercetools.com/apis/ctp:import:type:ProcessingState" rel="nofollow">ProcessingStates</a> of ImportOperations in an ImportContainer.</p>
     * @param builder function to build the states value
     * @return Builder
     */

    public ImportSummaryBuilder states(
            Function<com.commercetools.importapi.models.importsummaries.OperationStatesBuilder, com.commercetools.importapi.models.importsummaries.OperationStatesBuilder> builder) {
        this.states = builder.apply(com.commercetools.importapi.models.importsummaries.OperationStatesBuilder.of())
                .build();
        return this;
    }

    /**
     *  <p>The current <a href="https://docs.commercetools.com/apis/ctp:import:type:ProcessingState" rel="nofollow">ProcessingStates</a> of ImportOperations in an ImportContainer.</p>
     * @param builder function to build the states value
     * @return Builder
     */

    public ImportSummaryBuilder withStates(
            Function<com.commercetools.importapi.models.importsummaries.OperationStatesBuilder, com.commercetools.importapi.models.importsummaries.OperationStates> builder) {
        this.states = builder.apply(com.commercetools.importapi.models.importsummaries.OperationStatesBuilder.of());
        return this;
    }

    /**
     *  <p>The current <a href="https://docs.commercetools.com/apis/ctp:import:type:ProcessingState" rel="nofollow">ProcessingStates</a> of ImportOperations in an ImportContainer.</p>
     * @param states value to be set
     * @return Builder
     */

    public ImportSummaryBuilder states(
            final com.commercetools.importapi.models.importsummaries.OperationStates states) {
        this.states = states;
        return this;
    }

    /**
     *  <p>The total number of ImportOperations in <code>states</code>.</p>
     * @param total value to be set
     * @return Builder
     */

    public ImportSummaryBuilder total(final Long total) {
        this.total = total;
        return this;
    }

    /**
     *  <p>The current <a href="https://docs.commercetools.com/apis/ctp:import:type:ProcessingState" rel="nofollow">ProcessingStates</a> of ImportOperations in an ImportContainer.</p>
     * @return states
     */

    public com.commercetools.importapi.models.importsummaries.OperationStates getStates() {
        return this.states;
    }

    /**
     *  <p>The total number of ImportOperations in <code>states</code>.</p>
     * @return total
     */

    public Long getTotal() {
        return this.total;
    }

    /**
     * builds ImportSummary with checking for non-null required values
     * @return ImportSummary
     */
    public ImportSummary build() {
        Objects.requireNonNull(states, ImportSummary.class + ": states is missing");
        Objects.requireNonNull(total, ImportSummary.class + ": total is missing");
        return new ImportSummaryImpl(states, total);
    }

    /**
     * builds ImportSummary without checking for non-null required values
     * @return ImportSummary
     */
    public ImportSummary buildUnchecked() {
        return new ImportSummaryImpl(states, total);
    }

    /**
     * factory method for an instance of ImportSummaryBuilder
     * @return builder
     */
    public static ImportSummaryBuilder of() {
        return new ImportSummaryBuilder();
    }

    /**
     * create builder for ImportSummary instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ImportSummaryBuilder of(final ImportSummary template) {
        ImportSummaryBuilder builder = new ImportSummaryBuilder();
        builder.states = template.getStates();
        builder.total = template.getTotal();
        return builder;
    }

}
