
package com.commercetools.api.predicates.query.message;

import com.commercetools.api.predicates.query.*;

public class VariantStagedChangesRemovedMessagePayloadQueryBuilderDsl {
    public VariantStagedChangesRemovedMessagePayloadQueryBuilderDsl() {
    }

    public static VariantStagedChangesRemovedMessagePayloadQueryBuilderDsl of() {
        return new VariantStagedChangesRemovedMessagePayloadQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<VariantStagedChangesRemovedMessagePayloadQueryBuilderDsl> type() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("type")),
            p -> new CombinationQueryPredicate<>(p, VariantStagedChangesRemovedMessagePayloadQueryBuilderDsl::of));
    }

}
