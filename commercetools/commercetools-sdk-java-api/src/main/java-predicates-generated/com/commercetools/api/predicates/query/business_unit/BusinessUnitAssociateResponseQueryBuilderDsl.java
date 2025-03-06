
package com.commercetools.api.predicates.query.business_unit;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class BusinessUnitAssociateResponseQueryBuilderDsl {
    public BusinessUnitAssociateResponseQueryBuilderDsl() {
    }

    public static BusinessUnitAssociateResponseQueryBuilderDsl of() {
        return new BusinessUnitAssociateResponseQueryBuilderDsl();
    }

    public CombinationQueryPredicate<BusinessUnitAssociateResponseQueryBuilderDsl> customer(
            Function<com.commercetools.api.predicates.query.customer.CustomerReferenceQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.customer.CustomerReferenceQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("customer"))
                    .inner(fn.apply(
                        com.commercetools.api.predicates.query.customer.CustomerReferenceQueryBuilderDsl.of())),
            BusinessUnitAssociateResponseQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<BusinessUnitAssociateResponseQueryBuilderDsl> associateRoles(
            Function<com.commercetools.api.predicates.query.associate_role.AssociateRoleQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.associate_role.AssociateRoleQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("associateRoles"))
                    .inner(fn.apply(
                        com.commercetools.api.predicates.query.associate_role.AssociateRoleQueryBuilderDsl.of())),
            BusinessUnitAssociateResponseQueryBuilderDsl::of);
    }

    public CollectionPredicateBuilder<BusinessUnitAssociateResponseQueryBuilderDsl> associateRoles() {
        return new CollectionPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("associateRoles")),
            p -> new CombinationQueryPredicate<>(p, BusinessUnitAssociateResponseQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<BusinessUnitAssociateResponseQueryBuilderDsl> inheritedAssociateRoles(
            Function<com.commercetools.api.predicates.query.associate_role.AssociateRoleQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.associate_role.AssociateRoleQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("inheritedAssociateRoles"))
                    .inner(fn.apply(
                        com.commercetools.api.predicates.query.associate_role.AssociateRoleQueryBuilderDsl.of())),
            BusinessUnitAssociateResponseQueryBuilderDsl::of);
    }

    public CollectionPredicateBuilder<BusinessUnitAssociateResponseQueryBuilderDsl> inheritedAssociateRoles() {
        return new CollectionPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("inheritedAssociateRoles")),
            p -> new CombinationQueryPredicate<>(p, BusinessUnitAssociateResponseQueryBuilderDsl::of));
    }

    public StringCollectionPredicateBuilder<BusinessUnitAssociateResponseQueryBuilderDsl> permissions() {
        return new StringCollectionPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("permissions")),
            p -> new CombinationQueryPredicate<>(p, BusinessUnitAssociateResponseQueryBuilderDsl::of));
    }

}
