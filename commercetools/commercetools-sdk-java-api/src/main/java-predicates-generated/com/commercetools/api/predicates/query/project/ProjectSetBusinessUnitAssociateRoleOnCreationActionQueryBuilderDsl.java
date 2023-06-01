package com.commercetools.api.predicates.query.project;

import com.commercetools.api.predicates.query.*;

import java.util.function.Function;


public class ProjectSetBusinessUnitAssociateRoleOnCreationActionQueryBuilderDsl  {
    public ProjectSetBusinessUnitAssociateRoleOnCreationActionQueryBuilderDsl() {
    }

    public static ProjectSetBusinessUnitAssociateRoleOnCreationActionQueryBuilderDsl of() {
        return new ProjectSetBusinessUnitAssociateRoleOnCreationActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<ProjectSetBusinessUnitAssociateRoleOnCreationActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
        p -> new CombinationQueryPredicate<>(p, ProjectSetBusinessUnitAssociateRoleOnCreationActionQueryBuilderDsl::of));
    }
    public CombinationQueryPredicate<ProjectSetBusinessUnitAssociateRoleOnCreationActionQueryBuilderDsl> associateRole(
        Function<com.commercetools.api.predicates.query.associate_role.AssociateRoleResourceIdentifierQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.associate_role.AssociateRoleResourceIdentifierQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("associateRole"))
            .inner(fn.apply(com.commercetools.api.predicates.query.associate_role.AssociateRoleResourceIdentifierQueryBuilderDsl.of())),
            ProjectSetBusinessUnitAssociateRoleOnCreationActionQueryBuilderDsl::of);
    }
    
    
}
