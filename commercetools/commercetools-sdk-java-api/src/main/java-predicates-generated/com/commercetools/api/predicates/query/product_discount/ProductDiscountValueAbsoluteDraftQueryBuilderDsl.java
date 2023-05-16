
package com.commercetools.api.predicates.query.product_discount;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class ProductDiscountValueAbsoluteDraftQueryBuilderDsl {
    public ProductDiscountValueAbsoluteDraftQueryBuilderDsl() {
    }

    public static ProductDiscountValueAbsoluteDraftQueryBuilderDsl of() {
        return new ProductDiscountValueAbsoluteDraftQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<ProductDiscountValueAbsoluteDraftQueryBuilderDsl> type() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("type")),
            p -> new CombinationQueryPredicate<>(p, ProductDiscountValueAbsoluteDraftQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<ProductDiscountValueAbsoluteDraftQueryBuilderDsl> money(
            Function<com.commercetools.api.predicates.query.common.MoneyQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.MoneyQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("money"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.MoneyQueryBuilderDsl.of())),
            ProductDiscountValueAbsoluteDraftQueryBuilderDsl::of);
    }

    public CollectionPredicateBuilder<ProductDiscountValueAbsoluteDraftQueryBuilderDsl> money() {
        return new CollectionPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("money")),
            p -> new CombinationQueryPredicate<>(p, ProductDiscountValueAbsoluteDraftQueryBuilderDsl::of));
    }

}
