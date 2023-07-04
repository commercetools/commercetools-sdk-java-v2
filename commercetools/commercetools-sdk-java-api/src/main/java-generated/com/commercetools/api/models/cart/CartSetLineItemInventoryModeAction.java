
package com.commercetools.api.models.cart;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * CartSetLineItemInventoryModeAction
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CartSetLineItemInventoryModeAction cartSetLineItemInventoryModeAction = CartSetLineItemInventoryModeAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = CartSetLineItemInventoryModeActionImpl.class)
public interface CartSetLineItemInventoryModeAction extends CartUpdateAction {

    /**
     * discriminator value for CartSetLineItemInventoryModeAction
     */
    String SET_LINE_ITEM_INVENTORY_MODE = "setLineItemInventoryMode";

    /**
     *  <p><code>id</code> of the LineItem to update. Either <code>lineItemId</code> or <code>lineItemKey</code> is required.</p>
     * @return lineItemId
     */

    @JsonProperty("lineItemId")
    public String getLineItemId();

    /**
     *  <p><code>key</code> of the LineItem to update. Either <code>lineItemId</code> or <code>lineItemKey</code> is required.</p>
     * @return lineItemKey
     */

    @JsonProperty("lineItemKey")
    public String getLineItemKey();

    /**
     *  <p>Inventory mode specific to the Line Item only, and valid for the entire <code>quantity</code> of the Line Item. Set only if the inventory mode should be different from the <code>inventoryMode</code> specified on the Cart.</p>
     * @return inventoryMode
     */

    @JsonProperty("inventoryMode")
    public InventoryMode getInventoryMode();

    /**
     *  <p><code>id</code> of the LineItem to update. Either <code>lineItemId</code> or <code>lineItemKey</code> is required.</p>
     * @param lineItemId value to be set
     */

    public void setLineItemId(final String lineItemId);

    /**
     *  <p><code>key</code> of the LineItem to update. Either <code>lineItemId</code> or <code>lineItemKey</code> is required.</p>
     * @param lineItemKey value to be set
     */

    public void setLineItemKey(final String lineItemKey);

    /**
     *  <p>Inventory mode specific to the Line Item only, and valid for the entire <code>quantity</code> of the Line Item. Set only if the inventory mode should be different from the <code>inventoryMode</code> specified on the Cart.</p>
     * @param inventoryMode value to be set
     */

    public void setInventoryMode(final InventoryMode inventoryMode);

    /**
     * factory method
     * @return instance of CartSetLineItemInventoryModeAction
     */
    public static CartSetLineItemInventoryModeAction of() {
        return new CartSetLineItemInventoryModeActionImpl();
    }

    /**
     * factory method to create a shallow copy CartSetLineItemInventoryModeAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static CartSetLineItemInventoryModeAction of(final CartSetLineItemInventoryModeAction template) {
        CartSetLineItemInventoryModeActionImpl instance = new CartSetLineItemInventoryModeActionImpl();
        instance.setLineItemId(template.getLineItemId());
        instance.setLineItemKey(template.getLineItemKey());
        instance.setInventoryMode(template.getInventoryMode());
        return instance;
    }

    /**
     * factory method to create a deep copy of CartSetLineItemInventoryModeAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static CartSetLineItemInventoryModeAction deepCopy(
            @Nullable final CartSetLineItemInventoryModeAction template) {
        if (template == null) {
            return null;
        }
        CartSetLineItemInventoryModeActionImpl instance = new CartSetLineItemInventoryModeActionImpl();
        instance.setLineItemId(template.getLineItemId());
        instance.setLineItemKey(template.getLineItemKey());
        instance.setInventoryMode(template.getInventoryMode());
        return instance;
    }

    /**
     * builder factory method for CartSetLineItemInventoryModeAction
     * @return builder
     */
    public static CartSetLineItemInventoryModeActionBuilder builder() {
        return CartSetLineItemInventoryModeActionBuilder.of();
    }

    /**
     * create builder for CartSetLineItemInventoryModeAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CartSetLineItemInventoryModeActionBuilder builder(final CartSetLineItemInventoryModeAction template) {
        return CartSetLineItemInventoryModeActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withCartSetLineItemInventoryModeAction(Function<CartSetLineItemInventoryModeAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<CartSetLineItemInventoryModeAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<CartSetLineItemInventoryModeAction>() {
            @Override
            public String toString() {
                return "TypeReference<CartSetLineItemInventoryModeAction>";
            }
        };
    }
}
