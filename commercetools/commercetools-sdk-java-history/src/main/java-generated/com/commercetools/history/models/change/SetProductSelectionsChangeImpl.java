
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
 * SetProductSelectionsChange
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class SetProductSelectionsChangeImpl implements SetProductSelectionsChange, ModelBase {

    private String type;

    private String change;

    private java.util.List<com.commercetools.history.models.common.ProductSelectionSetting> previousValue;

    private java.util.List<com.commercetools.history.models.common.ProductSelectionSetting> nextValue;

    @JsonCreator
    SetProductSelectionsChangeImpl(@JsonProperty("change") final String change,
            @JsonProperty("previousValue") final java.util.List<com.commercetools.history.models.common.ProductSelectionSetting> previousValue,
            @JsonProperty("nextValue") final java.util.List<com.commercetools.history.models.common.ProductSelectionSetting> nextValue) {
        this.change = change;
        this.previousValue = previousValue;
        this.nextValue = nextValue;
        this.type = SET_PRODUCT_SELECTIONS_CHANGE;
    }

    public SetProductSelectionsChangeImpl() {
        this.type = SET_PRODUCT_SELECTIONS_CHANGE;
    }

    /**
     *
     */

    public String getType() {
        return this.type;
    }

    /**
     *  <p>Update action for <code>setProductSelections</code></p>
     */

    public String getChange() {
        return this.change;
    }

    /**
     *
     */

    public java.util.List<com.commercetools.history.models.common.ProductSelectionSetting> getPreviousValue() {
        return this.previousValue;
    }

    /**
     *
     */

    public java.util.List<com.commercetools.history.models.common.ProductSelectionSetting> getNextValue() {
        return this.nextValue;
    }

    public void setChange(final String change) {
        this.change = change;
    }

    public void setPreviousValue(
            final com.commercetools.history.models.common.ProductSelectionSetting... previousValue) {
        this.previousValue = new ArrayList<>(Arrays.asList(previousValue));
    }

    public void setPreviousValue(
            final java.util.List<com.commercetools.history.models.common.ProductSelectionSetting> previousValue) {
        this.previousValue = previousValue;
    }

    public void setNextValue(final com.commercetools.history.models.common.ProductSelectionSetting... nextValue) {
        this.nextValue = new ArrayList<>(Arrays.asList(nextValue));
    }

    public void setNextValue(
            final java.util.List<com.commercetools.history.models.common.ProductSelectionSetting> nextValue) {
        this.nextValue = nextValue;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        SetProductSelectionsChangeImpl that = (SetProductSelectionsChangeImpl) o;

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
