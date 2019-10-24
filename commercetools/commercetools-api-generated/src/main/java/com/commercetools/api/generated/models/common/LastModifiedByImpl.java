package com.commercetools.api.generated.models.common;

import com.commercetools.api.generated.models.common.ClientLogging;
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
public final class LastModifiedByImpl implements LastModifiedBy {

   private String anonymousId;
   
   private String clientId;
   
   private String externalUserId;
   
   private com.commercetools.api.generated.models.customer.CustomerReference customer;

   @JsonCreator
   LastModifiedByImpl(@JsonProperty("anonymousId") final String anonymousId, @JsonProperty("clientId") final String clientId, @JsonProperty("externalUserId") final String externalUserId, @JsonProperty("customer") final com.commercetools.api.generated.models.customer.CustomerReference customer) {
      this.anonymousId = anonymousId;
      this.clientId = clientId;
      this.externalUserId = externalUserId;
      this.customer = customer;
   }
   public LastModifiedByImpl() {
      
   }
   
   
   public String getAnonymousId(){
      return this.anonymousId;
   }
   
   
   public String getClientId(){
      return this.clientId;
   }
   
   
   public String getExternalUserId(){
      return this.externalUserId;
   }
   
   
   public com.commercetools.api.generated.models.customer.CustomerReference getCustomer(){
      return this.customer;
   }

   public void setAnonymousId(final String anonymousId){
      this.anonymousId = anonymousId;
   }
   
   public void setClientId(final String clientId){
      this.clientId = clientId;
   }
   
   public void setExternalUserId(final String externalUserId){
      this.externalUserId = externalUserId;
   }
   
   public void setCustomer(final com.commercetools.api.generated.models.customer.CustomerReference customer){
      this.customer = customer;
   }

}