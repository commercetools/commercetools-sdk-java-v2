
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
 *  <p>This change is initiated by background processes after the <a href="https://docs.commercetools.com/apis/ctp:api:type:BusinessUnitChangeParentUnitAction" rel="nofollow">Change Parent Unit</a> or <a href="https://docs.commercetools.com/apis/ctp:api:type:BusinessUnitSetUnitTypeAction" rel="nofollow">Set Unit Type</a> update action is performed (if BusinessUnit <code>storeMode</code> is <code>"FromParent"</code>).</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class SetInheritedStoresChangeImpl implements SetInheritedStoresChange, ModelBase {

    private String type;

    private String change;

    private java.util.List<com.commercetools.history.models.common.KeyReference> addedItems;

    private java.util.List<com.commercetools.history.models.common.KeyReference> removedItems;

    private java.util.List<com.commercetools.history.models.common.KeyReference> previousValue;

    private java.util.List<com.commercetools.history.models.common.KeyReference> nextValue;

    /**
     * create instance with all properties
     */
    @JsonCreator
    SetInheritedStoresChangeImpl(@JsonProperty("change") final String change,
            @JsonProperty("addedItems") final java.util.List<com.commercetools.history.models.common.KeyReference> addedItems,
            @JsonProperty("removedItems") final java.util.List<com.commercetools.history.models.common.KeyReference> removedItems,
            @JsonProperty("previousValue") final java.util.List<com.commercetools.history.models.common.KeyReference> previousValue,
            @JsonProperty("nextValue") final java.util.List<com.commercetools.history.models.common.KeyReference> nextValue) {
        this.change = change;
        this.addedItems = addedItems;
        this.removedItems = removedItems;
        this.previousValue = previousValue;
        this.nextValue = nextValue;
        this.type = SET_INHERITED_STORES_CHANGE;
    }

    /**
     * create empty instance
     */
    public SetInheritedStoresChangeImpl() {
        this.type = SET_INHERITED_STORES_CHANGE;
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
     *  <p>Elements added to the array.</p>
     */

    public java.util.List<com.commercetools.history.models.common.KeyReference> getAddedItems() {
        return this.addedItems;
    }

    /**
     *  <p>Elements removed from the array.</p>
     */

    public java.util.List<com.commercetools.history.models.common.KeyReference> getRemovedItems() {
        return this.removedItems;
    }

    /**
     *  <p>Value before the change.</p>
     */

    public java.util.List<com.commercetools.history.models.common.KeyReference> getPreviousValue() {
        return this.previousValue;
    }

    /**
     *  <p>Value after the change.</p>
     */

    public java.util.List<com.commercetools.history.models.common.KeyReference> getNextValue() {
        return this.nextValue;
    }

    public void setChange(final String change) {
        this.change = change;
    }

    public void setAddedItems(final com.commercetools.history.models.common.KeyReference... addedItems) {
        this.addedItems = new ArrayList<>(Arrays.asList(addedItems));
    }

    public void setAddedItems(final java.util.List<com.commercetools.history.models.common.KeyReference> addedItems) {
        this.addedItems = addedItems;
    }

    public void setRemovedItems(final com.commercetools.history.models.common.KeyReference... removedItems) {
        this.removedItems = new ArrayList<>(Arrays.asList(removedItems));
    }

    public void setRemovedItems(
            final java.util.List<com.commercetools.history.models.common.KeyReference> removedItems) {
        this.removedItems = removedItems;
    }

    public void setPreviousValue(final com.commercetools.history.models.common.KeyReference... previousValue) {
        this.previousValue = new ArrayList<>(Arrays.asList(previousValue));
    }

    public void setPreviousValue(
            final java.util.List<com.commercetools.history.models.common.KeyReference> previousValue) {
        this.previousValue = previousValue;
    }

    public void setNextValue(final com.commercetools.history.models.common.KeyReference... nextValue) {
        this.nextValue = new ArrayList<>(Arrays.asList(nextValue));
    }

    public void setNextValue(final java.util.List<com.commercetools.history.models.common.KeyReference> nextValue) {
        this.nextValue = nextValue;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        SetInheritedStoresChangeImpl that = (SetInheritedStoresChangeImpl) o;

        return new EqualsBuilder().append(type, that.type)
                .append(change, that.change)
                .append(addedItems, that.addedItems)
                .append(removedItems, that.removedItems)
                .append(previousValue, that.previousValue)
                .append(nextValue, that.nextValue)
                .append(type, that.type)
                .append(change, that.change)
                .append(addedItems, that.addedItems)
                .append(removedItems, that.removedItems)
                .append(previousValue, that.previousValue)
                .append(nextValue, that.nextValue)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(type)
                .append(change)
                .append(addedItems)
                .append(removedItems)
                .append(previousValue)
                .append(nextValue)
                .toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("type", type)
                .append("change", change)
                .append("addedItems", addedItems)
                .append("removedItems", removedItems)
                .append("previousValue", previousValue)
                .append("nextValue", nextValue)
                .build();
    }

    @Override
    public SetInheritedStoresChange copyDeep() {
        return SetInheritedStoresChange.deepCopy(this);
    }
}
