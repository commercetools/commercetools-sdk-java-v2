
package com.commercetools.api.models.me;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * MyShoppingListRemoveLineItemActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     MyShoppingListRemoveLineItemAction myShoppingListRemoveLineItemAction = MyShoppingListRemoveLineItemAction.builder()
 *             .lineItemId("{lineItemId}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class MyShoppingListRemoveLineItemActionBuilder implements Builder<MyShoppingListRemoveLineItemAction> {

    private String lineItemId;

    @Nullable
    private Long quantity;

    /**
     *  <p>The <code>id</code> of the ShoppingListLineItem to update.</p>
     * @param lineItemId value to be set
     * @return Builder
     */

    public MyShoppingListRemoveLineItemActionBuilder lineItemId(final String lineItemId) {
        this.lineItemId = lineItemId;
        return this;
    }

    /**
     *  <p>Amount to remove from the <code>quantity</code> of the ShoppingListLineItem. If not set, the ShoppingListLineItem is removed from the ShoppingList. If this value matches or exceeds the current <code>quantity</code> of the ShoppingListLineItem, the ShoppingListLineItem is removed from the ShoppingList.</p>
     * @param quantity value to be set
     * @return Builder
     */

    public MyShoppingListRemoveLineItemActionBuilder quantity(@Nullable final Long quantity) {
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
     * builds MyShoppingListRemoveLineItemAction with checking for non-null required values
     * @return MyShoppingListRemoveLineItemAction
     */
    public MyShoppingListRemoveLineItemAction build() {
        Objects.requireNonNull(lineItemId, MyShoppingListRemoveLineItemAction.class + ": lineItemId is missing");
        return new MyShoppingListRemoveLineItemActionImpl(lineItemId, quantity);
    }

    /**
     * builds MyShoppingListRemoveLineItemAction without checking for non-null required values
     * @return MyShoppingListRemoveLineItemAction
     */
    public MyShoppingListRemoveLineItemAction buildUnchecked() {
        return new MyShoppingListRemoveLineItemActionImpl(lineItemId, quantity);
    }

    /**
     * factory method for an instance of MyShoppingListRemoveLineItemActionBuilder
     * @return builder
     */
    public static MyShoppingListRemoveLineItemActionBuilder of() {
        return new MyShoppingListRemoveLineItemActionBuilder();
    }

    /**
     * create builder for MyShoppingListRemoveLineItemAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static MyShoppingListRemoveLineItemActionBuilder of(final MyShoppingListRemoveLineItemAction template) {
        MyShoppingListRemoveLineItemActionBuilder builder = new MyShoppingListRemoveLineItemActionBuilder();
        builder.lineItemId = template.getLineItemId();
        builder.quantity = template.getQuantity();
        return builder;
    }

}
