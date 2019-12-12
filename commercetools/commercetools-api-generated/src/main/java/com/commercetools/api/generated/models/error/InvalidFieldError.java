package com.commercetools.api.generated.models.error;

import com.commercetools.api.generated.models.error.ErrorObject;
import com.commercetools.api.generated.models.error.InvalidFieldErrorImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.annotation.*;
import io.vrap.rmf.base.client.utils.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Map;
import java.time.*;

import java.io.IOException;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
@JsonDeserialize(as = InvalidFieldErrorImpl.class)
public interface InvalidFieldError extends ErrorObject {

   
   @NotNull
   @JsonProperty("field")
   public String getField();
   
   @NotNull
   @JsonProperty("invalidValue")
   public JsonNode getInvalidValue();
   
   
   @JsonProperty("allowedValues")
   public List<JsonNode> getAllowedValues();

   public void setField(final String field);
   
   public void setInvalidValue(final JsonNode invalidValue);
   
   public void setAllowedValues(final List<JsonNode> allowedValues);
   
   public static InvalidFieldErrorImpl of(){
      return new InvalidFieldErrorImpl();
   }
   

   public static InvalidFieldErrorImpl of(final InvalidFieldError template) {
      InvalidFieldErrorImpl instance = new InvalidFieldErrorImpl();
      instance.setMessage(template.getMessage());
      instance.setAllowedValues(template.getAllowedValues());
      instance.setField(template.getField());
      instance.setInvalidValue(template.getInvalidValue());
      return instance;
   }

}