
package com.commercetools.api.predicates.query.product_tailoring;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class ProductTailoringSetNameActionQueryBuilderDsl {
    public ProductTailoringSetNameActionQueryBuilderDsl() {
    }

    public static ProductTailoringSetNameActionQueryBuilderDsl of() {
        return new ProductTailoringSetNameActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<ProductTailoringSetNameActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, ProductTailoringSetNameActionQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<ProductTailoringSetNameActionQueryBuilderDsl> name(
            Function<com.commercetools.api.predicates.query.common.LocalizedStringQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.LocalizedStringQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("name"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.LocalizedStringQueryBuilderDsl.of())),
            ProductTailoringSetNameActionQueryBuilderDsl::of);
    }

    public BooleanComparisonPredicateBuilder<ProductTailoringSetNameActionQueryBuilderDsl> staged() {
        return new BooleanComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("staged")),
            p -> new CombinationQueryPredicate<>(p, ProductTailoringSetNameActionQueryBuilderDsl::of));
    }

}
