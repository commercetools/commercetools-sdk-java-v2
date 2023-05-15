
package com.commercetools.api.predicates.query.associate_role;

import com.commercetools.api.predicates.query.*;

public class AssociateRoleSetPermissionsActionQueryBuilderDsl {
    public AssociateRoleSetPermissionsActionQueryBuilderDsl() {
    }

    public static AssociateRoleSetPermissionsActionQueryBuilderDsl of() {
        return new AssociateRoleSetPermissionsActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<AssociateRoleSetPermissionsActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, AssociateRoleSetPermissionsActionQueryBuilderDsl::of));
    }

    public StringCollectionPredicateBuilder<AssociateRoleSetPermissionsActionQueryBuilderDsl> permissions() {
        return new StringCollectionPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("permissions")),
            p -> new CombinationQueryPredicate<>(p, AssociateRoleSetPermissionsActionQueryBuilderDsl::of));
    }
}
