
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
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 *  <p>Change triggered by the following update actions:</p>
 *  <ul>
 *   <li><a href="https://docs.commercetools.com/apis/ctp:api:type:OrderTransitionLineItemStateAction" rel="nofollow">Change the state of LineItem according to allowed transitions</a> on Orders.</li>
 *   <li><a href="https://docs.commercetools.com/apis/ctp:api:type:OrderTransitionLineItemStateAction" rel="nofollow">Change the state of LineItem according to allowed transitions</a> on Staged Orders.</li>
 *  </ul>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class TransitionLineItemStateChangeImpl implements TransitionLineItemStateChange, ModelBase {

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
    TransitionLineItemStateChangeImpl(@JsonProperty("change") final String change,
            @JsonProperty("previousValue") final java.util.List<com.commercetools.history.models.common.ItemState> previousValue,
            @JsonProperty("nextValue") final java.util.List<com.commercetools.history.models.common.ItemState> nextValue,
            @JsonProperty("lineItemId") final String lineItemId, @JsonProperty("stateId") final String stateId) {
        this.change = change;
        this.previousValue = previousValue;
        this.nextValue = nextValue;
        this.lineItemId = lineItemId;
        this.stateId = stateId;
        this.type = TRANSITION_LINE_ITEM_STATE_CHANGE;
    }

    /**
     * create empty instance
     */
    public TransitionLineItemStateChangeImpl() {
        this.type = TRANSITION_LINE_ITEM_STATE_CHANGE;
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
     *  <p><code>id</code> of the updated <a href="https://docs.commercetools.com/apis/ctp:api:type:LineItem" rel="nofollow">LineItem</a>.</p>
     */

    public String getLineItemId() {
        return this.lineItemId;
    }

    /**
     *  <p><code>id</code> of the <a href="https://docs.commercetools.com/apis/ctp:api:type:State" rel="nofollow">State</a> involved in the transition.</p>
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

        TransitionLineItemStateChangeImpl that = (TransitionLineItemStateChangeImpl) o;

        return new EqualsBuilder().append(type, that.type)
                .append(change, that.change)
                .append(previousValue, that.previousValue)
                .append(nextValue, that.nextValue)
                .append(lineItemId, that.lineItemId)
                .append(stateId, that.stateId)
                .append(type, that.type)
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

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("type", type)
                .append("change", change)
                .append("previousValue", previousValue)
                .append("nextValue", nextValue)
                .append("lineItemId", lineItemId)
                .append("stateId", stateId)
                .build();
    }

    @Override
    public TransitionLineItemStateChange copyDeep() {
        return TransitionLineItemStateChange.deepCopy(this);
    }
}
