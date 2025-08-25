
package com.commercetools.api.models.me;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * MyShoppingListChangeTextLineItemQuantityActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     MyShoppingListChangeTextLineItemQuantityAction myShoppingListChangeTextLineItemQuantityAction = MyShoppingListChangeTextLineItemQuantityAction.builder()
 *             .quantity(0.3)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class MyShoppingListChangeTextLineItemQuantityActionBuilder
        implements Builder<MyShoppingListChangeTextLineItemQuantityAction> {

    @Nullable
    private String textLineItemId;

    @Nullable
    private String textLineItemKey;

    private Long quantity;

    /**
     *  <p>The <code>id</code> of the <a href="https://docs.commercetools.com/apis/ctp:api:type:TextLineItem" rel="nofollow">TextLineItem</a> to update. Either <code>lineItemId</code> or <code>lineItemKey</code> is required.</p>
     * @param textLineItemId value to be set
     * @return Builder
     */

    public MyShoppingListChangeTextLineItemQuantityActionBuilder textLineItemId(@Nullable final String textLineItemId) {
        this.textLineItemId = textLineItemId;
        return this;
    }

    /**
     *  <p>The <code>key</code> of the <a href="https://docs.commercetools.com/apis/ctp:api:type:TextLineItem" rel="nofollow">TextLineItem</a> to update. Either <code>lineItemId</code> or <code>lineItemKey</code> is required.</p>
     * @param textLineItemKey value to be set
     * @return Builder
     */

    public MyShoppingListChangeTextLineItemQuantityActionBuilder textLineItemKey(
            @Nullable final String textLineItemKey) {
        this.textLineItemKey = textLineItemKey;
        return this;
    }

    /**
     *  <p>New value to set. If <code>0</code>, the TextLineItem is removed from the ShoppingList.</p>
     * @param quantity value to be set
     * @return Builder
     */

    public MyShoppingListChangeTextLineItemQuantityActionBuilder quantity(final Long quantity) {
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
     *  <p>New value to set. If <code>0</code>, the TextLineItem is removed from the ShoppingList.</p>
     * @return quantity
     */

    public Long getQuantity() {
        return this.quantity;
    }

    /**
     * builds MyShoppingListChangeTextLineItemQuantityAction with checking for non-null required values
     * @return MyShoppingListChangeTextLineItemQuantityAction
     */
    public MyShoppingListChangeTextLineItemQuantityAction build() {
        Objects.requireNonNull(quantity,
            MyShoppingListChangeTextLineItemQuantityAction.class + ": quantity is missing");
        return new MyShoppingListChangeTextLineItemQuantityActionImpl(textLineItemId, textLineItemKey, quantity);
    }

    /**
     * builds MyShoppingListChangeTextLineItemQuantityAction without checking for non-null required values
     * @return MyShoppingListChangeTextLineItemQuantityAction
     */
    public MyShoppingListChangeTextLineItemQuantityAction buildUnchecked() {
        return new MyShoppingListChangeTextLineItemQuantityActionImpl(textLineItemId, textLineItemKey, quantity);
    }

    /**
     * factory method for an instance of MyShoppingListChangeTextLineItemQuantityActionBuilder
     * @return builder
     */
    public static MyShoppingListChangeTextLineItemQuantityActionBuilder of() {
        return new MyShoppingListChangeTextLineItemQuantityActionBuilder();
    }

    /**
     * create builder for MyShoppingListChangeTextLineItemQuantityAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static MyShoppingListChangeTextLineItemQuantityActionBuilder of(
            final MyShoppingListChangeTextLineItemQuantityAction template) {
        MyShoppingListChangeTextLineItemQuantityActionBuilder builder = new MyShoppingListChangeTextLineItemQuantityActionBuilder();
        builder.textLineItemId = template.getTextLineItemId();
        builder.textLineItemKey = template.getTextLineItemKey();
        builder.quantity = template.getQuantity();
        return builder;
    }

}
