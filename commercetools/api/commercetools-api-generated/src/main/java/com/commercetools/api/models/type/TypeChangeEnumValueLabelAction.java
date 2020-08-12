package com.commercetools.api.models.type;

import com.commercetools.api.models.type.CustomFieldEnumValue;
import com.commercetools.api.models.type.TypeUpdateAction;
import com.commercetools.api.models.type.TypeChangeEnumValueLabelActionImpl;

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
@JsonDeserialize(as = TypeChangeEnumValueLabelActionImpl.class)
public interface TypeChangeEnumValueLabelAction extends TypeUpdateAction {

   
   @NotNull
   @JsonProperty("fieldName")
   public String getFieldName();
   
   @NotNull
   @Valid
   @JsonProperty("value")
   public CustomFieldEnumValue getValue();

   public void setFieldName(final String fieldName);
   
   public void setValue(final CustomFieldEnumValue value);
   
   public static TypeChangeEnumValueLabelActionImpl of(){
      return new TypeChangeEnumValueLabelActionImpl();
   }
   

   public static TypeChangeEnumValueLabelActionImpl of(final TypeChangeEnumValueLabelAction template) {
      TypeChangeEnumValueLabelActionImpl instance = new TypeChangeEnumValueLabelActionImpl();
      instance.setFieldName(template.getFieldName());
      instance.setValue(template.getValue());
      return instance;
   }

}
