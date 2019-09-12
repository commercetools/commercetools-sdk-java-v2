package com.commercetools.models.Type;

import com.commercetools.models.Type.FieldType;
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


@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class CustomFieldBooleanTypeImpl implements CustomFieldBooleanType {

   private java.lang.String name;

   @JsonCreator
   CustomFieldBooleanTypeImpl() {
      this.name = "Boolean";
   }
   
   
   
   public java.lang.String getName(){
      return this.name;
   }


}