package com.commercetools.models.product;

import com.commercetools.models.product.ProductUpdateAction;
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
public final class ProductSetImageLabelActionImpl implements ProductSetImageLabelAction {

   private String action;
   
   private String imageUrl;
   
   private Boolean staged;
   
   private String label;
   
   private Long variantId;
   
   private String sku;

   @JsonCreator
   ProductSetImageLabelActionImpl(@JsonProperty("imageUrl") final String imageUrl, @JsonProperty("staged") final Boolean staged, @JsonProperty("label") final String label, @JsonProperty("variantId") final Long variantId, @JsonProperty("sku") final String sku) {
      this.imageUrl = imageUrl;
      this.staged = staged;
      this.label = label;
      this.variantId = variantId;
      this.sku = sku;
      this.action = "setImageLabel";
   }
   public ProductSetImageLabelActionImpl() {
      
   }
   
   
   public String getAction(){
      return this.action;
   }
   
   
   public String getImageUrl(){
      return this.imageUrl;
   }
   
   
   public Boolean getStaged(){
      return this.staged;
   }
   
   
   public String getLabel(){
      return this.label;
   }
   
   
   public Long getVariantId(){
      return this.variantId;
   }
   
   
   public String getSku(){
      return this.sku;
   }

   public void setImageUrl(final String imageUrl){
      this.imageUrl = imageUrl;
   }
   
   public void setStaged(final Boolean staged){
      this.staged = staged;
   }
   
   public void setLabel(final String label){
      this.label = label;
   }
   
   public void setVariantId(final Long variantId){
      this.variantId = variantId;
   }
   
   public void setSku(final String sku){
      this.sku = sku;
   }

}