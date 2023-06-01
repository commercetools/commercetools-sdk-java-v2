package com.commercetools.api.predicates.query.business_unit;

import com.commercetools.api.predicates.query.*;

import java.util.function.Function;


public class AssociateRoleAssignmentQueryBuilderDsl  {
    public AssociateRoleAssignmentQueryBuilderDsl() {
    }

    public static AssociateRoleAssignmentQueryBuilderDsl of() {
        return new AssociateRoleAssignmentQueryBuilderDsl();
    }

    public CombinationQueryPredicate<AssociateRoleAssignmentQueryBuilderDsl> associateRole(
        Function<com.commercetools.api.predicates.query.associate_role.AssociateRoleKeyReferenceQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.associate_role.AssociateRoleKeyReferenceQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("associateRole"))
            .inner(fn.apply(com.commercetools.api.predicates.query.associate_role.AssociateRoleKeyReferenceQueryBuilderDsl.of())),
            AssociateRoleAssignmentQueryBuilderDsl::of);
    }
    
    public StringComparisonPredicateBuilder<AssociateRoleAssignmentQueryBuilderDsl> inheritance() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("inheritance")),
        p -> new CombinationQueryPredicate<>(p, AssociateRoleAssignmentQueryBuilderDsl::of));
    }
    
}
