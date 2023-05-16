
package com.commercetools.api.predicates.query.product_discount;

import com.commercetools.api.predicates.query.*;

public class ProductDiscountValueExternalDraftQueryBuilderDsl {
    public ProductDiscountValueExternalDraftQueryBuilderDsl() {
    }

    public static ProductDiscountValueExternalDraftQueryBuilderDsl of() {
        return new ProductDiscountValueExternalDraftQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<ProductDiscountValueExternalDraftQueryBuilderDsl> type() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("type")),
            p -> new CombinationQueryPredicate<>(p, ProductDiscountValueExternalDraftQueryBuilderDsl::of));
    }

}
