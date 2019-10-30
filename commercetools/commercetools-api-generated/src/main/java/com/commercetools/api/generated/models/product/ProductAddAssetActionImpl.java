package com.commercetools.api.generated.models.product;

import com.commercetools.api.generated.models.common.AssetDraft;
import com.commercetools.api.generated.models.product.ProductUpdateAction;
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
public final class ProductAddAssetActionImpl implements ProductAddAssetAction {

   private String action;
   
   private Integer position;
   
   private Boolean staged;
   
   private Long variantId;
   
   private com.commercetools.api.generated.models.common.AssetDraft asset;
   
   private String sku;

   @JsonCreator
   ProductAddAssetActionImpl(@JsonProperty("position") final Integer position, @JsonProperty("staged") final Boolean staged, @JsonProperty("variantId") final Long variantId, @JsonProperty("asset") final com.commercetools.api.generated.models.common.AssetDraft asset, @JsonProperty("sku") final String sku) {
      this.position = position;
      this.staged = staged;
      this.variantId = variantId;
      this.asset = asset;
      this.sku = sku;
      this.action = "addAsset";
   }
   public ProductAddAssetActionImpl() {
      
   }
   
   
   public String getAction(){
      return this.action;
   }
   
   
   public Integer getPosition(){
      return this.position;
   }
   
   
   public Boolean getStaged(){
      return this.staged;
   }
   
   
   public Long getVariantId(){
      return this.variantId;
   }
   
   
   public com.commercetools.api.generated.models.common.AssetDraft getAsset(){
      return this.asset;
   }
   
   
   public String getSku(){
      return this.sku;
   }

   public void setPosition(final Integer position){
      this.position = position;
   }
   
   public void setStaged(final Boolean staged){
      this.staged = staged;
   }
   
   public void setVariantId(final Long variantId){
      this.variantId = variantId;
   }
   
   public void setAsset(final com.commercetools.api.generated.models.common.AssetDraft asset){
      this.asset = asset;
   }
   
   public void setSku(final String sku){
      this.sku = sku;
   }

}