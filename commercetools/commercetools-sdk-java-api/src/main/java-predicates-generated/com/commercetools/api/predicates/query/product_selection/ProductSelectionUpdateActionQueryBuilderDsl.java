
package com.commercetools.api.predicates.query.product_selection;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class ProductSelectionUpdateActionQueryBuilderDsl {
    public ProductSelectionUpdateActionQueryBuilderDsl() {
    }

    public static ProductSelectionUpdateActionQueryBuilderDsl of() {
        return new ProductSelectionUpdateActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<ProductSelectionUpdateActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, ProductSelectionUpdateActionQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<ProductSelectionUpdateActionQueryBuilderDsl> asAddProduct(
            Function<com.commercetools.api.predicates.query.product_selection.ProductSelectionAddProductActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.product_selection.ProductSelectionAddProductActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(
            com.commercetools.api.predicates.query.product_selection.ProductSelectionAddProductActionQueryBuilderDsl
                    .of()),
            ProductSelectionUpdateActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<ProductSelectionUpdateActionQueryBuilderDsl> asChangeName(
            Function<com.commercetools.api.predicates.query.product_selection.ProductSelectionChangeNameActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.product_selection.ProductSelectionChangeNameActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(
            com.commercetools.api.predicates.query.product_selection.ProductSelectionChangeNameActionQueryBuilderDsl
                    .of()),
            ProductSelectionUpdateActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<ProductSelectionUpdateActionQueryBuilderDsl> asExcludeProduct(
            Function<com.commercetools.api.predicates.query.product_selection.ProductSelectionExcludeProductActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.product_selection.ProductSelectionExcludeProductActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(
            com.commercetools.api.predicates.query.product_selection.ProductSelectionExcludeProductActionQueryBuilderDsl
                    .of()),
            ProductSelectionUpdateActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<ProductSelectionUpdateActionQueryBuilderDsl> asRemoveProduct(
            Function<com.commercetools.api.predicates.query.product_selection.ProductSelectionRemoveProductActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.product_selection.ProductSelectionRemoveProductActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(
            com.commercetools.api.predicates.query.product_selection.ProductSelectionRemoveProductActionQueryBuilderDsl
                    .of()),
            ProductSelectionUpdateActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<ProductSelectionUpdateActionQueryBuilderDsl> asSetCustomField(
            Function<com.commercetools.api.predicates.query.product_selection.ProductSelectionSetCustomFieldActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.product_selection.ProductSelectionSetCustomFieldActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(
            com.commercetools.api.predicates.query.product_selection.ProductSelectionSetCustomFieldActionQueryBuilderDsl
                    .of()),
            ProductSelectionUpdateActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<ProductSelectionUpdateActionQueryBuilderDsl> asSetCustomType(
            Function<com.commercetools.api.predicates.query.product_selection.ProductSelectionSetCustomTypeActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.product_selection.ProductSelectionSetCustomTypeActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(
            com.commercetools.api.predicates.query.product_selection.ProductSelectionSetCustomTypeActionQueryBuilderDsl
                    .of()),
            ProductSelectionUpdateActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<ProductSelectionUpdateActionQueryBuilderDsl> asSetKey(
            Function<com.commercetools.api.predicates.query.product_selection.ProductSelectionSetKeyActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.product_selection.ProductSelectionSetKeyActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(
            com.commercetools.api.predicates.query.product_selection.ProductSelectionSetKeyActionQueryBuilderDsl.of()),
            ProductSelectionUpdateActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<ProductSelectionUpdateActionQueryBuilderDsl> asSetVariantExclusion(
            Function<com.commercetools.api.predicates.query.product_selection.ProductSelectionSetVariantExclusionActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.product_selection.ProductSelectionSetVariantExclusionActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(
            com.commercetools.api.predicates.query.product_selection.ProductSelectionSetVariantExclusionActionQueryBuilderDsl
                    .of()),
            ProductSelectionUpdateActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<ProductSelectionUpdateActionQueryBuilderDsl> asSetVariantSelection(
            Function<com.commercetools.api.predicates.query.product_selection.ProductSelectionSetVariantSelectionActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.product_selection.ProductSelectionSetVariantSelectionActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(
            com.commercetools.api.predicates.query.product_selection.ProductSelectionSetVariantSelectionActionQueryBuilderDsl
                    .of()),
            ProductSelectionUpdateActionQueryBuilderDsl::of);
    }
}
