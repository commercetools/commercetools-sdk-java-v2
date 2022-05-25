
package com.commercetools.api.models.cart_discount;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * CartDiscountCustomLineItemsTargetBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CartDiscountCustomLineItemsTarget cartDiscountCustomLineItemsTarget = CartDiscountCustomLineItemsTarget.builder()
 *             .predicate("{predicate}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class CartDiscountCustomLineItemsTargetBuilder implements Builder<CartDiscountCustomLineItemsTarget> {

    private String predicate;

    /**
     <*  <p>Valid CustomLineItem target predicate.</p>>
     */

    public CartDiscountCustomLineItemsTargetBuilder predicate(final String predicate) {
        this.predicate = predicate;
        return this;
    }

    public String getPredicate() {
        return this.predicate;
    }

    public CartDiscountCustomLineItemsTarget build() {
        Objects.requireNonNull(predicate, CartDiscountCustomLineItemsTarget.class + ": predicate is missing");
        return new CartDiscountCustomLineItemsTargetImpl(predicate);
    }

    /**
     * builds CartDiscountCustomLineItemsTarget without checking for non null required values
     */
    public CartDiscountCustomLineItemsTarget buildUnchecked() {
        return new CartDiscountCustomLineItemsTargetImpl(predicate);
    }

    public static CartDiscountCustomLineItemsTargetBuilder of() {
        return new CartDiscountCustomLineItemsTargetBuilder();
    }

    public static CartDiscountCustomLineItemsTargetBuilder of(final CartDiscountCustomLineItemsTarget template) {
        CartDiscountCustomLineItemsTargetBuilder builder = new CartDiscountCustomLineItemsTargetBuilder();
        builder.predicate = template.getPredicate();
        return builder;
    }

}
