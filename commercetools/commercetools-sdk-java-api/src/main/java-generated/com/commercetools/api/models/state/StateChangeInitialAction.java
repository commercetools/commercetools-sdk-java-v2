
package com.commercetools.api.models.state;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * StateChangeInitialAction
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     StateChangeInitialAction stateChangeInitialAction = StateChangeInitialAction.builder()
 *             .initial(true)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = StateChangeInitialActionImpl.class)
public interface StateChangeInitialAction extends StateUpdateAction {

    /**
     * discriminator value for StateChangeInitialAction
     */
    String CHANGE_INITIAL = "changeInitial";

    /**
     *  <p>Set to <code>true</code> for defining the State as initial State in a state machine and making it the first step in a workflow.</p>
     * @return initial
     */
    @NotNull
    @JsonProperty("initial")
    public Boolean getInitial();

    /**
     *  <p>Set to <code>true</code> for defining the State as initial State in a state machine and making it the first step in a workflow.</p>
     * @param initial value to be set
     */

    public void setInitial(final Boolean initial);

    /**
     * factory method
     * @return instance of StateChangeInitialAction
     */
    public static StateChangeInitialAction of() {
        return new StateChangeInitialActionImpl();
    }

    /**
     * factory method to copy an instance of StateChangeInitialAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static StateChangeInitialAction of(final StateChangeInitialAction template) {
        StateChangeInitialActionImpl instance = new StateChangeInitialActionImpl();
        instance.setInitial(template.getInitial());
        return instance;
    }

    /**
     * builder factory method for StateChangeInitialAction
     * @return builder
     */
    public static StateChangeInitialActionBuilder builder() {
        return StateChangeInitialActionBuilder.of();
    }

    /**
     * create builder for StateChangeInitialAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static StateChangeInitialActionBuilder builder(final StateChangeInitialAction template) {
        return StateChangeInitialActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withStateChangeInitialAction(Function<StateChangeInitialAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<StateChangeInitialAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<StateChangeInitialAction>() {
            @Override
            public String toString() {
                return "TypeReference<StateChangeInitialAction>";
            }
        };
    }
}
