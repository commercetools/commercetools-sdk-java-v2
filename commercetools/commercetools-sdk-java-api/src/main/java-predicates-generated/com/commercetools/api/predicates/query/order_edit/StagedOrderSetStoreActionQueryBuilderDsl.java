
package com.commercetools.api.predicates.query.order_edit;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class StagedOrderSetStoreActionQueryBuilderDsl {
    public StagedOrderSetStoreActionQueryBuilderDsl() {
    }

    public static StagedOrderSetStoreActionQueryBuilderDsl of() {
        return new StagedOrderSetStoreActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<StagedOrderSetStoreActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, StagedOrderSetStoreActionQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<StagedOrderSetStoreActionQueryBuilderDsl> store(
            Function<com.commercetools.api.predicates.query.store.StoreResourceIdentifierQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.store.StoreResourceIdentifierQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("store"))
                    .inner(fn.apply(
                        com.commercetools.api.predicates.query.store.StoreResourceIdentifierQueryBuilderDsl.of())),
            StagedOrderSetStoreActionQueryBuilderDsl::of);
    }

}
