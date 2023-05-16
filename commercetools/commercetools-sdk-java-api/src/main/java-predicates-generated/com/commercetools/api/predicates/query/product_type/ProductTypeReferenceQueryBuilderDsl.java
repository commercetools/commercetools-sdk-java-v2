
package com.commercetools.api.predicates.query.product_type;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class ProductTypeReferenceQueryBuilderDsl {
    public ProductTypeReferenceQueryBuilderDsl() {
    }

    public static ProductTypeReferenceQueryBuilderDsl of() {
        return new ProductTypeReferenceQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<ProductTypeReferenceQueryBuilderDsl> typeId() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("typeId")),
            p -> new CombinationQueryPredicate<>(p, ProductTypeReferenceQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<ProductTypeReferenceQueryBuilderDsl> id() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("id")),
            p -> new CombinationQueryPredicate<>(p, ProductTypeReferenceQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<ProductTypeReferenceQueryBuilderDsl> obj(
            Function<com.commercetools.api.predicates.query.product_type.ProductTypeQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.product_type.ProductTypeQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
                .parent(ConstantQueryPredicate.of().constant("obj"))
                .inner(fn.apply(com.commercetools.api.predicates.query.product_type.ProductTypeQueryBuilderDsl.of())),
            ProductTypeReferenceQueryBuilderDsl::of);
    }

}
