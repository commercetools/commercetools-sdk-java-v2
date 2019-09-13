package com.commercetools.models.product_discount;

import com.commercetools.models.product_discount.ProductDiscountUpdateAction;
import java.lang.Long;
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
public final class ProductDiscountUpdateImpl implements ProductDiscountUpdate {

   private java.util.List<com.commercetools.models.product_discount.ProductDiscountUpdateAction> actions;
   
   private java.lang.Long version;

   @JsonCreator
   ProductDiscountUpdateImpl(@JsonProperty("actions") final java.util.List<com.commercetools.models.product_discount.ProductDiscountUpdateAction> actions, @JsonProperty("version") final java.lang.Long version) {
      this.actions = actions;
      this.version = version;
   }
   public ProductDiscountUpdateImpl() {
      
   }
   
   
   public java.util.List<com.commercetools.models.product_discount.ProductDiscountUpdateAction> getActions(){
      return this.actions;
   }
   
   
   public java.lang.Long getVersion(){
      return this.version;
   }

   public void setActions(final java.util.List<com.commercetools.models.product_discount.ProductDiscountUpdateAction> actions){
      this.actions = actions;
   }
   
   public void setVersion(final java.lang.Long version){
      this.version = version;
   }

}