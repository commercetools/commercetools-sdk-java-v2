package com.commercetools.models.type;

import com.commercetools.models.type.CustomFieldLocalizedEnumValue;
import com.commercetools.models.type.TypeUpdateAction;
import java.lang.String;
import com.commercetools.models.type.TypeChangeLocalizedEnumValueLabelActionImpl;

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
@JsonDeserialize(as = TypeChangeLocalizedEnumValueLabelActionImpl.class)
public interface TypeChangeLocalizedEnumValueLabelAction extends TypeUpdateAction {

   
   @NotNull
   @JsonProperty("fieldName")
   public String getFieldName();
   
   @NotNull
   @Valid
   @JsonProperty("value")
   public CustomFieldLocalizedEnumValue getValue();

   public void setFieldName(final String fieldName);
   
   public void setValue(final CustomFieldLocalizedEnumValue value);
   
   public static TypeChangeLocalizedEnumValueLabelActionImpl of(){
      return new TypeChangeLocalizedEnumValueLabelActionImpl();
   }
   

   public static TypeChangeLocalizedEnumValueLabelActionImpl of(final TypeChangeLocalizedEnumValueLabelAction template) {
      TypeChangeLocalizedEnumValueLabelActionImpl instance = new TypeChangeLocalizedEnumValueLabelActionImpl();
      instance.setFieldName(template.getFieldName());
      instance.setValue(template.getValue());
      return instance;
   }

}