
package com.commercetools.api.predicates.query.product_tailoring;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class ProductTailoringSetMetaTitleActionQueryBuilderDsl {
    public ProductTailoringSetMetaTitleActionQueryBuilderDsl() {
    }

    public static ProductTailoringSetMetaTitleActionQueryBuilderDsl of() {
        return new ProductTailoringSetMetaTitleActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<ProductTailoringSetMetaTitleActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, ProductTailoringSetMetaTitleActionQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<ProductTailoringSetMetaTitleActionQueryBuilderDsl> metaTitle(
            Function<com.commercetools.api.predicates.query.common.LocalizedStringQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.LocalizedStringQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("metaTitle"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.LocalizedStringQueryBuilderDsl.of())),
            ProductTailoringSetMetaTitleActionQueryBuilderDsl::of);
    }

    public BooleanComparisonPredicateBuilder<ProductTailoringSetMetaTitleActionQueryBuilderDsl> staged() {
        return new BooleanComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("staged")),
            p -> new CombinationQueryPredicate<>(p, ProductTailoringSetMetaTitleActionQueryBuilderDsl::of));
    }

}
