
package com.commercetools.api.predicates.query.error;

import com.commercetools.api.predicates.query.*;

public class ReferenceExistsErrorQueryBuilderDsl {
    public ReferenceExistsErrorQueryBuilderDsl() {
    }

    public static ReferenceExistsErrorQueryBuilderDsl of() {
        return new ReferenceExistsErrorQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<ReferenceExistsErrorQueryBuilderDsl> code() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("code")),
            p -> new CombinationQueryPredicate<>(p, ReferenceExistsErrorQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<ReferenceExistsErrorQueryBuilderDsl> message() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("message")),
            p -> new CombinationQueryPredicate<>(p, ReferenceExistsErrorQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<ReferenceExistsErrorQueryBuilderDsl> referencedBy() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("referencedBy")),
            p -> new CombinationQueryPredicate<>(p, ReferenceExistsErrorQueryBuilderDsl::of));
    }
}
