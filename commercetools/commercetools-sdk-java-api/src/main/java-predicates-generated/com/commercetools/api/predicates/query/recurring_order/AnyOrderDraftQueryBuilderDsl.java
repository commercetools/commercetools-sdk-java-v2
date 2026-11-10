
package com.commercetools.api.predicates.query.recurring_order;

import com.commercetools.api.predicates.query.*;

public class AnyOrderDraftQueryBuilderDsl {
    public AnyOrderDraftQueryBuilderDsl() {
    }

    public static AnyOrderDraftQueryBuilderDsl of() {
        return new AnyOrderDraftQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<AnyOrderDraftQueryBuilderDsl> type() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("type")),
            p -> new CombinationQueryPredicate<>(p, AnyOrderDraftQueryBuilderDsl::of));
    }

}
