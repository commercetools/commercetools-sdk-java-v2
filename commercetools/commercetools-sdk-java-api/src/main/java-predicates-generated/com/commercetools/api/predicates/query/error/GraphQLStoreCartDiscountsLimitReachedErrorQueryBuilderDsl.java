
package com.commercetools.api.predicates.query.error;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class GraphQLStoreCartDiscountsLimitReachedErrorQueryBuilderDsl {
    public GraphQLStoreCartDiscountsLimitReachedErrorQueryBuilderDsl() {
    }

    public static GraphQLStoreCartDiscountsLimitReachedErrorQueryBuilderDsl of() {
        return new GraphQLStoreCartDiscountsLimitReachedErrorQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<GraphQLStoreCartDiscountsLimitReachedErrorQueryBuilderDsl> code() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("code")),
            p -> new CombinationQueryPredicate<>(p, GraphQLStoreCartDiscountsLimitReachedErrorQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<GraphQLStoreCartDiscountsLimitReachedErrorQueryBuilderDsl> stores(
            Function<com.commercetools.api.predicates.query.store.StoreKeyReferenceQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.store.StoreKeyReferenceQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
                .parent(ConstantQueryPredicate.of().constant("stores"))
                .inner(fn.apply(com.commercetools.api.predicates.query.store.StoreKeyReferenceQueryBuilderDsl.of())),
            GraphQLStoreCartDiscountsLimitReachedErrorQueryBuilderDsl::of);
    }

    public CollectionPredicateBuilder<GraphQLStoreCartDiscountsLimitReachedErrorQueryBuilderDsl> stores() {
        return new CollectionPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("stores")),
            p -> new CombinationQueryPredicate<>(p, GraphQLStoreCartDiscountsLimitReachedErrorQueryBuilderDsl::of));
    }

}
