package com.commercetools.api.generated.models.type;

import com.commercetools.api.generated.models.type.CustomFieldLocalizedEnumValue;
import com.commercetools.api.generated.models.type.FieldType;
import com.commercetools.api.generated.models.type.CustomFieldLocalizedEnumTypeImpl;

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