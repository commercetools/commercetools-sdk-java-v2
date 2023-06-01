package com.commercetools.api.predicates.query.review;

import com.commercetools.api.predicates.query.*;

import java.util.function.Function;


public class ReviewUpdateActionQueryBuilderDsl  {
    public ReviewUpdateActionQueryBuilderDsl() {
    }

    public static ReviewUpdateActionQueryBuilderDsl of() {
        return new ReviewUpdateActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<ReviewUpdateActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
        p -> new CombinationQueryPredicate<>(p, ReviewUpdateActionQueryBuilderDsl::of));
    }
    
    public CombinationQueryPredicate<ReviewUpdateActionQueryBuilderDsl> asSetAuthorName(
        Function<com.commercetools.api.predicates.query.review.ReviewSetAuthorNameActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.review.ReviewSetAuthorNameActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(com.commercetools.api.predicates.query.review.ReviewSetAuthorNameActionQueryBuilderDsl.of()),
            ReviewUpdateActionQueryBuilderDsl::of);
    }
    public CombinationQueryPredicate<ReviewUpdateActionQueryBuilderDsl> asSetCustomField(
        Function<com.commercetools.api.predicates.query.review.ReviewSetCustomFieldActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.review.ReviewSetCustomFieldActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(com.commercetools.api.predicates.query.review.ReviewSetCustomFieldActionQueryBuilderDsl.of()),
            ReviewUpdateActionQueryBuilderDsl::of);
    }
    public CombinationQueryPredicate<ReviewUpdateActionQueryBuilderDsl> asSetCustomType(
        Function<com.commercetools.api.predicates.query.review.ReviewSetCustomTypeActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.review.ReviewSetCustomTypeActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(com.commercetools.api.predicates.query.review.ReviewSetCustomTypeActionQueryBuilderDsl.of()),
            ReviewUpdateActionQueryBuilderDsl::of);
    }
    public CombinationQueryPredicate<ReviewUpdateActionQueryBuilderDsl> asSetCustomer(
        Function<com.commercetools.api.predicates.query.review.ReviewSetCustomerActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.review.ReviewSetCustomerActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(com.commercetools.api.predicates.query.review.ReviewSetCustomerActionQueryBuilderDsl.of()),
            ReviewUpdateActionQueryBuilderDsl::of);
    }
    public CombinationQueryPredicate<ReviewUpdateActionQueryBuilderDsl> asSetKey(
        Function<com.commercetools.api.predicates.query.review.ReviewSetKeyActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.review.ReviewSetKeyActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(com.commercetools.api.predicates.query.review.ReviewSetKeyActionQueryBuilderDsl.of()),
            ReviewUpdateActionQueryBuilderDsl::of);
    }
    public CombinationQueryPredicate<ReviewUpdateActionQueryBuilderDsl> asSetLocale(
        Function<com.commercetools.api.predicates.query.review.ReviewSetLocaleActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.review.ReviewSetLocaleActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(com.commercetools.api.predicates.query.review.ReviewSetLocaleActionQueryBuilderDsl.of()),
            ReviewUpdateActionQueryBuilderDsl::of);
    }
    public CombinationQueryPredicate<ReviewUpdateActionQueryBuilderDsl> asSetRating(
        Function<com.commercetools.api.predicates.query.review.ReviewSetRatingActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.review.ReviewSetRatingActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(com.commercetools.api.predicates.query.review.ReviewSetRatingActionQueryBuilderDsl.of()),
            ReviewUpdateActionQueryBuilderDsl::of);
    }
    public CombinationQueryPredicate<ReviewUpdateActionQueryBuilderDsl> asSetTarget(
        Function<com.commercetools.api.predicates.query.review.ReviewSetTargetActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.review.ReviewSetTargetActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(com.commercetools.api.predicates.query.review.ReviewSetTargetActionQueryBuilderDsl.of()),
            ReviewUpdateActionQueryBuilderDsl::of);
    }
    public CombinationQueryPredicate<ReviewUpdateActionQueryBuilderDsl> asSetText(
        Function<com.commercetools.api.predicates.query.review.ReviewSetTextActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.review.ReviewSetTextActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(com.commercetools.api.predicates.query.review.ReviewSetTextActionQueryBuilderDsl.of()),
            ReviewUpdateActionQueryBuilderDsl::of);
    }
    public CombinationQueryPredicate<ReviewUpdateActionQueryBuilderDsl> asSetTitle(
        Function<com.commercetools.api.predicates.query.review.ReviewSetTitleActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.review.ReviewSetTitleActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(com.commercetools.api.predicates.query.review.ReviewSetTitleActionQueryBuilderDsl.of()),
            ReviewUpdateActionQueryBuilderDsl::of);
    }
    public CombinationQueryPredicate<ReviewUpdateActionQueryBuilderDsl> asTransitionState(
        Function<com.commercetools.api.predicates.query.review.ReviewTransitionStateActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.review.ReviewTransitionStateActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(com.commercetools.api.predicates.query.review.ReviewTransitionStateActionQueryBuilderDsl.of()),
            ReviewUpdateActionQueryBuilderDsl::of);
    }
}
