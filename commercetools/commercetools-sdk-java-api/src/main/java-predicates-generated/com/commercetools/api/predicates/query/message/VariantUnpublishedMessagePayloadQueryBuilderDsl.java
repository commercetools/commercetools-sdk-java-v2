
package com.commercetools.api.predicates.query.message;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class VariantUnpublishedMessagePayloadQueryBuilderDsl {
    public VariantUnpublishedMessagePayloadQueryBuilderDsl() {
    }

    public static VariantUnpublishedMessagePayloadQueryBuilderDsl of() {
        return new VariantUnpublishedMessagePayloadQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<VariantUnpublishedMessagePayloadQueryBuilderDsl> type() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("type")),
            p -> new CombinationQueryPredicate<>(p, VariantUnpublishedMessagePayloadQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<VariantUnpublishedMessagePayloadQueryBuilderDsl> product(
            Function<com.commercetools.api.predicates.query.product.ProductReferenceQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.product.ProductReferenceQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
                .parent(ConstantQueryPredicate.of().constant("product"))
                .inner(fn.apply(com.commercetools.api.predicates.query.product.ProductReferenceQueryBuilderDsl.of())),
            VariantUnpublishedMessagePayloadQueryBuilderDsl::of);
    }

}
