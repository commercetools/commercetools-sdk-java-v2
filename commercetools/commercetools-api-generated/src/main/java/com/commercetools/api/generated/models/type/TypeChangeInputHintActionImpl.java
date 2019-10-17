package com.commercetools.api.generated.models.type;

import com.commercetools.api.generated.models.type.TypeTextInputHint;
import com.commercetools.api.generated.models.type.TypeUpdateAction;
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
public final class TypeChangeInputHintActionImpl implements TypeChangeInputHintAction {

   private String action;
   
   private String fieldName;
   
   private com.commercetools.api.generated.models.type.TypeTextInputHint inputHint;

   @JsonCreator
   TypeChangeInputHintActionImpl(@JsonProperty("fieldName") final String fieldName, @JsonProperty("inputHint") final com.commercetools.api.generated.models.type.TypeTextInputHint inputHint) {
      this.fieldName = fieldName;
      this.inputHint = inputHint;
      this.action = "changeInputHint";
   }
   public TypeChangeInputHintActionImpl() {
      
   }
   
   
   public String getAction(){
      return this.action;
   }
   
   
   public String getFieldName(){
      return this.fieldName;
   }
   
   
   public com.commercetools.api.generated.models.type.TypeTextInputHint getInputHint(){
      return this.inputHint;
   }

   public void setFieldName(final String fieldName){
      this.fieldName = fieldName;
   }
   
   public void setInputHint(final com.commercetools.api.generated.models.type.TypeTextInputHint inputHint){
      this.inputHint = inputHint;
   }

}