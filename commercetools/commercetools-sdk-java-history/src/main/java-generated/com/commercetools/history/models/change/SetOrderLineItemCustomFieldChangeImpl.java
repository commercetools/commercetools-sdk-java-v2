
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
public class SetOrderLineItemCustomFieldChangeImpl implements SetOrderLineItemCustomFieldChange, ModelBase {

    private String type;

    private String change;

    private String customTypeId;

    private String name;

    private String variant;

    private com.commercetools.history.models.common.LocalizedString lineItem;

    private java.lang.Object nextValue;

    private java.lang.Object previousValue;

    @JsonCreator
    SetOrderLineItemCustomFieldChangeImpl(@JsonProperty("change") final String change,
            @JsonProperty("customTypeId") final String customTypeId, @JsonProperty("name") final String name,
            @JsonProperty("variant") final String variant,
            @JsonProperty("lineItem") final com.commercetools.history.models.common.LocalizedString lineItem,
            @JsonProperty("nextValue") final java.lang.Object nextValue,
            @JsonProperty("previousValue") final java.lang.Object previousValue) {
        this.change = change;
        this.customTypeId = customTypeId;
        this.name = name;
        this.variant = variant;
        this.lineItem = lineItem;
        this.nextValue = nextValue;
        this.previousValue = previousValue;
        this.type = SET_ORDER_LINE_ITEM_CUSTOM_FIELD_CHANGE;
    }

    public SetOrderLineItemCustomFieldChangeImpl() {
        this.type = SET_ORDER_LINE_ITEM_CUSTOM_FIELD_CHANGE;
    }

    public String getType() {
        return this.type;
    }

    /**
    *  <p>Update action for <code>setLineItemCustomField</code></p>
    */
    public String getChange() {
        return this.change;
    }

    public String getCustomTypeId() {
        return this.customTypeId;
    }

    public String getName() {
        return this.name;
    }

    public String getVariant() {
        return this.variant;
    }

    public com.commercetools.history.models.common.LocalizedString getLineItem() {
        return this.lineItem;
    }

    public java.lang.Object getNextValue() {
        return this.nextValue;
    }

    public java.lang.Object getPreviousValue() {
        return this.previousValue;
    }

    public void setChange(final String change) {
        this.change = change;
    }

    public void setCustomTypeId(final String customTypeId) {
        this.customTypeId = customTypeId;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public void setVariant(final String variant) {
        this.variant = variant;
    }

    public void setLineItem(final com.commercetools.history.models.common.LocalizedString lineItem) {
        this.lineItem = lineItem;
    }

    public void setNextValue(final java.lang.Object nextValue) {
        this.nextValue = nextValue;
    }

    public void setPreviousValue(final java.lang.Object previousValue) {
        this.previousValue = previousValue;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        SetOrderLineItemCustomFieldChangeImpl that = (SetOrderLineItemCustomFieldChangeImpl) o;

        return new EqualsBuilder().append(type, that.type)
                .append(change, that.change)
                .append(customTypeId, that.customTypeId)
                .append(name, that.name)
                .append(variant, that.variant)
                .append(lineItem, that.lineItem)
                .append(nextValue, that.nextValue)
                .append(previousValue, that.previousValue)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(type)
                .append(change)
                .append(customTypeId)
                .append(name)
                .append(variant)
                .append(lineItem)
                .append(nextValue)
                .append(previousValue)
                .toHashCode();
    }

}
