
package com.commercetools.api.models.cart;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * CartRemoveCustomLineItemActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CartRemoveCustomLineItemAction cartRemoveCustomLineItemAction = CartRemoveCustomLineItemAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class CartRemoveCustomLineItemActionBuilder implements Builder<CartRemoveCustomLineItemAction> {

    @Nullable
    private String customLineItemId;

    @Nullable
    private String customLineItemKey;

    /**
     *  <p><code>id</code> of the <a href="https://docs.commercetools.com/apis/ctp:api:type:CustomLineItem" rel="nofollow">CustomLineItem</a> to update. Either <code>customLineItemId</code> or <code>customLineItemKey</code> is required.</p>
     * @param customLineItemId value to be set
     * @return Builder
     */

    public CartRemoveCustomLineItemActionBuilder customLineItemId(@Nullable final String customLineItemId) {
        this.customLineItemId = customLineItemId;
        return this;
    }

    /**
     *  <p><code>key</code> of the <a href="https://docs.commercetools.com/apis/ctp:api:type:CustomLineItem" rel="nofollow">CustomLineItem</a> to update. Either <code>customLineItemId</code> or <code>customLineItemKey</code> is required.</p>
     * @param customLineItemKey value to be set
     * @return Builder
     */

    public CartRemoveCustomLineItemActionBuilder customLineItemKey(@Nullable final String customLineItemKey) {
        this.customLineItemKey = customLineItemKey;
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
     * builds CartRemoveCustomLineItemAction with checking for non-null required values
     * @return CartRemoveCustomLineItemAction
     */
    public CartRemoveCustomLineItemAction build() {
        return new CartRemoveCustomLineItemActionImpl(customLineItemId, customLineItemKey);
    }

    /**
     * builds CartRemoveCustomLineItemAction without checking for non-null required values
     * @return CartRemoveCustomLineItemAction
     */
    public CartRemoveCustomLineItemAction buildUnchecked() {
        return new CartRemoveCustomLineItemActionImpl(customLineItemId, customLineItemKey);
    }

    /**
     * factory method for an instance of CartRemoveCustomLineItemActionBuilder
     * @return builder
     */
    public static CartRemoveCustomLineItemActionBuilder of() {
        return new CartRemoveCustomLineItemActionBuilder();
    }

    /**
     * create builder for CartRemoveCustomLineItemAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CartRemoveCustomLineItemActionBuilder of(final CartRemoveCustomLineItemAction template) {
        CartRemoveCustomLineItemActionBuilder builder = new CartRemoveCustomLineItemActionBuilder();
        builder.customLineItemId = template.getCustomLineItemId();
        builder.customLineItemKey = template.getCustomLineItemKey();
        return builder;
    }

}
