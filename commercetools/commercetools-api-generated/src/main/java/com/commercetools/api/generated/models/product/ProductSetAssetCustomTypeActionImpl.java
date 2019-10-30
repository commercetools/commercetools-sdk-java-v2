package com.commercetools.api.generated.models.product;

import com.commercetools.api.generated.models.product.ProductUpdateAction;
import com.commercetools.api.generated.models.type.TypeResourceIdentifier;
import io.vrap.rmf.base.client.utils.Generated;
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
public final class ProductSetAssetCustomTypeActionImpl implements ProductSetAssetCustomTypeAction {

   private String action;
   
   private String assetId;
   
   private Boolean staged;
   
   private Long variantId;
   
   private Object fields;
   
   private com.commercetools.api.generated.models.type.TypeResourceIdentifier type;
   
   private String sku;
   
   private String assetKey;

   @JsonCreator
   ProductSetAssetCustomTypeActionImpl(@JsonProperty("assetId") final String assetId, @JsonProperty("staged") final Boolean staged, @JsonProperty("variantId") final Long variantId, @JsonProperty("fields") final Object fields, @JsonProperty("type") final com.commercetools.api.generated.models.type.TypeResourceIdentifier type, @JsonProperty("sku") final String sku, @JsonProperty("assetKey") final String assetKey) {
      this.assetId = assetId;
      this.staged = staged;
      this.variantId = variantId;
      this.fields = fields;
      this.type = type;
      this.sku = sku;
      this.assetKey = assetKey;
      this.action = "setAssetCustomType";
   }
   public ProductSetAssetCustomTypeActionImpl() {
      
   }
   
   
   public String getAction(){
      return this.action;
   }
   
   
   public String getAssetId(){
      return this.assetId;
   }
   
   
   public Boolean getStaged(){
      return this.staged;
   }
   
   
   public Long getVariantId(){
      return this.variantId;
   }
   
   
   public Object getFields(){
      return this.fields;
   }
   
   
   public com.commercetools.api.generated.models.type.TypeResourceIdentifier getType(){
      return this.type;
   }
   
   
   public String getSku(){
      return this.sku;
   }
   
   
   public String getAssetKey(){
      return this.assetKey;
   }

   public void setAssetId(final String assetId){
      this.assetId = assetId;
   }
   
   public void setStaged(final Boolean staged){
      this.staged = staged;
   }
   
   public void setVariantId(final Long variantId){
      this.variantId = variantId;
   }
   
   public void setFields(final Object fields){
      this.fields = fields;
   }
   
   public void setType(final com.commercetools.api.generated.models.type.TypeResourceIdentifier type){
      this.type = type;
   }
   
   public void setSku(final String sku){
      this.sku = sku;
   }
   
   public void setAssetKey(final String assetKey){
      this.assetKey = assetKey;
   }

}