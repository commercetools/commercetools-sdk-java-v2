
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

/**
 *  <p>Generated after a successful Transition State update action.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     OrderStateTransitionMessagePayload orderStateTransitionMessagePayload = OrderStateTransitionMessagePayload.builder()
 *             .state(stateBuilder -> stateBuilder)
 *             .force(true)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = OrderStateTransitionMessagePayloadImpl.class)
public interface OrderStateTransitionMessagePayload extends OrderMessagePayload {

    String ORDER_STATE_TRANSITION = "OrderStateTransition";

    /**
     *  <p>OrderState after the Transition State update action.</p>
     * @return state
     */
    @NotNull
    @Valid
    @JsonProperty("state")
    public StateReference getState();

    /**
     *  <p>OrderState before the Transition State update action.</p>
     * @return oldState
     */
    @Valid
    @JsonProperty("oldState")
    public StateReference getOldState();

    /**
     *  <p>Whether State transition validations were turned off during the Transition State update action.</p>
     * @return force
     */
    @NotNull
    @JsonProperty("force")
    public Boolean getForce();

    public void setState(final StateReference state);

    public void setOldState(final StateReference oldState);

    public void setForce(final Boolean force);

    public static OrderStateTransitionMessagePayload of() {
        return new OrderStateTransitionMessagePayloadImpl();
    }

    public static OrderStateTransitionMessagePayload of(final OrderStateTransitionMessagePayload template) {
        OrderStateTransitionMessagePayloadImpl instance = new OrderStateTransitionMessagePayloadImpl();
        instance.setState(template.getState());
        instance.setOldState(template.getOldState());
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

    public static com.fasterxml.jackson.core.type.TypeReference<OrderStateTransitionMessagePayload> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<OrderStateTransitionMessagePayload>() {
            @Override
            public String toString() {
                return "TypeReference<OrderStateTransitionMessagePayload>";
            }
        };
    }
}
