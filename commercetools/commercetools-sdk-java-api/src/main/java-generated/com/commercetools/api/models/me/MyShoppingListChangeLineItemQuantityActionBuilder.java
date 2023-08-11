
package com.commercetools.api.models.me;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * MyShoppingListChangeLineItemQuantityActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     MyShoppingListChangeLineItemQuantityAction myShoppingListChangeLineItemQuantityAction = MyShoppingListChangeLineItemQuantityAction.builder()
 *             .quantity(0.3)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class MyShoppingListChangeLineItemQuantityActionBuilder
        implements Builder<MyShoppingListChangeLineItemQuantityAction> {

    @Nullable
    private String lineItemId;

    @Nullable
    private String lineItemKey;

    private Long quantity;

    /**
     *  <p><code>id</code> of the ShoppingListLineItem to update. Either <code>lineItemId</code> or <code>lineItemKey</code> is required.</p>
     * @param lineItemId value to be set
     * @return Builder
     */

    public MyShoppingListChangeLineItemQuantityActionBuilder lineItemId(@Nullable final String lineItemId) {
        this.lineItemId = lineItemId;
        return this;
    }

    /**
     *  <p><code>key</code> of the ShoppingListLineItem to update. Either <code>lineItemId</code> or <code>lineItemKey</code> is required.</p>
     * @param lineItemKey value to be set
     * @return Builder
     */

    public MyShoppingListChangeLineItemQuantityActionBuilder lineItemKey(@Nullable final String lineItemKey) {
        this.lineItemKey = lineItemKey;
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

    /**
     *  <p><code>id</code> of the ShoppingListLineItem to update. Either <code>lineItemId</code> or <code>lineItemKey</code> is required.</p>
     * @return lineItemId
     */

    @Nullable
    public String getLineItemId() {
        return this.lineItemId;
    }

    /**
     *  <p><code>key</code> of the ShoppingListLineItem to update. Either <code>lineItemId</code> or <code>lineItemKey</code> is required.</p>
     * @return lineItemKey
     */

    @Nullable
    public String getLineItemKey() {
        return this.lineItemKey;
    }

    /**
     *  <p>New value to set. If <code>0</code>, the ShoppingListLineItem is removed from the ShoppingList.</p>
     * @return quantity
     */

    public Long getQuantity() {
        return this.quantity;
    }

    /**
     * builds MyShoppingListChangeLineItemQuantityAction with checking for non-null required values
     * @return MyShoppingListChangeLineItemQuantityAction
     */
    public MyShoppingListChangeLineItemQuantityAction build() {
        Objects.requireNonNull(quantity, MyShoppingListChangeLineItemQuantityAction.class + ": quantity is missing");
        return new MyShoppingListChangeLineItemQuantityActionImpl(lineItemId, lineItemKey, quantity);
    }

    /**
     * builds MyShoppingListChangeLineItemQuantityAction without checking for non-null required values
     * @return MyShoppingListChangeLineItemQuantityAction
     */
    public MyShoppingListChangeLineItemQuantityAction buildUnchecked() {
        return new MyShoppingListChangeLineItemQuantityActionImpl(lineItemId, lineItemKey, quantity);
    }

    /**
     * factory method for an instance of MyShoppingListChangeLineItemQuantityActionBuilder
     * @return builder
     */
    public static MyShoppingListChangeLineItemQuantityActionBuilder of() {
        return new MyShoppingListChangeLineItemQuantityActionBuilder();
    }

    /**
     * create builder for MyShoppingListChangeLineItemQuantityAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static MyShoppingListChangeLineItemQuantityActionBuilder of(
            final MyShoppingListChangeLineItemQuantityAction template) {
        MyShoppingListChangeLineItemQuantityActionBuilder builder = new MyShoppingListChangeLineItemQuantityActionBuilder();
        builder.lineItemId = template.getLineItemId();
        builder.lineItemKey = template.getLineItemKey();
        builder.quantity = template.getQuantity();
        return builder;
    }

}
