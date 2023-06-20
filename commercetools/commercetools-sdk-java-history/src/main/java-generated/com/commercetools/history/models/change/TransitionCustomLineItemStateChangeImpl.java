
package com.commercetools.history.models.change;

import java.time.*;
import java.util.*;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.ModelBase;
import io.vrap.rmf.base.client.utils.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

/**
 *  <p>Change triggered by the following update actions:</p>
 *  <ul>
 *   <li>Change the state of CustomLineItem according to allowed transitions on Orders.</li>
 *   <li>Change the state of CustomLineItem according to allowed transitions on Staged Orders.</li>
 *  </ul>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class TransitionCustomLineItemStateChangeImpl implements TransitionCustomLineItemStateChange, ModelBase {

    private String type;

    private String change;

    private java.util.List<com.commercetools.history.models.common.ItemState> previousValue;

    private java.util.List<com.commercetools.history.models.common.ItemState> nextValue;

    private String lineItemId;

    private String stateId;

    /**
     * create instance with all properties
     */
    @JsonCreator
    TransitionCustomLineItemStateChangeImpl(@JsonProperty("change") final String change,
            @JsonProperty("previousValue") final java.util.List<com.commercetools.history.models.common.ItemState> previousValue,
            @JsonProperty("nextValue") final java.util.List<com.commercetools.history.models.common.ItemState> nextValue,
            @JsonProperty("lineItemId") final String lineItemId, @JsonProperty("stateId") final String stateId) {
        this.change = change;
        this.previousValue = previousValue;
        this.nextValue = nextValue;
        this.lineItemId = lineItemId;
        this.stateId = stateId;
        this.type = TRANSITION_CUSTOM_LINE_ITEM_STATE_CHANGE;
    }

    /**
     * create empty instance
     */
    public TransitionCustomLineItemStateChangeImpl() {
        this.type = TRANSITION_CUSTOM_LINE_ITEM_STATE_CHANGE;
    }

    /**
     *
     */

    public String getType() {
        return this.type;
    }

    /**
     *
     */

    public String getChange() {
        return this.change;
    }

    /**
     *  <p>Value before the change.</p>
     */

    public java.util.List<com.commercetools.history.models.common.ItemState> getPreviousValue() {
        return this.previousValue;
    }

    /**
     *  <p>Value after the change.</p>
     */

    public java.util.List<com.commercetools.history.models.common.ItemState> getNextValue() {
        return this.nextValue;
    }

    /**
     *  <p><code>id</code> of the updated CustomLineItem.</p>
     */

    public String getLineItemId() {
        return this.lineItemId;
    }

    /**
     *  <p><code>id</code> of the State involved in the transition.</p>
     */

    public String getStateId() {
        return this.stateId;
    }

    public void setChange(final String change) {
        this.change = change;
    }

    public void setPreviousValue(final com.commercetools.history.models.common.ItemState... previousValue) {
        this.previousValue = new ArrayList<>(Arrays.asList(previousValue));
    }

    public void setPreviousValue(
            final java.util.List<com.commercetools.history.models.common.ItemState> previousValue) {
        this.previousValue = previousValue;
    }

    public void setNextValue(final com.commercetools.history.models.common.ItemState... nextValue) {
        this.nextValue = new ArrayList<>(Arrays.asList(nextValue));
    }

    public void setNextValue(final java.util.List<com.commercetools.history.models.common.ItemState> nextValue) {
        this.nextValue = nextValue;
    }

    public void setLineItemId(final String lineItemId) {
        this.lineItemId = lineItemId;
    }

    public void setStateId(final String stateId) {
        this.stateId = stateId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        TransitionCustomLineItemStateChangeImpl that = (TransitionCustomLineItemStateChangeImpl) o;

        return new EqualsBuilder().append(type, that.type)
                .append(change, that.change)
                .append(previousValue, that.previousValue)
                .append(nextValue, that.nextValue)
                .append(lineItemId, that.lineItemId)
                .append(stateId, that.stateId)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(type)
                .append(change)
                .append(previousValue)
                .append(nextValue)
                .append(lineItemId)
                .append(stateId)
                .toHashCode();
    }

}
