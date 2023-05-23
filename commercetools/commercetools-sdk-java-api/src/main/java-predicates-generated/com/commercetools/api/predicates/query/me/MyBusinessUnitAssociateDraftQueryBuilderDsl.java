
package com.commercetools.api.predicates.query.me;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class MyBusinessUnitAssociateDraftQueryBuilderDsl {
    public MyBusinessUnitAssociateDraftQueryBuilderDsl() {
    }

    public static MyBusinessUnitAssociateDraftQueryBuilderDsl of() {
        return new MyBusinessUnitAssociateDraftQueryBuilderDsl();
    }

    public LongComparisonPredicateBuilder<MyBusinessUnitAssociateDraftQueryBuilderDsl> version() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("version")),
            p -> new CombinationQueryPredicate<>(p, MyBusinessUnitAssociateDraftQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<MyBusinessUnitAssociateDraftQueryBuilderDsl> customer(
            Function<com.commercetools.api.predicates.query.me.MyCustomerDraftQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.me.MyCustomerDraftQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("customer"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.me.MyCustomerDraftQueryBuilderDsl.of())),
            MyBusinessUnitAssociateDraftQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<MyBusinessUnitAssociateDraftQueryBuilderDsl> associateRoleAssignments(
            Function<com.commercetools.api.predicates.query.business_unit.AssociateRoleAssignmentDraftQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.business_unit.AssociateRoleAssignmentDraftQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
                .parent(ConstantQueryPredicate.of().constant("associateRoleAssignments"))
                .inner(fn.apply(
                    com.commercetools.api.predicates.query.business_unit.AssociateRoleAssignmentDraftQueryBuilderDsl
                            .of())),
            MyBusinessUnitAssociateDraftQueryBuilderDsl::of);
    }

    public CollectionPredicateBuilder<MyBusinessUnitAssociateDraftQueryBuilderDsl> associateRoleAssignments() {
        return new CollectionPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("associateRoleAssignments")),
            p -> new CombinationQueryPredicate<>(p, MyBusinessUnitAssociateDraftQueryBuilderDsl::of));
    }

}
