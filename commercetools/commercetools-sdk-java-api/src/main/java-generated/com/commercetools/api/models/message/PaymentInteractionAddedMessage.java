package com.commercetools.api.models.message;

import com.commercetools.api.models.message.Message;
import com.commercetools.api.models.type.CustomFields;
import com.commercetools.api.models.message.PaymentInteractionAddedMessageImpl;

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
@JsonDeserialize(as = PaymentInteractionAddedMessageImpl.class)
public interface PaymentInteractionAddedMessage extends Message {

    
    @NotNull
    @Valid
    @JsonProperty("interaction")
    public CustomFields getInteraction();

    public void setInteraction(final CustomFields interaction);

    public static PaymentInteractionAddedMessageImpl of(){
        return new PaymentInteractionAddedMessageImpl();
    }
    

    public static PaymentInteractionAddedMessageImpl of(final PaymentInteractionAddedMessage template) {
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

    default <T> T withPaymentInteractionAddedMessage(Function<PaymentInteractionAddedMessage, T> helper) {
        return helper.apply(this);
    }
}
