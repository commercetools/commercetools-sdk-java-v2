package com.commercetools.api.predicates.query.review;

import com.commercetools.api.predicates.query.*;

import java.util.function.Function;


public class ReviewSetCustomFieldActionQueryBuilderDsl  {
    public ReviewSetCustomFieldActionQueryBuilderDsl() {
    }

    public static ReviewSetCustomFieldActionQueryBuilderDsl of() {
        return new ReviewSetCustomFieldActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<ReviewSetCustomFieldActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
        p -> new CombinationQueryPredicate<>(p, ReviewSetCustomFieldActionQueryBuilderDsl::of));
    }
    public StringComparisonPredicateBuilder<ReviewSetCustomFieldActionQueryBuilderDsl> name() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("name")),
        p -> new CombinationQueryPredicate<>(p, ReviewSetCustomFieldActionQueryBuilderDsl::of));
    }
    public StringComparisonPredicateBuilder<ReviewSetCustomFieldActionQueryBuilderDsl> value() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("value")),
        p -> new CombinationQueryPredicate<>(p, ReviewSetCustomFieldActionQueryBuilderDsl::of));
    }
    
}
