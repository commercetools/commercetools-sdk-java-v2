package com.commercetools.models.product;

import com.commercetools.models.product.ProductUpdateAction;
import com.commercetools.models.type.FieldContainer;
import com.commercetools.models.type.TypeResourceIdentifier;
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
public final class ProductSetProductPriceCustomTypeActionImpl implements ProductSetProductPriceCustomTypeAction {

   private java.lang.String action;
   
   private java.lang.Boolean staged;
   
   private com.commercetools.models.type.FieldContainer fields;
   
   private com.commercetools.models.type.TypeResourceIdentifier type;
   
   private java.lang.String priceId;

   @JsonCreator
   ProductSetProductPriceCustomTypeActionImpl(@JsonProperty("staged") final java.lang.Boolean staged, @JsonProperty("fields") final com.commercetools.models.type.FieldContainer fields, @JsonProperty("type") final com.commercetools.models.type.TypeResourceIdentifier type, @JsonProperty("priceId") final java.lang.String priceId) {
      this.staged = staged;
      this.fields = fields;
      this.type = type;
      this.priceId = priceId;
      this.action = "setProductPriceCustomType";
   }
   public ProductSetProductPriceCustomTypeActionImpl() {
      
   }
   
   
   public java.lang.String getAction(){
      return this.action;
   }
   
   
   public java.lang.Boolean getStaged(){
      return this.staged;
   }
   
   
   public com.commercetools.models.type.FieldContainer getFields(){
      return this.fields;
   }
   
   
   public com.commercetools.models.type.TypeResourceIdentifier getType(){
      return this.type;
   }
   
   
   public java.lang.String getPriceId(){
      return this.priceId;
   }

   public void setStaged(final java.lang.Boolean staged){
      this.staged = staged;
   }
   
   public void setFields(final com.commercetools.models.type.FieldContainer fields){
      this.fields = fields;
   }
   
   public void setType(final com.commercetools.models.type.TypeResourceIdentifier type){
      this.type = type;
   }
   
   public void setPriceId(final java.lang.String priceId){
      this.priceId = priceId;
   }

}