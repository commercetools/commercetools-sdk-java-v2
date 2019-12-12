package com.commercetools.api.generated.models.product;

import com.commercetools.api.generated.models.product.ProductUpdateAction;
import com.commercetools.api.generated.models.type.FieldContainer;
import com.commercetools.api.generated.models.type.TypeResourceIdentifier;
import io.vrap.rmf.base.client.utils.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.annotation.*;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;


@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class ProductSetProductPriceCustomTypeActionImpl implements ProductSetProductPriceCustomTypeAction {

   private String action;
   
   private Boolean staged;
   
   private com.commercetools.api.generated.models.type.FieldContainer fields;
   
   private com.commercetools.api.generated.models.type.TypeResourceIdentifier type;
   
   private String priceId;

   @JsonCreator
   ProductSetProductPriceCustomTypeActionImpl(@JsonProperty("staged") final Boolean staged, @JsonProperty("fields") final com.commercetools.api.generated.models.type.FieldContainer fields, @JsonProperty("type") final com.commercetools.api.generated.models.type.TypeResourceIdentifier type, @JsonProperty("priceId") final String priceId) {
      this.staged = staged;
      this.fields = fields;
      this.type = type;
      this.priceId = priceId;
      this.action = "setProductPriceCustomType";
   }
   public ProductSetProductPriceCustomTypeActionImpl() {
      
   }
   
   
   public String getAction(){
      return this.action;
   }
   
   
   public Boolean getStaged(){
      return this.staged;
   }
   
   
   public com.commercetools.api.generated.models.type.FieldContainer getFields(){
      return this.fields;
   }
   
   
   public com.commercetools.api.generated.models.type.TypeResourceIdentifier getType(){
      return this.type;
   }
   
   
   public String getPriceId(){
      return this.priceId;
   }

   public void setStaged(final Boolean staged){
      this.staged = staged;
   }
   
   public void setFields(final com.commercetools.api.generated.models.type.FieldContainer fields){
      this.fields = fields;
   }
   
   public void setType(final com.commercetools.api.generated.models.type.TypeResourceIdentifier type){
      this.type = type;
   }
   
   public void setPriceId(final String priceId){
      this.priceId = priceId;
   }

}