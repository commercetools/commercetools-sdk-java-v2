package com.commercetools.models.ProductType;

import java.lang.String;
import com.commercetools.models.ProductType.AttributePlainEnumValueImpl;

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
@JsonDeserialize(as = AttributePlainEnumValueImpl.class)
public interface AttributePlainEnumValue  {

   
   @NotNull
   @JsonProperty("key")
   public String getKey();
   
   @NotNull
   @JsonProperty("label")
   public String getLabel();

   public void setKey(final String key);
   
   public void setLabel(final String label);
   
   public static AttributePlainEnumValueImpl of(){
      return new AttributePlainEnumValueImpl();
   }
   

   public static AttributePlainEnumValueImpl of(final AttributePlainEnumValue template) {
      AttributePlainEnumValueImpl instance = new AttributePlainEnumValueImpl();
      instance.setLabel(template.getLabel());
      instance.setKey(template.getKey());
      return instance;
   }

}