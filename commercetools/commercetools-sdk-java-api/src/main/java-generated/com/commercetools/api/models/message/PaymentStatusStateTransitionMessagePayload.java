
package com.commercetools.api.models.message;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.state.StateReference;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = PaymentStatusStateTransitionMessagePayloadImpl.class)
public interface PaymentStatusStateTransitionMessagePayload extends MessagePayload {

    String PAYMENT_STATUS_STATE_TRANSITION = "PaymentStatusStateTransition";

    @NotNull
    @Valid
    @JsonProperty("state")
    public StateReference getState();

    @NotNull
    @JsonProperty("force")
    public Boolean getForce();

    public void setState(final StateReference state);

    public void setForce(final Boolean force);

    public static PaymentStatusStateTransitionMessagePayload of() {
        return new PaymentStatusStateTransitionMessagePayloadImpl();
    }

    public static PaymentStatusStateTransitionMessagePayload of(
            final PaymentStatusStateTransitionMessagePayload template) {
        PaymentStatusStateTransitionMessagePayloadImpl instance = new PaymentStatusStateTransitionMessagePayloadImpl();
        instance.setState(template.getState());
        instance.setForce(template.getForce());
        return instance;
    }

    public static PaymentStatusStateTransitionMessagePayloadBuilder builder() {
        return PaymentStatusStateTransitionMessagePayloadBuilder.of();
    }

    public static PaymentStatusStateTransitionMessagePayloadBuilder builder(
            final PaymentStatusStateTransitionMessagePayload template) {
        return PaymentStatusStateTransitionMessagePayloadBuilder.of(template);
    }

    default <T> T withPaymentStatusStateTransitionMessagePayload(
            Function<PaymentStatusStateTransitionMessagePayload, T> helper) {
        return helper.apply(this);
    }
}
