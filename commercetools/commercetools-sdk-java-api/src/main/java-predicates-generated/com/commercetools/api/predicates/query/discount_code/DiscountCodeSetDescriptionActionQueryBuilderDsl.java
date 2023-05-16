
package com.commercetools.api.predicates.query.discount_code;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class DiscountCodeSetDescriptionActionQueryBuilderDsl {
    public DiscountCodeSetDescriptionActionQueryBuilderDsl() {
    }

    public static DiscountCodeSetDescriptionActionQueryBuilderDsl of() {
        return new DiscountCodeSetDescriptionActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<DiscountCodeSetDescriptionActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, DiscountCodeSetDescriptionActionQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<DiscountCodeSetDescriptionActionQueryBuilderDsl> description(
            Function<com.commercetools.api.predicates.query.common.LocalizedStringQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.LocalizedStringQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("description"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.LocalizedStringQueryBuilderDsl.of())),
            DiscountCodeSetDescriptionActionQueryBuilderDsl::of);
    }

}
