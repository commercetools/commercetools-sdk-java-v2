
package com.commercetools.history.models;

import java.util.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class TransitionStateChangeBuilder {

    private String change;

    private com.commercetools.history.models.Reference previousValue;

    private com.commercetools.history.models.Reference nextValue;

    public TransitionStateChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    public TransitionStateChangeBuilder previousValue(final com.commercetools.history.models.Reference previousValue) {
        this.previousValue = previousValue;
        return this;
    }

    public TransitionStateChangeBuilder nextValue(final com.commercetools.history.models.Reference nextValue) {
        this.nextValue = nextValue;
        return this;
    }

    public String getChange() {
        return this.change;
    }

    public com.commercetools.history.models.Reference getPreviousValue() {
        return this.previousValue;
    }

    public com.commercetools.history.models.Reference getNextValue() {
        return this.nextValue;
    }

    public TransitionStateChange build() {
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
