
package com.commercetools.api.predicates.query.business_unit;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class AssociateQueryBuilderDsl {
    public AssociateQueryBuilderDsl() {
    }

    public static AssociateQueryBuilderDsl of() {
        return new AssociateQueryBuilderDsl();
    }

    public CombinationQueryPredicate<AssociateQueryBuilderDsl> associateRoleAssignments(
            Function<com.commercetools.api.predicates.query.business_unit.AssociateRoleAssignmentQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.business_unit.AssociateRoleAssignmentQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
                .parent(ConstantQueryPredicate.of().constant("associateRoleAssignments"))
                .inner(fn.apply(
                    com.commercetools.api.predicates.query.business_unit.AssociateRoleAssignmentQueryBuilderDsl.of())),
            AssociateQueryBuilderDsl::of);
    }

    public CollectionPredicateBuilder<AssociateQueryBuilderDsl> associateRoleAssignments() {
        return new CollectionPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("associateRoleAssignments")),
            p -> new CombinationQueryPredicate<>(p, AssociateQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<AssociateQueryBuilderDsl> customer(
            Function<com.commercetools.api.predicates.query.customer.CustomerReferenceQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.customer.CustomerReferenceQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("customer"))
                    .inner(fn.apply(
                        com.commercetools.api.predicates.query.customer.CustomerReferenceQueryBuilderDsl.of())),
            AssociateQueryBuilderDsl::of);
    }

}
