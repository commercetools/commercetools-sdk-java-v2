package com.commercetools.api.generated.models.product;

import com.commercetools.api.generated.models.product.ProductUpdateAction;
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
public final class ProductSetProductVariantKeyActionImpl implements ProductSetProductVariantKeyAction {

   private String action;
   
   private Boolean staged;
   
   private Long variantId;
   
   private String sku;
   
   private String key;

   @JsonCreator
   ProductSetProductVariantKeyActionImpl(@JsonProperty("staged") final Boolean staged, @JsonProperty("variantId") final Long variantId, @JsonProperty("sku") final String sku, @JsonProperty("key") final String key) {
      this.staged = staged;
      this.variantId = variantId;
      this.sku = sku;
      this.key = key;
      this.action = "setProductVariantKey";
   }
   public ProductSetProductVariantKeyActionImpl() {
      
   }
   
   
   public String getAction(){
      return this.action;
   }
   
   
   public Boolean getStaged(){
      return this.staged;
   }
   
   
   public Long getVariantId(){
      return this.variantId;
   }
   
   
   public String getSku(){
      return this.sku;
   }
   
   /**
   *  <p>If left blank or set to <code>null</code>, the key is unset/removed.</p>
   */
   public String getKey(){
      return this.key;
   }

   public void setStaged(final Boolean staged){
      this.staged = staged;
   }
   
   public void setVariantId(final Long variantId){
      this.variantId = variantId;
   }
   
   public void setSku(final String sku){
      this.sku = sku;
   }
   
   public void setKey(final String key){
      this.key = key;
   }

}