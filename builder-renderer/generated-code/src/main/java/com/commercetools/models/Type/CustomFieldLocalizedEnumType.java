package com.commercetools.models.Type;

import com.commercetools.models.Type.CustomFieldLocalizedEnumValue;
import com.commercetools.models.Type.FieldType;
import java.lang.String;
import com.commercetools.models.Type.CustomFieldLocalizedEnumTypeImpl;

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
@JsonDeserialize(as = CustomFieldLocalizedEnumTypeImpl.class)
public interface CustomFieldLocalizedEnumType extends FieldType {

   
   @NotNull
   @Valid
   @JsonProperty("values")
   public List<CustomFieldLocalizedEnumValue> getValues();

   public void setValues(final List<CustomFieldLocalizedEnumValue> values);
   
   public static CustomFieldLocalizedEnumTypeImpl of(){
      return new CustomFieldLocalizedEnumTypeImpl();
   }
   

   public static CustomFieldLocalizedEnumTypeImpl of(final CustomFieldLocalizedEnumType template) {
      CustomFieldLocalizedEnumTypeImpl instance = new CustomFieldLocalizedEnumTypeImpl();
      instance.setValues(template.getValues());
      return instance;
   }

}