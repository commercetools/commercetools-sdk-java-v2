package com.commercetools.api.generated.models.subscription;

import com.commercetools.api.generated.models.subscription.DeliveryFormat;
import io.vrap.rmf.base.client.utils.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.annotation.*;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;


@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class DeliveryCloudEventsFormatImpl implements DeliveryCloudEventsFormat {

   private String type;
   
   private String cloudEventsVersion;

   @JsonCreator
   DeliveryCloudEventsFormatImpl(@JsonProperty("cloudEventsVersion") final String cloudEventsVersion) {
      this.cloudEventsVersion = cloudEventsVersion;
      this.type = "CloudEvents";
   }
   public DeliveryCloudEventsFormatImpl() {
      
   }
   
   
   public String getType(){
      return this.type;
   }
   
   
   public String getCloudEventsVersion(){
      return this.cloudEventsVersion;
   }

   public void setCloudEventsVersion(final String cloudEventsVersion){
      this.cloudEventsVersion = cloudEventsVersion;
   }

}