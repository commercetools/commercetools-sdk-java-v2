package com.commercetools.api.models.cart_discount;

import com.commercetools.api.models.cart_discount.CartDiscountCustomLineItemsTarget;
import com.commercetools.api.models.cart_discount.CartDiscountLineItemsTarget;
import com.commercetools.api.models.cart_discount.CartDiscountShippingCostTarget;
import com.commercetools.api.models.cart_discount.MultiBuyCustomLineItemsTarget;
import com.commercetools.api.models.cart_discount.MultiBuyLineItemsTarget;


import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import io.vrap.rmf.base.client.utils.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Map;
import java.time.*;

import java.io.IOException;

@JsonSubTypes({
   @JsonSubTypes.Type(value = com.commercetools.api.models.cart_discount.MultiBuyCustomLineItemsTargetImpl.class, name = "multiBuyCustomLineItems"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.cart_discount.MultiBuyLineItemsTargetImpl.class, name = "multiBuyLineItems"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.cart_discount.CartDiscountShippingCostTargetImpl.class, name = "shipping"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.cart_discount.CartDiscountCustomLineItemsTargetImpl.class, name = "customLineItems"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.cart_discount.CartDiscountLineItemsTargetImpl.class, name = "lineItems")
})
@JsonTypeInfo(
   use = JsonTypeInfo.Id.NAME,
   include = JsonTypeInfo.As.PROPERTY,
   property = "type",
   defaultImpl = CartDiscountTargetImpl.class
)
@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public interface CartDiscountTarget  {


   


}
