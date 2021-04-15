
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
@JsonDeserialize(as = PaymentStatusStateTransitionMessageImpl.class)
public interface PaymentStatusStateTransitionMessage extends Message {

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

    public static PaymentStatusStateTransitionMessage of() {
        return new PaymentStatusStateTransitionMessageImpl();
    }

    public static PaymentStatusStateTransitionMessage of(final PaymentStatusStateTransitionMessage template) {
        PaymentStatusStateTransitionMessageImpl instance = new PaymentStatusStateTransitionMessageImpl();
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
        instance.setState(template.getState());
        instance.setForce(template.getForce());
        return instance;
    }

    public static PaymentStatusStateTransitionMessageBuilder builder() {
        return PaymentStatusStateTransitionMessageBuilder.of();
    }

    public static PaymentStatusStateTransitionMessageBuilder builder(
            final PaymentStatusStateTransitionMessage template) {
        return PaymentStatusStateTransitionMessageBuilder.of(template);
    }

    default <T> T withPaymentStatusStateTransitionMessage(Function<PaymentStatusStateTransitionMessage, T> helper) {
        return helper.apply(this);
    }
}
