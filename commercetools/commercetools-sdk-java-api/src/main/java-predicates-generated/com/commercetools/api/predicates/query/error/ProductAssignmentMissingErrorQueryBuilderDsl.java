
package com.commercetools.api.predicates.query.error;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class ProductAssignmentMissingErrorQueryBuilderDsl {
    public ProductAssignmentMissingErrorQueryBuilderDsl() {
    }

    public static ProductAssignmentMissingErrorQueryBuilderDsl of() {
        return new ProductAssignmentMissingErrorQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<ProductAssignmentMissingErrorQueryBuilderDsl> code() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("code")),
            p -> new CombinationQueryPredicate<>(p, ProductAssignmentMissingErrorQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<ProductAssignmentMissingErrorQueryBuilderDsl> message() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("message")),
            p -> new CombinationQueryPredicate<>(p, ProductAssignmentMissingErrorQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<ProductAssignmentMissingErrorQueryBuilderDsl> product(
            Function<com.commercetools.api.predicates.query.product.ProductReferenceQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.product.ProductReferenceQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
                .parent(ConstantQueryPredicate.of().constant("product"))
                .inner(fn.apply(com.commercetools.api.predicates.query.product.ProductReferenceQueryBuilderDsl.of())),
            ProductAssignmentMissingErrorQueryBuilderDsl::of);
    }

}
