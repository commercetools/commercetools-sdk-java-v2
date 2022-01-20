
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

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class ShoppingListChangeTextLineItemQuantityActionImpl
        implements ShoppingListChangeTextLineItemQuantityAction, ModelBase {

    private String action;

    private String textLineItemId;

    private Long quantity;

    @JsonCreator
    ShoppingListChangeTextLineItemQuantityActionImpl(@JsonProperty("textLineItemId") final String textLineItemId,
            @JsonProperty("quantity") final Long quantity) {
        this.textLineItemId = textLineItemId;
        this.quantity = quantity;
        this.action = CHANGE_TEXT_LINE_ITEM_QUANTITY;
    }

    public ShoppingListChangeTextLineItemQuantityActionImpl() {
        this.action = CHANGE_TEXT_LINE_ITEM_QUANTITY;
    }

    public String getAction() {
        return this.action;
    }

    public String getTextLineItemId() {
        return this.textLineItemId;
    }

    public Long getQuantity() {
        return this.quantity;
    }

    public void setTextLineItemId(final String textLineItemId) {
        this.textLineItemId = textLineItemId;
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

        ShoppingListChangeTextLineItemQuantityActionImpl that = (ShoppingListChangeTextLineItemQuantityActionImpl) o;

        return new EqualsBuilder().append(action, that.action)
                .append(textLineItemId, that.textLineItemId)
                .append(quantity, that.quantity)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(action).append(textLineItemId).append(quantity).toHashCode();
    }

}
