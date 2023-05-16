
package com.commercetools.api.predicates.query.subscription;

import com.commercetools.api.predicates.query.*;

public class ChangeSubscriptionQueryBuilderDsl {
    public ChangeSubscriptionQueryBuilderDsl() {
    }

    public static ChangeSubscriptionQueryBuilderDsl of() {
        return new ChangeSubscriptionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<ChangeSubscriptionQueryBuilderDsl> resourceTypeId() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("resourceTypeId")),
            p -> new CombinationQueryPredicate<>(p, ChangeSubscriptionQueryBuilderDsl::of));
    }

}
