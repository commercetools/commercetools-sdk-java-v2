
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

/**
 * ShoppingListChangeLineItemQuantityAction
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ShoppingListChangeLineItemQuantityActionImpl
        implements ShoppingListChangeLineItemQuantityAction, ModelBase {

    private String action;

    private String lineItemId;

    private Long quantity;

    /**
     * create instance with all properties
     */
    @JsonCreator
    ShoppingListChangeLineItemQuantityActionImpl(@JsonProperty("lineItemId") final String lineItemId,
            @JsonProperty("quantity") final Long quantity) {
        this.lineItemId = lineItemId;
        this.quantity = quantity;
        this.action = CHANGE_LINE_ITEM_QUANTITY;
    }

    /**
     * create empty instance
     */
    public ShoppingListChangeLineItemQuantityActionImpl() {
        this.action = CHANGE_LINE_ITEM_QUANTITY;
    }

    /**
     *
     */

    public String getAction() {
        return this.action;
    }

    /**
     *  <p>The <code>id</code> of the ShoppingListLineItem to update.</p>
     */

    public String getLineItemId() {
        return this.lineItemId;
    }

    /**
     *  <p>New value to set. If <code>0</code>, the ShoppingListLineItem is removed from the ShoppingList.</p>
     */

    public Long getQuantity() {
        return this.quantity;
    }

    public void setLineItemId(final String lineItemId) {
        this.lineItemId = lineItemId;
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

        ShoppingListChangeLineItemQuantityActionImpl that = (ShoppingListChangeLineItemQuantityActionImpl) o;

        return new EqualsBuilder().append(action, that.action)
                .append(lineItemId, that.lineItemId)
                .append(quantity, that.quantity)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(action).append(lineItemId).append(quantity).toHashCode();
    }

}
