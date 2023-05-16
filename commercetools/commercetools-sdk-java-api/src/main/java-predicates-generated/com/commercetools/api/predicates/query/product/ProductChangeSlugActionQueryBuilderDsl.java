
package com.commercetools.api.predicates.query.product;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class ProductChangeSlugActionQueryBuilderDsl {
    public ProductChangeSlugActionQueryBuilderDsl() {
    }

    public static ProductChangeSlugActionQueryBuilderDsl of() {
        return new ProductChangeSlugActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<ProductChangeSlugActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, ProductChangeSlugActionQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<ProductChangeSlugActionQueryBuilderDsl> slug(
            Function<com.commercetools.api.predicates.query.common.LocalizedStringQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.LocalizedStringQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("slug"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.LocalizedStringQueryBuilderDsl.of())),
            ProductChangeSlugActionQueryBuilderDsl::of);
    }

    public BooleanComparisonPredicateBuilder<ProductChangeSlugActionQueryBuilderDsl> staged() {
        return new BooleanComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("staged")),
            p -> new CombinationQueryPredicate<>(p, ProductChangeSlugActionQueryBuilderDsl::of));
    }

}
