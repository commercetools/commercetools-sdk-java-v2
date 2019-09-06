package com.commercetools.models.Message;

import com.commercetools.models.Message.MessagePayload;
import com.commercetools.models.Product.ProductProjection;
import java.lang.String;
import com.commercetools.models.Message.ProductDeletedMessagePayloadImpl;

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
@JsonDeserialize(as = ProductDeletedMessagePayloadImpl.class)
public interface ProductDeletedMessagePayload extends MessagePayload {

   
   @NotNull
   @JsonProperty("removedImageUrls")
   public List<String> getRemovedImageUrls();
   
   @NotNull
   @Valid
   @JsonProperty("currentProjection")
   public ProductProjection getCurrentProjection();

   public void setRemovedImageUrls(final List<String> removedImageUrls);
   
   public void setCurrentProjection(final ProductProjection currentProjection);
   
   public static ProductDeletedMessagePayloadImpl of(){
      return new ProductDeletedMessagePayloadImpl();
   }
   

   public static ProductDeletedMessagePayloadImpl of(final ProductDeletedMessagePayload template) {
      ProductDeletedMessagePayloadImpl instance = new ProductDeletedMessagePayloadImpl();
      instance.setRemovedImageUrls(template.getRemovedImageUrls());
      instance.setCurrentProjection(template.getCurrentProjection());
      return instance;
   }

}