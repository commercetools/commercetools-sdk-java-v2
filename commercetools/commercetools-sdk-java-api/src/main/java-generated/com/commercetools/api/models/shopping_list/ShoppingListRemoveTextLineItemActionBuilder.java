
package com.commercetools.api.models.shopping_list;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ShoppingListRemoveTextLineItemActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ShoppingListRemoveTextLineItemAction shoppingListRemoveTextLineItemAction = ShoppingListRemoveTextLineItemAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ShoppingListRemoveTextLineItemActionBuilder implements Builder<ShoppingListRemoveTextLineItemAction> {

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

    public ShoppingListRemoveTextLineItemActionBuilder textLineItemId(@Nullable final String textLineItemId) {
        this.textLineItemId = textLineItemId;
        return this;
    }

    /**
     *  <p>The <code>key</code> of the <a href="https://docs.commercetools.com/apis/ctp:api:type:TextLineItem" rel="nofollow">TextLineItem</a> to update. Either <code>lineItemId</code> or <code>lineItemKey</code> is required.</p>
     * @param textLineItemKey value to be set
     * @return Builder
     */

    public ShoppingListRemoveTextLineItemActionBuilder textLineItemKey(@Nullable final String textLineItemKey) {
        this.textLineItemKey = textLineItemKey;
        return this;
    }

    /**
     *  <p>Amount to remove from the <code>quantity</code> of the TextLineItem. If not set, the TextLineItem is removed from the ShoppingList. If this value matches or exceeds the current <code>quantity</code> of the TextLineItem, the TextLineItem is removed from the ShoppingList.</p>
     * @param quantity value to be set
     * @return Builder
     */

    public ShoppingListRemoveTextLineItemActionBuilder quantity(@Nullable final Long quantity) {
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
     * builds ShoppingListRemoveTextLineItemAction with checking for non-null required values
     * @return ShoppingListRemoveTextLineItemAction
     */
    public ShoppingListRemoveTextLineItemAction build() {
        return new ShoppingListRemoveTextLineItemActionImpl(textLineItemId, textLineItemKey, quantity);
    }

    /**
     * builds ShoppingListRemoveTextLineItemAction without checking for non-null required values
     * @return ShoppingListRemoveTextLineItemAction
     */
    public ShoppingListRemoveTextLineItemAction buildUnchecked() {
        return new ShoppingListRemoveTextLineItemActionImpl(textLineItemId, textLineItemKey, quantity);
    }

    /**
     * factory method for an instance of ShoppingListRemoveTextLineItemActionBuilder
     * @return builder
     */
    public static ShoppingListRemoveTextLineItemActionBuilder of() {
        return new ShoppingListRemoveTextLineItemActionBuilder();
    }

    /**
     * create builder for ShoppingListRemoveTextLineItemAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ShoppingListRemoveTextLineItemActionBuilder of(final ShoppingListRemoveTextLineItemAction template) {
        ShoppingListRemoveTextLineItemActionBuilder builder = new ShoppingListRemoveTextLineItemActionBuilder();
        builder.textLineItemId = template.getTextLineItemId();
        builder.textLineItemKey = template.getTextLineItemKey();
        builder.quantity = template.getQuantity();
        return builder;
    }

}
