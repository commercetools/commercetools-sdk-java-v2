package com.commercetools.api.generated.models.message;

import com.commercetools.api.generated.models.common.LocalizedString;
import com.commercetools.api.generated.models.message.MessagePayload;
import com.commercetools.api.generated.models.message.CategorySlugChangedMessagePayloadImpl;

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
@JsonDeserialize(as = CategorySlugChangedMessagePayloadImpl.class)
public interface CategorySlugChangedMessagePayload extends MessagePayload {

   
   @NotNull
   @Valid
   @JsonProperty("slug")
   public LocalizedString getSlug();

   public void setSlug(final LocalizedString slug);
   
   public static CategorySlugChangedMessagePayloadImpl of(){
      return new CategorySlugChangedMessagePayloadImpl();
   }
   

   public static CategorySlugChangedMessagePayloadImpl of(final CategorySlugChangedMessagePayload template) {
      CategorySlugChangedMessagePayloadImpl instance = new CategorySlugChangedMessagePayloadImpl();
      instance.setSlug(template.getSlug());
      return instance;
   }

}