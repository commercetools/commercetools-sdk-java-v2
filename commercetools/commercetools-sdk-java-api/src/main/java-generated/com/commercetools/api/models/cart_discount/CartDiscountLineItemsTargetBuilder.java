
package com.commercetools.api.models.cart_discount;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * CartDiscountLineItemsTargetBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CartDiscountLineItemsTarget cartDiscountLineItemsTarget = CartDiscountLineItemsTarget.builder()
 *             .predicate("{predicate}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class CartDiscountLineItemsTargetBuilder implements Builder<CartDiscountLineItemsTarget> {

    private String predicate;

    /**
     *  <p>Valid <span>LineItem target predicate</span>.</p>
     * @param predicate value to be set
     * @return Builder
     */

    public CartDiscountLineItemsTargetBuilder predicate(final String predicate) {
        this.predicate = predicate;
        return this;
    }

    /**
     *  <p>Valid <span>LineItem target predicate</span>.</p>
     * @return predicate
     */

    public String getPredicate() {
        return this.predicate;
    }

    /**
     * builds CartDiscountLineItemsTarget with checking for non-null required values
     * @return CartDiscountLineItemsTarget
     */
    public CartDiscountLineItemsTarget build() {
        Objects.requireNonNull(predicate, CartDiscountLineItemsTarget.class + ": predicate is missing");
        return new CartDiscountLineItemsTargetImpl(predicate);
    }

    /**
     * builds CartDiscountLineItemsTarget without checking for non-null required values
     * @return CartDiscountLineItemsTarget
     */
    public CartDiscountLineItemsTarget buildUnchecked() {
        return new CartDiscountLineItemsTargetImpl(predicate);
    }

    /**
     * factory method for an instance of CartDiscountLineItemsTargetBuilder
     * @return builder
     */
    public static CartDiscountLineItemsTargetBuilder of() {
        return new CartDiscountLineItemsTargetBuilder();
    }

    /**
     * create builder for CartDiscountLineItemsTarget instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CartDiscountLineItemsTargetBuilder of(final CartDiscountLineItemsTarget template) {
        CartDiscountLineItemsTargetBuilder builder = new CartDiscountLineItemsTargetBuilder();
        builder.predicate = template.getPredicate();
        return builder;
    }

}
