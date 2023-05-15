
package com.commercetools.api.predicates.query.tax_category;

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
}
