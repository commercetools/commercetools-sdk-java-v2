
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
 * MyShoppingListChangeTextLineItemsOrderAction
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class MyShoppingListChangeTextLineItemsOrderActionImpl
        implements MyShoppingListChangeTextLineItemsOrderAction, ModelBase {

    private String action;

    private java.util.List<String> textLineItemOrder;

    /**
     * create instance with all properties
     */
    @JsonCreator
    MyShoppingListChangeTextLineItemsOrderActionImpl(
            @JsonProperty("textLineItemOrder") final java.util.List<String> textLineItemOrder) {
        this.textLineItemOrder = textLineItemOrder;
        this.action = CHANGE_TEXT_LINE_ITEMS_ORDER;
    }

    /**
     * create empty instance
     */
    public MyShoppingListChangeTextLineItemsOrderActionImpl() {
        this.action = CHANGE_TEXT_LINE_ITEMS_ORDER;
    }

    /**
     *
     */

    public String getAction() {
        return this.action;
    }

    /**
     *  <p>All existing TextLineItem <code>id</code>s in the desired new order.</p>
     */

    public java.util.List<String> getTextLineItemOrder() {
        return this.textLineItemOrder;
    }

    public void setTextLineItemOrder(final String... textLineItemOrder) {
        this.textLineItemOrder = new ArrayList<>(Arrays.asList(textLineItemOrder));
    }

    public void setTextLineItemOrder(final java.util.List<String> textLineItemOrder) {
        this.textLineItemOrder = textLineItemOrder;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        MyShoppingListChangeTextLineItemsOrderActionImpl that = (MyShoppingListChangeTextLineItemsOrderActionImpl) o;

        return new EqualsBuilder().append(action, that.action)
                .append(textLineItemOrder, that.textLineItemOrder)
                .append(action, that.action)
                .append(textLineItemOrder, that.textLineItemOrder)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(action).append(textLineItemOrder).toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("action", action)
                .append("textLineItemOrder", textLineItemOrder)
                .build();
    }

    @Override
    public MyShoppingListChangeTextLineItemsOrderAction copyDeep() {
        return MyShoppingListChangeTextLineItemsOrderAction.deepCopy(this);
    }
}
