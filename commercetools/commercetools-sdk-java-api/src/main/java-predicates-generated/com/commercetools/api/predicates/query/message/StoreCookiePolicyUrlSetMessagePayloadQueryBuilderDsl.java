
package com.commercetools.api.predicates.query.message;

import com.commercetools.api.predicates.query.*;

public class StoreCookiePolicyUrlSetMessagePayloadQueryBuilderDsl {
    public StoreCookiePolicyUrlSetMessagePayloadQueryBuilderDsl() {
    }

    public static StoreCookiePolicyUrlSetMessagePayloadQueryBuilderDsl of() {
        return new StoreCookiePolicyUrlSetMessagePayloadQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<StoreCookiePolicyUrlSetMessagePayloadQueryBuilderDsl> type() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("type")),
            p -> new CombinationQueryPredicate<>(p, StoreCookiePolicyUrlSetMessagePayloadQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<StoreCookiePolicyUrlSetMessagePayloadQueryBuilderDsl> cookiePolicyUrl() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("cookiePolicyUrl")),
            p -> new CombinationQueryPredicate<>(p, StoreCookiePolicyUrlSetMessagePayloadQueryBuilderDsl::of));
    }

}
