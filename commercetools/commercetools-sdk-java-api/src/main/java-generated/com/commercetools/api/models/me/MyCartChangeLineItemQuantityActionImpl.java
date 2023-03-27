
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

/**
 *  <p>When multiple shipping addresses are set for a Line Item, use the Remove LineItem and Add LineItem update action to change the shipping details. Since it is not possible for the API to infer how the overall change in the Line Item quantity should be distributed over the sub-quantities, the <code>shippingDetails</code> field is kept in its current state to avoid data loss.</p>
 *  <p>To change the Line Item quantity and shipping details together, use this update action in combination with the Set LineItemShippingDetails update action in a single Cart update command.</p>
 *  <p>The LineItem price is set as described in LineItem Price selection.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class MyCartChangeLineItemQuantityActionImpl implements MyCartChangeLineItemQuantityAction, ModelBase {

    private String action;

    private String lineItemId;

    private Long quantity;

    private com.commercetools.api.models.common.Money externalPrice;

    private com.commercetools.api.models.cart.ExternalLineItemTotalPrice externalTotalPrice;

    /**
     * create instance with all properties
     */
    @JsonCreator
    MyCartChangeLineItemQuantityActionImpl(@JsonProperty("lineItemId") final String lineItemId,
            @JsonProperty("quantity") final Long quantity,
            @JsonProperty("externalPrice") final com.commercetools.api.models.common.Money externalPrice,
            @JsonProperty("externalTotalPrice") final com.commercetools.api.models.cart.ExternalLineItemTotalPrice externalTotalPrice) {
        this.lineItemId = lineItemId;
        this.quantity = quantity;
        this.externalPrice = externalPrice;
        this.externalTotalPrice = externalTotalPrice;
        this.action = CHANGE_LINE_ITEM_QUANTITY;
    }

    /**
     * create empty instance
     */
    public MyCartChangeLineItemQuantityActionImpl() {
        this.action = CHANGE_LINE_ITEM_QUANTITY;
    }

    /**
     *
     */

    public String getAction() {
        return this.action;
    }

    /**
     *  <p><code>id</code> of the LineItem to update.</p>
     */

    public String getLineItemId() {
        return this.lineItemId;
    }

    /**
     *  <p>New value to set.</p>
     *  <p>If <code>0</code>, the Line Item is removed from the Cart.</p>
     */

    public Long getQuantity() {
        return this.quantity;
    }

    /**
     *  <p>Sets the LineItem <code>price</code> to the given value when changing the quantity of a Line Item with the <code>ExternalPrice</code> LineItemPriceMode.</p>
     *  <p>The LineItem price is updated as described in LineItem Price selection.</p>
     */

    public com.commercetools.api.models.common.Money getExternalPrice() {
        return this.externalPrice;
    }

    /**
     *  <p>Sets the LineItem <code>price</code> and <code>totalPrice</code> to the given value when changing the quantity of a Line Item with the <code>ExternalTotal</code> LineItemPriceMode.</p>
     */

    public com.commercetools.api.models.cart.ExternalLineItemTotalPrice getExternalTotalPrice() {
        return this.externalTotalPrice;
    }

    public void setLineItemId(final String lineItemId) {
        this.lineItemId = lineItemId;
    }

    public void setQuantity(final Long quantity) {
        this.quantity = quantity;
    }

    public void setExternalPrice(final com.commercetools.api.models.common.Money externalPrice) {
        this.externalPrice = externalPrice;
    }

    public void setExternalTotalPrice(
            final com.commercetools.api.models.cart.ExternalLineItemTotalPrice externalTotalPrice) {
        this.externalTotalPrice = externalTotalPrice;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        MyCartChangeLineItemQuantityActionImpl that = (MyCartChangeLineItemQuantityActionImpl) o;

        return new EqualsBuilder().append(action, that.action)
                .append(lineItemId, that.lineItemId)
                .append(quantity, that.quantity)
                .append(externalPrice, that.externalPrice)
                .append(externalTotalPrice, that.externalTotalPrice)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(action)
                .append(lineItemId)
                .append(quantity)
                .append(externalPrice)
                .append(externalTotalPrice)
                .toHashCode();
    }

}
