package com.commercetools.api.models.message;

import com.commercetools.api.models.message.MessagePayload;
import com.commercetools.api.models.type.CustomFields;
import com.commercetools.api.models.message.PaymentInteractionAddedMessagePayloadImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import io.vrap.rmf.base.client.utils.Generated;
import io.vrap.rmf.base.client.Accessor;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;
import java.util.function.Function;
import java.io.IOException;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
@JsonDeserialize(as = PaymentInteractionAddedMessagePayloadImpl.class)
public interface PaymentInteractionAddedMessagePayload extends MessagePayload {

    String PAYMENT_INTERACTION_ADDED = "PaymentInteractionAdded";

    
    @NotNull
    @Valid
    @JsonProperty("interaction")
    public CustomFields getInteraction();

    
    public void setInteraction(final CustomFields interaction);
    

    public static PaymentInteractionAddedMessagePayload of(){
        return new PaymentInteractionAddedMessagePayloadImpl();
    }
    

    public static PaymentInteractionAddedMessagePayload of(final PaymentInteractionAddedMessagePayload template) {
        PaymentInteractionAddedMessagePayloadImpl instance = new PaymentInteractionAddedMessagePayloadImpl();
        instance.setInteraction(template.getInteraction());
        return instance;
    }

    public static PaymentInteractionAddedMessagePayloadBuilder builder(){
        return PaymentInteractionAddedMessagePayloadBuilder.of();
    }
    
    public static PaymentInteractionAddedMessagePayloadBuilder builder(final PaymentInteractionAddedMessagePayload template){
        return PaymentInteractionAddedMessagePayloadBuilder.of(template);
    }
    

    default <T> T withPaymentInteractionAddedMessagePayload(Function<PaymentInteractionAddedMessagePayload, T> helper) {
        return helper.apply(this);
    }
}
