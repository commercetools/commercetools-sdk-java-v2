
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
public class ChangeTextLineItemNameChangeImpl implements ChangeTextLineItemNameChange, ModelBase {

    private String type;

    private String change;

    private com.commercetools.history.models.change_value.TextLineItemValue textLineItem;

    private com.commercetools.history.models.common.LocalizedString nextValue;

    private com.commercetools.history.models.common.LocalizedString previousValue;

    @JsonCreator
    ChangeTextLineItemNameChangeImpl(@JsonProperty("change") final String change,
            @JsonProperty("textLineItem") final com.commercetools.history.models.change_value.TextLineItemValue textLineItem,
            @JsonProperty("nextValue") final com.commercetools.history.models.common.LocalizedString nextValue,
            @JsonProperty("previousValue") final com.commercetools.history.models.common.LocalizedString previousValue) {
        this.change = change;
        this.textLineItem = textLineItem;
        this.nextValue = nextValue;
        this.previousValue = previousValue;
        this.type = CHANGE_TEXT_LINE_ITEM_NAME_CHANGE;
    }

    public ChangeTextLineItemNameChangeImpl() {
        this.type = CHANGE_TEXT_LINE_ITEM_NAME_CHANGE;
    }

    public String getType() {
        return this.type;
    }

    /**
    *  <p>Update action for <code>changeTextLineItemName</code></p>
    */
    public String getChange() {
        return this.change;
    }

    public com.commercetools.history.models.change_value.TextLineItemValue getTextLineItem() {
        return this.textLineItem;
    }

    public com.commercetools.history.models.common.LocalizedString getNextValue() {
        return this.nextValue;
    }

    public com.commercetools.history.models.common.LocalizedString getPreviousValue() {
        return this.previousValue;
    }

    public void setChange(final String change) {
        this.change = change;
    }

    public void setTextLineItem(final com.commercetools.history.models.change_value.TextLineItemValue textLineItem) {
        this.textLineItem = textLineItem;
    }

    public void setNextValue(final com.commercetools.history.models.common.LocalizedString nextValue) {
        this.nextValue = nextValue;
    }

    public void setPreviousValue(final com.commercetools.history.models.common.LocalizedString previousValue) {
        this.previousValue = previousValue;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ChangeTextLineItemNameChangeImpl that = (ChangeTextLineItemNameChangeImpl) o;

        return new EqualsBuilder().append(type, that.type)
                .append(change, that.change)
                .append(textLineItem, that.textLineItem)
                .append(nextValue, that.nextValue)
                .append(previousValue, that.previousValue)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(type)
                .append(change)
                .append(textLineItem)
                .append(nextValue)
                .append(previousValue)
                .toHashCode();
    }

}
