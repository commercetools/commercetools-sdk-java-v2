package com.commercetools.models.Message;

import com.commercetools.models.Common.Image;
import com.commercetools.models.Message.MessagePayload;
import java.lang.Boolean;
import java.lang.Long;
import java.lang.String;
import com.commercetools.models.Message.ProductImageAddedMessagePayloadImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import javax.annotation.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Map;
import java.time.*;

import json.CommercetoolsJsonUtils;
import java.io.IOException;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
@JsonDeserialize(as = ProductImageAddedMessagePayloadImpl.class)
public interface ProductImageAddedMessagePayload extends MessagePayload {

   
   @NotNull
   @JsonProperty("variantId")
   public Long getVariantId();
   
   @NotNull
   @Valid
   @JsonProperty("image")
   public Image getImage();
   
   @NotNull
   @JsonProperty("staged")
   public Boolean getStaged();

   public void setVariantId(final Long variantId);
   
   public void setImage(final Image image);
   
   public void setStaged(final Boolean staged);
   
   public static ProductImageAddedMessagePayloadImpl of(){
      return new ProductImageAddedMessagePayloadImpl();
   }
   

   public static ProductImageAddedMessagePayloadImpl of(final ProductImageAddedMessagePayload template) {
      ProductImageAddedMessagePayloadImpl instance = new ProductImageAddedMessagePayloadImpl();
      instance.setImage(template.getImage());
      instance.setStaged(template.getStaged());
      instance.setVariantId(template.getVariantId());
      return instance;
   }

}