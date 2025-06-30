
package com.commercetools.api.predicates.query.discount_group;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class DiscountGroupSetDescriptionActionQueryBuilderDsl {
    public DiscountGroupSetDescriptionActionQueryBuilderDsl() {
    }

    public static DiscountGroupSetDescriptionActionQueryBuilderDsl of() {
        return new DiscountGroupSetDescriptionActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<DiscountGroupSetDescriptionActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, DiscountGroupSetDescriptionActionQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<DiscountGroupSetDescriptionActionQueryBuilderDsl> description(
            Function<com.commercetools.api.predicates.query.common.LocalizedStringQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.LocalizedStringQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("description"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.LocalizedStringQueryBuilderDsl.of())),
            DiscountGroupSetDescriptionActionQueryBuilderDsl::of);
    }

}
