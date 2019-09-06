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
public final class ProductTypeChangeAttributeNameActionImpl implements ProductTypeChangeAttributeNameAction {

   private java.lang.String action;
   
   private java.lang.String newAttributeName;
   
   private java.lang.String attributeName;

   @JsonCreator
   ProductTypeChangeAttributeNameActionImpl(@JsonProperty("newAttributeName") final java.lang.String newAttributeName, @JsonProperty("attributeName") final java.lang.String attributeName) {
      this.newAttributeName = newAttributeName;
      this.attributeName = attributeName;
      this.action = "changeAttributeName";
   }
   public ProductTypeChangeAttributeNameActionImpl() {
      
   }
   
   
   public java.lang.String getAction(){
      return this.action;
   }
   
   
   public java.lang.String getNewAttributeName(){
      return this.newAttributeName;
   }
   
   
   public java.lang.String getAttributeName(){
      return this.attributeName;
   }

   public void setNewAttributeName(final java.lang.String newAttributeName){
      this.newAttributeName = newAttributeName;
   }
   
   public void setAttributeName(final java.lang.String attributeName){
      this.attributeName = attributeName;
   }

}