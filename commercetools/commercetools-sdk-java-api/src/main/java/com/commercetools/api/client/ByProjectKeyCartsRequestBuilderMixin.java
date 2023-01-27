
package com.commercetools.api.client;

import java.util.function.UnaryOperator;

import com.commercetools.api.models.cart.CartDraft;
import com.commercetools.api.models.cart.CartUpdateAction;
import com.commercetools.api.models.cart.CartUpdateActionBuilder;

public interface ByProjectKeyCartsRequestBuilderMixin {
    public ByProjectKeyCartsByIDRequestBuilder withId(String ID);

    public ByProjectKeyCartsPost post(CartDraft cartDraft);

    public default ByProjectKeyCartsByIDPost update(
            com.commercetools.api.models.Versioned<com.commercetools.api.models.cart.Cart> cart,
            java.util.List<com.commercetools.api.models.cart.CartUpdateAction> actions) {
        return withId(cart.getId()).post(builder -> com.commercetools.api.models.cart.CartUpdate.builder()
                .version(cart.getVersion())
                .actions(actions));
    }

    public default ByProjectKeyCartsByIDPost update(
            com.commercetools.api.models.Versioned<com.commercetools.api.models.cart.Cart> cart,
            UnaryOperator<UpdateActionBuilder<CartUpdateAction, CartUpdateActionBuilder>> op) {
        return withId(cart.getId()).post(builder -> com.commercetools.api.models.cart.CartUpdate.builder()
                .version(cart.getVersion())
                .actions(op.apply(
                    UpdateActionBuilder.of(com.commercetools.api.models.cart.CartUpdateActionBuilder::of)).actions));
    }

    public default WithUpdateActionBuilder<com.commercetools.api.models.cart.CartUpdateAction, com.commercetools.api.models.cart.CartUpdateActionBuilder, ByProjectKeyCartsByIDPost> update(
            com.commercetools.api.models.Versioned<com.commercetools.api.models.cart.Cart> cart) {
        return builder -> withId(cart.getId()).post(b -> com.commercetools.api.models.cart.CartUpdate.builder()
                .version(cart.getVersion())
                .actions(builder.apply(
                    UpdateActionBuilder.of(com.commercetools.api.models.cart.CartUpdateActionBuilder::of)).actions));
    }

    public default ByProjectKeyCartsByIDDelete delete(
            com.commercetools.api.models.Versioned<com.commercetools.api.models.cart.Cart> cart) {
        return withId(cart.getId()).delete().withVersion(cart.getVersion());
    }

    public default ByProjectKeyCartsPost create(com.commercetools.api.models.cart.CartDraft cartDraft) {
        return post(cartDraft);
    }

    public default ByProjectKeyCartsPost create(UnaryOperator<com.commercetools.api.models.cart.CartDraftBuilder> op) {
        return post(op.apply(com.commercetools.api.models.cart.CartDraftBuilder.of()).build());
    }
}
