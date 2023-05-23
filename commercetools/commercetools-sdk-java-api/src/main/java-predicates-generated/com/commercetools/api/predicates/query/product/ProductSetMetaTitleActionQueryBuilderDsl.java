
package com.commercetools.api.predicates.query.product;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class ProductSetMetaTitleActionQueryBuilderDsl {
    public ProductSetMetaTitleActionQueryBuilderDsl() {
    }

    public static ProductSetMetaTitleActionQueryBuilderDsl of() {
        return new ProductSetMetaTitleActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<ProductSetMetaTitleActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, ProductSetMetaTitleActionQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<ProductSetMetaTitleActionQueryBuilderDsl> metaTitle(
            Function<com.commercetools.api.predicates.query.common.LocalizedStringQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.LocalizedStringQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("metaTitle"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.LocalizedStringQueryBuilderDsl.of())),
            ProductSetMetaTitleActionQueryBuilderDsl::of);
    }

    public BooleanComparisonPredicateBuilder<ProductSetMetaTitleActionQueryBuilderDsl> staged() {
        return new BooleanComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("staged")),
            p -> new CombinationQueryPredicate<>(p, ProductSetMetaTitleActionQueryBuilderDsl::of));
    }

}
