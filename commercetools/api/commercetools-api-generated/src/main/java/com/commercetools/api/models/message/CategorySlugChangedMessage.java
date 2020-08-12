package com.commercetools.api.models.message;

import com.commercetools.api.models.common.LocalizedString;
import com.commercetools.api.models.message.Message;
import com.commercetools.api.models.message.CategorySlugChangedMessageImpl;

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
@JsonDeserialize(as = CategorySlugChangedMessageImpl.class)
public interface CategorySlugChangedMessage extends Message {

   
   @NotNull
   @Valid
   @JsonProperty("slug")
   public LocalizedString getSlug();

   public void setSlug(final LocalizedString slug);
   
   public static CategorySlugChangedMessageImpl of(){
      return new CategorySlugChangedMessageImpl();
   }
   

   public static CategorySlugChangedMessageImpl of(final CategorySlugChangedMessage template) {
      CategorySlugChangedMessageImpl instance = new CategorySlugChangedMessageImpl();
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
      instance.setSlug(template.getSlug());
      return instance;
   }

}
