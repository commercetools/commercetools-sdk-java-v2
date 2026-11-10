
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
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class MyShoppingListRemoveLineItemActionBuilder implements Builder<MyShoppingListRemoveLineItemAction> {

    @Nullable
    private String lineItemId;

    @Nullable
    private String lineItemKey;

    @Nullable
    private Long quantity;

    /**
     *  <p>The <code>id</code> of the <a href="https://docs.commercetools.com/apis/ctp:api:type:ShoppingListLineItem" rel="nofollow">ShoppingListLineItem</a> to update. Either <code>lineItemId</code> or <code>lineItemKey</code> is required.</p>
     * @param lineItemId value to be set
     * @return Builder
     */

    public MyShoppingListRemoveLineItemActionBuilder lineItemId(@Nullable final String lineItemId) {
        this.lineItemId = lineItemId;
        return this;
    }

    /**
     *  <p>The <code>key</code> of the <a href="https://docs.commercetools.com/apis/ctp:api:type:ShoppingListLineItem" rel="nofollow">ShoppingListLineItem</a> to update. Either <code>lineItemId</code> or <code>lineItemKey</code> is required.</p>
     * @param lineItemKey value to be set
     * @return Builder
     */

    public MyShoppingListRemoveLineItemActionBuilder lineItemKey(@Nullable final String lineItemKey) {
        this.lineItemKey = lineItemKey;
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
     *  <p>The <code>id</code> of the <a href="https://docs.commercetools.com/apis/ctp:api:type:ShoppingListLineItem" rel="nofollow">ShoppingListLineItem</a> to update. Either <code>lineItemId</code> or <code>lineItemKey</code> is required.</p>
     * @return lineItemId
     */

    @Nullable
    public String getLineItemId() {
        return this.lineItemId;
    }

    /**
     *  <p>The <code>key</code> of the <a href="https://docs.commercetools.com/apis/ctp:api:type:ShoppingListLineItem" rel="nofollow">ShoppingListLineItem</a> to update. Either <code>lineItemId</code> or <code>lineItemKey</code> is required.</p>
     * @return lineItemKey
     */

    @Nullable
    public String getLineItemKey() {
        return this.lineItemKey;
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
        return new MyShoppingListRemoveLineItemActionImpl(lineItemId, lineItemKey, quantity);
    }

    /**
     * builds MyShoppingListRemoveLineItemAction without checking for non-null required values
     * @return MyShoppingListRemoveLineItemAction
     */
    public MyShoppingListRemoveLineItemAction buildUnchecked() {
        return new MyShoppingListRemoveLineItemActionImpl(lineItemId, lineItemKey, quantity);
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
        builder.lineItemKey = template.getLineItemKey();
        builder.quantity = template.getQuantity();
        return builder;
    }

}
