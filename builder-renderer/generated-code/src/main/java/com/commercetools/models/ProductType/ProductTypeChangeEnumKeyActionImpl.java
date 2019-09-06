package com.commercetools.models.ProductType;

import com.commercetools.models.ProductType.ProductTypeUpdateAction;
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
public final class ProductTypeChangeEnumKeyActionImpl implements ProductTypeChangeEnumKeyAction {

   private java.lang.String action;
   
   private java.lang.String newKey;
   
   private java.lang.String attributeName;
   
   private java.lang.String key;

   @JsonCreator
   ProductTypeChangeEnumKeyActionImpl(@JsonProperty("newKey") final java.lang.String newKey, @JsonProperty("attributeName") final java.lang.String attributeName, @JsonProperty("key") final java.lang.String key) {
      this.newKey = newKey;
      this.attributeName = attributeName;
      this.key = key;
      this.action = "changeEnumKey";
   }
   public ProductTypeChangeEnumKeyActionImpl() {
      
   }
   
   
   public java.lang.String getAction(){
      return this.action;
   }
   
   
   public java.lang.String getNewKey(){
      return this.newKey;
   }
   
   
   public java.lang.String getAttributeName(){
      return this.attributeName;
   }
   
   
   public java.lang.String getKey(){
      return this.key;
   }

   public void setNewKey(final java.lang.String newKey){
      this.newKey = newKey;
   }
   
   public void setAttributeName(final java.lang.String attributeName){
      this.attributeName = attributeName;
   }
   
   public void setKey(final java.lang.String key){
      this.key = key;
   }

}