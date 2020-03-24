package com.commercetools.api.generated.models.common;

import com.commercetools.api.generated.models.common.CreatedBy;
import com.commercetools.api.generated.models.common.LastModifiedBy;
import com.commercetools.api.generated.models.customer.CustomerReference;
import com.commercetools.api.generated.models.common.ClientLoggingImpl;

import com.fasterxml.jackson.annotation.*;
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