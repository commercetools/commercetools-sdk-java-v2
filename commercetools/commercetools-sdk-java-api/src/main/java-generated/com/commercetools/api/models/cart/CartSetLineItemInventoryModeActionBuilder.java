
package com.commercetools.api.models.cart;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * CartSetLineItemInventoryModeActionBuilder
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
public class CartSetLineItemInventoryModeActionBuilder implements Builder<CartSetLineItemInventoryModeAction> {

    @Nullable
    private String lineItemId;

    @Nullable
    private String lineItemKey;

    @Nullable
    private com.commercetools.api.models.cart.InventoryMode inventoryMode;

    /**
     *  <p><code>id</code> of the LineItem to update. Either <code>lineItemId</code> or <code>lineItemKey</code> is required.</p>
     * @param lineItemId value to be set
     * @return Builder
     */

    public CartSetLineItemInventoryModeActionBuilder lineItemId(@Nullable final String lineItemId) {
        this.lineItemId = lineItemId;
        return this;
    }

    /**
     *  <p><code>key</code> of the LineItem to update. Either <code>lineItemId</code> or <code>lineItemKey</code> is required.</p>
     * @param lineItemKey value to be set
     * @return Builder
     */

    public CartSetLineItemInventoryModeActionBuilder lineItemKey(@Nullable final String lineItemKey) {
        this.lineItemKey = lineItemKey;
        return this;
    }

    /**
     *  <p>Inventory mode specific to the Line Item only, and valid for the entire <code>quantity</code> of the Line Item. Set only if the inventory mode should be different from the <code>inventoryMode</code> specified on the Cart.</p>
     * @param inventoryMode value to be set
     * @return Builder
     */

    public CartSetLineItemInventoryModeActionBuilder inventoryMode(
            @Nullable final com.commercetools.api.models.cart.InventoryMode inventoryMode) {
        this.inventoryMode = inventoryMode;
        return this;
    }

    /**
     *  <p><code>id</code> of the LineItem to update. Either <code>lineItemId</code> or <code>lineItemKey</code> is required.</p>
     * @return lineItemId
     */

    @Nullable
    public String getLineItemId() {
        return this.lineItemId;
    }

    /**
     *  <p><code>key</code> of the LineItem to update. Either <code>lineItemId</code> or <code>lineItemKey</code> is required.</p>
     * @return lineItemKey
     */

    @Nullable
    public String getLineItemKey() {
        return this.lineItemKey;
    }

    /**
     *  <p>Inventory mode specific to the Line Item only, and valid for the entire <code>quantity</code> of the Line Item. Set only if the inventory mode should be different from the <code>inventoryMode</code> specified on the Cart.</p>
     * @return inventoryMode
     */

    @Nullable
    public com.commercetools.api.models.cart.InventoryMode getInventoryMode() {
        return this.inventoryMode;
    }

    /**
     * builds CartSetLineItemInventoryModeAction with checking for non-null required values
     * @return CartSetLineItemInventoryModeAction
     */
    public CartSetLineItemInventoryModeAction build() {
        return new CartSetLineItemInventoryModeActionImpl(lineItemId, lineItemKey, inventoryMode);
    }

    /**
     * builds CartSetLineItemInventoryModeAction without checking for non-null required values
     * @return CartSetLineItemInventoryModeAction
     */
    public CartSetLineItemInventoryModeAction buildUnchecked() {
        return new CartSetLineItemInventoryModeActionImpl(lineItemId, lineItemKey, inventoryMode);
    }

    /**
     * factory method for an instance of CartSetLineItemInventoryModeActionBuilder
     * @return builder
     */
    public static CartSetLineItemInventoryModeActionBuilder of() {
        return new CartSetLineItemInventoryModeActionBuilder();
    }

    /**
     * create builder for CartSetLineItemInventoryModeAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CartSetLineItemInventoryModeActionBuilder of(final CartSetLineItemInventoryModeAction template) {
        CartSetLineItemInventoryModeActionBuilder builder = new CartSetLineItemInventoryModeActionBuilder();
        builder.lineItemId = template.getLineItemId();
        builder.lineItemKey = template.getLineItemKey();
        builder.inventoryMode = template.getInventoryMode();
        return builder;
    }

}
