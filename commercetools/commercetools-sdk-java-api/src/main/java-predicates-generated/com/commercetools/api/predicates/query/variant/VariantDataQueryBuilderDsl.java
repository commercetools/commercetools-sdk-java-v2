
package com.commercetools.api.predicates.query.variant;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class VariantDataQueryBuilderDsl {
    public VariantDataQueryBuilderDsl() {
    }

    public static VariantDataQueryBuilderDsl of() {
        return new VariantDataQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<VariantDataQueryBuilderDsl> sku() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("sku")),
            p -> new CombinationQueryPredicate<>(p, VariantDataQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<VariantDataQueryBuilderDsl> images(
            Function<com.commercetools.api.predicates.query.common.ImageQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.ImageQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("images"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.ImageQueryBuilderDsl.of())),
            VariantDataQueryBuilderDsl::of);
    }

    public CollectionPredicateBuilder<VariantDataQueryBuilderDsl> images() {
        return new CollectionPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("images")),
            p -> new CombinationQueryPredicate<>(p, VariantDataQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<VariantDataQueryBuilderDsl> attributes(
            Function<com.commercetools.api.predicates.query.product.AttributeQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.product.AttributeQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("attributes"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.product.AttributeQueryBuilderDsl.of())),
            VariantDataQueryBuilderDsl::of);
    }

    public CollectionPredicateBuilder<VariantDataQueryBuilderDsl> attributes() {
        return new CollectionPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("attributes")),
            p -> new CombinationQueryPredicate<>(p, VariantDataQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<VariantDataQueryBuilderDsl> assets(
            Function<com.commercetools.api.predicates.query.common.AssetQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.AssetQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("assets"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.AssetQueryBuilderDsl.of())),
            VariantDataQueryBuilderDsl::of);
    }

    public CollectionPredicateBuilder<VariantDataQueryBuilderDsl> assets() {
        return new CollectionPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("assets")),
            p -> new CombinationQueryPredicate<>(p, VariantDataQueryBuilderDsl::of));
    }

}
