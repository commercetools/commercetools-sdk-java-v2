
package com.commercetools.api.predicates.query.product;

import com.commercetools.api.predicates.query.*;

public class ProductSetCategoryOrderHintActionQueryBuilderDsl {
    public ProductSetCategoryOrderHintActionQueryBuilderDsl() {
    }

    public static ProductSetCategoryOrderHintActionQueryBuilderDsl of() {
        return new ProductSetCategoryOrderHintActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<ProductSetCategoryOrderHintActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, ProductSetCategoryOrderHintActionQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<ProductSetCategoryOrderHintActionQueryBuilderDsl> categoryId() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("categoryId")),
            p -> new CombinationQueryPredicate<>(p, ProductSetCategoryOrderHintActionQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<ProductSetCategoryOrderHintActionQueryBuilderDsl> orderHint() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("orderHint")),
            p -> new CombinationQueryPredicate<>(p, ProductSetCategoryOrderHintActionQueryBuilderDsl::of));
    }

    public BooleanComparisonPredicateBuilder<ProductSetCategoryOrderHintActionQueryBuilderDsl> staged() {
        return new BooleanComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("staged")),
            p -> new CombinationQueryPredicate<>(p, ProductSetCategoryOrderHintActionQueryBuilderDsl::of));
    }

}
