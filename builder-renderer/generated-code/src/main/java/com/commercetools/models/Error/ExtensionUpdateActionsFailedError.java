package com.commercetools.models.Error;

import com.commercetools.models.Common.LocalizedString;
import com.commercetools.models.Error.ErrorByExtension;
import com.commercetools.models.Error.ErrorObject;
import java.lang.Object;
import java.lang.String;
import com.commercetools.models.Error.ExtensionUpdateActionsFailedErrorImpl;

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
@JsonDeserialize(as = ExtensionUpdateActionsFailedErrorImpl.class)
public interface ExtensionUpdateActionsFailedError extends ErrorObject {

   
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
   
   public static ExtensionUpdateActionsFailedErrorImpl of(){
      return new ExtensionUpdateActionsFailedErrorImpl();
   }
   

   public static ExtensionUpdateActionsFailedErrorImpl of(final ExtensionUpdateActionsFailedError template) {
      ExtensionUpdateActionsFailedErrorImpl instance = new ExtensionUpdateActionsFailedErrorImpl();
      instance.setMessage(template.getMessage());
      instance.setLocalizedMessage(template.getLocalizedMessage());
      instance.setExtensionExtraInfo(template.getExtensionExtraInfo());
      instance.setErrorByExtension(template.getErrorByExtension());
      return instance;
   }

}