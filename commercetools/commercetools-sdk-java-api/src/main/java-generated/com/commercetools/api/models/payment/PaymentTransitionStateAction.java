
package com.commercetools.api.models.payment;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.state.StateResourceIdentifier;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = PaymentTransitionStateActionImpl.class)
public interface PaymentTransitionStateAction extends PaymentUpdateAction {

    String TRANSITION_STATE = "transitionState";

    @NotNull
    @Valid
    @JsonProperty("state")
    public StateResourceIdentifier getState();

    @JsonProperty("force")
    public Boolean getForce();

    public void setState(final StateResourceIdentifier state);

    public void setForce(final Boolean force);

    public static PaymentTransitionStateAction of() {
        return new PaymentTransitionStateActionImpl();
    }

    public static PaymentTransitionStateAction of(final PaymentTransitionStateAction template) {
        PaymentTransitionStateActionImpl instance = new PaymentTransitionStateActionImpl();
        instance.setState(template.getState());
        instance.setForce(template.getForce());
        return instance;
    }

    public static PaymentTransitionStateActionBuilder builder() {
        return PaymentTransitionStateActionBuilder.of();
    }

    public static PaymentTransitionStateActionBuilder builder(final PaymentTransitionStateAction template) {
        return PaymentTransitionStateActionBuilder.of(template);
    }

    default <T> T withPaymentTransitionStateAction(Function<PaymentTransitionStateAction, T> helper) {
        return helper.apply(this);
    }
}
