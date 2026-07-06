
package com.commercetools.api.models.me;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * MyShoppingListRemoveTextLineItemActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     MyShoppingListRemoveTextLineItemAction myShoppingListRemoveTextLineItemAction = MyShoppingListRemoveTextLineItemAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class MyShoppingListRemoveTextLineItemActionBuilder implements Builder<MyShoppingListRemoveTextLineItemAction> {

    @Nullable
    private String textLineItemId;

    @Nullable
    private String textLineItemKey;

    @Nullable
    private Long quantity;

    /**
     *  <p>The <code>id</code> of the <a href="https://docs.commercetools.com/apis/ctp:api:type:TextLineItem" rel="nofollow">TextLineItem</a> to update. Either <code>lineItemId</code> or <code>lineItemKey</code> is required.</p>
     * @param textLineItemId value to be set
     * @return Builder
     */

    public MyShoppingListRemoveTextLineItemActionBuilder textLineItemId(@Nullable final String textLineItemId) {
        this.textLineItemId = textLineItemId;
        return this;
    }

    /**
     *  <p>The <code>key</code> of the <a href="https://docs.commercetools.com/apis/ctp:api:type:TextLineItem" rel="nofollow">TextLineItem</a> to update. Either <code>lineItemId</code> or <code>lineItemKey</code> is required.</p>
     * @param textLineItemKey value to be set
     * @return Builder
     */

    public MyShoppingListRemoveTextLineItemActionBuilder textLineItemKey(@Nullable final String textLineItemKey) {
        this.textLineItemKey = textLineItemKey;
        return this;
    }

    /**
     *  <p>Amount to remove from the <code>quantity</code> of the TextLineItem. If not set, the TextLineItem is removed from the ShoppingList. If this value matches or exceeds the current <code>quantity</code> of the TextLineItem, the TextLineItem is removed from the ShoppingList.</p>
     * @param quantity value to be set
     * @return Builder
     */

    public MyShoppingListRemoveTextLineItemActionBuilder quantity(@Nullable final Long quantity) {
        this.quantity = quantity;
        return this;
    }

    /**
     *  <p>The <code>id</code> of the <a href="https://docs.commercetools.com/apis/ctp:api:type:TextLineItem" rel="nofollow">TextLineItem</a> to update. Either <code>lineItemId</code> or <code>lineItemKey</code> is required.</p>
     * @return textLineItemId
     */

    @Nullable
    public String getTextLineItemId() {
        return this.textLineItemId;
    }

    /**
     *  <p>The <code>key</code> of the <a href="https://docs.commercetools.com/apis/ctp:api:type:TextLineItem" rel="nofollow">TextLineItem</a> to update. Either <code>lineItemId</code> or <code>lineItemKey</code> is required.</p>
     * @return textLineItemKey
     */

    @Nullable
    public String getTextLineItemKey() {
        return this.textLineItemKey;
    }

    /**
     *  <p>Amount to remove from the <code>quantity</code> of the TextLineItem. If not set, the TextLineItem is removed from the ShoppingList. If this value matches or exceeds the current <code>quantity</code> of the TextLineItem, the TextLineItem is removed from the ShoppingList.</p>
     * @return quantity
     */

    @Nullable
    public Long getQuantity() {
        return this.quantity;
    }

    /**
     * builds MyShoppingListRemoveTextLineItemAction with checking for non-null required values
     * @return MyShoppingListRemoveTextLineItemAction
     */
    public MyShoppingListRemoveTextLineItemAction build() {
        return new MyShoppingListRemoveTextLineItemActionImpl(textLineItemId, textLineItemKey, quantity);
    }

    /**
     * builds MyShoppingListRemoveTextLineItemAction without checking for non-null required values
     * @return MyShoppingListRemoveTextLineItemAction
     */
    public MyShoppingListRemoveTextLineItemAction buildUnchecked() {
        return new MyShoppingListRemoveTextLineItemActionImpl(textLineItemId, textLineItemKey, quantity);
    }

    /**
     * factory method for an instance of MyShoppingListRemoveTextLineItemActionBuilder
     * @return builder
     */
    public static MyShoppingListRemoveTextLineItemActionBuilder of() {
        return new MyShoppingListRemoveTextLineItemActionBuilder();
    }

    /**
     * create builder for MyShoppingListRemoveTextLineItemAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static MyShoppingListRemoveTextLineItemActionBuilder of(
            final MyShoppingListRemoveTextLineItemAction template) {
        MyShoppingListRemoveTextLineItemActionBuilder builder = new MyShoppingListRemoveTextLineItemActionBuilder();
        builder.textLineItemId = template.getTextLineItemId();
        builder.textLineItemKey = template.getTextLineItemKey();
        builder.quantity = template.getQuantity();
        return builder;
    }

}
