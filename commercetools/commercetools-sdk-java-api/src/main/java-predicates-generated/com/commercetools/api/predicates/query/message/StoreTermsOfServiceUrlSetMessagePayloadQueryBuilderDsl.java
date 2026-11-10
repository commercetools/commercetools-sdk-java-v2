
package com.commercetools.api.predicates.query.message;

import com.commercetools.api.predicates.query.*;

public class StoreTermsOfServiceUrlSetMessagePayloadQueryBuilderDsl {
    public StoreTermsOfServiceUrlSetMessagePayloadQueryBuilderDsl() {
    }

    public static StoreTermsOfServiceUrlSetMessagePayloadQueryBuilderDsl of() {
        return new StoreTermsOfServiceUrlSetMessagePayloadQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<StoreTermsOfServiceUrlSetMessagePayloadQueryBuilderDsl> type() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("type")),
            p -> new CombinationQueryPredicate<>(p, StoreTermsOfServiceUrlSetMessagePayloadQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<StoreTermsOfServiceUrlSetMessagePayloadQueryBuilderDsl> termsOfServiceUrl() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("termsOfServiceUrl")),
            p -> new CombinationQueryPredicate<>(p, StoreTermsOfServiceUrlSetMessagePayloadQueryBuilderDsl::of));
    }

}
