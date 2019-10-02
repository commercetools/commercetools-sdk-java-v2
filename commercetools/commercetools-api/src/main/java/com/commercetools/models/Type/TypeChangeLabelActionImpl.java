package com.commercetools.models.type;

import com.commercetools.models.common.LocalizedString;
import com.commercetools.models.type.TypeUpdateAction;
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
public final class TypeChangeLabelActionImpl implements TypeChangeLabelAction {

   private String action;
   
   private String fieldName;
   
   private com.commercetools.models.common.LocalizedString label;

   @JsonCreator
   TypeChangeLabelActionImpl(@JsonProperty("fieldName") final String fieldName, @JsonProperty("label") final com.commercetools.models.common.LocalizedString label) {
      this.fieldName = fieldName;
      this.label = label;
      this.action = "changeLabel";
   }
   public TypeChangeLabelActionImpl() {
      
   }
   
   
   public String getAction(){
      return this.action;
   }
   
   
   public String getFieldName(){
      return this.fieldName;
   }
   
   
   public com.commercetools.models.common.LocalizedString getLabel(){
      return this.label;
   }

   public void setFieldName(final String fieldName){
      this.fieldName = fieldName;
   }
   
   public void setLabel(final com.commercetools.models.common.LocalizedString label){
      this.label = label;
   }

}