package com.commercetools.api.models.error;

import com.commercetools.api.models.error.ErrorObject;
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
public final class EnumValueIsUsedErrorImpl implements EnumValueIsUsedError {

   private String code;

   private String message;

   @JsonCreator
   EnumValueIsUsedErrorImpl(@JsonProperty("message") final String message) {
      this.message = message;
      this.code = "EnumValueIsUsed";
   }
   public EnumValueIsUsedErrorImpl() {

   }


   public String getCode(){
      return this.code;
   }


   public String getMessage(){
      return this.message;
   }

   public void setMessage(final String message){
      this.message = message;
   }

}
