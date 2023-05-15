
package com.commercetools.api.predicates.query.common;

import com.commercetools.api.predicates.query.*;

public class ReferenceQueryBuilderDsl {
    public ReferenceQueryBuilderDsl() {
    }

    public static ReferenceQueryBuilderDsl of() {
        return new ReferenceQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<ReferenceQueryBuilderDsl> typeId() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("typeId")),
            p -> new CombinationQueryPredicate<>(p, ReferenceQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<ReferenceQueryBuilderDsl> id() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("id")),
            p -> new CombinationQueryPredicate<>(p, ReferenceQueryBuilderDsl::of));
    }
}
