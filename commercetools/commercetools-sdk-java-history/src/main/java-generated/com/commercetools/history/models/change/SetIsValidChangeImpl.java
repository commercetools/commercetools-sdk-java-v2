
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
public final class SetIsValidChangeImpl implements SetIsValidChange {

    private String type;

    private String change;

    private Boolean previousValue;

    private Boolean nextValue;

    @JsonCreator
    SetIsValidChangeImpl(@JsonProperty("change") final String change,
            @JsonProperty("previousValue") final Boolean previousValue,
            @JsonProperty("nextValue") final Boolean nextValue) {
        this.change = change;
        this.previousValue = previousValue;
        this.nextValue = nextValue;
        this.type = SET_IS_VALID_CHANGE;
    }

    public SetIsValidChangeImpl() {
        this.type = SET_IS_VALID_CHANGE;
    }

    public String getType() {
        return this.type;
    }

    /**
    *  <p>Shape of the action for <code>setIsValid</code></p>
    */
    public String getChange() {
        return this.change;
    }

    public Boolean getPreviousValue() {
        return this.previousValue;
    }

    public Boolean getNextValue() {
        return this.nextValue;
    }

    public void setChange(final String change) {
        this.change = change;
    }

    public void setPreviousValue(final Boolean previousValue) {
        this.previousValue = previousValue;
    }

    public void setNextValue(final Boolean nextValue) {
        this.nextValue = nextValue;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        SetIsValidChangeImpl that = (SetIsValidChangeImpl) o;

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
