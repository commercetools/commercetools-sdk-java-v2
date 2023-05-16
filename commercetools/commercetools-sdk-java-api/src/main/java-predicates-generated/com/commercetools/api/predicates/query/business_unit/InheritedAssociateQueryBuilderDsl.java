
package com.commercetools.api.predicates.query.business_unit;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class InheritedAssociateQueryBuilderDsl {
    public InheritedAssociateQueryBuilderDsl() {
    }

    public static InheritedAssociateQueryBuilderDsl of() {
        return new InheritedAssociateQueryBuilderDsl();
    }

    public CombinationQueryPredicate<InheritedAssociateQueryBuilderDsl> associateRoleAssignments(
            Function<com.commercetools.api.predicates.query.business_unit.InheritedAssociateRoleAssignmentQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.business_unit.InheritedAssociateRoleAssignmentQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
                .parent(ConstantQueryPredicate.of().constant("associateRoleAssignments"))
                .inner(fn.apply(
                    com.commercetools.api.predicates.query.business_unit.InheritedAssociateRoleAssignmentQueryBuilderDsl
                            .of())),
            InheritedAssociateQueryBuilderDsl::of);
    }

    public CollectionPredicateBuilder<InheritedAssociateQueryBuilderDsl> associateRoleAssignments() {
        return new CollectionPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("associateRoleAssignments")),
            p -> new CombinationQueryPredicate<>(p, InheritedAssociateQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<InheritedAssociateQueryBuilderDsl> customer(
            Function<com.commercetools.api.predicates.query.customer.CustomerReferenceQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.customer.CustomerReferenceQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("customer"))
                    .inner(fn.apply(
                        com.commercetools.api.predicates.query.customer.CustomerReferenceQueryBuilderDsl.of())),
            InheritedAssociateQueryBuilderDsl::of);
    }

}
