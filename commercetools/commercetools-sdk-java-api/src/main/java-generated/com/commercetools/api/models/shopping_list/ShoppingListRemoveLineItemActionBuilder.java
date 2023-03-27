
package com.commercetools.api.models.shopping_list;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ShoppingListRemoveLineItemActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ShoppingListRemoveLineItemAction shoppingListRemoveLineItemAction = ShoppingListRemoveLineItemAction.builder()
 *             .lineItemId("{lineItemId}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ShoppingListRemoveLineItemActionBuilder implements Builder<ShoppingListRemoveLineItemAction> {

    private String lineItemId;

    @Nullable
    private Long quantity;

    /**
     *  <p>The <code>id</code> of the ShoppingListLineItem to update.</p>
     * @param lineItemId value to be set
     * @return Builder
     */

    public ShoppingListRemoveLineItemActionBuilder lineItemId(final String lineItemId) {
        this.lineItemId = lineItemId;
        return this;
    }

    /**
     *  <p>Amount to remove from the <code>quantity</code> of the ShoppingListLineItem. If not set, the ShoppingListLineItem is removed from the ShoppingList. If this value matches or exceeds the current <code>quantity</code> of the ShoppingListLineItem, the ShoppingListLineItem is removed from the ShoppingList.</p>
     * @param quantity value to be set
     * @return Builder
     */

    public ShoppingListRemoveLineItemActionBuilder quantity(@Nullable final Long quantity) {
        this.quantity = quantity;
        return this;
    }

    /**
     *  <p>The <code>id</code> of the ShoppingListLineItem to update.</p>
     * @return lineItemId
     */

    public String getLineItemId() {
        return this.lineItemId;
    }

    /**
     *  <p>Amount to remove from the <code>quantity</code> of the ShoppingListLineItem. If not set, the ShoppingListLineItem is removed from the ShoppingList. If this value matches or exceeds the current <code>quantity</code> of the ShoppingListLineItem, the ShoppingListLineItem is removed from the ShoppingList.</p>
     * @return quantity
     */

    @Nullable
    public Long getQuantity() {
        return this.quantity;
    }

    /**
     * builds ShoppingListRemoveLineItemAction with checking for non-null required values
     * @return ShoppingListRemoveLineItemAction
     */
    public ShoppingListRemoveLineItemAction build() {
        Objects.requireNonNull(lineItemId, ShoppingListRemoveLineItemAction.class + ": lineItemId is missing");
        return new ShoppingListRemoveLineItemActionImpl(lineItemId, quantity);
    }

    /**
     * builds ShoppingListRemoveLineItemAction without checking for non-null required values
     * @return ShoppingListRemoveLineItemAction
     */
    public ShoppingListRemoveLineItemAction buildUnchecked() {
        return new ShoppingListRemoveLineItemActionImpl(lineItemId, quantity);
    }

    /**
     * factory method for an instance of ShoppingListRemoveLineItemActionBuilder
     * @return builder
     */
    public static ShoppingListRemoveLineItemActionBuilder of() {
        return new ShoppingListRemoveLineItemActionBuilder();
    }

    /**
     * create builder for ShoppingListRemoveLineItemAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ShoppingListRemoveLineItemActionBuilder of(final ShoppingListRemoveLineItemAction template) {
        ShoppingListRemoveLineItemActionBuilder builder = new ShoppingListRemoveLineItemActionBuilder();
        builder.lineItemId = template.getLineItemId();
        builder.quantity = template.getQuantity();
        return builder;
    }

}
