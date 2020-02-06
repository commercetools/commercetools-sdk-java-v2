package com.commercetools.importer.models.producttypes;

import com.commercetools.importer.models.producttypes.AttributePlainEnumValue;
import com.commercetools.importer.models.producttypes.AttributeType;
import io.vrap.rmf.base.client.utils.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.annotation.*;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;


@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class AttributeEnumTypeImpl implements AttributeEnumType {

   private String name;
   
   private java.util.List<com.commercetools.importer.models.producttypes.AttributePlainEnumValue> values;

   @JsonCreator
   AttributeEnumTypeImpl(@JsonProperty("values") final java.util.List<com.commercetools.importer.models.producttypes.AttributePlainEnumValue> values) {
      this.values = values;
      this.name = "enum";
   }
   public AttributeEnumTypeImpl() {
      
   }
   
   
   public String getName(){
      return this.name;
   }
   
   
   public java.util.List<com.commercetools.importer.models.producttypes.AttributePlainEnumValue> getValues(){
      return this.values;
   }

   public void setValues(final java.util.List<com.commercetools.importer.models.producttypes.AttributePlainEnumValue> values){
      this.values = values;
   }

}