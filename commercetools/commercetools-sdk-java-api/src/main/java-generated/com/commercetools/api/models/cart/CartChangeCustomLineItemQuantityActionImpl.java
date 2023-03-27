
package com.commercetools.api.models.cart;

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
 *  <p>When multiple shipping addresses are set for a Custom Line Item, use the Add CustomLineItem update action to change the shipping details. Since it is not possible for the API to infer how the overall change in the Custom Line Item quantity should be distributed over the sub-quantities, the <code>shippingDetails</code> field is kept in its current state to avoid data loss.</p>
 *  <p>To change the Custom Line Item quantity and shipping details together, use this update action in combination with the Set CustomLineItemShippingDetails update action in a single Cart update command.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class CartChangeCustomLineItemQuantityActionImpl implements CartChangeCustomLineItemQuantityAction, ModelBase {

    private String action;

    private String customLineItemId;

    private Long quantity;

    /**
     * create instance with all properties
     */
    @JsonCreator
    CartChangeCustomLineItemQuantityActionImpl(@JsonProperty("customLineItemId") final String customLineItemId,
            @JsonProperty("quantity") final Long quantity) {
        this.customLineItemId = customLineItemId;
        this.quantity = quantity;
        this.action = CHANGE_CUSTOM_LINE_ITEM_QUANTITY;
    }

    /**
     * create empty instance
     */
    public CartChangeCustomLineItemQuantityActionImpl() {
        this.action = CHANGE_CUSTOM_LINE_ITEM_QUANTITY;
    }

    /**
     *
     */

    public String getAction() {
        return this.action;
    }

    /**
     *  <p><code>id</code> of the CustomLineItem to update.</p>
     */

    public String getCustomLineItemId() {
        return this.customLineItemId;
    }

    /**
     *  <p>New value to set.</p>
     *  <p>If <code>0</code>, the Custom Line Item is removed from the Cart.</p>
     */

    public Long getQuantity() {
        return this.quantity;
    }

    public void setCustomLineItemId(final String customLineItemId) {
        this.customLineItemId = customLineItemId;
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

        CartChangeCustomLineItemQuantityActionImpl that = (CartChangeCustomLineItemQuantityActionImpl) o;

        return new EqualsBuilder().append(action, that.action)
                .append(customLineItemId, that.customLineItemId)
                .append(quantity, that.quantity)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(action).append(customLineItemId).append(quantity).toHashCode();
    }

}
