
package com.commercetools.api.client;

import java.util.List;
import java.util.function.UnaryOperator;

import com.commercetools.api.models.Versioned;
import com.commercetools.api.models.store.Store;
import com.commercetools.api.models.store.StoreDraft;
import com.commercetools.api.models.store.StoreDraftBuilder;
import com.commercetools.api.models.store.StoreUpdate;
import com.commercetools.api.models.store.StoreUpdateAction;
import com.commercetools.api.models.store.StoreUpdateActionBuilder;

public interface ByProjectKeyStoresRequestBuilderMixin {
    public ByProjectKeyStoresPost post(StoreDraft storeDraft);

    public ByProjectKeyStoresByIDRequestBuilder withId(String ID);

    public default ByProjectKeyStoresByIDPost update(Versioned<Store> store, List<StoreUpdateAction> actions) {
        return withId(store.getId())
                .post(builder -> StoreUpdate.builder().version(store.getVersion()).actions(actions));
    }

    public default ByProjectKeyStoresByIDPost update(Versioned<Store> store,
            UnaryOperator<UpdateActionBuilder<StoreUpdateAction, StoreUpdateActionBuilder>> op) {
        return withId(store.getId()).post(builder -> StoreUpdate.builder()
                .version(store.getVersion())
                .actions(op.apply(UpdateActionBuilder.of(StoreUpdateActionBuilder::of)).actions));
    }

    public default WithUpdateActionBuilder<StoreUpdateAction, StoreUpdateActionBuilder, ByProjectKeyStoresByIDPost> update(
            Versioned<Store> store) {
        return builder -> withId(store.getId()).post(b -> StoreUpdate.builder()
                .version(store.getVersion())
                .actions(builder.apply(UpdateActionBuilder.of(StoreUpdateActionBuilder::of)).actions));
    }

    public default ByProjectKeyStoresByIDDelete delete(Versioned<Store> store) {
        return withId(store.getId()).delete().withVersion(store.getVersion());
    }

    public default ByProjectKeyStoresPost create(StoreDraft storeDraft) {
        return post(storeDraft);
    }

    public default ByProjectKeyStoresPost create(UnaryOperator<StoreDraftBuilder> op) {
        return post(op.apply(StoreDraftBuilder.of()).build());
    }
}
