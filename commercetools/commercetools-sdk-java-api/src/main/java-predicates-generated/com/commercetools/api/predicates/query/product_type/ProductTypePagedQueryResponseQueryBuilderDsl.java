
package com.commercetools.api.predicates.query.product_type;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class ProductTypePagedQueryResponseQueryBuilderDsl {
    public ProductTypePagedQueryResponseQueryBuilderDsl() {
    }

    public static ProductTypePagedQueryResponseQueryBuilderDsl of() {
        return new ProductTypePagedQueryResponseQueryBuilderDsl();
    }

    public LongComparisonPredicateBuilder<ProductTypePagedQueryResponseQueryBuilderDsl> limit() {
        return new LongComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("limit")),
            p -> new CombinationQueryPredicate<>(p, ProductTypePagedQueryResponseQueryBuilderDsl::of));
    }

    public LongComparisonPredicateBuilder<ProductTypePagedQueryResponseQueryBuilderDsl> offset() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("offset")),
            p -> new CombinationQueryPredicate<>(p, ProductTypePagedQueryResponseQueryBuilderDsl::of));
    }

    public LongComparisonPredicateBuilder<ProductTypePagedQueryResponseQueryBuilderDsl> count() {
        return new LongComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("count")),
            p -> new CombinationQueryPredicate<>(p, ProductTypePagedQueryResponseQueryBuilderDsl::of));
    }

    public LongComparisonPredicateBuilder<ProductTypePagedQueryResponseQueryBuilderDsl> total() {
        return new LongComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("total")),
            p -> new CombinationQueryPredicate<>(p, ProductTypePagedQueryResponseQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<ProductTypePagedQueryResponseQueryBuilderDsl> results(
            Function<com.commercetools.api.predicates.query.product_type.ProductTypeQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.product_type.ProductTypeQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
                .parent(ConstantQueryPredicate.of().constant("results"))
                .inner(fn.apply(com.commercetools.api.predicates.query.product_type.ProductTypeQueryBuilderDsl.of())),
            ProductTypePagedQueryResponseQueryBuilderDsl::of);
    }

    public CollectionPredicateBuilder<ProductTypePagedQueryResponseQueryBuilderDsl> results() {
        return new CollectionPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("results")),
            p -> new CombinationQueryPredicate<>(p, ProductTypePagedQueryResponseQueryBuilderDsl::of));
    }

}
