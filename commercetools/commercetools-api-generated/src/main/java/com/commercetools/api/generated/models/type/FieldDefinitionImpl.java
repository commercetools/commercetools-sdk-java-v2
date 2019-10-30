package com.commercetools.api.generated.models.type;

import com.commercetools.api.generated.models.common.LocalizedString;
import com.commercetools.api.generated.models.type.FieldType;
import com.commercetools.api.generated.models.type.TypeTextInputHint;
import io.vrap.rmf.base.client.utils.Generated;
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

   private String name;
   
   private com.commercetools.api.generated.models.type.TypeTextInputHint inputHint;
   
   private com.commercetools.api.generated.models.common.LocalizedString label;
   
   private com.commercetools.api.generated.models.type.FieldType type;
   
   private Boolean required;

   @JsonCreator
   FieldDefinitionImpl(@JsonProperty("name") final String name, @JsonProperty("inputHint") final com.commercetools.api.generated.models.type.TypeTextInputHint inputHint, @JsonProperty("label") final com.commercetools.api.generated.models.common.LocalizedString label, @JsonProperty("type") final com.commercetools.api.generated.models.type.FieldType type, @JsonProperty("required") final Boolean required) {
      this.name = name;
      this.inputHint = inputHint;
      this.label = label;
      this.type = type;
      this.required = required;
   }
   public FieldDefinitionImpl() {
      
   }
   
   
   public String getName(){
      return this.name;
   }
   
   
   public com.commercetools.api.generated.models.type.TypeTextInputHint getInputHint(){
      return this.inputHint;
   }
   
   
   public com.commercetools.api.generated.models.common.LocalizedString getLabel(){
      return this.label;
   }
   
   
   public com.commercetools.api.generated.models.type.FieldType getType(){
      return this.type;
   }
   
   
   public Boolean getRequired(){
      return this.required;
   }

   public void setName(final String name){
      this.name = name;
   }
   
   public void setInputHint(final com.commercetools.api.generated.models.type.TypeTextInputHint inputHint){
      this.inputHint = inputHint;
   }
   
   public void setLabel(final com.commercetools.api.generated.models.common.LocalizedString label){
      this.label = label;
   }
   
   public void setType(final com.commercetools.api.generated.models.type.FieldType type){
      this.type = type;
   }
   
   public void setRequired(final Boolean required){
      this.required = required;
   }

}