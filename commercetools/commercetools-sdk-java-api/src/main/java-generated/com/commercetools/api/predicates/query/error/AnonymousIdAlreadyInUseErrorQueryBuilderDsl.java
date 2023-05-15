
package com.commercetools.api.predicates.query.error;

import com.commercetools.api.predicates.query.*;

public class AnonymousIdAlreadyInUseErrorQueryBuilderDsl {
    public AnonymousIdAlreadyInUseErrorQueryBuilderDsl() {
    }

    public static AnonymousIdAlreadyInUseErrorQueryBuilderDsl of() {
        return new AnonymousIdAlreadyInUseErrorQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<AnonymousIdAlreadyInUseErrorQueryBuilderDsl> code() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("code")),
            p -> new CombinationQueryPredicate<>(p, AnonymousIdAlreadyInUseErrorQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<AnonymousIdAlreadyInUseErrorQueryBuilderDsl> message() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("message")),
            p -> new CombinationQueryPredicate<>(p, AnonymousIdAlreadyInUseErrorQueryBuilderDsl::of));
    }
}
