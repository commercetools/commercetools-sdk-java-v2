
package com.commercetools.api.predicates.query.product_type;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class ProductTypeChangeLabelActionQueryBuilderDsl {
    public ProductTypeChangeLabelActionQueryBuilderDsl() {
    }

    public static ProductTypeChangeLabelActionQueryBuilderDsl of() {
        return new ProductTypeChangeLabelActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<ProductTypeChangeLabelActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, ProductTypeChangeLabelActionQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<ProductTypeChangeLabelActionQueryBuilderDsl> attributeName() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("attributeName")),
            p -> new CombinationQueryPredicate<>(p, ProductTypeChangeLabelActionQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<ProductTypeChangeLabelActionQueryBuilderDsl> label(
            Function<com.commercetools.api.predicates.query.common.LocalizedStringQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.LocalizedStringQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("label"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.LocalizedStringQueryBuilderDsl.of())),
            ProductTypeChangeLabelActionQueryBuilderDsl::of);
    }

}
