package com.commercetools.api.generated.models.message;

import com.commercetools.api.generated.models.message.MessagePayload;
import com.commercetools.api.generated.models.product.ProductVariant;
import com.commercetools.api.generated.models.message.ProductVariantDeletedMessagePayloadImpl;

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
@JsonDeserialize(as = ProductVariantDeletedMessagePayloadImpl.class)
public interface ProductVariantDeletedMessagePayload extends MessagePayload {

   
   @NotNull
   @JsonProperty("removedImageUrls")
   public List<Object> getRemovedImageUrls();
   
   @NotNull
   @Valid
   @JsonProperty("variant")
   public ProductVariant getVariant();

   public void setRemovedImageUrls(final List<Object> removedImageUrls);
   
   public void setVariant(final ProductVariant variant);
   
   public static ProductVariantDeletedMessagePayloadImpl of(){
      return new ProductVariantDeletedMessagePayloadImpl();
   }
   

   public static ProductVariantDeletedMessagePayloadImpl of(final ProductVariantDeletedMessagePayload template) {
      ProductVariantDeletedMessagePayloadImpl instance = new ProductVariantDeletedMessagePayloadImpl();
      instance.setRemovedImageUrls(template.getRemovedImageUrls());
      instance.setVariant(template.getVariant());
      return instance;
   }

}