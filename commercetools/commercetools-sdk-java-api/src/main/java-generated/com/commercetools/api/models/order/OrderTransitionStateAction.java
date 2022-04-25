
package com.commercetools.api.models.order;

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
@JsonDeserialize(as = OrderTransitionStateActionImpl.class)
public interface OrderTransitionStateAction extends OrderUpdateAction {

    String TRANSITION_STATE = "transitionState";

    /**
    *  <p><a href="/../api/types#resourceidentifier">ResourceIdentifier</a> to a <a href="ctp:api:type:State">State</a>.</p>
    */
    @NotNull
    @Valid
    @JsonProperty("state")
    public StateResourceIdentifier getState();

    @JsonProperty("force")
    public Boolean getForce();

    public void setState(final StateResourceIdentifier state);

    public void setForce(final Boolean force);

    public static OrderTransitionStateAction of() {
        return new OrderTransitionStateActionImpl();
    }

    public static OrderTransitionStateAction of(final OrderTransitionStateAction template) {
        OrderTransitionStateActionImpl instance = new OrderTransitionStateActionImpl();
        instance.setState(template.getState());
        instance.setForce(template.getForce());
        return instance;
    }

    public static OrderTransitionStateActionBuilder builder() {
        return OrderTransitionStateActionBuilder.of();
    }

    public static OrderTransitionStateActionBuilder builder(final OrderTransitionStateAction template) {
        return OrderTransitionStateActionBuilder.of(template);
    }

    default <T> T withOrderTransitionStateAction(Function<OrderTransitionStateAction, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<OrderTransitionStateAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<OrderTransitionStateAction>() {
            @Override
            public String toString() {
                return "TypeReference<OrderTransitionStateAction>";
            }
        };
    }
}
