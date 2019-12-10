package com.commercetools.api.generated.models.cart_discount;

import com.commercetools.api.generated.models.cart_discount.CartDiscountCustomLineItemsTarget;
import com.commercetools.api.generated.models.cart_discount.CartDiscountLineItemsTarget;
import com.commercetools.api.generated.models.cart_discount.CartDiscountShippingCostTarget;
import com.commercetools.api.generated.models.cart_discount.MultiBuyCustomLineItemsTarget;
import com.commercetools.api.generated.models.cart_discount.MultiBuyLineItemsTarget;
import io.vrap.rmf.base.client.utils.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;


@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class CartDiscountTargetImpl implements CartDiscountTarget {

   private String type;

   @JsonCreator
   CartDiscountTargetImpl() {
      this.type = "null";
   }
   
   
   
   public String getType(){
      return this.type;
   }


}