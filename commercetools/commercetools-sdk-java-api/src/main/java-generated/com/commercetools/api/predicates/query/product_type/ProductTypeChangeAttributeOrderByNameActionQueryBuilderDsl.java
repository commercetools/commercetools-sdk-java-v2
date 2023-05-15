
package com.commercetools.api.predicates.query.product_type;

import com.commercetools.api.predicates.query.*;

public class ProductTypeChangeAttributeOrderByNameActionQueryBuilderDsl {
    public ProductTypeChangeAttributeOrderByNameActionQueryBuilderDsl() {
    }

    public static ProductTypeChangeAttributeOrderByNameActionQueryBuilderDsl of() {
        return new ProductTypeChangeAttributeOrderByNameActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<ProductTypeChangeAttributeOrderByNameActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, ProductTypeChangeAttributeOrderByNameActionQueryBuilderDsl::of));
    }

    public StringCollectionPredicateBuilder<ProductTypeChangeAttributeOrderByNameActionQueryBuilderDsl> attributeNames() {
        return new StringCollectionPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("attributeNames")),
            p -> new CombinationQueryPredicate<>(p, ProductTypeChangeAttributeOrderByNameActionQueryBuilderDsl::of));
    }
}
