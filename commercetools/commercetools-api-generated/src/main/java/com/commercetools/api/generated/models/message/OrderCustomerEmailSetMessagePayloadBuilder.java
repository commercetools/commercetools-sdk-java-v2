package com.commercetools.api.generated.models.message;

import com.commercetools.api.generated.models.message.MessagePayload;
import com.commercetools.api.generated.models.message.OrderCustomerEmailSetMessagePayload;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.databind.*;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class OrderCustomerEmailSetMessagePayloadBuilder {
   
   @Nullable
   private String oldEmail;
   
   @Nullable
   private String email;
   
   public OrderCustomerEmailSetMessagePayloadBuilder oldEmail(@Nullable final String oldEmail) {
      this.oldEmail = oldEmail;
      return this;
   }
   
   public OrderCustomerEmailSetMessagePayloadBuilder email(@Nullable final String email) {
      this.email = email;
      return this;
   }
   
   @Nullable
   public String getOldEmail(){
      return this.oldEmail;
   }
   
   @Nullable
   public String getEmail(){
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