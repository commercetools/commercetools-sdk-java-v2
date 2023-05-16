
package com.commercetools.api.predicates.query.error;

import com.commercetools.api.predicates.query.*;

public class SyntaxErrorErrorQueryBuilderDsl {
    public SyntaxErrorErrorQueryBuilderDsl() {
    }

    public static SyntaxErrorErrorQueryBuilderDsl of() {
        return new SyntaxErrorErrorQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<SyntaxErrorErrorQueryBuilderDsl> code() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("code")),
            p -> new CombinationQueryPredicate<>(p, SyntaxErrorErrorQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<SyntaxErrorErrorQueryBuilderDsl> message() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("message")),
            p -> new CombinationQueryPredicate<>(p, SyntaxErrorErrorQueryBuilderDsl::of));
    }

}
