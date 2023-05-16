
package com.commercetools.api.predicates.query.error;

import com.commercetools.api.predicates.query.*;

public class InvalidJsonInputErrorQueryBuilderDsl {
    public InvalidJsonInputErrorQueryBuilderDsl() {
    }

    public static InvalidJsonInputErrorQueryBuilderDsl of() {
        return new InvalidJsonInputErrorQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<InvalidJsonInputErrorQueryBuilderDsl> code() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("code")),
            p -> new CombinationQueryPredicate<>(p, InvalidJsonInputErrorQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<InvalidJsonInputErrorQueryBuilderDsl> message() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("message")),
            p -> new CombinationQueryPredicate<>(p, InvalidJsonInputErrorQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<InvalidJsonInputErrorQueryBuilderDsl> detailedErrorMessage() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("detailedErrorMessage")),
            p -> new CombinationQueryPredicate<>(p, InvalidJsonInputErrorQueryBuilderDsl::of));
    }

}
