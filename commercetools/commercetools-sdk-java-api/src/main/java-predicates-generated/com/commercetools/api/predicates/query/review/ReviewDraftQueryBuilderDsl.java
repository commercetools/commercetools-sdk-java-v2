
package com.commercetools.api.predicates.query.review;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class ReviewDraftQueryBuilderDsl {
    public ReviewDraftQueryBuilderDsl() {
    }

    public static ReviewDraftQueryBuilderDsl of() {
        return new ReviewDraftQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<ReviewDraftQueryBuilderDsl> key() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("key")),
            p -> new CombinationQueryPredicate<>(p, ReviewDraftQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<ReviewDraftQueryBuilderDsl> uniquenessValue() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("uniquenessValue")),
            p -> new CombinationQueryPredicate<>(p, ReviewDraftQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<ReviewDraftQueryBuilderDsl> locale() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("locale")),
            p -> new CombinationQueryPredicate<>(p, ReviewDraftQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<ReviewDraftQueryBuilderDsl> authorName() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("authorName")),
            p -> new CombinationQueryPredicate<>(p, ReviewDraftQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<ReviewDraftQueryBuilderDsl> title() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("title")),
            p -> new CombinationQueryPredicate<>(p, ReviewDraftQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<ReviewDraftQueryBuilderDsl> text() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("text")),
            p -> new CombinationQueryPredicate<>(p, ReviewDraftQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<ReviewDraftQueryBuilderDsl> target(
            Function<com.commercetools.api.predicates.query.common.ResourceIdentifierQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.ResourceIdentifierQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
                .parent(ConstantQueryPredicate.of().constant("target"))
                .inner(fn.apply(com.commercetools.api.predicates.query.common.ResourceIdentifierQueryBuilderDsl.of())),
            ReviewDraftQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<ReviewDraftQueryBuilderDsl> state(
            Function<com.commercetools.api.predicates.query.state.StateResourceIdentifierQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.state.StateResourceIdentifierQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("state"))
                    .inner(fn.apply(
                        com.commercetools.api.predicates.query.state.StateResourceIdentifierQueryBuilderDsl.of())),
            ReviewDraftQueryBuilderDsl::of);
    }

    public LongComparisonPredicateBuilder<ReviewDraftQueryBuilderDsl> rating() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("rating")),
            p -> new CombinationQueryPredicate<>(p, ReviewDraftQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<ReviewDraftQueryBuilderDsl> customer(
            Function<com.commercetools.api.predicates.query.customer.CustomerResourceIdentifierQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.customer.CustomerResourceIdentifierQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
                .parent(ConstantQueryPredicate.of().constant("customer"))
                .inner(fn.apply(
                    com.commercetools.api.predicates.query.customer.CustomerResourceIdentifierQueryBuilderDsl.of())),
            ReviewDraftQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<ReviewDraftQueryBuilderDsl> custom(
            Function<com.commercetools.api.predicates.query.type.CustomFieldsDraftQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.type.CustomFieldsDraftQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("custom"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.type.CustomFieldsDraftQueryBuilderDsl.of())),
            ReviewDraftQueryBuilderDsl::of);
    }

}
