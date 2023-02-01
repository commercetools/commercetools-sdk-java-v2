
package com.commercetools.api.client;

import java.util.List;
import java.util.function.UnaryOperator;

import com.commercetools.api.models.Versioned;
import com.commercetools.api.models.order.Order;
import com.commercetools.api.models.order.OrderFromCartDraft;
import com.commercetools.api.models.order.OrderFromCartDraftBuilder;
import com.commercetools.api.models.order.OrderUpdate;
import com.commercetools.api.models.order.OrderUpdateAction;
import com.commercetools.api.models.order.OrderUpdateActionBuilder;

public interface ByProjectKeyOrdersRequestBuilderMixin {
    public ByProjectKeyOrdersPost post(OrderFromCartDraft orderFromCartDraft);

    public ByProjectKeyOrdersByIDRequestBuilder withId(String ID);

    public default ByProjectKeyOrdersByIDPost update(Versioned<Order> order, List<OrderUpdateAction> actions) {
        return withId(order.getId())
                .post(builder -> OrderUpdate.builder().version(order.getVersion()).actions(actions));
    }

    public default ByProjectKeyOrdersByIDPost update(Versioned<Order> order,
            UnaryOperator<UpdateActionBuilder<OrderUpdateAction, OrderUpdateActionBuilder>> op) {
        return withId(order.getId()).post(builder -> OrderUpdate.builder()
                .version(order.getVersion())
                .actions(op.apply(UpdateActionBuilder.of(OrderUpdateActionBuilder::of)).actions));
    }

    public default WithUpdateActionBuilder<OrderUpdateAction, OrderUpdateActionBuilder, ByProjectKeyOrdersByIDPost> update(
            Versioned<Order> order) {
        return builder -> withId(order.getId()).post(b -> OrderUpdate.builder()
                .version(order.getVersion())
                .actions(builder.apply(UpdateActionBuilder.of(OrderUpdateActionBuilder::of)).actions));
    }

    public default ByProjectKeyOrdersByIDDelete delete(Versioned<Order> order) {
        return withId(order.getId()).delete().withVersion(order.getVersion());
    }

    public default ByProjectKeyOrdersPost create(OrderFromCartDraft orderFromCartDraft) {
        return post(orderFromCartDraft);
    }

    public default ByProjectKeyOrdersPost create(UnaryOperator<OrderFromCartDraftBuilder> op) {
        return post(op.apply(OrderFromCartDraftBuilder.of()).build());
    }
}
