package com.commercetools.api.generated.models.product_type;

import com.commercetools.api.generated.models.product_type.AttributePlainEnumValue;
import com.commercetools.api.generated.models.product_type.AttributeType;
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
public final class AttributeEnumTypeImpl implements AttributeEnumType {

   private String name;
   
   private java.util.List<com.commercetools.api.generated.models.product_type.AttributePlainEnumValue> values;

   @JsonCreator
   AttributeEnumTypeImpl(@JsonProperty("values") final java.util.List<com.commercetools.api.generated.models.product_type.AttributePlainEnumValue> values) {
      this.values = values;
      this.name = "enum";
   }
   public AttributeEnumTypeImpl() {
      
   }
   
   
   public String getName(){
      return this.name;
   }
   
   
   public java.util.List<com.commercetools.api.generated.models.product_type.AttributePlainEnumValue> getValues(){
      return this.values;
   }

   public void setValues(final java.util.List<com.commercetools.api.generated.models.product_type.AttributePlainEnumValue> values){
      this.values = values;
   }

}