package com.commercetools.api.models.message;

import com.commercetools.api.models.message.Message;
import com.commercetools.api.models.product.ProductVariant;
import com.commercetools.api.models.message.ProductVariantDeletedMessageImpl;

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
@JsonDeserialize(as = ProductVariantDeletedMessageImpl.class)
public interface ProductVariantDeletedMessage extends Message {

   
   @NotNull
   @Valid
   @JsonProperty("variant")
   public ProductVariant getVariant();
   
   @NotNull
   @JsonProperty("removedImageUrls")
   public List<String> getRemovedImageUrls();

   public void setVariant(final ProductVariant variant);
   
   public void setRemovedImageUrls(final List<String> removedImageUrls);
   
   public static ProductVariantDeletedMessageImpl of(){
      return new ProductVariantDeletedMessageImpl();
   }
   

   public static ProductVariantDeletedMessageImpl of(final ProductVariantDeletedMessage template) {
      ProductVariantDeletedMessageImpl instance = new ProductVariantDeletedMessageImpl();
      instance.setId(template.getId());
      instance.setVersion(template.getVersion());
      instance.setCreatedAt(template.getCreatedAt());
      instance.setLastModifiedAt(template.getLastModifiedAt());
      instance.setLastModifiedBy(template.getLastModifiedBy());
      instance.setCreatedBy(template.getCreatedBy());
      instance.setSequenceNumber(template.getSequenceNumber());
      instance.setResource(template.getResource());
      instance.setResourceVersion(template.getResourceVersion());
      instance.setResourceUserProvidedIdentifiers(template.getResourceUserProvidedIdentifiers());
      instance.setVariant(template.getVariant());
      instance.setRemovedImageUrls(template.getRemovedImageUrls());
      return instance;
   }

}
