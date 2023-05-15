
package com.commercetools.api.predicates.query.tax_category;

import com.commercetools.api.predicates.query.*;

public class TaxCategoryResourceIdentifierQueryBuilderDsl {
    public TaxCategoryResourceIdentifierQueryBuilderDsl() {
    }

    public static TaxCategoryResourceIdentifierQueryBuilderDsl of() {
        return new TaxCategoryResourceIdentifierQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<TaxCategoryResourceIdentifierQueryBuilderDsl> typeId() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("typeId")),
            p -> new CombinationQueryPredicate<>(p, TaxCategoryResourceIdentifierQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<TaxCategoryResourceIdentifierQueryBuilderDsl> id() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("id")),
            p -> new CombinationQueryPredicate<>(p, TaxCategoryResourceIdentifierQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<TaxCategoryResourceIdentifierQueryBuilderDsl> key() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("key")),
            p -> new CombinationQueryPredicate<>(p, TaxCategoryResourceIdentifierQueryBuilderDsl::of));
    }
}
