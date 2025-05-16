
package com.commercetools.api.models.order;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.commercetools.api.models.state.StateResourceIdentifier;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

/**
 *  <p>If the existing State has set <code>transitions</code>, there must be a direct transition to the new State. If <code>transitions</code> is not set, no validation is performed.</p>
 *  <p>This update action produces the Order State Transition Message.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     OrderTransitionStateAction orderTransitionStateAction = OrderTransitionStateAction.builder()
 *             .state(stateBuilder -> stateBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("transitionState")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = OrderTransitionStateActionImpl.class)
public interface OrderTransitionStateAction extends OrderUpdateAction {

    /**
     * discriminator value for OrderTransitionStateAction
     */
    String TRANSITION_STATE = "transitionState";

    /**
     *  <p>Value to set. If there is no State yet, the new State must be an initial State.</p>
     * @return state
     */
    @NotNull
    @Valid
    @JsonProperty("state")
    public StateResourceIdentifier getState();

    /**
     *  <p>Set to <code>true</code> to turn off validation.</p>
     * @return force
     */

    @JsonProperty("force")
    public Boolean getForce();

    /**
     *  <p>Value to set. If there is no State yet, the new State must be an initial State.</p>
     * @param state value to be set
     */

    public void setState(final StateResourceIdentifier state);

    /**
     *  <p>Set to <code>true</code> to turn off validation.</p>
     * @param force value to be set
     */

    public void setForce(final Boolean force);

    /**
     * factory method
     * @return instance of OrderTransitionStateAction
     */
    public static OrderTransitionStateAction of() {
        return new OrderTransitionStateActionImpl();
    }

    /**
     * factory method to create a shallow copy OrderTransitionStateAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static OrderTransitionStateAction of(final OrderTransitionStateAction template) {
        OrderTransitionStateActionImpl instance = new OrderTransitionStateActionImpl();
        instance.setState(template.getState());
        instance.setForce(template.getForce());
        return instance;
    }

    public OrderTransitionStateAction copyDeep();

    /**
     * factory method to create a deep copy of OrderTransitionStateAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static OrderTransitionStateAction deepCopy(@Nullable final OrderTransitionStateAction template) {
        if (template == null) {
            return null;
        }
        OrderTransitionStateActionImpl instance = new OrderTransitionStateActionImpl();
        instance.setState(com.commercetools.api.models.state.StateResourceIdentifier.deepCopy(template.getState()));
        instance.setForce(template.getForce());
        return instance;
    }

    /**
     * builder factory method for OrderTransitionStateAction
     * @return builder
     */
    public static OrderTransitionStateActionBuilder builder() {
        return OrderTransitionStateActionBuilder.of();
    }

    /**
     * create builder for OrderTransitionStateAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static OrderTransitionStateActionBuilder builder(final OrderTransitionStateAction template) {
        return OrderTransitionStateActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withOrderTransitionStateAction(Function<OrderTransitionStateAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<OrderTransitionStateAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<OrderTransitionStateAction>() {
            @Override
            public String toString() {
                return "TypeReference<OrderTransitionStateAction>";
            }
        };
    }
}
