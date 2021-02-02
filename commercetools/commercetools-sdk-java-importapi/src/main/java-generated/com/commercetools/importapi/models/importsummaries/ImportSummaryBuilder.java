
package com.commercetools.importapi.models.importsummaries;

import java.util.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class ImportSummaryBuilder {

    private com.commercetools.importapi.models.importsummaries.OperationStates states;

    private Long total;

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
