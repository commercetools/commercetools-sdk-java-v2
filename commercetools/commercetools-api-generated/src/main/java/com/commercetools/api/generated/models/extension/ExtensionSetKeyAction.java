package com.commercetools.api.generated.models.extension;

import com.commercetools.api.generated.models.extension.ExtensionUpdateAction;
import com.commercetools.api.generated.models.extension.ExtensionSetKeyActionImpl;

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
@JsonDeserialize(as = ExtensionSetKeyActionImpl.class)
public interface ExtensionSetKeyAction extends ExtensionUpdateAction {

   /**
   *  <p>If <code>key</code> is absent or <code>null</code>, this field will be removed if it exists.</p>
   */
   
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