
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
 *  <p>This change is initiated by background processes after the <a href="https://docs.commercetools.com/apis/ctp:api:type:ShoppingListChangeNameAction" rel="nofollow">Change Name</a> update action is performed.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ChangeLineItemNameChangeImpl implements ChangeLineItemNameChange, ModelBase {

    private String type;

    private String change;

    private com.commercetools.history.models.change_value.ShoppingListLineItemValue lineItem;

    private com.commercetools.history.models.common.LocalizedString previousValue;

    private com.commercetools.history.models.common.LocalizedString nextValue;

    /**
     * create instance with all properties
     */
    @JsonCreator
    ChangeLineItemNameChangeImpl(@JsonProperty("change") final String change,
            @JsonProperty("lineItem") final com.commercetools.history.models.change_value.ShoppingListLineItemValue lineItem,
            @JsonProperty("previousValue") final com.commercetools.history.models.common.LocalizedString previousValue,
            @JsonProperty("nextValue") final com.commercetools.history.models.common.LocalizedString nextValue) {
        this.change = change;
        this.lineItem = lineItem;
        this.previousValue = previousValue;
        this.nextValue = nextValue;
        this.type = CHANGE_LINE_ITEM_NAME_CHANGE;
    }

    /**
     * create empty instance
     */
    public ChangeLineItemNameChangeImpl() {
        this.type = CHANGE_LINE_ITEM_NAME_CHANGE;
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
     *  <p>Holds information about the updated Shopping List Line Item.</p>
     */

    public com.commercetools.history.models.change_value.ShoppingListLineItemValue getLineItem() {
        return this.lineItem;
    }

    /**
     *  <p>Value before the change.</p>
     */

    public com.commercetools.history.models.common.LocalizedString getPreviousValue() {
        return this.previousValue;
    }

    /**
     *  <p>Value after the change.</p>
     */

    public com.commercetools.history.models.common.LocalizedString getNextValue() {
        return this.nextValue;
    }

    public void setChange(final String change) {
        this.change = change;
    }

    public void setLineItem(final com.commercetools.history.models.change_value.ShoppingListLineItemValue lineItem) {
        this.lineItem = lineItem;
    }

    public void setPreviousValue(final com.commercetools.history.models.common.LocalizedString previousValue) {
        this.previousValue = previousValue;
    }

    public void setNextValue(final com.commercetools.history.models.common.LocalizedString nextValue) {
        this.nextValue = nextValue;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ChangeLineItemNameChangeImpl that = (ChangeLineItemNameChangeImpl) o;

        return new EqualsBuilder().append(type, that.type)
                .append(change, that.change)
                .append(lineItem, that.lineItem)
                .append(previousValue, that.previousValue)
                .append(nextValue, that.nextValue)
                .append(type, that.type)
                .append(change, that.change)
                .append(lineItem, that.lineItem)
                .append(previousValue, that.previousValue)
                .append(nextValue, that.nextValue)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(type)
                .append(change)
                .append(lineItem)
                .append(previousValue)
                .append(nextValue)
                .toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("type", type)
                .append("change", change)
                .append("lineItem", lineItem)
                .append("previousValue", previousValue)
                .append("nextValue", nextValue)
                .build();
    }

    @Override
    public ChangeLineItemNameChange copyDeep() {
        return ChangeLineItemNameChange.deepCopy(this);
    }
}
