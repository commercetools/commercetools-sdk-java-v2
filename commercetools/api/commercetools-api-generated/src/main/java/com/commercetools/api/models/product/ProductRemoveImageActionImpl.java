package com.commercetools.api.models.product;

import com.commercetools.api.models.product.ProductUpdateAction;
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
public final class ProductRemoveImageActionImpl implements ProductRemoveImageAction {

   private String action;
   
   private Long variantId;
   
   private String sku;
   
   private String imageUrl;
   
   private Boolean staged;

   @JsonCreator
   ProductRemoveImageActionImpl(@JsonProperty("variantId") final Long variantId, @JsonProperty("sku") final String sku, @JsonProperty("imageUrl") final String imageUrl, @JsonProperty("staged") final Boolean staged) {
      this.variantId = variantId;
      this.sku = sku;
      this.imageUrl = imageUrl;
      this.staged = staged;
      this.action = "removeImage";
   }
   public ProductRemoveImageActionImpl() {
      
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
   
   /**
   *  <p>The URL of the image.</p>
   */
   public String getImageUrl(){
      return this.imageUrl;
   }
   
   
   public Boolean getStaged(){
      return this.staged;
   }

   public void setVariantId(final Long variantId){
      this.variantId = variantId;
   }
   
   public void setSku(final String sku){
      this.sku = sku;
   }
   
   public void setImageUrl(final String imageUrl){
      this.imageUrl = imageUrl;
   }
   
   public void setStaged(final Boolean staged){
      this.staged = staged;
   }

}
