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
public final class TypeChangeFieldDefinitionOrderActionImpl implements TypeChangeFieldDefinitionOrderAction {

   private java.lang.String action;
   
   private java.util.List<java.lang.String> fieldNames;

   @JsonCreator
   TypeChangeFieldDefinitionOrderActionImpl(@JsonProperty("fieldNames") final java.util.List<java.lang.String> fieldNames) {
      this.fieldNames = fieldNames;
      this.action = "changeFieldDefinitionOrder";
   }
   public TypeChangeFieldDefinitionOrderActionImpl() {
      
   }
   
   
   public java.lang.String getAction(){
      return this.action;
   }
   
   
   public java.util.List<java.lang.String> getFieldNames(){
      return this.fieldNames;
   }

   public void setFieldNames(final java.util.List<java.lang.String> fieldNames){
      this.fieldNames = fieldNames;
   }

}