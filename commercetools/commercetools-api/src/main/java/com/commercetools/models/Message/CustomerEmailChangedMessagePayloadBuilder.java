package com.commercetools.models.message;

import com.commercetools.models.message.MessagePayload;
import com.commercetools.models.message.CustomerEmailChangedMessagePayload;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class CustomerEmailChangedMessagePayloadBuilder {
   
   
   private String email;
   
   public CustomerEmailChangedMessagePayloadBuilder email( final String email) {
      this.email = email;
      return this;
   }
   
   
   public String getEmail(){
      return this.email;
   }

   public CustomerEmailChangedMessagePayload build() {
       return new CustomerEmailChangedMessagePayloadImpl(email);
   }
   
   public static CustomerEmailChangedMessagePayloadBuilder of() {
      return new CustomerEmailChangedMessagePayloadBuilder();
   }
   
   public static CustomerEmailChangedMessagePayloadBuilder of(final CustomerEmailChangedMessagePayload template) {
      CustomerEmailChangedMessagePayloadBuilder builder = new CustomerEmailChangedMessagePayloadBuilder();
      builder.email = template.getEmail();
      return builder;
   }
   
}