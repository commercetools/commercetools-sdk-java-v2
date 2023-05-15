
package com.commercetools.api.predicates.query.subscription;

import com.commercetools.api.predicates.query.*;

public class DeliveryFormatQueryBuilderDsl {
    public DeliveryFormatQueryBuilderDsl() {
    }

    public static DeliveryFormatQueryBuilderDsl of() {
        return new DeliveryFormatQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<DeliveryFormatQueryBuilderDsl> type() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("type")),
            p -> new CombinationQueryPredicate<>(p, DeliveryFormatQueryBuilderDsl::of));
    }
}
