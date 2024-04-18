
package com.commercetools.api.predicates.query.common;

import com.commercetools.api.predicates.query.*;

public class AttributionQueryBuilderDsl {
    public AttributionQueryBuilderDsl() {
    }

    public static AttributionQueryBuilderDsl of() {
        return new AttributionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<AttributionQueryBuilderDsl> clientId() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("clientId")),
            p -> new CombinationQueryPredicate<>(p, AttributionQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<AttributionQueryBuilderDsl> source() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("source")),
            p -> new CombinationQueryPredicate<>(p, AttributionQueryBuilderDsl::of));
    }

}
