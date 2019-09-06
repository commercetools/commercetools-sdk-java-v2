package com.commercetools.models.Subscription;

import com.commercetools.models.Subscription.DeliveryFormat;
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
public final class DeliveryCloudEventsFormatImpl implements DeliveryCloudEventsFormat {

   private java.lang.String type;
   
   private java.lang.String cloudEventsVersion;

   @JsonCreator
   DeliveryCloudEventsFormatImpl(@JsonProperty("cloudEventsVersion") final java.lang.String cloudEventsVersion) {
      this.cloudEventsVersion = cloudEventsVersion;
      this.type = "CloudEvents";
   }
   public DeliveryCloudEventsFormatImpl() {
      
   }
   
   
   public java.lang.String getType(){
      return this.type;
   }
   
   
   public java.lang.String getCloudEventsVersion(){
      return this.cloudEventsVersion;
   }

   public void setCloudEventsVersion(final java.lang.String cloudEventsVersion){
      this.cloudEventsVersion = cloudEventsVersion;
   }

}