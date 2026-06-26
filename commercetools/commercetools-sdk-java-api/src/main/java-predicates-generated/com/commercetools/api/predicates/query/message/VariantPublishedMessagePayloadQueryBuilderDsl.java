
package com.commercetools.api.predicates.query.message;

import com.commercetools.api.predicates.query.*;

public class VariantPublishedMessagePayloadQueryBuilderDsl {
    public VariantPublishedMessagePayloadQueryBuilderDsl() {
    }

    public static VariantPublishedMessagePayloadQueryBuilderDsl of() {
        return new VariantPublishedMessagePayloadQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<VariantPublishedMessagePayloadQueryBuilderDsl> type() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("type")),
            p -> new CombinationQueryPredicate<>(p, VariantPublishedMessagePayloadQueryBuilderDsl::of));
    }

}
