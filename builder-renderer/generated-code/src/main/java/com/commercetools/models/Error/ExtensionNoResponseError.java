package com.commercetools.models.Error;

import com.commercetools.models.Common.LocalizedString;
import com.commercetools.models.Error.ErrorByExtension;
import com.commercetools.models.Error.ErrorObject;
import java.lang.Object;
import java.lang.String;
import com.commercetools.models.Error.ExtensionNoResponseErrorImpl;

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
@JsonDeserialize(as = ExtensionNoResponseErrorImpl.class)
public interface ExtensionNoResponseError extends ErrorObject {

   
   @Valid
   @JsonProperty("localizedMessage")
   public LocalizedString getLocalizedMessage();
   
   @Valid
   @JsonProperty("extensionExtraInfo")
   public Object getExtensionExtraInfo();
   
   @NotNull
   @Valid
   @JsonProperty("errorByExtension")
   public ErrorByExtension getErrorByExtension();

   public void setLocalizedMessage(final LocalizedString localizedMessage);
   
   public void setExtensionExtraInfo(final Object extensionExtraInfo);
   
   public void setErrorByExtension(final ErrorByExtension errorByExtension);
   
   public static ExtensionNoResponseErrorImpl of(){
      return new ExtensionNoResponseErrorImpl();
   }
   

   public static ExtensionNoResponseErrorImpl of(final ExtensionNoResponseError template) {
      ExtensionNoResponseErrorImpl instance = new ExtensionNoResponseErrorImpl();
      instance.setMessage(template.getMessage());
      instance.setLocalizedMessage(template.getLocalizedMessage());
      instance.setExtensionExtraInfo(template.getExtensionExtraInfo());
      instance.setErrorByExtension(template.getErrorByExtension());
      return instance;
   }

}