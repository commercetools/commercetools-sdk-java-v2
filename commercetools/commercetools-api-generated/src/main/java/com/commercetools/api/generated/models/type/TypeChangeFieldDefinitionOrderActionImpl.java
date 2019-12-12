package com.commercetools.api.generated.models.type;

import com.commercetools.api.generated.models.type.TypeUpdateAction;
import io.vrap.rmf.base.client.utils.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.annotation.*;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;


@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class TypeChangeFieldDefinitionOrderActionImpl implements TypeChangeFieldDefinitionOrderAction {

   private String action;
   
   private java.util.List<String> fieldNames;

   @JsonCreator
   TypeChangeFieldDefinitionOrderActionImpl(@JsonProperty("fieldNames") final java.util.List<String> fieldNames) {
      this.fieldNames = fieldNames;
      this.action = "changeFieldDefinitionOrder";
   }
   public TypeChangeFieldDefinitionOrderActionImpl() {
      
   }
   
   
   public String getAction(){
      return this.action;
   }
   
   
   public java.util.List<String> getFieldNames(){
      return this.fieldNames;
   }

   public void setFieldNames(final java.util.List<String> fieldNames){
      this.fieldNames = fieldNames;
   }

}