package com.commercetools.models.Type;

import com.commercetools.models.Common.LocalizedString;
import com.commercetools.models.Type.TypeUpdateAction;
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
public final class TypeChangeFieldDefinitionLabelActionImpl implements TypeChangeFieldDefinitionLabelAction {

   private java.lang.String action;
   
   private java.lang.String fieldName;
   
   private com.commercetools.models.Common.LocalizedString label;

   @JsonCreator
   TypeChangeFieldDefinitionLabelActionImpl(@JsonProperty("fieldName") final java.lang.String fieldName, @JsonProperty("label") final com.commercetools.models.Common.LocalizedString label) {
      this.fieldName = fieldName;
      this.label = label;
      this.action = "changeFieldDefinitionLabel";
   }
   public TypeChangeFieldDefinitionLabelActionImpl() {
      
   }
   
   
   public java.lang.String getAction(){
      return this.action;
   }
   
   
   public java.lang.String getFieldName(){
      return this.fieldName;
   }
   
   
   public com.commercetools.models.Common.LocalizedString getLabel(){
      return this.label;
   }

   public void setFieldName(final java.lang.String fieldName){
      this.fieldName = fieldName;
   }
   
   public void setLabel(final com.commercetools.models.Common.LocalizedString label){
      this.label = label;
   }

}