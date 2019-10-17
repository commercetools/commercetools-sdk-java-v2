package com.commercetools.api.generated.models.type;

import com.commercetools.api.generated.models.type.FieldType;
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
public final class CustomFieldSetTypeImpl implements CustomFieldSetType {

   private String name;
   
   private com.commercetools.api.generated.models.type.FieldType elementType;

   @JsonCreator
   CustomFieldSetTypeImpl(@JsonProperty("elementType") final com.commercetools.api.generated.models.type.FieldType elementType) {
      this.elementType = elementType;
      this.name = "Set";
   }
   public CustomFieldSetTypeImpl() {
      
   }
   
   
   public String getName(){
      return this.name;
   }
   
   
   public com.commercetools.api.generated.models.type.FieldType getElementType(){
      return this.elementType;
   }

   public void setElementType(final com.commercetools.api.generated.models.type.FieldType elementType){
      this.elementType = elementType;
   }

}