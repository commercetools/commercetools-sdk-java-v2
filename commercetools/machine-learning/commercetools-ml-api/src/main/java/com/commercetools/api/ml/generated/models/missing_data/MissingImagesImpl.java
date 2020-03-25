package com.commercetools.api.ml.generated.models.missing_data;

import com.commercetools.api.ml.generated.models.common.ProductReference;
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
public final class MissingImagesImpl implements MissingImages {

   private ProductReference product;
   
   private Long variantId;
   
   private Long imageCount;

   @JsonCreator
   MissingImagesImpl(@JsonProperty("product") final ProductReference product, @JsonProperty("variantId") final Long variantId, @JsonProperty("imageCount") final Long imageCount) {
      this.product = product;
      this.variantId = variantId;
      this.imageCount = imageCount;
   }
   public MissingImagesImpl() {
      
   }
   
   
   public ProductReference getProduct(){
      return this.product;
   }
   
   /**
   *  <p>ID of the variant</p>
   */
   public Long getVariantId(){
      return this.variantId;
   }
   
   /**
   *  <p>Number of images the variant contains.</p>
   */
   public Long getImageCount(){
      return this.imageCount;
   }

   public void setProduct(final ProductReference product){
      this.product = product;
   }
   
   public void setVariantId(final Long variantId){
      this.variantId = variantId;
   }
   
   public void setImageCount(final Long imageCount){
      this.imageCount = imageCount;
   }

}
