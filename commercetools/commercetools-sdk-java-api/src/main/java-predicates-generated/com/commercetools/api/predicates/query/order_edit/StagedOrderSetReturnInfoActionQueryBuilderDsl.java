
package com.commercetools.api.predicates.query.order_edit;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class StagedOrderSetReturnInfoActionQueryBuilderDsl {
    public StagedOrderSetReturnInfoActionQueryBuilderDsl() {
    }

    public static StagedOrderSetReturnInfoActionQueryBuilderDsl of() {
        return new StagedOrderSetReturnInfoActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<StagedOrderSetReturnInfoActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, StagedOrderSetReturnInfoActionQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<StagedOrderSetReturnInfoActionQueryBuilderDsl> items(
            Function<com.commercetools.api.predicates.query.order.ReturnInfoDraftQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.order.ReturnInfoDraftQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("items"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.order.ReturnInfoDraftQueryBuilderDsl.of())),
            StagedOrderSetReturnInfoActionQueryBuilderDsl::of);
    }

    public CollectionPredicateBuilder<StagedOrderSetReturnInfoActionQueryBuilderDsl> items() {
        return new CollectionPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("items")),
            p -> new CombinationQueryPredicate<>(p, StagedOrderSetReturnInfoActionQueryBuilderDsl::of));
    }

}
