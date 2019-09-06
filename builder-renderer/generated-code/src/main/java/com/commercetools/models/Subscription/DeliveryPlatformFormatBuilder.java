package com.commercetools.models.Subscription;

import com.commercetools.models.Subscription.DeliveryFormat;
import java.lang.String;
import com.commercetools.models.Subscription.DeliveryPlatformFormat;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class DeliveryPlatformFormatBuilder {
   
   
   

   public DeliveryPlatformFormat build() {
       return new DeliveryPlatformFormatImpl();
   }
   
   public static DeliveryPlatformFormatBuilder of() {
      return new DeliveryPlatformFormatBuilder();
   }
   
   public static DeliveryPlatformFormatBuilder of(final DeliveryPlatformFormat template) {
      DeliveryPlatformFormatBuilder builder = new DeliveryPlatformFormatBuilder();
      return builder;
   }
   
}