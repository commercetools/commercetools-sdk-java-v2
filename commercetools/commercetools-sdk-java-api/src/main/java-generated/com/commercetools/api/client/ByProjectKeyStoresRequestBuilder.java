
package com.commercetools.api.client;

import java.util.function.UnaryOperator;

import io.vrap.rmf.base.client.ApiHttpClient;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ByProjectKeyStoresRequestBuilder {

    private final ApiHttpClient apiHttpClient;
    private final String projectKey;

    public ByProjectKeyStoresRequestBuilder(final ApiHttpClient apiHttpClient, final String projectKey) {
        this.apiHttpClient = apiHttpClient;
        this.projectKey = projectKey;
    }

    public ByProjectKeyStoresGet get() {
        return new ByProjectKeyStoresGet(apiHttpClient, projectKey);
    }

    public ByProjectKeyStoresPost post(com.commercetools.api.models.store.StoreDraft storeDraft) {
        return new ByProjectKeyStoresPost(apiHttpClient, projectKey, storeDraft);
    }

    public ByProjectKeyStoresPost post(UnaryOperator<com.commercetools.api.models.store.StoreDraftBuilder> op) {
        return post(op.apply(com.commercetools.api.models.store.StoreDraftBuilder.of()).build());
    }

    public ByProjectKeyStoresKeyByKeyRequestBuilder withKey(String key) {
        return new ByProjectKeyStoresKeyByKeyRequestBuilder(apiHttpClient, projectKey, key);
    }

    public ByProjectKeyStoresByIDRequestBuilder withId(String ID) {
        return new ByProjectKeyStoresByIDRequestBuilder(apiHttpClient, projectKey, ID);
    }

    public ByProjectKeyStoresByIDPost update(
            com.commercetools.api.models.Versioned<com.commercetools.api.models.store.Store> store,
            java.util.List<com.commercetools.api.models.store.StoreUpdateAction> actions) {
        return withId(store.getId()).post(builder -> com.commercetools.api.models.store.StoreUpdate.builder()
                .version(store.getVersion())
                .actions(actions));
    }

    public ByProjectKeyStoresByIDPost update(
            com.commercetools.api.models.Versioned<com.commercetools.api.models.store.Store> store,
            UnaryOperator<UpdateActionBuilder<com.commercetools.api.models.store.StoreUpdateAction, com.commercetools.api.models.store.StoreUpdateActionBuilder>> op) {
        return withId(store.getId()).post(builder -> com.commercetools.api.models.store.StoreUpdate.builder()
                .version(store.getVersion())
                .actions(op.apply(
                    UpdateActionBuilder.of(com.commercetools.api.models.store.StoreUpdateActionBuilder::of)).actions));
    }

    public WithUpdateActionBuilder<com.commercetools.api.models.store.StoreUpdateAction, com.commercetools.api.models.store.StoreUpdateActionBuilder, ByProjectKeyStoresByIDPost> update(
            com.commercetools.api.models.Versioned<com.commercetools.api.models.store.Store> store) {
        return builder -> withId(store.getId()).post(b -> com.commercetools.api.models.store.StoreUpdate.builder()
                .version(store.getVersion())
                .actions(builder.apply(
                    UpdateActionBuilder.of(com.commercetools.api.models.store.StoreUpdateActionBuilder::of)).actions));
    }

    public ByProjectKeyStoresByIDDelete delete(
            com.commercetools.api.models.Versioned<com.commercetools.api.models.store.Store> store) {
        return withId(store.getId()).delete().withVersion(store.getVersion());
    }

    public ByProjectKeyStoresPost create(com.commercetools.api.models.store.StoreDraft storeDraft) {
        return post(storeDraft);
    }

    public ByProjectKeyStoresPost create(UnaryOperator<com.commercetools.api.models.store.StoreDraftBuilder> op) {
        return post(op.apply(com.commercetools.api.models.store.StoreDraftBuilder.of()).build());
    }

}
