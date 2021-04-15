package com.commercetools.api.models.cart_discount;

import com.commercetools.api.models.cart_discount.CartDiscountTarget;
import com.commercetools.api.models.cart_discount.CartDiscountShippingCostTargetImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import io.vrap.rmf.base.client.utils.Generated;
import io.vrap.rmf.base.client.Accessor;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;
import java.util.function.Function;
import java.io.IOException;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
@JsonDeserialize(as = CartDiscountShippingCostTargetImpl.class)
public interface CartDiscountShippingCostTarget extends CartDiscountTarget {

    String SHIPPING = "shipping";



    public static CartDiscountShippingCostTarget of(){
        return new CartDiscountShippingCostTargetImpl();
    }
    

    public static CartDiscountShippingCostTarget of(final CartDiscountShippingCostTarget template) {
        CartDiscountShippingCostTargetImpl instance = new CartDiscountShippingCostTargetImpl();
        return instance;
    }

    public static CartDiscountShippingCostTargetBuilder builder(){
        return CartDiscountShippingCostTargetBuilder.of();
    }
    
    public static CartDiscountShippingCostTargetBuilder builder(final CartDiscountShippingCostTarget template){
        return CartDiscountShippingCostTargetBuilder.of(template);
    }
    

    default <T> T withCartDiscountShippingCostTarget(Function<CartDiscountShippingCostTarget, T> helper) {
        return helper.apply(this);
    }
}
