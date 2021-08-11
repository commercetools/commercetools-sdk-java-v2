
package com.commercetools.importapi.models.importsummaries;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class ImportSummaryBuilder implements Builder<ImportSummary> {

    private com.commercetools.importapi.models.importsummaries.OperationStates states;

    private Long total;

    public ImportSummaryBuilder states(
            Function<com.commercetools.importapi.models.importsummaries.OperationStatesBuilder, com.commercetools.importapi.models.importsummaries.OperationStatesBuilder> builder) {
        this.states = builder.apply(com.commercetools.importapi.models.importsummaries.OperationStatesBuilder.of())
                .build();
        return this;
    }

    public ImportSummaryBuilder states(
            final com.commercetools.importapi.models.importsummaries.OperationStates states) {
        this.states = states;
        return this;
    }

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
