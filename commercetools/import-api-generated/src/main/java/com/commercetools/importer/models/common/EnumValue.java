package com.commercetools.importer.models.common;


import com.commercetools.importer.models.common.EnumValueImpl;

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
@JsonDeserialize(as = EnumValueImpl.class)
public interface EnumValue  {

   
   @NotNull
   @JsonProperty("key")
   public String getKey();
   
   @NotNull
   @JsonProperty("label")
   public String getLabel();

   public void setKey(final String key);
   
   public void setLabel(final String label);
   
   public static EnumValueImpl of(){
      return new EnumValueImpl();
   }
   

   public static EnumValueImpl of(final EnumValue template) {
      EnumValueImpl instance = new EnumValueImpl();
      instance.setLabel(template.getLabel());
      instance.setKey(template.getKey());
      return instance;
   }

}