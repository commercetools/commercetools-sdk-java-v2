
package com.commercetools.history.models.change;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class TransitionCustomLineItemStateChangeBuilder implements Builder<TransitionCustomLineItemStateChange> {

    private String change;

    private String lineItemId;

    private String stateId;

    private java.util.List<com.commercetools.history.models.common.ItemState> nextValue;

    private java.util.List<com.commercetools.history.models.common.ItemState> previousValue;

    public TransitionCustomLineItemStateChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    public TransitionCustomLineItemStateChangeBuilder lineItemId(final String lineItemId) {
        this.lineItemId = lineItemId;
        return this;
    }

    public TransitionCustomLineItemStateChangeBuilder stateId(final String stateId) {
        this.stateId = stateId;
        return this;
    }

    public TransitionCustomLineItemStateChangeBuilder nextValue(
            final com.commercetools.history.models.common.ItemState... nextValue) {
        this.nextValue = new ArrayList<>(Arrays.asList(nextValue));
        return this;
    }

    public TransitionCustomLineItemStateChangeBuilder nextValue(
            final java.util.List<com.commercetools.history.models.common.ItemState> nextValue) {
        this.nextValue = nextValue;
        return this;
    }

    public TransitionCustomLineItemStateChangeBuilder previousValue(
            final com.commercetools.history.models.common.ItemState... previousValue) {
        this.previousValue = new ArrayList<>(Arrays.asList(previousValue));
        return this;
    }

    public TransitionCustomLineItemStateChangeBuilder previousValue(
            final java.util.List<com.commercetools.history.models.common.ItemState> previousValue) {
        this.previousValue = previousValue;
        return this;
    }

    public String getChange() {
        return this.change;
    }

    public String getLineItemId() {
        return this.lineItemId;
    }

    public String getStateId() {
        return this.stateId;
    }

    public java.util.List<com.commercetools.history.models.common.ItemState> getNextValue() {
        return this.nextValue;
    }

    public java.util.List<com.commercetools.history.models.common.ItemState> getPreviousValue() {
        return this.previousValue;
    }

    public TransitionCustomLineItemStateChange build() {
        Objects.requireNonNull(change);
        Objects.requireNonNull(lineItemId);
        Objects.requireNonNull(stateId);
        Objects.requireNonNull(nextValue);
        Objects.requireNonNull(previousValue);
        return new TransitionCustomLineItemStateChangeImpl(change, lineItemId, stateId, nextValue, previousValue);
    }

    /**
     * builds TransitionCustomLineItemStateChange without checking for non null required values
     */
    public TransitionCustomLineItemStateChange buildUnchecked() {
        return new TransitionCustomLineItemStateChangeImpl(change, lineItemId, stateId, nextValue, previousValue);
    }

    public static TransitionCustomLineItemStateChangeBuilder of() {
        return new TransitionCustomLineItemStateChangeBuilder();
    }

    public static TransitionCustomLineItemStateChangeBuilder of(final TransitionCustomLineItemStateChange template) {
        TransitionCustomLineItemStateChangeBuilder builder = new TransitionCustomLineItemStateChangeBuilder();
        builder.change = template.getChange();
        builder.lineItemId = template.getLineItemId();
        builder.stateId = template.getStateId();
        builder.nextValue = template.getNextValue();
        builder.previousValue = template.getPreviousValue();
        return builder;
    }

}
