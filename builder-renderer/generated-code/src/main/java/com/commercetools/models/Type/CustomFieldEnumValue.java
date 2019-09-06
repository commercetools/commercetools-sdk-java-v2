package com.commercetools.models.Type;

import java.lang.String;
import com.commercetools.models.Type.CustomFieldEnumValueImpl;

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
      instance.setLabel(template.getLabel());
      instance.setKey(template.getKey());
      return instance;
   }

}