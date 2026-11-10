
package com.commercetools.api.models.cart;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * CartChangeCustomLineItemQuantityActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CartChangeCustomLineItemQuantityAction cartChangeCustomLineItemQuantityAction = CartChangeCustomLineItemQuantityAction.builder()
 *             .quantity(0.3)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class CartChangeCustomLineItemQuantityActionBuilder implements Builder<CartChangeCustomLineItemQuantityAction> {

    @Nullable
    private String customLineItemId;

    @Nullable
    private String customLineItemKey;

    private Long quantity;

    /**
     *  <p><code>id</code> of the <a href="https://docs.commercetools.com/apis/ctp:api:type:CustomLineItem" rel="nofollow">CustomLineItem</a> to update. Either <code>customLineItemId</code> or <code>customLineItemKey</code> is required.</p>
     * @param customLineItemId value to be set
     * @return Builder
     */

    public CartChangeCustomLineItemQuantityActionBuilder customLineItemId(@Nullable final String customLineItemId) {
        this.customLineItemId = customLineItemId;
        return this;
    }

    /**
     *  <p><code>key</code> of the <a href="https://docs.commercetools.com/apis/ctp:api:type:CustomLineItem" rel="nofollow">CustomLineItem</a> to update. Either <code>customLineItemId</code> or <code>customLineItemKey</code> is required.</p>
     * @param customLineItemKey value to be set
     * @return Builder
     */

    public CartChangeCustomLineItemQuantityActionBuilder customLineItemKey(@Nullable final String customLineItemKey) {
        this.customLineItemKey = customLineItemKey;
        return this;
    }

    /**
     *  <p>New value to set.</p>
     *  <p>If <code>0</code>, the Custom Line Item is removed from the Cart.</p>
     * @param quantity value to be set
     * @return Builder
     */

    public CartChangeCustomLineItemQuantityActionBuilder quantity(final Long quantity) {
        this.quantity = quantity;
        return this;
    }

    /**
     *  <p><code>id</code> of the <a href="https://docs.commercetools.com/apis/ctp:api:type:CustomLineItem" rel="nofollow">CustomLineItem</a> to update. Either <code>customLineItemId</code> or <code>customLineItemKey</code> is required.</p>
     * @return customLineItemId
     */

    @Nullable
    public String getCustomLineItemId() {
        return this.customLineItemId;
    }

    /**
     *  <p><code>key</code> of the <a href="https://docs.commercetools.com/apis/ctp:api:type:CustomLineItem" rel="nofollow">CustomLineItem</a> to update. Either <code>customLineItemId</code> or <code>customLineItemKey</code> is required.</p>
     * @return customLineItemKey
     */

    @Nullable
    public String getCustomLineItemKey() {
        return this.customLineItemKey;
    }

    /**
     *  <p>New value to set.</p>
     *  <p>If <code>0</code>, the Custom Line Item is removed from the Cart.</p>
     * @return quantity
     */

    public Long getQuantity() {
        return this.quantity;
    }

    /**
     * builds CartChangeCustomLineItemQuantityAction with checking for non-null required values
     * @return CartChangeCustomLineItemQuantityAction
     */
    public CartChangeCustomLineItemQuantityAction build() {
        Objects.requireNonNull(quantity, CartChangeCustomLineItemQuantityAction.class + ": quantity is missing");
        return new CartChangeCustomLineItemQuantityActionImpl(customLineItemId, customLineItemKey, quantity);
    }

    /**
     * builds CartChangeCustomLineItemQuantityAction without checking for non-null required values
     * @return CartChangeCustomLineItemQuantityAction
     */
    public CartChangeCustomLineItemQuantityAction buildUnchecked() {
        return new CartChangeCustomLineItemQuantityActionImpl(customLineItemId, customLineItemKey, quantity);
    }

    /**
     * factory method for an instance of CartChangeCustomLineItemQuantityActionBuilder
     * @return builder
     */
    public static CartChangeCustomLineItemQuantityActionBuilder of() {
        return new CartChangeCustomLineItemQuantityActionBuilder();
    }

    /**
     * create builder for CartChangeCustomLineItemQuantityAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CartChangeCustomLineItemQuantityActionBuilder of(
            final CartChangeCustomLineItemQuantityAction template) {
        CartChangeCustomLineItemQuantityActionBuilder builder = new CartChangeCustomLineItemQuantityActionBuilder();
        builder.customLineItemId = template.getCustomLineItemId();
        builder.customLineItemKey = template.getCustomLineItemKey();
        builder.quantity = template.getQuantity();
        return builder;
    }

}
