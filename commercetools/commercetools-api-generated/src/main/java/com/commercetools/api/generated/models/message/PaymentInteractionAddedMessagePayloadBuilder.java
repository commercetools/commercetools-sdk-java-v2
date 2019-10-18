package com.commercetools.api.generated.models.message;

import com.commercetools.api.generated.models.message.MessagePayload;
import com.commercetools.api.generated.models.type.CustomFields;
import com.commercetools.api.generated.models.message.PaymentInteractionAddedMessagePayload;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;
import javax.annotation.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class PaymentInteractionAddedMessagePayloadBuilder {
   
   
   private com.commercetools.api.generated.models.type.CustomFields interaction;
   
   public PaymentInteractionAddedMessagePayloadBuilder interaction( final com.commercetools.api.generated.models.type.CustomFields interaction) {
      this.interaction = interaction;
      return this;
   }
   
   
   public com.commercetools.api.generated.models.type.CustomFields getInteraction(){
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