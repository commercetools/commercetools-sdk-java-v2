
package com.commercetools.api.predicates.query.product_type;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class ProductTypeSetInputTipActionQueryBuilderDsl {
    public ProductTypeSetInputTipActionQueryBuilderDsl() {
    }

    public static ProductTypeSetInputTipActionQueryBuilderDsl of() {
        return new ProductTypeSetInputTipActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<ProductTypeSetInputTipActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, ProductTypeSetInputTipActionQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<ProductTypeSetInputTipActionQueryBuilderDsl> attributeName() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("attributeName")),
            p -> new CombinationQueryPredicate<>(p, ProductTypeSetInputTipActionQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<ProductTypeSetInputTipActionQueryBuilderDsl> inputTip(
            Function<com.commercetools.api.predicates.query.common.LocalizedStringQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.LocalizedStringQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("inputTip"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.LocalizedStringQueryBuilderDsl.of())),
            ProductTypeSetInputTipActionQueryBuilderDsl::of);
    }

}
