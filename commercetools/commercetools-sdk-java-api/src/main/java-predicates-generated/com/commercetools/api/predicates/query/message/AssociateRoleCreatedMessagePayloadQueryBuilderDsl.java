package com.commercetools.api.predicates.query.message;

import com.commercetools.api.predicates.query.*;

import java.util.function.Function;


public class AssociateRoleCreatedMessagePayloadQueryBuilderDsl  {
    public AssociateRoleCreatedMessagePayloadQueryBuilderDsl() {
    }

    public static AssociateRoleCreatedMessagePayloadQueryBuilderDsl of() {
        return new AssociateRoleCreatedMessagePayloadQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<AssociateRoleCreatedMessagePayloadQueryBuilderDsl> type() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("type")),
        p -> new CombinationQueryPredicate<>(p, AssociateRoleCreatedMessagePayloadQueryBuilderDsl::of));
    }
    public CombinationQueryPredicate<AssociateRoleCreatedMessagePayloadQueryBuilderDsl> associateRole(
        Function<com.commercetools.api.predicates.query.associate_role.AssociateRoleQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.associate_role.AssociateRoleQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("associateRole"))
            .inner(fn.apply(com.commercetools.api.predicates.query.associate_role.AssociateRoleQueryBuilderDsl.of())),
            AssociateRoleCreatedMessagePayloadQueryBuilderDsl::of);
    }
    
    
}
