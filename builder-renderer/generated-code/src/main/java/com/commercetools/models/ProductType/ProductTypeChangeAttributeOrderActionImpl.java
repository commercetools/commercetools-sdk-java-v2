package com.commercetools.models.ProductType;

import com.commercetools.models.ProductType.AttributeDefinition;
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
public final class ProductTypeChangeAttributeOrderActionImpl implements ProductTypeChangeAttributeOrderAction {

   private java.lang.String action;
   
   private java.util.List<com.commercetools.models.ProductType.AttributeDefinition> attributes;

   @JsonCreator
   ProductTypeChangeAttributeOrderActionImpl(@JsonProperty("attributes") final java.util.List<com.commercetools.models.ProductType.AttributeDefinition> attributes) {
      this.attributes = attributes;
      this.action = "changeAttributeOrder";
   }
   public ProductTypeChangeAttributeOrderActionImpl() {
      
   }
   
   
   public java.lang.String getAction(){
      return this.action;
   }
   
   
   public java.util.List<com.commercetools.models.ProductType.AttributeDefinition> getAttributes(){
      return this.attributes;
   }

   public void setAttributes(final java.util.List<com.commercetools.models.ProductType.AttributeDefinition> attributes){
      this.attributes = attributes;
   }

}