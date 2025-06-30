
package com.commercetools.api.predicates.query.discount_group;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class DiscountGroupReferenceQueryBuilderDsl {
    public DiscountGroupReferenceQueryBuilderDsl() {
    }

    public static DiscountGroupReferenceQueryBuilderDsl of() {
        return new DiscountGroupReferenceQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<DiscountGroupReferenceQueryBuilderDsl> typeId() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("typeId")),
            p -> new CombinationQueryPredicate<>(p, DiscountGroupReferenceQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<DiscountGroupReferenceQueryBuilderDsl> id() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("id")),
            p -> new CombinationQueryPredicate<>(p, DiscountGroupReferenceQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<DiscountGroupReferenceQueryBuilderDsl> obj(
            Function<com.commercetools.api.predicates.query.discount_group.DiscountGroupQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.discount_group.DiscountGroupQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("obj"))
                    .inner(fn.apply(
                        com.commercetools.api.predicates.query.discount_group.DiscountGroupQueryBuilderDsl.of())),
            DiscountGroupReferenceQueryBuilderDsl::of);
    }

}
