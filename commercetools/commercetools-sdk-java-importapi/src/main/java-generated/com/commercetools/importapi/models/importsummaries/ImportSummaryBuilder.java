
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
     *  <p>The import status of an ImportContainer given by the number of resources in each Processing State.</p>
     * @return Builder
     */

    public ImportSummaryBuilder states(
            Function<com.commercetools.importapi.models.importsummaries.OperationStatesBuilder, com.commercetools.importapi.models.importsummaries.OperationStatesBuilder> builder) {
        this.states = builder.apply(com.commercetools.importapi.models.importsummaries.OperationStatesBuilder.of())
                .build();
        return this;
    }

    /**
     *  <p>The import status of an ImportContainer given by the number of resources in each Processing State.</p>
     * @param states
     * @return Builder
     */

    public ImportSummaryBuilder states(
            final com.commercetools.importapi.models.importsummaries.OperationStates states) {
        this.states = states;
        return this;
    }

    /**
     *  <p>The total number of ImportOperations received for this Import Summary.</p>
     * @param total
     * @return Builder
     */

    public ImportSummaryBuilder total(final Long total) {
        this.total = total;
        return this;
    }

    public com.commercetools.importapi.models.importsummaries.OperationStates getStates() {
        return this.states;
    }

    public Long getTotal() {
        return this.total;
    }

    public ImportSummary build() {
        Objects.requireNonNull(states, ImportSummary.class + ": states is missing");
        Objects.requireNonNull(total, ImportSummary.class + ": total is missing");
        return new ImportSummaryImpl(states, total);
    }

    /**
     * builds ImportSummary without checking for non null required values
     */
    public ImportSummary buildUnchecked() {
        return new ImportSummaryImpl(states, total);
    }

    public static ImportSummaryBuilder of() {
        return new ImportSummaryBuilder();
    }

    public static ImportSummaryBuilder of(final ImportSummary template) {
        ImportSummaryBuilder builder = new ImportSummaryBuilder();
        builder.states = template.getStates();
        builder.total = template.getTotal();
        return builder;
    }

}
