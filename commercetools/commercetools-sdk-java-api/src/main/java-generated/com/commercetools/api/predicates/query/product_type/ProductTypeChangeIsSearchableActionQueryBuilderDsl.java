
package com.commercetools.api.predicates.query.product_type;

import com.commercetools.api.predicates.query.*;

public class ProductTypeChangeIsSearchableActionQueryBuilderDsl {
    public ProductTypeChangeIsSearchableActionQueryBuilderDsl() {
    }

    public static ProductTypeChangeIsSearchableActionQueryBuilderDsl of() {
        return new ProductTypeChangeIsSearchableActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<ProductTypeChangeIsSearchableActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, ProductTypeChangeIsSearchableActionQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<ProductTypeChangeIsSearchableActionQueryBuilderDsl> attributeName() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("attributeName")),
            p -> new CombinationQueryPredicate<>(p, ProductTypeChangeIsSearchableActionQueryBuilderDsl::of));
    }

    public BooleanComparisonPredicateBuilder<ProductTypeChangeIsSearchableActionQueryBuilderDsl> isSearchable() {
        return new BooleanComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("isSearchable")),
            p -> new CombinationQueryPredicate<>(p, ProductTypeChangeIsSearchableActionQueryBuilderDsl::of));
    }
}
