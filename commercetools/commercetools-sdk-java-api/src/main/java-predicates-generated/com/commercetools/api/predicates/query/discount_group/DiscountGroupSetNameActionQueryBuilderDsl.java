
package com.commercetools.api.predicates.query.discount_group;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class DiscountGroupSetNameActionQueryBuilderDsl {
    public DiscountGroupSetNameActionQueryBuilderDsl() {
    }

    public static DiscountGroupSetNameActionQueryBuilderDsl of() {
        return new DiscountGroupSetNameActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<DiscountGroupSetNameActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, DiscountGroupSetNameActionQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<DiscountGroupSetNameActionQueryBuilderDsl> name(
            Function<com.commercetools.api.predicates.query.common.LocalizedStringQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.LocalizedStringQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("name"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.LocalizedStringQueryBuilderDsl.of())),
            DiscountGroupSetNameActionQueryBuilderDsl::of);
    }

}
