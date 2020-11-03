package com.commercetools.api.models.cart_discount;

import com.commercetools.api.models.cart_discount.CartDiscountTarget;
import com.commercetools.api.models.cart_discount.CartDiscountCustomLineItemsTargetImpl;

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
@JsonDeserialize(as = CartDiscountCustomLineItemsTargetImpl.class)
public interface CartDiscountCustomLineItemsTarget extends CartDiscountTarget {

    
    @NotNull
    @JsonProperty("predicate")
    public String getPredicate();

    public void setPredicate(final String predicate);

    public static CartDiscountCustomLineItemsTargetImpl of(){
        return new CartDiscountCustomLineItemsTargetImpl();
    }
    

    public static CartDiscountCustomLineItemsTargetImpl of(final CartDiscountCustomLineItemsTarget template) {
        CartDiscountCustomLineItemsTargetImpl instance = new CartDiscountCustomLineItemsTargetImpl();
        instance.setPredicate(template.getPredicate());
        return instance;
    }

    default <T> T withCartDiscountCustomLineItemsTarget(Function<CartDiscountCustomLineItemsTarget, T> helper) {
        return helper.apply(this);
    }
}
