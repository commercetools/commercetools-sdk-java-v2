package com.commercetools.models.message;

import com.commercetools.models.message.Message;
import com.commercetools.models.product.ProductProjection;
import java.lang.String;
import com.commercetools.models.message.ProductDeletedMessageImpl;

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
@JsonDeserialize(as = ProductDeletedMessageImpl.class)
public interface ProductDeletedMessage extends Message {

   
   @NotNull
   @JsonProperty("removedImageUrls")
   public List<String> getRemovedImageUrls();
   
   @NotNull
   @Valid
   @JsonProperty("currentProjection")
   public ProductProjection getCurrentProjection();

   public void setRemovedImageUrls(final List<String> removedImageUrls);
   
   public void setCurrentProjection(final ProductProjection currentProjection);
   
   public static ProductDeletedMessageImpl of(){
      return new ProductDeletedMessageImpl();
   }
   

   public static ProductDeletedMessageImpl of(final ProductDeletedMessage template) {
      ProductDeletedMessageImpl instance = new ProductDeletedMessageImpl();
      instance.setCreatedAt(template.getCreatedAt());
      instance.setLastModifiedAt(template.getLastModifiedAt());
      instance.setId(template.getId());
      instance.setVersion(template.getVersion());
      instance.setSequenceNumber(template.getSequenceNumber());
      instance.setResource(template.getResource());
      instance.setResourceUserProvidedIdentifiers(template.getResourceUserProvidedIdentifiers());
      instance.setResourceVersion(template.getResourceVersion());
      instance.setType(template.getType());
      instance.setRemovedImageUrls(template.getRemovedImageUrls());
      instance.setCurrentProjection(template.getCurrentProjection());
      return instance;
   }

}