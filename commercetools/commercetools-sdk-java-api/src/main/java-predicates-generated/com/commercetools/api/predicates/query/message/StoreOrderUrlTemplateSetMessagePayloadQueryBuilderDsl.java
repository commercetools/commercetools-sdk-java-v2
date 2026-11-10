
package com.commercetools.api.predicates.query.message;

import com.commercetools.api.predicates.query.*;

public class StoreOrderUrlTemplateSetMessagePayloadQueryBuilderDsl {
    public StoreOrderUrlTemplateSetMessagePayloadQueryBuilderDsl() {
    }

    public static StoreOrderUrlTemplateSetMessagePayloadQueryBuilderDsl of() {
        return new StoreOrderUrlTemplateSetMessagePayloadQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<StoreOrderUrlTemplateSetMessagePayloadQueryBuilderDsl> type() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("type")),
            p -> new CombinationQueryPredicate<>(p, StoreOrderUrlTemplateSetMessagePayloadQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<StoreOrderUrlTemplateSetMessagePayloadQueryBuilderDsl> orderUrlTemplate() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("orderUrlTemplate")),
            p -> new CombinationQueryPredicate<>(p, StoreOrderUrlTemplateSetMessagePayloadQueryBuilderDsl::of));
    }

}
