package com.commercetools.models.type;

import com.commercetools.models.type.TypeUpdateAction;
import java.lang.String;
import com.commercetools.models.type.TypeRemoveFieldDefinitionActionImpl;

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
@JsonDeserialize(as = TypeRemoveFieldDefinitionActionImpl.class)
public interface TypeRemoveFieldDefinitionAction extends TypeUpdateAction {

   
   @NotNull
   @JsonProperty("fieldName")
   public String getFieldName();

   public void setFieldName(final String fieldName);
   
   public static TypeRemoveFieldDefinitionActionImpl of(){
      return new TypeRemoveFieldDefinitionActionImpl();
   }
   

   public static TypeRemoveFieldDefinitionActionImpl of(final TypeRemoveFieldDefinitionAction template) {
      TypeRemoveFieldDefinitionActionImpl instance = new TypeRemoveFieldDefinitionActionImpl();
      instance.setFieldName(template.getFieldName());
      return instance;
   }

}