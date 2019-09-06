package com.commercetools.models.Common;

import com.commercetools.models.Common.ClientLogging;
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

import json.CommercetoolsJsonUtils;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class CreatedByImpl implements CreatedBy {

   private java.lang.String anonymousId;
   
   private java.lang.String clientId;
   
   private java.lang.String externalUserId;
   
   private com.commercetools.models.Customer.CustomerReference customer;

   @JsonCreator
   CreatedByImpl(@JsonProperty("anonymousId") final java.lang.String anonymousId, @JsonProperty("clientId") final java.lang.String clientId, @JsonProperty("externalUserId") final java.lang.String externalUserId, @JsonProperty("customer") final com.commercetools.models.Customer.CustomerReference customer) {
      this.anonymousId = anonymousId;
      this.clientId = clientId;
      this.externalUserId = externalUserId;
      this.customer = customer;
   }
   public CreatedByImpl() {
      
   }
   
   
   public java.lang.String getAnonymousId(){
      return this.anonymousId;
   }
   
   
   public java.lang.String getClientId(){
      return this.clientId;
   }
   
   
   public java.lang.String getExternalUserId(){
      return this.externalUserId;
   }
   
   
   public com.commercetools.models.Customer.CustomerReference getCustomer(){
      return this.customer;
   }

   public void setAnonymousId(final java.lang.String anonymousId){
      this.anonymousId = anonymousId;
   }
   
   public void setClientId(final java.lang.String clientId){
      this.clientId = clientId;
   }
   
   public void setExternalUserId(final java.lang.String externalUserId){
      this.externalUserId = externalUserId;
   }
   
   public void setCustomer(final com.commercetools.models.Customer.CustomerReference customer){
      this.customer = customer;
   }

}