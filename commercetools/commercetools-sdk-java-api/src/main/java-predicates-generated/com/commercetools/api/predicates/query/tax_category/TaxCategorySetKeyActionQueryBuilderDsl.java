
package com.commercetools.api.predicates.query.tax_category;

import com.commercetools.api.predicates.query.*;

public class TaxCategorySetKeyActionQueryBuilderDsl {
    public TaxCategorySetKeyActionQueryBuilderDsl() {
    }

    public static TaxCategorySetKeyActionQueryBuilderDsl of() {
        return new TaxCategorySetKeyActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<TaxCategorySetKeyActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, TaxCategorySetKeyActionQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<TaxCategorySetKeyActionQueryBuilderDsl> key() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("key")),
            p -> new CombinationQueryPredicate<>(p, TaxCategorySetKeyActionQueryBuilderDsl::of));
    }

}
