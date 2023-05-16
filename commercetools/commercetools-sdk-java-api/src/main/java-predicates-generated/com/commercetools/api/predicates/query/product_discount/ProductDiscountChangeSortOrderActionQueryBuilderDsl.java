
package com.commercetools.api.predicates.query.product_discount;

import com.commercetools.api.predicates.query.*;

public class ProductDiscountChangeSortOrderActionQueryBuilderDsl {
    public ProductDiscountChangeSortOrderActionQueryBuilderDsl() {
    }

    public static ProductDiscountChangeSortOrderActionQueryBuilderDsl of() {
        return new ProductDiscountChangeSortOrderActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<ProductDiscountChangeSortOrderActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, ProductDiscountChangeSortOrderActionQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<ProductDiscountChangeSortOrderActionQueryBuilderDsl> sortOrder() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("sortOrder")),
            p -> new CombinationQueryPredicate<>(p, ProductDiscountChangeSortOrderActionQueryBuilderDsl::of));
    }

}
