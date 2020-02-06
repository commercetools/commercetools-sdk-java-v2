package com.commercetools.importer.models.producttypes;

import com.commercetools.importer.models.common.LocalizedString;
import com.commercetools.importer.models.producttypes.AttributeConstraintEnum;
import com.commercetools.importer.models.producttypes.AttributeType;
import com.commercetools.importer.models.producttypes.TextInputHint;
import io.vrap.rmf.base.client.utils.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.annotation.*;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;


@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class AttributeDefinitionImpl implements AttributeDefinition {

   private com.commercetools.importer.models.producttypes.AttributeType type;
   
   private String name;
   
   private com.commercetools.importer.models.common.LocalizedString label;
   
   private Boolean isRequired;
   
   private com.commercetools.importer.models.producttypes.AttributeConstraintEnum attributeConstraint;
   
   private com.commercetools.importer.models.common.LocalizedString inputTip;
   
   private com.commercetools.importer.models.producttypes.TextInputHint inputHint;
   
   private Boolean isSearchable;

   @JsonCreator
   AttributeDefinitionImpl(@JsonProperty("type") final com.commercetools.importer.models.producttypes.AttributeType type, @JsonProperty("name") final String name, @JsonProperty("label") final com.commercetools.importer.models.common.LocalizedString label, @JsonProperty("isRequired") final Boolean isRequired, @JsonProperty("attributeConstraint") final com.commercetools.importer.models.producttypes.AttributeConstraintEnum attributeConstraint, @JsonProperty("inputTip") final com.commercetools.importer.models.common.LocalizedString inputTip, @JsonProperty("inputHint") final com.commercetools.importer.models.producttypes.TextInputHint inputHint, @JsonProperty("isSearchable") final Boolean isSearchable) {
      this.type = type;
      this.name = name;
      this.label = label;
      this.isRequired = isRequired;
      this.attributeConstraint = attributeConstraint;
      this.inputTip = inputTip;
      this.inputHint = inputHint;
      this.isSearchable = isSearchable;
   }
   public AttributeDefinitionImpl() {
      
   }
   
   
   public com.commercetools.importer.models.producttypes.AttributeType getType(){
      return this.type;
   }
   
   
   public String getName(){
      return this.name;
   }
   
   
   public com.commercetools.importer.models.common.LocalizedString getLabel(){
      return this.label;
   }
   
   
   public Boolean getIsRequired(){
      return this.isRequired;
   }
   
   
   public com.commercetools.importer.models.producttypes.AttributeConstraintEnum getAttributeConstraint(){
      return this.attributeConstraint;
   }
   
   
   public com.commercetools.importer.models.common.LocalizedString getInputTip(){
      return this.inputTip;
   }
   
   
   public com.commercetools.importer.models.producttypes.TextInputHint getInputHint(){
      return this.inputHint;
   }
   
   
   public Boolean getIsSearchable(){
      return this.isSearchable;
   }

   public void setType(final com.commercetools.importer.models.producttypes.AttributeType type){
      this.type = type;
   }
   
   public void setName(final String name){
      this.name = name;
   }
   
   public void setLabel(final com.commercetools.importer.models.common.LocalizedString label){
      this.label = label;
   }
   
   public void setIsRequired(final Boolean isRequired){
      this.isRequired = isRequired;
   }
   
   public void setAttributeConstraint(final com.commercetools.importer.models.producttypes.AttributeConstraintEnum attributeConstraint){
      this.attributeConstraint = attributeConstraint;
   }
   
   public void setInputTip(final com.commercetools.importer.models.common.LocalizedString inputTip){
      this.inputTip = inputTip;
   }
   
   public void setInputHint(final com.commercetools.importer.models.producttypes.TextInputHint inputHint){
      this.inputHint = inputHint;
   }
   
   public void setIsSearchable(final Boolean isSearchable){
      this.isSearchable = isSearchable;
   }

}