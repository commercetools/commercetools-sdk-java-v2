
package com.commercetools.api.predicates.query.tax_category;

import com.commercetools.api.predicates.query.*;

public class TaxCategoryRemoveTaxRateActionQueryBuilderDsl {
    public TaxCategoryRemoveTaxRateActionQueryBuilderDsl() {
    }

    public static TaxCategoryRemoveTaxRateActionQueryBuilderDsl of() {
        return new TaxCategoryRemoveTaxRateActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<TaxCategoryRemoveTaxRateActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, TaxCategoryRemoveTaxRateActionQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<TaxCategoryRemoveTaxRateActionQueryBuilderDsl> taxRateId() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("taxRateId")),
            p -> new CombinationQueryPredicate<>(p, TaxCategoryRemoveTaxRateActionQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<TaxCategoryRemoveTaxRateActionQueryBuilderDsl> taxRateKey() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("taxRateKey")),
            p -> new CombinationQueryPredicate<>(p, TaxCategoryRemoveTaxRateActionQueryBuilderDsl::of));
    }
}
