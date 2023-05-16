
package com.commercetools.api.predicates.query.error;

import com.commercetools.api.predicates.query.*;

public class SemanticErrorErrorQueryBuilderDsl {
    public SemanticErrorErrorQueryBuilderDsl() {
    }

    public static SemanticErrorErrorQueryBuilderDsl of() {
        return new SemanticErrorErrorQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<SemanticErrorErrorQueryBuilderDsl> code() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("code")),
            p -> new CombinationQueryPredicate<>(p, SemanticErrorErrorQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<SemanticErrorErrorQueryBuilderDsl> message() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("message")),
            p -> new CombinationQueryPredicate<>(p, SemanticErrorErrorQueryBuilderDsl::of));
    }

}
