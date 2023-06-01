package com.commercetools.api.predicates.query.order_edit;

import com.commercetools.api.predicates.query.*;

import java.util.function.Function;


public class OrderEditPreviewFailureQueryBuilderDsl  {
    public OrderEditPreviewFailureQueryBuilderDsl() {
    }

    public static OrderEditPreviewFailureQueryBuilderDsl of() {
        return new OrderEditPreviewFailureQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<OrderEditPreviewFailureQueryBuilderDsl> type() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("type")),
        p -> new CombinationQueryPredicate<>(p, OrderEditPreviewFailureQueryBuilderDsl::of));
    }
    public CombinationQueryPredicate<OrderEditPreviewFailureQueryBuilderDsl> errors(
        Function<com.commercetools.api.predicates.query.error.ErrorObjectQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.error.ErrorObjectQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("errors"))
            .inner(fn.apply(com.commercetools.api.predicates.query.error.ErrorObjectQueryBuilderDsl.of())),
            OrderEditPreviewFailureQueryBuilderDsl::of);
    }
    public CollectionPredicateBuilder<OrderEditPreviewFailureQueryBuilderDsl> errors() {
        return new CollectionPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("errors")),
                p -> new CombinationQueryPredicate<>(p, OrderEditPreviewFailureQueryBuilderDsl::of));
    }
    
}
