
package com.commercetools.api.models.cart_discount;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * CartDiscountShippingCostTargetBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CartDiscountShippingCostTarget cartDiscountShippingCostTarget = CartDiscountShippingCostTarget.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class CartDiscountShippingCostTargetBuilder implements Builder<CartDiscountShippingCostTarget> {

    public CartDiscountShippingCostTarget build() {
        return new CartDiscountShippingCostTargetImpl();
    }

    /**
     * builds CartDiscountShippingCostTarget without checking for non null required values
     */
    public CartDiscountShippingCostTarget buildUnchecked() {
        return new CartDiscountShippingCostTargetImpl();
    }

    public static CartDiscountShippingCostTargetBuilder of() {
        return new CartDiscountShippingCostTargetBuilder();
    }

    public static CartDiscountShippingCostTargetBuilder of(final CartDiscountShippingCostTarget template) {
        CartDiscountShippingCostTargetBuilder builder = new CartDiscountShippingCostTargetBuilder();
        return builder;
    }

}
