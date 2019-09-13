package com.commercetools.models.type;

import com.commercetools.models.type.CustomFieldEnumValue;
import com.commercetools.models.type.FieldType;
import java.lang.String;
import com.commercetools.models.type.CustomFieldEnumTypeImpl;

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
@JsonDeserialize(as = CustomFieldEnumTypeImpl.class)
public interface CustomFieldEnumType extends FieldType {

   
   @NotNull
   @Valid
   @JsonProperty("values")
   public List<CustomFieldEnumValue> getValues();

   public void setValues(final List<CustomFieldEnumValue> values);
   
   public static CustomFieldEnumTypeImpl of(){
      return new CustomFieldEnumTypeImpl();
   }
   

   public static CustomFieldEnumTypeImpl of(final CustomFieldEnumType template) {
      CustomFieldEnumTypeImpl instance = new CustomFieldEnumTypeImpl();
      instance.setValues(template.getValues());
      return instance;
   }

}