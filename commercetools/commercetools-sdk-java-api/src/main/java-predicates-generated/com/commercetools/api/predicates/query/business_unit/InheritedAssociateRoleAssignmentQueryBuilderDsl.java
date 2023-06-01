package com.commercetools.api.predicates.query.business_unit;

import com.commercetools.api.predicates.query.*;

import java.util.function.Function;


public class InheritedAssociateRoleAssignmentQueryBuilderDsl  {
    public InheritedAssociateRoleAssignmentQueryBuilderDsl() {
    }

    public static InheritedAssociateRoleAssignmentQueryBuilderDsl of() {
        return new InheritedAssociateRoleAssignmentQueryBuilderDsl();
    }

    public CombinationQueryPredicate<InheritedAssociateRoleAssignmentQueryBuilderDsl> associateRole(
        Function<com.commercetools.api.predicates.query.associate_role.AssociateRoleKeyReferenceQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.associate_role.AssociateRoleKeyReferenceQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("associateRole"))
            .inner(fn.apply(com.commercetools.api.predicates.query.associate_role.AssociateRoleKeyReferenceQueryBuilderDsl.of())),
            InheritedAssociateRoleAssignmentQueryBuilderDsl::of);
    }
    
    public CombinationQueryPredicate<InheritedAssociateRoleAssignmentQueryBuilderDsl> source(
        Function<com.commercetools.api.predicates.query.business_unit.BusinessUnitKeyReferenceQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.business_unit.BusinessUnitKeyReferenceQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("source"))
            .inner(fn.apply(com.commercetools.api.predicates.query.business_unit.BusinessUnitKeyReferenceQueryBuilderDsl.of())),
            InheritedAssociateRoleAssignmentQueryBuilderDsl::of);
    }
    
    
}
