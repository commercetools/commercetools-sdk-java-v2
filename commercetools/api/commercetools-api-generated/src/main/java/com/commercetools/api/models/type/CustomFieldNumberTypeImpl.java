package com.commercetools.api.models.type;

import com.commercetools.api.models.type.FieldType;
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
public final class CustomFieldNumberTypeImpl implements CustomFieldNumberType {

   private String name;

   @JsonCreator
   CustomFieldNumberTypeImpl() {
      this.name = "Number";
   }
   
   
   
   public String getName(){
      return this.name;
   }


}
