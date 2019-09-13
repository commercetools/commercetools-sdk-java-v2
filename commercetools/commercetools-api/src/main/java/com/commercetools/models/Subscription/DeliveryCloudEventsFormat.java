package com.commercetools.models.subscription;

import com.commercetools.models.subscription.DeliveryFormat;
import java.lang.String;
import com.commercetools.models.subscription.DeliveryCloudEventsFormatImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import javax.annotation.Generated;
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
@JsonDeserialize(as = DeliveryCloudEventsFormatImpl.class)
public interface DeliveryCloudEventsFormat extends DeliveryFormat {

   
   @NotNull
   @JsonProperty("cloudEventsVersion")
   public String getCloudEventsVersion();

   public void setCloudEventsVersion(final String cloudEventsVersion);
   
   public static DeliveryCloudEventsFormatImpl of(){
      return new DeliveryCloudEventsFormatImpl();
   }
   

   public static DeliveryCloudEventsFormatImpl of(final DeliveryCloudEventsFormat template) {
      DeliveryCloudEventsFormatImpl instance = new DeliveryCloudEventsFormatImpl();
      instance.setCloudEventsVersion(template.getCloudEventsVersion());
      return instance;
   }

}