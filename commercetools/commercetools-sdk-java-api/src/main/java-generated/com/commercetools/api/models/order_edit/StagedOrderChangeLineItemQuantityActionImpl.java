
package com.commercetools.api.models.order_edit;

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
 *  <p>When multiple shipping addresses are set for a Line Item, use the Remove LineItem and Add LineItem update action to change the shipping details. Since it is not possible for the API to infer how the overall change in the Line Item quantity should be distributed over the sub-quantities, the <code>shippingDetails</code> field is kept in its current state to avoid data loss.</p>
 *  <p>To change the Line Item quantity and shipping details together, use this update action in combination with the Set LineItem ShippingDetails update action in a single Order update command.</p>
 *  <p>The LineItem price is updated as described in Line Item price selection.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class StagedOrderChangeLineItemQuantityActionImpl implements StagedOrderChangeLineItemQuantityAction, ModelBase {

    private String action;

    private String lineItemId;

    private String lineItemKey;

    private Long quantity;

    private com.commercetools.api.models.common.Money externalPrice;

    private com.commercetools.api.models.cart.ExternalLineItemTotalPrice externalTotalPrice;

    /**
     * create instance with all properties
     */
    @JsonCreator
    StagedOrderChangeLineItemQuantityActionImpl(@JsonProperty("lineItemId") final String lineItemId,
            @JsonProperty("lineItemKey") final String lineItemKey, @JsonProperty("quantity") final Long quantity,
            @JsonProperty("externalPrice") final com.commercetools.api.models.common.Money externalPrice,
            @JsonProperty("externalTotalPrice") final com.commercetools.api.models.cart.ExternalLineItemTotalPrice externalTotalPrice) {
        this.lineItemId = lineItemId;
        this.lineItemKey = lineItemKey;
        this.quantity = quantity;
        this.externalPrice = externalPrice;
        this.externalTotalPrice = externalTotalPrice;
        this.action = CHANGE_LINE_ITEM_QUANTITY;
    }

    /**
     * create empty instance
     */
    public StagedOrderChangeLineItemQuantityActionImpl() {
        this.action = CHANGE_LINE_ITEM_QUANTITY;
    }

    /**
     *
     */

    public String getAction() {
        return this.action;
    }

    /**
     *  <p><code>id</code> of the LineItem to update. Either <code>lineItemId</code> or <code>lineItemKey</code> is required.</p>
     */

    public String getLineItemId() {
        return this.lineItemId;
    }

    /**
     *  <p><code>key</code> of the LineItem to update. Either <code>lineItemId</code> or <code>lineItemKey</code> is required.</p>
     */

    public String getLineItemKey() {
        return this.lineItemKey;
    }

    /**
     *  <p>New value to set. If <code>0</code>, the LineItem is removed from the Order.</p>
     */

    public Long getQuantity() {
        return this.quantity;
    }

    /**
     *  <p>Required when the Line Item uses <code>ExternalPrice</code> LineItemPriceMode. Sets the LineItem <code>price</code> to the given value when changing the quantity of a Line Item.</p>
     *  <p>The LineItem price is updated as described in Line Item price selection.</p>
     */

    public com.commercetools.api.models.common.Money getExternalPrice() {
        return this.externalPrice;
    }

    /**
     *  <p>Sets the LineItem <code>price</code> and <code>totalPrice</code> to the given value when changing the quantity of a Line Item with the <code>ExternalTotal</code> LineItemPriceMode. If <code>externalTotalPrice</code> is not given and the <code>priceMode</code> is <code>ExternalTotal</code>, the external price is unset and the <code>priceMode</code> is set to <code>Platform</code>.</p>
     */

    public com.commercetools.api.models.cart.ExternalLineItemTotalPrice getExternalTotalPrice() {
        return this.externalTotalPrice;
    }

    public void setLineItemId(final String lineItemId) {
        this.lineItemId = lineItemId;
    }

    public void setLineItemKey(final String lineItemKey) {
        this.lineItemKey = lineItemKey;
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

        StagedOrderChangeLineItemQuantityActionImpl that = (StagedOrderChangeLineItemQuantityActionImpl) o;

        return new EqualsBuilder().append(action, that.action)
                .append(lineItemId, that.lineItemId)
                .append(lineItemKey, that.lineItemKey)
                .append(quantity, that.quantity)
                .append(externalPrice, that.externalPrice)
                .append(externalTotalPrice, that.externalTotalPrice)
                .append(action, that.action)
                .append(lineItemId, that.lineItemId)
                .append(lineItemKey, that.lineItemKey)
                .append(quantity, that.quantity)
                .append(externalPrice, that.externalPrice)
                .append(externalTotalPrice, that.externalTotalPrice)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(action)
                .append(lineItemId)
                .append(lineItemKey)
                .append(quantity)
                .append(externalPrice)
                .append(externalTotalPrice)
                .toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("action", action)
                .append("lineItemId", lineItemId)
                .append("lineItemKey", lineItemKey)
                .append("quantity", quantity)
                .append("externalPrice", externalPrice)
                .append("externalTotalPrice", externalTotalPrice)
                .build();
    }

    @Override
    public StagedOrderChangeLineItemQuantityAction copyDeep() {
        return StagedOrderChangeLineItemQuantityAction.deepCopy(this);
    }
}
