package com.commercetools.models.Type;

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


@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class TypeChangeEnumValueOrderActionImpl implements TypeChangeEnumValueOrderAction {

   private java.lang.String action;
   
   private java.lang.String fieldName;
   
   private java.util.List<java.lang.String> keys;

   @JsonCreator
   TypeChangeEnumValueOrderActionImpl(@JsonProperty("fieldName") final java.lang.String fieldName, @JsonProperty("keys") final java.util.List<java.lang.String> keys) {
      this.fieldName = fieldName;
      this.keys = keys;
      this.action = "changeEnumValueOrder";
   }
   public TypeChangeEnumValueOrderActionImpl() {
      
   }
   
   
   public java.lang.String getAction(){
      return this.action;
   }
   
   
   public java.lang.String getFieldName(){
      return this.fieldName;
   }
   
   
   public java.util.List<java.lang.String> getKeys(){
      return this.keys;
   }

   public void setFieldName(final java.lang.String fieldName){
      this.fieldName = fieldName;
   }
   
   public void setKeys(final java.util.List<java.lang.String> keys){
      this.keys = keys;
   }

}