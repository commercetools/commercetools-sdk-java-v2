
package com.commercetools.api.predicates.query.discount_group;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class DiscountGroupUpdateQueryBuilderDsl {
    public DiscountGroupUpdateQueryBuilderDsl() {
    }

    public static DiscountGroupUpdateQueryBuilderDsl of() {
        return new DiscountGroupUpdateQueryBuilderDsl();
    }

    public LongComparisonPredicateBuilder<DiscountGroupUpdateQueryBuilderDsl> version() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("version")),
            p -> new CombinationQueryPredicate<>(p, DiscountGroupUpdateQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<DiscountGroupUpdateQueryBuilderDsl> actions(
            Function<com.commercetools.api.predicates.query.discount_group.DiscountGroupUpdateActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.discount_group.DiscountGroupUpdateActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
                .parent(ConstantQueryPredicate.of().constant("actions"))
                .inner(fn.apply(
                    com.commercetools.api.predicates.query.discount_group.DiscountGroupUpdateActionQueryBuilderDsl
                            .of())),
            DiscountGroupUpdateQueryBuilderDsl::of);
    }

    public CollectionPredicateBuilder<DiscountGroupUpdateQueryBuilderDsl> actions() {
        return new CollectionPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("actions")),
            p -> new CombinationQueryPredicate<>(p, DiscountGroupUpdateQueryBuilderDsl::of));
    }

}
