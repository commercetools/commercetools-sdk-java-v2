
package com.commercetools.api.predicates.query.message;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class VariantStagedChangesRemovedMessagePayloadQueryBuilderDsl {
    public VariantStagedChangesRemovedMessagePayloadQueryBuilderDsl() {
    }

    public static VariantStagedChangesRemovedMessagePayloadQueryBuilderDsl of() {
        return new VariantStagedChangesRemovedMessagePayloadQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<VariantStagedChangesRemovedMessagePayloadQueryBuilderDsl> type() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("type")),
            p -> new CombinationQueryPredicate<>(p, VariantStagedChangesRemovedMessagePayloadQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<VariantStagedChangesRemovedMessagePayloadQueryBuilderDsl> product(
            Function<com.commercetools.api.predicates.query.product.ProductReferenceQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.product.ProductReferenceQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
                .parent(ConstantQueryPredicate.of().constant("product"))
                .inner(fn.apply(com.commercetools.api.predicates.query.product.ProductReferenceQueryBuilderDsl.of())),
            VariantStagedChangesRemovedMessagePayloadQueryBuilderDsl::of);
    }

}
