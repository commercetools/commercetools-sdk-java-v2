
package com.commercetools.api.models.message;

import java.time.*;
import java.util.*;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class PaymentInteractionAddedMessagePayloadImpl implements PaymentInteractionAddedMessagePayload {

    private String type;

    private com.commercetools.api.models.type.CustomFields interaction;

    @JsonCreator
    PaymentInteractionAddedMessagePayloadImpl(
            @JsonProperty("interaction") final com.commercetools.api.models.type.CustomFields interaction) {
        this.interaction = interaction;
        this.type = PAYMENT_INTERACTION_ADDED;
    }

    public PaymentInteractionAddedMessagePayloadImpl() {
        this.type = PAYMENT_INTERACTION_ADDED;
    }

    public String getType() {
        return this.type;
    }

    public com.commercetools.api.models.type.CustomFields getInteraction() {
        return this.interaction;
    }

    public void setInteraction(final com.commercetools.api.models.type.CustomFields interaction) {
        this.interaction = interaction;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        PaymentInteractionAddedMessagePayloadImpl that = (PaymentInteractionAddedMessagePayloadImpl) o;

        return new EqualsBuilder().append(type, that.type).append(interaction, that.interaction).isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(type).append(interaction).toHashCode();
    }

}
