
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

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class ChangeStateTypeChangeImpl implements ChangeStateTypeChange, ModelBase {

    private String type;

    private String change;

    private com.commercetools.history.models.common.StateType previousValue;

    private com.commercetools.history.models.common.StateType nextValue;

    @JsonCreator
    ChangeStateTypeChangeImpl(@JsonProperty("change") final String change,
            @JsonProperty("previousValue") final com.commercetools.history.models.common.StateType previousValue,
            @JsonProperty("nextValue") final com.commercetools.history.models.common.StateType nextValue) {
        this.change = change;
        this.previousValue = previousValue;
        this.nextValue = nextValue;
        this.type = CHANGE_STATE_TYPE_CHANGE;
    }

    public ChangeStateTypeChangeImpl() {
        this.type = CHANGE_STATE_TYPE_CHANGE;
    }

    public String getType() {
        return this.type;
    }

    /**
    *  <p>Update action for <code>changeType</code> on state</p>
    */
    public String getChange() {
        return this.change;
    }

    public com.commercetools.history.models.common.StateType getPreviousValue() {
        return this.previousValue;
    }

    public com.commercetools.history.models.common.StateType getNextValue() {
        return this.nextValue;
    }

    public void setChange(final String change) {
        this.change = change;
    }

    public void setPreviousValue(final com.commercetools.history.models.common.StateType previousValue) {
        this.previousValue = previousValue;
    }

    public void setNextValue(final com.commercetools.history.models.common.StateType nextValue) {
        this.nextValue = nextValue;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ChangeStateTypeChangeImpl that = (ChangeStateTypeChangeImpl) o;

        return new EqualsBuilder().append(type, that.type)
                .append(change, that.change)
                .append(previousValue, that.previousValue)
                .append(nextValue, that.nextValue)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(type)
                .append(change)
                .append(previousValue)
                .append(nextValue)
                .toHashCode();
    }

}
