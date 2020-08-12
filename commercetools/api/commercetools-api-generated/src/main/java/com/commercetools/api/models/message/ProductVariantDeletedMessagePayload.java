package com.commercetools.api.models.message;

import com.commercetools.api.models.message.MessagePayload;
import com.commercetools.api.models.product.ProductVariant;
import com.commercetools.api.models.message.ProductVariantDeletedMessagePayloadImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import io.vrap.rmf.base.client.utils.Generated;
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
   @Valid
   @JsonProperty("variant")
   public ProductVariant getVariant();
   
   @NotNull
   @JsonProperty("removedImageUrls")
   public List<String> getRemovedImageUrls();

   public void setVariant(final ProductVariant variant);
   
   public void setRemovedImageUrls(final List<String> removedImageUrls);
   
   public static ProductVariantDeletedMessagePayloadImpl of(){
      return new ProductVariantDeletedMessagePayloadImpl();
   }
   

   public static ProductVariantDeletedMessagePayloadImpl of(final ProductVariantDeletedMessagePayload template) {
      ProductVariantDeletedMessagePayloadImpl instance = new ProductVariantDeletedMessagePayloadImpl();
      instance.setVariant(template.getVariant());
      instance.setRemovedImageUrls(template.getRemovedImageUrls());
      return instance;
   }

}
