
package com.commercetools.api.predicates.query.business_unit;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class AssociateDraftQueryBuilderDsl {
    public AssociateDraftQueryBuilderDsl() {
    }

    public static AssociateDraftQueryBuilderDsl of() {
        return new AssociateDraftQueryBuilderDsl();
    }

    public CombinationQueryPredicate<AssociateDraftQueryBuilderDsl> associateRoleAssignments(
            Function<com.commercetools.api.predicates.query.business_unit.AssociateRoleAssignmentDraftQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.business_unit.AssociateRoleAssignmentDraftQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
                .parent(ConstantQueryPredicate.of().constant("associateRoleAssignments"))
                .inner(fn.apply(
                    com.commercetools.api.predicates.query.business_unit.AssociateRoleAssignmentDraftQueryBuilderDsl
                            .of())),
            AssociateDraftQueryBuilderDsl::of);
    }

    public CollectionPredicateBuilder<AssociateDraftQueryBuilderDsl> associateRoleAssignments() {
        return new CollectionPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("associateRoleAssignments")),
            p -> new CombinationQueryPredicate<>(p, AssociateDraftQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<AssociateDraftQueryBuilderDsl> customer(
            Function<com.commercetools.api.predicates.query.customer.CustomerResourceIdentifierQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.customer.CustomerResourceIdentifierQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
                .parent(ConstantQueryPredicate.of().constant("customer"))
                .inner(fn.apply(
                    com.commercetools.api.predicates.query.customer.CustomerResourceIdentifierQueryBuilderDsl.of())),
            AssociateDraftQueryBuilderDsl::of);
    }

}
