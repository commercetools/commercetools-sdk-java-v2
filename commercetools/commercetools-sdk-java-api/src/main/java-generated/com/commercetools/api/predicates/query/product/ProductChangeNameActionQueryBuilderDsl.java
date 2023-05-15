
package com.commercetools.api.predicates.query.product;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class ProductChangeNameActionQueryBuilderDsl {
    public ProductChangeNameActionQueryBuilderDsl() {
    }

    public static ProductChangeNameActionQueryBuilderDsl of() {
        return new ProductChangeNameActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<ProductChangeNameActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, ProductChangeNameActionQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<ProductChangeNameActionQueryBuilderDsl> name(
            Function<com.commercetools.api.predicates.query.common.LocalizedStringQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.LocalizedStringQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("name"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.LocalizedStringQueryBuilderDsl.of())),
            ProductChangeNameActionQueryBuilderDsl::of);
    }

    public BooleanComparisonPredicateBuilder<ProductChangeNameActionQueryBuilderDsl> staged() {
        return new BooleanComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("staged")),
            p -> new CombinationQueryPredicate<>(p, ProductChangeNameActionQueryBuilderDsl::of));
    }
}
