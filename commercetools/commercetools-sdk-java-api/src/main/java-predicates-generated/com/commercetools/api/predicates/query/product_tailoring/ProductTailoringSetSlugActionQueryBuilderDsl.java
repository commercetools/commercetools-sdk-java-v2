
package com.commercetools.api.predicates.query.product_tailoring;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class ProductTailoringSetSlugActionQueryBuilderDsl {
    public ProductTailoringSetSlugActionQueryBuilderDsl() {
    }

    public static ProductTailoringSetSlugActionQueryBuilderDsl of() {
        return new ProductTailoringSetSlugActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<ProductTailoringSetSlugActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, ProductTailoringSetSlugActionQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<ProductTailoringSetSlugActionQueryBuilderDsl> slug(
            Function<com.commercetools.api.predicates.query.common.LocalizedStringQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.LocalizedStringQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("slug"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.LocalizedStringQueryBuilderDsl.of())),
            ProductTailoringSetSlugActionQueryBuilderDsl::of);
    }

    public BooleanComparisonPredicateBuilder<ProductTailoringSetSlugActionQueryBuilderDsl> staged() {
        return new BooleanComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("staged")),
            p -> new CombinationQueryPredicate<>(p, ProductTailoringSetSlugActionQueryBuilderDsl::of));
    }

}
