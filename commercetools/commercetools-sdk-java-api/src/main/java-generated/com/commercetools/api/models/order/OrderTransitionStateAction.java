
package com.commercetools.api.models.order;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.state.StateResourceIdentifier;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * OrderTransitionStateAction
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
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = OrderTransitionStateActionImpl.class)
public interface OrderTransitionStateAction extends OrderUpdateAction {

    /**
     * discriminator value for OrderTransitionStateAction
     */
    String TRANSITION_STATE = "transitionState";

    /**
     *  <p>ResourceIdentifier to a State.</p>
     * @return state
     */
    @NotNull
    @Valid
    @JsonProperty("state")
    public StateResourceIdentifier getState();

    /**
     *
     * @return force
     */

    @JsonProperty("force")
    public Boolean getForce();

    /**
     *  <p>ResourceIdentifier to a State.</p>
     * @param state value to be set
     */

    public void setState(final StateResourceIdentifier state);

    /**
     * set force
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
