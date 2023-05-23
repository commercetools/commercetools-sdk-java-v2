
package com.commercetools.api.predicates.query.error;

import com.commercetools.api.predicates.query.*;

public class InvalidFieldErrorQueryBuilderDsl {
    public InvalidFieldErrorQueryBuilderDsl() {
    }

    public static InvalidFieldErrorQueryBuilderDsl of() {
        return new InvalidFieldErrorQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<InvalidFieldErrorQueryBuilderDsl> code() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("code")),
            p -> new CombinationQueryPredicate<>(p, InvalidFieldErrorQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<InvalidFieldErrorQueryBuilderDsl> message() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("message")),
            p -> new CombinationQueryPredicate<>(p, InvalidFieldErrorQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<InvalidFieldErrorQueryBuilderDsl> field() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("field")),
            p -> new CombinationQueryPredicate<>(p, InvalidFieldErrorQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<InvalidFieldErrorQueryBuilderDsl> invalidValue() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("invalidValue")),
            p -> new CombinationQueryPredicate<>(p, InvalidFieldErrorQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<InvalidFieldErrorQueryBuilderDsl> allowedValues() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("allowedValues")),
            p -> new CombinationQueryPredicate<>(p, InvalidFieldErrorQueryBuilderDsl::of));
    }

}
