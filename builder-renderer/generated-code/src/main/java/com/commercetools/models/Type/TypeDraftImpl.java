package com.commercetools.models.Type;

import com.commercetools.models.Common.LocalizedString;
import com.commercetools.models.Type.FieldDefinition;
import com.commercetools.models.Type.ResourceTypeId;
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

import json.CommercetoolsJsonUtils;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class TypeDraftImpl implements TypeDraft {

   private com.commercetools.models.Common.LocalizedString name;
   
   private java.util.List<com.commercetools.models.Type.FieldDefinition> fieldDefinitions;
   
   private com.commercetools.models.Common.LocalizedString description;
   
   private java.lang.String key;
   
   private java.util.List<com.commercetools.models.Type.ResourceTypeId> resourceTypeIds;

   @JsonCreator
   TypeDraftImpl(@JsonProperty("name") final com.commercetools.models.Common.LocalizedString name, @JsonProperty("fieldDefinitions") final java.util.List<com.commercetools.models.Type.FieldDefinition> fieldDefinitions, @JsonProperty("description") final com.commercetools.models.Common.LocalizedString description, @JsonProperty("key") final java.lang.String key, @JsonProperty("resourceTypeIds") final java.util.List<com.commercetools.models.Type.ResourceTypeId> resourceTypeIds) {
      this.name = name;
      this.fieldDefinitions = fieldDefinitions;
      this.description = description;
      this.key = key;
      this.resourceTypeIds = resourceTypeIds;
   }
   public TypeDraftImpl() {
      
   }
   
   
   public com.commercetools.models.Common.LocalizedString getName(){
      return this.name;
   }
   
   
   public java.util.List<com.commercetools.models.Type.FieldDefinition> getFieldDefinitions(){
      return this.fieldDefinitions;
   }
   
   
   public com.commercetools.models.Common.LocalizedString getDescription(){
      return this.description;
   }
   
   
   public java.lang.String getKey(){
      return this.key;
   }
   
   
   public java.util.List<com.commercetools.models.Type.ResourceTypeId> getResourceTypeIds(){
      return this.resourceTypeIds;
   }

   public void setName(final com.commercetools.models.Common.LocalizedString name){
      this.name = name;
   }
   
   public void setFieldDefinitions(final java.util.List<com.commercetools.models.Type.FieldDefinition> fieldDefinitions){
      this.fieldDefinitions = fieldDefinitions;
   }
   
   public void setDescription(final com.commercetools.models.Common.LocalizedString description){
      this.description = description;
   }
   
   public void setKey(final java.lang.String key){
      this.key = key;
   }
   
   public void setResourceTypeIds(final java.util.List<com.commercetools.models.Type.ResourceTypeId> resourceTypeIds){
      this.resourceTypeIds = resourceTypeIds;
   }

}