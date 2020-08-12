package com.commercetools.api.models.error;


import com.commercetools.api.models.error.ErrorByExtensionImpl;

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
@JsonDeserialize(as = ErrorByExtensionImpl.class)
public interface ErrorByExtension  {

   
   @NotNull
   @JsonProperty("id")
   public String getId();
   
   
   @JsonProperty("key")
   public String getKey();

   public void setId(final String id);
   
   public void setKey(final String key);
   
   public static ErrorByExtensionImpl of(){
      return new ErrorByExtensionImpl();
   }
   

   public static ErrorByExtensionImpl of(final ErrorByExtension template) {
      ErrorByExtensionImpl instance = new ErrorByExtensionImpl();
      instance.setId(template.getId());
      instance.setKey(template.getKey());
      return instance;
   }

}
