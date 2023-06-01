package com.commercetools.api.predicates.query.associate_role;

import com.commercetools.api.predicates.query.*;

import java.util.function.Function;


public class AssociateRoleRemovePermissionActionQueryBuilderDsl  {
    public AssociateRoleRemovePermissionActionQueryBuilderDsl() {
    }

    public static AssociateRoleRemovePermissionActionQueryBuilderDsl of() {
        return new AssociateRoleRemovePermissionActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<AssociateRoleRemovePermissionActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
        p -> new CombinationQueryPredicate<>(p, AssociateRoleRemovePermissionActionQueryBuilderDsl::of));
    }
    public StringComparisonPredicateBuilder<AssociateRoleRemovePermissionActionQueryBuilderDsl> permission() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("permission")),
        p -> new CombinationQueryPredicate<>(p, AssociateRoleRemovePermissionActionQueryBuilderDsl::of));
    }
    
}
