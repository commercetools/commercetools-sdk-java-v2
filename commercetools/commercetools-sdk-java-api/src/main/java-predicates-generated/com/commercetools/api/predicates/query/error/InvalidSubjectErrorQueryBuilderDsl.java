
package com.commercetools.api.predicates.query.error;

import com.commercetools.api.predicates.query.*;

public class InvalidSubjectErrorQueryBuilderDsl {
    public InvalidSubjectErrorQueryBuilderDsl() {
    }

    public static InvalidSubjectErrorQueryBuilderDsl of() {
        return new InvalidSubjectErrorQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<InvalidSubjectErrorQueryBuilderDsl> code() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("code")),
            p -> new CombinationQueryPredicate<>(p, InvalidSubjectErrorQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<InvalidSubjectErrorQueryBuilderDsl> message() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("message")),
            p -> new CombinationQueryPredicate<>(p, InvalidSubjectErrorQueryBuilderDsl::of));
    }

}
