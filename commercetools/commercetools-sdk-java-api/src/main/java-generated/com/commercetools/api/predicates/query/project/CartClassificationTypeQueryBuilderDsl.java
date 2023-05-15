
package com.commercetools.api.predicates.query.project;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class CartClassificationTypeQueryBuilderDsl {
    public CartClassificationTypeQueryBuilderDsl() {
    }

    public static CartClassificationTypeQueryBuilderDsl of() {
        return new CartClassificationTypeQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<CartClassificationTypeQueryBuilderDsl> type() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("type")),
            p -> new CombinationQueryPredicate<>(p, CartClassificationTypeQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<CartClassificationTypeQueryBuilderDsl> values(
            Function<com.commercetools.api.predicates.query.type.CustomFieldLocalizedEnumValueQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.type.CustomFieldLocalizedEnumValueQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("values"))
                    .inner(fn.apply(
                        com.commercetools.api.predicates.query.type.CustomFieldLocalizedEnumValueQueryBuilderDsl.of())),
            CartClassificationTypeQueryBuilderDsl::of);
    }

    public CollectionPredicateBuilder<CartClassificationTypeQueryBuilderDsl> values() {
        return new CollectionPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("values")),
            p -> new CombinationQueryPredicate<>(p, CartClassificationTypeQueryBuilderDsl::of));
    }
}
