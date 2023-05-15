
package com.commercetools.api.predicates.query.error;

import com.commercetools.api.predicates.query.*;

public class ObjectNotFoundErrorQueryBuilderDsl {
    public ObjectNotFoundErrorQueryBuilderDsl() {
    }

    public static ObjectNotFoundErrorQueryBuilderDsl of() {
        return new ObjectNotFoundErrorQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<ObjectNotFoundErrorQueryBuilderDsl> code() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("code")),
            p -> new CombinationQueryPredicate<>(p, ObjectNotFoundErrorQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<ObjectNotFoundErrorQueryBuilderDsl> message() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("message")),
            p -> new CombinationQueryPredicate<>(p, ObjectNotFoundErrorQueryBuilderDsl::of));
    }
}
