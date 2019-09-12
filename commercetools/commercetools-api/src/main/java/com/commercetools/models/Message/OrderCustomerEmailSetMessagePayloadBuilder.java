package com.commercetools.models.Message;

import com.commercetools.models.Message.MessagePayload;
import java.lang.String;
import com.commercetools.models.Message.OrderCustomerEmailSetMessagePayload;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class OrderCustomerEmailSetMessagePayloadBuilder {
   
   @Nullable
   private java.lang.String oldEmail;
   
   @Nullable
   private java.lang.String email;
   
   public OrderCustomerEmailSetMessagePayloadBuilder oldEmail(@Nullable final java.lang.String oldEmail) {
      this.oldEmail = oldEmail;
      return this;
   }
   
   public OrderCustomerEmailSetMessagePayloadBuilder email(@Nullable final java.lang.String email) {
      this.email = email;
      return this;
   }
   
   @Nullable
   public java.lang.String getOldEmail(){
      return this.oldEmail;
   }
   
   @Nullable
   public java.lang.String getEmail(){
      return this.email;
   }

   public OrderCustomerEmailSetMessagePayload build() {
       return new OrderCustomerEmailSetMessagePayloadImpl(oldEmail, email);
   }
   
   public static OrderCustomerEmailSetMessagePayloadBuilder of() {
      return new OrderCustomerEmailSetMessagePayloadBuilder();
   }
   
   public static OrderCustomerEmailSetMessagePayloadBuilder of(final OrderCustomerEmailSetMessagePayload template) {
      OrderCustomerEmailSetMessagePayloadBuilder builder = new OrderCustomerEmailSetMessagePayloadBuilder();
      builder.oldEmail = template.getOldEmail();
      builder.email = template.getEmail();
      return builder;
   }
   
}