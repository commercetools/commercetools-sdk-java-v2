package com.commercetools.models.Type;

import com.commercetools.models.Type.CustomFieldEnumValue;
import com.commercetools.models.Type.TypeUpdateAction;
import java.lang.String;
import com.commercetools.models.Type.TypeAddEnumValueActionImpl;

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
@JsonDeserialize(as = TypeAddEnumValueActionImpl.class)
public interface TypeAddEnumValueAction extends TypeUpdateAction {

   
   @NotNull
   @JsonProperty("fieldName")
   public String getFieldName();
   
   @NotNull
   @Valid
   @JsonProperty("value")
   public CustomFieldEnumValue getValue();

   public void setFieldName(final String fieldName);
   
   public void setValue(final CustomFieldEnumValue value);
   
   public static TypeAddEnumValueActionImpl of(){
      return new TypeAddEnumValueActionImpl();
   }
   

   public static TypeAddEnumValueActionImpl of(final TypeAddEnumValueAction template) {
      TypeAddEnumValueActionImpl instance = new TypeAddEnumValueActionImpl();
      instance.setFieldName(template.getFieldName());
      instance.setValue(template.getValue());
      return instance;
   }

}