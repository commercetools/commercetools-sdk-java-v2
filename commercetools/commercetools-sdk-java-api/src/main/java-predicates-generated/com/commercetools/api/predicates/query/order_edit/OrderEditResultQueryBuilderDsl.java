package com.commercetools.api.predicates.query.order_edit;

import com.commercetools.api.predicates.query.*;

import java.util.function.Function;


public class OrderEditResultQueryBuilderDsl  {
    public OrderEditResultQueryBuilderDsl() {
    }

    public static OrderEditResultQueryBuilderDsl of() {
        return new OrderEditResultQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<OrderEditResultQueryBuilderDsl> type() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("type")),
        p -> new CombinationQueryPredicate<>(p, OrderEditResultQueryBuilderDsl::of));
    }
    
    public CombinationQueryPredicate<OrderEditResultQueryBuilderDsl> asApplied(
        Function<com.commercetools.api.predicates.query.order_edit.OrderEditAppliedQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.order_edit.OrderEditAppliedQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(com.commercetools.api.predicates.query.order_edit.OrderEditAppliedQueryBuilderDsl.of()),
            OrderEditResultQueryBuilderDsl::of);
    }
    public CombinationQueryPredicate<OrderEditResultQueryBuilderDsl> asNotProcessed(
        Function<com.commercetools.api.predicates.query.order_edit.OrderEditNotProcessedQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.order_edit.OrderEditNotProcessedQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(com.commercetools.api.predicates.query.order_edit.OrderEditNotProcessedQueryBuilderDsl.of()),
            OrderEditResultQueryBuilderDsl::of);
    }
    public CombinationQueryPredicate<OrderEditResultQueryBuilderDsl> asPreviewFailure(
        Function<com.commercetools.api.predicates.query.order_edit.OrderEditPreviewFailureQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.order_edit.OrderEditPreviewFailureQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(com.commercetools.api.predicates.query.order_edit.OrderEditPreviewFailureQueryBuilderDsl.of()),
            OrderEditResultQueryBuilderDsl::of);
    }
    public CombinationQueryPredicate<OrderEditResultQueryBuilderDsl> asPreviewSuccess(
        Function<com.commercetools.api.predicates.query.order_edit.OrderEditPreviewSuccessQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.order_edit.OrderEditPreviewSuccessQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(com.commercetools.api.predicates.query.order_edit.OrderEditPreviewSuccessQueryBuilderDsl.of()),
            OrderEditResultQueryBuilderDsl::of);
    }
}
