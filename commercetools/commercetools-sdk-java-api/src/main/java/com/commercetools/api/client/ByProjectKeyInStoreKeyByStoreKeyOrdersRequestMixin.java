
package com.commercetools.api.client;

import java.util.List;
import java.util.function.UnaryOperator;

import com.commercetools.api.models.Versioned;
import com.commercetools.api.models.order.Order;
import com.commercetools.api.models.order.OrderUpdate;
import com.commercetools.api.models.order.OrderUpdateAction;
import com.commercetools.api.models.order.OrderUpdateActionBuilder;

public interface ByProjectKeyInStoreKeyByStoreKeyOrdersRequestMixin {
    ByProjectKeyInStoreKeyByStoreKeyOrdersPost post(
            com.commercetools.api.models.order.OrderFromCartDraft orderFromCartDraft);

    ByProjectKeyInStoreKeyByStoreKeyOrdersByIDRequestBuilder withId(String ID);

    public default ByProjectKeyInStoreKeyByStoreKeyOrdersByIDPost update(Versioned<Order> order,
            List<OrderUpdateAction> actions) {
        return withId(order.getId())
                .post(builder -> OrderUpdate.builder().version(order.getVersion()).actions(actions));
    }

    public default ByProjectKeyInStoreKeyByStoreKeyOrdersByIDPost update(Versioned<Order> order,
            UnaryOperator<UpdateActionBuilder<OrderUpdateAction, OrderUpdateActionBuilder>> op) {
        return withId(order.getId()).post(builder -> OrderUpdate.builder()
                .version(order.getVersion())
                .actions(op.apply(UpdateActionBuilder.of(OrderUpdateActionBuilder::of)).actions));
    }

    public default WithUpdateActionBuilder<OrderUpdateAction, OrderUpdateActionBuilder, ByProjectKeyInStoreKeyByStoreKeyOrdersByIDPost> update(
            Versioned<Order> order) {
        return builder -> withId(order.getId()).post(b -> OrderUpdate.builder()
                .version(order.getVersion())
                .actions(builder.apply(UpdateActionBuilder.of(OrderUpdateActionBuilder::of)).actions));
    }
}
