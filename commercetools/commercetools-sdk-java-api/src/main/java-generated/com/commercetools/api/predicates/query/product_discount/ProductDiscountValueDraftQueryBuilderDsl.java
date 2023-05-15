
package com.commercetools.api.predicates.query.product_discount;

import com.commercetools.api.predicates.query.*;

public class ProductDiscountValueDraftQueryBuilderDsl {
    public ProductDiscountValueDraftQueryBuilderDsl() {
    }

    public static ProductDiscountValueDraftQueryBuilderDsl of() {
        return new ProductDiscountValueDraftQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<ProductDiscountValueDraftQueryBuilderDsl> type() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("type")),
            p -> new CombinationQueryPredicate<>(p, ProductDiscountValueDraftQueryBuilderDsl::of));
    }
}
