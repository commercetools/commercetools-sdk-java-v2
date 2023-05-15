
package com.commercetools.api.predicates.query.product_selection;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class ProductSelectionDraftQueryBuilderDsl {
    public ProductSelectionDraftQueryBuilderDsl() {
    }

    public static ProductSelectionDraftQueryBuilderDsl of() {
        return new ProductSelectionDraftQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<ProductSelectionDraftQueryBuilderDsl> key() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("key")),
            p -> new CombinationQueryPredicate<>(p, ProductSelectionDraftQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<ProductSelectionDraftQueryBuilderDsl> name(
            Function<com.commercetools.api.predicates.query.common.LocalizedStringQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.LocalizedStringQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("name"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.LocalizedStringQueryBuilderDsl.of())),
            ProductSelectionDraftQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<ProductSelectionDraftQueryBuilderDsl> custom(
            Function<com.commercetools.api.predicates.query.type.CustomFieldsDraftQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.type.CustomFieldsDraftQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("custom"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.type.CustomFieldsDraftQueryBuilderDsl.of())),
            ProductSelectionDraftQueryBuilderDsl::of);
    }

    public StringComparisonPredicateBuilder<ProductSelectionDraftQueryBuilderDsl> type() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("type")),
            p -> new CombinationQueryPredicate<>(p, ProductSelectionDraftQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<ProductSelectionDraftQueryBuilderDsl> mode() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("mode")),
            p -> new CombinationQueryPredicate<>(p, ProductSelectionDraftQueryBuilderDsl::of));
    }
}
