
package com.commercetools.api.predicates.query.product_discount;

import com.commercetools.api.predicates.query.*;

public class ProductDiscountValueRelativeDraftQueryBuilderDsl {
    public ProductDiscountValueRelativeDraftQueryBuilderDsl() {
    }

    public static ProductDiscountValueRelativeDraftQueryBuilderDsl of() {
        return new ProductDiscountValueRelativeDraftQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<ProductDiscountValueRelativeDraftQueryBuilderDsl> type() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("type")),
            p -> new CombinationQueryPredicate<>(p, ProductDiscountValueRelativeDraftQueryBuilderDsl::of));
    }

    public LongComparisonPredicateBuilder<ProductDiscountValueRelativeDraftQueryBuilderDsl> permyriad() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("permyriad")),
            p -> new CombinationQueryPredicate<>(p, ProductDiscountValueRelativeDraftQueryBuilderDsl::of));
    }
}
