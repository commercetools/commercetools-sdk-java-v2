package com.commercetools.models.Common;

import com.commercetools.models.Common.ClientLogging;
import com.commercetools.models.Common.LastModifiedByImpl;

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
@JsonDeserialize(as = LastModifiedByImpl.class)
public interface LastModifiedBy extends ClientLogging {


   
   public static LastModifiedByImpl of(){
      return new LastModifiedByImpl();
   }
   

   public static LastModifiedByImpl of(final LastModifiedBy template) {
      LastModifiedByImpl instance = new LastModifiedByImpl();
      instance.setAnonymousId(template.getAnonymousId());
      instance.setClientId(template.getClientId());
      instance.setExternalUserId(template.getExternalUserId());
      instance.setCustomer(template.getCustomer());
      return instance;
   }

}