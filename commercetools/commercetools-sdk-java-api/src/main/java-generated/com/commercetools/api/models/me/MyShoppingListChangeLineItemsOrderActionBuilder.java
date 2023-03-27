
package com.commercetools.api.models.me;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * MyShoppingListChangeLineItemsOrderActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     MyShoppingListChangeLineItemsOrderAction myShoppingListChangeLineItemsOrderAction = MyShoppingListChangeLineItemsOrderAction.builder()
 *             .plusLineItemOrder(lineItemOrderBuilder -> lineItemOrderBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class MyShoppingListChangeLineItemsOrderActionBuilder
        implements Builder<MyShoppingListChangeLineItemsOrderAction> {

    private java.util.List<String> lineItemOrder;

    /**
     *  <p>All existing ShoppingListLineItem <code>id</code>s of the ShoppingList in the desired new order.</p>
     * @param lineItemOrder value to be set
     * @return Builder
     */

    public MyShoppingListChangeLineItemsOrderActionBuilder lineItemOrder(final String... lineItemOrder) {
        this.lineItemOrder = new ArrayList<>(Arrays.asList(lineItemOrder));
        return this;
    }

    /**
     *  <p>All existing ShoppingListLineItem <code>id</code>s of the ShoppingList in the desired new order.</p>
     * @param lineItemOrder value to be set
     * @return Builder
     */

    public MyShoppingListChangeLineItemsOrderActionBuilder lineItemOrder(final java.util.List<String> lineItemOrder) {
        this.lineItemOrder = lineItemOrder;
        return this;
    }

    /**
     *  <p>All existing ShoppingListLineItem <code>id</code>s of the ShoppingList in the desired new order.</p>
     * @param lineItemOrder value to be set
     * @return Builder
     */

    public MyShoppingListChangeLineItemsOrderActionBuilder plusLineItemOrder(final String... lineItemOrder) {
        if (this.lineItemOrder == null) {
            this.lineItemOrder = new ArrayList<>();
        }
        this.lineItemOrder.addAll(Arrays.asList(lineItemOrder));
        return this;
    }

    /**
     *  <p>All existing ShoppingListLineItem <code>id</code>s of the ShoppingList in the desired new order.</p>
     * @return lineItemOrder
     */

    public java.util.List<String> getLineItemOrder() {
        return this.lineItemOrder;
    }

    /**
     * builds MyShoppingListChangeLineItemsOrderAction with checking for non-null required values
     * @return MyShoppingListChangeLineItemsOrderAction
     */
    public MyShoppingListChangeLineItemsOrderAction build() {
        Objects.requireNonNull(lineItemOrder,
            MyShoppingListChangeLineItemsOrderAction.class + ": lineItemOrder is missing");
        return new MyShoppingListChangeLineItemsOrderActionImpl(lineItemOrder);
    }

    /**
     * builds MyShoppingListChangeLineItemsOrderAction without checking for non-null required values
     * @return MyShoppingListChangeLineItemsOrderAction
     */
    public MyShoppingListChangeLineItemsOrderAction buildUnchecked() {
        return new MyShoppingListChangeLineItemsOrderActionImpl(lineItemOrder);
    }

    /**
     * factory method for an instance of MyShoppingListChangeLineItemsOrderActionBuilder
     * @return builder
     */
    public static MyShoppingListChangeLineItemsOrderActionBuilder of() {
        return new MyShoppingListChangeLineItemsOrderActionBuilder();
    }

    /**
     * create builder for MyShoppingListChangeLineItemsOrderAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static MyShoppingListChangeLineItemsOrderActionBuilder of(
            final MyShoppingListChangeLineItemsOrderAction template) {
        MyShoppingListChangeLineItemsOrderActionBuilder builder = new MyShoppingListChangeLineItemsOrderActionBuilder();
        builder.lineItemOrder = template.getLineItemOrder();
        return builder;
    }

}
