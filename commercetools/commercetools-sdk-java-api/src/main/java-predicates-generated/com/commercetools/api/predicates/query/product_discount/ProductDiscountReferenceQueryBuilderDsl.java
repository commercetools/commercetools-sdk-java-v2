
package com.commercetools.api.predicates.query.product_discount;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class ProductDiscountReferenceQueryBuilderDsl {
    public ProductDiscountReferenceQueryBuilderDsl() {
    }

    public static ProductDiscountReferenceQueryBuilderDsl of() {
        return new ProductDiscountReferenceQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<ProductDiscountReferenceQueryBuilderDsl> typeId() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("typeId")),
            p -> new CombinationQueryPredicate<>(p, ProductDiscountReferenceQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<ProductDiscountReferenceQueryBuilderDsl> id() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("id")),
            p -> new CombinationQueryPredicate<>(p, ProductDiscountReferenceQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<ProductDiscountReferenceQueryBuilderDsl> obj(
            Function<com.commercetools.api.predicates.query.product_discount.ProductDiscountQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.product_discount.ProductDiscountQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("obj"))
                    .inner(fn.apply(
                        com.commercetools.api.predicates.query.product_discount.ProductDiscountQueryBuilderDsl.of())),
            ProductDiscountReferenceQueryBuilderDsl::of);
    }

}
