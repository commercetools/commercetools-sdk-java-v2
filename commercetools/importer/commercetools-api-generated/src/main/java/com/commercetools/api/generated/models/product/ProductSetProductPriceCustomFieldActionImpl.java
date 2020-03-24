package com.commercetools.api.generated.models.product;

import com.commercetools.api.generated.models.product.ProductUpdateAction;
import com.fasterxml.jackson.databind.JsonNode;
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
public final class ProductSetProductPriceCustomFieldActionImpl implements ProductSetProductPriceCustomFieldAction {

   private String action;
   
   private String name;
   
   private Boolean staged;
   
   private String priceId;
   
   private com.fasterxml.jackson.databind.JsonNode value;

   @JsonCreator
   ProductSetProductPriceCustomFieldActionImpl(@JsonProperty("name") final String name, @JsonProperty("staged") final Boolean staged, @JsonProperty("priceId") final String priceId, @JsonProperty("value") final com.fasterxml.jackson.databind.JsonNode value) {
      this.name = name;
      this.staged = staged;
      this.priceId = priceId;
      this.value = value;
      this.action = "setProductPriceCustomField";
   }
   public ProductSetProductPriceCustomFieldActionImpl() {
      
   }
   
   
   public String getAction(){
      return this.action;
   }
   
   
   public String getName(){
      return this.name;
   }
   
   
   public Boolean getStaged(){
      return this.staged;
   }
   
   
   public String getPriceId(){
      return this.priceId;
   }
   
   
   public com.fasterxml.jackson.databind.JsonNode getValue(){
      return this.value;
   }

   public void setName(final String name){
      this.name = name;
   }
   
   public void setStaged(final Boolean staged){
      this.staged = staged;
   }
   
   public void setPriceId(final String priceId){
      this.priceId = priceId;
   }
   
   public void setValue(final com.fasterxml.jackson.databind.JsonNode value){
      this.value = value;
   }

}