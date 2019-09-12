package com.commercetools.models.Type;

import com.commercetools.models.Type.TypeUpdateAction;
import java.lang.String;
import com.commercetools.models.Type.TypeChangeFieldDefinitionOrderActionImpl;

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
@JsonDeserialize(as = TypeChangeFieldDefinitionOrderActionImpl.class)
public interface TypeChangeFieldDefinitionOrderAction extends TypeUpdateAction {

   
   @NotNull
   @JsonProperty("fieldNames")
   public List<String> getFieldNames();

   public void setFieldNames(final List<String> fieldNames);
   
   public static TypeChangeFieldDefinitionOrderActionImpl of(){
      return new TypeChangeFieldDefinitionOrderActionImpl();
   }
   

   public static TypeChangeFieldDefinitionOrderActionImpl of(final TypeChangeFieldDefinitionOrderAction template) {
      TypeChangeFieldDefinitionOrderActionImpl instance = new TypeChangeFieldDefinitionOrderActionImpl();
      instance.setFieldNames(template.getFieldNames());
      return instance;
   }

}