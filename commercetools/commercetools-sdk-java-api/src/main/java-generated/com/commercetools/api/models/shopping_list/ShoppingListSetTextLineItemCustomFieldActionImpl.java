
package com.commercetools.api.models.shopping_list;

import java.time.*;
import java.util.*;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class ShoppingListSetTextLineItemCustomFieldActionImpl
        implements ShoppingListSetTextLineItemCustomFieldAction {

    private String action;

    private String textLineItemId;

    private String name;

    private java.lang.Object value;

    @JsonCreator
    ShoppingListSetTextLineItemCustomFieldActionImpl(@JsonProperty("textLineItemId") final String textLineItemId,
            @JsonProperty("name") final String name, @JsonProperty("value") final java.lang.Object value) {
        this.textLineItemId = textLineItemId;
        this.name = name;
        this.value = value;
        this.action = SET_TEXT_LINE_ITEM_CUSTOM_FIELD;
    }

    public ShoppingListSetTextLineItemCustomFieldActionImpl() {
        this.action = SET_TEXT_LINE_ITEM_CUSTOM_FIELD;
    }

    public String getAction() {
        return this.action;
    }

    public String getTextLineItemId() {
        return this.textLineItemId;
    }

    public String getName() {
        return this.name;
    }

    public java.lang.Object getValue() {
        return this.value;
    }

    public void setTextLineItemId(final String textLineItemId) {
        this.textLineItemId = textLineItemId;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public void setValue(final java.lang.Object value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ShoppingListSetTextLineItemCustomFieldActionImpl that = (ShoppingListSetTextLineItemCustomFieldActionImpl) o;

        return new EqualsBuilder().append(action, that.action).append(textLineItemId, that.textLineItemId).append(name,
            that.name).append(value, that.value).isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(action).append(textLineItemId).append(name).append(
            value).toHashCode();
    }

}
