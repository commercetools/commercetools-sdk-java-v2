
package com.commercetools.api.models.state;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * StateSetTransitionsActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     StateSetTransitionsAction stateSetTransitionsAction = StateSetTransitionsAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class StateSetTransitionsActionBuilder implements Builder<StateSetTransitionsAction> {

    @Nullable
    private java.util.List<com.commercetools.api.models.state.StateResourceIdentifier> transitions;

    /**
     *  <p>Value to set. If empty, any existing value will be removed.</p>
     *  <p>Possible transformations of the current State to other States of the same <code>type</code> (for example, <em>Initial</em> -&gt; <em>Shipped</em>). When performing a <code>transitionState</code> update action and <code>transitions</code> is set, the currently referenced State must have a transition to the new State.</p>
     *  <p>If <code>transitions</code> is an empty list, it means the current State is a final State and no further transitions are allowed. If <code>transitions</code> is not set, the validation is turned off.</p>
     *  <p>When performing a <code>transitionState</code> update action, any other State of the same <code>type</code> can be transitioned to.</p>
     * @param transitions value to be set
     * @return Builder
     */

    public StateSetTransitionsActionBuilder transitions(
            @Nullable final com.commercetools.api.models.state.StateResourceIdentifier... transitions) {
        this.transitions = new ArrayList<>(Arrays.asList(transitions));
        return this;
    }

    /**
     *  <p>Value to set. If empty, any existing value will be removed.</p>
     *  <p>Possible transformations of the current State to other States of the same <code>type</code> (for example, <em>Initial</em> -&gt; <em>Shipped</em>). When performing a <code>transitionState</code> update action and <code>transitions</code> is set, the currently referenced State must have a transition to the new State.</p>
     *  <p>If <code>transitions</code> is an empty list, it means the current State is a final State and no further transitions are allowed. If <code>transitions</code> is not set, the validation is turned off.</p>
     *  <p>When performing a <code>transitionState</code> update action, any other State of the same <code>type</code> can be transitioned to.</p>
     * @param transitions value to be set
     * @return Builder
     */

    public StateSetTransitionsActionBuilder transitions(
            @Nullable final java.util.List<com.commercetools.api.models.state.StateResourceIdentifier> transitions) {
        this.transitions = transitions;
        return this;
    }

    /**
     *  <p>Value to set. If empty, any existing value will be removed.</p>
     *  <p>Possible transformations of the current State to other States of the same <code>type</code> (for example, <em>Initial</em> -&gt; <em>Shipped</em>). When performing a <code>transitionState</code> update action and <code>transitions</code> is set, the currently referenced State must have a transition to the new State.</p>
     *  <p>If <code>transitions</code> is an empty list, it means the current State is a final State and no further transitions are allowed. If <code>transitions</code> is not set, the validation is turned off.</p>
     *  <p>When performing a <code>transitionState</code> update action, any other State of the same <code>type</code> can be transitioned to.</p>
     * @param transitions value to be set
     * @return Builder
     */

    public StateSetTransitionsActionBuilder plusTransitions(
            @Nullable final com.commercetools.api.models.state.StateResourceIdentifier... transitions) {
        if (this.transitions == null) {
            this.transitions = new ArrayList<>();
        }
        this.transitions.addAll(Arrays.asList(transitions));
        return this;
    }

    /**
     *  <p>Value to set. If empty, any existing value will be removed.</p>
     *  <p>Possible transformations of the current State to other States of the same <code>type</code> (for example, <em>Initial</em> -&gt; <em>Shipped</em>). When performing a <code>transitionState</code> update action and <code>transitions</code> is set, the currently referenced State must have a transition to the new State.</p>
     *  <p>If <code>transitions</code> is an empty list, it means the current State is a final State and no further transitions are allowed. If <code>transitions</code> is not set, the validation is turned off.</p>
     *  <p>When performing a <code>transitionState</code> update action, any other State of the same <code>type</code> can be transitioned to.</p>
     * @param builder function to build the transitions value
     * @return Builder
     */

    public StateSetTransitionsActionBuilder plusTransitions(
            Function<com.commercetools.api.models.state.StateResourceIdentifierBuilder, com.commercetools.api.models.state.StateResourceIdentifierBuilder> builder) {
        if (this.transitions == null) {
            this.transitions = new ArrayList<>();
        }
        this.transitions
                .add(builder.apply(com.commercetools.api.models.state.StateResourceIdentifierBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Value to set. If empty, any existing value will be removed.</p>
     *  <p>Possible transformations of the current State to other States of the same <code>type</code> (for example, <em>Initial</em> -&gt; <em>Shipped</em>). When performing a <code>transitionState</code> update action and <code>transitions</code> is set, the currently referenced State must have a transition to the new State.</p>
     *  <p>If <code>transitions</code> is an empty list, it means the current State is a final State and no further transitions are allowed. If <code>transitions</code> is not set, the validation is turned off.</p>
     *  <p>When performing a <code>transitionState</code> update action, any other State of the same <code>type</code> can be transitioned to.</p>
     * @param builder function to build the transitions value
     * @return Builder
     */

    public StateSetTransitionsActionBuilder withTransitions(
            Function<com.commercetools.api.models.state.StateResourceIdentifierBuilder, com.commercetools.api.models.state.StateResourceIdentifierBuilder> builder) {
        this.transitions = new ArrayList<>();
        this.transitions
                .add(builder.apply(com.commercetools.api.models.state.StateResourceIdentifierBuilder.of()).build());
        return this;
    }

    @Nullable
    public java.util.List<com.commercetools.api.models.state.StateResourceIdentifier> getTransitions() {
        return this.transitions;
    }

    /**
     * builds StateSetTransitionsAction with checking for non-null required values
     * @return StateSetTransitionsAction
     */
    public StateSetTransitionsAction build() {
        return new StateSetTransitionsActionImpl(transitions);
    }

    /**
     * builds StateSetTransitionsAction without checking for non-null required values
     * @return StateSetTransitionsAction
     */
    public StateSetTransitionsAction buildUnchecked() {
        return new StateSetTransitionsActionImpl(transitions);
    }

    public static StateSetTransitionsActionBuilder of() {
        return new StateSetTransitionsActionBuilder();
    }

    public static StateSetTransitionsActionBuilder of(final StateSetTransitionsAction template) {
        StateSetTransitionsActionBuilder builder = new StateSetTransitionsActionBuilder();
        builder.transitions = template.getTransitions();
        return builder;
    }

}
