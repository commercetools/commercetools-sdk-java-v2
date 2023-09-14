
package com.commercetools.api.predicates.query.error;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class StoreCartDiscountsLimitReachedErrorQueryBuilderDsl {
    public StoreCartDiscountsLimitReachedErrorQueryBuilderDsl() {
    }

    public static StoreCartDiscountsLimitReachedErrorQueryBuilderDsl of() {
        return new StoreCartDiscountsLimitReachedErrorQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<StoreCartDiscountsLimitReachedErrorQueryBuilderDsl> code() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("code")),
            p -> new CombinationQueryPredicate<>(p, StoreCartDiscountsLimitReachedErrorQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<StoreCartDiscountsLimitReachedErrorQueryBuilderDsl> message() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("message")),
            p -> new CombinationQueryPredicate<>(p, StoreCartDiscountsLimitReachedErrorQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<StoreCartDiscountsLimitReachedErrorQueryBuilderDsl> stores(
            Function<com.commercetools.api.predicates.query.store.StoreKeyReferenceQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.store.StoreKeyReferenceQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
                .parent(ConstantQueryPredicate.of().constant("stores"))
                .inner(fn.apply(com.commercetools.api.predicates.query.store.StoreKeyReferenceQueryBuilderDsl.of())),
            StoreCartDiscountsLimitReachedErrorQueryBuilderDsl::of);
    }

    public CollectionPredicateBuilder<StoreCartDiscountsLimitReachedErrorQueryBuilderDsl> stores() {
        return new CollectionPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("stores")),
            p -> new CombinationQueryPredicate<>(p, StoreCartDiscountsLimitReachedErrorQueryBuilderDsl::of));
    }

}
