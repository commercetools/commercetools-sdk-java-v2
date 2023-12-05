
package com.commercetools.api.models.cart;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * CartChangeCustomLineItemPriceModeActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CartChangeCustomLineItemPriceModeAction cartChangeCustomLineItemPriceModeAction = CartChangeCustomLineItemPriceModeAction.builder()
 *             .mode(CustomLineItemPriceMode.STANDARD)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class CartChangeCustomLineItemPriceModeActionBuilder
        implements Builder<CartChangeCustomLineItemPriceModeAction> {

    @Nullable
    private String customLineItemId;

    @Nullable
    private String customLineItemKey;

    private com.commercetools.api.models.cart.CustomLineItemPriceMode mode;

    /**
     *  <p><code>id</code> of the CustomLineItem to update. Either <code>customLineItemId</code> or <code>customLineItemKey</code> is required.</p>
     * @param customLineItemId value to be set
     * @return Builder
     */

    public CartChangeCustomLineItemPriceModeActionBuilder customLineItemId(@Nullable final String customLineItemId) {
        this.customLineItemId = customLineItemId;
        return this;
    }

    /**
     *  <p><code>key</code> of the CustomLineItem to update. Either <code>customLineItemId</code> or <code>customLineItemKey</code> is required.</p>
     * @param customLineItemKey value to be set
     * @return Builder
     */

    public CartChangeCustomLineItemPriceModeActionBuilder customLineItemKey(@Nullable final String customLineItemKey) {
        this.customLineItemKey = customLineItemKey;
        return this;
    }

    /**
     *  <p>New value to set. Must not be empty.</p>
     * @param mode value to be set
     * @return Builder
     */

    public CartChangeCustomLineItemPriceModeActionBuilder mode(
            final com.commercetools.api.models.cart.CustomLineItemPriceMode mode) {
        this.mode = mode;
        return this;
    }

    /**
     *  <p><code>id</code> of the CustomLineItem to update. Either <code>customLineItemId</code> or <code>customLineItemKey</code> is required.</p>
     * @return customLineItemId
     */

    @Nullable
    public String getCustomLineItemId() {
        return this.customLineItemId;
    }

    /**
     *  <p><code>key</code> of the CustomLineItem to update. Either <code>customLineItemId</code> or <code>customLineItemKey</code> is required.</p>
     * @return customLineItemKey
     */

    @Nullable
    public String getCustomLineItemKey() {
        return this.customLineItemKey;
    }

    /**
     *  <p>New value to set. Must not be empty.</p>
     * @return mode
     */

    public com.commercetools.api.models.cart.CustomLineItemPriceMode getMode() {
        return this.mode;
    }

    /**
     * builds CartChangeCustomLineItemPriceModeAction with checking for non-null required values
     * @return CartChangeCustomLineItemPriceModeAction
     */
    public CartChangeCustomLineItemPriceModeAction build() {
        Objects.requireNonNull(mode, CartChangeCustomLineItemPriceModeAction.class + ": mode is missing");
        return new CartChangeCustomLineItemPriceModeActionImpl(customLineItemId, customLineItemKey, mode);
    }

    /**
     * builds CartChangeCustomLineItemPriceModeAction without checking for non-null required values
     * @return CartChangeCustomLineItemPriceModeAction
     */
    public CartChangeCustomLineItemPriceModeAction buildUnchecked() {
        return new CartChangeCustomLineItemPriceModeActionImpl(customLineItemId, customLineItemKey, mode);
    }

    /**
     * factory method for an instance of CartChangeCustomLineItemPriceModeActionBuilder
     * @return builder
     */
    public static CartChangeCustomLineItemPriceModeActionBuilder of() {
        return new CartChangeCustomLineItemPriceModeActionBuilder();
    }

    /**
     * create builder for CartChangeCustomLineItemPriceModeAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CartChangeCustomLineItemPriceModeActionBuilder of(
            final CartChangeCustomLineItemPriceModeAction template) {
        CartChangeCustomLineItemPriceModeActionBuilder builder = new CartChangeCustomLineItemPriceModeActionBuilder();
        builder.customLineItemId = template.getCustomLineItemId();
        builder.customLineItemKey = template.getCustomLineItemKey();
        builder.mode = template.getMode();
        return builder;
    }

}
