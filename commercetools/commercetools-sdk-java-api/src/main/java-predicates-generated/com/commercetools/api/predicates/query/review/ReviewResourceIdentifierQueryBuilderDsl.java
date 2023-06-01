package com.commercetools.api.predicates.query.review;

import com.commercetools.api.predicates.query.*;

import java.util.function.Function;


public class ReviewResourceIdentifierQueryBuilderDsl  {
    public ReviewResourceIdentifierQueryBuilderDsl() {
    }

    public static ReviewResourceIdentifierQueryBuilderDsl of() {
        return new ReviewResourceIdentifierQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<ReviewResourceIdentifierQueryBuilderDsl> typeId() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("typeId")),
        p -> new CombinationQueryPredicate<>(p, ReviewResourceIdentifierQueryBuilderDsl::of));
    }
    public StringComparisonPredicateBuilder<ReviewResourceIdentifierQueryBuilderDsl> id() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("id")),
        p -> new CombinationQueryPredicate<>(p, ReviewResourceIdentifierQueryBuilderDsl::of));
    }
    public StringComparisonPredicateBuilder<ReviewResourceIdentifierQueryBuilderDsl> key() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("key")),
        p -> new CombinationQueryPredicate<>(p, ReviewResourceIdentifierQueryBuilderDsl::of));
    }
    
}
