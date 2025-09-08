
package com.commercetools.api.models.recurring_order;

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
 *  <p>If the existing <a href="https://docs.commercetools.com/apis/ctp:api:type:State" rel="nofollow">State</a> has set <code>transitions</code>, there must be a direct transition to the new State. If <code>transitions</code> is not set, no validation is performed.</p>
 *  <p>This update action produces the <a href="https://docs.commercetools.com/apis/ctp:api:type:RecurringOrderStateTransitionMessage" rel="nofollow">Recurring Order State Transition</a> Message.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     RecurringOrderTransitionStateAction recurringOrderTransitionStateAction = RecurringOrderTransitionStateAction.builder()
 *             .state(stateBuilder -> stateBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("transitionState")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = RecurringOrderTransitionStateActionImpl.class)
public interface RecurringOrderTransitionStateAction extends RecurringOrderUpdateAction {

    /**
     * discriminator value for RecurringOrderTransitionStateAction
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
     * @return instance of RecurringOrderTransitionStateAction
     */
    public static RecurringOrderTransitionStateAction of() {
        return new RecurringOrderTransitionStateActionImpl();
    }

    /**
     * factory method to create a shallow copy RecurringOrderTransitionStateAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static RecurringOrderTransitionStateAction of(final RecurringOrderTransitionStateAction template) {
        RecurringOrderTransitionStateActionImpl instance = new RecurringOrderTransitionStateActionImpl();
        instance.setState(template.getState());
        instance.setForce(template.getForce());
        return instance;
    }

    public RecurringOrderTransitionStateAction copyDeep();

    /**
     * factory method to create a deep copy of RecurringOrderTransitionStateAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static RecurringOrderTransitionStateAction deepCopy(
            @Nullable final RecurringOrderTransitionStateAction template) {
        if (template == null) {
            return null;
        }
        RecurringOrderTransitionStateActionImpl instance = new RecurringOrderTransitionStateActionImpl();
        instance.setState(com.commercetools.api.models.state.StateResourceIdentifier.deepCopy(template.getState()));
        instance.setForce(template.getForce());
        return instance;
    }

    /**
     * builder factory method for RecurringOrderTransitionStateAction
     * @return builder
     */
    public static RecurringOrderTransitionStateActionBuilder builder() {
        return RecurringOrderTransitionStateActionBuilder.of();
    }

    /**
     * create builder for RecurringOrderTransitionStateAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static RecurringOrderTransitionStateActionBuilder builder(
            final RecurringOrderTransitionStateAction template) {
        return RecurringOrderTransitionStateActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withRecurringOrderTransitionStateAction(Function<RecurringOrderTransitionStateAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<RecurringOrderTransitionStateAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<RecurringOrderTransitionStateAction>() {
            @Override
            public String toString() {
                return "TypeReference<RecurringOrderTransitionStateAction>";
            }
        };
    }
}
