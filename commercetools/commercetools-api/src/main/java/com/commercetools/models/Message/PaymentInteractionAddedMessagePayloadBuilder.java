package com.commercetools.models.message;

import com.commercetools.models.message.MessagePayload;
import com.commercetools.models.type.CustomFields;
import com.commercetools.models.message.PaymentInteractionAddedMessagePayload;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class PaymentInteractionAddedMessagePayloadBuilder {
   
   
   private com.commercetools.models.type.CustomFields interaction;
   
   public PaymentInteractionAddedMessagePayloadBuilder interaction( final com.commercetools.models.type.CustomFields interaction) {
      this.interaction = interaction;
      return this;
   }
   
   
   public com.commercetools.models.type.CustomFields getInteraction(){
      return this.interaction;
   }

   public PaymentInteractionAddedMessagePayload build() {
       return new PaymentInteractionAddedMessagePayloadImpl(interaction);
   }
   
   public static PaymentInteractionAddedMessagePayloadBuilder of() {
      return new PaymentInteractionAddedMessagePayloadBuilder();
   }
   
   public static PaymentInteractionAddedMessagePayloadBuilder of(final PaymentInteractionAddedMessagePayload template) {
      PaymentInteractionAddedMessagePayloadBuilder builder = new PaymentInteractionAddedMessagePayloadBuilder();
      builder.interaction = template.getInteraction();
      return builder;
   }
   
}