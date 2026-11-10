
package com.commercetools.api.predicates.query.cart;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class MergeCartDraftQueryBuilderDsl {
    public MergeCartDraftQueryBuilderDsl() {
    }

    public static MergeCartDraftQueryBuilderDsl of() {
        return new MergeCartDraftQueryBuilderDsl();
    }

    public CombinationQueryPredicate<MergeCartDraftQueryBuilderDsl> anonymousCart(
            Function<com.commercetools.api.predicates.query.cart.CartResourceIdentifierQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.cart.CartResourceIdentifierQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("anonymousCart"))
                    .inner(fn.apply(
                        com.commercetools.api.predicates.query.cart.CartResourceIdentifierQueryBuilderDsl.of())),
            MergeCartDraftQueryBuilderDsl::of);
    }

    public StringComparisonPredicateBuilder<MergeCartDraftQueryBuilderDsl> mergeMode() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("mergeMode")),
            p -> new CombinationQueryPredicate<>(p, MergeCartDraftQueryBuilderDsl::of));
    }

    public BooleanComparisonPredicateBuilder<MergeCartDraftQueryBuilderDsl> updateProductData() {
        return new BooleanComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("updateProductData")),
            p -> new CombinationQueryPredicate<>(p, MergeCartDraftQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<MergeCartDraftQueryBuilderDsl> anonymousId() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("anonymousId")),
            p -> new CombinationQueryPredicate<>(p, MergeCartDraftQueryBuilderDsl::of));
    }

}
