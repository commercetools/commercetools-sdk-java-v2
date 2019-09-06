package com.commercetools.models.ProductType;

import com.commercetools.models.ProductType.AttributePlainEnumValue;
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
public final class ProductTypeAddPlainEnumValueActionImpl implements ProductTypeAddPlainEnumValueAction {

   private java.lang.String action;
   
   private java.lang.String attributeName;
   
   private com.commercetools.models.ProductType.AttributePlainEnumValue value;

   @JsonCreator
   ProductTypeAddPlainEnumValueActionImpl(@JsonProperty("attributeName") final java.lang.String attributeName, @JsonProperty("value") final com.commercetools.models.ProductType.AttributePlainEnumValue value) {
      this.attributeName = attributeName;
      this.value = value;
      this.action = "addPlainEnumValue";
   }
   public ProductTypeAddPlainEnumValueActionImpl() {
      
   }
   
   
   public java.lang.String getAction(){
      return this.action;
   }
   
   
   public java.lang.String getAttributeName(){
      return this.attributeName;
   }
   
   
   public com.commercetools.models.ProductType.AttributePlainEnumValue getValue(){
      return this.value;
   }

   public void setAttributeName(final java.lang.String attributeName){
      this.attributeName = attributeName;
   }
   
   public void setValue(final com.commercetools.models.ProductType.AttributePlainEnumValue value){
      this.value = value;
   }

}