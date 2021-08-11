
package com.commercetools.history.models.change;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class TransitionStateChangeBuilder implements Builder<TransitionStateChange> {

    private String change;

    private com.commercetools.history.models.common.Reference previousValue;

    private com.commercetools.history.models.common.Reference nextValue;

    public TransitionStateChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    public TransitionStateChangeBuilder previousValue(
            Function<com.commercetools.history.models.common.ReferenceBuilder, com.commercetools.history.models.common.ReferenceBuilder> builder) {
        this.previousValue = builder.apply(com.commercetools.history.models.common.ReferenceBuilder.of()).build();
        return this;
    }

    public TransitionStateChangeBuilder previousValue(
            final com.commercetools.history.models.common.Reference previousValue) {
        this.previousValue = previousValue;
        return this;
    }

    public TransitionStateChangeBuilder nextValue(
            Function<com.commercetools.history.models.common.ReferenceBuilder, com.commercetools.history.models.common.ReferenceBuilder> builder) {
        this.nextValue = builder.apply(com.commercetools.history.models.common.ReferenceBuilder.of()).build();
        return this;
    }

    public TransitionStateChangeBuilder nextValue(final com.commercetools.history.models.common.Reference nextValue) {
        this.nextValue = nextValue;
        return this;
    }

    public String getChange() {
        return this.change;
    }

    public com.commercetools.history.models.common.Reference getPreviousValue() {
        return this.previousValue;
    }

    public com.commercetools.history.models.common.Reference getNextValue() {
        return this.nextValue;
    }

    public TransitionStateChange build() {
        Objects.requireNonNull(change, TransitionStateChange.class + ": change is missing");
        Objects.requireNonNull(previousValue, TransitionStateChange.class + ": previousValue is missing");
        Objects.requireNonNull(nextValue, TransitionStateChange.class + ": nextValue is missing");
        return new TransitionStateChangeImpl(change, previousValue, nextValue);
    }

    /**
     * builds TransitionStateChange without checking for non null required values
     */
    public TransitionStateChange buildUnchecked() {
        return new TransitionStateChangeImpl(change, previousValue, nextValue);
    }

    public static TransitionStateChangeBuilder of() {
        return new TransitionStateChangeBuilder();
    }

    public static TransitionStateChangeBuilder of(final TransitionStateChange template) {
        TransitionStateChangeBuilder builder = new TransitionStateChangeBuilder();
        builder.change = template.getChange();
        builder.previousValue = template.getPreviousValue();
        builder.nextValue = template.getNextValue();
        return builder;
    }

}
