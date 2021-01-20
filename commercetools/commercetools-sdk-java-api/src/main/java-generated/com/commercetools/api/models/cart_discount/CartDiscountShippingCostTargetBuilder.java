
package com.commercetools.api.models.cart_discount;

import java.time.ZonedDateTime;
import java.util.*;

import javax.annotation.Nullable;

import com.commercetools.api.models.cart_discount.CartDiscountShippingCostTarget;
import com.commercetools.api.models.cart_discount.CartDiscountTarget;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class CartDiscountShippingCostTargetBuilder {

    public CartDiscountShippingCostTarget build() {
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
