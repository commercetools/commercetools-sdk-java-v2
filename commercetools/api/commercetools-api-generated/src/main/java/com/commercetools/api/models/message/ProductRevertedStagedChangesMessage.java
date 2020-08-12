package com.commercetools.api.models.message;

import com.commercetools.api.models.message.Message;
import com.commercetools.api.models.message.ProductRevertedStagedChangesMessageImpl;

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
@JsonDeserialize(as = ProductRevertedStagedChangesMessageImpl.class)
public interface ProductRevertedStagedChangesMessage extends Message {

   
   @NotNull
   @JsonProperty("removedImageUrls")
   public List<String> getRemovedImageUrls();

   public void setRemovedImageUrls(final List<String> removedImageUrls);
   
   public static ProductRevertedStagedChangesMessageImpl of(){
      return new ProductRevertedStagedChangesMessageImpl();
   }
   

   public static ProductRevertedStagedChangesMessageImpl of(final ProductRevertedStagedChangesMessage template) {
      ProductRevertedStagedChangesMessageImpl instance = new ProductRevertedStagedChangesMessageImpl();
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
      instance.setRemovedImageUrls(template.getRemovedImageUrls());
      return instance;
   }

}
