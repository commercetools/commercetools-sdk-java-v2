
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
 * CartSetLineItemInventoryModeAction
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class CartSetLineItemInventoryModeActionImpl implements CartSetLineItemInventoryModeAction, ModelBase {

    private String action;

    private String lineItemId;

    private com.commercetools.api.models.cart.InventoryMode inventoryMode;

    /**
     * create instance with all properties
     */
    @JsonCreator
    CartSetLineItemInventoryModeActionImpl(@JsonProperty("lineItemId") final String lineItemId,
            @JsonProperty("inventoryMode") final com.commercetools.api.models.cart.InventoryMode inventoryMode) {
        this.lineItemId = lineItemId;
        this.inventoryMode = inventoryMode;
        this.action = SET_LINE_ITEM_INVENTORY_MODE;
    }

    /**
     * create empty instance
     */
    public CartSetLineItemInventoryModeActionImpl() {
        this.action = SET_LINE_ITEM_INVENTORY_MODE;
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
     *  <p>Inventory mode specific to the Line Item only, and valid for the entire <code>quantity</code> of the Line Item. Set only if the inventory mode should be different from the <code>inventoryMode</code> specified on the Cart.</p>
     */

    public com.commercetools.api.models.cart.InventoryMode getInventoryMode() {
        return this.inventoryMode;
    }

    public void setLineItemId(final String lineItemId) {
        this.lineItemId = lineItemId;
    }

    public void setInventoryMode(final com.commercetools.api.models.cart.InventoryMode inventoryMode) {
        this.inventoryMode = inventoryMode;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        CartSetLineItemInventoryModeActionImpl that = (CartSetLineItemInventoryModeActionImpl) o;

        return new EqualsBuilder().append(action, that.action)
                .append(lineItemId, that.lineItemId)
                .append(inventoryMode, that.inventoryMode)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(action).append(lineItemId).append(inventoryMode).toHashCode();
    }

}
