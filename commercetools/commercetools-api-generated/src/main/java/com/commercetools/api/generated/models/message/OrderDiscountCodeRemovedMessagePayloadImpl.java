package com.commercetools.api.generated.models.message;

import com.commercetools.api.generated.models.discount_code.DiscountCodeReference;
import com.commercetools.api.generated.models.message.MessagePayload;
import io.vrap.rmf.base.client.utils.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.annotation.*;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;


@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class OrderDiscountCodeRemovedMessagePayloadImpl implements OrderDiscountCodeRemovedMessagePayload {

   private String type;
   
   private com.commercetools.api.generated.models.discount_code.DiscountCodeReference discountCode;

   @JsonCreator
   OrderDiscountCodeRemovedMessagePayloadImpl(@JsonProperty("discountCode") final com.commercetools.api.generated.models.discount_code.DiscountCodeReference discountCode) {
      this.discountCode = discountCode;
      this.type = "OrderDiscountCodeRemoved";
   }
   public OrderDiscountCodeRemovedMessagePayloadImpl() {
      
   }
   
   
   public String getType(){
      return this.type;
   }
   
   
   public com.commercetools.api.generated.models.discount_code.DiscountCodeReference getDiscountCode(){
      return this.discountCode;
   }

   public void setDiscountCode(final com.commercetools.api.generated.models.discount_code.DiscountCodeReference discountCode){
      this.discountCode = discountCode;
   }

}