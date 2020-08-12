package com.commercetools.api.models.extension;

import com.commercetools.api.models.common.Reference;
import com.commercetools.api.models.extension.ExtensionAction;
import com.commercetools.api.models.extension.ExtensionInputImpl;

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
@JsonDeserialize(as = ExtensionInputImpl.class)
public interface ExtensionInput  {

   
   @NotNull
   @JsonProperty("action")
   public ExtensionAction getAction();
   
   @NotNull
   @Valid
   @JsonProperty("resource")
   public Reference getResource();

   public void setAction(final ExtensionAction action);
   
   public void setResource(final Reference resource);
   
   public static ExtensionInputImpl of(){
      return new ExtensionInputImpl();
   }
   

   public static ExtensionInputImpl of(final ExtensionInput template) {
      ExtensionInputImpl instance = new ExtensionInputImpl();
      instance.setAction(template.getAction());
      instance.setResource(template.getResource());
      return instance;
   }

}
