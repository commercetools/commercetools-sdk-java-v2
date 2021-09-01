
package com.commercetools.api.models.cart_discount;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class CartDiscountShippingCostTargetBuilder implements Builder<CartDiscountShippingCostTarget> {

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
