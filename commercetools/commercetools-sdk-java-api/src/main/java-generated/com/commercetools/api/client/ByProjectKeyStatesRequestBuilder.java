
package com.commercetools.api.client;

import java.util.function.UnaryOperator;

import io.vrap.rmf.base.client.ApiHttpClient;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ByProjectKeyStatesRequestBuilder {

    private final ApiHttpClient apiHttpClient;
    private final String projectKey;

    public ByProjectKeyStatesRequestBuilder(final ApiHttpClient apiHttpClient, final String projectKey) {
        this.apiHttpClient = apiHttpClient;
        this.projectKey = projectKey;
    }

    public ByProjectKeyStatesGet get() {
        return new ByProjectKeyStatesGet(apiHttpClient, projectKey);
    }

    public ByProjectKeyStatesPost post(com.commercetools.api.models.state.StateDraft stateDraft) {
        return new ByProjectKeyStatesPost(apiHttpClient, projectKey, stateDraft);
    }

    public ByProjectKeyStatesPost post(UnaryOperator<com.commercetools.api.models.state.StateDraftBuilder> op) {
        return post(op.apply(com.commercetools.api.models.state.StateDraftBuilder.of()).build());
    }

    public ByProjectKeyStatesKeyByKeyRequestBuilder withKey(String key) {
        return new ByProjectKeyStatesKeyByKeyRequestBuilder(apiHttpClient, projectKey, key);
    }

    public ByProjectKeyStatesByIDRequestBuilder withId(String ID) {
        return new ByProjectKeyStatesByIDRequestBuilder(apiHttpClient, projectKey, ID);
    }

    public ByProjectKeyStatesByIDPost update(
            com.commercetools.api.models.Versioned<com.commercetools.api.models.state.State> state,
            java.util.List<com.commercetools.api.models.state.StateUpdateAction> actions) {
        return withId(state.getId()).post(builder -> com.commercetools.api.models.state.StateUpdate.builder()
                .version(state.getVersion())
                .actions(actions));
    }

    public ByProjectKeyStatesByIDPost update(
            com.commercetools.api.models.Versioned<com.commercetools.api.models.state.State> state,
            UnaryOperator<UpdateActionBuilder<com.commercetools.api.models.state.StateUpdateAction, com.commercetools.api.models.state.StateUpdateActionBuilder>> op) {
        return withId(state.getId()).post(builder -> com.commercetools.api.models.state.StateUpdate.builder()
                .version(state.getVersion())
                .actions(op.apply(
                    UpdateActionBuilder.of(com.commercetools.api.models.state.StateUpdateActionBuilder::of)).actions));
    }

    public WithUpdateActionBuilder<com.commercetools.api.models.state.StateUpdateAction, com.commercetools.api.models.state.StateUpdateActionBuilder, ByProjectKeyStatesByIDPost> update(
            com.commercetools.api.models.Versioned<com.commercetools.api.models.state.State> state) {
        return builder -> withId(state.getId()).post(b -> com.commercetools.api.models.state.StateUpdate.builder()
                .version(state.getVersion())
                .actions(builder.apply(
                    UpdateActionBuilder.of(com.commercetools.api.models.state.StateUpdateActionBuilder::of)).actions));
    }

    public ByProjectKeyStatesByIDDelete delete(
            com.commercetools.api.models.Versioned<com.commercetools.api.models.state.State> state) {
        return withId(state.getId()).delete().withVersion(state.getVersion());
    }

    public ByProjectKeyStatesPost create(com.commercetools.api.models.state.StateDraft stateDraft) {
        return post(stateDraft);
    }

    public ByProjectKeyStatesPost create(UnaryOperator<com.commercetools.api.models.state.StateDraftBuilder> op) {
        return post(op.apply(com.commercetools.api.models.state.StateDraftBuilder.of()).build());
    }

}
