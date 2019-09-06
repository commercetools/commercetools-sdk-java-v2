package com.commercetools.models.Type;

import com.commercetools.models.Type.CustomFieldLocalizedEnumValue;
import com.commercetools.models.Type.TypeUpdateAction;
import java.lang.String;
import com.commercetools.models.Type.TypeAddLocalizedEnumValueActionImpl;

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
@JsonDeserialize(as = TypeAddLocalizedEnumValueActionImpl.class)
public interface TypeAddLocalizedEnumValueAction extends TypeUpdateAction {

   
   @NotNull
   @JsonProperty("fieldName")
   public String getFieldName();
   
   @NotNull
   @Valid
   @JsonProperty("value")
   public CustomFieldLocalizedEnumValue getValue();

   public void setFieldName(final String fieldName);
   
   public void setValue(final CustomFieldLocalizedEnumValue value);
   
   public static TypeAddLocalizedEnumValueActionImpl of(){
      return new TypeAddLocalizedEnumValueActionImpl();
   }
   

   public static TypeAddLocalizedEnumValueActionImpl of(final TypeAddLocalizedEnumValueAction template) {
      TypeAddLocalizedEnumValueActionImpl instance = new TypeAddLocalizedEnumValueActionImpl();
      instance.setFieldName(template.getFieldName());
      instance.setValue(template.getValue());
      return instance;
   }

}