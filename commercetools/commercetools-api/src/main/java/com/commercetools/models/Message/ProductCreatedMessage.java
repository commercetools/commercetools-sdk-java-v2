package com.commercetools.models.Message;

import com.commercetools.models.Message.Message;
import com.commercetools.models.Product.ProductProjection;
import com.commercetools.models.Message.ProductCreatedMessageImpl;

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
@JsonDeserialize(as = ProductCreatedMessageImpl.class)
public interface ProductCreatedMessage extends Message {

   
   @NotNull
   @Valid
   @JsonProperty("productProjection")
   public ProductProjection getProductProjection();

   public void setProductProjection(final ProductProjection productProjection);
   
   public static ProductCreatedMessageImpl of(){
      return new ProductCreatedMessageImpl();
   }
   

   public static ProductCreatedMessageImpl of(final ProductCreatedMessage template) {
      ProductCreatedMessageImpl instance = new ProductCreatedMessageImpl();
      instance.setCreatedAt(template.getCreatedAt());
      instance.setLastModifiedAt(template.getLastModifiedAt());
      instance.setId(template.getId());
      instance.setVersion(template.getVersion());
      instance.setSequenceNumber(template.getSequenceNumber());
      instance.setResource(template.getResource());
      instance.setResourceUserProvidedIdentifiers(template.getResourceUserProvidedIdentifiers());
      instance.setResourceVersion(template.getResourceVersion());
      instance.setType(template.getType());
      instance.setProductProjection(template.getProductProjection());
      return instance;
   }

}