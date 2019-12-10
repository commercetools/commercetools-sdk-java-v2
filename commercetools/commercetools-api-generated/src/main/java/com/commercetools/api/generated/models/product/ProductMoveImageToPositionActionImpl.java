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
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;


@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class ProductMoveImageToPositionActionImpl implements ProductMoveImageToPositionAction {

   private String action;
   
   private String imageUrl;
   
   private Boolean staged;
   
   private Long position;
   
   private Long variantId;
   
   private String sku;

   @JsonCreator
   ProductMoveImageToPositionActionImpl(@JsonProperty("imageUrl") final String imageUrl, @JsonProperty("staged") final Boolean staged, @JsonProperty("position") final Long position, @JsonProperty("variantId") final Long variantId, @JsonProperty("sku") final String sku) {
      this.imageUrl = imageUrl;
      this.staged = staged;
      this.position = position;
      this.variantId = variantId;
      this.sku = sku;
      this.action = "moveImageToPosition";
   }
   public ProductMoveImageToPositionActionImpl() {
      
   }
   
   
   public String getAction(){
      return this.action;
   }
   
   /**
   *  <p>The URL of the image</p>
   */
   public String getImageUrl(){
      return this.imageUrl;
   }
   
   
   public Boolean getStaged(){
      return this.staged;
   }
   
   
   public Long getPosition(){
      return this.position;
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
   
   public void setPosition(final Long position){
      this.position = position;
   }
   
   public void setVariantId(final Long variantId){
      this.variantId = variantId;
   }
   
   public void setSku(final String sku){
      this.sku = sku;
   }

}