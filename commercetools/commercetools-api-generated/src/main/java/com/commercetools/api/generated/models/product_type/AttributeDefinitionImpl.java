package com.commercetools.api.generated.models.product_type;

import com.commercetools.api.generated.models.common.LocalizedString;
import com.commercetools.api.generated.models.product_type.AttributeConstraintEnum;
import com.commercetools.api.generated.models.product_type.AttributeType;
import com.commercetools.api.generated.models.product_type.TextInputHint;
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

   private Boolean isRequired;
   
   private com.commercetools.api.generated.models.product_type.AttributeConstraintEnum attributeConstraint;
   
   private String name;
   
   private com.commercetools.api.generated.models.product_type.TextInputHint inputHint;
   
   private Boolean isSearchable;
   
   private com.commercetools.api.generated.models.common.LocalizedString label;
   
   private com.commercetools.api.generated.models.product_type.AttributeType type;
   
   private com.commercetools.api.generated.models.common.LocalizedString inputTip;

   @JsonCreator
   AttributeDefinitionImpl(@JsonProperty("isRequired") final Boolean isRequired, @JsonProperty("attributeConstraint") final com.commercetools.api.generated.models.product_type.AttributeConstraintEnum attributeConstraint, @JsonProperty("name") final String name, @JsonProperty("inputHint") final com.commercetools.api.generated.models.product_type.TextInputHint inputHint, @JsonProperty("isSearchable") final Boolean isSearchable, @JsonProperty("label") final com.commercetools.api.generated.models.common.LocalizedString label, @JsonProperty("type") final com.commercetools.api.generated.models.product_type.AttributeType type, @JsonProperty("inputTip") final com.commercetools.api.generated.models.common.LocalizedString inputTip) {
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
   
   
   public Boolean getIsRequired(){
      return this.isRequired;
   }
   
   
   public com.commercetools.api.generated.models.product_type.AttributeConstraintEnum getAttributeConstraint(){
      return this.attributeConstraint;
   }
   
   
   public String getName(){
      return this.name;
   }
   
   
   public com.commercetools.api.generated.models.product_type.TextInputHint getInputHint(){
      return this.inputHint;
   }
   
   
   public Boolean getIsSearchable(){
      return this.isSearchable;
   }
   
   
   public com.commercetools.api.generated.models.common.LocalizedString getLabel(){
      return this.label;
   }
   
   
   public com.commercetools.api.generated.models.product_type.AttributeType getType(){
      return this.type;
   }
   
   
   public com.commercetools.api.generated.models.common.LocalizedString getInputTip(){
      return this.inputTip;
   }

   public void setIsRequired(final Boolean isRequired){
      this.isRequired = isRequired;
   }
   
   public void setAttributeConstraint(final com.commercetools.api.generated.models.product_type.AttributeConstraintEnum attributeConstraint){
      this.attributeConstraint = attributeConstraint;
   }
   
   public void setName(final String name){
      this.name = name;
   }
   
   public void setInputHint(final com.commercetools.api.generated.models.product_type.TextInputHint inputHint){
      this.inputHint = inputHint;
   }
   
   public void setIsSearchable(final Boolean isSearchable){
      this.isSearchable = isSearchable;
   }
   
   public void setLabel(final com.commercetools.api.generated.models.common.LocalizedString label){
      this.label = label;
   }
   
   public void setType(final com.commercetools.api.generated.models.product_type.AttributeType type){
      this.type = type;
   }
   
   public void setInputTip(final com.commercetools.api.generated.models.common.LocalizedString inputTip){
      this.inputTip = inputTip;
   }

}