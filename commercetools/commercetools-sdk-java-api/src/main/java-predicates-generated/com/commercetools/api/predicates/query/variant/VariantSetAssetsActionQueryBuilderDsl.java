
package com.commercetools.api.predicates.query.variant;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class VariantSetAssetsActionQueryBuilderDsl {
    public VariantSetAssetsActionQueryBuilderDsl() {
    }

    public static VariantSetAssetsActionQueryBuilderDsl of() {
        return new VariantSetAssetsActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<VariantSetAssetsActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, VariantSetAssetsActionQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<VariantSetAssetsActionQueryBuilderDsl> assets(
            Function<com.commercetools.api.predicates.query.common.AssetDraftQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.AssetDraftQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("assets"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.AssetDraftQueryBuilderDsl.of())),
            VariantSetAssetsActionQueryBuilderDsl::of);
    }

    public CollectionPredicateBuilder<VariantSetAssetsActionQueryBuilderDsl> assets() {
        return new CollectionPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("assets")),
            p -> new CombinationQueryPredicate<>(p, VariantSetAssetsActionQueryBuilderDsl::of));
    }

    public BooleanComparisonPredicateBuilder<VariantSetAssetsActionQueryBuilderDsl> staged() {
        return new BooleanComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("staged")),
            p -> new CombinationQueryPredicate<>(p, VariantSetAssetsActionQueryBuilderDsl::of));
    }

}
