package com.commercetools.models.Common;

import com.commercetools.models.Common.CreatedBy;
import com.commercetools.models.Common.LastModifiedBy;
import com.commercetools.models.Customer.CustomerReference;
import java.lang.String;
import com.commercetools.models.Common.ClientLoggingImpl;

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
@JsonDeserialize(as = ClientLoggingImpl.class)
public interface ClientLogging  {

   
   
   @JsonProperty("clientId")
   public String getClientId();
   
   
   @JsonProperty("externalUserId")
   public String getExternalUserId();
   
   @Valid
   @JsonProperty("customer")
   public CustomerReference getCustomer();
   
   
   @JsonProperty("anonymousId")
   public String getAnonymousId();

   public void setClientId(final String clientId);
   
   public void setExternalUserId(final String externalUserId);
   
   public void setCustomer(final CustomerReference customer);
   
   public void setAnonymousId(final String anonymousId);
   
   public static ClientLoggingImpl of(){
      return new ClientLoggingImpl();
   }
   

   public static ClientLoggingImpl of(final ClientLogging template) {
      ClientLoggingImpl instance = new ClientLoggingImpl();
      instance.setAnonymousId(template.getAnonymousId());
      instance.setClientId(template.getClientId());
      instance.setExternalUserId(template.getExternalUserId());
      instance.setCustomer(template.getCustomer());
      return instance;
   }

}