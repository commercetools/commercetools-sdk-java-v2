
package com.commercetools.api.models.cart_discount;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * CartDiscountTotalPriceTargetBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CartDiscountTotalPriceTarget cartDiscountTotalPriceTarget = CartDiscountTotalPriceTarget.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class CartDiscountTotalPriceTargetBuilder implements Builder<CartDiscountTotalPriceTarget> {

    /**
     * builds CartDiscountTotalPriceTarget with checking for non-null required values
     * @return CartDiscountTotalPriceTarget
     */
    public CartDiscountTotalPriceTarget build() {
        return new CartDiscountTotalPriceTargetImpl();
    }

    /**
     * builds CartDiscountTotalPriceTarget without checking for non-null required values
     * @return CartDiscountTotalPriceTarget
     */
    public CartDiscountTotalPriceTarget buildUnchecked() {
        return new CartDiscountTotalPriceTargetImpl();
    }

    /**
     * factory method for an instance of CartDiscountTotalPriceTargetBuilder
     * @return builder
     */
    public static CartDiscountTotalPriceTargetBuilder of() {
        return new CartDiscountTotalPriceTargetBuilder();
    }

    /**
     * create builder for CartDiscountTotalPriceTarget instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CartDiscountTotalPriceTargetBuilder of(final CartDiscountTotalPriceTarget template) {
        CartDiscountTotalPriceTargetBuilder builder = new CartDiscountTotalPriceTargetBuilder();
        return builder;
    }

}
