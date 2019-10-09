package com.commercetools.models.me;

import com.commercetools.models.discount_code.DiscountCodeReference;
import com.commercetools.models.me.MyCartUpdateAction;
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
public final class MyCartRemoveDiscountCodeActionImpl implements MyCartRemoveDiscountCodeAction {

   private String action;
   
   private com.commercetools.models.discount_code.DiscountCodeReference discountCode;

   @JsonCreator
   MyCartRemoveDiscountCodeActionImpl(@JsonProperty("discountCode") final com.commercetools.models.discount_code.DiscountCodeReference discountCode) {
      this.discountCode = discountCode;
      this.action = "removeDiscountCode";
   }
   public MyCartRemoveDiscountCodeActionImpl() {
      
   }
   
   
   public String getAction(){
      return this.action;
   }
   
   
   public com.commercetools.models.discount_code.DiscountCodeReference getDiscountCode(){
      return this.discountCode;
   }

   public void setDiscountCode(final com.commercetools.models.discount_code.DiscountCodeReference discountCode){
      this.discountCode = discountCode;
   }

}