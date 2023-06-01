package com.commercetools.api.predicates.query.order_edit;

import com.commercetools.api.predicates.query.*;

import java.util.function.Function;


public class StagedOrderAddReturnInfoActionQueryBuilderDsl  {
    public StagedOrderAddReturnInfoActionQueryBuilderDsl() {
    }

    public static StagedOrderAddReturnInfoActionQueryBuilderDsl of() {
        return new StagedOrderAddReturnInfoActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<StagedOrderAddReturnInfoActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
        p -> new CombinationQueryPredicate<>(p, StagedOrderAddReturnInfoActionQueryBuilderDsl::of));
    }
    public StringComparisonPredicateBuilder<StagedOrderAddReturnInfoActionQueryBuilderDsl> returnTrackingId() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("returnTrackingId")),
        p -> new CombinationQueryPredicate<>(p, StagedOrderAddReturnInfoActionQueryBuilderDsl::of));
    }
    public CombinationQueryPredicate<StagedOrderAddReturnInfoActionQueryBuilderDsl> items(
        Function<com.commercetools.api.predicates.query.order.ReturnItemDraftQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.order.ReturnItemDraftQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("items"))
            .inner(fn.apply(com.commercetools.api.predicates.query.order.ReturnItemDraftQueryBuilderDsl.of())),
            StagedOrderAddReturnInfoActionQueryBuilderDsl::of);
    }
    public CollectionPredicateBuilder<StagedOrderAddReturnInfoActionQueryBuilderDsl> items() {
        return new CollectionPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("items")),
                p -> new CombinationQueryPredicate<>(p, StagedOrderAddReturnInfoActionQueryBuilderDsl::of));
    }
    public DateTimeComparisonPredicateBuilder<StagedOrderAddReturnInfoActionQueryBuilderDsl> returnDate() {
        return new DateTimeComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("returnDate")),
        p -> new CombinationQueryPredicate<>(p, StagedOrderAddReturnInfoActionQueryBuilderDsl::of));
    }
    
}
