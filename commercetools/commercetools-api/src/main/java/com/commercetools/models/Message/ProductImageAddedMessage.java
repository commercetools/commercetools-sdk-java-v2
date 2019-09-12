package com.commercetools.models.Message;

import com.commercetools.models.Common.Image;
import com.commercetools.models.Message.Message;
import java.lang.Boolean;
import java.lang.Long;
import com.commercetools.models.Message.ProductImageAddedMessageImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import javax.annotation.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Map;
import java.time.*;

import java.io.IOException;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
@JsonDeserialize(as = ProductImageAddedMessageImpl.class)
public interface ProductImageAddedMessage extends Message {

   
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
   
   public static ProductImageAddedMessageImpl of(){
      return new ProductImageAddedMessageImpl();
   }
   

   public static ProductImageAddedMessageImpl of(final ProductImageAddedMessage template) {
      ProductImageAddedMessageImpl instance = new ProductImageAddedMessageImpl();
      instance.setCreatedAt(template.getCreatedAt());
      instance.setLastModifiedAt(template.getLastModifiedAt());
      instance.setId(template.getId());
      instance.setVersion(template.getVersion());
      instance.setSequenceNumber(template.getSequenceNumber());
      instance.setResource(template.getResource());
      instance.setResourceUserProvidedIdentifiers(template.getResourceUserProvidedIdentifiers());
      instance.setResourceVersion(template.getResourceVersion());
      instance.setType(template.getType());
      instance.setImage(template.getImage());
      instance.setStaged(template.getStaged());
      instance.setVariantId(template.getVariantId());
      return instance;
   }

}