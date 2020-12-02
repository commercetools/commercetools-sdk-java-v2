package com.commercetools.api.models.cart_discount;

import com.commercetools.api.models.cart_discount.CartDiscountCustomLineItemsTarget;
import com.commercetools.api.models.cart_discount.CartDiscountLineItemsTarget;
import com.commercetools.api.models.cart_discount.CartDiscountShippingCostTarget;
import com.commercetools.api.models.cart_discount.MultiBuyCustomLineItemsTarget;
import com.commercetools.api.models.cart_discount.MultiBuyLineItemsTarget;


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

@JsonSubTypes({
   @JsonSubTypes.Type(value = com.commercetools.api.models.cart_discount.CartDiscountCustomLineItemsTargetImpl.class, name = "customLineItems"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.cart_discount.CartDiscountLineItemsTargetImpl.class, name = "lineItems"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.cart_discount.CartDiscountShippingCostTargetImpl.class, name = "shipping"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.cart_discount.MultiBuyCustomLineItemsTargetImpl.class, name = "multiBuyCustomLineItems"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.cart_discount.MultiBuyLineItemsTargetImpl.class, name = "multiBuyLineItems")
})
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    include = JsonTypeInfo.As.EXISTING_PROPERTY,
    property = "type",
    defaultImpl = CartDiscountTargetImpl.class,
    visible = true
)
@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public interface CartDiscountTarget  {

    
    @NotNull
    @JsonProperty("type")
    public String getType();




    default <T> T withCartDiscountTarget(Function<CartDiscountTarget, T> helper) {
        return helper.apply(this);
    }
}
