package com.commercetools.models.ProductDiscount;

import com.commercetools.models.ProductDiscount.ProductDiscountUpdateAction;
import java.lang.String;
import com.commercetools.models.ProductDiscount.ProductDiscountSetKeyActionImpl;

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

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
@JsonDeserialize(as = ProductDiscountSetKeyActionImpl.class)
public interface ProductDiscountSetKeyAction extends ProductDiscountUpdateAction {

   
   
   @JsonProperty("key")
   public String getKey();

   public void setKey(final String key);
   
   public static ProductDiscountSetKeyActionImpl of(){
      return new ProductDiscountSetKeyActionImpl();
   }
   

   public static ProductDiscountSetKeyActionImpl of(final ProductDiscountSetKeyAction template) {
      ProductDiscountSetKeyActionImpl instance = new ProductDiscountSetKeyActionImpl();
      instance.setKey(template.getKey());
      return instance;
   }

}