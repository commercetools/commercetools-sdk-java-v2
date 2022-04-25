
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
@JsonDeserialize(as = OrderStateTransitionMessageImpl.class)
public interface OrderStateTransitionMessage extends OrderMessage {

    String ORDER_STATE_TRANSITION = "OrderStateTransition";

    /**
    *  <p><a href="/../api/types#reference">Reference</a> to a <a href="ctp:api:type:State">State</a>.</p>
    */
    @NotNull
    @Valid
    @JsonProperty("state")
    public StateReference getState();

    /**
    *  <p><a href="/../api/types#reference">Reference</a> to a <a href="ctp:api:type:State">State</a>.</p>
    */
    @Valid
    @JsonProperty("oldState")
    public StateReference getOldState();

    @NotNull
    @JsonProperty("force")
    public Boolean getForce();

    public void setState(final StateReference state);

    public void setOldState(final StateReference oldState);

    public void setForce(final Boolean force);

    public static OrderStateTransitionMessage of() {
        return new OrderStateTransitionMessageImpl();
    }

    public static OrderStateTransitionMessage of(final OrderStateTransitionMessage template) {
        OrderStateTransitionMessageImpl instance = new OrderStateTransitionMessageImpl();
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
        instance.setOldState(template.getOldState());
        instance.setForce(template.getForce());
        return instance;
    }

    public static OrderStateTransitionMessageBuilder builder() {
        return OrderStateTransitionMessageBuilder.of();
    }

    public static OrderStateTransitionMessageBuilder builder(final OrderStateTransitionMessage template) {
        return OrderStateTransitionMessageBuilder.of(template);
    }

    default <T> T withOrderStateTransitionMessage(Function<OrderStateTransitionMessage, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<OrderStateTransitionMessage> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<OrderStateTransitionMessage>() {
            @Override
            public String toString() {
                return "TypeReference<OrderStateTransitionMessage>";
            }
        };
    }
}
