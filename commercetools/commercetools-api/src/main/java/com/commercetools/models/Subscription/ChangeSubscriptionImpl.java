package com.commercetools.models.subscription;


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


@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class ChangeSubscriptionImpl implements ChangeSubscription {

   private String resourceTypeId;

   @JsonCreator
   ChangeSubscriptionImpl(@JsonProperty("resourceTypeId") final String resourceTypeId) {
      this.resourceTypeId = resourceTypeId;
   }
   public ChangeSubscriptionImpl() {
      
   }
   
   
   public String getResourceTypeId(){
      return this.resourceTypeId;
   }

   public void setResourceTypeId(final String resourceTypeId){
      this.resourceTypeId = resourceTypeId;
   }

}