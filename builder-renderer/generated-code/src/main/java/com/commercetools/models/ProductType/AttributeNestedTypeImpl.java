package com.commercetools.models.ProductType;

import com.commercetools.models.ProductType.AttributeType;
import com.commercetools.models.ProductType.ProductTypeReference;
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
public final class AttributeNestedTypeImpl implements AttributeNestedType {

   private java.lang.String name;
   
   private com.commercetools.models.ProductType.ProductTypeReference typeReference;

   @JsonCreator
   AttributeNestedTypeImpl(@JsonProperty("typeReference") final com.commercetools.models.ProductType.ProductTypeReference typeReference) {
      this.typeReference = typeReference;
      this.name = "nested";
   }
   public AttributeNestedTypeImpl() {
      
   }
   
   
   public java.lang.String getName(){
      return this.name;
   }
   
   
   public com.commercetools.models.ProductType.ProductTypeReference getTypeReference(){
      return this.typeReference;
   }

   public void setTypeReference(final com.commercetools.models.ProductType.ProductTypeReference typeReference){
      this.typeReference = typeReference;
   }

}