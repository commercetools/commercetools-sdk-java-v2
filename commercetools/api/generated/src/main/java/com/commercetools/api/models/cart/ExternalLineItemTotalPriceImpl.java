package com.commercetools.api.models.cart;

import com.commercetools.api.models.common.Money;
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
public final class ExternalLineItemTotalPriceImpl implements ExternalLineItemTotalPrice {

   private com.commercetools.api.models.common.Money totalPrice;
   
   private com.commercetools.api.models.common.Money price;

   @JsonCreator
   ExternalLineItemTotalPriceImpl(@JsonProperty("totalPrice") final com.commercetools.api.models.common.Money totalPrice, @JsonProperty("price") final com.commercetools.api.models.common.Money price) {
      this.totalPrice = totalPrice;
      this.price = price;
   }
   public ExternalLineItemTotalPriceImpl() {
      
   }
   
   
   public com.commercetools.api.models.common.Money getTotalPrice(){
      return this.totalPrice;
   }
   
   
   public com.commercetools.api.models.common.Money getPrice(){
      return this.price;
   }

   public void setTotalPrice(final com.commercetools.api.models.common.Money totalPrice){
      this.totalPrice = totalPrice;
   }
   
   public void setPrice(final com.commercetools.api.models.common.Money price){
      this.price = price;
   }

}
