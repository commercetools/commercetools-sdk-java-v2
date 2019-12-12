package com.commercetools.api.generated.models.type;

import com.commercetools.api.generated.models.type.CustomFieldLocalizedEnumValue;
import com.commercetools.api.generated.models.type.FieldType;
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
public final class CustomFieldLocalizedEnumTypeImpl implements CustomFieldLocalizedEnumType {

   private String name;
   
   private java.util.List<com.commercetools.api.generated.models.type.CustomFieldLocalizedEnumValue> values;

   @JsonCreator
   CustomFieldLocalizedEnumTypeImpl(@JsonProperty("values") final java.util.List<com.commercetools.api.generated.models.type.CustomFieldLocalizedEnumValue> values) {
      this.values = values;
      this.name = "LocalizedEnum";
   }
   public CustomFieldLocalizedEnumTypeImpl() {
      
   }
   
   
   public String getName(){
      return this.name;
   }
   
   
   public java.util.List<com.commercetools.api.generated.models.type.CustomFieldLocalizedEnumValue> getValues(){
      return this.values;
   }

   public void setValues(final java.util.List<com.commercetools.api.generated.models.type.CustomFieldLocalizedEnumValue> values){
      this.values = values;
   }

}