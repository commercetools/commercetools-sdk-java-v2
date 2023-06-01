package com.commercetools.api.predicates.query.associate_role;

import com.commercetools.api.predicates.query.*;

import java.util.function.Function;


public class AssociateRoleSetCustomTypeActionQueryBuilderDsl  {
    public AssociateRoleSetCustomTypeActionQueryBuilderDsl() {
    }

    public static AssociateRoleSetCustomTypeActionQueryBuilderDsl of() {
        return new AssociateRoleSetCustomTypeActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<AssociateRoleSetCustomTypeActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
        p -> new CombinationQueryPredicate<>(p, AssociateRoleSetCustomTypeActionQueryBuilderDsl::of));
    }
    public CombinationQueryPredicate<AssociateRoleSetCustomTypeActionQueryBuilderDsl> type(
        Function<com.commercetools.api.predicates.query.type.TypeResourceIdentifierQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.type.TypeResourceIdentifierQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("type"))
            .inner(fn.apply(com.commercetools.api.predicates.query.type.TypeResourceIdentifierQueryBuilderDsl.of())),
            AssociateRoleSetCustomTypeActionQueryBuilderDsl::of);
    }
    
    public CombinationQueryPredicate<AssociateRoleSetCustomTypeActionQueryBuilderDsl> fields(
        Function<com.commercetools.api.predicates.query.type.FieldContainerQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.type.FieldContainerQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("fields"))
            .inner(fn.apply(com.commercetools.api.predicates.query.type.FieldContainerQueryBuilderDsl.of())),
            AssociateRoleSetCustomTypeActionQueryBuilderDsl::of);
    }
    
    
}
