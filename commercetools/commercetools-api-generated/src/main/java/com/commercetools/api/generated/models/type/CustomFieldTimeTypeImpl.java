package com.commercetools.api.generated.models.type;

import com.commercetools.api.generated.models.type.FieldType;
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
public final class CustomFieldTimeTypeImpl implements CustomFieldTimeType {

   private String name;

   @JsonCreator
   CustomFieldTimeTypeImpl() {
      this.name = "Time";
   }
   
   
   
   public String getName(){
      return this.name;
   }


}