
package com.commercetools.api.client;

import java.util.List;
import java.util.function.UnaryOperator;

import com.commercetools.api.models.Versioned;
import com.commercetools.api.models.cart.Cart;
import com.commercetools.api.models.cart.CartDraft;
import com.commercetools.api.models.cart.CartDraftBuilder;
import com.commercetools.api.models.cart.CartUpdate;
import com.commercetools.api.models.cart.CartUpdateAction;
import com.commercetools.api.models.cart.CartUpdateActionBuilder;

public interface ByProjectKeyCartsRequestBuilderMixin {
    public ByProjectKeyCartsByIDRequestBuilder withId(String ID);

    public ByProjectKeyCartsPost post(CartDraft cartDraft);

    public default ByProjectKeyCartsByIDPost update(Versioned<Cart> cart, List<CartUpdateAction> actions) {
        return withId(cart.getId()).post(builder -> CartUpdate.builder().version(cart.getVersion()).actions(actions));
    }

    public default ByProjectKeyCartsByIDPost update(Versioned<Cart> cart,
            UnaryOperator<UpdateActionBuilder<CartUpdateAction, CartUpdateActionBuilder>> op) {
        return withId(cart.getId()).post(builder -> CartUpdate.builder()
                .version(cart.getVersion())
                .actions(op.apply(UpdateActionBuilder.of(CartUpdateActionBuilder::of)).actions));
    }

    public default WithUpdateActionBuilder<CartUpdateAction, CartUpdateActionBuilder, ByProjectKeyCartsByIDPost> update(
            Versioned<Cart> cart) {
        return builder -> withId(cart.getId()).post(b -> CartUpdate.builder()
                .version(cart.getVersion())
                .actions(builder.apply(UpdateActionBuilder.of(CartUpdateActionBuilder::of)).actions));
    }

    public default ByProjectKeyCartsByIDDelete delete(Versioned<Cart> cart) {
        return withId(cart.getId()).delete().withVersion(cart.getVersion());
    }

    public default ByProjectKeyCartsPost create(com.commercetools.api.models.cart.CartDraft cartDraft) {
        return post(cartDraft);
    }

    public default ByProjectKeyCartsPost create(UnaryOperator<CartDraftBuilder> op) {
        return post(op.apply(CartDraftBuilder.of()).build());
    }
}
