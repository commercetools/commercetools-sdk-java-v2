
package com.commercetools.api.predicates.query.product_type;

import com.commercetools.api.predicates.query.*;

public class ProductTypeChangeDescriptionActionQueryBuilderDsl {
    public ProductTypeChangeDescriptionActionQueryBuilderDsl() {
    }

    public static ProductTypeChangeDescriptionActionQueryBuilderDsl of() {
        return new ProductTypeChangeDescriptionActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<ProductTypeChangeDescriptionActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, ProductTypeChangeDescriptionActionQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<ProductTypeChangeDescriptionActionQueryBuilderDsl> description() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("description")),
            p -> new CombinationQueryPredicate<>(p, ProductTypeChangeDescriptionActionQueryBuilderDsl::of));
    }
}
