
package com.commercetools.api.predicates.query.product_type;

import com.commercetools.api.predicates.query.*;

public class ProductTypeChangeNameActionQueryBuilderDsl {
    public ProductTypeChangeNameActionQueryBuilderDsl() {
    }

    public static ProductTypeChangeNameActionQueryBuilderDsl of() {
        return new ProductTypeChangeNameActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<ProductTypeChangeNameActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, ProductTypeChangeNameActionQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<ProductTypeChangeNameActionQueryBuilderDsl> name() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("name")),
            p -> new CombinationQueryPredicate<>(p, ProductTypeChangeNameActionQueryBuilderDsl::of));
    }

}
