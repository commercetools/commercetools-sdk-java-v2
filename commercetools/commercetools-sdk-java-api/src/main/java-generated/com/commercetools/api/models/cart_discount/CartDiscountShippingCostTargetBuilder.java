package com.commercetools.api.models.cart_discount;

import com.commercetools.api.models.cart_discount.CartDiscountTarget;
import com.commercetools.api.models.cart_discount.CartDiscountShippingCostTarget;
import javax.annotation.Nullable;
import java.util.*;
import java.util.function.Function;
import java.time.ZonedDateTime;
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
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class CartDiscountShippingCostTargetBuilder implements Builder<CartDiscountShippingCostTarget> {




    /**
     * builds CartDiscountShippingCostTarget with checking for non-null required values
     * @return CartDiscountShippingCostTarget
     */
    public CartDiscountShippingCostTarget build() {
        return new CartDiscountShippingCostTargetImpl();
    }
    
    /**
     * builds CartDiscountShippingCostTarget without checking for non-null required values
     * @return CartDiscountShippingCostTarget
     */
    public CartDiscountShippingCostTarget buildUnchecked() {
        return new CartDiscountShippingCostTargetImpl();
    }

    /**
     * factory method for an instance of CartDiscountShippingCostTargetBuilder
     * @return builder 
     */
    public static CartDiscountShippingCostTargetBuilder of() {
        return new CartDiscountShippingCostTargetBuilder();
    }

    /**
     * create builder for CartDiscountShippingCostTarget instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CartDiscountShippingCostTargetBuilder of(final CartDiscountShippingCostTarget template) {
        CartDiscountShippingCostTargetBuilder builder = new CartDiscountShippingCostTargetBuilder();
        return builder;
    }

}
