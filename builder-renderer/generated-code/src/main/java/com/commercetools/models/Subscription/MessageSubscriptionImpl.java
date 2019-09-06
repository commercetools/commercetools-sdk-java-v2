package com.commercetools.models.Subscription;

import java.lang.String;
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
public final class MessageSubscriptionImpl implements MessageSubscription {

   private java.util.List<java.lang.String> types;
   
   private java.lang.String resourceTypeId;

   @JsonCreator
   MessageSubscriptionImpl(@JsonProperty("types") final java.util.List<java.lang.String> types, @JsonProperty("resourceTypeId") final java.lang.String resourceTypeId) {
      this.types = types;
      this.resourceTypeId = resourceTypeId;
   }
   public MessageSubscriptionImpl() {
      
   }
   
   
   public java.util.List<java.lang.String> getTypes(){
      return this.types;
   }
   
   
   public java.lang.String getResourceTypeId(){
      return this.resourceTypeId;
   }

   public void setTypes(final java.util.List<java.lang.String> types){
      this.types = types;
   }
   
   public void setResourceTypeId(final java.lang.String resourceTypeId){
      this.resourceTypeId = resourceTypeId;
   }

}