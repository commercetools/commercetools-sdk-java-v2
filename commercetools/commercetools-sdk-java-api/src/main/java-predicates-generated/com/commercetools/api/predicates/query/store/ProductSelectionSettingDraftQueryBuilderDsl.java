
package com.commercetools.api.predicates.query.store;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class ProductSelectionSettingDraftQueryBuilderDsl {
    public ProductSelectionSettingDraftQueryBuilderDsl() {
    }

    public static ProductSelectionSettingDraftQueryBuilderDsl of() {
        return new ProductSelectionSettingDraftQueryBuilderDsl();
    }

    public CombinationQueryPredicate<ProductSelectionSettingDraftQueryBuilderDsl> productSelection(
            Function<com.commercetools.api.predicates.query.product_selection.ProductSelectionResourceIdentifierQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.product_selection.ProductSelectionResourceIdentifierQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
                .parent(ConstantQueryPredicate.of().constant("productSelection"))
                .inner(fn.apply(
                    com.commercetools.api.predicates.query.product_selection.ProductSelectionResourceIdentifierQueryBuilderDsl
                            .of())),
            ProductSelectionSettingDraftQueryBuilderDsl::of);
    }

    public BooleanComparisonPredicateBuilder<ProductSelectionSettingDraftQueryBuilderDsl> active() {
        return new BooleanComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("active")),
            p -> new CombinationQueryPredicate<>(p, ProductSelectionSettingDraftQueryBuilderDsl::of));
    }

}
