
package com.commercetools.api.predicates.query.discount_code;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class DiscountCodeSetCustomTypeActionQueryBuilderDsl {
    public DiscountCodeSetCustomTypeActionQueryBuilderDsl() {
    }

    public static DiscountCodeSetCustomTypeActionQueryBuilderDsl of() {
        return new DiscountCodeSetCustomTypeActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<DiscountCodeSetCustomTypeActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, DiscountCodeSetCustomTypeActionQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<DiscountCodeSetCustomTypeActionQueryBuilderDsl> type(
            Function<com.commercetools.api.predicates.query.type.TypeResourceIdentifierQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.type.TypeResourceIdentifierQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("type"))
                    .inner(fn.apply(
                        com.commercetools.api.predicates.query.type.TypeResourceIdentifierQueryBuilderDsl.of())),
            DiscountCodeSetCustomTypeActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<DiscountCodeSetCustomTypeActionQueryBuilderDsl> fields(
            Function<com.commercetools.api.predicates.query.type.FieldContainerQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.type.FieldContainerQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("fields"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.type.FieldContainerQueryBuilderDsl.of())),
            DiscountCodeSetCustomTypeActionQueryBuilderDsl::of);
    }

}
