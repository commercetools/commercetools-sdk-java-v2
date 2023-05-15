
package com.commercetools.api.predicates.query.store;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class ProductSelectionSettingQueryBuilderDsl {
    public ProductSelectionSettingQueryBuilderDsl() {
    }

    public static ProductSelectionSettingQueryBuilderDsl of() {
        return new ProductSelectionSettingQueryBuilderDsl();
    }

    public CombinationQueryPredicate<ProductSelectionSettingQueryBuilderDsl> productSelection(
            Function<com.commercetools.api.predicates.query.product_selection.ProductSelectionReferenceQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.product_selection.ProductSelectionReferenceQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
                .parent(ConstantQueryPredicate.of().constant("productSelection"))
                .inner(fn.apply(
                    com.commercetools.api.predicates.query.product_selection.ProductSelectionReferenceQueryBuilderDsl
                            .of())),
            ProductSelectionSettingQueryBuilderDsl::of);
    }

    public BooleanComparisonPredicateBuilder<ProductSelectionSettingQueryBuilderDsl> active() {
        return new BooleanComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("active")),
            p -> new CombinationQueryPredicate<>(p, ProductSelectionSettingQueryBuilderDsl::of));
    }
}
