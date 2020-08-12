package com.commercetools.api.models.type;


import com.commercetools.api.models.type.CustomFieldEnumValueImpl;

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
@JsonDeserialize(as = CustomFieldEnumValueImpl.class)
public interface CustomFieldEnumValue  {

   
   @NotNull
   @JsonProperty("key")
   public String getKey();
   
   @NotNull
   @JsonProperty("label")
   public String getLabel();

   public void setKey(final String key);
   
   public void setLabel(final String label);
   
   public static CustomFieldEnumValueImpl of(){
      return new CustomFieldEnumValueImpl();
   }
   

   public static CustomFieldEnumValueImpl of(final CustomFieldEnumValue template) {
      CustomFieldEnumValueImpl instance = new CustomFieldEnumValueImpl();
      instance.setKey(template.getKey());
      instance.setLabel(template.getLabel());
      return instance;
   }

}
