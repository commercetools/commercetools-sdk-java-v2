package com.commercetools.models.Type;

import com.commercetools.models.Common.LocalizedString;
import com.commercetools.models.Type.TypeTextInputHint;
import java.lang.Boolean;
import java.lang.Object;
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
public final class FieldDefinitionImpl implements FieldDefinition {

   private java.lang.String name;
   
   private com.commercetools.models.Type.TypeTextInputHint inputHint;
   
   private com.commercetools.models.Common.LocalizedString label;
   
   private java.lang.Object type;
   
   private java.lang.Boolean required;

   @JsonCreator
   FieldDefinitionImpl(@JsonProperty("name") final java.lang.String name, @JsonProperty("inputHint") final com.commercetools.models.Type.TypeTextInputHint inputHint, @JsonProperty("label") final com.commercetools.models.Common.LocalizedString label, @JsonProperty("type") final java.lang.Object type, @JsonProperty("required") final java.lang.Boolean required) {
      this.name = name;
      this.inputHint = inputHint;
      this.label = label;
      this.type = type;
      this.required = required;
   }
   public FieldDefinitionImpl() {
      
   }
   
   
   public java.lang.String getName(){
      return this.name;
   }
   
   
   public com.commercetools.models.Type.TypeTextInputHint getInputHint(){
      return this.inputHint;
   }
   
   
   public com.commercetools.models.Common.LocalizedString getLabel(){
      return this.label;
   }
   
   
   public java.lang.Object getType(){
      return this.type;
   }
   
   
   public java.lang.Boolean getRequired(){
      return this.required;
   }

   public void setName(final java.lang.String name){
      this.name = name;
   }
   
   public void setInputHint(final com.commercetools.models.Type.TypeTextInputHint inputHint){
      this.inputHint = inputHint;
   }
   
   public void setLabel(final com.commercetools.models.Common.LocalizedString label){
      this.label = label;
   }
   
   public void setType(final java.lang.Object type){
      this.type = type;
   }
   
   public void setRequired(final java.lang.Boolean required){
      this.required = required;
   }

}