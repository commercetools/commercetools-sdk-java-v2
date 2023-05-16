
package com.commercetools.api.predicates.query.product_type;

import com.commercetools.api.predicates.query.*;

public class ProductTypeChangeInputHintActionQueryBuilderDsl {
    public ProductTypeChangeInputHintActionQueryBuilderDsl() {
    }

    public static ProductTypeChangeInputHintActionQueryBuilderDsl of() {
        return new ProductTypeChangeInputHintActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<ProductTypeChangeInputHintActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, ProductTypeChangeInputHintActionQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<ProductTypeChangeInputHintActionQueryBuilderDsl> attributeName() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("attributeName")),
            p -> new CombinationQueryPredicate<>(p, ProductTypeChangeInputHintActionQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<ProductTypeChangeInputHintActionQueryBuilderDsl> newValue() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("newValue")),
            p -> new CombinationQueryPredicate<>(p, ProductTypeChangeInputHintActionQueryBuilderDsl::of));
    }

}
