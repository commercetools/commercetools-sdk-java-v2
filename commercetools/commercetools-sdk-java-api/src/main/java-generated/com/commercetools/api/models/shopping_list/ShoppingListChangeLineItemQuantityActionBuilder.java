
package com.commercetools.api.models.shopping_list;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ShoppingListChangeLineItemQuantityActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ShoppingListChangeLineItemQuantityAction shoppingListChangeLineItemQuantityAction = ShoppingListChangeLineItemQuantityAction.builder()
 *             .lineItemId("{lineItemId}")
 *             .quantity(0.3)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ShoppingListChangeLineItemQuantityActionBuilder
        implements Builder<ShoppingListChangeLineItemQuantityAction> {

    private String lineItemId;

    private Long quantity;

    /**
     *  <p>The <code>id</code> of the ShoppingListLineItem to update.</p>
     * @param lineItemId value to be set
     * @return Builder
     */

    public ShoppingListChangeLineItemQuantityActionBuilder lineItemId(final String lineItemId) {
        this.lineItemId = lineItemId;
        return this;
    }

    /**
     *  <p>New value to set. If <code>0</code>, the ShoppingListLineItem is removed from the ShoppingList.</p>
     * @param quantity value to be set
     * @return Builder
     */

    public ShoppingListChangeLineItemQuantityActionBuilder quantity(final Long quantity) {
        this.quantity = quantity;
        return this;
    }

    public String getLineItemId() {
        return this.lineItemId;
    }

    public Long getQuantity() {
        return this.quantity;
    }

    /**
     * builds ShoppingListChangeLineItemQuantityAction with checking for non-null required values
     * @return ShoppingListChangeLineItemQuantityAction
     */
    public ShoppingListChangeLineItemQuantityAction build() {
        Objects.requireNonNull(lineItemId, ShoppingListChangeLineItemQuantityAction.class + ": lineItemId is missing");
        Objects.requireNonNull(quantity, ShoppingListChangeLineItemQuantityAction.class + ": quantity is missing");
        return new ShoppingListChangeLineItemQuantityActionImpl(lineItemId, quantity);
    }

    /**
     * builds ShoppingListChangeLineItemQuantityAction without checking for non-null required values
     * @return ShoppingListChangeLineItemQuantityAction
     */
    public ShoppingListChangeLineItemQuantityAction buildUnchecked() {
        return new ShoppingListChangeLineItemQuantityActionImpl(lineItemId, quantity);
    }

    public static ShoppingListChangeLineItemQuantityActionBuilder of() {
        return new ShoppingListChangeLineItemQuantityActionBuilder();
    }

    public static ShoppingListChangeLineItemQuantityActionBuilder of(
            final ShoppingListChangeLineItemQuantityAction template) {
        ShoppingListChangeLineItemQuantityActionBuilder builder = new ShoppingListChangeLineItemQuantityActionBuilder();
        builder.lineItemId = template.getLineItemId();
        builder.quantity = template.getQuantity();
        return builder;
    }

}
