package com.commercetools.models.product;

import com.commercetools.models.product.ProductUpdateAction;
import java.lang.Boolean;
import java.lang.String;
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
public final class ProductRemovePriceActionImpl implements ProductRemovePriceAction {

   private java.lang.String action;
   
   private java.lang.Boolean staged;
   
   private java.lang.String priceId;

   @JsonCreator
   ProductRemovePriceActionImpl(@JsonProperty("staged") final java.lang.Boolean staged, @JsonProperty("priceId") final java.lang.String priceId) {
      this.staged = staged;
      this.priceId = priceId;
      this.action = "removePrice";
   }
   public ProductRemovePriceActionImpl() {
      
   }
   
   
   public java.lang.String getAction(){
      return this.action;
   }
   
   
   public java.lang.Boolean getStaged(){
      return this.staged;
   }
   
   
   public java.lang.String getPriceId(){
      return this.priceId;
   }

   public void setStaged(final java.lang.Boolean staged){
      this.staged = staged;
   }
   
   public void setPriceId(final java.lang.String priceId){
      this.priceId = priceId;
   }

}