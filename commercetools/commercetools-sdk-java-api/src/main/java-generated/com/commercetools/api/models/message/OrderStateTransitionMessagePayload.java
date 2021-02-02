
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
@JsonDeserialize(as = OrderStateTransitionMessagePayloadImpl.class)
public interface OrderStateTransitionMessagePayload extends MessagePayload {

    String ORDER_STATE_TRANSITION = "OrderStateTransition";

    @NotNull
    @Valid
    @JsonProperty("state")
    public StateReference getState();

    @NotNull
    @JsonProperty("force")
    public Boolean getForce();

    public void setState(final StateReference state);

    public void setForce(final Boolean force);

    public static OrderStateTransitionMessagePayload of() {
        return new OrderStateTransitionMessagePayloadImpl();
    }

    public static OrderStateTransitionMessagePayload of(final OrderStateTransitionMessagePayload template) {
        OrderStateTransitionMessagePayloadImpl instance = new OrderStateTransitionMessagePayloadImpl();
        instance.setState(template.getState());
        instance.setForce(template.getForce());
        return instance;
    }

    public static OrderStateTransitionMessagePayloadBuilder builder() {
        return OrderStateTransitionMessagePayloadBuilder.of();
    }

    public static OrderStateTransitionMessagePayloadBuilder builder(final OrderStateTransitionMessagePayload template) {
        return OrderStateTransitionMessagePayloadBuilder.of(template);
    }

    default <T> T withOrderStateTransitionMessagePayload(Function<OrderStateTransitionMessagePayload, T> helper) {
        return helper.apply(this);
    }
}
