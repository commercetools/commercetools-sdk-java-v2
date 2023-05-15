
package com.commercetools.api.predicates.query.message;

import com.commercetools.api.predicates.query.*;

public class AssociateRoleDeletedMessagePayloadQueryBuilderDsl {
    public AssociateRoleDeletedMessagePayloadQueryBuilderDsl() {
    }

    public static AssociateRoleDeletedMessagePayloadQueryBuilderDsl of() {
        return new AssociateRoleDeletedMessagePayloadQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<AssociateRoleDeletedMessagePayloadQueryBuilderDsl> type() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("type")),
            p -> new CombinationQueryPredicate<>(p, AssociateRoleDeletedMessagePayloadQueryBuilderDsl::of));
    }
}
