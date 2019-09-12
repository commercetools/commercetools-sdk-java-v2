package com.commercetools.models.Message;

import com.commercetools.models.Message.MessagePayload;
import java.lang.String;
import com.commercetools.models.Message.CustomerEmailVerifiedMessagePayload;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class CustomerEmailVerifiedMessagePayloadBuilder {
   
   
   

   public CustomerEmailVerifiedMessagePayload build() {
       return new CustomerEmailVerifiedMessagePayloadImpl();
   }
   
   public static CustomerEmailVerifiedMessagePayloadBuilder of() {
      return new CustomerEmailVerifiedMessagePayloadBuilder();
   }
   
   public static CustomerEmailVerifiedMessagePayloadBuilder of(final CustomerEmailVerifiedMessagePayload template) {
      CustomerEmailVerifiedMessagePayloadBuilder builder = new CustomerEmailVerifiedMessagePayloadBuilder();
      return builder;
   }
   
}