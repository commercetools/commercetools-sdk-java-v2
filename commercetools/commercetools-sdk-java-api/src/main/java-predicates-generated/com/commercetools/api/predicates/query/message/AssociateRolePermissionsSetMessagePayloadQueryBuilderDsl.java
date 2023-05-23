
package com.commercetools.api.predicates.query.message;

import com.commercetools.api.predicates.query.*;

public class AssociateRolePermissionsSetMessagePayloadQueryBuilderDsl {
    public AssociateRolePermissionsSetMessagePayloadQueryBuilderDsl() {
    }

    public static AssociateRolePermissionsSetMessagePayloadQueryBuilderDsl of() {
        return new AssociateRolePermissionsSetMessagePayloadQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<AssociateRolePermissionsSetMessagePayloadQueryBuilderDsl> type() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("type")),
            p -> new CombinationQueryPredicate<>(p, AssociateRolePermissionsSetMessagePayloadQueryBuilderDsl::of));
    }

    public StringCollectionPredicateBuilder<AssociateRolePermissionsSetMessagePayloadQueryBuilderDsl> permissions() {
        return new StringCollectionPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("permissions")),
            p -> new CombinationQueryPredicate<>(p, AssociateRolePermissionsSetMessagePayloadQueryBuilderDsl::of));
    }

}
