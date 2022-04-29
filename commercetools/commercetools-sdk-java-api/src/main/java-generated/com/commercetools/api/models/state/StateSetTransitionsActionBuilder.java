
package com.commercetools.api.models.state;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class StateSetTransitionsActionBuilder implements Builder<StateSetTransitionsAction> {

    @Nullable
    private java.util.List<com.commercetools.api.models.state.StateResourceIdentifier> transitions;

    public StateSetTransitionsActionBuilder transitions(
            @Nullable final com.commercetools.api.models.state.StateResourceIdentifier... transitions) {
        this.transitions = new ArrayList<>(Arrays.asList(transitions));
        return this;
    }

    public StateSetTransitionsActionBuilder transitions(
            @Nullable final java.util.List<com.commercetools.api.models.state.StateResourceIdentifier> transitions) {
        this.transitions = transitions;
        return this;
    }

    public StateSetTransitionsActionBuilder plusTransitions(
            @Nullable final com.commercetools.api.models.state.StateResourceIdentifier... transitions) {
        if (this.transitions == null) {
            this.transitions = new ArrayList<>();
        }
        this.transitions.addAll(Arrays.asList(transitions));
        return this;
    }

    public StateSetTransitionsActionBuilder plusTransitions(
            Function<com.commercetools.api.models.state.StateResourceIdentifierBuilder, com.commercetools.api.models.state.StateResourceIdentifierBuilder> builder) {
        if (this.transitions == null) {
            this.transitions = new ArrayList<>();
        }
        this.transitions
                .add(builder.apply(com.commercetools.api.models.state.StateResourceIdentifierBuilder.of()).build());
        return this;
    }

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

    public StateSetTransitionsAction build() {
        return new StateSetTransitionsActionImpl(transitions);
    }

    /**
     * builds StateSetTransitionsAction without checking for non null required values
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
