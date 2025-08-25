
package com.commercetools.api.models.me;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * MyCartChangeLineItemsOrderActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     MyCartChangeLineItemsOrderAction myCartChangeLineItemsOrderAction = MyCartChangeLineItemsOrderAction.builder()
 *             .plusLineItemOrder(lineItemOrderBuilder -> lineItemOrderBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class MyCartChangeLineItemsOrderActionBuilder implements Builder<MyCartChangeLineItemsOrderAction> {

    private java.util.List<String> lineItemOrder;

    /**
     *  <p>All existing <a href="https://docs.commercetools.com/apis/ctp:api:type:LineItem" rel="nofollow">LineItem</a> <code>id</code>s of the <a href="https://docs.commercetools.com/apis/ctp:api:type:Cart" rel="nofollow">Cart</a> in the desired new order.</p>
     * @param lineItemOrder value to be set
     * @return Builder
     */

    public MyCartChangeLineItemsOrderActionBuilder lineItemOrder(final String... lineItemOrder) {
        this.lineItemOrder = new ArrayList<>(Arrays.asList(lineItemOrder));
        return this;
    }

    /**
     *  <p>All existing <a href="https://docs.commercetools.com/apis/ctp:api:type:LineItem" rel="nofollow">LineItem</a> <code>id</code>s of the <a href="https://docs.commercetools.com/apis/ctp:api:type:Cart" rel="nofollow">Cart</a> in the desired new order.</p>
     * @param lineItemOrder value to be set
     * @return Builder
     */

    public MyCartChangeLineItemsOrderActionBuilder lineItemOrder(final java.util.List<String> lineItemOrder) {
        this.lineItemOrder = lineItemOrder;
        return this;
    }

    /**
     *  <p>All existing <a href="https://docs.commercetools.com/apis/ctp:api:type:LineItem" rel="nofollow">LineItem</a> <code>id</code>s of the <a href="https://docs.commercetools.com/apis/ctp:api:type:Cart" rel="nofollow">Cart</a> in the desired new order.</p>
     * @param lineItemOrder value to be set
     * @return Builder
     */

    public MyCartChangeLineItemsOrderActionBuilder plusLineItemOrder(final String... lineItemOrder) {
        if (this.lineItemOrder == null) {
            this.lineItemOrder = new ArrayList<>();
        }
        this.lineItemOrder.addAll(Arrays.asList(lineItemOrder));
        return this;
    }

    /**
     *  <p>All existing <a href="https://docs.commercetools.com/apis/ctp:api:type:LineItem" rel="nofollow">LineItem</a> <code>id</code>s of the <a href="https://docs.commercetools.com/apis/ctp:api:type:Cart" rel="nofollow">Cart</a> in the desired new order.</p>
     * @return lineItemOrder
     */

    public java.util.List<String> getLineItemOrder() {
        return this.lineItemOrder;
    }

    /**
     * builds MyCartChangeLineItemsOrderAction with checking for non-null required values
     * @return MyCartChangeLineItemsOrderAction
     */
    public MyCartChangeLineItemsOrderAction build() {
        Objects.requireNonNull(lineItemOrder, MyCartChangeLineItemsOrderAction.class + ": lineItemOrder is missing");
        return new MyCartChangeLineItemsOrderActionImpl(lineItemOrder);
    }

    /**
     * builds MyCartChangeLineItemsOrderAction without checking for non-null required values
     * @return MyCartChangeLineItemsOrderAction
     */
    public MyCartChangeLineItemsOrderAction buildUnchecked() {
        return new MyCartChangeLineItemsOrderActionImpl(lineItemOrder);
    }

    /**
     * factory method for an instance of MyCartChangeLineItemsOrderActionBuilder
     * @return builder
     */
    public static MyCartChangeLineItemsOrderActionBuilder of() {
        return new MyCartChangeLineItemsOrderActionBuilder();
    }

    /**
     * create builder for MyCartChangeLineItemsOrderAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static MyCartChangeLineItemsOrderActionBuilder of(final MyCartChangeLineItemsOrderAction template) {
        MyCartChangeLineItemsOrderActionBuilder builder = new MyCartChangeLineItemsOrderActionBuilder();
        builder.lineItemOrder = template.getLineItemOrder();
        return builder;
    }

}
