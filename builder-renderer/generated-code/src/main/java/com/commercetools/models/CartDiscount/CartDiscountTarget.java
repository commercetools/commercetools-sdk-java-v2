package com.commercetools.models.CartDiscount;

import com.commercetools.models.CartDiscount.CartDiscountCustomLineItemsTarget;
import com.commercetools.models.CartDiscount.CartDiscountLineItemsTarget;
import com.commercetools.models.CartDiscount.CartDiscountShippingCostTarget;
import com.commercetools.models.CartDiscount.MultiBuyCustomLineItemsTarget;
import com.commercetools.models.CartDiscount.MultiBuyLineItemsTarget;
import java.lang.String;


import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import javax.annotation.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Map;
import java.time.*;

import json.CommercetoolsJsonUtils;
import java.io.IOException;

@JsonSubTypes({
   @JsonSubTypes.Type(value = com.commercetools.models.CartDiscount.MultiBuyCustomLineItemsTargetImpl.class, name = "multiBuyCustomLineItems"),
   @JsonSubTypes.Type(value = com.commercetools.models.CartDiscount.MultiBuyLineItemsTargetImpl.class, name = "multiBuyLineItems"),
   @JsonSubTypes.Type(value = com.commercetools.models.CartDiscount.CartDiscountCustomLineItemsTargetImpl.class, name = "customLineItems"),
   @JsonSubTypes.Type(value = com.commercetools.models.CartDiscount.CartDiscountLineItemsTargetImpl.class, name = "lineItems"),
   @JsonSubTypes.Type(value = com.commercetools.models.CartDiscount.CartDiscountShippingCostTargetImpl.class, name = "shipping")
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