
package com.commercetools.api.predicates.query.store;

import com.commercetools.api.predicates.query.*;

public class StoreSetPrivacyPolicyUrlActionQueryBuilderDsl {
    public StoreSetPrivacyPolicyUrlActionQueryBuilderDsl() {
    }

    public static StoreSetPrivacyPolicyUrlActionQueryBuilderDsl of() {
        return new StoreSetPrivacyPolicyUrlActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<StoreSetPrivacyPolicyUrlActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, StoreSetPrivacyPolicyUrlActionQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<StoreSetPrivacyPolicyUrlActionQueryBuilderDsl> privacyPolicyUrl() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("privacyPolicyUrl")),
            p -> new CombinationQueryPredicate<>(p, StoreSetPrivacyPolicyUrlActionQueryBuilderDsl::of));
    }

}
