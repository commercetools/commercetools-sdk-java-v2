
package com.commercetools.api.models.me;

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
 * MyShoppingListChangeTextLineItemQuantityAction
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class MyShoppingListChangeTextLineItemQuantityActionImpl
        implements MyShoppingListChangeTextLineItemQuantityAction, ModelBase {

    private String action;

    private String textLineItemId;

    private String textLineItemKey;

    private Long quantity;

    /**
     * create instance with all properties
     */
    @JsonCreator
    MyShoppingListChangeTextLineItemQuantityActionImpl(@JsonProperty("textLineItemId") final String textLineItemId,
            @JsonProperty("textLineItemKey") final String textLineItemKey,
            @JsonProperty("quantity") final Long quantity) {
        this.textLineItemId = textLineItemId;
        this.textLineItemKey = textLineItemKey;
        this.quantity = quantity;
        this.action = CHANGE_TEXT_LINE_ITEM_QUANTITY;
    }

    /**
     * create empty instance
     */
    public MyShoppingListChangeTextLineItemQuantityActionImpl() {
        this.action = CHANGE_TEXT_LINE_ITEM_QUANTITY;
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
     *  <p>New value to set. If <code>0</code>, the TextLineItem is removed from the ShoppingList.</p>
     */

    public Long getQuantity() {
        return this.quantity;
    }

    public void setTextLineItemId(final String textLineItemId) {
        this.textLineItemId = textLineItemId;
    }

    public void setTextLineItemKey(final String textLineItemKey) {
        this.textLineItemKey = textLineItemKey;
    }

    public void setQuantity(final Long quantity) {
        this.quantity = quantity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        MyShoppingListChangeTextLineItemQuantityActionImpl that = (MyShoppingListChangeTextLineItemQuantityActionImpl) o;

        return new EqualsBuilder().append(action, that.action)
                .append(textLineItemId, that.textLineItemId)
                .append(textLineItemKey, that.textLineItemKey)
                .append(quantity, that.quantity)
                .append(action, that.action)
                .append(textLineItemId, that.textLineItemId)
                .append(textLineItemKey, that.textLineItemKey)
                .append(quantity, that.quantity)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(action)
                .append(textLineItemId)
                .append(textLineItemKey)
                .append(quantity)
                .toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("action", action)
                .append("textLineItemId", textLineItemId)
                .append("textLineItemKey", textLineItemKey)
                .append("quantity", quantity)
                .build();
    }

}
