
package com.commercetools.api.predicates.query.shopping_list;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class ShoppingListPagedQueryResponseQueryBuilderDsl {
    public ShoppingListPagedQueryResponseQueryBuilderDsl() {
    }

    public static ShoppingListPagedQueryResponseQueryBuilderDsl of() {
        return new ShoppingListPagedQueryResponseQueryBuilderDsl();
    }

    public LongComparisonPredicateBuilder<ShoppingListPagedQueryResponseQueryBuilderDsl> limit() {
        return new LongComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("limit")),
            p -> new CombinationQueryPredicate<>(p, ShoppingListPagedQueryResponseQueryBuilderDsl::of));
    }

    public LongComparisonPredicateBuilder<ShoppingListPagedQueryResponseQueryBuilderDsl> count() {
        return new LongComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("count")),
            p -> new CombinationQueryPredicate<>(p, ShoppingListPagedQueryResponseQueryBuilderDsl::of));
    }

    public LongComparisonPredicateBuilder<ShoppingListPagedQueryResponseQueryBuilderDsl> total() {
        return new LongComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("total")),
            p -> new CombinationQueryPredicate<>(p, ShoppingListPagedQueryResponseQueryBuilderDsl::of));
    }

    public LongComparisonPredicateBuilder<ShoppingListPagedQueryResponseQueryBuilderDsl> offset() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("offset")),
            p -> new CombinationQueryPredicate<>(p, ShoppingListPagedQueryResponseQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<ShoppingListPagedQueryResponseQueryBuilderDsl> results(
            Function<com.commercetools.api.predicates.query.shopping_list.ShoppingListQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.shopping_list.ShoppingListQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("results"))
                    .inner(fn.apply(
                        com.commercetools.api.predicates.query.shopping_list.ShoppingListQueryBuilderDsl.of())),
            ShoppingListPagedQueryResponseQueryBuilderDsl::of);
    }

    public CollectionPredicateBuilder<ShoppingListPagedQueryResponseQueryBuilderDsl> results() {
        return new CollectionPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("results")),
            p -> new CombinationQueryPredicate<>(p, ShoppingListPagedQueryResponseQueryBuilderDsl::of));
    }

}
