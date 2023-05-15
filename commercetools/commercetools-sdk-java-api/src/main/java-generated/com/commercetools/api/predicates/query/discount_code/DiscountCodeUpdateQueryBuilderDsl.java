
package com.commercetools.api.predicates.query.discount_code;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class DiscountCodeUpdateQueryBuilderDsl {
    public DiscountCodeUpdateQueryBuilderDsl() {
    }

    public static DiscountCodeUpdateQueryBuilderDsl of() {
        return new DiscountCodeUpdateQueryBuilderDsl();
    }

    public LongComparisonPredicateBuilder<DiscountCodeUpdateQueryBuilderDsl> version() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("version")),
            p -> new CombinationQueryPredicate<>(p, DiscountCodeUpdateQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<DiscountCodeUpdateQueryBuilderDsl> actions(
            Function<com.commercetools.api.predicates.query.discount_code.DiscountCodeUpdateActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.discount_code.DiscountCodeUpdateActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
                .parent(ConstantQueryPredicate.of().constant("actions"))
                .inner(fn.apply(
                    com.commercetools.api.predicates.query.discount_code.DiscountCodeUpdateActionQueryBuilderDsl.of())),
            DiscountCodeUpdateQueryBuilderDsl::of);
    }

    public CollectionPredicateBuilder<DiscountCodeUpdateQueryBuilderDsl> actions() {
        return new CollectionPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("actions")),
            p -> new CombinationQueryPredicate<>(p, DiscountCodeUpdateQueryBuilderDsl::of));
    }
}
