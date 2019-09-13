package com.commercetools.models.type;

import com.commercetools.models.type.TypeUpdateAction;
import java.lang.String;
import javax.annotation.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;


@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class TypeRemoveFieldDefinitionActionImpl implements TypeRemoveFieldDefinitionAction {

   private java.lang.String action;
   
   private java.lang.String fieldName;

   @JsonCreator
   TypeRemoveFieldDefinitionActionImpl(@JsonProperty("fieldName") final java.lang.String fieldName) {
      this.fieldName = fieldName;
      this.action = "removeFieldDefinition";
   }
   public TypeRemoveFieldDefinitionActionImpl() {
      
   }
   
   
   public java.lang.String getAction(){
      return this.action;
   }
   
   
   public java.lang.String getFieldName(){
      return this.fieldName;
   }

   public void setFieldName(final java.lang.String fieldName){
      this.fieldName = fieldName;
   }

}