
package com.commercetools.api.client;

import java.util.List;
import java.util.function.UnaryOperator;

import com.commercetools.api.models.Versioned;
import com.commercetools.api.models.state.State;
import com.commercetools.api.models.state.StateDraft;
import com.commercetools.api.models.state.StateDraftBuilder;
import com.commercetools.api.models.state.StateUpdate;
import com.commercetools.api.models.state.StateUpdateAction;
import com.commercetools.api.models.state.StateUpdateActionBuilder;

public interface ByProjectKeyStatesRequestBuilderMixin {
    public ByProjectKeyStatesPost post(StateDraft stateDraft);

    public ByProjectKeyStatesByIDRequestBuilder withId(String ID);

    public default ByProjectKeyStatesByIDPost update(Versioned<State> state, List<StateUpdateAction> actions) {
        return withId(state.getId())
                .post(builder -> StateUpdate.builder().version(state.getVersion()).actions(actions));
    }

    public default ByProjectKeyStatesByIDPost update(Versioned<State> state,
            UnaryOperator<UpdateActionBuilder<StateUpdateAction, StateUpdateActionBuilder>> op) {
        return withId(state.getId()).post(builder -> StateUpdate.builder()
                .version(state.getVersion())
                .actions(op.apply(UpdateActionBuilder.of(StateUpdateActionBuilder::of)).actions));
    }

    public default WithUpdateActionBuilder<StateUpdateAction, StateUpdateActionBuilder, ByProjectKeyStatesByIDPost> update(
            Versioned<State> state) {
        return builder -> withId(state.getId()).post(b -> StateUpdate.builder()
                .version(state.getVersion())
                .actions(builder.apply(UpdateActionBuilder.of(StateUpdateActionBuilder::of)).actions));
    }

    public default ByProjectKeyStatesByIDDelete delete(Versioned<State> state) {
        return withId(state.getId()).delete().withVersion(state.getVersion());
    }

    public default ByProjectKeyStatesPost create(StateDraft stateDraft) {
        return post(stateDraft);
    }

    public default ByProjectKeyStatesPost create(UnaryOperator<StateDraftBuilder> op) {
        return post(op.apply(StateDraftBuilder.of()).build());
    }

}
