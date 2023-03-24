
package com.commercetools.api.models.cart_discount;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * CartDiscountChangeTargetActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CartDiscountChangeTargetAction cartDiscountChangeTargetAction = CartDiscountChangeTargetAction.builder()
 *             .target(targetBuilder -> targetBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class CartDiscountChangeTargetActionBuilder implements Builder<CartDiscountChangeTargetAction> {

    private com.commercetools.api.models.cart_discount.CartDiscountTarget target;

    /**
     *  <p>New value to set.</p>
     * @param target value to be set
     * @return Builder
     */

    public CartDiscountChangeTargetActionBuilder target(
            final com.commercetools.api.models.cart_discount.CartDiscountTarget target) {
        this.target = target;
        return this;
    }

    /**
     *  <p>New value to set.</p>
     * @param builder function to build the target value
     * @return Builder
     */

    public CartDiscountChangeTargetActionBuilder target(
            Function<com.commercetools.api.models.cart_discount.CartDiscountTargetBuilder, Builder<? extends com.commercetools.api.models.cart_discount.CartDiscountTarget>> builder) {
        this.target = builder.apply(com.commercetools.api.models.cart_discount.CartDiscountTargetBuilder.of()).build();
        return this;
    }

    public com.commercetools.api.models.cart_discount.CartDiscountTarget getTarget() {
        return this.target;
    }

    /**
     * builds CartDiscountChangeTargetAction with checking for non-null required values
     * @return CartDiscountChangeTargetAction
     */
    public CartDiscountChangeTargetAction build() {
        Objects.requireNonNull(target, CartDiscountChangeTargetAction.class + ": target is missing");
        return new CartDiscountChangeTargetActionImpl(target);
    }

    /**
     * builds CartDiscountChangeTargetAction without checking for non-null required values
     * @return CartDiscountChangeTargetAction
     */
    public CartDiscountChangeTargetAction buildUnchecked() {
        return new CartDiscountChangeTargetActionImpl(target);
    }

    public static CartDiscountChangeTargetActionBuilder of() {
        return new CartDiscountChangeTargetActionBuilder();
    }

    public static CartDiscountChangeTargetActionBuilder of(final CartDiscountChangeTargetAction template) {
        CartDiscountChangeTargetActionBuilder builder = new CartDiscountChangeTargetActionBuilder();
        builder.target = template.getTarget();
        return builder;
    }

}
