
package com.commercetools.api.models.cart_discount;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * CartDiscountChangeCartPredicateActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CartDiscountChangeCartPredicateAction cartDiscountChangeCartPredicateAction = CartDiscountChangeCartPredicateAction.builder()
 *             .cartPredicate("{cartPredicate}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class CartDiscountChangeCartPredicateActionBuilder implements Builder<CartDiscountChangeCartPredicateAction> {

    private String cartPredicate;

    /**
     *  <p>New value to set.</p>
     * @param cartPredicate value to be set
     * @return Builder
     */

    public CartDiscountChangeCartPredicateActionBuilder cartPredicate(final String cartPredicate) {
        this.cartPredicate = cartPredicate;
        return this;
    }

    /**
     *  <p>New value to set.</p>
     * @return cartPredicate
     */

    public String getCartPredicate() {
        return this.cartPredicate;
    }

    /**
     * builds CartDiscountChangeCartPredicateAction with checking for non-null required values
     * @return CartDiscountChangeCartPredicateAction
     */
    public CartDiscountChangeCartPredicateAction build() {
        Objects.requireNonNull(cartPredicate,
            CartDiscountChangeCartPredicateAction.class + ": cartPredicate is missing");
        return new CartDiscountChangeCartPredicateActionImpl(cartPredicate);
    }

    /**
     * builds CartDiscountChangeCartPredicateAction without checking for non-null required values
     * @return CartDiscountChangeCartPredicateAction
     */
    public CartDiscountChangeCartPredicateAction buildUnchecked() {
        return new CartDiscountChangeCartPredicateActionImpl(cartPredicate);
    }

    /**
     * factory method for an instance of CartDiscountChangeCartPredicateActionBuilder
     * @return builder
     */
    public static CartDiscountChangeCartPredicateActionBuilder of() {
        return new CartDiscountChangeCartPredicateActionBuilder();
    }

    /**
     * create builder for CartDiscountChangeCartPredicateAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CartDiscountChangeCartPredicateActionBuilder of(
            final CartDiscountChangeCartPredicateAction template) {
        CartDiscountChangeCartPredicateActionBuilder builder = new CartDiscountChangeCartPredicateActionBuilder();
        builder.cartPredicate = template.getCartPredicate();
        return builder;
    }

}
