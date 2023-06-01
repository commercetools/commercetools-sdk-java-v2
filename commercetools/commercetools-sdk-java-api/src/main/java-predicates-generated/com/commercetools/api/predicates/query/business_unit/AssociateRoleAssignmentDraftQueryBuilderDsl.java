package com.commercetools.api.predicates.query.business_unit;

import com.commercetools.api.predicates.query.*;

import java.util.function.Function;


public class AssociateRoleAssignmentDraftQueryBuilderDsl  {
    public AssociateRoleAssignmentDraftQueryBuilderDsl() {
    }

    public static AssociateRoleAssignmentDraftQueryBuilderDsl of() {
        return new AssociateRoleAssignmentDraftQueryBuilderDsl();
    }

    public CombinationQueryPredicate<AssociateRoleAssignmentDraftQueryBuilderDsl> associateRole(
        Function<com.commercetools.api.predicates.query.associate_role.AssociateRoleResourceIdentifierQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.associate_role.AssociateRoleResourceIdentifierQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("associateRole"))
            .inner(fn.apply(com.commercetools.api.predicates.query.associate_role.AssociateRoleResourceIdentifierQueryBuilderDsl.of())),
            AssociateRoleAssignmentDraftQueryBuilderDsl::of);
    }
    
    public StringComparisonPredicateBuilder<AssociateRoleAssignmentDraftQueryBuilderDsl> inheritance() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("inheritance")),
        p -> new CombinationQueryPredicate<>(p, AssociateRoleAssignmentDraftQueryBuilderDsl::of));
    }
    
}
