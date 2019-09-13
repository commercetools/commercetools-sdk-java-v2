package com.commercetools.models.product_discount;

import com.commercetools.models.product_discount.ProductDiscountUpdateAction;
import java.lang.Boolean;
import java.lang.String;
import com.commercetools.models.product_discount.ProductDiscountChangeIsActiveActionImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import javax.annotation.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Map;
import java.time.*;

import java.io.IOException;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
@JsonDeserialize(as = ProductDiscountChangeIsActiveActionImpl.class)
public interface ProductDiscountChangeIsActiveAction extends ProductDiscountUpdateAction {

   
   @NotNull
   @JsonProperty("isActive")
   public Boolean getIsActive();

   public void setIsActive(final Boolean isActive);
   
   public static ProductDiscountChangeIsActiveActionImpl of(){
      return new ProductDiscountChangeIsActiveActionImpl();
   }
   

   public static ProductDiscountChangeIsActiveActionImpl of(final ProductDiscountChangeIsActiveAction template) {
      ProductDiscountChangeIsActiveActionImpl instance = new ProductDiscountChangeIsActiveActionImpl();
      instance.setIsActive(template.getIsActive());
      return instance;
   }

}