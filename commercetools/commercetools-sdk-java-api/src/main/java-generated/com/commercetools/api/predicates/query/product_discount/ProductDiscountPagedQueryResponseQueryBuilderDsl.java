
package com.commercetools.api.predicates.query.product_discount;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class ProductDiscountPagedQueryResponseQueryBuilderDsl {
    public ProductDiscountPagedQueryResponseQueryBuilderDsl() {
    }

    public static ProductDiscountPagedQueryResponseQueryBuilderDsl of() {
        return new ProductDiscountPagedQueryResponseQueryBuilderDsl();
    }

    public LongComparisonPredicateBuilder<ProductDiscountPagedQueryResponseQueryBuilderDsl> limit() {
        return new LongComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("limit")),
            p -> new CombinationQueryPredicate<>(p, ProductDiscountPagedQueryResponseQueryBuilderDsl::of));
    }

    public LongComparisonPredicateBuilder<ProductDiscountPagedQueryResponseQueryBuilderDsl> offset() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("offset")),
            p -> new CombinationQueryPredicate<>(p, ProductDiscountPagedQueryResponseQueryBuilderDsl::of));
    }

    public LongComparisonPredicateBuilder<ProductDiscountPagedQueryResponseQueryBuilderDsl> count() {
        return new LongComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("count")),
            p -> new CombinationQueryPredicate<>(p, ProductDiscountPagedQueryResponseQueryBuilderDsl::of));
    }

    public LongComparisonPredicateBuilder<ProductDiscountPagedQueryResponseQueryBuilderDsl> total() {
        return new LongComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("total")),
            p -> new CombinationQueryPredicate<>(p, ProductDiscountPagedQueryResponseQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<ProductDiscountPagedQueryResponseQueryBuilderDsl> results(
            Function<com.commercetools.api.predicates.query.product_discount.ProductDiscountQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.product_discount.ProductDiscountQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("results"))
                    .inner(fn.apply(
                        com.commercetools.api.predicates.query.product_discount.ProductDiscountQueryBuilderDsl.of())),
            ProductDiscountPagedQueryResponseQueryBuilderDsl::of);
    }

    public CollectionPredicateBuilder<ProductDiscountPagedQueryResponseQueryBuilderDsl> results() {
        return new CollectionPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("results")),
            p -> new CombinationQueryPredicate<>(p, ProductDiscountPagedQueryResponseQueryBuilderDsl::of));
    }
}
