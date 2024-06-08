
package com.commercetools.api.models.message;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.commercetools.api.models.state.StateReference;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

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

    /**
     * discriminator value for OrderStateTransitionMessagePayload
     */
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

    /**
     *  <p>OrderState after the Transition State update action.</p>
     * @param state value to be set
     */

    public void setState(final StateReference state);

    /**
     *  <p>OrderState before the Transition State update action.</p>
     * @param oldState value to be set
     */

    public void setOldState(final StateReference oldState);

    /**
     *  <p>Whether State transition validations were turned off during the Transition State update action.</p>
     * @param force value to be set
     */

    public void setForce(final Boolean force);

    /**
     * factory method
     * @return instance of OrderStateTransitionMessagePayload
     */
    public static OrderStateTransitionMessagePayload of() {
        return new OrderStateTransitionMessagePayloadImpl();
    }

    /**
     * factory method to create a shallow copy OrderStateTransitionMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    public static OrderStateTransitionMessagePayload of(final OrderStateTransitionMessagePayload template) {
        OrderStateTransitionMessagePayloadImpl instance = new OrderStateTransitionMessagePayloadImpl();
        instance.setState(template.getState());
        instance.setOldState(template.getOldState());
        instance.setForce(template.getForce());
        return instance;
    }

    /**
     * factory method to create a deep copy of OrderStateTransitionMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static OrderStateTransitionMessagePayload deepCopy(
            @Nullable final OrderStateTransitionMessagePayload template) {
        if (template == null) {
            return null;
        }
        OrderStateTransitionMessagePayloadImpl instance = new OrderStateTransitionMessagePayloadImpl();
        instance.setState(com.commercetools.api.models.state.StateReference.deepCopy(template.getState()));
        instance.setOldState(com.commercetools.api.models.state.StateReference.deepCopy(template.getOldState()));
        instance.setForce(template.getForce());
        return instance;
    }

    /**
     * builder factory method for OrderStateTransitionMessagePayload
     * @return builder
     */
    public static OrderStateTransitionMessagePayloadBuilder builder() {
        return OrderStateTransitionMessagePayloadBuilder.of();
    }

    /**
     * create builder for OrderStateTransitionMessagePayload instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static OrderStateTransitionMessagePayloadBuilder builder(final OrderStateTransitionMessagePayload template) {
        return OrderStateTransitionMessagePayloadBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withOrderStateTransitionMessagePayload(Function<OrderStateTransitionMessagePayload, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<OrderStateTransitionMessagePayload> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<OrderStateTransitionMessagePayload>() {
            @Override
            public String toString() {
                return "TypeReference<OrderStateTransitionMessagePayload>";
            }
        };
    }
}
