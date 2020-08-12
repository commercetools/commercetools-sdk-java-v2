package com.commercetools.api.models.product;

import com.commercetools.api.models.product.ProductUpdateAction;
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
public final class ProductSetAssetCustomFieldActionImpl implements ProductSetAssetCustomFieldAction {

   private String action;
   
   private Long variantId;
   
   private String sku;
   
   private Boolean staged;
   
   private String assetId;
   
   private String assetKey;
   
   private String name;
   
   private com.fasterxml.jackson.databind.JsonNode value;

   @JsonCreator
   ProductSetAssetCustomFieldActionImpl(@JsonProperty("variantId") final Long variantId, @JsonProperty("sku") final String sku, @JsonProperty("staged") final Boolean staged, @JsonProperty("assetId") final String assetId, @JsonProperty("assetKey") final String assetKey, @JsonProperty("name") final String name, @JsonProperty("value") final com.fasterxml.jackson.databind.JsonNode value) {
      this.variantId = variantId;
      this.sku = sku;
      this.staged = staged;
      this.assetId = assetId;
      this.assetKey = assetKey;
      this.name = name;
      this.value = value;
      this.action = "setAssetCustomField";
   }
   public ProductSetAssetCustomFieldActionImpl() {
      
   }
   
   
   public String getAction(){
      return this.action;
   }
   
   
   public Long getVariantId(){
      return this.variantId;
   }
   
   
   public String getSku(){
      return this.sku;
   }
   
   
   public Boolean getStaged(){
      return this.staged;
   }
   
   
   public String getAssetId(){
      return this.assetId;
   }
   
   
   public String getAssetKey(){
      return this.assetKey;
   }
   
   
   public String getName(){
      return this.name;
   }
   
   
   public com.fasterxml.jackson.databind.JsonNode getValue(){
      return this.value;
   }

   public void setVariantId(final Long variantId){
      this.variantId = variantId;
   }
   
   public void setSku(final String sku){
      this.sku = sku;
   }
   
   public void setStaged(final Boolean staged){
      this.staged = staged;
   }
   
   public void setAssetId(final String assetId){
      this.assetId = assetId;
   }
   
   public void setAssetKey(final String assetKey){
      this.assetKey = assetKey;
   }
   
   public void setName(final String name){
      this.name = name;
   }
   
   public void setValue(final com.fasterxml.jackson.databind.JsonNode value){
      this.value = value;
   }

}
