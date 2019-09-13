package com.commercetools.models.type;

import com.commercetools.models.type.FieldDefinition;
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
public final class TypeAddFieldDefinitionActionImpl implements TypeAddFieldDefinitionAction {

   private java.lang.String action;
   
   private com.commercetools.models.type.FieldDefinition fieldDefinition;

   @JsonCreator
   TypeAddFieldDefinitionActionImpl(@JsonProperty("fieldDefinition") final com.commercetools.models.type.FieldDefinition fieldDefinition) {
      this.fieldDefinition = fieldDefinition;
      this.action = "addFieldDefinition";
   }
   public TypeAddFieldDefinitionActionImpl() {
      
   }
   
   
   public java.lang.String getAction(){
      return this.action;
   }
   
   
   public com.commercetools.models.type.FieldDefinition getFieldDefinition(){
      return this.fieldDefinition;
   }

   public void setFieldDefinition(final com.commercetools.models.type.FieldDefinition fieldDefinition){
      this.fieldDefinition = fieldDefinition;
   }

}