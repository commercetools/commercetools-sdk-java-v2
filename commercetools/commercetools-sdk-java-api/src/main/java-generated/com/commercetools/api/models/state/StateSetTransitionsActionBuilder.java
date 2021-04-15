
package com.commercetools.api.models.state;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class StateSetTransitionsActionBuilder {

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

    @Nullable
    public java.util.List<com.commercetools.api.models.state.StateResourceIdentifier> getTransitions() {
        return this.transitions;
    }

    public StateSetTransitionsAction build() {
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
