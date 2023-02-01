
package com.commercetools.api.client;

import java.util.List;
import java.util.function.UnaryOperator;

import com.commercetools.api.models.Versioned;
import com.commercetools.api.models.type.Type;
import com.commercetools.api.models.type.TypeDraft;
import com.commercetools.api.models.type.TypeDraftBuilder;
import com.commercetools.api.models.type.TypeUpdate;
import com.commercetools.api.models.type.TypeUpdateAction;
import com.commercetools.api.models.type.TypeUpdateActionBuilder;

public interface ByProjectKeyTypesRequestBuilderMixin {
    public ByProjectKeyTypesPost post(TypeDraft typeDraft);

    public ByProjectKeyTypesByIDRequestBuilder withId(String ID);

    public default ByProjectKeyTypesByIDPost update(Versioned<Type> type, List<TypeUpdateAction> actions) {
        return withId(type.getId()).post(builder -> TypeUpdate.builder().version(type.getVersion()).actions(actions));
    }

    public default ByProjectKeyTypesByIDPost update(Versioned<Type> type,
            UnaryOperator<UpdateActionBuilder<TypeUpdateAction, TypeUpdateActionBuilder>> op) {
        return withId(type.getId()).post(builder -> TypeUpdate.builder()
                .version(type.getVersion())
                .actions(op.apply(UpdateActionBuilder.of(TypeUpdateActionBuilder::of)).actions));
    }

    public default WithUpdateActionBuilder<TypeUpdateAction, TypeUpdateActionBuilder, ByProjectKeyTypesByIDPost> update(
            Versioned<Type> type) {
        return builder -> withId(type.getId()).post(b -> TypeUpdate.builder()
                .version(type.getVersion())
                .actions(builder.apply(UpdateActionBuilder.of(TypeUpdateActionBuilder::of)).actions));
    }

    public default ByProjectKeyTypesByIDDelete delete(Versioned<Type> type) {
        return withId(type.getId()).delete().withVersion(type.getVersion());
    }

    public default ByProjectKeyTypesPost create(TypeDraft typeDraft) {
        return post(typeDraft);
    }

    public default ByProjectKeyTypesPost create(UnaryOperator<TypeDraftBuilder> op) {
        return post(op.apply(TypeDraftBuilder.of()).build());
    }
}
