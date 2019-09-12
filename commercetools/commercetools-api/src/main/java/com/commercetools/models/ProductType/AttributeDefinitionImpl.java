package com.commercetools.models.ProductType;

import com.commercetools.models.Common.LocalizedString;
import com.commercetools.models.ProductType.AttributeConstraintEnum;
import com.commercetools.models.ProductType.AttributeType;
import com.commercetools.models.ProductType.TextInputHint;
import java.lang.Boolean;
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
public final class AttributeDefinitionImpl implements AttributeDefinition {

   private java.lang.Boolean isRequired;
   
   private com.commercetools.models.ProductType.AttributeConstraintEnum attributeConstraint;
   
   private java.lang.String name;
   
   private com.commercetools.models.ProductType.TextInputHint inputHint;
   
   private java.lang.Boolean isSearchable;
   
   private com.commercetools.models.Common.LocalizedString label;
   
   private com.commercetools.models.ProductType.AttributeType type;
   
   private com.commercetools.models.Common.LocalizedString inputTip;

   @JsonCreator
   AttributeDefinitionImpl(@JsonProperty("isRequired") final java.lang.Boolean isRequired, @JsonProperty("attributeConstraint") final com.commercetools.models.ProductType.AttributeConstraintEnum attributeConstraint, @JsonProperty("name") final java.lang.String name, @JsonProperty("inputHint") final com.commercetools.models.ProductType.TextInputHint inputHint, @JsonProperty("isSearchable") final java.lang.Boolean isSearchable, @JsonProperty("label") final com.commercetools.models.Common.LocalizedString label, @JsonProperty("type") final com.commercetools.models.ProductType.AttributeType type, @JsonProperty("inputTip") final com.commercetools.models.Common.LocalizedString inputTip) {
      this.isRequired = isRequired;
      this.attributeConstraint = attributeConstraint;
      this.name = name;
      this.inputHint = inputHint;
      this.isSearchable = isSearchable;
      this.label = label;
      this.type = type;
      this.inputTip = inputTip;
   }
   public AttributeDefinitionImpl() {
      
   }
   
   
   public java.lang.Boolean getIsRequired(){
      return this.isRequired;
   }
   
   
   public com.commercetools.models.ProductType.AttributeConstraintEnum getAttributeConstraint(){
      return this.attributeConstraint;
   }
   
   
   public java.lang.String getName(){
      return this.name;
   }
   
   
   public com.commercetools.models.ProductType.TextInputHint getInputHint(){
      return this.inputHint;
   }
   
   
   public java.lang.Boolean getIsSearchable(){
      return this.isSearchable;
   }
   
   
   public com.commercetools.models.Common.LocalizedString getLabel(){
      return this.label;
   }
   
   
   public com.commercetools.models.ProductType.AttributeType getType(){
      return this.type;
   }
   
   
   public com.commercetools.models.Common.LocalizedString getInputTip(){
      return this.inputTip;
   }

   public void setIsRequired(final java.lang.Boolean isRequired){
      this.isRequired = isRequired;
   }
   
   public void setAttributeConstraint(final com.commercetools.models.ProductType.AttributeConstraintEnum attributeConstraint){
      this.attributeConstraint = attributeConstraint;
   }
   
   public void setName(final java.lang.String name){
      this.name = name;
   }
   
   public void setInputHint(final com.commercetools.models.ProductType.TextInputHint inputHint){
      this.inputHint = inputHint;
   }
   
   public void setIsSearchable(final java.lang.Boolean isSearchable){
      this.isSearchable = isSearchable;
   }
   
   public void setLabel(final com.commercetools.models.Common.LocalizedString label){
      this.label = label;
   }
   
   public void setType(final com.commercetools.models.ProductType.AttributeType type){
      this.type = type;
   }
   
   public void setInputTip(final com.commercetools.models.Common.LocalizedString inputTip){
      this.inputTip = inputTip;
   }

}