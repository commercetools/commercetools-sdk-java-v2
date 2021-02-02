
package com.commercetools.api.models.message;

import java.util.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class PaymentInteractionAddedMessagePayloadBuilder {

    private com.commercetools.api.models.type.CustomFields interaction;

    public PaymentInteractionAddedMessagePayloadBuilder interaction(
            final com.commercetools.api.models.type.CustomFields interaction) {
        this.interaction = interaction;
        return this;
    }

    public com.commercetools.api.models.type.CustomFields getInteraction() {
        return this.interaction;
    }

    public PaymentInteractionAddedMessagePayload build() {
        return new PaymentInteractionAddedMessagePayloadImpl(interaction);
    }

    public static PaymentInteractionAddedMessagePayloadBuilder of() {
        return new PaymentInteractionAddedMessagePayloadBuilder();
    }

    public static PaymentInteractionAddedMessagePayloadBuilder of(
            final PaymentInteractionAddedMessagePayload template) {
        PaymentInteractionAddedMessagePayloadBuilder builder = new PaymentInteractionAddedMessagePayloadBuilder();
        builder.interaction = template.getInteraction();
        return builder;
    }

}
