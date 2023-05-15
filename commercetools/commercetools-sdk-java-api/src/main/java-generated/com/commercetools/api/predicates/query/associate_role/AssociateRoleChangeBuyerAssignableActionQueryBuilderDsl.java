
package com.commercetools.api.predicates.query.associate_role;

import com.commercetools.api.predicates.query.*;

public class AssociateRoleChangeBuyerAssignableActionQueryBuilderDsl {
    public AssociateRoleChangeBuyerAssignableActionQueryBuilderDsl() {
    }

    public static AssociateRoleChangeBuyerAssignableActionQueryBuilderDsl of() {
        return new AssociateRoleChangeBuyerAssignableActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<AssociateRoleChangeBuyerAssignableActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, AssociateRoleChangeBuyerAssignableActionQueryBuilderDsl::of));
    }

    public BooleanComparisonPredicateBuilder<AssociateRoleChangeBuyerAssignableActionQueryBuilderDsl> buyerAssignable() {
        return new BooleanComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("buyerAssignable")),
            p -> new CombinationQueryPredicate<>(p, AssociateRoleChangeBuyerAssignableActionQueryBuilderDsl::of));
    }
}
