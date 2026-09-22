
package com.commercetools.api.predicates.query.message;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class VariantPublishedMessagePayloadQueryBuilderDsl {
    public VariantPublishedMessagePayloadQueryBuilderDsl() {
    }

    public static VariantPublishedMessagePayloadQueryBuilderDsl of() {
        return new VariantPublishedMessagePayloadQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<VariantPublishedMessagePayloadQueryBuilderDsl> type() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("type")),
            p -> new CombinationQueryPredicate<>(p, VariantPublishedMessagePayloadQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<VariantPublishedMessagePayloadQueryBuilderDsl> product(
            Function<com.commercetools.api.predicates.query.product.ProductReferenceQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.product.ProductReferenceQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
                .parent(ConstantQueryPredicate.of().constant("product"))
                .inner(fn.apply(com.commercetools.api.predicates.query.product.ProductReferenceQueryBuilderDsl.of())),
            VariantPublishedMessagePayloadQueryBuilderDsl::of);
    }

}
