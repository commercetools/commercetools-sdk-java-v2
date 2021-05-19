
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
public final class ChangeTaxRoundingModeChangeImpl implements ChangeTaxRoundingModeChange {

    private String type;

    private String change;

    private com.commercetools.history.models.common.RoundingMode previousValue;

    private com.commercetools.history.models.common.RoundingMode nextValue;

    @JsonCreator
    ChangeTaxRoundingModeChangeImpl(@JsonProperty("change") final String change,
            @JsonProperty("previousValue") final com.commercetools.history.models.common.RoundingMode previousValue,
            @JsonProperty("nextValue") final com.commercetools.history.models.common.RoundingMode nextValue) {
        this.change = change;
        this.previousValue = previousValue;
        this.nextValue = nextValue;
        this.type = CHANGE_TAX_ROUNDING_MODE_CHANGE;
    }

    public ChangeTaxRoundingModeChangeImpl() {
        this.type = CHANGE_TAX_ROUNDING_MODE_CHANGE;
    }

    public String getType() {
        return this.type;
    }

    /**
    *  <p>Shape of the action for <code>changeTaxRoundingMode</code></p>
    */
    public String getChange() {
        return this.change;
    }

    public com.commercetools.history.models.common.RoundingMode getPreviousValue() {
        return this.previousValue;
    }

    public com.commercetools.history.models.common.RoundingMode getNextValue() {
        return this.nextValue;
    }

    public void setChange(final String change) {
        this.change = change;
    }

    public void setPreviousValue(final com.commercetools.history.models.common.RoundingMode previousValue) {
        this.previousValue = previousValue;
    }

    public void setNextValue(final com.commercetools.history.models.common.RoundingMode nextValue) {
        this.nextValue = nextValue;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ChangeTaxRoundingModeChangeImpl that = (ChangeTaxRoundingModeChangeImpl) o;

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
