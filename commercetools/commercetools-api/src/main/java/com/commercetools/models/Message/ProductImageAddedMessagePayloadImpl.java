package com.commercetools.models.message;

import com.commercetools.models.common.Image;
import com.commercetools.models.message.MessagePayload;
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
public final class ProductImageAddedMessagePayloadImpl implements ProductImageAddedMessagePayload {

   private String type;
   
   private com.commercetools.models.common.Image image;
   
   private Boolean staged;
   
   private Long variantId;

   @JsonCreator
   ProductImageAddedMessagePayloadImpl(@JsonProperty("image") final com.commercetools.models.common.Image image, @JsonProperty("staged") final Boolean staged, @JsonProperty("variantId") final Long variantId) {
      this.image = image;
      this.staged = staged;
      this.variantId = variantId;
      this.type = "ProductImageAdded";
   }
   public ProductImageAddedMessagePayloadImpl() {
      
   }
   
   
   public String getType(){
      return this.type;
   }
   
   
   public com.commercetools.models.common.Image getImage(){
      return this.image;
   }
   
   
   public Boolean getStaged(){
      return this.staged;
   }
   
   
   public Long getVariantId(){
      return this.variantId;
   }

   public void setImage(final com.commercetools.models.common.Image image){
      this.image = image;
   }
   
   public void setStaged(final Boolean staged){
      this.staged = staged;
   }
   
   public void setVariantId(final Long variantId){
      this.variantId = variantId;
   }

}