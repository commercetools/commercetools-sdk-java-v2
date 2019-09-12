package com.commercetools.models.Product;

import com.commercetools.models.Product.ProductUpdateAction;
import java.lang.Boolean;
import java.lang.Long;
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
public final class ProductRemoveVariantActionImpl implements ProductRemoveVariantAction {

   private java.lang.String action;
   
   private java.lang.Boolean staged;
   
   private java.lang.Long id;
   
   private java.lang.String sku;

   @JsonCreator
   ProductRemoveVariantActionImpl(@JsonProperty("staged") final java.lang.Boolean staged, @JsonProperty("id") final java.lang.Long id, @JsonProperty("sku") final java.lang.String sku) {
      this.staged = staged;
      this.id = id;
      this.sku = sku;
      this.action = "removeVariant";
   }
   public ProductRemoveVariantActionImpl() {
      
   }
   
   
   public java.lang.String getAction(){
      return this.action;
   }
   
   
   public java.lang.Boolean getStaged(){
      return this.staged;
   }
   
   
   public java.lang.Long getId(){
      return this.id;
   }
   
   
   public java.lang.String getSku(){
      return this.sku;
   }

   public void setStaged(final java.lang.Boolean staged){
      this.staged = staged;
   }
   
   public void setId(final java.lang.Long id){
      this.id = id;
   }
   
   public void setSku(final java.lang.String sku){
      this.sku = sku;
   }

}