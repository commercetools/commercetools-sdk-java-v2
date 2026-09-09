
package com.commercetools.api.predicates.query.message;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class VariantKeySetMessagePayloadQueryBuilderDsl {
    public VariantKeySetMessagePayloadQueryBuilderDsl() {
    }

    public static VariantKeySetMessagePayloadQueryBuilderDsl of() {
        return new VariantKeySetMessagePayloadQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<VariantKeySetMessagePayloadQueryBuilderDsl> type() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("type")),
            p -> new CombinationQueryPredicate<>(p, VariantKeySetMessagePayloadQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<VariantKeySetMessagePayloadQueryBuilderDsl> product(
            Function<com.commercetools.api.predicates.query.product.ProductReferenceQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.product.ProductReferenceQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
                .parent(ConstantQueryPredicate.of().constant("product"))
                .inner(fn.apply(com.commercetools.api.predicates.query.product.ProductReferenceQueryBuilderDsl.of())),
            VariantKeySetMessagePayloadQueryBuilderDsl::of);
    }

    public StringComparisonPredicateBuilder<VariantKeySetMessagePayloadQueryBuilderDsl> key() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("key")),
            p -> new CombinationQueryPredicate<>(p, VariantKeySetMessagePayloadQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<VariantKeySetMessagePayloadQueryBuilderDsl> oldKey() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("oldKey")),
            p -> new CombinationQueryPredicate<>(p, VariantKeySetMessagePayloadQueryBuilderDsl::of));
    }

}
