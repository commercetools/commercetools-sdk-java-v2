
package com.commercetools.api.models.state;

import java.time.*;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;

/**
 * StateSetTransitionsAction
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     StateSetTransitionsAction stateSetTransitionsAction = StateSetTransitionsAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("setTransitions")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = StateSetTransitionsActionImpl.class)
public interface StateSetTransitionsAction extends StateUpdateAction {

    /**
     * discriminator value for StateSetTransitionsAction
     */
    String SET_TRANSITIONS = "setTransitions";

    /**
     *  <p>Value to set. If empty, any existing value will be removed.</p>
     *  <p>Possible transformations of the current State to other States of the same <code>type</code> (for example, <em>Initial</em> -&gt; <em>Shipped</em>). When performing a <code>transitionState</code> update action and <code>transitions</code> is set, the currently referenced State must have a transition to the new State.</p>
     *  <p>If <code>transitions</code> is an empty list, it means the current State is a final State and no further transitions are allowed. If <code>transitions</code> is not set, the validation is turned off.</p>
     *  <p>When performing a <code>transitionState</code> update action, any other State of the same <code>type</code> can be transitioned to.</p>
     * @return transitions
     */
    @Valid
    @JsonProperty("transitions")
    public List<StateResourceIdentifier> getTransitions();

    /**
     *  <p>Value to set. If empty, any existing value will be removed.</p>
     *  <p>Possible transformations of the current State to other States of the same <code>type</code> (for example, <em>Initial</em> -&gt; <em>Shipped</em>). When performing a <code>transitionState</code> update action and <code>transitions</code> is set, the currently referenced State must have a transition to the new State.</p>
     *  <p>If <code>transitions</code> is an empty list, it means the current State is a final State and no further transitions are allowed. If <code>transitions</code> is not set, the validation is turned off.</p>
     *  <p>When performing a <code>transitionState</code> update action, any other State of the same <code>type</code> can be transitioned to.</p>
     * @param transitions values to be set
     */

    @JsonIgnore
    public void setTransitions(final StateResourceIdentifier... transitions);

    /**
     *  <p>Value to set. If empty, any existing value will be removed.</p>
     *  <p>Possible transformations of the current State to other States of the same <code>type</code> (for example, <em>Initial</em> -&gt; <em>Shipped</em>). When performing a <code>transitionState</code> update action and <code>transitions</code> is set, the currently referenced State must have a transition to the new State.</p>
     *  <p>If <code>transitions</code> is an empty list, it means the current State is a final State and no further transitions are allowed. If <code>transitions</code> is not set, the validation is turned off.</p>
     *  <p>When performing a <code>transitionState</code> update action, any other State of the same <code>type</code> can be transitioned to.</p>
     * @param transitions values to be set
     */

    public void setTransitions(final List<StateResourceIdentifier> transitions);

    /**
     * factory method
     * @return instance of StateSetTransitionsAction
     */
    public static StateSetTransitionsAction of() {
        return new StateSetTransitionsActionImpl();
    }

    /**
     * factory method to create a shallow copy StateSetTransitionsAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static StateSetTransitionsAction of(final StateSetTransitionsAction template) {
        StateSetTransitionsActionImpl instance = new StateSetTransitionsActionImpl();
        instance.setTransitions(template.getTransitions());
        return instance;
    }

    public StateSetTransitionsAction copyDeep();

    /**
     * factory method to create a deep copy of StateSetTransitionsAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static StateSetTransitionsAction deepCopy(@Nullable final StateSetTransitionsAction template) {
        if (template == null) {
            return null;
        }
        StateSetTransitionsActionImpl instance = new StateSetTransitionsActionImpl();
        instance.setTransitions(Optional.ofNullable(template.getTransitions())
                .map(t -> t.stream()
                        .map(com.commercetools.api.models.state.StateResourceIdentifier::deepCopy)
                        .collect(Collectors.toList()))
                .orElse(null));
        return instance;
    }

    /**
     * builder factory method for StateSetTransitionsAction
     * @return builder
     */
    public static StateSetTransitionsActionBuilder builder() {
        return StateSetTransitionsActionBuilder.of();
    }

    /**
     * create builder for StateSetTransitionsAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static StateSetTransitionsActionBuilder builder(final StateSetTransitionsAction template) {
        return StateSetTransitionsActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withStateSetTransitionsAction(Function<StateSetTransitionsAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<StateSetTransitionsAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<StateSetTransitionsAction>() {
            @Override
            public String toString() {
                return "TypeReference<StateSetTransitionsAction>";
            }
        };
    }
}
