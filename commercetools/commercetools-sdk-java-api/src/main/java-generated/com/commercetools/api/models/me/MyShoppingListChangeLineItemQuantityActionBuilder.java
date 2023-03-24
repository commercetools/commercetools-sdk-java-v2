
package com.commercetools.api.models.me;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * MyShoppingListChangeLineItemQuantityActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     MyShoppingListChangeLineItemQuantityAction myShoppingListChangeLineItemQuantityAction = MyShoppingListChangeLineItemQuantityAction.builder()
 *             .lineItemId("{lineItemId}")
 *             .quantity(0.3)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class MyShoppingListChangeLineItemQuantityActionBuilder
        implements Builder<MyShoppingListChangeLineItemQuantityAction> {

    private String lineItemId;

    private Long quantity;

    /**
     *  <p>The <code>id</code> of the ShoppingListLineItem to update.</p>
     * @param lineItemId value to be set
     * @return Builder
     */

    public MyShoppingListChangeLineItemQuantityActionBuilder lineItemId(final String lineItemId) {
        this.lineItemId = lineItemId;
        return this;
    }

    /**
     *  <p>New value to set. If <code>0</code>, the ShoppingListLineItem is removed from the ShoppingList.</p>
     * @param quantity value to be set
     * @return Builder
     */

    public MyShoppingListChangeLineItemQuantityActionBuilder quantity(final Long quantity) {
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
     * builds MyShoppingListChangeLineItemQuantityAction with checking for non-null required values
     * @return MyShoppingListChangeLineItemQuantityAction
     */
    public MyShoppingListChangeLineItemQuantityAction build() {
        Objects.requireNonNull(lineItemId,
            MyShoppingListChangeLineItemQuantityAction.class + ": lineItemId is missing");
        Objects.requireNonNull(quantity, MyShoppingListChangeLineItemQuantityAction.class + ": quantity is missing");
        return new MyShoppingListChangeLineItemQuantityActionImpl(lineItemId, quantity);
    }

    /**
     * builds MyShoppingListChangeLineItemQuantityAction without checking for non-null required values
     * @return MyShoppingListChangeLineItemQuantityAction
     */
    public MyShoppingListChangeLineItemQuantityAction buildUnchecked() {
        return new MyShoppingListChangeLineItemQuantityActionImpl(lineItemId, quantity);
    }

    public static MyShoppingListChangeLineItemQuantityActionBuilder of() {
        return new MyShoppingListChangeLineItemQuantityActionBuilder();
    }

    public static MyShoppingListChangeLineItemQuantityActionBuilder of(
            final MyShoppingListChangeLineItemQuantityAction template) {
        MyShoppingListChangeLineItemQuantityActionBuilder builder = new MyShoppingListChangeLineItemQuantityActionBuilder();
        builder.lineItemId = template.getLineItemId();
        builder.quantity = template.getQuantity();
        return builder;
    }

}
