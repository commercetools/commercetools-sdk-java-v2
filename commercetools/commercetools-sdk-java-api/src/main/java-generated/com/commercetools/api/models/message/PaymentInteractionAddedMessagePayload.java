
package com.commercetools.api.models.message;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.type.CustomFields;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = PaymentInteractionAddedMessagePayloadImpl.class)
public interface PaymentInteractionAddedMessagePayload extends MessagePayload {

    String PAYMENT_INTERACTION_ADDED = "PaymentInteractionAdded";

    /**
    *  <p>Serves as value of the <code>custom</code> field on a resource or data type customized with a <a href="ctp:api:type:Type">Type</a>.</p>
    */
    @NotNull
    @Valid
    @JsonProperty("interaction")
    public CustomFields getInteraction();

    public void setInteraction(final CustomFields interaction);

    public static PaymentInteractionAddedMessagePayload of() {
        return new PaymentInteractionAddedMessagePayloadImpl();
    }

    public static PaymentInteractionAddedMessagePayload of(final PaymentInteractionAddedMessagePayload template) {
        PaymentInteractionAddedMessagePayloadImpl instance = new PaymentInteractionAddedMessagePayloadImpl();
        instance.setInteraction(template.getInteraction());
        return instance;
    }

    public static PaymentInteractionAddedMessagePayloadBuilder builder() {
        return PaymentInteractionAddedMessagePayloadBuilder.of();
    }

    public static PaymentInteractionAddedMessagePayloadBuilder builder(
            final PaymentInteractionAddedMessagePayload template) {
        return PaymentInteractionAddedMessagePayloadBuilder.of(template);
    }

    default <T> T withPaymentInteractionAddedMessagePayload(Function<PaymentInteractionAddedMessagePayload, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<PaymentInteractionAddedMessagePayload> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<PaymentInteractionAddedMessagePayload>() {
            @Override
            public String toString() {
                return "TypeReference<PaymentInteractionAddedMessagePayload>";
            }
        };
    }
}
