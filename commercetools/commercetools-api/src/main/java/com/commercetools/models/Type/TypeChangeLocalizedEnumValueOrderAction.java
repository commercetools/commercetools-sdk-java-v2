package com.commercetools.models.type;

import com.commercetools.models.type.TypeUpdateAction;
import com.commercetools.models.type.TypeChangeLocalizedEnumValueOrderActionImpl;

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
@JsonDeserialize(as = TypeChangeLocalizedEnumValueOrderActionImpl.class)
public interface TypeChangeLocalizedEnumValueOrderAction extends TypeUpdateAction {

   
   @NotNull
   @JsonProperty("fieldName")
   public String getFieldName();
   
   @NotNull
   @JsonProperty("keys")
   public List<String> getKeys();

   public void setFieldName(final String fieldName);
   
   public void setKeys(final List<String> keys);
   
   public static TypeChangeLocalizedEnumValueOrderActionImpl of(){
      return new TypeChangeLocalizedEnumValueOrderActionImpl();
   }
   

   public static TypeChangeLocalizedEnumValueOrderActionImpl of(final TypeChangeLocalizedEnumValueOrderAction template) {
      TypeChangeLocalizedEnumValueOrderActionImpl instance = new TypeChangeLocalizedEnumValueOrderActionImpl();
      instance.setFieldName(template.getFieldName());
      instance.setKeys(template.getKeys());
      return instance;
   }

}