
package com.commercetools.api.models.message;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class PaymentInteractionAddedMessagePayloadBuilder
        implements Builder<PaymentInteractionAddedMessagePayload> {

    private com.commercetools.api.models.type.CustomFields interaction;

    public PaymentInteractionAddedMessagePayloadBuilder interaction(
            Function<com.commercetools.api.models.type.CustomFieldsBuilder, com.commercetools.api.models.type.CustomFieldsBuilder> builder) {
        this.interaction = builder.apply(com.commercetools.api.models.type.CustomFieldsBuilder.of()).build();
        return this;
    }

    public PaymentInteractionAddedMessagePayloadBuilder interaction(
            final com.commercetools.api.models.type.CustomFields interaction) {
        this.interaction = interaction;
        return this;
    }

    public com.commercetools.api.models.type.CustomFields getInteraction() {
        return this.interaction;
    }

    public PaymentInteractionAddedMessagePayload build() {
        Objects.requireNonNull(interaction, PaymentInteractionAddedMessagePayload.class + ": interaction is missing");
        return new PaymentInteractionAddedMessagePayloadImpl(interaction);
    }

    /**
     * builds PaymentInteractionAddedMessagePayload without checking for non null required values
     */
    public PaymentInteractionAddedMessagePayload buildUnchecked() {
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
