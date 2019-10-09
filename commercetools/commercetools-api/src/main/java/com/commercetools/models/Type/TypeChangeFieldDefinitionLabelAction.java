package com.commercetools.models.type;

import com.commercetools.models.common.LocalizedString;
import com.commercetools.models.type.TypeUpdateAction;
import com.commercetools.models.type.TypeChangeFieldDefinitionLabelActionImpl;

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
@JsonDeserialize(as = TypeChangeFieldDefinitionLabelActionImpl.class)
public interface TypeChangeFieldDefinitionLabelAction extends TypeUpdateAction {

   
   @NotNull
   @JsonProperty("fieldName")
   public String getFieldName();
   
   @NotNull
   @Valid
   @JsonProperty("label")
   public LocalizedString getLabel();

   public void setFieldName(final String fieldName);
   
   public void setLabel(final LocalizedString label);
   
   public static TypeChangeFieldDefinitionLabelActionImpl of(){
      return new TypeChangeFieldDefinitionLabelActionImpl();
   }
   

   public static TypeChangeFieldDefinitionLabelActionImpl of(final TypeChangeFieldDefinitionLabelAction template) {
      TypeChangeFieldDefinitionLabelActionImpl instance = new TypeChangeFieldDefinitionLabelActionImpl();
      instance.setFieldName(template.getFieldName());
      instance.setLabel(template.getLabel());
      return instance;
   }

}