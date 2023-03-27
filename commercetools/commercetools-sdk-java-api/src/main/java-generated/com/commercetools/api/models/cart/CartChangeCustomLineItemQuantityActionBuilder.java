
package com.commercetools.api.models.cart;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * CartChangeCustomLineItemQuantityActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CartChangeCustomLineItemQuantityAction cartChangeCustomLineItemQuantityAction = CartChangeCustomLineItemQuantityAction.builder()
 *             .customLineItemId("{customLineItemId}")
 *             .quantity(0.3)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class CartChangeCustomLineItemQuantityActionBuilder implements Builder<CartChangeCustomLineItemQuantityAction> {

    private String customLineItemId;

    private Long quantity;

    /**
     *  <p><code>id</code> of the CustomLineItem to update.</p>
     * @param customLineItemId value to be set
     * @return Builder
     */

    public CartChangeCustomLineItemQuantityActionBuilder customLineItemId(final String customLineItemId) {
        this.customLineItemId = customLineItemId;
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
     *  <p><code>id</code> of the CustomLineItem to update.</p>
     * @return customLineItemId
     */

    public String getCustomLineItemId() {
        return this.customLineItemId;
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
        Objects.requireNonNull(customLineItemId,
            CartChangeCustomLineItemQuantityAction.class + ": customLineItemId is missing");
        Objects.requireNonNull(quantity, CartChangeCustomLineItemQuantityAction.class + ": quantity is missing");
        return new CartChangeCustomLineItemQuantityActionImpl(customLineItemId, quantity);
    }

    /**
     * builds CartChangeCustomLineItemQuantityAction without checking for non-null required values
     * @return CartChangeCustomLineItemQuantityAction
     */
    public CartChangeCustomLineItemQuantityAction buildUnchecked() {
        return new CartChangeCustomLineItemQuantityActionImpl(customLineItemId, quantity);
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
        builder.quantity = template.getQuantity();
        return builder;
    }

}
