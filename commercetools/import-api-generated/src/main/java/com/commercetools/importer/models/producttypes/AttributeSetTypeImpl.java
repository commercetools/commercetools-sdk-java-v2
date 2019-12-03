package com.commercetools.importer.models.producttypes;

import com.commercetools.importer.models.producttypes.AttributeType;
import io.vrap.rmf.base.client.utils.Generated;
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
public final class AttributeSetTypeImpl implements AttributeSetType {

   private String name;
   
   private com.commercetools.importer.models.producttypes.AttributeType elementType;

   @JsonCreator
   AttributeSetTypeImpl(@JsonProperty("elementType") final com.commercetools.importer.models.producttypes.AttributeType elementType) {
      this.elementType = elementType;
      this.name = "set";
   }
   public AttributeSetTypeImpl() {
      
   }
   
   
   public String getName(){
      return this.name;
   }
   
   
   public com.commercetools.importer.models.producttypes.AttributeType getElementType(){
      return this.elementType;
   }

   public void setElementType(final com.commercetools.importer.models.producttypes.AttributeType elementType){
      this.elementType = elementType;
   }

}