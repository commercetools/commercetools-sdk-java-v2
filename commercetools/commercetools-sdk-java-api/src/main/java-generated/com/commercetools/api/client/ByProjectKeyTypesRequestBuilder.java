
package com.commercetools.api.client;

import java.util.function.UnaryOperator;

import io.vrap.rmf.base.client.ApiHttpClient;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ByProjectKeyTypesRequestBuilder {

    private final ApiHttpClient apiHttpClient;
    private final String projectKey;

    public ByProjectKeyTypesRequestBuilder(final ApiHttpClient apiHttpClient, final String projectKey) {
        this.apiHttpClient = apiHttpClient;
        this.projectKey = projectKey;
    }

    public ByProjectKeyTypesGet get() {
        return new ByProjectKeyTypesGet(apiHttpClient, projectKey);
    }

    public ByProjectKeyTypesPost post(com.commercetools.api.models.type.TypeDraft typeDraft) {
        return new ByProjectKeyTypesPost(apiHttpClient, projectKey, typeDraft);
    }

    public ByProjectKeyTypesPost post(UnaryOperator<com.commercetools.api.models.type.TypeDraftBuilder> op) {
        return post(op.apply(com.commercetools.api.models.type.TypeDraftBuilder.of()).build());
    }

    public ByProjectKeyTypesKeyByKeyRequestBuilder withKey(String key) {
        return new ByProjectKeyTypesKeyByKeyRequestBuilder(apiHttpClient, projectKey, key);
    }

    public ByProjectKeyTypesByIDRequestBuilder withId(String ID) {
        return new ByProjectKeyTypesByIDRequestBuilder(apiHttpClient, projectKey, ID);
    }

    public ByProjectKeyTypesByIDPost update(
            com.commercetools.api.models.Versioned<com.commercetools.api.models.type.Type> type,
            java.util.List<com.commercetools.api.models.type.TypeUpdateAction> actions) {
        return withId(type.getId()).post(builder -> com.commercetools.api.models.type.TypeUpdate.builder()
                .version(type.getVersion())
                .actions(actions));
    }

    public ByProjectKeyTypesByIDPost update(
            com.commercetools.api.models.Versioned<com.commercetools.api.models.type.Type> type,
            UnaryOperator<UpdateActionBuilder<com.commercetools.api.models.type.TypeUpdateAction, com.commercetools.api.models.type.TypeUpdateActionBuilder>> op) {
        return withId(type.getId()).post(builder -> com.commercetools.api.models.type.TypeUpdate.builder()
                .version(type.getVersion())
                .actions(op.apply(
                    UpdateActionBuilder.of(com.commercetools.api.models.type.TypeUpdateActionBuilder::of)).actions));
    }

    public WithUpdateActionBuilder<com.commercetools.api.models.type.TypeUpdateAction, com.commercetools.api.models.type.TypeUpdateActionBuilder, ByProjectKeyTypesByIDPost> update(
            com.commercetools.api.models.Versioned<com.commercetools.api.models.type.Type> type) {
        return builder -> withId(type.getId()).post(b -> com.commercetools.api.models.type.TypeUpdate.builder()
                .version(type.getVersion())
                .actions(builder.apply(
                    UpdateActionBuilder.of(com.commercetools.api.models.type.TypeUpdateActionBuilder::of)).actions));
    }

    public ByProjectKeyTypesByIDDelete delete(
            com.commercetools.api.models.Versioned<com.commercetools.api.models.type.Type> type) {
        return withId(type.getId()).delete().withVersion(type.getVersion());
    }

    public ByProjectKeyTypesPost create(com.commercetools.api.models.type.TypeDraft typeDraft) {
        return post(typeDraft);
    }

    public ByProjectKeyTypesPost create(UnaryOperator<com.commercetools.api.models.type.TypeDraftBuilder> op) {
        return post(op.apply(com.commercetools.api.models.type.TypeDraftBuilder.of()).build());
    }

}
