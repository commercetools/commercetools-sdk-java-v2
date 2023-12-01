
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
 *  <p>Change triggered by the Change TextLineItem Quantity update action.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ChangeTextLineItemQuantityChangeImpl implements ChangeTextLineItemQuantityChange, ModelBase {

    private String type;

    private String change;

    private Integer previousValue;

    private Integer nextValue;

    private com.commercetools.history.models.change_value.TextLineItemValue textLineItem;

    /**
     * create instance with all properties
     */
    @JsonCreator
    ChangeTextLineItemQuantityChangeImpl(@JsonProperty("change") final String change,
            @JsonProperty("previousValue") final Integer previousValue,
            @JsonProperty("nextValue") final Integer nextValue,
            @JsonProperty("textLineItem") final com.commercetools.history.models.change_value.TextLineItemValue textLineItem) {
        this.change = change;
        this.previousValue = previousValue;
        this.nextValue = nextValue;
        this.textLineItem = textLineItem;
        this.type = CHANGE_TEXT_LINE_ITEM_QUANTITY_CHANGE;
    }

    /**
     * create empty instance
     */
    public ChangeTextLineItemQuantityChangeImpl() {
        this.type = CHANGE_TEXT_LINE_ITEM_QUANTITY_CHANGE;
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

    public Integer getPreviousValue() {
        return this.previousValue;
    }

    /**
     *  <p>Value after the change.</p>
     */

    public Integer getNextValue() {
        return this.nextValue;
    }

    /**
     *  <p>Holds information about the updated Text Line Item.</p>
     */

    public com.commercetools.history.models.change_value.TextLineItemValue getTextLineItem() {
        return this.textLineItem;
    }

    public void setChange(final String change) {
        this.change = change;
    }

    public void setPreviousValue(final Integer previousValue) {
        this.previousValue = previousValue;
    }

    public void setNextValue(final Integer nextValue) {
        this.nextValue = nextValue;
    }

    public void setTextLineItem(final com.commercetools.history.models.change_value.TextLineItemValue textLineItem) {
        this.textLineItem = textLineItem;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ChangeTextLineItemQuantityChangeImpl that = (ChangeTextLineItemQuantityChangeImpl) o;

        return new EqualsBuilder().append(type, that.type)
                .append(change, that.change)
                .append(previousValue, that.previousValue)
                .append(nextValue, that.nextValue)
                .append(textLineItem, that.textLineItem)
                .append(type, that.type)
                .append(change, that.change)
                .append(previousValue, that.previousValue)
                .append(nextValue, that.nextValue)
                .append(textLineItem, that.textLineItem)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(type)
                .append(change)
                .append(previousValue)
                .append(nextValue)
                .append(textLineItem)
                .toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("type", type)
                .append("change", change)
                .append("previousValue", previousValue)
                .append("nextValue", nextValue)
                .append("textLineItem", textLineItem)
                .build();
    }

}
