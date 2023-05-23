
package com.commercetools.api.predicates.query.product_selection;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class ProductSelectionChangeNameActionQueryBuilderDsl {
    public ProductSelectionChangeNameActionQueryBuilderDsl() {
    }

    public static ProductSelectionChangeNameActionQueryBuilderDsl of() {
        return new ProductSelectionChangeNameActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<ProductSelectionChangeNameActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, ProductSelectionChangeNameActionQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<ProductSelectionChangeNameActionQueryBuilderDsl> name(
            Function<com.commercetools.api.predicates.query.common.LocalizedStringQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.LocalizedStringQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("name"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.LocalizedStringQueryBuilderDsl.of())),
            ProductSelectionChangeNameActionQueryBuilderDsl::of);
    }

}
