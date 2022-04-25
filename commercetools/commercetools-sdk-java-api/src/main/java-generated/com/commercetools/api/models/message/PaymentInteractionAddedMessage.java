
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
@JsonDeserialize(as = PaymentInteractionAddedMessageImpl.class)
public interface PaymentInteractionAddedMessage extends Message {

    String PAYMENT_INTERACTION_ADDED = "PaymentInteractionAdded";

    /**
    *  <p>Serves as value of the <code>custom</code> field on a resource or data type customized with a <a href="ctp:api:type:Type">Type</a>.</p>
    */
    @NotNull
    @Valid
    @JsonProperty("interaction")
    public CustomFields getInteraction();

    public void setInteraction(final CustomFields interaction);

    public static PaymentInteractionAddedMessage of() {
        return new PaymentInteractionAddedMessageImpl();
    }

    public static PaymentInteractionAddedMessage of(final PaymentInteractionAddedMessage template) {
        PaymentInteractionAddedMessageImpl instance = new PaymentInteractionAddedMessageImpl();
        instance.setId(template.getId());
        instance.setVersion(template.getVersion());
        instance.setCreatedAt(template.getCreatedAt());
        instance.setLastModifiedAt(template.getLastModifiedAt());
        instance.setLastModifiedBy(template.getLastModifiedBy());
        instance.setCreatedBy(template.getCreatedBy());
        instance.setSequenceNumber(template.getSequenceNumber());
        instance.setResource(template.getResource());
        instance.setResourceVersion(template.getResourceVersion());
        instance.setResourceUserProvidedIdentifiers(template.getResourceUserProvidedIdentifiers());
        instance.setInteraction(template.getInteraction());
        return instance;
    }

    public static PaymentInteractionAddedMessageBuilder builder() {
        return PaymentInteractionAddedMessageBuilder.of();
    }

    public static PaymentInteractionAddedMessageBuilder builder(final PaymentInteractionAddedMessage template) {
        return PaymentInteractionAddedMessageBuilder.of(template);
    }

    default <T> T withPaymentInteractionAddedMessage(Function<PaymentInteractionAddedMessage, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<PaymentInteractionAddedMessage> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<PaymentInteractionAddedMessage>() {
            @Override
            public String toString() {
                return "TypeReference<PaymentInteractionAddedMessage>";
            }
        };
    }
}
