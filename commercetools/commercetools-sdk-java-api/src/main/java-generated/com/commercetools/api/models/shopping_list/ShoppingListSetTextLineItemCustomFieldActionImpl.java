
package com.commercetools.api.models.shopping_list;

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
 * ShoppingListSetTextLineItemCustomFieldAction
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ShoppingListSetTextLineItemCustomFieldActionImpl
        implements ShoppingListSetTextLineItemCustomFieldAction, ModelBase {

    private String action;

    private String textLineItemId;

    private String textLineItemKey;

    private String name;

    private java.lang.Object value;

    /**
     * create instance with all properties
     */
    @JsonCreator
    ShoppingListSetTextLineItemCustomFieldActionImpl(@JsonProperty("textLineItemId") final String textLineItemId,
            @JsonProperty("textLineItemKey") final String textLineItemKey, @JsonProperty("name") final String name,
            @JsonProperty("value") final java.lang.Object value) {
        this.textLineItemId = textLineItemId;
        this.textLineItemKey = textLineItemKey;
        this.name = name;
        this.value = value;
        this.action = SET_TEXT_LINE_ITEM_CUSTOM_FIELD;
    }

    /**
     * create empty instance
     */
    public ShoppingListSetTextLineItemCustomFieldActionImpl() {
        this.action = SET_TEXT_LINE_ITEM_CUSTOM_FIELD;
    }

    /**
     *
     */

    public String getAction() {
        return this.action;
    }

    /**
     *  <p>The <code>id</code> of the TextLineItem to update. Either <code>lineItemId</code> or <code>lineItemKey</code> is required.</p>
     */

    public String getTextLineItemId() {
        return this.textLineItemId;
    }

    /**
     *  <p>The <code>key</code> of the TextLineItem to update. Either <code>lineItemId</code> or <code>lineItemKey</code> is required.</p>
     */

    public String getTextLineItemKey() {
        return this.textLineItemKey;
    }

    /**
     *  <p>Name of the Custom Field.</p>
     */

    public String getName() {
        return this.name;
    }

    /**
     *  <p>If <code>value</code> is absent or <code>null</code>, this field will be removed if it exists. Removing a field that does not exist returns an InvalidOperation error. If <code>value</code> is provided, it is set for the field defined by <code>name</code>.</p>
     */

    public java.lang.Object getValue() {
        return this.value;
    }

    public void setTextLineItemId(final String textLineItemId) {
        this.textLineItemId = textLineItemId;
    }

    public void setTextLineItemKey(final String textLineItemKey) {
        this.textLineItemKey = textLineItemKey;
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

        return new EqualsBuilder().append(action, that.action)
                .append(textLineItemId, that.textLineItemId)
                .append(textLineItemKey, that.textLineItemKey)
                .append(name, that.name)
                .append(value, that.value)
                .append(action, that.action)
                .append(textLineItemId, that.textLineItemId)
                .append(textLineItemKey, that.textLineItemKey)
                .append(name, that.name)
                .append(value, that.value)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(action)
                .append(textLineItemId)
                .append(textLineItemKey)
                .append(name)
                .append(value)
                .toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("action", action)
                .append("textLineItemId", textLineItemId)
                .append("textLineItemKey", textLineItemKey)
                .append("name", name)
                .append("value", value)
                .build();
    }

    @Override
    public ShoppingListSetTextLineItemCustomFieldAction copyDeep() {
        return ShoppingListSetTextLineItemCustomFieldAction.deepCopy(this);
    }
}
