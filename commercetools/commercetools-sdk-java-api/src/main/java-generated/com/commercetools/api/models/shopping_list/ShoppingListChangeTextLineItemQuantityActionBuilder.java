
package com.commercetools.api.models.shopping_list;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ShoppingListChangeTextLineItemQuantityActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ShoppingListChangeTextLineItemQuantityAction shoppingListChangeTextLineItemQuantityAction = ShoppingListChangeTextLineItemQuantityAction.builder()
 *             .quantity(0.3)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ShoppingListChangeTextLineItemQuantityActionBuilder
        implements Builder<ShoppingListChangeTextLineItemQuantityAction> {

    @Nullable
    private String textLineItemId;

    @Nullable
    private String textLineItemKey;

    private Long quantity;

    /**
     *  <p>The <code>id</code> of the TextLineItem to update. Either <code>lineItemId</code> or <code>lineItemKey</code> is required.</p>
     * @param textLineItemId value to be set
     * @return Builder
     */

    public ShoppingListChangeTextLineItemQuantityActionBuilder textLineItemId(@Nullable final String textLineItemId) {
        this.textLineItemId = textLineItemId;
        return this;
    }

    /**
     *  <p>The <code>key</code> of the TextLineItem to update. Either <code>lineItemId</code> or <code>lineItemKey</code> is required.</p>
     * @param textLineItemKey value to be set
     * @return Builder
     */

    public ShoppingListChangeTextLineItemQuantityActionBuilder textLineItemKey(@Nullable final String textLineItemKey) {
        this.textLineItemKey = textLineItemKey;
        return this;
    }

    /**
     *  <p>New value to set. If <code>0</code>, the TextLineItem is removed from the ShoppingList.</p>
     * @param quantity value to be set
     * @return Builder
     */

    public ShoppingListChangeTextLineItemQuantityActionBuilder quantity(final Long quantity) {
        this.quantity = quantity;
        return this;
    }

    /**
     *  <p>The <code>id</code> of the TextLineItem to update. Either <code>lineItemId</code> or <code>lineItemKey</code> is required.</p>
     * @return textLineItemId
     */

    @Nullable
    public String getTextLineItemId() {
        return this.textLineItemId;
    }

    /**
     *  <p>The <code>key</code> of the TextLineItem to update. Either <code>lineItemId</code> or <code>lineItemKey</code> is required.</p>
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
     * builds ShoppingListChangeTextLineItemQuantityAction with checking for non-null required values
     * @return ShoppingListChangeTextLineItemQuantityAction
     */
    public ShoppingListChangeTextLineItemQuantityAction build() {
        Objects.requireNonNull(quantity, ShoppingListChangeTextLineItemQuantityAction.class + ": quantity is missing");
        return new ShoppingListChangeTextLineItemQuantityActionImpl(textLineItemId, textLineItemKey, quantity);
    }

    /**
     * builds ShoppingListChangeTextLineItemQuantityAction without checking for non-null required values
     * @return ShoppingListChangeTextLineItemQuantityAction
     */
    public ShoppingListChangeTextLineItemQuantityAction buildUnchecked() {
        return new ShoppingListChangeTextLineItemQuantityActionImpl(textLineItemId, textLineItemKey, quantity);
    }

    /**
     * factory method for an instance of ShoppingListChangeTextLineItemQuantityActionBuilder
     * @return builder
     */
    public static ShoppingListChangeTextLineItemQuantityActionBuilder of() {
        return new ShoppingListChangeTextLineItemQuantityActionBuilder();
    }

    /**
     * create builder for ShoppingListChangeTextLineItemQuantityAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ShoppingListChangeTextLineItemQuantityActionBuilder of(
            final ShoppingListChangeTextLineItemQuantityAction template) {
        ShoppingListChangeTextLineItemQuantityActionBuilder builder = new ShoppingListChangeTextLineItemQuantityActionBuilder();
        builder.textLineItemId = template.getTextLineItemId();
        builder.textLineItemKey = template.getTextLineItemKey();
        builder.quantity = template.getQuantity();
        return builder;
    }

}
