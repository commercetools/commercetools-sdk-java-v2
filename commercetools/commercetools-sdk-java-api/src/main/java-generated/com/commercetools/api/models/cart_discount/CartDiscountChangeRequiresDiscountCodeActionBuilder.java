
package com.commercetools.api.models.cart_discount;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * CartDiscountChangeRequiresDiscountCodeActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CartDiscountChangeRequiresDiscountCodeAction cartDiscountChangeRequiresDiscountCodeAction = CartDiscountChangeRequiresDiscountCodeAction.builder()
 *             .requiresDiscountCode(true)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class CartDiscountChangeRequiresDiscountCodeActionBuilder
        implements Builder<CartDiscountChangeRequiresDiscountCodeAction> {

    private Boolean requiresDiscountCode;

    /**
     *  <p>New value to set. If set to <code>true</code>, the Discount can only be used in connection with a DiscountCode.</p>
     * @param requiresDiscountCode value to be set
     * @return Builder
     */

    public CartDiscountChangeRequiresDiscountCodeActionBuilder requiresDiscountCode(
            final Boolean requiresDiscountCode) {
        this.requiresDiscountCode = requiresDiscountCode;
        return this;
    }

    public Boolean getRequiresDiscountCode() {
        return this.requiresDiscountCode;
    }

    /**
     * builds CartDiscountChangeRequiresDiscountCodeAction with checking for non-null required values
     * @return CartDiscountChangeRequiresDiscountCodeAction
     */
    public CartDiscountChangeRequiresDiscountCodeAction build() {
        Objects.requireNonNull(requiresDiscountCode,
            CartDiscountChangeRequiresDiscountCodeAction.class + ": requiresDiscountCode is missing");
        return new CartDiscountChangeRequiresDiscountCodeActionImpl(requiresDiscountCode);
    }

    /**
     * builds CartDiscountChangeRequiresDiscountCodeAction without checking for non-null required values
     * @return CartDiscountChangeRequiresDiscountCodeAction
     */
    public CartDiscountChangeRequiresDiscountCodeAction buildUnchecked() {
        return new CartDiscountChangeRequiresDiscountCodeActionImpl(requiresDiscountCode);
    }

    public static CartDiscountChangeRequiresDiscountCodeActionBuilder of() {
        return new CartDiscountChangeRequiresDiscountCodeActionBuilder();
    }

    public static CartDiscountChangeRequiresDiscountCodeActionBuilder of(
            final CartDiscountChangeRequiresDiscountCodeAction template) {
        CartDiscountChangeRequiresDiscountCodeActionBuilder builder = new CartDiscountChangeRequiresDiscountCodeActionBuilder();
        builder.requiresDiscountCode = template.getRequiresDiscountCode();
        return builder;
    }

}
