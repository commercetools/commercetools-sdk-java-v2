
package com.commercetools.api.predicates.query.error;

import com.commercetools.api.predicates.query.*;

public class InsufficientScopeErrorQueryBuilderDsl {
    public InsufficientScopeErrorQueryBuilderDsl() {
    }

    public static InsufficientScopeErrorQueryBuilderDsl of() {
        return new InsufficientScopeErrorQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<InsufficientScopeErrorQueryBuilderDsl> code() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("code")),
            p -> new CombinationQueryPredicate<>(p, InsufficientScopeErrorQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<InsufficientScopeErrorQueryBuilderDsl> message() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("message")),
            p -> new CombinationQueryPredicate<>(p, InsufficientScopeErrorQueryBuilderDsl::of));
    }
}
