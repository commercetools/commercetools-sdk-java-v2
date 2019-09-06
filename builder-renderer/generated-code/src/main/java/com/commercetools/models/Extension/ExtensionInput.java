package com.commercetools.models.Extension;

import com.commercetools.models.Common.Reference;
import com.commercetools.models.Extension.ExtensionAction;
import com.commercetools.models.Extension.ExtensionInputImpl;

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
      instance.setResource(template.getResource());
      instance.setAction(template.getAction());
      return instance;
   }

}