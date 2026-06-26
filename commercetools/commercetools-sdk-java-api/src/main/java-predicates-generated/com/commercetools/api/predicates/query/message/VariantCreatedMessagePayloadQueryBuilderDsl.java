
package com.commercetools.api.predicates.query.message;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class VariantCreatedMessagePayloadQueryBuilderDsl {
    public VariantCreatedMessagePayloadQueryBuilderDsl() {
    }

    public static VariantCreatedMessagePayloadQueryBuilderDsl of() {
        return new VariantCreatedMessagePayloadQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<VariantCreatedMessagePayloadQueryBuilderDsl> type() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("type")),
            p -> new CombinationQueryPredicate<>(p, VariantCreatedMessagePayloadQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<VariantCreatedMessagePayloadQueryBuilderDsl> id() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("id")),
            p -> new CombinationQueryPredicate<>(p, VariantCreatedMessagePayloadQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<VariantCreatedMessagePayloadQueryBuilderDsl> productId() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("productId")),
            p -> new CombinationQueryPredicate<>(p, VariantCreatedMessagePayloadQueryBuilderDsl::of));
    }

    public LongComparisonPredicateBuilder<VariantCreatedMessagePayloadQueryBuilderDsl> variantId() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("variantId")),
            p -> new CombinationQueryPredicate<>(p, VariantCreatedMessagePayloadQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<VariantCreatedMessagePayloadQueryBuilderDsl> key() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("key")),
            p -> new CombinationQueryPredicate<>(p, VariantCreatedMessagePayloadQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<VariantCreatedMessagePayloadQueryBuilderDsl> sku() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("sku")),
            p -> new CombinationQueryPredicate<>(p, VariantCreatedMessagePayloadQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<VariantCreatedMessagePayloadQueryBuilderDsl> attributes(
            Function<com.commercetools.api.predicates.query.product.AttributeQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.product.AttributeQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("attributes"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.product.AttributeQueryBuilderDsl.of())),
            VariantCreatedMessagePayloadQueryBuilderDsl::of);
    }

    public CollectionPredicateBuilder<VariantCreatedMessagePayloadQueryBuilderDsl> attributes() {
        return new CollectionPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("attributes")),
            p -> new CombinationQueryPredicate<>(p, VariantCreatedMessagePayloadQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<VariantCreatedMessagePayloadQueryBuilderDsl> assets(
            Function<com.commercetools.api.predicates.query.common.AssetQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.AssetQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("assets"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.AssetQueryBuilderDsl.of())),
            VariantCreatedMessagePayloadQueryBuilderDsl::of);
    }

    public CollectionPredicateBuilder<VariantCreatedMessagePayloadQueryBuilderDsl> assets() {
        return new CollectionPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("assets")),
            p -> new CombinationQueryPredicate<>(p, VariantCreatedMessagePayloadQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<VariantCreatedMessagePayloadQueryBuilderDsl> images(
            Function<com.commercetools.api.predicates.query.common.ImageQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.ImageQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("images"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.ImageQueryBuilderDsl.of())),
            VariantCreatedMessagePayloadQueryBuilderDsl::of);
    }

    public CollectionPredicateBuilder<VariantCreatedMessagePayloadQueryBuilderDsl> images() {
        return new CollectionPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("images")),
            p -> new CombinationQueryPredicate<>(p, VariantCreatedMessagePayloadQueryBuilderDsl::of));
    }

    public BooleanComparisonPredicateBuilder<VariantCreatedMessagePayloadQueryBuilderDsl> publish() {
        return new BooleanComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("publish")),
            p -> new CombinationQueryPredicate<>(p, VariantCreatedMessagePayloadQueryBuilderDsl::of));
    }

}
