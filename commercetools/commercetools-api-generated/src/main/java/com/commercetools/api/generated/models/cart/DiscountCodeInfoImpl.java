package com.commercetools.api.generated.models.cart;

import com.commercetools.api.generated.models.cart.DiscountCodeState;
import com.commercetools.api.generated.models.discount_code.DiscountCodeReference;
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
public final class DiscountCodeInfoImpl implements DiscountCodeInfo {

   private com.commercetools.api.generated.models.discount_code.DiscountCodeReference discountCode;
   
   private com.commercetools.api.generated.models.cart.DiscountCodeState state;

   @JsonCreator
   DiscountCodeInfoImpl(@JsonProperty("discountCode") final com.commercetools.api.generated.models.discount_code.DiscountCodeReference discountCode, @JsonProperty("state") final com.commercetools.api.generated.models.cart.DiscountCodeState state) {
      this.discountCode = discountCode;
      this.state = state;
   }
   public DiscountCodeInfoImpl() {
      
   }
   
   /**
   	
   */
   public com.commercetools.api.generated.models.discount_code.DiscountCodeReference getDiscountCode(){
      return this.discountCode;
   }
   
   /**
   	
   */
   public com.commercetools.api.generated.models.cart.DiscountCodeState getState(){
      return this.state;
   }

   public void setDiscountCode(final com.commercetools.api.generated.models.discount_code.DiscountCodeReference discountCode){
      this.discountCode = discountCode;
   }
   
   public void setState(final com.commercetools.api.generated.models.cart.DiscountCodeState state){
      this.state = state;
   }

}