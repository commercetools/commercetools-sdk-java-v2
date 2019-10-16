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
public final class CustomFieldLocalizedStringTypeImpl implements CustomFieldLocalizedStringType {

   private String name;

   @JsonCreator
   CustomFieldLocalizedStringTypeImpl() {
      this.name = "LocalizedString";
   }
   
   
   
   public String getName(){
      return this.name;
   }


}