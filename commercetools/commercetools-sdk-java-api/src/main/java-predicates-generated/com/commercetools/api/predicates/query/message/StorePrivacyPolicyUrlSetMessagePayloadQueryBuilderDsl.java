
package com.commercetools.api.predicates.query.message;

import com.commercetools.api.predicates.query.*;

public class StorePrivacyPolicyUrlSetMessagePayloadQueryBuilderDsl {
    public StorePrivacyPolicyUrlSetMessagePayloadQueryBuilderDsl() {
    }

    public static StorePrivacyPolicyUrlSetMessagePayloadQueryBuilderDsl of() {
        return new StorePrivacyPolicyUrlSetMessagePayloadQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<StorePrivacyPolicyUrlSetMessagePayloadQueryBuilderDsl> type() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("type")),
            p -> new CombinationQueryPredicate<>(p, StorePrivacyPolicyUrlSetMessagePayloadQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<StorePrivacyPolicyUrlSetMessagePayloadQueryBuilderDsl> privacyPolicyUrl() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("privacyPolicyUrl")),
            p -> new CombinationQueryPredicate<>(p, StorePrivacyPolicyUrlSetMessagePayloadQueryBuilderDsl::of));
    }

}
