package com.commercetools.models.Message;

import com.commercetools.models.Message.MessagePayload;
import java.lang.String;
import com.commercetools.models.Message.CustomerEmailChangedMessagePayload;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class CustomerEmailChangedMessagePayloadBuilder {
   
   
   private java.lang.String email;
   
   public CustomerEmailChangedMessagePayloadBuilder email( final java.lang.String email) {
      this.email = email;
      return this;
   }
   
   
   public java.lang.String getEmail(){
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