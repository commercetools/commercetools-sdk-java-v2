package com.commercetools.models.cart_discount;

import com.commercetools.models.cart_discount.CartDiscountCustomLineItemsTarget;
import com.commercetools.models.cart_discount.CartDiscountLineItemsTarget;
import com.commercetools.models.cart_discount.CartDiscountShippingCostTarget;
import com.commercetools.models.cart_discount.MultiBuyCustomLineItemsTarget;
import com.commercetools.models.cart_discount.MultiBuyLineItemsTarget;


import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import javax.annotation.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Map;
import java.time.*;

import java.io.IOException;

@JsonSubTypes({
   @JsonSubTypes.Type(value = com.commercetools.models.cart_discount.MultiBuyCustomLineItemsTargetImpl.class, name = "multiBuyCustomLineItems"),
   @JsonSubTypes.Type(value = com.commercetools.models.cart_discount.MultiBuyLineItemsTargetImpl.class, name = "multiBuyLineItems"),
   @JsonSubTypes.Type(value = com.commercetools.models.cart_discount.CartDiscountCustomLineItemsTargetImpl.class, name = "customLineItems"),
   @JsonSubTypes.Type(value = com.commercetools.models.cart_discount.CartDiscountLineItemsTargetImpl.class, name = "lineItems"),
   @JsonSubTypes.Type(value = com.commercetools.models.cart_discount.CartDiscountShippingCostTargetImpl.class, name = "shipping")
})
@JsonTypeInfo(
   use = JsonTypeInfo.Id.NAME,
   include = JsonTypeInfo.As.PROPERTY,
   property = "type"
)
@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public interface CartDiscountTarget  {


   


}