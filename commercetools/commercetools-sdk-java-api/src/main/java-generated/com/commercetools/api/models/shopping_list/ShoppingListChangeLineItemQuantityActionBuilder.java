
package com.commercetools.api.models.shopping_list;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ShoppingListChangeLineItemQuantityActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ShoppingListChangeLineItemQuantityAction shoppingListChangeLineItemQuantityAction = ShoppingListChangeLineItemQuantityAction.builder()
 *             .quantity(0.3)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ShoppingListChangeLineItemQuantityActionBuilder
        implements Builder<ShoppingListChangeLineItemQuantityAction> {

    @Nullable
    private String lineItemId;

    @Nullable
    private String lineItemKey;

    private Long quantity;

    /**
     *  <p>The <code>id</code> of the <a href="https://docs.commercetools.com/apis/ctp:api:type:ShoppingListLineItem" rel="nofollow">ShoppingListLineItem</a> to update. Either <code>lineItemId</code> or <code>lineItemKey</code> is required.</p>
     * @param lineItemId value to be set
     * @return Builder
     */

    public ShoppingListChangeLineItemQuantityActionBuilder lineItemId(@Nullable final String lineItemId) {
        this.lineItemId = lineItemId;
        return this;
    }

    /**
     *  <p>The <code>key</code> of the <a href="https://docs.commercetools.com/apis/ctp:api:type:ShoppingListLineItem" rel="nofollow">ShoppingListLineItem</a> to update. Either <code>lineItemId</code> or <code>lineItemKey</code> is required.</p>
     * @param lineItemKey value to be set
     * @return Builder
     */

    public ShoppingListChangeLineItemQuantityActionBuilder lineItemKey(@Nullable final String lineItemKey) {
        this.lineItemKey = lineItemKey;
        return this;
    }

    /**
     *  <p>New value to set. If <code>0</code>, the ShoppingListLineItem is removed from the ShoppingList.</p>
     * @param quantity value to be set
     * @return Builder
     */

    public ShoppingListChangeLineItemQuantityActionBuilder quantity(final Long quantity) {
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
     *  <p>New value to set. If <code>0</code>, the ShoppingListLineItem is removed from the ShoppingList.</p>
     * @return quantity
     */

    public Long getQuantity() {
        return this.quantity;
    }

    /**
     * builds ShoppingListChangeLineItemQuantityAction with checking for non-null required values
     * @return ShoppingListChangeLineItemQuantityAction
     */
    public ShoppingListChangeLineItemQuantityAction build() {
        Objects.requireNonNull(quantity, ShoppingListChangeLineItemQuantityAction.class + ": quantity is missing");
        return new ShoppingListChangeLineItemQuantityActionImpl(lineItemId, lineItemKey, quantity);
    }

    /**
     * builds ShoppingListChangeLineItemQuantityAction without checking for non-null required values
     * @return ShoppingListChangeLineItemQuantityAction
     */
    public ShoppingListChangeLineItemQuantityAction buildUnchecked() {
        return new ShoppingListChangeLineItemQuantityActionImpl(lineItemId, lineItemKey, quantity);
    }

    /**
     * factory method for an instance of ShoppingListChangeLineItemQuantityActionBuilder
     * @return builder
     */
    public static ShoppingListChangeLineItemQuantityActionBuilder of() {
        return new ShoppingListChangeLineItemQuantityActionBuilder();
    }

    /**
     * create builder for ShoppingListChangeLineItemQuantityAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ShoppingListChangeLineItemQuantityActionBuilder of(
            final ShoppingListChangeLineItemQuantityAction template) {
        ShoppingListChangeLineItemQuantityActionBuilder builder = new ShoppingListChangeLineItemQuantityActionBuilder();
        builder.lineItemId = template.getLineItemId();
        builder.lineItemKey = template.getLineItemKey();
        builder.quantity = template.getQuantity();
        return builder;
    }

}
