
package com.commercetools.api.models.shopping_list;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ShoppingListChangeTextLineItemsOrderActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ShoppingListChangeTextLineItemsOrderAction shoppingListChangeTextLineItemsOrderAction = ShoppingListChangeTextLineItemsOrderAction.builder()
 *             .plusTextLineItemOrder(textLineItemOrderBuilder -> textLineItemOrderBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ShoppingListChangeTextLineItemsOrderActionBuilder
        implements Builder<ShoppingListChangeTextLineItemsOrderAction> {

    private java.util.List<String> textLineItemOrder;

    /**
     *  <p>Must contain all existing TextLineItem <code>id</code>s in the desired new order.</p>
     * @param textLineItemOrder value to be set
     * @return Builder
     */

    public ShoppingListChangeTextLineItemsOrderActionBuilder textLineItemOrder(final String... textLineItemOrder) {
        this.textLineItemOrder = new ArrayList<>(Arrays.asList(textLineItemOrder));
        return this;
    }

    /**
     *  <p>Must contain all existing TextLineItem <code>id</code>s in the desired new order.</p>
     * @param textLineItemOrder value to be set
     * @return Builder
     */

    public ShoppingListChangeTextLineItemsOrderActionBuilder textLineItemOrder(
            final java.util.List<String> textLineItemOrder) {
        this.textLineItemOrder = textLineItemOrder;
        return this;
    }

    /**
     *  <p>Must contain all existing TextLineItem <code>id</code>s in the desired new order.</p>
     * @param textLineItemOrder value to be set
     * @return Builder
     */

    public ShoppingListChangeTextLineItemsOrderActionBuilder plusTextLineItemOrder(final String... textLineItemOrder) {
        if (this.textLineItemOrder == null) {
            this.textLineItemOrder = new ArrayList<>();
        }
        this.textLineItemOrder.addAll(Arrays.asList(textLineItemOrder));
        return this;
    }

    /**
     *  <p>Must contain all existing TextLineItem <code>id</code>s in the desired new order.</p>
     * @return textLineItemOrder
     */

    public java.util.List<String> getTextLineItemOrder() {
        return this.textLineItemOrder;
    }

    /**
     * builds ShoppingListChangeTextLineItemsOrderAction with checking for non-null required values
     * @return ShoppingListChangeTextLineItemsOrderAction
     */
    public ShoppingListChangeTextLineItemsOrderAction build() {
        Objects.requireNonNull(textLineItemOrder,
            ShoppingListChangeTextLineItemsOrderAction.class + ": textLineItemOrder is missing");
        return new ShoppingListChangeTextLineItemsOrderActionImpl(textLineItemOrder);
    }

    /**
     * builds ShoppingListChangeTextLineItemsOrderAction without checking for non-null required values
     * @return ShoppingListChangeTextLineItemsOrderAction
     */
    public ShoppingListChangeTextLineItemsOrderAction buildUnchecked() {
        return new ShoppingListChangeTextLineItemsOrderActionImpl(textLineItemOrder);
    }

    /**
     * factory method for an instance of ShoppingListChangeTextLineItemsOrderActionBuilder
     * @return builder
     */
    public static ShoppingListChangeTextLineItemsOrderActionBuilder of() {
        return new ShoppingListChangeTextLineItemsOrderActionBuilder();
    }

    /**
     * create builder for ShoppingListChangeTextLineItemsOrderAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ShoppingListChangeTextLineItemsOrderActionBuilder of(
            final ShoppingListChangeTextLineItemsOrderAction template) {
        ShoppingListChangeTextLineItemsOrderActionBuilder builder = new ShoppingListChangeTextLineItemsOrderActionBuilder();
        builder.textLineItemOrder = template.getTextLineItemOrder();
        return builder;
    }

}
