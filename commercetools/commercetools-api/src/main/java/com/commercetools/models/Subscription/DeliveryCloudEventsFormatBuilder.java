package com.commercetools.models.subscription;

import com.commercetools.models.subscription.DeliveryFormat;
import com.commercetools.models.subscription.DeliveryCloudEventsFormat;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class DeliveryCloudEventsFormatBuilder {
   
   
   private String cloudEventsVersion;
   
   public DeliveryCloudEventsFormatBuilder cloudEventsVersion( final String cloudEventsVersion) {
      this.cloudEventsVersion = cloudEventsVersion;
      return this;
   }
   
   
   public String getCloudEventsVersion(){
      return this.cloudEventsVersion;
   }

   public DeliveryCloudEventsFormat build() {
       return new DeliveryCloudEventsFormatImpl(cloudEventsVersion);
   }
   
   public static DeliveryCloudEventsFormatBuilder of() {
      return new DeliveryCloudEventsFormatBuilder();
   }
   
   public static DeliveryCloudEventsFormatBuilder of(final DeliveryCloudEventsFormat template) {
      DeliveryCloudEventsFormatBuilder builder = new DeliveryCloudEventsFormatBuilder();
      builder.cloudEventsVersion = template.getCloudEventsVersion();
      return builder;
   }
   
}