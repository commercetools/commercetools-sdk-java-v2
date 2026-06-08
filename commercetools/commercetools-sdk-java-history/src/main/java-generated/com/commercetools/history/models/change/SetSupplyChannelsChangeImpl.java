
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
 *  <p>Change triggered by the <a href="https://docs.commercetools.com/apis/ctp:api:type:StoreSetSupplyChannelsAction" rel="nofollow">Set Supply Channels</a> update action.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class SetSupplyChannelsChangeImpl implements SetSupplyChannelsChange, ModelBase {

    private String type;

    private String change;

    private java.util.List<com.commercetools.history.models.common.Reference> previousValue;

    private java.util.List<com.commercetools.history.models.common.Reference> nextValue;

    private java.util.List<com.commercetools.history.models.common.Reference> addedItems;

    private java.util.List<com.commercetools.history.models.common.Reference> removedItems;

    /**
     * create instance with all properties
     */
    @JsonCreator
    SetSupplyChannelsChangeImpl(@JsonProperty("change") final String change,
            @JsonProperty("previousValue") final java.util.List<com.commercetools.history.models.common.Reference> previousValue,
            @JsonProperty("nextValue") final java.util.List<com.commercetools.history.models.common.Reference> nextValue,
            @JsonProperty("addedItems") final java.util.List<com.commercetools.history.models.common.Reference> addedItems,
            @JsonProperty("removedItems") final java.util.List<com.commercetools.history.models.common.Reference> removedItems) {
        this.change = change;
        this.previousValue = previousValue;
        this.nextValue = nextValue;
        this.addedItems = addedItems;
        this.removedItems = removedItems;
        this.type = SET_SUPPLY_CHANNELS_CHANGE;
    }

    /**
     * create empty instance
     */
    public SetSupplyChannelsChangeImpl() {
        this.type = SET_SUPPLY_CHANNELS_CHANGE;
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

    public java.util.List<com.commercetools.history.models.common.Reference> getPreviousValue() {
        return this.previousValue;
    }

    /**
     *  <p>Value after the change.</p>
     */

    public java.util.List<com.commercetools.history.models.common.Reference> getNextValue() {
        return this.nextValue;
    }

    /**
     *  <p>Elements added to the array.</p>
     */

    public java.util.List<com.commercetools.history.models.common.Reference> getAddedItems() {
        return this.addedItems;
    }

    /**
     *  <p>Elements removed from the array.</p>
     */

    public java.util.List<com.commercetools.history.models.common.Reference> getRemovedItems() {
        return this.removedItems;
    }

    public void setChange(final String change) {
        this.change = change;
    }

    public void setPreviousValue(final com.commercetools.history.models.common.Reference... previousValue) {
        this.previousValue = new ArrayList<>(Arrays.asList(previousValue));
    }

    public void setPreviousValue(
            final java.util.List<com.commercetools.history.models.common.Reference> previousValue) {
        this.previousValue = previousValue;
    }

    public void setNextValue(final com.commercetools.history.models.common.Reference... nextValue) {
        this.nextValue = new ArrayList<>(Arrays.asList(nextValue));
    }

    public void setNextValue(final java.util.List<com.commercetools.history.models.common.Reference> nextValue) {
        this.nextValue = nextValue;
    }

    public void setAddedItems(final com.commercetools.history.models.common.Reference... addedItems) {
        this.addedItems = new ArrayList<>(Arrays.asList(addedItems));
    }

    public void setAddedItems(final java.util.List<com.commercetools.history.models.common.Reference> addedItems) {
        this.addedItems = addedItems;
    }

    public void setRemovedItems(final com.commercetools.history.models.common.Reference... removedItems) {
        this.removedItems = new ArrayList<>(Arrays.asList(removedItems));
    }

    public void setRemovedItems(final java.util.List<com.commercetools.history.models.common.Reference> removedItems) {
        this.removedItems = removedItems;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        SetSupplyChannelsChangeImpl that = (SetSupplyChannelsChangeImpl) o;

        return new EqualsBuilder().append(type, that.type)
                .append(change, that.change)
                .append(previousValue, that.previousValue)
                .append(nextValue, that.nextValue)
                .append(addedItems, that.addedItems)
                .append(removedItems, that.removedItems)
                .append(type, that.type)
                .append(change, that.change)
                .append(previousValue, that.previousValue)
                .append(nextValue, that.nextValue)
                .append(addedItems, that.addedItems)
                .append(removedItems, that.removedItems)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(type)
                .append(change)
                .append(previousValue)
                .append(nextValue)
                .append(addedItems)
                .append(removedItems)
                .toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("type", type)
                .append("change", change)
                .append("previousValue", previousValue)
                .append("nextValue", nextValue)
                .append("addedItems", addedItems)
                .append("removedItems", removedItems)
                .build();
    }

    @Override
    public SetSupplyChannelsChange copyDeep() {
        return SetSupplyChannelsChange.deepCopy(this);
    }
}
