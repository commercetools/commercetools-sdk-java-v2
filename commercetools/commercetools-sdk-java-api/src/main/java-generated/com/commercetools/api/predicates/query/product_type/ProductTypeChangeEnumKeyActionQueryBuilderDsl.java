
package com.commercetools.api.predicates.query.product_type;

import com.commercetools.api.predicates.query.*;

public class ProductTypeChangeEnumKeyActionQueryBuilderDsl {
    public ProductTypeChangeEnumKeyActionQueryBuilderDsl() {
    }

    public static ProductTypeChangeEnumKeyActionQueryBuilderDsl of() {
        return new ProductTypeChangeEnumKeyActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<ProductTypeChangeEnumKeyActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, ProductTypeChangeEnumKeyActionQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<ProductTypeChangeEnumKeyActionQueryBuilderDsl> attributeName() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("attributeName")),
            p -> new CombinationQueryPredicate<>(p, ProductTypeChangeEnumKeyActionQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<ProductTypeChangeEnumKeyActionQueryBuilderDsl> key() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("key")),
            p -> new CombinationQueryPredicate<>(p, ProductTypeChangeEnumKeyActionQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<ProductTypeChangeEnumKeyActionQueryBuilderDsl> newKey() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("newKey")),
            p -> new CombinationQueryPredicate<>(p, ProductTypeChangeEnumKeyActionQueryBuilderDsl::of));
    }
}
