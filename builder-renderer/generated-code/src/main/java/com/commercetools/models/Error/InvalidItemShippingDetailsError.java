package com.commercetools.models.Error;

import com.commercetools.models.Error.ErrorObject;
import java.lang.String;
import com.commercetools.models.Error.InvalidItemShippingDetailsErrorImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import javax.annotation.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Map;
import java.time.*;

import json.CommercetoolsJsonUtils;
import java.io.IOException;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
@JsonDeserialize(as = InvalidItemShippingDetailsErrorImpl.class)
public interface InvalidItemShippingDetailsError extends ErrorObject {

   
   @NotNull
   @JsonProperty("subject")
   public String getSubject();
   
   @NotNull
   @JsonProperty("itemId")
   public String getItemId();

   public void setSubject(final String subject);
   
   public void setItemId(final String itemId);
   
   public static InvalidItemShippingDetailsErrorImpl of(){
      return new InvalidItemShippingDetailsErrorImpl();
   }
   

   public static InvalidItemShippingDetailsErrorImpl of(final InvalidItemShippingDetailsError template) {
      InvalidItemShippingDetailsErrorImpl instance = new InvalidItemShippingDetailsErrorImpl();
      instance.setMessage(template.getMessage());
      instance.setItemId(template.getItemId());
      instance.setSubject(template.getSubject());
      return instance;
   }

}