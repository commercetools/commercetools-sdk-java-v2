
package com.commercetools.api.predicates.query.tax_category;

import com.commercetools.api.predicates.query.*;

public class TaxCategoryChangeNameActionQueryBuilderDsl {
    public TaxCategoryChangeNameActionQueryBuilderDsl() {
    }

    public static TaxCategoryChangeNameActionQueryBuilderDsl of() {
        return new TaxCategoryChangeNameActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<TaxCategoryChangeNameActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, TaxCategoryChangeNameActionQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<TaxCategoryChangeNameActionQueryBuilderDsl> name() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("name")),
            p -> new CombinationQueryPredicate<>(p, TaxCategoryChangeNameActionQueryBuilderDsl::of));
    }

}
