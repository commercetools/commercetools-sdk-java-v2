
package com.commercetools.api.predicates.query.error;

import com.commercetools.api.predicates.query.*;

public class GeneralErrorQueryBuilderDsl {
    public GeneralErrorQueryBuilderDsl() {
    }

    public static GeneralErrorQueryBuilderDsl of() {
        return new GeneralErrorQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<GeneralErrorQueryBuilderDsl> code() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("code")),
            p -> new CombinationQueryPredicate<>(p, GeneralErrorQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<GeneralErrorQueryBuilderDsl> message() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("message")),
            p -> new CombinationQueryPredicate<>(p, GeneralErrorQueryBuilderDsl::of));
    }

}
