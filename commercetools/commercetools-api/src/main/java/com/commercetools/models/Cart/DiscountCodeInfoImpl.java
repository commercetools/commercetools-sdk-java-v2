package com.commercetools.models.Cart;

import com.commercetools.models.Cart.DiscountCodeState;
import com.commercetools.models.DiscountCode.DiscountCodeReference;
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
public final class DiscountCodeInfoImpl implements DiscountCodeInfo {

   private com.commercetools.models.DiscountCode.DiscountCodeReference discountCode;
   
   private com.commercetools.models.Cart.DiscountCodeState state;

   @JsonCreator
   DiscountCodeInfoImpl(@JsonProperty("discountCode") final com.commercetools.models.DiscountCode.DiscountCodeReference discountCode, @JsonProperty("state") final com.commercetools.models.Cart.DiscountCodeState state) {
      this.discountCode = discountCode;
      this.state = state;
   }
   public DiscountCodeInfoImpl() {
      
   }
   
   
   public com.commercetools.models.DiscountCode.DiscountCodeReference getDiscountCode(){
      return this.discountCode;
   }
   
   
   public com.commercetools.models.Cart.DiscountCodeState getState(){
      return this.state;
   }

   public void setDiscountCode(final com.commercetools.models.DiscountCode.DiscountCodeReference discountCode){
      this.discountCode = discountCode;
   }
   
   public void setState(final com.commercetools.models.Cart.DiscountCodeState state){
      this.state = state;
   }

}