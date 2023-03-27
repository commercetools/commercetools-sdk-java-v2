
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
 *  <p>The LineItem price is updated as described in LineItem Price selection.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class MyCartRemoveLineItemActionImpl implements MyCartRemoveLineItemAction, ModelBase {

    private String action;

    private String lineItemId;

    private Long quantity;

    private com.commercetools.api.models.common.Money externalPrice;

    private com.commercetools.api.models.cart.ExternalLineItemTotalPrice externalTotalPrice;

    private com.commercetools.api.models.cart.ItemShippingDetailsDraft shippingDetailsToRemove;

    /**
     * create instance with all properties
     */
    @JsonCreator
    MyCartRemoveLineItemActionImpl(@JsonProperty("lineItemId") final String lineItemId,
            @JsonProperty("quantity") final Long quantity,
            @JsonProperty("externalPrice") final com.commercetools.api.models.common.Money externalPrice,
            @JsonProperty("externalTotalPrice") final com.commercetools.api.models.cart.ExternalLineItemTotalPrice externalTotalPrice,
            @JsonProperty("shippingDetailsToRemove") final com.commercetools.api.models.cart.ItemShippingDetailsDraft shippingDetailsToRemove) {
        this.lineItemId = lineItemId;
        this.quantity = quantity;
        this.externalPrice = externalPrice;
        this.externalTotalPrice = externalTotalPrice;
        this.shippingDetailsToRemove = shippingDetailsToRemove;
        this.action = REMOVE_LINE_ITEM;
    }

    /**
     * create empty instance
     */
    public MyCartRemoveLineItemActionImpl() {
        this.action = REMOVE_LINE_ITEM;
    }

    /**
     *
     */

    public String getAction() {
        return this.action;
    }

    /**
     *  <p><code>id</code> of the Line Item to remove.</p>
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
     *  <p>Sets the LineItem <code>price</code> to the given value when decreasing the quantity of a Line Item with the <code>ExternalPrice</code> LineItemPriceMode.</p>
     */

    public com.commercetools.api.models.common.Money getExternalPrice() {
        return this.externalPrice;
    }

    /**
     *  <p>Sets the LineItem <code>price</code> and <code>totalPrice</code> to the given value when decreasing the quantity of a Line Item with the <code>ExternalTotal</code> LineItemPriceMode.</p>
     */

    public com.commercetools.api.models.cart.ExternalLineItemTotalPrice getExternalTotalPrice() {
        return this.externalTotalPrice;
    }

    /**
     *  <p>Container for Line Item-specific addresses to remove.</p>
     */

    public com.commercetools.api.models.cart.ItemShippingDetailsDraft getShippingDetailsToRemove() {
        return this.shippingDetailsToRemove;
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

    public void setShippingDetailsToRemove(
            final com.commercetools.api.models.cart.ItemShippingDetailsDraft shippingDetailsToRemove) {
        this.shippingDetailsToRemove = shippingDetailsToRemove;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        MyCartRemoveLineItemActionImpl that = (MyCartRemoveLineItemActionImpl) o;

        return new EqualsBuilder().append(action, that.action)
                .append(lineItemId, that.lineItemId)
                .append(quantity, that.quantity)
                .append(externalPrice, that.externalPrice)
                .append(externalTotalPrice, that.externalTotalPrice)
                .append(shippingDetailsToRemove, that.shippingDetailsToRemove)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(action)
                .append(lineItemId)
                .append(quantity)
                .append(externalPrice)
                .append(externalTotalPrice)
                .append(shippingDetailsToRemove)
                .toHashCode();
    }

}
