
package com.commercetools.history.models.change;

import java.time.*;
import java.util.*;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class TransitionLineItemStateChangeImpl implements TransitionLineItemStateChange {

    private String type;

    private String change;

    private String lineItemId;

    private String stateId;

    private java.util.List<com.commercetools.history.models.common.ItemState> nextValue;

    private java.util.List<com.commercetools.history.models.common.ItemState> previousValue;

    @JsonCreator
    TransitionLineItemStateChangeImpl(@JsonProperty("change") final String change,
            @JsonProperty("lineItemId") final String lineItemId, @JsonProperty("stateId") final String stateId,
            @JsonProperty("nextValue") final java.util.List<com.commercetools.history.models.common.ItemState> nextValue,
            @JsonProperty("previousValue") final java.util.List<com.commercetools.history.models.common.ItemState> previousValue) {
        this.change = change;
        this.lineItemId = lineItemId;
        this.stateId = stateId;
        this.nextValue = nextValue;
        this.previousValue = previousValue;
        this.type = TRANSITION_LINE_ITEM_STATE_CHANGE;
    }

    public TransitionLineItemStateChangeImpl() {
        this.type = TRANSITION_LINE_ITEM_STATE_CHANGE;
    }

    public String getType() {
        return this.type;
    }

    /**
    *  <p>Update action for <code>transitionLineItemState</code></p>
    */
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

    public void setChange(final String change) {
        this.change = change;
    }

    public void setLineItemId(final String lineItemId) {
        this.lineItemId = lineItemId;
    }

    public void setStateId(final String stateId) {
        this.stateId = stateId;
    }

    public void setNextValue(final com.commercetools.history.models.common.ItemState... nextValue) {
        this.nextValue = new ArrayList<>(Arrays.asList(nextValue));
    }

    public void setNextValue(final java.util.List<com.commercetools.history.models.common.ItemState> nextValue) {
        this.nextValue = nextValue;
    }

    public void setPreviousValue(final com.commercetools.history.models.common.ItemState... previousValue) {
        this.previousValue = new ArrayList<>(Arrays.asList(previousValue));
    }

    public void setPreviousValue(
            final java.util.List<com.commercetools.history.models.common.ItemState> previousValue) {
        this.previousValue = previousValue;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        TransitionLineItemStateChangeImpl that = (TransitionLineItemStateChangeImpl) o;

        return new EqualsBuilder().append(type, that.type)
                .append(change, that.change)
                .append(lineItemId, that.lineItemId)
                .append(stateId, that.stateId)
                .append(nextValue, that.nextValue)
                .append(previousValue, that.previousValue)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(type)
                .append(change)
                .append(lineItemId)
                .append(stateId)
                .append(nextValue)
                .append(previousValue)
                .toHashCode();
    }

}
