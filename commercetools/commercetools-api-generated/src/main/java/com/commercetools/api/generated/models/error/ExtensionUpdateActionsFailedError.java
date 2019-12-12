package com.commercetools.api.generated.models.error;

import com.commercetools.api.generated.models.common.LocalizedString;
import com.commercetools.api.generated.models.error.ErrorByExtension;
import com.commercetools.api.generated.models.error.ErrorObject;
import com.commercetools.api.generated.models.error.ExtensionUpdateActionsFailedErrorImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.*;
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
@JsonDeserialize(as = ExtensionUpdateActionsFailedErrorImpl.class)
public interface ExtensionUpdateActionsFailedError extends ErrorObject {

   
   @Valid
   @JsonProperty("localizedMessage")
   public LocalizedString getLocalizedMessage();
   
   @Valid
   @JsonProperty("extensionExtraInfo")
   public JsonNode getExtensionExtraInfo();
   
   @NotNull
   @Valid
   @JsonProperty("errorByExtension")
   public ErrorByExtension getErrorByExtension();

   public void setLocalizedMessage(final LocalizedString localizedMessage);
   
   public void setExtensionExtraInfo(final JsonNode extensionExtraInfo);
   
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