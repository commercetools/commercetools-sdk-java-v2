package com.commercetools.models.Message;

import com.commercetools.models.Common.Image;
import com.commercetools.models.Message.MessagePayload;
import java.lang.Boolean;
import java.lang.Long;
import java.lang.String;
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

   private java.lang.String type;
   
   private com.commercetools.models.Common.Image image;
   
   private java.lang.Boolean staged;
   
   private java.lang.Long variantId;

   @JsonCreator
   ProductImageAddedMessagePayloadImpl(@JsonProperty("image") final com.commercetools.models.Common.Image image, @JsonProperty("staged") final java.lang.Boolean staged, @JsonProperty("variantId") final java.lang.Long variantId) {
      this.image = image;
      this.staged = staged;
      this.variantId = variantId;
      this.type = "ProductImageAdded";
   }
   public ProductImageAddedMessagePayloadImpl() {
      
   }
   
   
   public java.lang.String getType(){
      return this.type;
   }
   
   
   public com.commercetools.models.Common.Image getImage(){
      return this.image;
   }
   
   
   public java.lang.Boolean getStaged(){
      return this.staged;
   }
   
   
   public java.lang.Long getVariantId(){
      return this.variantId;
   }

   public void setImage(final com.commercetools.models.Common.Image image){
      this.image = image;
   }
   
   public void setStaged(final java.lang.Boolean staged){
      this.staged = staged;
   }
   
   public void setVariantId(final java.lang.Long variantId){
      this.variantId = variantId;
   }

}