
package com.commercetools.api.predicates.query.product_search;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class ProductSearchErrorResponseQueryBuilderDsl {
    public ProductSearchErrorResponseQueryBuilderDsl() {
    }

    public static ProductSearchErrorResponseQueryBuilderDsl of() {
        return new ProductSearchErrorResponseQueryBuilderDsl();
    }

    public LongComparisonPredicateBuilder<ProductSearchErrorResponseQueryBuilderDsl> statusCode() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("statusCode")),
            p -> new CombinationQueryPredicate<>(p, ProductSearchErrorResponseQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<ProductSearchErrorResponseQueryBuilderDsl> message() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("message")),
            p -> new CombinationQueryPredicate<>(p, ProductSearchErrorResponseQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<ProductSearchErrorResponseQueryBuilderDsl> errors(
            Function<com.commercetools.api.predicates.query.error.ErrorObjectQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.error.ErrorObjectQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("errors"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.error.ErrorObjectQueryBuilderDsl.of())),
            ProductSearchErrorResponseQueryBuilderDsl::of);
    }

    public CollectionPredicateBuilder<ProductSearchErrorResponseQueryBuilderDsl> errors() {
        return new CollectionPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("errors")),
            p -> new CombinationQueryPredicate<>(p, ProductSearchErrorResponseQueryBuilderDsl::of));
    }

}
