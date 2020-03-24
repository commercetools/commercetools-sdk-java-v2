package com.commercetools.api.generated.models.subscription;


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
public final class MessageSubscriptionImpl implements MessageSubscription {

   private java.util.List<String> types;
   
   private String resourceTypeId;

   @JsonCreator
   MessageSubscriptionImpl(@JsonProperty("types") final java.util.List<String> types, @JsonProperty("resourceTypeId") final String resourceTypeId) {
      this.types = types;
      this.resourceTypeId = resourceTypeId;
   }
   public MessageSubscriptionImpl() {
      
   }
   
   
   public java.util.List<String> getTypes(){
      return this.types;
   }
   
   
   public String getResourceTypeId(){
      return this.resourceTypeId;
   }

   public void setTypes(final java.util.List<String> types){
      this.types = types;
   }
   
   public void setResourceTypeId(final String resourceTypeId){
      this.resourceTypeId = resourceTypeId;
   }

}