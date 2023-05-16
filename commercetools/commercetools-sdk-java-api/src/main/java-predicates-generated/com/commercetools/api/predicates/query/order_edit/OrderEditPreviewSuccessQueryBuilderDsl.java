
package com.commercetools.api.predicates.query.order_edit;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class OrderEditPreviewSuccessQueryBuilderDsl {
    public OrderEditPreviewSuccessQueryBuilderDsl() {
    }

    public static OrderEditPreviewSuccessQueryBuilderDsl of() {
        return new OrderEditPreviewSuccessQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<OrderEditPreviewSuccessQueryBuilderDsl> type() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("type")),
            p -> new CombinationQueryPredicate<>(p, OrderEditPreviewSuccessQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<OrderEditPreviewSuccessQueryBuilderDsl> preview(
            Function<com.commercetools.api.predicates.query.order_edit.StagedOrderQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.order_edit.StagedOrderQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("preview"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.order_edit.StagedOrderQueryBuilderDsl.of())),
            OrderEditPreviewSuccessQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<OrderEditPreviewSuccessQueryBuilderDsl> messagePayloads(
            Function<com.commercetools.api.predicates.query.message.MessagePayloadQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.MessagePayloadQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("messagePayloads"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.message.MessagePayloadQueryBuilderDsl.of())),
            OrderEditPreviewSuccessQueryBuilderDsl::of);
    }

    public CollectionPredicateBuilder<OrderEditPreviewSuccessQueryBuilderDsl> messagePayloads() {
        return new CollectionPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("messagePayloads")),
            p -> new CombinationQueryPredicate<>(p, OrderEditPreviewSuccessQueryBuilderDsl::of));
    }

}
