
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
 *  <p>When multiple shipping addresses are set for a Line Item, use the Remove LineItem and Add LineItem update action to change the shipping details. Since it is not possible for the API to infer how the overall change in the Line Item quantity should be distributed over the sub-quantities, the <code>shippingDetails</code> field is kept in its current state to avoid data loss.</p>
 *  <p>To change the Line Item quantity and shipping details together, use this update action in combination with the Set LineItem ShippingDetails update action in a single Cart update command.</p>
 *  <p>When the action applies to LineItems with <code>ExternalTotal</code> LineItemPriceMode, it will be changed to <code>ExternalPrice</code> and the existing <code>externalPrice</code> value, i.e. <code>LineItem.price</code>, will be retained. The LineItem total will be calculated by the system instead, so that the <code>externalTotalPrice</code> will be dropped.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class MyCartChangeLineItemQuantityActionImpl implements MyCartChangeLineItemQuantityAction, ModelBase {

    private String action;

    private String lineItemId;

    private String lineItemKey;

    private Long quantity;

    /**
     * create instance with all properties
     */
    @JsonCreator
    MyCartChangeLineItemQuantityActionImpl(@JsonProperty("lineItemId") final String lineItemId,
            @JsonProperty("lineItemKey") final String lineItemKey, @JsonProperty("quantity") final Long quantity) {
        this.lineItemId = lineItemId;
        this.lineItemKey = lineItemKey;
        this.quantity = quantity;
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
     *  <p>New value to set.</p>
     *  <p>If <code>0</code>, the Line Item is removed from the Cart.</p>
     */

    public Long getQuantity() {
        return this.quantity;
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

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        MyCartChangeLineItemQuantityActionImpl that = (MyCartChangeLineItemQuantityActionImpl) o;

        return new EqualsBuilder().append(action, that.action)
                .append(lineItemId, that.lineItemId)
                .append(lineItemKey, that.lineItemKey)
                .append(quantity, that.quantity)
                .append(action, that.action)
                .append(lineItemId, that.lineItemId)
                .append(lineItemKey, that.lineItemKey)
                .append(quantity, that.quantity)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(action)
                .append(lineItemId)
                .append(lineItemKey)
                .append(quantity)
                .toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("action", action)
                .append("lineItemId", lineItemId)
                .append("lineItemKey", lineItemKey)
                .append("quantity", quantity)
                .build();
    }

    @Override
    public MyCartChangeLineItemQuantityAction copyDeep() {
        return MyCartChangeLineItemQuantityAction.deepCopy(this);
    }
}
