
package com.commercetools.api.predicates.query.product_discount;

import com.commercetools.api.predicates.query.*;

public class ProductDiscountValueRelativeQueryBuilderDsl {
    public ProductDiscountValueRelativeQueryBuilderDsl() {
    }

    public static ProductDiscountValueRelativeQueryBuilderDsl of() {
        return new ProductDiscountValueRelativeQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<ProductDiscountValueRelativeQueryBuilderDsl> type() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("type")),
            p -> new CombinationQueryPredicate<>(p, ProductDiscountValueRelativeQueryBuilderDsl::of));
    }

    public LongComparisonPredicateBuilder<ProductDiscountValueRelativeQueryBuilderDsl> permyriad() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("permyriad")),
            p -> new CombinationQueryPredicate<>(p, ProductDiscountValueRelativeQueryBuilderDsl::of));
    }

}
