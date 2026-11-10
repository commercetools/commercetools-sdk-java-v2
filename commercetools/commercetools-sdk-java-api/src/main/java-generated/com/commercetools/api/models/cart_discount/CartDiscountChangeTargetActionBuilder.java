
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
     *  <p>For a <a href="https://docs.commercetools.com/apis/ctp:api:type:CartDiscountValueRelative" rel="nofollow">CartDiscountValueRelative</a>, if <code>applicationMode</code> is set, the target must be <a href="https://docs.commercetools.com/apis/ctp:api:type:CartDiscountPatternTarget" rel="nofollow">CartDiscountPatternTarget</a>. If <code>applicationMode</code> is <code>ProportionateDistribution</code> or <code>EvenDistribution</code>, the <a href="https://docs.commercetools.com/apis/ctp:api:type:CartDiscountPatternTarget" rel="nofollow">CartDiscountPatternTarget</a> <code>triggerPattern</code> must be non-empty. If either conditions are not met, an <a href="https://docs.commercetools.com/apis/ctp:api:type:InvalidOperationError" rel="nofollow">InvalidOperation</a> error is returned.</p>
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
     *  <p>For a <a href="https://docs.commercetools.com/apis/ctp:api:type:CartDiscountValueRelative" rel="nofollow">CartDiscountValueRelative</a>, if <code>applicationMode</code> is set, the target must be <a href="https://docs.commercetools.com/apis/ctp:api:type:CartDiscountPatternTarget" rel="nofollow">CartDiscountPatternTarget</a>. If <code>applicationMode</code> is <code>ProportionateDistribution</code> or <code>EvenDistribution</code>, the <a href="https://docs.commercetools.com/apis/ctp:api:type:CartDiscountPatternTarget" rel="nofollow">CartDiscountPatternTarget</a> <code>triggerPattern</code> must be non-empty. If either conditions are not met, an <a href="https://docs.commercetools.com/apis/ctp:api:type:InvalidOperationError" rel="nofollow">InvalidOperation</a> error is returned.</p>
     * @param builder function to build the target value
     * @return Builder
     */

    public CartDiscountChangeTargetActionBuilder target(
            Function<com.commercetools.api.models.cart_discount.CartDiscountTargetBuilder, Builder<? extends com.commercetools.api.models.cart_discount.CartDiscountTarget>> builder) {
        this.target = builder.apply(com.commercetools.api.models.cart_discount.CartDiscountTargetBuilder.of()).build();
        return this;
    }

    /**
     *  <p>New value to set.</p>
     *  <p>For a <a href="https://docs.commercetools.com/apis/ctp:api:type:CartDiscountValueRelative" rel="nofollow">CartDiscountValueRelative</a>, if <code>applicationMode</code> is set, the target must be <a href="https://docs.commercetools.com/apis/ctp:api:type:CartDiscountPatternTarget" rel="nofollow">CartDiscountPatternTarget</a>. If <code>applicationMode</code> is <code>ProportionateDistribution</code> or <code>EvenDistribution</code>, the <a href="https://docs.commercetools.com/apis/ctp:api:type:CartDiscountPatternTarget" rel="nofollow">CartDiscountPatternTarget</a> <code>triggerPattern</code> must be non-empty. If either conditions are not met, an <a href="https://docs.commercetools.com/apis/ctp:api:type:InvalidOperationError" rel="nofollow">InvalidOperation</a> error is returned.</p>
     * @return target
     */

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

    /**
     * factory method for an instance of CartDiscountChangeTargetActionBuilder
     * @return builder
     */
    public static CartDiscountChangeTargetActionBuilder of() {
        return new CartDiscountChangeTargetActionBuilder();
    }

    /**
     * create builder for CartDiscountChangeTargetAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CartDiscountChangeTargetActionBuilder of(final CartDiscountChangeTargetAction template) {
        CartDiscountChangeTargetActionBuilder builder = new CartDiscountChangeTargetActionBuilder();
        builder.target = template.getTarget();
        return builder;
    }

}
