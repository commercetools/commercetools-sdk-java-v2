
package com.commercetools.api.models.cart;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * CartChangeLineItemsOrderActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CartChangeLineItemsOrderAction cartChangeLineItemsOrderAction = CartChangeLineItemsOrderAction.builder()
 *             .plusLineItemOrder(lineItemOrderBuilder -> lineItemOrderBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class CartChangeLineItemsOrderActionBuilder implements Builder<CartChangeLineItemsOrderAction> {

    private java.util.List<String> lineItemOrder;

    /**
     *  <p>All existing <a href="https://docs.commercetools.com/apis/ctp:api:type:LineItem" rel="nofollow">LineItem</a> <code>id</code>s in the desired new order.</p>
     * @param lineItemOrder value to be set
     * @return Builder
     */

    public CartChangeLineItemsOrderActionBuilder lineItemOrder(final String... lineItemOrder) {
        this.lineItemOrder = new ArrayList<>(Arrays.asList(lineItemOrder));
        return this;
    }

    /**
     *  <p>All existing <a href="https://docs.commercetools.com/apis/ctp:api:type:LineItem" rel="nofollow">LineItem</a> <code>id</code>s in the desired new order.</p>
     * @param lineItemOrder value to be set
     * @return Builder
     */

    public CartChangeLineItemsOrderActionBuilder lineItemOrder(final java.util.List<String> lineItemOrder) {
        this.lineItemOrder = lineItemOrder;
        return this;
    }

    /**
     *  <p>All existing <a href="https://docs.commercetools.com/apis/ctp:api:type:LineItem" rel="nofollow">LineItem</a> <code>id</code>s in the desired new order.</p>
     * @param lineItemOrder value to be set
     * @return Builder
     */

    public CartChangeLineItemsOrderActionBuilder plusLineItemOrder(final String... lineItemOrder) {
        if (this.lineItemOrder == null) {
            this.lineItemOrder = new ArrayList<>();
        }
        this.lineItemOrder.addAll(Arrays.asList(lineItemOrder));
        return this;
    }

    /**
     *  <p>All existing <a href="https://docs.commercetools.com/apis/ctp:api:type:LineItem" rel="nofollow">LineItem</a> <code>id</code>s in the desired new order.</p>
     * @return lineItemOrder
     */

    public java.util.List<String> getLineItemOrder() {
        return this.lineItemOrder;
    }

    /**
     * builds CartChangeLineItemsOrderAction with checking for non-null required values
     * @return CartChangeLineItemsOrderAction
     */
    public CartChangeLineItemsOrderAction build() {
        Objects.requireNonNull(lineItemOrder, CartChangeLineItemsOrderAction.class + ": lineItemOrder is missing");
        return new CartChangeLineItemsOrderActionImpl(lineItemOrder);
    }

    /**
     * builds CartChangeLineItemsOrderAction without checking for non-null required values
     * @return CartChangeLineItemsOrderAction
     */
    public CartChangeLineItemsOrderAction buildUnchecked() {
        return new CartChangeLineItemsOrderActionImpl(lineItemOrder);
    }

    /**
     * factory method for an instance of CartChangeLineItemsOrderActionBuilder
     * @return builder
     */
    public static CartChangeLineItemsOrderActionBuilder of() {
        return new CartChangeLineItemsOrderActionBuilder();
    }

    /**
     * create builder for CartChangeLineItemsOrderAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CartChangeLineItemsOrderActionBuilder of(final CartChangeLineItemsOrderAction template) {
        CartChangeLineItemsOrderActionBuilder builder = new CartChangeLineItemsOrderActionBuilder();
        builder.lineItemOrder = template.getLineItemOrder();
        return builder;
    }

}
