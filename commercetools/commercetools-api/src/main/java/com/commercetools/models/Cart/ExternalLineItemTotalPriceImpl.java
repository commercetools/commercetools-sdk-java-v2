package com.commercetools.models.Cart;

import com.commercetools.models.Common.Money;
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
public final class ExternalLineItemTotalPriceImpl implements ExternalLineItemTotalPrice {

   private com.commercetools.models.Common.Money totalPrice;
   
   private com.commercetools.models.Common.Money price;

   @JsonCreator
   ExternalLineItemTotalPriceImpl(@JsonProperty("totalPrice") final com.commercetools.models.Common.Money totalPrice, @JsonProperty("price") final com.commercetools.models.Common.Money price) {
      this.totalPrice = totalPrice;
      this.price = price;
   }
   public ExternalLineItemTotalPriceImpl() {
      
   }
   
   
   public com.commercetools.models.Common.Money getTotalPrice(){
      return this.totalPrice;
   }
   
   
   public com.commercetools.models.Common.Money getPrice(){
      return this.price;
   }

   public void setTotalPrice(final com.commercetools.models.Common.Money totalPrice){
      this.totalPrice = totalPrice;
   }
   
   public void setPrice(final com.commercetools.models.Common.Money price){
      this.price = price;
   }

}