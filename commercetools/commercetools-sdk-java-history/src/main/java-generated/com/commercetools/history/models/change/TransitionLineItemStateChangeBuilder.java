
package com.commercetools.history.models.change;

import java.util.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class TransitionLineItemStateChangeBuilder {

    private String change;

    private String lineItemId;

    private String stateId;

    private java.util.List<com.commercetools.history.models.common.ItemState> nextValue;

    private java.util.List<com.commercetools.history.models.common.ItemState> previousValue;

    public TransitionLineItemStateChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    public TransitionLineItemStateChangeBuilder lineItemId(final String lineItemId) {
        this.lineItemId = lineItemId;
        return this;
    }

    public TransitionLineItemStateChangeBuilder stateId(final String stateId) {
        this.stateId = stateId;
        return this;
    }

    public TransitionLineItemStateChangeBuilder nextValue(
            final com.commercetools.history.models.common.ItemState... nextValue) {
        this.nextValue = new ArrayList<>(Arrays.asList(nextValue));
        return this;
    }

    public TransitionLineItemStateChangeBuilder nextValue(
            final java.util.List<com.commercetools.history.models.common.ItemState> nextValue) {
        this.nextValue = nextValue;
        return this;
    }

    public TransitionLineItemStateChangeBuilder previousValue(
            final com.commercetools.history.models.common.ItemState... previousValue) {
        this.previousValue = new ArrayList<>(Arrays.asList(previousValue));
        return this;
    }

    public TransitionLineItemStateChangeBuilder previousValue(
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

    public TransitionLineItemStateChange build() {
        return new TransitionLineItemStateChangeImpl(change, lineItemId, stateId, nextValue, previousValue);
    }

    public static TransitionLineItemStateChangeBuilder of() {
        return new TransitionLineItemStateChangeBuilder();
    }

    public static TransitionLineItemStateChangeBuilder of(final TransitionLineItemStateChange template) {
        TransitionLineItemStateChangeBuilder builder = new TransitionLineItemStateChangeBuilder();
        builder.change = template.getChange();
        builder.lineItemId = template.getLineItemId();
        builder.stateId = template.getStateId();
        builder.nextValue = template.getNextValue();
        builder.previousValue = template.getPreviousValue();
        return builder;
    }

}
