
package com.commercetools.api.predicates.query.message;

import com.commercetools.api.predicates.query.*;

public class AssociateRolePermissionAddedMessagePayloadQueryBuilderDsl {
    public AssociateRolePermissionAddedMessagePayloadQueryBuilderDsl() {
    }

    public static AssociateRolePermissionAddedMessagePayloadQueryBuilderDsl of() {
        return new AssociateRolePermissionAddedMessagePayloadQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<AssociateRolePermissionAddedMessagePayloadQueryBuilderDsl> type() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("type")),
            p -> new CombinationQueryPredicate<>(p, AssociateRolePermissionAddedMessagePayloadQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<AssociateRolePermissionAddedMessagePayloadQueryBuilderDsl> permission() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("permission")),
            p -> new CombinationQueryPredicate<>(p, AssociateRolePermissionAddedMessagePayloadQueryBuilderDsl::of));
    }

}
