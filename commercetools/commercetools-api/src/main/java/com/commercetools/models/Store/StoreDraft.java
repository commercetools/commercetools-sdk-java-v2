package com.commercetools.models.store;

import com.commercetools.models.common.LocalizedString;
import com.commercetools.models.store.StoreDraftImpl;

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
@JsonDeserialize(as = StoreDraftImpl.class)
public interface StoreDraft  {

   
   @NotNull
   @JsonProperty("key")
   public String getKey();
   
   @NotNull
   @Valid
   @JsonProperty("name")
   public LocalizedString getName();

   public void setKey(final String key);
   
   public void setName(final LocalizedString name);
   
   public static StoreDraftImpl of(){
      return new StoreDraftImpl();
   }
   

   public static StoreDraftImpl of(final StoreDraft template) {
      StoreDraftImpl instance = new StoreDraftImpl();
      instance.setName(template.getName());
      instance.setKey(template.getKey());
      return instance;
   }

}