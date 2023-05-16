
package com.commercetools.api.predicates.query.tax_category;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class TaxCategoryUpdateActionQueryBuilderDsl {
    public TaxCategoryUpdateActionQueryBuilderDsl() {
    }

    public static TaxCategoryUpdateActionQueryBuilderDsl of() {
        return new TaxCategoryUpdateActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<TaxCategoryUpdateActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, TaxCategoryUpdateActionQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<TaxCategoryUpdateActionQueryBuilderDsl> asAddTaxRate(
            Function<com.commercetools.api.predicates.query.tax_category.TaxCategoryAddTaxRateActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.tax_category.TaxCategoryAddTaxRateActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(
                com.commercetools.api.predicates.query.tax_category.TaxCategoryAddTaxRateActionQueryBuilderDsl.of()),
            TaxCategoryUpdateActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<TaxCategoryUpdateActionQueryBuilderDsl> asChangeName(
            Function<com.commercetools.api.predicates.query.tax_category.TaxCategoryChangeNameActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.tax_category.TaxCategoryChangeNameActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(
                com.commercetools.api.predicates.query.tax_category.TaxCategoryChangeNameActionQueryBuilderDsl.of()),
            TaxCategoryUpdateActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<TaxCategoryUpdateActionQueryBuilderDsl> asRemoveTaxRate(
            Function<com.commercetools.api.predicates.query.tax_category.TaxCategoryRemoveTaxRateActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.tax_category.TaxCategoryRemoveTaxRateActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(
                com.commercetools.api.predicates.query.tax_category.TaxCategoryRemoveTaxRateActionQueryBuilderDsl.of()),
            TaxCategoryUpdateActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<TaxCategoryUpdateActionQueryBuilderDsl> asReplaceTaxRate(
            Function<com.commercetools.api.predicates.query.tax_category.TaxCategoryReplaceTaxRateActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.tax_category.TaxCategoryReplaceTaxRateActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(
            com.commercetools.api.predicates.query.tax_category.TaxCategoryReplaceTaxRateActionQueryBuilderDsl.of()),
            TaxCategoryUpdateActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<TaxCategoryUpdateActionQueryBuilderDsl> asSetDescription(
            Function<com.commercetools.api.predicates.query.tax_category.TaxCategorySetDescriptionActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.tax_category.TaxCategorySetDescriptionActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(
            com.commercetools.api.predicates.query.tax_category.TaxCategorySetDescriptionActionQueryBuilderDsl.of()),
            TaxCategoryUpdateActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<TaxCategoryUpdateActionQueryBuilderDsl> asSetKey(
            Function<com.commercetools.api.predicates.query.tax_category.TaxCategorySetKeyActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.tax_category.TaxCategorySetKeyActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.tax_category.TaxCategorySetKeyActionQueryBuilderDsl.of()),
            TaxCategoryUpdateActionQueryBuilderDsl::of);
    }
}
