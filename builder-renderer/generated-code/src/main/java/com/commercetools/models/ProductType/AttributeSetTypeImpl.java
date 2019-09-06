package com.commercetools.models.ProductType;

import com.commercetools.models.ProductType.AttributeType;
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
public final class AttributeSetTypeImpl implements AttributeSetType {

   private java.lang.String name;
   
   private com.commercetools.models.ProductType.AttributeType elementType;

   @JsonCreator
   AttributeSetTypeImpl(@JsonProperty("elementType") final com.commercetools.models.ProductType.AttributeType elementType) {
      this.elementType = elementType;
      this.name = "set";
   }
   public AttributeSetTypeImpl() {
      
   }
   
   
   public java.lang.String getName(){
      return this.name;
   }
   
   
   public com.commercetools.models.ProductType.AttributeType getElementType(){
      return this.elementType;
   }

   public void setElementType(final com.commercetools.models.ProductType.AttributeType elementType){
      this.elementType = elementType;
   }

}