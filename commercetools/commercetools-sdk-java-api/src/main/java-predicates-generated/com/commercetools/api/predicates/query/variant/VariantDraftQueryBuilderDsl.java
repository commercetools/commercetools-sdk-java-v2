
package com.commercetools.api.predicates.query.variant;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class VariantDraftQueryBuilderDsl {
    public VariantDraftQueryBuilderDsl() {
    }

    public static VariantDraftQueryBuilderDsl of() {
        return new VariantDraftQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<VariantDraftQueryBuilderDsl> key() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("key")),
            p -> new CombinationQueryPredicate<>(p, VariantDraftQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<VariantDraftQueryBuilderDsl> sku() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("sku")),
            p -> new CombinationQueryPredicate<>(p, VariantDraftQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<VariantDraftQueryBuilderDsl> product(
            Function<com.commercetools.api.predicates.query.product.ProductResourceIdentifierQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.product.ProductResourceIdentifierQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("product"))
                    .inner(fn.apply(
                        com.commercetools.api.predicates.query.product.ProductResourceIdentifierQueryBuilderDsl.of())),
            VariantDraftQueryBuilderDsl::of);
    }

    public BooleanComparisonPredicateBuilder<VariantDraftQueryBuilderDsl> publish() {
        return new BooleanComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("publish")),
            p -> new CombinationQueryPredicate<>(p, VariantDraftQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<VariantDraftQueryBuilderDsl> images(
            Function<com.commercetools.api.predicates.query.common.ImageQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.ImageQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("images"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.ImageQueryBuilderDsl.of())),
            VariantDraftQueryBuilderDsl::of);
    }

    public CollectionPredicateBuilder<VariantDraftQueryBuilderDsl> images() {
        return new CollectionPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("images")),
            p -> new CombinationQueryPredicate<>(p, VariantDraftQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<VariantDraftQueryBuilderDsl> attributes(
            Function<com.commercetools.api.predicates.query.product.AttributeQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.product.AttributeQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("attributes"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.product.AttributeQueryBuilderDsl.of())),
            VariantDraftQueryBuilderDsl::of);
    }

    public CollectionPredicateBuilder<VariantDraftQueryBuilderDsl> attributes() {
        return new CollectionPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("attributes")),
            p -> new CombinationQueryPredicate<>(p, VariantDraftQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<VariantDraftQueryBuilderDsl> assets(
            Function<com.commercetools.api.predicates.query.common.AssetDraftQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.AssetDraftQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("assets"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.AssetDraftQueryBuilderDsl.of())),
            VariantDraftQueryBuilderDsl::of);
    }

    public CollectionPredicateBuilder<VariantDraftQueryBuilderDsl> assets() {
        return new CollectionPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("assets")),
            p -> new CombinationQueryPredicate<>(p, VariantDraftQueryBuilderDsl::of));
    }

}
