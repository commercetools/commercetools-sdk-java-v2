package com.commercetools.models.extension;

import com.commercetools.models.extension.ExtensionUpdateAction;
import com.commercetools.models.extension.ExtensionSetKeyActionImpl;

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
@JsonDeserialize(as = ExtensionSetKeyActionImpl.class)
public interface ExtensionSetKeyAction extends ExtensionUpdateAction {

   
   
   @JsonProperty("key")
   public String getKey();

   public void setKey(final String key);
   
   public static ExtensionSetKeyActionImpl of(){
      return new ExtensionSetKeyActionImpl();
   }
   

   public static ExtensionSetKeyActionImpl of(final ExtensionSetKeyAction template) {
      ExtensionSetKeyActionImpl instance = new ExtensionSetKeyActionImpl();
      instance.setKey(template.getKey());
      return instance;
   }

}