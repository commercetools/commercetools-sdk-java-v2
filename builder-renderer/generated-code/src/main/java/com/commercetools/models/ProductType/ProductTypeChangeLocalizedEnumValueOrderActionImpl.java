package com.commercetools.models.ProductType;

import com.commercetools.models.ProductType.AttributeLocalizedEnumValue;
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
public final class ProductTypeChangeLocalizedEnumValueOrderActionImpl implements ProductTypeChangeLocalizedEnumValueOrderAction {

   private java.lang.String action;
   
   private java.util.List<com.commercetools.models.ProductType.AttributeLocalizedEnumValue> values;
   
   private java.lang.String attributeName;

   @JsonCreator
   ProductTypeChangeLocalizedEnumValueOrderActionImpl(@JsonProperty("values") final java.util.List<com.commercetools.models.ProductType.AttributeLocalizedEnumValue> values, @JsonProperty("attributeName") final java.lang.String attributeName) {
      this.values = values;
      this.attributeName = attributeName;
      this.action = "changeLocalizedEnumValueOrder";
   }
   public ProductTypeChangeLocalizedEnumValueOrderActionImpl() {
      
   }
   
   
   public java.lang.String getAction(){
      return this.action;
   }
   
   
   public java.util.List<com.commercetools.models.ProductType.AttributeLocalizedEnumValue> getValues(){
      return this.values;
   }
   
   
   public java.lang.String getAttributeName(){
      return this.attributeName;
   }

   public void setValues(final java.util.List<com.commercetools.models.ProductType.AttributeLocalizedEnumValue> values){
      this.values = values;
   }
   
   public void setAttributeName(final java.lang.String attributeName){
      this.attributeName = attributeName;
   }

}