
package com.commercetools.api.models.cart;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * CartChangeCustomLineItemPriceModeActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CartChangeCustomLineItemPriceModeAction cartChangeCustomLineItemPriceModeAction = CartChangeCustomLineItemPriceModeAction.builder()
 *             .customLineItemId("{customLineItemId}")
 *             .mode(CustomLineItemPriceMode.STANDARD)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class CartChangeCustomLineItemPriceModeActionBuilder
        implements Builder<CartChangeCustomLineItemPriceModeAction> {

    private String customLineItemId;

    private com.commercetools.api.models.cart.CustomLineItemPriceMode mode;

    /**
     *  <p><code>id</code> of the CustomLineItem to update.</p>
     */

    public CartChangeCustomLineItemPriceModeActionBuilder customLineItemId(final String customLineItemId) {
        this.customLineItemId = customLineItemId;
        return this;
    }

    /**
     *  <p>New value to set. Must not be empty.</p>
     */

    public CartChangeCustomLineItemPriceModeActionBuilder mode(
            final com.commercetools.api.models.cart.CustomLineItemPriceMode mode) {
        this.mode = mode;
        return this;
    }

    public String getCustomLineItemId() {
        return this.customLineItemId;
    }

    public com.commercetools.api.models.cart.CustomLineItemPriceMode getMode() {
        return this.mode;
    }

    public CartChangeCustomLineItemPriceModeAction build() {
        Objects.requireNonNull(customLineItemId,
            CartChangeCustomLineItemPriceModeAction.class + ": customLineItemId is missing");
        Objects.requireNonNull(mode, CartChangeCustomLineItemPriceModeAction.class + ": mode is missing");
        return new CartChangeCustomLineItemPriceModeActionImpl(customLineItemId, mode);
    }

    /**
     * builds CartChangeCustomLineItemPriceModeAction without checking for non null required values
     */
    public CartChangeCustomLineItemPriceModeAction buildUnchecked() {
        return new CartChangeCustomLineItemPriceModeActionImpl(customLineItemId, mode);
    }

    public static CartChangeCustomLineItemPriceModeActionBuilder of() {
        return new CartChangeCustomLineItemPriceModeActionBuilder();
    }

    public static CartChangeCustomLineItemPriceModeActionBuilder of(
            final CartChangeCustomLineItemPriceModeAction template) {
        CartChangeCustomLineItemPriceModeActionBuilder builder = new CartChangeCustomLineItemPriceModeActionBuilder();
        builder.customLineItemId = template.getCustomLineItemId();
        builder.mode = template.getMode();
        return builder;
    }

}
