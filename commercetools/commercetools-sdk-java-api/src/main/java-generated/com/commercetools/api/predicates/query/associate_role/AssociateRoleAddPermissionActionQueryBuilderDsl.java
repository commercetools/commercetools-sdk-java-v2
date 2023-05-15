
package com.commercetools.api.predicates.query.associate_role;

import com.commercetools.api.predicates.query.*;

public class AssociateRoleAddPermissionActionQueryBuilderDsl {
    public AssociateRoleAddPermissionActionQueryBuilderDsl() {
    }

    public static AssociateRoleAddPermissionActionQueryBuilderDsl of() {
        return new AssociateRoleAddPermissionActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<AssociateRoleAddPermissionActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, AssociateRoleAddPermissionActionQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<AssociateRoleAddPermissionActionQueryBuilderDsl> permission() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("permission")),
            p -> new CombinationQueryPredicate<>(p, AssociateRoleAddPermissionActionQueryBuilderDsl::of));
    }
}
