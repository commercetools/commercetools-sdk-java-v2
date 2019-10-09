package com.commercetools.models.extension;

import com.commercetools.models.extension.ExtensionDestination;
import com.commercetools.models.extension.ExtensionHttpDestinationAuthentication;
import com.commercetools.models.extension.ExtensionHttpDestinationImpl;

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
@JsonDeserialize(as = ExtensionHttpDestinationImpl.class)
public interface ExtensionHttpDestination extends ExtensionDestination {

   
   @NotNull
   @JsonProperty("url")
   public String getUrl();
   
   @Valid
   @JsonProperty("authentication")
   public ExtensionHttpDestinationAuthentication getAuthentication();

   public void setUrl(final String url);
   
   public void setAuthentication(final ExtensionHttpDestinationAuthentication authentication);
   
   public static ExtensionHttpDestinationImpl of(){
      return new ExtensionHttpDestinationImpl();
   }
   

   public static ExtensionHttpDestinationImpl of(final ExtensionHttpDestination template) {
      ExtensionHttpDestinationImpl instance = new ExtensionHttpDestinationImpl();
      instance.setUrl(template.getUrl());
      instance.setAuthentication(template.getAuthentication());
      return instance;
   }

}