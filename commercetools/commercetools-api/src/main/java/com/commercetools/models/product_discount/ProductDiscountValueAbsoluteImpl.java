package com.commercetools.models.product_discount;

import com.commercetools.models.common.TypedMoney;
import com.commercetools.models.product_discount.ProductDiscountValue;
import javax.annotation.Generated;
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
public final class ProductDiscountValueAbsoluteImpl implements ProductDiscountValueAbsolute {

   private String type;
   
   private java.util.List<com.commercetools.models.common.TypedMoney> money;

   @JsonCreator
   ProductDiscountValueAbsoluteImpl(@JsonProperty("money") final java.util.List<com.commercetools.models.common.TypedMoney> money) {
      this.money = money;
      this.type = "absolute";
   }
   public ProductDiscountValueAbsoluteImpl() {
      
   }
   
   
   public String getType(){
      return this.type;
   }
   
   
   public java.util.List<com.commercetools.models.common.TypedMoney> getMoney(){
      return this.money;
   }

   public void setMoney(final java.util.List<com.commercetools.models.common.TypedMoney> money){
      this.money = money;
   }

}