package com.commercetools.models.product;

import com.commercetools.models.product.ProductUpdateAction;
import java.lang.Boolean;
import java.lang.Object;
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
public final class ProductSetProductPriceCustomFieldActionImpl implements ProductSetProductPriceCustomFieldAction {

   private java.lang.String action;
   
   private java.lang.String name;
   
   private java.lang.Boolean staged;
   
   private java.lang.String priceId;
   
   private java.lang.Object value;

   @JsonCreator
   ProductSetProductPriceCustomFieldActionImpl(@JsonProperty("name") final java.lang.String name, @JsonProperty("staged") final java.lang.Boolean staged, @JsonProperty("priceId") final java.lang.String priceId, @JsonProperty("value") final java.lang.Object value) {
      this.name = name;
      this.staged = staged;
      this.priceId = priceId;
      this.value = value;
      this.action = "setProductPriceCustomField";
   }
   public ProductSetProductPriceCustomFieldActionImpl() {
      
   }
   
   
   public java.lang.String getAction(){
      return this.action;
   }
   
   
   public java.lang.String getName(){
      return this.name;
   }
   
   
   public java.lang.Boolean getStaged(){
      return this.staged;
   }
   
   
   public java.lang.String getPriceId(){
      return this.priceId;
   }
   
   
   public java.lang.Object getValue(){
      return this.value;
   }

   public void setName(final java.lang.String name){
      this.name = name;
   }
   
   public void setStaged(final java.lang.Boolean staged){
      this.staged = staged;
   }
   
   public void setPriceId(final java.lang.String priceId){
      this.priceId = priceId;
   }
   
   public void setValue(final java.lang.Object value){
      this.value = value;
   }

}