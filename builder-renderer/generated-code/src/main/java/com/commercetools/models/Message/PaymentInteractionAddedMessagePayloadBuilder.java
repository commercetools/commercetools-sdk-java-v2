package com.commercetools.models.Message;

import com.commercetools.models.Message.MessagePayload;
import com.commercetools.models.Type.CustomFields;
import java.lang.String;
import com.commercetools.models.Message.PaymentInteractionAddedMessagePayload;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class PaymentInteractionAddedMessagePayloadBuilder {
   
   
   private com.commercetools.models.Type.CustomFields interaction;
   
   public PaymentInteractionAddedMessagePayloadBuilder interaction( final com.commercetools.models.Type.CustomFields interaction) {
      this.interaction = interaction;
      return this;
   }
   
   
   public com.commercetools.models.Type.CustomFields getInteraction(){
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