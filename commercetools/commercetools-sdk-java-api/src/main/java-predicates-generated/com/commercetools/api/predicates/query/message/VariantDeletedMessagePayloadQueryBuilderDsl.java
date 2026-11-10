
package com.commercetools.api.predicates.query.message;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class VariantDeletedMessagePayloadQueryBuilderDsl {
    public VariantDeletedMessagePayloadQueryBuilderDsl() {
    }

    public static VariantDeletedMessagePayloadQueryBuilderDsl of() {
        return new VariantDeletedMessagePayloadQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<VariantDeletedMessagePayloadQueryBuilderDsl> type() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("type")),
            p -> new CombinationQueryPredicate<>(p, VariantDeletedMessagePayloadQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<VariantDeletedMessagePayloadQueryBuilderDsl> product(
            Function<com.commercetools.api.predicates.query.product.ProductReferenceQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.product.ProductReferenceQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
                .parent(ConstantQueryPredicate.of().constant("product"))
                .inner(fn.apply(com.commercetools.api.predicates.query.product.ProductReferenceQueryBuilderDsl.of())),
            VariantDeletedMessagePayloadQueryBuilderDsl::of);
    }

}
