
package com.commercetools.api.client;

import java.util.List;
import java.util.function.UnaryOperator;

import com.commercetools.api.models.Versioned;
import com.commercetools.api.models.cart.Cart;
import com.commercetools.api.models.cart.CartDraft;
import com.commercetools.api.models.cart.CartUpdate;
import com.commercetools.api.models.cart.CartUpdateAction;
import com.commercetools.api.models.cart.CartUpdateActionBuilder;

public interface ByProjectKeyInStoreKeyByStoreKeyCartsRequestMixin {
    public ByProjectKeyInStoreKeyByStoreKeyCartsByIDRequestBuilder withId(String ID);

    public ByProjectKeyInStoreKeyByStoreKeyCartsPost post(CartDraft cartDraft);

    public default ByProjectKeyInStoreKeyByStoreKeyCartsByIDPost update(Versioned<Cart> cart,
            List<CartUpdateAction> actions) {
        return withId(cart.getId()).post(builder -> CartUpdate.builder().version(cart.getVersion()).actions(actions));
    }

    public default ByProjectKeyInStoreKeyByStoreKeyCartsByIDPost update(Versioned<Cart> cart,
            UnaryOperator<UpdateActionBuilder<CartUpdateAction, CartUpdateActionBuilder>> op) {
        return withId(cart.getId()).post(builder -> CartUpdate.builder()
                .version(cart.getVersion())
                .actions(op.apply(UpdateActionBuilder.of(CartUpdateActionBuilder::of)).actions));
    }

    public default WithUpdateActionBuilder<CartUpdateAction, CartUpdateActionBuilder, ByProjectKeyInStoreKeyByStoreKeyCartsByIDPost> update(
            Versioned<Cart> cart) {
        return builder -> withId(cart.getId()).post(b -> CartUpdate.builder()
                .version(cart.getVersion())
                .actions(builder.apply(UpdateActionBuilder.of(CartUpdateActionBuilder::of)).actions));
    }
}
